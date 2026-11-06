package ir.alirezaivaz.mygarage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.graphics.Color;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceRequest;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.database.Cursor;
import android.provider.OpenableColumns;

import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import org.json.JSONObject;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends Activity {
    private static final int REQUEST_EXPORT = 4101;
    private static final int REQUEST_IMPORT = 4102;
    private static final int MAX_BACKUP_BYTES = 10 * 1024 * 1024;
    private WebView web;
    private String pendingBackupJson;

    public final class BackBridge {
        @JavascriptInterface public void exit() {
            runOnUiThread(MainActivity.this::finish);
        }
    }

    public final class BackupBridge {
        @JavascriptInterface public void exportBackup(String json) {
            if (json == null || json.getBytes(StandardCharsets.UTF_8).length > MAX_BACKUP_BYTES) {
                notifyJs("onBackupSaved(false)");
                return;
            }
            runOnUiThread(() -> {
                pendingBackupJson = json;
                Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("application/json");
                intent.putExtra(Intent.EXTRA_TITLE, "my-car-service-backup.json");
                try {
                    startActivityForResult(intent, REQUEST_EXPORT);
                } catch (Exception e) {
                    pendingBackupJson = null;
                    notifyJs("onBackupSaved(false)");
                }
            });
        }

        @JavascriptInterface public void importBackup() {
            runOnUiThread(() -> {
                Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("application/json");
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                try {
                    startActivityForResult(intent, REQUEST_IMPORT);
                } catch (Exception e) {
                    notifyJs("onBackupFailed(" + JSONObject.quote("انتخاب فایل در این دستگاه در دسترس نیست.") + ")");
                }
            });
        }
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setStatusBarColor(Color.rgb(11, 18, 25));
        window.setNavigationBarColor(Color.rgb(11, 18, 25));
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
            window.setStatusBarContrastEnforced(false);
        }
        WindowCompat.setDecorFitsSystemWindows(window, false);

        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(Color.rgb(11, 18, 25));
        web = new WebView(this);
        web.setBackgroundColor(Color.rgb(11, 18, 25));
        web.setOverScrollMode(WebView.OVER_SCROLL_NEVER);

        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);
        if (android.os.Build.VERSION.SDK_INT >= 26) settings.setSafeBrowsingEnabled(true);

        web.addJavascriptInterface(new BackBridge(), "AndroidBack");
        web.addJavascriptInterface(new BackupBridge(), "AndroidFiles");
        web.setWebChromeClient(new WebChromeClient());
        web.setWebViewClient(new WebViewClient() {
            @Override public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return !request.getUrl().toString().startsWith("file:///android_asset/");
            }
        });
        root.addView(web, new FrameLayout.LayoutParams(-1, -1));
        ViewCompat.setOnApplyWindowInsetsListener(root, (view, insets) -> {
            androidx.core.graphics.Insets bars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            web.setPadding(0, bars.top, 0, bars.bottom);
            return insets;
        });
        setContentView(root);
        ViewCompat.requestApplyInsets(root);
        web.loadUrl("file:///android_asset/index.html");
    }

    private void notifyJs(String expression) {
        runOnUiThread(() -> {
            if (web != null) web.evaluateJavascript(expression, null);
        });
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK || data == null || data.getData() == null) {
            if (requestCode == REQUEST_EXPORT) {
                pendingBackupJson = null;
                notifyJs("onBackupSaved(false)");
            }
            return;
        }
        Uri uri = data.getData();
        if (requestCode == REQUEST_EXPORT) {
            String json = pendingBackupJson;
            pendingBackupJson = null;
            try (OutputStream out = getContentResolver().openOutputStream(uri)) {
                if (out == null || json == null) throw new IllegalStateException("فایل ذخیره نشد");
                out.write(json.getBytes(StandardCharsets.UTF_8));
                out.flush();
                notifyJs("onBackupSaved(true)");
            } catch (Exception e) {
                notifyJs("onBackupSaved(false)");
            }
        } else if (requestCode == REQUEST_IMPORT) {
            try (InputStream in = getContentResolver().openInputStream(uri);
                 ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
                if (in == null) throw new IllegalStateException("فایل خوانده نشد");
                byte[] chunk = new byte[8192];
                int count, total = 0;
                while ((count = in.read(chunk)) != -1) {
                    total += count;
                    if (total > MAX_BACKUP_BYTES) throw new IllegalStateException("حجم فایل بیشتر از ۱۰ مگابایت است.");
                    buffer.write(chunk, 0, count);
                }
                String json = buffer.toString(StandardCharsets.UTF_8.name());
                notifyJs("onBackupLoaded(" + JSONObject.quote(json) + ")");
            } catch (Exception e) {
                String message = e.getMessage() == null ? "خواندن فایل پشتیبان ناموفق بود." : e.getMessage();
                notifyJs("onBackupFailed(" + JSONObject.quote(message) + ")");
            }
        }
    }

    @Override public void onBackPressed() {
        if (web == null) { super.onBackPressed(); return; }
        web.evaluateJavascript(
            "if(document.querySelector('.modal-back')){closeModal();}" +
            "else if(document.body.dataset.page!=='home'){showPage('home');}" +
            "else{AndroidBack.exit();}", null);
    }

    @Override protected void onDestroy() {
        if (web != null) {
            web.removeJavascriptInterface("AndroidBack");
            web.removeJavascriptInterface("AndroidFiles");
            web.stopLoading();
            web.loadUrl("about:blank");
            web.destroy();
            web = null;
        }
        super.onDestroy();
    }
}
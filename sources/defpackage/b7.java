package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b7 implements ba0 {
    public final Context a;

    public b7(Context context, int i) {
        switch (i) {
            case 2:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.ba0
    public void a(vv vvVar) {
        bw bwVar = new bw("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), bwVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new n9(this, vvVar, threadPoolExecutor, 1));
    }

    public Typeface b(kt1 kt1Var) {
        String strA;
        if (!(kt1Var instanceof kt1)) {
            return null;
        }
        Context context = this.a;
        Typeface typefaceA = dv1.A(kt1Var, context);
        List list = kt1Var.c.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ThreadLocal threadLocal = uj2.a;
            if (typefaceA == null) {
                return null;
            }
            if (!list.isEmpty()) {
                ThreadLocal threadLocal2 = uj2.a;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(typefaceA);
                q40 q40VarF = sv0.F(context);
                int i2 = (i < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
                if (i2 == 0) {
                    strA = c31.a(list, null, new xi1(1, q40VarF), 31);
                } else {
                    if (list.size() > 0) {
                        list.get(0).getClass();
                        fu1.c();
                        return null;
                    }
                    strA = (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + ex.g(i2 + 400.0f, 1.0f, 1000.0f);
                }
                paint.setFontVariationSettings(strA);
                return paint.getTypeface();
            }
        }
        return typefaceA;
    }

    public /* synthetic */ b7(Context context, byte b) {
        this.a = context;
    }
}

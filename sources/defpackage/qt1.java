package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qt1 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, uc ucVar, boolean z) throws Throwable {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            e51 e51Var = rj2.b;
            Typeface typeface = (Typeface) e51Var.a(rj2.b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (ucVar != null) {
                    new Handler(Looper.getMainLooper()).post(new w5(2, ucVar, typeface));
                }
                typefaceA = typeface;
            } else {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ah0 ah0VarH = rw.H(resources.getXml(i), resources);
                        if (ah0VarH == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (ucVar != null) {
                                ucVar.a(-3);
                            }
                        } else {
                            typefaceA = rj2.a(context, ah0VarH, resources, i, string, typedValue.assetCookie, i2, ucVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceK = rj2.a.k(context, resources, i, string, i2);
                        if (typefaceK != null) {
                            e51Var.b(rj2.b(resources, i, string, i4, i2), typefaceK);
                        }
                        if (ucVar != null) {
                            if (typefaceK != null) {
                                new Handler(Looper.getMainLooper()).post(new w5(2, ucVar, typefaceK));
                            } else {
                                ucVar.a(-3);
                            }
                        }
                        typefaceA = typefaceK;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (ucVar != null) {
                        ucVar.a(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (ucVar != null) {
                        ucVar.a(-3);
                    }
                }
            }
        } else if (ucVar != null) {
            ucVar.a(-3);
        }
        if (typefaceA != null || ucVar != null) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}

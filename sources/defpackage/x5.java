package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x5 {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void b(a6 a6Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        s02 s02Var;
        p02 p02Var;
        ej0 ej0Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseL = o5.l(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseL != null && (value = viewTranslationResponseL.getValue("android:text")) != null && (text = value.getText()) != null && (s02Var = (s02) a6Var.e().b((int) jKeyAt)) != null && (p02Var = s02Var.a) != null) {
                Object objG = p02Var.d.e.g(h02.l);
                if (objG == null) {
                    objG = null;
                }
                p0 p0Var = (p0) objG;
                if (p0Var != null && (ej0Var = (ej0) p0Var.b) != null) {
                }
            }
        }
    }

    public static Path c(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void e(a6 a6Var, long[] jArr, Consumer consumer) {
        p02 p02Var;
        for (long j : jArr) {
            s02 s02Var = (s02) a6Var.e().b((int) j);
            if (s02Var != null && (p02Var = s02Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(a6Var.e.getAutofillId(), p02Var.f);
                Object objG = p02Var.d.e.g(u02.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new yb(c31.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float f(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}

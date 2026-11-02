package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n5 implements ViewTranslationCallback {
    public static final n5 a = new n5();

    public final boolean onClearTranslation(View view) {
        ti0 ti0Var;
        view.getClass();
        a6 contentCaptureManager$ui = ((e5) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = v5.e;
        gr0 gr0VarE = contentCaptureManager$ui.e();
        Object[] objArr = gr0VarE.c;
        long[] jArr = gr0VarE.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w91 w91Var = ((s02) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = w91Var.g(u02.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = w91Var.g(h02.n);
                            p0 p0Var = (p0) (objG2 != null ? objG2 : null);
                            if (p0Var != null && (ti0Var = (ti0) p0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        ej0 ej0Var;
        view.getClass();
        a6 contentCaptureManager$ui = ((e5) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = v5.e;
        gr0 gr0VarE = contentCaptureManager$ui.e();
        Object[] objArr = gr0VarE.c;
        long[] jArr = gr0VarE.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w91 w91Var = ((s02) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = w91Var.g(u02.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (ws0.j(objG, Boolean.TRUE)) {
                            Object objG2 = w91Var.g(h02.m);
                            p0 p0Var = (p0) (objG2 != null ? objG2 : null);
                            if (p0Var != null && (ej0Var = (ej0) p0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        ej0 ej0Var;
        view.getClass();
        a6 contentCaptureManager$ui = ((e5) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = v5.f;
        gr0 gr0VarE = contentCaptureManager$ui.e();
        Object[] objArr = gr0VarE.c;
        long[] jArr = gr0VarE.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w91 w91Var = ((s02) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = w91Var.g(u02.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (ws0.j(objG, Boolean.FALSE)) {
                            Object objG2 = w91Var.g(h02.m);
                            p0 p0Var = (p0) (objG2 != null ? objG2 : null);
                            if (p0Var != null && (ej0Var = (ej0) p0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}

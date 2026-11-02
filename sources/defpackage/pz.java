package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pz {
    public final e5 a;
    public final ud b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public te2 j;
    public hf2 k;
    public xf1 l;
    public yr1 n;
    public yr1 o;
    public final Object c = new Object();
    public ej0 m = x4.x;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = q61.a();
    public final Matrix r = new Matrix();

    public pz(e5 e5Var, ud udVar) {
        this.a = e5Var;
        this.b = udVar;
    }

    public final void a() {
        ud udVar = this.b;
        rx0 rx0Var = (rx0) udVar.c;
        InputMethodManager inputMethodManager = (InputMethodManager) rx0Var.getValue();
        View view = (View) udVar.b;
        if (inputMethodManager.isActive(view)) {
            ej0 ej0Var = this.m;
            float[] fArr = this.q;
            ej0Var.h(new q61(fArr));
            this.a.t(fArr);
            Matrix matrix = this.r;
            s5.Q(matrix, fArr);
            te2 te2Var = this.j;
            te2Var.getClass();
            long j = te2Var.b;
            xf1 xf1Var = this.l;
            xf1Var.getClass();
            hf2 hf2Var = this.k;
            hf2Var.getClass();
            t81 t81Var = hf2Var.b;
            yr1 yr1Var = this.n;
            yr1Var.getClass();
            float f = yr1Var.d;
            float f2 = yr1Var.b;
            yr1 yr1Var2 = this.o;
            yr1Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            of2 of2Var = te2Var.c;
            int iF = of2.f(j);
            builder.setSelectionRange(iF, of2.e(j));
            jt1 jt1Var = jt1.f;
            if (z && iF >= 0) {
                int iR = xf1Var.r(iF);
                yr1 yr1VarC = hf2Var.c(iR);
                float fG = ex.g(yr1VarC.a, 0.0f, (int) (hf2Var.c >> 32));
                boolean zM = ux.m(yr1Var, fG, yr1VarC.b);
                boolean zM2 = ux.m(yr1Var, fG, yr1VarC.d);
                boolean z5 = hf2Var.a(iR) == jt1Var;
                int i = (zM || zM2) ? 1 : 0;
                if (!zM || !zM2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = yr1VarC.b;
                float f4 = yr1VarC.d;
                builder.setInsertionMarkerLocation(fG, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iF2 = of2Var != null ? of2.f(of2Var.a) : -1;
                int iE = of2Var != null ? of2.e(of2Var.a) : -1;
                if (iF2 >= 0 && iF2 < iE) {
                    builder2.setComposingText(iF2, te2Var.a.f.subSequence(iF2, iE));
                    int iR2 = xf1Var.r(iF2);
                    int iR3 = xf1Var.r(iE);
                    float[] fArr2 = new float[(iR3 - iR2) * 4];
                    t81Var.a(j02.c(iR2, iR3), fArr2);
                    while (iF2 < iE) {
                        int iR4 = xf1Var.r(iF2);
                        int i2 = (iR4 - iR2) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iF2;
                        int i5 = (yr1Var.a < f7 ? 1 : 0) & (f5 < yr1Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!ux.m(yr1Var, f5, f6) || !ux.m(yr1Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (hf2Var.a(iR4) == jt1Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF2 = i4 + 1;
                        iE = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                h1.j(builder2, yr1Var2);
            }
            if (i6 >= 34 && z4 && !yr1Var.f()) {
                int i7 = t81Var.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iH = ex.h(t81Var.e(f2), 0, i7);
                int iH2 = ex.h(t81Var.e(f), 0, i7);
                if (iH <= iH2) {
                    while (true) {
                        builder2.addVisibleLineBounds(hf2Var.d(iH), t81Var.f(iH), hf2Var.e(iH), t81Var.b(iH));
                        if (iH == iH2) {
                            break;
                        } else {
                            iH++;
                        }
                    }
                }
            }
            ((InputMethodManager) rx0Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}

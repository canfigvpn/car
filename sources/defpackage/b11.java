package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b11 {
    public final l7 a;
    public final dq0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public te2 j;
    public hf2 k;
    public xf1 l;
    public yr1 m;
    public yr1 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = q61.a();
    public final Matrix q = new Matrix();

    public b11(l7 l7Var, dq0 dq0Var) {
        this.a = l7Var;
        this.b = dq0Var;
    }

    public final void a() {
        dq0 dq0Var = this.b;
        InputMethodManager inputMethodManagerQ = dq0Var.q();
        View view = (View) dq0Var.f;
        if (!inputMethodManagerQ.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        q61.d(fArr);
        jw0 jw0Var = (jw0) this.a.l.v.getValue();
        if (jw0Var != null) {
            if (!jw0Var.A()) {
                jw0Var = null;
            }
            if (jw0Var != null) {
                jw0Var.D(fArr);
            }
        }
        yr1 yr1Var = this.n;
        yr1Var.getClass();
        float f = -yr1Var.a;
        yr1 yr1Var2 = this.n;
        yr1Var2.getClass();
        q61.f(fArr, f, -yr1Var2.b);
        Matrix matrix = this.q;
        s5.Q(matrix, fArr);
        te2 te2Var = this.j;
        te2Var.getClass();
        long j = te2Var.b;
        xf1 xf1Var = this.l;
        xf1Var.getClass();
        hf2 hf2Var = this.k;
        hf2Var.getClass();
        t81 t81Var = hf2Var.b;
        yr1 yr1Var3 = this.m;
        yr1Var3.getClass();
        float f2 = yr1Var3.d;
        float f3 = yr1Var3.b;
        yr1 yr1Var4 = this.n;
        yr1Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
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
            boolean zP = ix.p(yr1Var3, fG, yr1VarC.b);
            boolean zP2 = ix.p(yr1Var3, fG, yr1VarC.d);
            boolean z5 = hf2Var.a(iR) == jt1Var;
            int i = (zP || zP2) ? 1 : 0;
            if (!zP || !zP2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f4 = yr1VarC.b;
            float f5 = yr1VarC.d;
            builder.setInsertionMarkerLocation(fG, f4, f5, f5, i);
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
                    float f6 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f7 = fArr2[i2 + 1];
                    int i3 = iR2;
                    float f8 = fArr2[i2 + 2];
                    float f9 = fArr2[i2 + 3];
                    int i4 = iE;
                    int i5 = (yr1Var3.a < f8 ? 1 : 0) & (f6 < yr1Var3.c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!ix.p(yr1Var3, f6, f7) || !ix.p(yr1Var3, f8, f9)) {
                        i5 |= 2;
                    }
                    if (hf2Var.a(iR4) == jt1Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder2 = builder3;
                    iF2 = i6 + 1;
                    iR2 = i3;
                    iE = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            h1.k(builder2, yr1Var4);
        }
        if (i7 >= 34 && z4 && !yr1Var3.f()) {
            int i8 = t81Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iH = ex.h(t81Var.e(f3), 0, i8);
            int iH2 = ex.h(t81Var.e(f2), 0, i8);
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
        dq0Var.q().updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}

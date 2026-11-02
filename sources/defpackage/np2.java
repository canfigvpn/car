package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class np2 {
    public final aq2 a;
    public kq0[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public np2(aq2 aq2Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = aq2Var;
        c(aq2Var);
    }

    public final void a() {
        kq0[] kq0VarArr = this.b;
        if (kq0VarArr != null) {
            kq0 kq0VarH = kq0VarArr[0];
            kq0 kq0VarH2 = kq0VarArr[1];
            aq2 aq2Var = this.a;
            if (kq0VarH2 == null) {
                kq0VarH2 = aq2Var.a.h(2);
            }
            if (kq0VarH == null) {
                kq0VarH = aq2Var.a.h(1);
            }
            h(kq0.a(kq0VarH, kq0VarH2));
            kq0 kq0Var = this.b[c12.n(16)];
            if (kq0Var != null) {
                g(kq0Var);
            }
            kq0 kq0Var2 = this.b[c12.n(32)];
            if (kq0Var2 != null) {
                e(kq0Var2);
            }
            kq0 kq0Var3 = this.b[c12.n(64)];
            if (kq0Var3 != null) {
                i(kq0Var3);
            }
        }
    }

    public abstract aq2 b();

    public void c(aq2 aq2Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listE = aq2Var.a.e(i);
            int iN = c12.n(i);
            this.c[iN] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i != 8) {
                List<Rect> listF = aq2Var.a.f(i);
                this.d[iN] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i, kq0 kq0Var) {
        if (this.b == null) {
            this.b = new kq0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[c12.n(i2)] = kq0Var;
            }
        }
    }

    public abstract void f(kq0 kq0Var);

    public abstract void h(kq0 kq0Var);

    public np2() {
        this(new aq2());
    }

    public void e(kq0 kq0Var) {
    }

    public void g(kq0 kq0Var) {
    }

    public void i(kq0 kq0Var) {
    }
}

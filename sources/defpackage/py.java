package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class py extends c40 implements m02 {
    public me2 A;
    public oo0 B;
    public xf0 C;
    public bi2 u;
    public te2 v;
    public f11 w;
    public boolean x;
    public boolean y;
    public xf1 z;

    public static void I0(f11 f11Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        cf2 cf2Var = f11Var.e;
        ey eyVar = f11Var.v;
        if (cf2Var == null) {
            int length = str.length();
            eyVar.h(new te2(str, j02.c(length, length), 4));
        } else {
            te2 te2VarI = f11Var.d.i(vs0.v(new i40(), new es(str, 1)));
            cf2Var.a(null, te2VarI);
            eyVar.h(te2VarI);
        }
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        yb ybVar = this.v.a;
        lv0[] lv0VarArr = w02.a;
        y02 y02Var = u02.F;
        lv0[] lv0VarArr2 = w02.a;
        lv0 lv0Var = lv0VarArr2[18];
        z02Var.a(y02Var, ybVar);
        yb ybVar2 = this.u.a;
        y02 y02Var2 = u02.G;
        lv0 lv0Var2 = lv0VarArr2[19];
        z02Var.a(y02Var2, ybVar2);
        long j = this.v.b;
        y02 y02Var3 = u02.H;
        lv0 lv0Var3 = lv0VarArr2[20];
        z02Var.a(y02Var3, new of2(j));
        b6 b6Var = q90.y;
        y02 y02Var4 = u02.s;
        lv0 lv0Var4 = lv0VarArr2[9];
        z02Var.a(y02Var4, b6Var);
        y6 y6Var = Build.VERSION.SDK_INT >= 26 ? new y6(AutofillValue.forText(this.v.a)) : null;
        if (y6Var != null) {
            y02 y02Var5 = u02.t;
            lv0 lv0Var5 = lv0VarArr2[10];
            z02Var.a(y02Var5, y6Var);
        }
        boolean z = false;
        z02Var.a(h02.h, new p0(null, new oy(this, 0)));
        int i = this.B.d;
        if (i == 6) {
            hx.a.getClass();
            c6 c6Var = gx.c;
            y02 y02Var6 = u02.r;
            lv0 lv0Var6 = lv0VarArr2[8];
            z02Var.a(y02Var6, c6Var);
        } else if (i == 7 || i == 8) {
            hx.a.getClass();
            c6 c6Var2 = gx.b;
            y02 y02Var7 = u02.r;
            lv0 lv0Var7 = lv0VarArr2[8];
            z02Var.a(y02Var7, c6Var2);
        } else if (i == 4) {
            hx.a.getClass();
            c6 c6Var3 = gx.d;
            y02 y02Var8 = u02.r;
            lv0 lv0Var8 = lv0VarArr2[8];
            z02Var.a(y02Var8, c6Var3);
        }
        if (!this.y) {
            z02Var.a(u02.j, ll2.a);
        }
        if (this.y && !this.x) {
            z = true;
        }
        y02 y02Var9 = u02.O;
        lv0 lv0Var9 = lv0VarArr2[28];
        z02Var.a(y02Var9, Boolean.valueOf(z));
        w02.a(z02Var, new oy(this, 1));
        if (z) {
            z02Var.a(h02.k, new p0(null, new oy(this, 2)));
            z02Var.a(h02.o, new p0(null, new oy(this, z02Var)));
        }
        z02Var.a(h02.j, new p0(null, new ji0(5, this)));
        int i2 = this.B.e;
        ny nyVar = new ny(this, 6);
        z02Var.a(u02.I, new no0(i2));
        z02Var.a(h02.p, new p0(null, nyVar));
        z02Var.a(h02.b, new p0(null, new ny(this, 7)));
        z02Var.a(h02.c, new p0(null, new ny(this, 1)));
        if (!of2.c(this.v.b)) {
            z02Var.a(h02.q, new p0(null, new ny(this, 2)));
            if (this.y && !this.x) {
                z02Var.a(h02.r, new p0(null, new ny(this, 3)));
            }
        }
        if (!this.y || this.x) {
            return;
        }
        z02Var.a(h02.s, new p0(null, new ny(this, 5)));
    }

    @Override // defpackage.m02
    public final boolean h0() {
        return true;
    }
}

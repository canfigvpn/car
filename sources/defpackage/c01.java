package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends t71 implements m02 {
    public ti0 s;
    public xz0 t;
    public di1 u;
    public boolean v;
    public nx1 w;
    public final a01 x = new a01(this, 0);
    public a01 y;

    public c01(ti0 ti0Var, xz0 xz0Var, di1 di1Var, boolean z) {
        this.s = ti0Var;
        this.t = xz0Var;
        this.u = di1Var;
        this.v = z;
        F0();
    }

    public final void F0() {
        this.w = new nx1(new b01(this, 0), new b01(this, 1));
        this.y = this.v ? new a01(this, 1) : null;
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        lv0[] lv0VarArr;
        w02.g(z02Var);
        z02Var.a(u02.N, this.x);
        di1 di1Var = this.u;
        nx1 nx1Var = this.w;
        if (di1Var == di1.e) {
            if (nx1Var == null) {
                ws0.U("scrollAxisRange");
                throw null;
            }
            y02 y02Var = u02.w;
            lv0VarArr = w02.a;
            lv0 lv0Var = lv0VarArr[13];
            z02Var.a(y02Var, nx1Var);
        } else {
            if (nx1Var == null) {
                ws0.U("scrollAxisRange");
                throw null;
            }
            y02 y02Var2 = u02.v;
            lv0VarArr = w02.a;
            lv0 lv0Var2 = lv0VarArr[12];
            z02Var.a(y02Var2, nx1Var);
        }
        a01 a01Var = this.y;
        if (a01Var != null) {
            z02Var.a(h02.f, new p0(null, a01Var));
        }
        z02Var.a(h02.C, new p0(null, new y3(19, new b01(this, 2))));
        sq sqVarD = this.t.d();
        y02 y02Var3 = u02.f;
        lv0 lv0Var3 = lv0VarArr[24];
        z02Var.a(y02Var3, sqVarD);
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hy1 {
    public static final yw1 a = new yw1(14);
    public static final ey1 b = new ey1();
    public static final o50 c = new o50(1);
    public static final fy1 d = new fy1();

    public static u71 a(ce2 ce2Var, di1 di1Var, boolean z, boolean z2, f91 f91Var) {
        return new dy1(ce2Var, di1Var, z, z2, f91Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(uy1 uy1Var, long j, tx txVar) {
        gy1 gy1Var;
        ds1 ds1Var;
        uy1 uy1Var2;
        if (txVar instanceof gy1) {
            gy1Var = (gy1) txVar;
            int i = gy1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy1Var.k = i - Integer.MIN_VALUE;
            } else {
                gy1Var = new gy1(txVar);
            }
        } else {
            gy1Var = new gy1(txVar);
        }
        Object obj = gy1Var.j;
        int i2 = gy1Var.k;
        if (i2 == 0) {
            ix.Q(obj);
            ds1Var = new ds1();
            h hVar = new h(uy1Var, j, ds1Var, (sx) null, 2);
            gy1Var.h = uy1Var;
            gy1Var.i = ds1Var;
            gy1Var.k = 1;
            Object objF = uy1Var.f(ia1.e, hVar, gy1Var);
            fz fzVar = fz.e;
            if (objF == fzVar) {
                return fzVar;
            }
            uy1Var2 = uy1Var;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ds1 ds1Var2 = gy1Var.i;
            uy1 uy1Var3 = gy1Var.h;
            ix.Q(obj);
            ds1Var = ds1Var2;
            uy1Var2 = uy1Var3;
        }
        return new uf1(uy1Var2.h(ds1Var.e));
    }
}

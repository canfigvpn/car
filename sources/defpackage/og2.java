package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class og2 {
    public final int a;
    public final tf b;
    public final d c;
    public og2 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ pg2 h;

    public og2(pg2 pg2Var, int i, tf tfVar, d dVar) {
        this.h = pg2Var;
        this.a = i;
        this.b = tfVar;
        this.c = dVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        ps1 ps1Var;
        ps1 ps1Var2;
        long j5 = this.h.f;
        tf tfVar = this.b;
        me1 me1VarT = qx.T(tfVar, 2);
        ax0 ax0VarV = qx.V(tfVar);
        boolean zI = ax0VarV.I();
        he1 he1Var = ax0VarV.I;
        if (zI) {
            if (he1Var.d != me1VarT) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = me1VarT.g;
                me1 me1Var = he1Var.d;
                me1Var.getClass();
                long jN = mx.N(me1Var.G(me1VarT, jFloatToRawIntBits));
                ps1Var = new ps1(jN, (4294967295L & ((long) (((int) (jN & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jN >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, tfVar);
            } else {
                ps1Var = new ps1(j, j2, j3, j4, j5, fArr, tfVar);
            }
            ps1Var2 = ps1Var;
        } else {
            ps1Var2 = null;
        }
        if (ps1Var2 == null) {
            return;
        }
        this.c.h(ps1Var2);
    }

    public final void b() {
        pg2 pg2Var = this.h;
        d91 d91Var = pg2Var.a;
        int i = this.a;
        og2 og2Var = (og2) d91Var.g(i);
        if (og2Var != null) {
            if (og2Var == this) {
                og2 og2Var2 = this.d;
                this.d = null;
                if (og2Var2 == null) {
                    ax0 ax0VarV = qx.V(this.b.e);
                    if (ax0VarV.k) {
                        ((e5) dx0.a(ax0VarV)).getRectManager().b.h(ax0VarV.f, false);
                        return;
                    }
                    return;
                }
                int iD = d91Var.d(i);
                Object[] objArr = d91Var.c;
                Object obj = objArr[iD];
                d91Var.b[iD] = i;
                objArr[iD] = og2Var2;
                return;
            }
            int iD2 = d91Var.d(i);
            Object[] objArr2 = d91Var.c;
            Object obj2 = objArr2[iD2];
            d91Var.b[iD2] = i;
            objArr2[iD2] = og2Var;
            while (true) {
                og2 og2Var3 = og2Var.d;
                if (og2Var3 == null) {
                    break;
                }
                if (og2Var3 == this) {
                    og2Var.d = this.d;
                    this.d = null;
                    return;
                }
                og2Var = og2Var3;
            }
        }
        og2 og2Var4 = pg2Var.b;
        if (og2Var4 == this) {
            pg2Var.b = og2Var4.d;
            this.d = null;
            return;
        }
        og2 og2Var5 = og2Var4 != null ? og2Var4.d : null;
        while (true) {
            og2 og2Var6 = og2Var4;
            og2Var4 = og2Var5;
            if (og2Var4 == null) {
                return;
            }
            if (og2Var4 == this) {
                if (og2Var6 != null) {
                    og2Var6.d = og2Var4.d;
                }
                this.d = null;
                return;
            }
            og2Var5 = og2Var4.d;
        }
    }
}

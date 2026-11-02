package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cx extends t71 implements rv, hw0 {
    public di1 s;
    public final uy1 t;
    public boolean u;
    public final jy1 v;
    public boolean x;
    public boolean z;
    public final ck w = new ck(0);
    public long y = 0;

    public cx(di1 di1Var, uy1 uy1Var, boolean z, jy1 jy1Var) {
        this.s = di1Var;
        this.t = uy1Var;
        this.u = z;
        this.v = jy1Var;
    }

    public static boolean G0(cx cxVar, yr1 yr1Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = cxVar.y;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jI0 = cxVar.I0(yr1Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jI0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jI0 & 4294967295L))) <= 0.5f;
    }

    public final float F0(mk mkVar, long j) {
        float f;
        yr1 yr1Var;
        int iCompare;
        if (qr0.a(this.y, 0L)) {
            return 0.0f;
        }
        fa1 fa1Var = this.w.a;
        int i = fa1Var.g - 1;
        Object[] objArr = fa1Var.e;
        if (i < objArr.length) {
            yr1Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                yr1 yr1Var2 = (yr1) ((zw) objArr[i]).a.a();
                if (yr1Var2 != null) {
                    long jC = yr1Var2.c();
                    long jM = ux.M(this.y);
                    f = 0.0f;
                    int iOrdinal = this.s.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jM & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            qj.p();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jM >> 32)));
                    }
                    if (iCompare > 0) {
                        if (yr1Var != null) {
                            break;
                        }
                        yr1Var = yr1Var2;
                        break;
                    }
                    yr1Var = yr1Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            yr1Var = null;
        }
        if (yr1Var == null) {
            yr1 yr1Var3 = this.x ? (yr1) this.v.a() : null;
            if (yr1Var3 == null) {
                return f;
            }
            yr1Var = yr1Var3;
        }
        long jM2 = ux.M(this.y);
        int iOrdinal2 = this.s.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = yr1Var.b;
            return mkVar.a(f2 - ((int) (j & 4294967295L)), yr1Var.d - f2, Float.intBitsToFloat((int) (jM2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = yr1Var.a;
            return mkVar.a(f3 - ((int) (j >> 32)), yr1Var.c - f3, Float.intBitsToFloat((int) (jM2 >> 32)));
        }
        qj.p();
        return f;
    }

    public final void H0(long j) {
        zv zvVar = ok.a;
        mk mkVar = (mk) ir2.j(this, zvVar);
        if (this.z) {
            yp0.c("launchAnimation called when previous animation was running");
        }
        ((mk) ir2.j(this, zvVar)).getClass();
        mk.a.getClass();
        nj2.y(t0(), null, new bx(this, new wl2(lk.b), mkVar, j, null), 1);
    }

    public final long I0(yr1 yr1Var, long j, long j2) {
        long jM = ux.M(j);
        int iOrdinal = this.s.ordinal();
        if (iOrdinal == 0) {
            mk mkVar = (mk) ir2.j(this, ok.a);
            float f = yr1Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mkVar.a(f - ((int) (j2 & 4294967295L)), yr1Var.d - f, Float.intBitsToFloat((int) (jM & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            qj.p();
            return 0L;
        }
        mk mkVar2 = (mk) ir2.j(this, ok.a);
        float f2 = yr1Var.a;
        return (((long) Float.floatToRawIntBits(mkVar2.a(f2 - ((int) (j2 >> 32)), yr1Var.c - f2, Float.intBitsToFloat((int) (jM >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // defpackage.hw0, defpackage.z61
    public final void c(long j) {
        int iN;
        long j2;
        long j3 = this.y;
        this.y = j;
        int iOrdinal = this.s.ordinal();
        if (iOrdinal == 0) {
            iN = ws0.n((int) (j & 4294967295L), (int) (j3 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                qj.p();
                return;
            }
            iN = ws0.n((int) (j >> 32), (int) (j3 >> 32));
        }
        if (iN >= 0) {
            return;
        }
        if (this.u) {
            j2 = 0;
        } else {
            j2 = this.s == di1.e ? ((long) (((int) (j3 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (j3 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j4 = j2;
        yr1 yr1Var = (yr1) this.v.a();
        if (yr1Var == null || this.z || this.x || !G0(this, yr1Var, j3, 0L, 2) || G0(this, yr1Var, 0L, j4, 1)) {
            return;
        }
        this.x = true;
        H0(j4);
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}

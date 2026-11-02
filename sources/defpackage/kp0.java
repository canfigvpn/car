package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 {
    public final ny1 a;
    public fp0 b;
    public ip0 c;
    public hp0 d;
    public gp0 e;
    public vv f;
    public qk1 g;
    public long h = 9205357640488583168L;
    public sh2 i;
    public final lp0 j;
    public final lp0 k;
    public long l;

    public kp0(ny1 ny1Var) {
        this.a = ny1Var;
        lp0 lp0Var = new lp0();
        lp0Var.b = new ArrayList();
        this.j = lp0Var;
        lp0 lp0Var2 = new lp0();
        lp0Var2.b = new ArrayList();
        this.k = lp0Var2;
        this.l = 0L;
    }

    public static void c(kp0 kp0Var, dp0 dp0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ny1 ny1Var = kp0Var.a;
        hp0 hp0Var = kp0Var.d;
        if (hp0Var == null) {
            hp0Var = new hp0();
            hp0Var.d = null;
            hp0Var.e = Long.MAX_VALUE;
            hp0Var.f = false;
            kp0Var.d = hp0Var;
        }
        hp0Var.d = dp0Var;
        hp0Var.e = j;
        sh2 sh2Var = kp0Var.i;
        di1 di1Var = ny1Var.u;
        if (sh2Var == null) {
            kp0Var.i = new sh2(di1Var);
        } else {
            sh2Var.a = di1Var;
            sh2Var.b = j2;
        }
        hp0Var.f = false;
        kp0Var.f = hp0Var;
    }

    public final void a() {
        fp0 fp0Var = this.b;
        ep0 ep0Var = ep0.g;
        if (fp0Var == null) {
            fp0Var = new fp0();
            fp0Var.d = ep0Var;
            fp0Var.e = false;
            this.b = fp0Var;
        }
        fp0Var.d = ep0Var;
        fp0Var.e = false;
        this.f = fp0Var;
    }

    public final void b(dp0 dp0Var, long j, sh2 sh2Var) {
        gp0 gp0Var = this.e;
        if (gp0Var == null) {
            gp0Var = new gp0();
            gp0Var.d = null;
            gp0Var.e = Long.MAX_VALUE;
            this.e = gp0Var;
        }
        gp0Var.d = dp0Var;
        gp0Var.e = j;
        sh2Var.b = 0L;
        this.f = gp0Var;
    }

    public final qk1 d() {
        qk1 qk1Var = this.g;
        if (qk1Var != null) {
            return qk1Var;
        }
        qj.r("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(dp0 dp0Var, cp0 cp0Var, long j) {
        ny1 ny1Var = this.a;
        long jC = qx.U(ny1Var).c(0L);
        if (!uf1.b(this.h, 9205357640488583168L) && !uf1.b(jC, this.h)) {
            this.l = uf1.e(this.l, uf1.d(jC, this.h));
        }
        this.h = jC;
        di1 di1Var = ny1Var.u;
        di1Var.getClass();
        int i = e80.a;
        if (Math.abs(Float.intBitsToFloat((int) (di1Var == di1.e ? j & 4294967295L : j >> 32))) > 2.0f) {
            rw.l(d(), dp0Var, ny1Var.u, cp0Var, this.j, this.l);
            lp0 lp0Var = this.k;
            ArrayList arrayList = lp0Var.b;
            if (arrayList.size() == 3) {
                int i2 = lp0Var.a;
                lp0Var.a = i2 + 1;
                arrayList.set(i2, new uf1(j));
            } else {
                arrayList.add(new uf1(j));
            }
            if (lp0Var.a == 3) {
                lp0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((uf1) arrayList.get(i3)).a >> 32))));
            }
            float fN = (float) vq.N(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((uf1) arrayList.get(i4)).a & 4294967295L))));
            }
            ny1Var.M0(new k70((((long) Float.floatToRawIntBits((float) vq.N(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fN)) << 32), true));
        }
    }

    public final void f(dp0 dp0Var, dp0 dp0Var2, cp0 cp0Var, long j) {
        if (this.g == null) {
            this.g = new qk1(24);
        }
        this.l = 0L;
        qk1 qk1VarD = d();
        ny1 ny1Var = this.a;
        rw.l(qk1VarD, dp0Var, ny1Var.u, cp0Var, this.j, this.l);
        long jD = uf1.d(rw.L(dp0Var2, ny1Var.u, cp0Var), j);
        if (((Boolean) ny1Var.v.h(new co1(1))).booleanValue()) {
            this.h = qx.U(ny1Var).c(0L);
            ny1Var.M0(new l70(jD));
        }
        lp0 lp0Var = this.k;
        lp0Var.a = 0;
        lp0Var.b.clear();
    }
}

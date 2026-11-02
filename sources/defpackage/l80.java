package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface l80 extends m40 {
    static void C(l80 l80Var, long j, float f, long j2, m80 m80Var, int i) {
        if ((i & 4) != 0) {
            j2 = l80Var.V();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            m80Var = fd0.a;
        }
        l80Var.i0(j, f, j3, m80Var);
    }

    static void E(cx0 cx0Var, rk rkVar, long j, long j2, long j3, m80 m80Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long jS0 = (i & 4) != 0 ? s0(cx0Var.e.d(), j4) : j2;
        m80 m80Var2 = (i & 32) != 0 ? fd0.a : m80Var;
        um umVar = cx0Var.e;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        umVar.e.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jS0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jS0 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), umVar.c(rkVar, m80Var2, 1.0f, null, 3, 1));
    }

    static void J(cx0 cx0Var, g7 g7Var, yi yiVar) {
        um umVar = cx0Var.e;
        umVar.e.c.a(g7Var, umVar.c(null, fd0.a, 1.0f, yiVar, 3, 1));
    }

    static void L(l80 l80Var, long j, long j2, long j3, float f, int i, int i2) {
        l80Var.S(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i);
    }

    static void Q(l80 l80Var, g7 g7Var, long j, long j2, float f, yi yiVar, int i, int i2) {
        l80Var.M(g7Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, yiVar, (i2 & 512) != 0 ? 1 : i);
    }

    static void T(cx0 cx0Var, rk rkVar, long j, long j2, float f, m80 m80Var, int i) {
        long j3 = (i & 2) != 0 ? 0L : j;
        long jS0 = (i & 4) != 0 ? s0(cx0Var.e.d(), j3) : j2;
        float f2 = (i & 8) != 0 ? 1.0f : f;
        m80 m80Var2 = (i & 16) != 0 ? fd0.a : m80Var;
        um umVar = cx0Var.e;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        umVar.e.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jS0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jS0 & 4294967295L)) + Float.intBitsToFloat(i3), umVar.c(rkVar, m80Var2, f2, null, 3, 1));
    }

    static void c0(l80 l80Var, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = s0(l80Var.d(), j4);
        }
        l80Var.r0((i & 64) != 0 ? 3 : 0, j, j4, j3);
    }

    static void s(l80 l80Var, d8 d8Var, rk rkVar, float f, p92 p92Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        m80 m80Var = p92Var;
        if ((i & 8) != 0) {
            m80Var = fd0.a;
        }
        l80Var.g(d8Var, rkVar, f2, m80Var, (i & 32) != 0 ? 3 : 0);
    }

    static long s0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    ud B();

    void M(g7 g7Var, long j, long j2, long j3, float f, yi yiVar, int i);

    void S(long j, long j2, long j3, float f, int i);

    default long V() {
        return y12.k(B().m());
    }

    void W(d8 d8Var, long j, m80 m80Var);

    default long d() {
        return B().m();
    }

    void g(d8 d8Var, rk rkVar, float f, m80 m80Var, int i);

    kw0 getLayoutDirection();

    void i0(long j, float f, long j2, m80 m80Var);

    void r0(int i, long j, long j2, long j3);

    void u(long j, long j2, long j3, long j4);
}

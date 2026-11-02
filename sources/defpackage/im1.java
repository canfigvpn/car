package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class im1 implements m40 {
    public boolean e;

    public static void j(im1 im1Var, jm1 jm1Var, long j) {
        im1Var.f(jm1Var);
        jm1Var.l0(ir0.c(j, jm1Var.i), 0.0f, null);
    }

    public static void k(im1 im1Var, jm1 jm1Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (im1Var.c() == kw0.e || im1Var.e() == 0) {
            im1Var.f(jm1Var);
            jm1Var.l0(ir0.c(j, jm1Var.i), 0.0f, null);
        } else {
            int iE = (im1Var.e() - jm1Var.e) - ((int) (j >> 32));
            im1Var.f(jm1Var);
            jm1Var.l0(ir0.c((((long) iE) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), jm1Var.i), 0.0f, null);
        }
    }

    public static void m(im1 im1Var, jm1 jm1Var, int i, int i2) {
        int i3 = km1.b;
        je1 je1Var = je1.q;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (im1Var.c() == kw0.e || im1Var.e() == 0) {
            im1Var.f(jm1Var);
            jm1Var.l0(ir0.c(j, jm1Var.i), 0.0f, je1Var);
        } else {
            int iE = (im1Var.e() - jm1Var.e) - ((int) (j >> 32));
            im1Var.f(jm1Var);
            jm1Var.l0(ir0.c((((long) iE) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), jm1Var.i), 0.0f, je1Var);
        }
    }

    public static void n(im1 im1Var, jm1 jm1Var, ej0 ej0Var) {
        im1Var.f(jm1Var);
        jm1Var.l0(ir0.c(0L, jm1Var.i), 0.0f, ej0Var);
    }

    public static void o(im1 im1Var, jm1 jm1Var, long j) {
        int i = km1.b;
        je1 je1Var = je1.q;
        im1Var.f(jm1Var);
        jm1Var.l0(ir0.c(j, jm1Var.i), 0.0f, je1Var);
    }

    public float a(rn0 rn0Var) {
        return Float.NaN;
    }

    public abstract kw0 c();

    public abstract int e();

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(jm1 jm1Var) {
        if (jm1Var instanceof f81) {
            ((f81) jm1Var).n(this.e);
        }
    }

    public final void h(jm1 jm1Var, int i, int i2, float f) {
        f(jm1Var);
        jm1Var.l0(ir0.c((((long) i2) & 4294967295L) | (((long) i) << 32), jm1Var.i), f, null);
    }
}

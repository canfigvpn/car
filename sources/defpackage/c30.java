package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(k01 k01Var, boolean z) {
        return z ? ((l01) vq.W(k01Var.k)).a + 1 : ((l01) vq.Q(k01Var.k)).a - 1;
    }

    public static int b(gy0 gy0Var, boolean z) {
        di1 di1Var = di1.e;
        if (z) {
            hy0 hy0Var = (hy0) vq.W(gy0Var.m);
            return (gy0Var.q == di1Var ? hy0Var.p : hy0Var.q) + 1;
        }
        hy0 hy0Var2 = (hy0) vq.Q(gy0Var.m);
        return (gy0Var.q == di1Var ? hy0Var2.p : hy0Var2.q) - 1;
    }
}

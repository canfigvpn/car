package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jq2 {
    public static final d91 a;
    public static final hq2[] b;

    static {
        d91 d91Var = new d91(8);
        hq2.a.getClass();
        iq2 iq2Var = gq2.g;
        d91Var.h(1, iq2Var);
        iq2 iq2Var2 = gq2.f;
        d91Var.h(2, iq2Var2);
        iq2 iq2Var3 = gq2.b;
        d91Var.h(4, iq2Var3);
        iq2 iq2Var4 = gq2.d;
        d91Var.h(8, iq2Var4);
        iq2 iq2Var5 = gq2.h;
        d91Var.h(16, iq2Var5);
        iq2 iq2Var6 = gq2.e;
        d91Var.h(32, iq2Var6);
        iq2 iq2Var7 = gq2.i;
        d91Var.h(64, iq2Var7);
        iq2 iq2Var8 = gq2.c;
        d91Var.h(128, iq2Var8);
        a = d91Var;
        b = new hq2[]{iq2Var, iq2Var2, iq2Var3, iq2Var7, iq2Var5, iq2Var6, iq2Var4, gq2.j, iq2Var8};
    }

    public static final void a(u41 u41Var, cq0 cq0Var, long j, int i, int i2) {
        if (c22.b(j, -1L)) {
            return;
        }
        u41Var.c(cq0Var.b, (int) ((j >>> 48) & 65535));
        u41Var.c(cq0Var.c, (int) ((j >>> 32) & 65535));
        u41Var.c(cq0Var.d, i - ((int) ((j >>> 16) & 65535)));
        u41Var.c(cq0Var.e, i2 - ((int) (j & 65535)));
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pw {
    public static final d91 a;

    static {
        ju1 ju1Var = qr.e;
        int i = ju1Var.c;
        mw mwVar = new mw(ju1Var, ju1Var, 1);
        int i2 = ju1Var.c;
        zf1 zf1Var = qr.x;
        int i3 = (zf1Var.c << 6) | i2;
        ow owVar = new ow(ju1Var, zf1Var, 0);
        int i4 = (i2 << 6) | zf1Var.c;
        ow owVar2 = new ow(zf1Var, ju1Var, 0);
        d91 d91Var = hr0.a;
        d91 d91Var2 = new d91();
        d91Var2.h(i | (i << 6), mwVar);
        d91Var2.h(i3, owVar);
        d91Var2.h(i4, owVar2);
        a = d91Var2;
    }
}

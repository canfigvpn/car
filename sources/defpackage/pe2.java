package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe2 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ m40 f;
    public final /* synthetic */ da1 g;

    public /* synthetic */ pe2(m40 m40Var, da1 da1Var, int i) {
        this.e = i;
        this.f = m40Var;
        this.g = da1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        da1 da1Var = this.g;
        m40 m40Var = this.f;
        switch (i) {
            case 0:
                lc lcVar = new lc(2, (ti0) obj);
                pe2 pe2Var = new pe2(m40Var, da1Var, 1);
                if (i51.a()) {
                    return i51.a() ? new f51(lcVar, pe2Var, Build.VERSION.SDK_INT == 28 ? um1.a : wm1.a) : r71.a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                z60 z60Var = (z60) obj;
                da1Var.setValue(new qr0((((long) m40Var.O(z60.a(z60Var.a))) & 4294967295L) | (((long) m40Var.O(z60.b(z60Var.a))) << 32)));
                return ll2.a;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t00 implements ej0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj).getClass();
                return Integer.valueOf(i2);
            default:
                rz0 rz0Var = (rz0) obj;
                o62 o62VarJ = c12.j();
                c12.s(o62VarJ, c12.p(o62VarJ), o62VarJ != null ? o62VarJ.e() : null);
                int i3 = rz0Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    rz0Var.a(i2 + i4);
                }
                return ll2.a;
        }
    }

    public /* synthetic */ t00(q01 q01Var, int i) {
        this.f = i;
    }
}

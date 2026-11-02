package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di2 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ki2 f;

    public /* synthetic */ di2(ki2 ki2Var, int i) {
        this.e = i;
        this.f = ki2Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        ki2 ki2Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf((ws0.j(ki2Var.d.getValue(), ki2Var.a.f()) && ki2Var.g.h() == Long.MIN_VALUE && !((Boolean) ki2Var.h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(ki2Var.b());
        }
    }
}

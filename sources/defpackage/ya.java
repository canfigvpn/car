package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ za g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya(za zaVar, long j, int i) {
        super(1);
        this.f = i;
        this.g = zaVar;
        this.h = j;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        ld0 ld0Var;
        int i = this.f;
        long j = 0;
        long j2 = this.h;
        za zaVar = this.g;
        switch (i) {
            case 0:
                gi2 gi2Var = (gi2) obj;
                if (!ws0.j(gi2Var.a(), zaVar.v.a())) {
                    p82 p82Var = (p82) zaVar.v.d.g(gi2Var.a());
                    j2 = p82Var != null ? ((qr0) p82Var.getValue()).a : 0L;
                } else if (!qr0.a(zaVar.w, -9223372034707292160L)) {
                    j2 = zaVar.w;
                }
                p82 p82Var2 = (p82) zaVar.v.d.g(gi2Var.c());
                j = p82Var2 != null ? ((qr0) p82Var2.getValue()).a : 0L;
                h52 h52Var = (h52) zaVar.u.getValue();
                return (h52Var == null || (ld0Var = (ld0) h52Var.a.g(new qr0(j2), new qr0(j))) == null) ? s5.T(0.0f, 400.0f, null, 5) : ld0Var;
            default:
                if (ws0.j(obj, zaVar.v.a())) {
                    j = qr0.a(zaVar.w, -9223372034707292160L) ? j2 : zaVar.w;
                } else {
                    p82 p82Var3 = (p82) zaVar.v.d.g(obj);
                    if (p82Var3 != null) {
                        j = ((qr0) p82Var3.getValue()).a;
                    }
                }
                return new qr0(j);
        }
    }
}

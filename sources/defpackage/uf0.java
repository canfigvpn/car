package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uf0 extends dw0 implements ej0 {
    public final /* synthetic */ gs1 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(gs1 gs1Var, int i) {
        super(1);
        this.f = gs1Var;
        this.g = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((cg0) obj).M0(this.g));
        this.f.e = boolValueOf;
        return boolValueOf;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lb0 extends dw0 implements ej0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ti0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(boolean z, ti0 ti0Var) {
        super(1);
        this.f = z;
        this.g = ti0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        ((bu1) obj).f(!this.f && ((Boolean) this.g.a()).booleanValue());
        return ll2.a;
    }
}

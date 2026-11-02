package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mn2 extends dw0 implements ti0 {
    public final /* synthetic */ r f;
    public final /* synthetic */ e7 g;
    public final /* synthetic */ fu1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn2(r rVar, e7 e7Var, fu1 fu1Var) {
        super(0);
        this.f = rVar;
        this.g = e7Var;
        this.h = fu1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        e7 e7Var = this.g;
        r rVar = this.f;
        rVar.removeOnAttachStateChangeListener(e7Var);
        ix.D(rVar).a.remove(this.h);
        return ll2.a;
    }
}

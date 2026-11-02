package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class to1 extends dw0 implements ti0 {
    public final /* synthetic */ fs1 f;
    public final /* synthetic */ uo1 g;
    public final /* synthetic */ mr0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to1(fs1 fs1Var, uo1 uo1Var, mr0 mr0Var, long j, long j2) {
        super(0);
        this.f = fs1Var;
        this.g = uo1Var;
        this.h = mr0Var;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.ti0
    public final Object a() {
        uo1 uo1Var = this.g;
        this.f.e = uo1Var.getPositionProvider().a(this.h, this.i, uo1Var.getParentLayoutDirection(), this.j);
        return ll2.a;
    }
}

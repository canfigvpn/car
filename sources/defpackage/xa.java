package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends dw0 implements ej0 {
    public final /* synthetic */ za f;
    public final /* synthetic */ jm1 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(za zaVar, jm1 jm1Var, long j) {
        super(1);
        this.f = zaVar;
        this.g = jm1Var;
        this.h = j;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        t3 t3Var = this.f.v.b;
        jm1 jm1Var = this.g;
        im1.j((im1) obj, jm1Var, t3Var.a((((long) jm1Var.f) & 4294967295L) | (((long) jm1Var.e) << 32), this.h, kw0.e));
        return ll2.a;
    }
}

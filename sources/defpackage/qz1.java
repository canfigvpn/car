package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qz1 implements jj0 {
    public final /* synthetic */ bp0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ wu1 h;
    public final /* synthetic */ ti0 i;

    public qz1(bp0 bp0Var, boolean z, boolean z2, wu1 wu1Var, ti0 ti0Var) {
        this.e = bp0Var;
        this.f = z;
        this.g = z2;
        this.h = wu1Var;
        this.i = ti0Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        ak0 ak0Var = (ak0) obj2;
        ((Number) obj3).intValue();
        ak0Var.W(-1525724089);
        Object objL = ak0Var.L();
        if (objL == cv.a) {
            objL = new f91();
            ak0Var.g0(objL);
        }
        f91 f91Var = (f91) objL;
        u71 u71VarC = yo0.a(r71.a, f91Var, this.e).c(new pz1(this.f, f91Var, null, false, this.g, this.h, this.i));
        ak0Var.p(false);
        return u71VarC;
    }
}

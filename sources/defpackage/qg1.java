package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qg1 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cg0 g;
    public final /* synthetic */ cg0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ na j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg1(cg0 cg0Var, cg0 cg0Var2, Object obj, int i, na naVar, int i2) {
        super(1);
        this.f = i2;
        this.g = cg0Var;
        this.h = cg0Var2;
        this.k = obj;
        this.i = i;
        this.j = naVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        na naVar = this.j;
        int i2 = this.i;
        Object obj2 = this.k;
        cg0 cg0Var = this.h;
        cg0 cg0Var2 = this.g;
        switch (i) {
            case 0:
                ri riVar = (ri) obj;
                if (cg0Var2 != ((vf0) ((e5) qx.W(cg0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zO = vv.O(cg0Var, (cg0) obj2, i2, naVar);
                Boolean boolValueOf = Boolean.valueOf(zO);
                if (zO || !riVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                ri riVar2 = (ri) obj;
                if (cg0Var2 != ((vf0) ((e5) qx.W(cg0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zU = y12.u(i2, naVar, cg0Var, (yr1) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zU);
                if (zU || !riVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}

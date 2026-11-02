package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c70 extends dw0 implements ej0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ cs1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(ao2 ao2Var, d70 d70Var, cs1 cs1Var) {
        super(1);
        this.g = cs1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ri2 ri2Var = ri2.e;
        cs1 cs1Var = this.g;
        switch (i) {
            case 0:
                d70 d70Var = (d70) obj;
                if (!d70Var.r) {
                    return ri2.f;
                }
                if (d70Var.t != null) {
                    vp0.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                d70Var.t = null;
                cs1Var.e = cs1Var.e;
                return ri2Var;
            default:
                if (!((vn0) obj).u) {
                    return ri2Var;
                }
                cs1Var.e = false;
                return ri2.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(cs1 cs1Var) {
        super(1);
        this.g = cs1Var;
    }
}

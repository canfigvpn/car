package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j91 extends a61 {
    public final xl1 h;
    public Object i;

    public j91(xl1 xl1Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.h = xl1Var;
        this.i = obj2;
    }

    @Override // defpackage.a61, java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // defpackage.a61, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.i;
        this.i = obj;
        vl1 vl1Var = (vl1) this.h.f;
        rl1 rl1Var = vl1Var.h;
        Object obj3 = this.f;
        if (!rl1Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = vl1Var.g;
        if (!z) {
            rl1Var.put(obj3, obj);
        } else {
            if (!z) {
                qj.t();
                return null;
            }
            xi2 xi2Var = vl1Var.e[vl1Var.f];
            Object obj4 = xi2Var.e[xi2Var.g];
            rl1Var.put(obj3, obj);
            vl1Var.c(obj4 != null ? obj4.hashCode() : 0, rl1Var.f, obj4, 0);
        }
        vl1Var.k = rl1Var.h;
        return obj2;
    }
}

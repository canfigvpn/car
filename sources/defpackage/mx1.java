package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class mx1 extends s implements gz {
    public final sx h;

    public mx1(sx sxVar, uy uyVar) {
        super(uyVar, true);
        this.h = sxVar;
    }

    @Override // defpackage.vt0
    public final boolean T() {
        return true;
    }

    @Override // defpackage.gz
    public final gz e() {
        sx sxVar = this.h;
        if (sxVar instanceof gz) {
            return (gz) sxVar;
        }
        return null;
    }

    @Override // defpackage.vt0
    public void x(Object obj) {
        ws0.O(ex.y(this.h), j20.A(obj));
    }

    @Override // defpackage.vt0
    public void z(Object obj) {
        this.h.i(j20.A(obj));
    }
}

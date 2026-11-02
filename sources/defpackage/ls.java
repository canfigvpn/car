package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ls extends vt0 {
    public final Object h0(tx txVar) {
        Object objO;
        do {
            objO = O();
            if (!(objO instanceof so0)) {
                if (objO instanceof os) {
                    throw ((os) objO).a;
                }
                return nj2.H(objO);
            }
        } while (d0(objO) < 0);
        st0 st0Var = new st0(ex.y(txVar), this);
        st0Var.v();
        st0Var.z(new km(2, mx.C(this, true, new wt1(st0Var))));
        return st0Var.t();
    }
}

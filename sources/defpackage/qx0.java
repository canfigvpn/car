package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 extends t71 implements ek1 {
    public float s;
    public boolean t;

    @Override // defpackage.ek1
    public final Object k0(Object obj) {
        qv1 qv1Var = obj instanceof qv1 ? (qv1) obj : null;
        if (qv1Var == null) {
            qv1Var = new qv1();
        }
        qv1Var.a = this.s;
        qv1Var.b = this.t;
        return qv1Var;
    }
}

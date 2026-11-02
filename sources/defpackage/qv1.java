package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 {
    public float a = 0.0f;
    public boolean b = true;
    public mz c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv1)) {
            return false;
        }
        qv1 qv1Var = (qv1) obj;
        return Float.compare(this.a, qv1Var.a) == 0 && this.b == qv1Var.b && ws0.j(this.c, qv1Var.c);
    }

    public final int hashCode() {
        int iF = k3.f(Float.hashCode(this.a) * 31, 31, this.b);
        mz mzVar = this.c;
        return (iF + (mzVar == null ? 0 : mzVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}

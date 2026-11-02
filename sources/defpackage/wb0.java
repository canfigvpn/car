package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wb0 extends on1 {
    public final x12 l;
    public final hb2 m;

    public wb0(String str, int i) {
        super(str, null, i);
        this.l = x12.b;
        this.m = new hb2(new vb0(i, str, this));
    }

    @Override // defpackage.on1, defpackage.s12
    public final y12 c() {
        return this.l;
    }

    @Override // defpackage.on1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s12)) {
            return false;
        }
        s12 s12Var = (s12) obj;
        return s12Var.c() == x12.b && this.a.equals(s12Var.b()) && ws0.j(ws0.k(this), ws0.k(s12Var));
    }

    @Override // defpackage.on1
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        v vVar = new v(this);
        int iHashCode2 = 1;
        while (vVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) vVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.on1, defpackage.s12
    public final s12 j(int i) {
        return ((s12[]) this.m.getValue())[i];
    }

    @Override // defpackage.on1
    public final String toString() {
        return vq.V(new xo0(1, this), ", ", this.a.concat("("), ")", null, 56);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class eg1 extends vv {
    public final ag d;
    public final y11 e;

    public eg1(ag agVar, y11 y11Var) {
        agVar.getClass();
        this.d = agVar;
        this.e = y11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg1)) {
            return false;
        }
        eg1 eg1Var = (eg1) obj;
        return ws0.j(this.d, eg1Var.d) && ws0.j(this.e, eg1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        y11 y11Var = this.e;
        return iHashCode + (y11Var == null ? 0 : y11Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.d + ", owner=" + this.e + ')';
    }
}

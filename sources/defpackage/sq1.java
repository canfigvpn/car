package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sq1 extends gm implements lv0 {
    public final boolean k;

    public sq1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sq1) {
            sq1 sq1Var = (sq1) obj;
            return f().equals(sq1Var.f()) && this.h.equals(sq1Var.h) && this.i.equals(sq1Var.i) && ws0.j(this.f, sq1Var.f);
        }
        if (obj instanceof lv0) {
            return obj.equals(i());
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + k3.e(f().hashCode() * 31, 31, this.h);
    }

    public final ev0 i() {
        if (this.k) {
            return this;
        }
        ev0 ev0Var = this.e;
        if (ev0Var != null) {
            return ev0Var;
        }
        ev0 ev0VarE = e();
        this.e = ev0VarE;
        return ev0VarE;
    }

    public final String toString() {
        ev0 ev0VarI = i();
        if (ev0VarI != this) {
            return ev0VarI.toString();
        }
        return "property " + this.h + " (Kotlin reflection is not available)";
    }
}

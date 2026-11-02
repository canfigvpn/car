package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class te2 {
    public static final ru1 d = new ru1(4, new xw1(27, 0), new v22(15));
    public final yb a;
    public final long b;
    public final of2 c;

    public te2(yb ybVar, long j, of2 of2Var) {
        of2 of2Var2;
        this.a = ybVar;
        this.b = j02.f(ybVar.f.length(), j);
        if (of2Var != null) {
            of2Var2 = new of2(j02.f(ybVar.f.length(), of2Var.a));
        } else {
            of2Var2 = null;
        }
        this.c = of2Var2;
    }

    public static te2 a(te2 te2Var, yb ybVar, long j, int i) {
        if ((i & 1) != 0) {
            ybVar = te2Var.a;
        }
        if ((i & 2) != 0) {
            j = te2Var.b;
        }
        of2 of2Var = (i & 4) != 0 ? te2Var.c : null;
        te2Var.getClass();
        return new te2(ybVar, j, of2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te2)) {
            return false;
        }
        te2 te2Var = (te2) obj;
        return of2.b(this.b, te2Var.b) && ws0.j(this.c, te2Var.c) && ws0.j(this.a, te2Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = of2.c;
        int iC = k3.c(iHashCode, 31, this.b);
        of2 of2Var = this.c;
        return iC + (of2Var != null ? Long.hashCode(of2Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) of2.h(this.b)) + ", composition=" + this.c + ')';
    }

    public te2(String str, long j, int i) {
        this(new yb((i & 1) != 0 ? "" : str), (i & 2) != 0 ? of2.b : j, (of2) null);
    }
}

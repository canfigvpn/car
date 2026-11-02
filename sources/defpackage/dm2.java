package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dm2 implements uo2 {
    public final String a;
    public final dk1 b;

    public dm2(tq0 tq0Var, String str) {
        this.a = str;
        this.b = y12.s(tq0Var);
    }

    @Override // defpackage.uo2
    public final int a(m40 m40Var) {
        return e().d;
    }

    @Override // defpackage.uo2
    public final int b(m40 m40Var) {
        return e().b;
    }

    @Override // defpackage.uo2
    public final int c(m40 m40Var, kw0 kw0Var) {
        return e().c;
    }

    @Override // defpackage.uo2
    public final int d(m40 m40Var, kw0 kw0Var) {
        return e().a;
    }

    public final tq0 e() {
        return (tq0) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dm2) {
            return ws0.j(e(), ((dm2) obj).e());
        }
        return false;
    }

    public final void f(tq0 tq0Var) {
        this.b.setValue(tq0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return k3.l(sb, e().d, ')');
    }
}

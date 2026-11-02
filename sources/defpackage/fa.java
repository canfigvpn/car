package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fa implements uo2 {
    public final int a;
    public final String b;
    public final dk1 c = y12.s(kq0.e);
    public final dk1 d = y12.s(Boolean.TRUE);

    public fa(String str, int i) {
        this.a = i;
        this.b = str;
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

    public final kq0 e() {
        return (kq0) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fa) {
            return this.a == ((fa) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(aq2 aq2Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(aq2Var.a.h(i2));
            f(aq2Var.a.t(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return k3.l(sb, e().d, ')');
    }
}

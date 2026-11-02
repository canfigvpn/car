package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b31 implements s12 {
    public final s12 a;

    public b31(s12 s12Var) {
        this.a = s12Var;
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        Integer numA = o92.A(str);
        if (numA != null) {
            return numA.intValue();
        }
        qj.r(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.s12
    public final y12 c() {
        return q92.c;
    }

    @Override // defpackage.s12
    public final int d() {
        return 1;
    }

    @Override // defpackage.s12
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b31)) {
            return false;
        }
        b31 b31Var = (b31) obj;
        return ws0.j(this.a, b31Var.a) && ws0.j(b(), b31Var.b());
    }

    @Override // defpackage.s12
    public final boolean f() {
        return false;
    }

    @Override // defpackage.s12
    public final List getAnnotations() {
        return cb0.e;
    }

    @Override // defpackage.s12
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return b().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s12
    public final List i(int i) {
        if (i >= 0) {
            return cb0.e;
        }
        qj.o(k3.m(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.s12
    public final s12 j(int i) {
        if (i >= 0) {
            return this.a;
        }
        qj.o(k3.m(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        qj.o(k3.m(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return b() + '(' + this.a + ')';
    }
}

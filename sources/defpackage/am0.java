package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class am0 implements s12 {
    public final String a;
    public final s12 b;
    public final s12 c;

    public am0(String str, s12 s12Var, s12 s12Var2) {
        this.a = str;
        this.b = s12Var;
        this.c = s12Var2;
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        Integer numA = o92.A(str);
        if (numA != null) {
            return numA.intValue();
        }
        qj.r(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.s12
    public final String b() {
        return this.a;
    }

    @Override // defpackage.s12
    public final y12 c() {
        return q92.d;
    }

    @Override // defpackage.s12
    public final int d() {
        return 2;
    }

    @Override // defpackage.s12
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am0)) {
            return false;
        }
        am0 am0Var = (am0) obj;
        return this.a.equals(am0Var.a) && this.b.equals(am0Var.b) && this.c.equals(am0Var.c);
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
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.s12
    public final List i(int i) {
        if (i >= 0) {
            return cb0.e;
        }
        qj.o(k3.m(i, "Illegal index ", ", "), this.a, " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.s12
    public final s12 j(int i) {
        if (i < 0) {
            qj.o(k3.m(i, "Illegal index ", ", "), this.a, " expects only non-negative indices");
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        fu1.h("Unreached");
        return null;
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        qj.o(k3.m(i, "Illegal index ", ", "), this.a, " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}

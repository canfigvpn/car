package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yp1 implements s12 {
    public final String a;
    public final xp1 b;

    public yp1(String str, xp1 xp1Var) {
        xp1Var.getClass();
        this.a = str;
        this.b = xp1Var;
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        g();
        throw null;
    }

    @Override // defpackage.s12
    public final String b() {
        return this.a;
    }

    @Override // defpackage.s12
    public final y12 c() {
        return this.b;
    }

    @Override // defpackage.s12
    public final int d() {
        return 0;
    }

    @Override // defpackage.s12
    public final String e(int i) {
        g();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp1)) {
            return false;
        }
        yp1 yp1Var = (yp1) obj;
        return this.a.equals(yp1Var.a) && ws0.j(this.b, yp1Var.b);
    }

    @Override // defpackage.s12
    public final boolean f() {
        return false;
    }

    public final void g() {
        throw new IllegalStateException("Primitive descriptor " + this.a + " does not have elements");
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
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.s12
    public final List i(int i) {
        g();
        throw null;
    }

    @Override // defpackage.s12
    public final s12 j(int i) {
        g();
        throw null;
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        g();
        throw null;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}

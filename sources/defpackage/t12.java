package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 implements s12, ul {
    public final s12 a;
    public final String b;
    public final Set c;

    public t12(s12 s12Var) {
        s12Var.getClass();
        this.a = s12Var;
        this.b = s12Var.b() + '?';
        this.c = ws0.k(s12Var);
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.s12
    public final String b() {
        return this.b;
    }

    @Override // defpackage.s12
    public final y12 c() {
        return this.a.c();
    }

    @Override // defpackage.s12
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.s12
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t12) {
            return ws0.j(this.a, ((t12) obj).a);
        }
        return false;
    }

    @Override // defpackage.s12
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.ul
    public final Set g() {
        return this.c;
    }

    @Override // defpackage.s12
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.s12
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.s12
    public final List i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.s12
    public final s12 j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        return this.a.k(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}

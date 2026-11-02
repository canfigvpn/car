package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kx implements s12 {
    public final u12 a;
    public final aq b;
    public final String c;

    public kx(u12 u12Var, aq aqVar) {
        this.a = u12Var;
        this.b = aqVar;
        this.c = u12Var.a + '<' + aqVar.c() + '>';
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.s12
    public final String b() {
        return this.c;
    }

    @Override // defpackage.s12
    public final y12 c() {
        return this.a.b;
    }

    @Override // defpackage.s12
    public final int d() {
        return this.a.c;
    }

    @Override // defpackage.s12
    public final String e(int i) {
        return this.a.f[i];
    }

    public final boolean equals(Object obj) {
        kx kxVar = obj instanceof kx ? (kx) obj : null;
        return kxVar != null && this.a.equals(kxVar.a) && kxVar.b.equals(this.b);
    }

    @Override // defpackage.s12
    public final boolean f() {
        return false;
    }

    @Override // defpackage.s12
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.s12
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.s12
    public final List i(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.s12
    public final s12 j(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}

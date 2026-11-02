package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i42 {
    public final jv1 a;
    public final jv1 b;
    public final jv1 c;
    public final jv1 d;
    public final jv1 e;
    public final jv1 f;
    public final jv1 g;
    public final jv1 h;

    public i42() {
        jv1 jv1Var = x32.a;
        jv1 jv1Var2 = x32.b;
        jv1 jv1Var3 = x32.c;
        jv1 jv1Var4 = x32.d;
        jv1 jv1Var5 = x32.f;
        jv1 jv1Var6 = x32.e;
        jv1 jv1Var7 = x32.g;
        jv1 jv1Var8 = x32.h;
        this.a = jv1Var;
        this.b = jv1Var2;
        this.c = jv1Var3;
        this.d = jv1Var4;
        this.e = jv1Var5;
        this.f = jv1Var6;
        this.g = jv1Var7;
        this.h = jv1Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i42)) {
            return false;
        }
        i42 i42Var = (i42) obj;
        return ws0.j(this.a, i42Var.a) && ws0.j(this.b, i42Var.b) && ws0.j(this.c, i42Var.c) && ws0.j(this.d, i42Var.d) && ws0.j(this.e, i42Var.e) && ws0.j(this.f, i42Var.f) && ws0.j(this.g, i42Var.g) && ws0.j(this.h, i42Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}

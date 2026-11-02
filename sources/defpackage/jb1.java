package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 {
    public final xc1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public jb1(xc1 xc1Var, boolean z, boolean z2) {
        if (!xc1Var.a && z) {
            qj.f(xc1Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        this.a = xc1Var;
        this.b = z;
        this.c = z2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jb1.class != obj.getClass()) {
            return false;
        }
        jb1 jb1Var = (jb1) obj;
        return this.b == jb1Var.b && this.c == jb1Var.c && this.a.equals(jb1Var.a);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(js1.a(jb1.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}

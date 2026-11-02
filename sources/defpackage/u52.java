package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 {
    public final v52 a;
    public final om b;

    public u52(v52 v52Var, om omVar) {
        this.a = v52Var;
        this.b = omVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u52.class == obj.getClass()) {
            u52 u52Var = (u52) obj;
            return ws0.j(this.a, u52Var.a) && this.b == u52Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

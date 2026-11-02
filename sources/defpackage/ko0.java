package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ko0 {
    public final jo0 a;
    public final int b;

    public ko0(jo0 jo0Var, int i) {
        this.a = jo0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko0)) {
            return false;
        }
        ko0 ko0Var = (ko0) obj;
        return this.a.equals(ko0Var.a) && this.b == ko0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return k3.l(sb, this.b, ')');
    }
}

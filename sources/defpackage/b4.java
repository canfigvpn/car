package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 implements i71 {
    public final vi a;
    public final vi b;
    public final int c;

    public b4(vi viVar, vi viVar2, int i) {
        this.a = viVar;
        this.b = viVar2;
        this.c = i;
    }

    @Override // defpackage.i71
    public final int a(mr0 mr0Var, long j, int i) {
        int iA = this.b.a(0, mr0Var.b());
        return mr0Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.a.equals(b4Var.a) && this.b.equals(b4Var.b) && this.c == b4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k3.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return k3.l(sb, this.c, ')');
    }
}

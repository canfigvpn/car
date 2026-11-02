package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c32 implements r90 {
    public final int a;
    public final int b;

    public c32(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.r90
    public final void a(s90 s90Var) {
        int iH = ex.h(this.a, 0, s90Var.a.c());
        int iH2 = ex.h(this.b, 0, s90Var.a.c());
        if (iH < iH2) {
            s90Var.f(iH, iH2);
        } else {
            s90Var.f(iH2, iH);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c32)) {
            return false;
        }
        c32 c32Var = (c32) obj;
        return this.a == c32Var.a && this.b == c32Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return k3.l(sb, this.b, ')');
    }
}

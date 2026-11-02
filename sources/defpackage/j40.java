package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j40 implements r90 {
    public final int a;
    public final int b;

    public j40(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        wp0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.r90
    public final void a(s90 s90Var) {
        int i = s90Var.c;
        uc ucVar = s90Var.a;
        int i2 = this.b;
        int iC = i + i2;
        if (((i ^ iC) & (i2 ^ iC)) < 0) {
            iC = ucVar.c();
        }
        s90Var.a(s90Var.c, Math.min(iC, ucVar.c()));
        int i3 = s90Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        s90Var.a(Math.max(0, i5), s90Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return this.a == j40Var.a && this.b == j40Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return k3.l(sb, this.b, ')');
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k40 implements r90 {
    public final int a;
    public final int b;

    public k40(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        wp0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.r90
    public final void a(s90 s90Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = s90Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(s90Var.b((i4 - i3) + (-1))) && Character.isLowSurrogate(s90Var.b(s90Var.b - i3))) ? i + 2 : i3;
        }
        int iC = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iC + 1;
            int i7 = s90Var.c;
            uc ucVar = s90Var.a;
            if (i7 + i6 >= ucVar.c()) {
                iC = ucVar.c() - s90Var.c;
                break;
            }
            iC = (Character.isHighSurrogate(s90Var.b((s90Var.c + i6) + (-1))) && Character.isLowSurrogate(s90Var.b(s90Var.c + i6))) ? iC + 2 : i6;
        }
        int i8 = s90Var.c;
        s90Var.a(i8, iC + i8);
        int i9 = s90Var.b;
        s90Var.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        return this.a == k40Var.a && this.b == k40Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return k3.l(sb, this.b, ')');
    }
}

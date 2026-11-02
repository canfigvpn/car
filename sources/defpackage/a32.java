package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a32 implements r90 {
    public final int a;
    public final int b;

    public a32(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.r90
    public final void a(s90 s90Var) {
        boolean z = s90Var.d != -1;
        uc ucVar = s90Var.a;
        if (z) {
            s90Var.d = -1;
            s90Var.e = -1;
        }
        int iH = ex.h(this.a, 0, ucVar.c());
        int iH2 = ex.h(this.b, 0, ucVar.c());
        if (iH != iH2) {
            if (iH < iH2) {
                s90Var.e(iH, iH2);
            } else {
                s90Var.e(iH2, iH);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a32)) {
            return false;
        }
        a32 a32Var = (a32) obj;
        return this.a == a32Var.a && this.b == a32Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return k3.l(sb, this.b, ')');
    }
}

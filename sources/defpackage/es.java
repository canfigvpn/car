package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class es implements r90 {
    public final yb a;
    public final int b;

    public es(String str, int i) {
        this(new yb(str), i);
    }

    @Override // defpackage.r90
    public final void a(s90 s90Var) {
        int i = s90Var.d;
        yb ybVar = this.a;
        if (i != -1) {
            s90Var.d(i, s90Var.e, ybVar.f);
        } else {
            s90Var.d(s90Var.b, s90Var.c, ybVar.f);
        }
        int i2 = s90Var.b;
        int i3 = s90Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iH = ex.h(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - ybVar.f.length(), 0, s90Var.a.c());
        s90Var.f(iH, iH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es)) {
            return false;
        }
        es esVar = (es) obj;
        return ws0.j(this.a.f, esVar.a.f) && this.b == esVar.b;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.f);
        sb.append("', newCursorPosition=");
        return k3.l(sb, this.b, ')');
    }

    public es(yb ybVar, int i) {
        this.a = ybVar;
        this.b = i;
    }
}

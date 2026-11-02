package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b32 implements r90 {
    public final yb a;
    public final int b;

    public b32(String str, int i) {
        this.a = new yb(str);
        this.b = i;
    }

    @Override // defpackage.r90
    public final void a(s90 s90Var) {
        String str = this.a.f;
        int i = s90Var.d;
        if (i != -1) {
            s90Var.d(i, s90Var.e, str);
            if (str.length() > 0) {
                s90Var.e(i, str.length() + i);
            }
        } else {
            int i2 = s90Var.b;
            s90Var.d(i2, s90Var.c, str);
            if (str.length() > 0) {
                s90Var.e(i2, str.length() + i2);
            }
        }
        int i3 = s90Var.b;
        int i4 = s90Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int iH = ex.h(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, s90Var.a.c());
        s90Var.f(iH, iH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b32)) {
            return false;
        }
        b32 b32Var = (b32) obj;
        return ws0.j(this.a.f, b32Var.a.f) && this.b == b32Var.b;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.f);
        sb.append("', newCursorPosition=");
        return k3.l(sb, this.b, ')');
    }
}

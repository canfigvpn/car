package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 implements h71 {
    public final ui a;
    public final ui b;
    public final int c;

    public a4(ui uiVar, ui uiVar2, int i) {
        this.a = uiVar;
        this.b = uiVar2;
        this.c = i;
    }

    @Override // defpackage.h71
    public final int a(mr0 mr0Var, long j, int i, kw0 kw0Var) {
        int iA = this.b.a(0, mr0Var.c(), kw0Var);
        int i2 = -this.a.a(0, i, kw0Var);
        kw0 kw0Var2 = kw0.e;
        int i3 = this.c;
        if (kw0Var != kw0Var2) {
            i3 = -i3;
        }
        return mr0Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.a.equals(a4Var.a) && this.b.equals(a4Var.b) && this.c == a4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k3.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return k3.l(sb, this.c, ')');
    }
}

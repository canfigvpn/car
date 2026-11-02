package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h21 implements uo2 {
    public final kl2 a;
    public final int b;

    public h21(kl2 kl2Var, int i) {
        this.a = kl2Var;
        this.b = i;
    }

    @Override // defpackage.uo2
    public final int a(m40 m40Var) {
        if ((this.b & 32) != 0) {
            return this.a.a(m40Var);
        }
        return 0;
    }

    @Override // defpackage.uo2
    public final int b(m40 m40Var) {
        if ((this.b & 16) != 0) {
            return this.a.b(m40Var);
        }
        return 0;
    }

    @Override // defpackage.uo2
    public final int c(m40 m40Var, kw0 kw0Var) {
        if (((kw0Var == kw0.e ? 4 : 1) & this.b) != 0) {
            return this.a.c(m40Var, kw0Var);
        }
        return 0;
    }

    @Override // defpackage.uo2
    public final int d(m40 m40Var, kw0 kw0Var) {
        if (((kw0Var == kw0.e ? 8 : 2) & this.b) != 0) {
            return this.a.d(m40Var, kw0Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h21)) {
            return false;
        }
        h21 h21Var = (h21) obj;
        return this.a.equals(h21Var.a) && this.b == h21Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = v12.b;
        if ((i & i2) == i2) {
            v12.q(sb3, "Start");
        }
        int i3 = v12.d;
        if ((i & i3) == i3) {
            v12.q(sb3, "Left");
        }
        if ((i & 16) == 16) {
            v12.q(sb3, "Top");
        }
        int i4 = v12.c;
        if ((i & i4) == i4) {
            v12.q(sb3, "End");
        }
        int i5 = v12.e;
        if ((i & i5) == i5) {
            v12.q(sb3, "Right");
        }
        if ((i & 32) == 32) {
            v12.q(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}

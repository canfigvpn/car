package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oo0 {
    public static final oo0 g = new oo0(false, 0, true, 1, 1, q31.g);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final q31 f;

    public oo0(boolean z, int i, boolean z2, int i2, int i3, q31 q31Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = q31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0)) {
            return false;
        }
        oo0 oo0Var = (oo0) obj;
        return this.a == oo0Var.a && this.b == oo0Var.b && this.c == oo0Var.c && this.d == oo0Var.d && this.e == oo0Var.e && ws0.j(this.f, oo0Var.f);
    }

    public final int hashCode() {
        return this.f.e.hashCode() + k3.b(this.e, k3.b(this.d, k3.f(k3.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        int i = this.b;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = i == 3 ? "Sentences" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.c);
        sb.append(", keyboardType=");
        sb.append((Object) bw0.a(this.d));
        sb.append(", imeAction=");
        sb.append((Object) no0.a(this.e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}

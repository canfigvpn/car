package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aw0 {
    public static final aw0 d = new aw0(0, 0, 127);
    public final Boolean a;
    public final int b;
    public final int c;

    public aw0(int i, int i2, int i3) {
        Boolean bool = (i3 & 2) != 0 ? null : Boolean.FALSE;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = bool;
        this.b = i;
        this.c = i2;
    }

    public final oo0 a(boolean z) {
        Boolean bool = this.a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i = this.b;
        bw0 bw0Var = new bw0(i);
        if (i == 0) {
            bw0Var = null;
        }
        int i2 = bw0Var != null ? bw0Var.a : 1;
        int i3 = this.c;
        no0 no0Var = i3 != -1 ? new no0(i3) : null;
        return new oo0(z, 0, zBooleanValue, i2, no0Var != null ? no0Var.a : 1, q31.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw0)) {
            return false;
        }
        aw0 aw0Var = (aw0) obj;
        return ws0.j(this.a, aw0Var.a) && this.b == aw0Var.b && this.c == aw0Var.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(-1) * 31;
        Boolean bool = this.a;
        return k3.b(this.c, k3.b(this.b, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=" + this.a + ", keyboardType=" + ((Object) bw0.a(this.b)) + ", imeAction=" + ((Object) no0.a(this.c)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}

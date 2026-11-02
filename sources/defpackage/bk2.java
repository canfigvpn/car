package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bk2 {
    public final kg0 a;
    public final lh0 b;
    public final int c;
    public final int d;
    public final Object e;

    public bk2(kg0 kg0Var, lh0 lh0Var, int i, int i2, Object obj) {
        this.a = kg0Var;
        this.b = lh0Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk2)) {
            return false;
        }
        bk2 bk2Var = (bk2) obj;
        return ws0.j(this.a, bk2Var.a) && ws0.j(this.b, bk2Var.b) && this.c == bk2Var.c && this.d == bk2Var.d && ws0.j(this.e, bk2Var.e);
    }

    public final int hashCode() {
        kg0 kg0Var = this.a;
        int iB = k3.b(this.d, k3.b(this.c, (((kg0Var == null ? 0 : kg0Var.hashCode()) * 31) + this.b.e) * 31, 31), 31);
        Object obj = this.e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}

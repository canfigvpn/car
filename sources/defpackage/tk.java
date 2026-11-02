package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tk implements ve2 {
    public final sk a;
    public final float b;

    public tk(sk skVar, float f) {
        this.a = skVar;
        this.b = f;
    }

    @Override // defpackage.ve2
    public final float a() {
        return this.b;
    }

    @Override // defpackage.ve2
    public final long b() {
        int i = dr.h;
        return dr.g;
    }

    @Override // defpackage.ve2
    public final rk c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tk) {
            tk tkVar = (tk) obj;
            if (this.a == tkVar.a && Float.compare(this.b, tkVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return k3.k(sb, this.b, ')');
    }
}

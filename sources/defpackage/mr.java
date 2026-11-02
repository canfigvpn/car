package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mr {
    public final String a;
    public final long b;
    public final int c;

    public mr(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            qj.r("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            qj.r("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mr mrVar = (mr) obj;
        if (this.c == mrVar.c && this.a.equals(mrVar.a)) {
            return sv0.Z(this.b, mrVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, mr mrVar);

    public int hashCode() {
        return k3.c(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        long j = this.b;
        if (sv0.Z(j, 12884901888L)) {
            str = "Rgb";
        } else if (sv0.Z(j, 12884901889L)) {
            str = "Xyz";
        } else if (sv0.Z(j, 12884901890L)) {
            str = "Lab";
        } else {
            str = sv0.Z(j, 17179869187L) ? "Cmyk" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}

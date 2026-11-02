package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w60 implements Comparable {
    public final float e;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.e, ((w60) obj).e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w60) {
            return Float.compare(this.e, ((w60) obj).e) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e);
    }

    public final String toString() {
        return c(this.e);
    }
}

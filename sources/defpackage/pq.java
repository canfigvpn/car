package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pq {
    public final float a;

    public pq(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pq)) {
            return false;
        }
        float f = this.a;
        return (0.0f > f && 0.0f > ((pq) obj).a) || f == ((pq) obj).a;
    }

    public final int hashCode() {
        float f = this.a;
        if (0.0f > f) {
            return -1;
        }
        return Float.hashCode(f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}

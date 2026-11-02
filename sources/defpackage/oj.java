package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oj {
    public final float a;
    public final o72 b;

    public oj(float f, o72 o72Var) {
        this.a = f;
        this.b = o72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj)) {
            return false;
        }
        oj ojVar = (oj) obj;
        return w60.b(this.a, ojVar.a) && this.b.equals(ojVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) w60.c(this.a)) + ", brush=" + this.b + ')';
    }
}

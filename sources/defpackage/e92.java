package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e92 implements ub {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof e92) {
            return this.a.equals(((e92) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}

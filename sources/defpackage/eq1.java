package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 {
    public final int a;

    public eq1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eq1) {
            return this.a == ((eq1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}

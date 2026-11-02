package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bh implements dh {
    public final int a;
    public final int b;
    public final boolean c;

    public bh(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        return this.a == bhVar.a && this.b == bhVar.b && this.c == bhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k3.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Success(cars=" + this.a + ", records=" + this.b + ", relaunchNeeded=" + this.c + ")";
    }
}

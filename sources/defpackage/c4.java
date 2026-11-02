package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 extends n02 {
    public final int a;

    public c4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c4) && ((c4) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}

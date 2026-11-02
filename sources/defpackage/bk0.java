package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bk0 implements nv {
    public final kv e;

    public bk0(kv kvVar) {
        this.e = kvVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bk0) {
            return this.e.equals(((bk0) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }
}

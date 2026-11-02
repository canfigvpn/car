package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ou extends IllegalStateException {
    public final String e;

    public ou(String str) {
        this.e = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }
}

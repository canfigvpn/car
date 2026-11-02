package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oq implements AutoCloseable, ez {
    public final uy e;

    public oq(uy uyVar) {
        uyVar.getClass();
        this.e = uyVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mx.p(this.e, null);
    }

    @Override // defpackage.ez
    public final uy h() {
        return this.e;
    }
}

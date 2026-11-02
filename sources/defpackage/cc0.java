package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends dc0 {
    public final Runnable g;

    public cc0(long j, Runnable runnable) {
        super(j);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    @Override // defpackage.dc0
    public final String toString() {
        return super.toString() + this.g;
    }
}

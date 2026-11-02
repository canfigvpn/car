package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vg2 extends mx1 implements Runnable {
    public final long i;

    public vg2(long j, tx txVar) {
        super(txVar, txVar.f());
        this.i = j;
    }

    @Override // defpackage.vt0
    public final String W() {
        return super.W() + "(timeMillis=" + this.i + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx.y(this.g);
        C(new ug2("Timed out waiting for " + this.i + " ms", this));
    }
}

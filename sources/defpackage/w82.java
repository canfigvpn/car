package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w82 implements v82 {
    public final ff e = new ff(0);

    public final boolean f(int i) {
        return (this.e.get() & i) != 0;
    }

    public final void g(int i) {
        ff ffVar;
        int i2;
        do {
            ffVar = this.e;
            i2 = ffVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!ffVar.compareAndSet(i2, i2 | i));
    }
}

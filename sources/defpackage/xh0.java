package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xh0 extends RuntimeException {
    public final yh0 e;
    public final Throwable f;

    public xh0(yh0 yh0Var, Throwable th) {
        super(th);
        this.e = yh0Var;
        this.f = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f;
    }
}

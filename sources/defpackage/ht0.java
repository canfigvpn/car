package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 extends rt0 {
    public static final /* synthetic */ long j = we.a.objectFieldOffset(ht0.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final f i;

    public ht0(f fVar) {
        this.i = fVar;
    }

    @Override // defpackage.rt0
    public final boolean m() {
        return true;
    }

    @Override // defpackage.rt0
    public final void n(Throwable th) {
        if (we.a.compareAndSwapInt(this, j, 0, 1)) {
            this.i.h(th);
        }
    }
}

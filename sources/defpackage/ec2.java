package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ec2 extends dc2 {
    public final Runnable g;

    public ec2(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(j20.s(runnable));
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}

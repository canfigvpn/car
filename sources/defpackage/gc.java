package defpackage;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gc(int i, int i2, Object obj) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        int i2 = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            default:
                ((uc) obj).k(i2);
                break;
        }
    }
}

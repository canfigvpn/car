package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce implements Executor {
    public final /* synthetic */ int e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                de.y().b.c.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}

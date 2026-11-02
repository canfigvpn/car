package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends vv {
    public final /* synthetic */ vv d;
    public final /* synthetic */ ThreadPoolExecutor e;

    public ea0(vv vvVar, ThreadPoolExecutor threadPoolExecutor) {
        this.d = vvVar;
        this.e = threadPoolExecutor;
    }

    @Override // defpackage.vv
    public final void I(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.I(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.vv
    public final void J(e4 e4Var) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.J(e4Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

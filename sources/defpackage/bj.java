package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bj extends s {
    public final Thread h;
    public final ac0 i;

    public bj(uy uyVar, Thread thread, ac0 ac0Var) {
        super(uyVar, true);
        this.h = thread;
        this.i = ac0Var;
    }

    @Override // defpackage.vt0
    public final void x(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.h;
        if (ws0.j(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}

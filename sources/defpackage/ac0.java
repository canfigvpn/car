package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac0 extends xy {
    public static final /* synthetic */ int j = 0;
    public long g;
    public boolean h;
    public le i;

    public final void I(boolean z) {
        long j2 = this.g - (z ? 4294967296L : 1L);
        this.g = j2;
        if (j2 <= 0 && this.h) {
            shutdown();
        }
    }

    public final void J(r50 r50Var) {
        le leVar = this.i;
        if (leVar == null) {
            leVar = new le();
            this.i = leVar;
        }
        leVar.addLast(r50Var);
    }

    public final void K(boolean z) {
        this.g = (z ? 4294967296L : 1L) + this.g;
        if (z) {
            return;
        }
        this.h = true;
    }

    public abstract long L();

    public final boolean M() throws IllegalAccessException, InvocationTargetException {
        le leVar = this.i;
        if (leVar == null) {
            return false;
        }
        r50 r50Var = (r50) (leVar.isEmpty() ? null : leVar.removeFirst());
        if (r50Var == null) {
            return false;
        }
        r50Var.run();
        return true;
    }

    public abstract void shutdown();
}

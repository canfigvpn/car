package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x90 extends vv {
    public final /* synthetic */ y90 d;

    public x90(y90 y90Var) {
        this.d = y90Var;
    }

    @Override // defpackage.vv
    public final void I(Throwable th) {
        this.d.a.f(th);
    }

    @Override // defpackage.vv
    public final void J(e4 e4Var) {
        y90 y90Var = this.d;
        y90Var.c = e4Var;
        e4 e4Var2 = y90Var.c;
        ca0 ca0Var = y90Var.a;
        y90Var.b = new ud(e4Var2, ca0Var.g, ca0Var.i, Build.VERSION.SDK_INT >= 34 ? ia0.a() : rw.y());
        ca0 ca0Var2 = y90Var.a;
        ArrayList arrayList = new ArrayList();
        ca0Var2.a.writeLock().lock();
        try {
            ca0Var2.c = 1;
            arrayList.addAll(ca0Var2.b);
            ca0Var2.b.clear();
            ca0Var2.a.writeLock().unlock();
            ca0Var2.d.post(new im(arrayList, ca0Var2.c, null));
        } catch (Throwable th) {
            ca0Var2.a.writeLock().unlock();
            throw th;
        }
    }
}

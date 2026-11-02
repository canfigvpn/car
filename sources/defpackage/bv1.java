package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bv1 {
    public rx a;
    public uy b;
    public Executor c;
    public wh2 d;
    public t61 e;
    public gt0 f;
    public boolean h;
    public final dq0 g = new dq0(new t4(0, this, bv1.class, "onClosed", "onClosed()V", 0, 7));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            fu1.h("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public List b(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h61.e0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(vv.q((aq) entry.getKey()), entry.getValue());
        }
        return cb0.e;
    }

    public abstract gt0 c();

    public z90 d() {
        throw new we1(0);
    }

    public final gt0 e() {
        gt0 gt0Var = this.f;
        if (gt0Var != null) {
            return gt0Var;
        }
        ws0.U("internalTracker");
        throw null;
    }

    public final ia2 f() {
        t61 t61Var = this.e;
        if (t61Var == null) {
            ws0.U("connectionManager");
            throw null;
        }
        ia2 ia2Var = (ia2) t61Var.g;
        if (ia2Var != null) {
            return ia2Var;
        }
        fu1.h("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set g() {
        return vq.k0(new ArrayList(wq.G(gb0.e, 10)));
    }

    public LinkedHashMap h() {
        int iE0 = h61.e0(wq.G(gb0.e, 10));
        if (iE0 < 16) {
            iE0 = 16;
        }
        return new LinkedHashMap(iE0);
    }

    public final boolean i() {
        t61 t61Var = this.e;
        if (t61Var != null) {
            return ((ia2) t61Var.g) != null;
        }
        ws0.U("connectionManager");
        throw null;
    }

    public final boolean j() {
        return k() && f().z().l();
    }

    public final boolean k() {
        t61 t61Var = this.e;
        if (t61Var == null) {
            ws0.U("connectionManager");
            throw null;
        }
        vh0 vh0Var = (vh0) t61Var.h;
        if (vh0Var != null) {
            return vh0Var.isOpen();
        }
        return false;
    }

    public final Object l(boolean z, ij0 ij0Var, tx txVar) {
        t61 t61Var = this.e;
        if (t61Var != null) {
            return ((gw) t61Var.f).i(z, ij0Var, txVar);
        }
        ws0.U("connectionManager");
        throw null;
    }
}

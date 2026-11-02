package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class un2 {
    public final vn2 a = new vn2();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        vn2 vn2Var = this.a;
        if (vn2Var.d) {
            vn2.a(autoCloseable);
            return;
        }
        synchronized (vn2Var.a) {
            autoCloseable2 = (AutoCloseable) vn2Var.b.put(str, autoCloseable);
        }
        vn2.a(autoCloseable2);
    }

    public final void b() {
        vn2 vn2Var = this.a;
        if (!vn2Var.d) {
            vn2Var.d = true;
            synchronized (vn2Var.a) {
                try {
                    Iterator it = vn2Var.b.values().iterator();
                    while (it.hasNext()) {
                        vn2.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = vn2Var.c.iterator();
                    while (it2.hasNext()) {
                        vn2.a((AutoCloseable) it2.next());
                    }
                    vn2Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        vn2 vn2Var = this.a;
        synchronized (vn2Var.a) {
            autoCloseable = (AutoCloseable) vn2Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}

package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jd1 {
    public vv a;
    public boolean b;
    public e4 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(hd1 hd1Var);

    public abstract void d(hd1 hd1Var);

    public final void e() {
        e4 e4Var = this.c;
        if (e4Var == null || !((LinkedHashSet) e4Var.g).remove(this)) {
            return;
        }
        md1 md1Var = (md1) e4Var.f;
        if (equals(md1Var.f)) {
            if (md1Var.g == -1) {
                a();
            }
            md1Var.f = null;
            md1Var.g = 0;
            md1Var.h = null;
        }
        md1Var.d.remove(this);
        md1Var.e.remove(this);
        this.c = null;
        md1Var.b();
    }

    public final void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        e4 e4Var = this.c;
        if (e4Var != null) {
            ((md1) e4Var.f).b();
        }
    }
}

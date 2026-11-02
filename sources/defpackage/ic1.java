package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 {
    public final Context a;
    public final rb1 b;
    public final b7 c;
    public final Activity d;
    public boolean e;
    public final ag f;
    public final boolean g;

    public ic1(Context context) {
        context.getClass();
        this.a = context;
        this.b = new rb1(this, new cb1(this, 7));
        this.c = new b7(context, (byte) 0);
        for (Object obj : o12.t(context, new o01(12))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new ag(1, this);
                this.g = true;
                rd1 rd1Var = this.b.s;
                rd1Var.a(new hc1(rd1Var));
                this.b.s.a(new h2(this.a));
                new hb2(new cb1(this, 8));
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new ag(1, this);
        this.g = true;
        rd1 rd1Var2 = this.b.s;
        rd1Var2.a(new hc1(rd1Var2));
        this.b.s.a(new h2(this.a));
        new hb2(new cb1(this, 8));
    }

    public static void a(ic1 ic1Var, Object obj) {
        ic1Var.getClass();
        ic1Var.b.l(obj, null);
    }

    public final void b() {
        rb1 rb1Var = this.b;
        if (rb1Var.f.isEmpty()) {
            return;
        }
        zb1 zb1VarF = rb1Var.f();
        zb1VarF.getClass();
        if (rb1Var.m(zb1VarF.f.a, true, false)) {
            rb1Var.b();
        }
    }
}

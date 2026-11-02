package defpackage;

import android.content.Context;
import android.os.Build;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 implements zk0 {
    public static boolean f = true;
    public final e5 a;
    public final Object b = new Object();
    public tn2 c;
    public boolean d;
    public final d7 e;

    public f7(e5 e5Var) {
        this.a = e5Var;
        d7 d7Var = new d7();
        this.e = d7Var;
        if (e5Var.isAttachedToWindow()) {
            Context context = e5Var.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(d7Var);
                this.d = true;
            }
        }
        e5Var.addOnAttachStateChangeListener(new e7(0, this));
    }

    @Override // defpackage.zk0
    public final void a(al0 al0Var) {
        synchronized (this.b) {
            if (!al0Var.s) {
                al0Var.s = true;
                al0Var.b();
            }
        }
    }

    @Override // defpackage.zk0
    public final al0 b() {
        cl0 jl0Var;
        cl0 hl0Var;
        al0 al0Var;
        synchronized (this.b) {
            try {
                e5 e5Var = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    e5Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    hl0Var = new hl0();
                } else {
                    if (f) {
                        try {
                            jl0Var = new fl0(this.a, new vm(), new um());
                        } catch (Throwable unused) {
                            f = false;
                            jl0Var = new jl0(c(this.a));
                        }
                    } else {
                        jl0Var = new jl0(c(this.a));
                    }
                    hl0Var = jl0Var;
                }
                al0Var = new al0(hl0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return al0Var;
    }

    public final i80 c(e5 e5Var) {
        tn2 tn2Var = this.c;
        if (tn2Var != null) {
            return tn2Var;
        }
        tn2 tn2Var2 = new tn2(e5Var.getContext());
        tn2Var2.setClipChildren(false);
        tn2Var2.setClipToPadding(false);
        tn2Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        e5Var.addView(tn2Var2, -1);
        this.c = tn2Var2;
        return tn2Var2;
    }
}

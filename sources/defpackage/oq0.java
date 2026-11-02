package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 extends vo2 implements Runnable, ag1, View.OnAttachStateChangeListener {
    public final fq2 g;
    public boolean h;
    public boolean i;
    public aq2 j;

    public oq0(fq2 fq2Var) {
        super(!fq2Var.s ? 1 : 0);
        this.g = fq2Var;
    }

    @Override // defpackage.ag1
    public final aq2 a(View view, aq2 aq2Var) {
        this.j = aq2Var;
        fq2 fq2Var = this.g;
        dm2 dm2Var = fq2Var.q;
        xp2 xp2Var = aq2Var.a;
        dm2Var.f(y12.v(xp2Var.h(8)));
        if (this.h) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.i) {
            fq2Var.r.f(y12.v(xp2Var.h(8)));
            fq2.b(fq2Var, aq2Var);
        }
        return fq2Var.s ? aq2.b : aq2Var;
    }

    @Override // defpackage.vo2
    public final void b(fp2 fp2Var) {
        this.h = false;
        this.i = false;
        aq2 aq2Var = this.j;
        if (fp2Var.a.b() > 0 && aq2Var != null) {
            xp2 xp2Var = aq2Var.a;
            fq2 fq2Var = this.g;
            fq2Var.r.f(y12.v(xp2Var.h(8)));
            fq2Var.q.f(y12.v(xp2Var.h(8)));
            fq2.b(fq2Var, aq2Var);
        }
        this.j = null;
    }

    @Override // defpackage.vo2
    public final void c(fp2 fp2Var) {
        this.h = true;
        this.i = true;
    }

    @Override // defpackage.vo2
    public final aq2 d(aq2 aq2Var, List list) {
        fq2 fq2Var = this.g;
        fq2.b(fq2Var, aq2Var);
        return fq2Var.s ? aq2.b : aq2Var;
    }

    @Override // defpackage.vo2
    public final ru1 e(fp2 fp2Var, ru1 ru1Var) {
        this.h = false;
        return ru1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            this.h = false;
            this.i = false;
            aq2 aq2Var = this.j;
            if (aq2Var != null) {
                fq2 fq2Var = this.g;
                fq2Var.r.f(y12.v(aq2Var.a.h(8)));
                fq2.b(fq2Var, aq2Var);
                this.j = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

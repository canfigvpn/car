package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cr2 implements kv, w11 {
    public final e5 e;
    public final qv f;
    public boolean g;
    public b21 h;
    public gt i = bu.a;

    public cr2(e5 e5Var, qv qvVar) {
        this.e = e5Var;
        this.f = qvVar;
    }

    public final void a() {
        if (!this.g) {
            this.g = true;
            this.e.getView().setTag(R.id.wrapped_composition_tag, null);
            b21 b21Var = this.h;
            if (b21Var != null) {
                b21Var.f(this);
            }
            this.h = null;
        }
        this.f.m();
    }

    public final void c(ij0 ij0Var) {
        this.e.setOnReadyForComposition(new i8(8, this, (gt) ij0Var));
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) {
        if (q11Var == q11.ON_DESTROY) {
            a();
        } else {
            if (q11Var != q11.ON_CREATE || this.g) {
                return;
            }
            c(this.i);
        }
    }
}

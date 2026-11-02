package defpackage;

import android.text.InputFilter;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 extends ex {
    public final sa0 d;

    public ta0(dd ddVar) {
        this.d = new sa0(ddVar);
    }

    @Override // defpackage.ex
    public final void M(boolean z) {
        if (ca0.d()) {
            this.d.M(z);
        }
    }

    @Override // defpackage.ex
    public final void N(boolean z) {
        boolean zD = ca0.d();
        sa0 sa0Var = this.d;
        if (zD) {
            sa0Var.N(z);
        } else {
            sa0Var.f = z;
        }
    }

    @Override // defpackage.ex
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        return !ca0.d() ? inputFilterArr : this.d.v(inputFilterArr);
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bs1;
import defpackage.ei1;
import defpackage.k3;
import defpackage.qj;
import defpackage.vv;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends vv {
    public final int d;
    public final ei1 e;
    public final boolean f;
    public boolean g = false;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = 1;
        this.f = false;
        bs1 bs1VarS = vv.s(context, attributeSet, i, i2);
        int i3 = bs1VarS.a;
        if (i3 != 0 && i3 != 1) {
            qj.r(k3.i("invalid orientation:", i3));
            throw null;
        }
        if (i3 != this.d || this.e == null) {
            this.e = ei1.o(this, i3);
            this.d = i3;
        }
        boolean z = bs1VarS.c;
        if (z != this.f) {
            this.f = z;
        }
        T(bs1VarS.d);
    }

    public void T(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
    }
}

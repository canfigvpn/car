package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class tp2 extends sp2 {
    public static final aq2 v = aq2.c(WindowInsets.CONSUMED, null);

    public tp2(aq2 aq2Var, WindowInsets windowInsets) {
        super(aq2Var, windowInsets);
    }

    @Override // defpackage.op2, defpackage.xp2
    public kq0 h(int i) {
        return kq0.c(this.c.getInsets(yp2.a(i)));
    }

    @Override // defpackage.op2, defpackage.xp2
    public kq0 i(int i) {
        return kq0.c(this.c.getInsetsIgnoringVisibility(yp2.a(i)));
    }

    @Override // defpackage.op2, defpackage.xp2
    public boolean t(int i) {
        return this.c.isVisible(yp2.a(i));
    }

    @Override // defpackage.op2, defpackage.xp2
    public final void d(View view) {
    }
}

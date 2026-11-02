package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class vp2 extends up2 {
    public static final aq2 w = aq2.c(WindowInsets.CONSUMED, null);

    public vp2(aq2 aq2Var, WindowInsets windowInsets) {
        super(aq2Var, windowInsets);
    }

    @Override // defpackage.tp2, defpackage.op2, defpackage.xp2
    public kq0 h(int i) {
        return kq0.c(this.c.getInsets(zp2.a(i)));
    }

    @Override // defpackage.tp2, defpackage.op2, defpackage.xp2
    public kq0 i(int i) {
        return kq0.c(this.c.getInsetsIgnoringVisibility(zp2.a(i)));
    }

    @Override // defpackage.tp2, defpackage.op2, defpackage.xp2
    public boolean t(int i) {
        return this.c.isVisible(zp2.a(i));
    }

    @Override // defpackage.op2, defpackage.xp2
    public void o(View view) {
    }
}

package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 extends vp2 {
    public wp2(aq2 aq2Var, WindowInsets windowInsets) {
        super(aq2Var, windowInsets);
    }

    @Override // defpackage.op2, defpackage.xp2
    public List<Rect> e(int i) {
        return this.c.getBoundingRects(zp2.a(i));
    }

    @Override // defpackage.op2, defpackage.xp2
    public List<Rect> f(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(zp2.a(i));
    }

    @Override // defpackage.op2, defpackage.xp2
    public void p() {
    }
}

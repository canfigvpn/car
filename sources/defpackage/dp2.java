package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dp2 extends ep2 {
    public final WindowInsetsAnimation e;

    public dp2(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.ep2
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.ep2
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.ep2
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.ep2
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.ep2
    public final void e(float f) {
        this.e.setFraction(f);
    }
}

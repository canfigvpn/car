package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wm1 implements sm1 {
    public static final wm1 a = new wm1();

    @Override // defpackage.sm1
    public final boolean a() {
        return true;
    }

    @Override // defpackage.sm1
    public final rm1 b(View view, boolean z, long j, float f, float f2, boolean z2, m40 m40Var, float f3) {
        if (z) {
            return new vm1(new Magnifier(view));
        }
        long jY = m40Var.Y(j);
        float fX = m40Var.x(f);
        float fX2 = m40Var.x(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jY != 9205357640488583168L) {
            builder.setSize(p61.j0(Float.intBitsToFloat((int) (jY >> 32))), p61.j0(Float.intBitsToFloat((int) (jY & 4294967295L))));
        }
        if (!Float.isNaN(fX)) {
            builder.setCornerRadius(fX);
        }
        if (!Float.isNaN(fX2)) {
            builder.setElevation(fX2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new vm1(builder.build());
    }
}

package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class um1 implements sm1 {
    public static final um1 a = new um1();

    @Override // defpackage.sm1
    public final boolean a() {
        return false;
    }

    @Override // defpackage.sm1
    public final rm1 b(View view, boolean z, long j, float f, float f2, boolean z2, m40 m40Var, float f3) {
        return new tm1(new Magnifier(view));
    }
}

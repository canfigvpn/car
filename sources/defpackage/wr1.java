package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wr1 implements rw1 {
    public final LinkedHashSet a = new LinkedHashSet();

    public wr1(ru1 ru1Var) {
        ru1Var.o("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.rw1
    public final Bundle a() {
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        ex.G(bundleW, "classes_to_restore", vq.h0(this.a));
        return bundleW;
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ow1 implements rw1 {
    public final ru1 a;
    public boolean b;
    public Bundle c;
    public final hb2 d;

    public ow1(ru1 ru1Var, co2 co2Var) {
        ru1Var.getClass();
        this.a = ru1Var;
        this.d = new hb2(new w8(26, co2Var));
    }

    @Override // defpackage.rw1
    public final Bundle a() {
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleW.putAll(bundle);
        }
        for (Map.Entry entry : ((pw1) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((us) ((kw1) entry.getValue()).b.i).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleW.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleW;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleG = this.a.g("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleW.putAll(bundle);
        }
        if (bundleG != null) {
            bundleW.putAll(bundleG);
        }
        this.c = bundleW;
        this.b = true;
    }
}

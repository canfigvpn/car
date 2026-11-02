package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jw1 implements gw1, tw1 {
    public final /* synthetic */ hw1 e;
    public b21 f;
    public ru1 g;

    public jw1(hw1 hw1Var) {
        this.e = hw1Var;
        Object objF = hw1Var.f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null && this.g == null) {
            ru1 ru1Var = new ru1(new sw1(this, new w8(27, this)), 3);
            this.g = ru1Var;
            ru1Var.m(bundle);
        }
        hw1Var.a("androidx.savedstate.SavedStateRegistry", new w8(25, this));
    }

    @Override // defpackage.gw1
    public final ud a(String str, ti0 ti0Var) {
        return this.e.a(str, ti0Var);
    }

    @Override // defpackage.tw1
    public final ru1 c() {
        ru1 ru1Var = this.g;
        if (ru1Var == null) {
            ru1 ru1Var2 = new ru1(new sw1(this, new w8(27, this)), 3);
            this.g = ru1Var2;
            ru1Var2.m(null);
            ru1Var = ru1Var2;
        }
        return (ru1) ru1Var.c;
    }

    @Override // defpackage.gw1
    public final boolean d(Object obj) {
        return this.e.d(obj);
    }

    @Override // defpackage.gw1
    public final Map e() {
        return this.e.e();
    }

    @Override // defpackage.gw1
    public final Object f(String str) {
        return this.e.f(str);
    }

    @Override // defpackage.y11
    public final b21 h() {
        b21 b21Var = this.f;
        if (b21Var != null) {
            return b21Var;
        }
        b21 b21Var2 = new b21(this, false);
        this.f = b21Var2;
        return b21Var2;
    }
}

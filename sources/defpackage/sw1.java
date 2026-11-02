package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 {
    public final tw1 a;
    public final w8 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final iq1 c = new iq1(19);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public sw1(tw1 tw1Var, w8 w8Var) {
        this.a = tw1Var;
        this.b = w8Var;
    }

    public final void a() {
        tw1 tw1Var = this.a;
        if (tw1Var.h().h != r11.f) {
            fu1.h("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                fu1.h("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            tw1Var.h().a(new q1(2, this));
            this.e = true;
        }
    }
}

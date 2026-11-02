package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class qp2 extends pp2 {
    public qp2(aq2 aq2Var, WindowInsets windowInsets) {
        super(aq2Var, windowInsets);
    }

    @Override // defpackage.xp2
    public aq2 a() {
        return aq2.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.op2, defpackage.xp2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp2)) {
            return false;
        }
        qp2 qp2Var = (qp2) obj;
        return Objects.equals(this.c, qp2Var.c) && Objects.equals(this.g, qp2Var.g) && op2.L(this.h, qp2Var.h);
    }

    @Override // defpackage.xp2
    public w50 g() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new w50(displayCutout);
    }

    @Override // defpackage.xp2
    public int hashCode() {
        return this.c.hashCode();
    }
}

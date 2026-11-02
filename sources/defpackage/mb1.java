package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mb1 {
    public final kb1 a;
    public final zb1 b;
    public final Bundle c;
    public r11 d;
    public final sb1 e;
    public final String f;
    public final Bundle g;
    public final ru1 h;
    public boolean i;
    public final b21 j;
    public r11 k;
    public final uw1 l;
    public final hb2 m;

    public mb1(kb1 kb1Var) {
        this.a = kb1Var;
        this.b = kb1Var.f;
        this.c = kb1Var.g;
        this.d = kb1Var.h;
        this.e = kb1Var.i;
        this.f = kb1Var.j;
        this.g = kb1Var.k;
        this.h = new ru1(new sw1(kb1Var, new w8(27, kb1Var)), 3);
        hb2 hb2Var = new hb2(new vr0(16));
        this.j = new b21(kb1Var, true);
        this.k = r11.f;
        this.l = (uw1) hb2Var.getValue();
        this.m = new hb2(new vr0(17));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        bundleW.putAll(bundle);
        return bundleW;
    }

    public final void b() {
        if (!this.i) {
            ru1 ru1Var = this.h;
            ((sw1) ru1Var.b).a();
            this.i = true;
            if (this.e != null) {
                sv0.Y(this.a);
            }
            ru1Var.m(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        b21 b21Var = this.j;
        if (iOrdinal >= iOrdinal2) {
            r11 r11Var = this.k;
            b21Var.c("setCurrentState");
            b21Var.e(r11Var);
        } else {
            r11 r11Var2 = this.d;
            r11Var2.getClass();
            b21Var.c("setCurrentState");
            b21Var.e(r11Var2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(js1.a(kb1.class).c());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}

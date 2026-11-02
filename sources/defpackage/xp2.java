package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class xp2 {
    public static final aq2 b;
    public final aq2 a;

    static {
        np2 hp2Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            hp2Var = new mp2();
        } else if (i >= 35) {
            hp2Var = new lp2();
        } else if (i >= 34) {
            hp2Var = new kp2();
        } else if (i >= 31) {
            hp2Var = new jp2();
        } else if (i >= 30) {
            hp2Var = new ip2();
        } else {
            hp2Var = i >= 29 ? new hp2() : new gp2();
        }
        b = hp2Var.b().a.a().a.b().a.c();
    }

    public xp2(aq2 aq2Var) {
        this.a = aq2Var;
    }

    public aq2 a() {
        return this.a;
    }

    public aq2 b() {
        return this.a;
    }

    public aq2 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp2)) {
            return false;
        }
        xp2 xp2Var = (xp2) obj;
        return s() == xp2Var.s() && r() == xp2Var.r() && Objects.equals(m(), xp2Var.m()) && Objects.equals(k(), xp2Var.k()) && Objects.equals(g(), xp2Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public w50 g() {
        return null;
    }

    public kq0 h(int i) {
        return kq0.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public kq0 i(int i) {
        if ((i & 8) == 0) {
            return kq0.e;
        }
        qj.r("Unable to query the maximum insets for IME");
        return null;
    }

    public kq0 j() {
        return m();
    }

    public kq0 k() {
        return kq0.e;
    }

    public kq0 l() {
        return m();
    }

    public kq0 m() {
        return kq0.e;
    }

    public kq0 n() {
        return m();
    }

    public aq2 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(z50 z50Var) {
    }

    public void v(kq0[] kq0VarArr) {
    }

    public void w(aq2 aq2Var) {
    }

    public void x(kq0 kq0Var) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}

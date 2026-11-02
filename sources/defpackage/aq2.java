package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aq2 {
    public static final aq2 b;
    public final xp2 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = vp2.w;
        } else if (i >= 30) {
            b = tp2.v;
        } else {
            b = xp2.b;
        }
    }

    public aq2(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new wp2(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new vp2(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new up2(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new tp2(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new sp2(this, windowInsets);
        } else if (i >= 28) {
            this.a = new qp2(this, windowInsets);
        } else {
            this.a = new pp2(this, windowInsets);
        }
    }

    public static kq0 a(kq0 kq0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, kq0Var.a - i);
        int iMax2 = Math.max(0, kq0Var.b - i2);
        int iMax3 = Math.max(0, kq0Var.c - i3);
        int iMax4 = Math.max(0, kq0Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? kq0Var : kq0.b(iMax, iMax2, iMax3, iMax4);
    }

    public static aq2 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        aq2 aq2Var = new aq2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = ln2.a;
            aq2 aq2VarA = gn2.a(view);
            xp2 xp2Var = aq2Var.a;
            xp2Var.w(aq2VarA);
            View rootView = view.getRootView();
            xp2Var.d(rootView);
            xp2Var.o(rootView);
            xp2Var.p();
            xp2Var.y(view.getWindowSystemUiVisibility());
        }
        return aq2Var;
    }

    public final WindowInsets b() {
        xp2 xp2Var = this.a;
        if (xp2Var instanceof op2) {
            return ((op2) xp2Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aq2) {
            return Objects.equals(this.a, ((aq2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        xp2 xp2Var = this.a;
        if (xp2Var == null) {
            return 0;
        }
        return xp2Var.hashCode();
    }

    public aq2() {
        this.a = new xp2(this);
    }
}

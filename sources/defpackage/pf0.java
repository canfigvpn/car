package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pf0 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final yr1 a(View view, e5 e5Var) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        e5Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = b;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new yr1(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    public static final lf0 b(int i) {
        if (i == 1) {
            return new lf0(2);
        }
        if (i == 2) {
            return new lf0(1);
        }
        if (i == 17) {
            return new lf0(3);
        }
        if (i == 33) {
            return new lf0(5);
        }
        if (i == 66) {
            return new lf0(4);
        }
        if (i != 130) {
            return null;
        }
        return new lf0(6);
    }
}

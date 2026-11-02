package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i90 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static p90 c;

    public static final void a(bt btVar, ib2 ib2Var, ib2 ib2Var2) {
        View decorView = btVar.getWindow().getDecorView();
        decorView.getClass();
        p90 k90Var = c;
        if (k90Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                k90Var = new o90();
            } else if (i >= 30) {
                k90Var = new n90();
            } else if (i >= 29) {
                k90Var = new m90();
            } else if (i >= 28) {
                k90Var = new l90();
            } else {
                k90Var = i >= 26 ? new k90() : new j90();
            }
            c = k90Var;
        }
        p90 p90Var = k90Var;
        di diVar = new di(p90Var, ib2Var, ib2Var2, btVar, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                h90 h90Var = new h90(diVar, viewGroup.getContext());
                h90Var.setTag(p90Var);
                h90Var.setVisibility(8);
                h90Var.setWillNotDraw(true);
                viewGroup.addView(h90Var);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof p90) {
                break;
            } else {
                i2 = i3;
            }
        }
        diVar.run();
        Window window = btVar.getWindow();
        window.getClass();
        p90Var.a(window);
    }
}

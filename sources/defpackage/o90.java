package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o90 extends n90 {
    @Override // defpackage.m90, defpackage.k90, defpackage.p90
    public void b(ib2 ib2Var, ib2 ib2Var2, Window window, View view, boolean z, boolean z2) {
        j12 cq2Var;
        ib2Var.getClass();
        ib2Var2.getClass();
        window.getClass();
        view.getClass();
        r02.q(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof ir)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            cq2Var = new eq2(window);
        } else if (i3 >= 30) {
            cq2Var = new dq2(window);
        } else {
            cq2Var = i3 >= 26 ? new cq2(window) : new bq2(window);
        }
        cq2Var.m(!z);
        cq2Var.l(true ^ z2);
    }
}

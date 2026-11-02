package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cp2 extends WindowInsetsAnimation$Callback {
    public final vo2 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public cp2(vo2 vo2Var) {
        super(vo2Var.f);
        this.d = new HashMap();
        this.a = vo2Var;
    }

    public final fp2 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        fp2 fp2Var = (fp2) map.get(windowInsetsAnimation);
        if (fp2Var != null) {
            return fp2Var;
        }
        fp2 fp2Var2 = new fp2(0, null, 0L);
        fp2Var2.a = new dp2(windowInsetsAnimation);
        map.put(windowInsetsAnimation, fp2Var2);
        return fp2Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationI = c1.i(list.get(size));
            fp2 fp2VarA = a(windowInsetsAnimationI);
            fp2VarA.a.e(windowInsetsAnimationI.getFraction());
            this.c.add(fp2VarA);
        }
        return this.a.d(aq2.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ru1 ru1VarE = this.a.e(a(windowInsetsAnimation), new ru1(bounds));
        ru1VarE.getClass();
        c1.m();
        return c1.g(((kq0) ru1VarE.b).d(), ((kq0) ru1VarE.c).d());
    }
}

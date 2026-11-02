package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class en2 implements View.OnApplyWindowInsetsListener {
    public aq2 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ ag1 c;

    public en2(View view, ag1 ag1Var) {
        this.b = view;
        this.c = ag1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        aq2 aq2VarC = aq2.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        ag1 ag1Var = this.c;
        if (i < 30) {
            fn2.a(windowInsets, this.b);
            if (aq2VarC.equals(this.a)) {
                return ag1Var.a(view, aq2VarC).b();
            }
        }
        this.a = aq2VarC;
        aq2 aq2VarA = ag1Var.a(view, aq2VarC);
        if (i >= 30) {
            return aq2VarA.b();
        }
        Field field = ln2.a;
        view.requestApplyInsets();
        return aq2VarA.b();
    }
}

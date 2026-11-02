package defpackage;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 implements yl0 {
    public final View a;

    public om1(View view) {
        this.a = view;
    }

    public final void a() {
        Field field = ln2.a;
        int i = Build.VERSION.SDK_INT < 27 ? -1 : 9;
        if (i == -1) {
            return;
        }
        this.a.performHapticFeedback(i);
    }
}

package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 extends dw0 implements ti0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ e5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4(e5 e5Var, int i) {
        super(0);
        this.f = i;
        this.g = e5Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int actionMasked;
        int i = this.f;
        e5 e5Var = this.g;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) e5Var.u.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = e5Var.getConfiguration().getLocales();
                r31 r31Var = new r31(new s31(locales));
                if (locales.isEmpty()) {
                    r31Var = new r31(new s31(LocaleList.getDefault()));
                }
                LocaleList localeList = r31Var.a.a;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = localeList.get(i2);
                    locale.getClass();
                    arrayList.add(new p31(locale));
                }
                return new q31(arrayList);
            case 2:
                MotionEvent motionEvent = e5Var.z0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    e5Var.A0 = SystemClock.uptimeMillis();
                    e5Var.post(e5Var.F0);
                }
                return ll2.a;
            default:
                e5Var.get_viewTreeOwners();
                return null;
        }
    }
}

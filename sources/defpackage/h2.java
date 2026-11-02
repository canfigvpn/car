package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@pd1("activity")
public class h2 extends qd1 {
    public final Activity c;

    public h2(Context context) {
        context.getClass();
        for (Object obj : o12.t(context, new s1(2))) {
            if (((Context) obj) instanceof Activity) {
                this.c = (Activity) obj;
            }
        }
        obj = null;
        this.c = (Activity) obj;
    }

    @Override // defpackage.qd1
    public final zb1 a() {
        return new g2(this);
    }

    @Override // defpackage.qd1
    public final zb1 c(zb1 zb1Var) {
        throw new IllegalStateException(("Destination " + ((g2) zb1Var).f.a + " does not have an Intent set.").toString());
    }

    @Override // defpackage.qd1
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}

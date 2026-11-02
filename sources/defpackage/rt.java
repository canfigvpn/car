package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt implements lj0 {
    public final /* synthetic */ int e;

    public /* synthetic */ rt(int i) {
        this.e = i;
    }

    @Override // defpackage.lj0
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                ad2 ad2Var = (ad2) obj;
                nc2 nc2Var = (nc2) obj2;
                ti0 ti0Var = (ti0) obj3;
                ak0 ak0Var = (ak0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ak0Var.f(ad2Var) : ak0Var.h(ad2Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? ak0Var.f(nc2Var) : ak0Var.h(nc2Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= ak0Var.h(ti0Var) ? 256 : 128;
                }
                if (!ak0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
                    ak0Var.R();
                } else {
                    v30.c(ad2Var, nc2Var, ti0Var, ak0Var, i2 & 1022);
                }
                break;
            case 1:
                ad2 ad2Var2 = (ad2) obj;
                nc2 nc2Var2 = (nc2) obj2;
                ti0 ti0Var2 = (ti0) obj3;
                ak0 ak0Var2 = (ak0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ak0Var2.f(ad2Var2) : ak0Var2.h(ad2Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? ak0Var2.f(nc2Var2) : ak0Var2.h(nc2Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= ak0Var2.h(ti0Var2) ? 256 : 128;
                }
                if (!ak0Var2.O(i3 & 1, (i3 & 1171) != 1170)) {
                    ak0Var2.R();
                } else {
                    v30.c(ad2Var2, nc2Var2, ti0Var2, ak0Var2, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((of2) obj5).a;
                String string = ((CharSequence) obj4).subSequence(of2.f(j), of2.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return ll2Var;
    }
}

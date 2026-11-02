package defpackage;

import android.content.Intent;
import android.net.Uri;
import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends sv0 {
    public final /* synthetic */ int n0;

    public /* synthetic */ k2(int i) {
        this.n0 = i;
    }

    @Override // defpackage.sv0
    public final Intent V(MainActivity mainActivity, Object obj) {
        switch (this.n0) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType("application/json").putExtra("android.intent.extra.TITLE", str);
                intentPutExtra.getClass();
                return intentPutExtra;
            default:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
        }
    }

    @Override // defpackage.sv0
    public final void f0(MainActivity mainActivity, Object obj) {
        switch (this.n0) {
            case 0:
                ((String) obj).getClass();
                break;
            default:
                ((String[]) obj).getClass();
                break;
        }
    }

    @Override // defpackage.sv0
    public final Uri l0(Intent intent, int i) {
        switch (this.n0) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            default:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
        }
    }
}

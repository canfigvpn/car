package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb1 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;

    public /* synthetic */ vb1(Bundle bundle, int i) {
        this.e = i;
        this.f = bundle;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        boolean zContainsKey;
        int i = this.e;
        Bundle bundle = this.f;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}

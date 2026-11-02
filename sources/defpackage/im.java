package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class im implements Runnable {
    public final /* synthetic */ int e = 1;
    public final int f;
    public final Object g;

    public im(List list, int i, Throwable th) {
        mx.q(list, "initCallbacks cannot be null");
        this.g = new ArrayList(list);
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        int i2 = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                uc ucVar = (uc) ((qk1) obj).f;
                if (ucVar != null) {
                    ucVar.k(i2);
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((aa0) arrayList.get(i3)).b();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((aa0) arrayList.get(i3)).a();
                        i3++;
                    }
                }
                break;
        }
    }

    public im(qk1 qk1Var, int i) {
        this.g = qk1Var;
        this.f = i;
    }
}

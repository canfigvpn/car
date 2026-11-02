package defpackage;

import ir.alirezaivaz.mygarage.MainActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p2 implements c82 {
    public final /* synthetic */ Object e;

    public /* synthetic */ p2(Object obj) {
        this.e = obj;
    }

    public void a() {
        ij0 ij0Var = (ij0) this.e;
        synchronized (x62.c) {
            List list = x62.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(wq.G(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && ws0.j(obj, ij0Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            x62.h = arrayList;
        }
    }

    @Override // defpackage.c82
    public boolean b() {
        return !((Boolean) ((q51) ((MainActivity) this.e).B.getValue()).b.e.getValue()).booleanValue();
    }
}

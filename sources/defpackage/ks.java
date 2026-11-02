package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (ej0 ej0Var : (ej0[]) obj3) {
                    int iD = s5.D((Comparable) ej0Var.h(obj), (Comparable) ej0Var.h(obj2));
                    if (iD != 0) {
                        return iD;
                    }
                }
                return 0;
            default:
                return ((Number) ((ij0) obj3).g(obj, obj2)).intValue();
        }
    }
}

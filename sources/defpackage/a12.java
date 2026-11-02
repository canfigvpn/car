package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a12 implements Comparator {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Comparator b;

    public a12(a12 a12Var) {
        this.b = a12Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Comparator comparator = this.b;
        switch (i) {
            case 0:
                int iCompare = comparator.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return ax0.U.compare(((p02) obj).c, ((p02) obj2).c);
            default:
                int iCompare2 = ((a12) comparator).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : s5.D(Integer.valueOf(((p02) obj).f), Integer.valueOf(((p02) obj2).f));
        }
    }

    public a12(Comparator comparator) {
        this.b = comparator;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 extends xw0 {
    public static final gv1 c = new gv1("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv1(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                db0 db0Var = db0.e;
                if (size == 0) {
                    return y61Var.d0(sw.j(j), sw.i(j), db0Var, je1.s);
                }
                if (size == 1) {
                    jm1 jm1VarE = ((r61) list.get(0)).e(j);
                    return y61Var.d0(tw.g(jm1VarE.e, j), tw.f(jm1VarE.f, j), db0Var, new q4(jm1VarE, 6));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    jm1 jm1VarE2 = ((r61) list.get(i)).e(j);
                    iMax = Math.max(jm1VarE2.e, iMax);
                    iMax2 = Math.max(jm1VarE2.f, iMax2);
                    arrayList.add(jm1VarE2);
                }
                return y61Var.d0(tw.g(iMax, j), tw.f(iMax2, j), db0Var, new m6(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}

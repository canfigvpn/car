package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 implements kj0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ ls0 f;

    public js0(List list, ls0 ls0Var) {
        this.e = list;
        this.f = ls0Var;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        vy0 vy0Var = (vy0) obj;
        int iIntValue = ((Number) obj2).intValue();
        ak0 ak0Var = (ak0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (ak0Var.f(vy0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ak0Var.d(iIntValue) ? 32 : 16;
        }
        if (ak0Var.O(i & 1, (i & 147) != 146)) {
            es0 es0Var = (es0) this.e.get(iIntValue);
            ak0Var.W(1090700072);
            ls0 ls0Var = this.f;
            boolean zH = ak0Var.h(ls0Var);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                f fVar = new f(1, ls0Var, ls0.class, "updateSchedule", "updateSchedule(Lir/alirezaivaz/mygarage/domain/model/ServiceSchedule;)V", 0, 12);
                ak0Var.g0(fVar);
                objL = fVar;
            }
            p61.i(es0Var, (ej0) ((tj0) objL), ak0Var, 0);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

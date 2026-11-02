package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zn extends wa2 implements jj0 {
    public final /* synthetic */ int i;
    public /* synthetic */ List j;
    public /* synthetic */ Long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn(int i, sx sxVar, int i2) {
        super(i, sxVar);
        this.i = i2;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        int i2 = 3;
        List list = (List) obj;
        Long l = (Long) obj2;
        sx sxVar = (sx) obj3;
        switch (i) {
            case 0:
                zn znVar = new zn(i2, sxVar, 0);
                znVar.j = list;
                znVar.k = l;
                return znVar.r(ll2Var);
            case 1:
                zn znVar2 = new zn(i2, sxVar, 1);
                znVar2.j = list;
                znVar2.k = l;
                return znVar2.r(ll2Var);
            case 2:
                zn znVar3 = new zn(i2, sxVar, 2);
                znVar3.j = list;
                znVar3.k = l;
                return znVar3.r(ll2Var);
            default:
                zn znVar4 = new zn(i2, sxVar, i2);
                znVar4.j = list;
                znVar4.k = l;
                return znVar4.r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        switch (this.i) {
            case 0:
                List list = this.j;
                Long l = this.k;
                ix.Q(obj);
                return new yn(list, ex.K(list, l));
            case 1:
                List list2 = this.j;
                Long l2 = this.k;
                ix.Q(obj);
                return ex.K(list2, l2);
            case 2:
                List list3 = this.j;
                Long l3 = this.k;
                ix.Q(obj);
                return ex.K(list3, l3);
            default:
                List list4 = this.j;
                Long l4 = this.k;
                ix.Q(obj);
                return ex.K(list4, l4);
        }
    }
}

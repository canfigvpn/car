package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pa extends dw0 implements ij0 {
    public final /* synthetic */ ki2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ej0 h;
    public final /* synthetic */ ab i;
    public final /* synthetic */ h72 j;
    public final /* synthetic */ gt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(ki2 ki2Var, Object obj, ej0 ej0Var, ab abVar, h72 h72Var, gt gtVar) {
        super(2);
        this.f = ki2Var;
        this.g = obj;
        this.h = ej0Var;
        this.i = abVar;
        this.j = h72Var;
        this.k = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 2;
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objL = ak0Var.L();
            ej0 ej0Var = this.h;
            ab abVar = this.i;
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = (fx) ej0Var.h(abVar);
                ak0Var.g0(objL);
            }
            fx fxVar = (fx) objL;
            ki2 ki2Var = this.f;
            gi2 gi2VarF = ki2Var.f();
            dk1 dk1Var = ki2Var.d;
            Object objC = gi2VarF.c();
            Object obj3 = this.g;
            boolean zG = ak0Var.g(ws0.j(objC, obj3));
            Object objL2 = ak0Var.L();
            if (zG || objL2 == is1Var) {
                objL2 = ws0.j(ki2Var.f().c(), obj3) ? kc0.b : ((fx) ej0Var.h(abVar)).b;
                ak0Var.g0(objL2);
            }
            kc0 kc0Var = (kc0) objL2;
            Object objL3 = ak0Var.L();
            if (objL3 == is1Var) {
                objL3 = new va(ws0.j(obj3, dk1Var.getValue()));
                ak0Var.g0(objL3);
            }
            va vaVar = (va) objL3;
            sb0 sb0Var = fxVar.a;
            boolean zH = ak0Var.h(fxVar);
            Object objL4 = ak0Var.L();
            if (zH || objL4 == is1Var) {
                objL4 = new ma(fxVar);
                ak0Var.g0(objL4);
            }
            u71 u71VarK0 = sv0.k0(r71.a, (jj0) objL4);
            vaVar.a.setValue(Boolean.valueOf(ws0.j(obj3, dk1Var.getValue())));
            u71 u71VarC = u71VarK0.c(vaVar);
            boolean zH2 = ak0Var.h(obj3);
            Object objL5 = ak0Var.L();
            if (zH2 || objL5 == is1Var) {
                objL5 = new y3(5, obj3);
                ak0Var.g0(objL5);
            }
            ej0 ej0Var2 = (ej0) objL5;
            boolean zF = ak0Var.f(kc0Var);
            Object objL6 = ak0Var.L();
            if (zF || objL6 == is1Var) {
                objL6 = new q(i, kc0Var);
                ak0Var.g0(objL6);
            }
            dv1.a(this.f, ej0Var2, u71VarC, sb0Var, kc0Var, (ij0) objL6, vs0.C(-143346359, new oa(this.j, obj3, abVar, this.k), ak0Var), ak0Var, 12582912);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

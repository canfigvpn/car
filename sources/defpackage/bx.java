package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bx extends wa2 implements ij0 {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cx k;
    public final /* synthetic */ wl2 l;
    public final /* synthetic */ mk m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(cx cxVar, wl2 wl2Var, mk mkVar, long j, sx sxVar) {
        super(2, sxVar);
        this.k = cxVar;
        this.l = wl2Var;
        this.m = mkVar;
        this.n = j;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((bx) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        bx bxVar = new bx(this.k, this.l, this.m, this.n, sxVar);
        bxVar.j = obj;
        return bxVar;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        cx cxVar = this.k;
        ck ckVar = cxVar.w;
        int i = this.i;
        try {
            try {
                if (i == 0) {
                    ix.Q(obj);
                    ot0 ot0VarZ = mx.z(((ez) this.j).h());
                    cxVar.z = true;
                    uy1 uy1Var = cxVar.t;
                    ia1 ia1Var = ia1.e;
                    ax axVar = new ax(this.l, cxVar, this.m, this.n, ot0VarZ, null);
                    this.i = 1;
                    Object objF = uy1Var.f(ia1Var, axVar, this);
                    fz fzVar = fz.e;
                    if (objF == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                ckVar.b();
                cxVar.z = false;
                ckVar.a(null);
                cxVar.x = false;
                return ll2.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            cxVar.z = false;
            ckVar.a(null);
            cxVar.x = false;
            throw th;
        }
    }
}

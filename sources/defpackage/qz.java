package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qz extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(sx sxVar, ej0 ej0Var) {
        super(2, sxVar);
        this.i = 1;
        this.k = ej0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((qz) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 1:
                return ((qz) p((sx) obj2, (jk1) obj)).r(ll2Var);
            default:
                return ((qz) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                qz qzVar = new qz(0, sxVar, (rz) obj2);
                qzVar.j = obj;
                return qzVar;
            case 1:
                qz qzVar2 = new qz(sxVar, (ej0) obj2);
                qzVar2.j = obj;
                return qzVar2;
            default:
                qz qzVar3 = new qz(2, sxVar, (ij0) obj2);
                qzVar3.j = obj;
                return qzVar3;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        int i = this.i;
        boolean z = true;
        Object obj2 = this.k;
        sx sxVar = null;
        switch (i) {
            case 0:
                ix.Q(obj);
                ez ezVar = (ez) this.j;
                rz rzVar = (rz) obj2;
                ot0 ot0Var = (ot0) rzVar.b.getAndSet(null);
                AtomicReference atomicReference = rzVar.b;
                j82 j82VarY = nj2.y(ezVar, null, new e(14, sxVar, ot0Var, rzVar), 3);
                while (!atomicReference.compareAndSet(null, j82VarY)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                ix.Q(obj);
                jk1 jk1Var = (jk1) this.j;
                jk1Var.getClass();
                return ((ej0) obj2).h(jk1Var.b());
            default:
                ix.Q(obj);
                uy uyVarH = ((ez) this.j).h();
                q90 q90Var = q90.A;
                sy syVarP = uyVarH.p(q90Var);
                syVarP.getClass();
                xy xyVar = (xy) syVarP;
                ls lsVar = new ls(true);
                lsVar.R(null);
                g gVar = new g(18, sxVar, lsVar, (ij0) obj2);
                uy uyVarY = ix.y(ab0.e, xyVar, true);
                j30 j30Var = u50.a;
                if (uyVarY != j30Var && uyVarY.p(q90Var) == null) {
                    uyVarY = uyVarY.k(j30Var);
                }
                s j82Var = new j82(uyVarY, true);
                j82Var.j0(hz.h, j82Var, gVar);
                while (lsVar.O() instanceof so0) {
                    try {
                        return dv1.J(xyVar, new ln(11, sxVar, lsVar));
                    } catch (InterruptedException unused) {
                    }
                }
                Object objO = lsVar.O();
                if (objO instanceof so0) {
                    fu1.h("This job has not completed yet");
                    return sxVar;
                }
                if (objO instanceof os) {
                    throw ((os) objO).a;
                }
                return nj2.H(objO);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz(int i, sx sxVar, Object obj) {
        super(2, sxVar);
        this.i = i;
        this.k = obj;
    }
}

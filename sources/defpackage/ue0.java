package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 implements pe0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ ue0(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) throws Throwable {
        u uVar;
        yv1 yv1Var;
        Throwable th;
        int i = this.e;
        Object obj = this.f;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                Object objK = qe0Var.k(obj, sxVar);
                return objK == fzVar ? objK : ll2Var;
            case 1:
                Object objA = ((rn) obj).a(new qn(qe0Var, 2), sxVar);
                return objA == fzVar ? objA : ll2Var;
            default:
                if (sxVar instanceof u) {
                    uVar = (u) sxVar;
                    int i2 = uVar.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        uVar.k = i2 - Integer.MIN_VALUE;
                    } else {
                        uVar = new u(this, sxVar);
                    }
                } else {
                    uVar = new u(this, sxVar);
                }
                Object obj2 = uVar.i;
                int i3 = uVar.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yv1Var = uVar.h;
                    try {
                        ix.Q(obj2);
                        yv1Var.s();
                        return ll2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        yv1Var.s();
                        throw th;
                    }
                }
                ix.Q(obj2);
                uy uyVar = uVar.f;
                uyVar.getClass();
                yv1 yv1Var2 = new yv1(qe0Var, uyVar);
                try {
                    uVar.h = yv1Var2;
                    uVar.k = 1;
                    Object objG = ((ij0) obj).g(yv1Var2, uVar);
                    if (objG != fzVar) {
                        objG = ll2Var;
                    }
                    if (objG == fzVar) {
                        return fzVar;
                    }
                    yv1Var = yv1Var2;
                    yv1Var.s();
                    return ll2Var;
                } catch (Throwable th3) {
                    yv1Var = yv1Var2;
                    th = th3;
                    yv1Var.s();
                    throw th;
                }
        }
    }
}

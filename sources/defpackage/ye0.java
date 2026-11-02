package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 implements pe0 {
    public final /* synthetic */ mo e;
    public final /* synthetic */ mu f;

    public ye0(mo moVar, mu muVar) {
        this.e = moVar;
        this.f = muVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) throws Throwable {
        xe0 xe0Var;
        yv1 yv1Var;
        yv1 yv1Var2;
        if (sxVar instanceof xe0) {
            xe0Var = (xe0) sxVar;
            int i = xe0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe0Var.i = i - Integer.MIN_VALUE;
            } else {
                xe0Var = new xe0(this, sxVar);
            }
        } else {
            xe0Var = new xe0(this, sxVar);
        }
        Object obj = xe0Var.h;
        int i2 = xe0Var.i;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        try {
            try {
                if (i2 == 0) {
                    ix.Q(obj);
                    mo moVar = this.e;
                    xe0Var.k = this;
                    xe0Var.l = qe0Var;
                    xe0Var.i = 1;
                    if (moVar.a(qe0Var, xe0Var) != fzVar) {
                    }
                    return fzVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) xe0Var.k;
                        ix.Q(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yv1Var2 = (yv1) xe0Var.k;
                    try {
                        ix.Q(obj);
                        yv1Var2.s();
                        return ll2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        yv1Var2.s();
                        throw th;
                    }
                }
                qe0Var = xe0Var.l;
                this = (ye0) xe0Var.k;
                ix.Q(obj);
                mu muVar = this.f;
                xe0Var.k = yv1Var;
                xe0Var.l = null;
                xe0Var.i = 3;
                muVar.d(yv1Var, null, xe0Var);
                if (ll2Var != fzVar) {
                    yv1Var2 = yv1Var;
                    yv1Var2.s();
                    return ll2Var;
                }
                return fzVar;
            } catch (Throwable th3) {
                th = th3;
                yv1Var2 = yv1Var;
                yv1Var2.s();
                throw th;
            }
            uy uyVar = xe0Var.f;
            uyVar.getClass();
            yv1Var = new yv1(qe0Var, uyVar);
        } catch (Throwable th4) {
            ye0 ye0Var = this;
            qg2 qg2Var = new qg2(th4);
            mu muVar2 = ye0Var.f;
            xe0Var.k = th4;
            xe0Var.l = null;
            xe0Var.i = 2;
            if (rw.B(qg2Var, muVar2, th4, xe0Var) != fzVar) {
                throw th4;
            }
        }
    }
}

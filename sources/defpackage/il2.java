package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class il2 extends mx1 {
    public final ThreadLocal i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public il2(sx sxVar, uy uyVar) {
        rm rmVar = rm.h;
        super(sxVar, uyVar.p(rmVar) == null ? uyVar.k(rmVar) : uyVar);
        this.i = new ThreadLocal();
        if (sxVar.f().p(q90.A) instanceof xy) {
            return;
        }
        Object objS0 = p61.s0(uyVar, null);
        p61.h0(uyVar, objS0);
        l0(uyVar, objS0);
    }

    public final boolean k0() {
        boolean z = this.threadLocalIsSet && this.i.get() == null;
        this.i.remove();
        return !z;
    }

    public final void l0(uy uyVar, Object obj) {
        this.threadLocalIsSet = true;
        this.i.set(new qj1(uyVar, obj));
    }

    @Override // defpackage.mx1, defpackage.vt0
    public final void z(Object obj) {
        if (this.threadLocalIsSet) {
            qj1 qj1Var = (qj1) this.i.get();
            if (qj1Var != null) {
                p61.h0((uy) qj1Var.e, qj1Var.f);
            }
            this.i.remove();
        }
        Object objA = j20.A(obj);
        sx sxVar = this.h;
        uy uyVarF = sxVar.f();
        Object objS0 = p61.s0(uyVarF, null);
        il2 il2VarT = objS0 != p61.j0 ? ix.T(sxVar, uyVarF, objS0) : null;
        try {
            this.h.i(objA);
        } finally {
            if (il2VarT == null || il2VarT.k0()) {
                p61.h0(uyVarF, objS0);
            }
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oo extends no {
    public final pe0 h;

    public oo(pe0 pe0Var, uy uyVar, int i, vk vkVar) {
        super(uyVar, i, vkVar);
        this.h = pe0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[RETURN] */
    @Override // defpackage.no, defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) {
        Object objA;
        int i = this.f;
        fz fzVar = fz.e;
        if (i == -3) {
            uy uyVarF = sxVar.f();
            Boolean bool = Boolean.FALSE;
            vy vyVar = new vy(0);
            uy uyVar = this.e;
            uy uyVarK = !((Boolean) uyVar.s(vyVar, bool)).booleanValue() ? uyVarF.k(uyVar) : ix.y(uyVarF, uyVar, false);
            if (ws0.j(uyVarK, uyVarF)) {
                Object objH = h(qe0Var, sxVar);
                if (objH == fzVar) {
                    return objH;
                }
            } else {
                q90 q90Var = q90.A;
                if (ws0.j(uyVarK.p(q90Var), uyVarF.p(q90Var))) {
                    uy uyVarF2 = sxVar.f();
                    if (!(qe0Var instanceof l12) && !(qe0Var instanceof ue1)) {
                        qe0Var = new cb(qe0Var, uyVarF2);
                    }
                    Object objJ = ir2.J(uyVarK, qe0Var, p61.m0(uyVarK), new e(8, null, this), sxVar);
                    if (objJ == fzVar) {
                        return objJ;
                    }
                } else {
                    objA = super.a(qe0Var, sxVar);
                    if (objA == fzVar) {
                        return objA;
                    }
                }
            }
        } else {
            objA = super.a(qe0Var, sxVar);
            if (objA == fzVar) {
                return objA;
            }
        }
        return ll2.a;
    }

    @Override // defpackage.no
    public final Object d(hq1 hq1Var, sx sxVar) {
        Object objH = h(new l12(hq1Var), sxVar);
        return objH == fz.e ? objH : ll2.a;
    }

    public abstract Object h(qe0 qe0Var, sx sxVar);

    @Override // defpackage.no
    public final String toString() {
        return this.h + " -> " + super.toString();
    }
}

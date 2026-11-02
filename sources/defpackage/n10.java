package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n10 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ q01 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(q01 q01Var, int i, sx sxVar) {
        super(2, sxVar);
        this.i = 3;
        this.k = q01Var;
        this.j = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((n10) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 1:
                return ((n10) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 2:
                return ((n10) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                ((n10) p((sx) obj2, (xx1) obj)).r(ll2Var);
                return ll2Var;
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        q01 q01Var = this.k;
        switch (i) {
            case 0:
                return new n10(q01Var, sxVar, 0);
            case 1:
                return new n10(q01Var, sxVar, 1);
            case 2:
                return new n10(q01Var, sxVar, 2);
            default:
                return new n10(q01Var, this.j, sxVar);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        q01 q01Var = this.k;
        switch (i) {
            case 0:
                int i2 = this.j;
                try {
                    if (i2 == 0) {
                        ix.Q(obj);
                        int iH = q01Var.h() + 1;
                        this.j = 1;
                        if (q01.f(q01Var, iH, this) == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i2 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return ll2Var;
            case 1:
                int i3 = this.j;
                try {
                    if (i3 == 0) {
                        ix.Q(obj);
                        int iH2 = q01Var.h() - 1;
                        this.j = 1;
                        if (q01.f(q01Var, iH2, this) == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i3 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                return ll2Var;
            case 2:
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    this.j = 1;
                    if (q01.l(q01Var, 0, this) == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i4 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            default:
                ix.Q(obj);
                q01Var.m(this.j);
                return ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n10(q01 q01Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = q01Var;
    }
}

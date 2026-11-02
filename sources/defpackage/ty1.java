package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 extends wa2 implements ij0 {
    public long i;
    public int j;
    public /* synthetic */ long k;
    public final /* synthetic */ uy1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty1(uy1 uy1Var, sx sxVar) {
        super(2, sxVar);
        this.l = uy1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        long j = ((sm2) obj).a;
        ty1 ty1Var = new ty1(this.l, (sx) obj2);
        ty1Var.k = j;
        return ty1Var.r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        ty1 ty1Var = new ty1(this.l, sxVar);
        ty1Var.k = ((sm2) obj).a;
        return ty1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.j;
        uy1 uy1Var = this.l;
        fz fzVar = fz.e;
        if (i == 0) {
            ix.Q(obj);
            j = this.k;
            e4 e4Var = uy1Var.f;
            this.k = j;
            this.j = 1;
            obj = e4Var.i(j, this);
            if (obj != fzVar) {
            }
            return fzVar;
        }
        if (i == 1) {
            j = this.k;
            ix.Q(obj);
        } else {
            if (i == 2) {
                j2 = this.i;
                j = this.k;
                ix.Q(obj);
                j3 = ((sm2) obj).a;
                e4 e4Var2 = uy1Var.f;
                long jD = sm2.d(j2, j3);
                this.k = j;
                this.i = j3;
                this.j = 3;
                obj = e4Var2.h(jD, j3, this);
                if (obj != fzVar) {
                    j4 = j;
                    j5 = j3;
                }
                return fzVar;
            }
            if (i != 3) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.i;
            j4 = this.k;
            ix.Q(obj);
        }
        return new sm2(sm2.d(j4, sm2.d(j5, ((sm2) obj).a)));
        long jD2 = sm2.d(j, ((sm2) obj).a);
        this.k = j;
        this.i = jD2;
        this.j = 2;
        obj = uy1Var.a(jD2, this);
        if (obj != fzVar) {
            j2 = jD2;
            j3 = ((sm2) obj).a;
            e4 e4Var3 = uy1Var.f;
            long jD3 = sm2.d(j2, j3);
            this.k = j;
            this.i = j3;
            this.j = 3;
            obj = e4Var3.h(jD3, j3, this);
            if (obj != fzVar) {
                j4 = j;
                j5 = j3;
                return new sm2(sm2.d(j4, sm2.d(j5, ((sm2) obj).a)));
            }
        }
        return fzVar;
    }
}

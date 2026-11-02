package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b02 extends tt1 implements ij0 {
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ long i;
    public final /* synthetic */ fs1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b02(long j, fs1 fs1Var, sx sxVar) {
        super(2, sxVar);
        this.i = j;
        this.j = fs1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((b02) p((sx) obj2, (bb2) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        b02 b02Var = new b02(this.i, this.j, sxVar);
        b02Var.h = obj;
        return b02Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        bb2 bb2Var;
        int i = this.g;
        fs1 fs1Var = this.j;
        if (i == 0) {
            ix.Q(obj);
            bb2 bb2Var2 = (bb2) this.h;
            x7 x7Var = new x7(26, fs1Var);
            this.h = bb2Var2;
            this.g = 1;
            Object objC = u70.c(bb2Var2, this.i, x7Var, this);
            fz fzVar = fz.e;
            if (objC == fzVar) {
                return fzVar;
            }
            obj = objC;
            bb2Var = bb2Var2;
        } else {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bb2Var = (bb2) this.h;
            ix.Q(obj);
        }
        if (((wn1) obj) != null && (fs1Var.e & 9223372034707292159L) != 9205357640488583168L) {
            return u60.f;
        }
        wn1 wn1Var = (wn1) vq.Q(bb2Var.i.w.a);
        if (!sv.q(wn1Var)) {
            return u60.h;
        }
        wn1Var.a();
        return u60.e;
    }
}

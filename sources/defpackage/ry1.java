package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 extends wa2 implements ij0 {
    public uy1 i;
    public fs1 j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uy1 n;
    public final /* synthetic */ fs1 o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry1(uy1 uy1Var, fs1 fs1Var, long j, sx sxVar) {
        super(2, sxVar);
        this.n = uy1Var;
        this.o = fs1Var;
        this.p = j;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((ry1) p((sx) obj2, (sy1) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        ry1 ry1Var = new ry1(this.n, this.o, this.p, sxVar);
        ry1Var.m = obj;
        return ry1Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        uy1 uy1Var;
        fs1 fs1Var;
        uy1 uy1Var2;
        long j;
        int i = this.l;
        di1 di1Var = di1.f;
        if (i == 0) {
            ix.Q(obj);
            sy1 sy1Var = (sy1) this.m;
            uy1Var = this.n;
            m01 m01Var = new m01(1, uy1Var, sy1Var);
            pd0 pd0Var = uy1Var.c;
            fs1 fs1Var2 = this.o;
            long j2 = fs1Var2.e;
            di1 di1Var2 = uy1Var.d;
            long j3 = this.p;
            float fD = uy1Var.d(di1Var2 == di1Var ? sm2.b(j3) : sm2.c(j3));
            this.m = uy1Var;
            this.i = uy1Var;
            this.j = fs1Var2;
            this.k = j2;
            this.l = 1;
            obj = pd0Var.a(m01Var, fD, this);
            fz fzVar = fz.e;
            if (obj == fzVar) {
                return fzVar;
            }
            fs1Var = fs1Var2;
            uy1Var2 = uy1Var;
            j = j2;
        } else {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.k;
            fs1Var = this.j;
            uy1Var = this.i;
            uy1Var2 = (uy1) this.m;
            ix.Q(obj);
        }
        float fD2 = uy1Var2.d(((Number) obj).floatValue());
        fs1Var.e = uy1Var.d == di1Var ? sm2.a(j, fD2, 0.0f, 2) : sm2.a(j, 0.0f, fD2, 1);
        return ll2.a;
    }
}

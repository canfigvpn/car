package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r91 extends tt1 implements ij0 {
    public nk0 g;
    public s91 h;
    public long[] i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ s91 m;
    public final /* synthetic */ nk0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r91(s91 s91Var, nk0 nk0Var, sx sxVar) {
        super(2, sxVar);
        this.m = s91Var;
        this.n = nk0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((r91) p((sx) obj2, (n12) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        r91 r91Var = new r91(this.m, this.n, sxVar);
        r91Var.l = obj;
        return r91Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        n12 n12Var;
        s91 s91Var;
        long[] jArr;
        int i;
        nk0 nk0Var;
        int i2 = this.k;
        if (i2 == 0) {
            ix.Q(obj);
            n12Var = (n12) this.l;
            s91Var = this.m;
            q91 q91Var = s91Var.f;
            jArr = q91Var.c;
            i = q91Var.e;
            nk0Var = this.n;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.j;
            jArr = this.i;
            s91Var = this.h;
            nk0Var = this.g;
            n12Var = (n12) this.l;
            ix.Q(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return ll2.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        nk0Var.f = i;
        Object obj2 = s91Var.f.b[i];
        this.l = n12Var;
        this.g = nk0Var;
        this.h = s91Var;
        this.i = jArr;
        this.j = i3;
        this.k = 1;
        n12Var.b(this, obj2);
        return fz.e;
    }
}

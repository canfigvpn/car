package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ long k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rc2 rc2Var, long j, wc2 wc2Var, qc2 qc2Var, sx sxVar) {
        super(2, sxVar);
        this.i = 3;
        this.l = rc2Var;
        this.k = j;
        this.m = wc2Var;
        this.n = qc2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((h) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 1:
                return ((h) p((sx) obj2, nr.i(obj))).r(ll2Var);
            case 2:
                return ((h) p((sx) obj2, (sy1) obj)).r(ll2Var);
            case 3:
                return ((h) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                return ((h) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                return new h((ot0) obj3, this.k, (f91) obj2, sxVar, 0);
            case 1:
                h hVar = new h(this.k, sxVar, (en1) obj3, (CharSequence) obj2);
                hVar.l = obj;
                return hVar;
            case 2:
                h hVar2 = new h((uy1) obj3, this.k, (ds1) obj2, sxVar, 2);
                hVar2.l = obj;
                return hVar2;
            case 3:
                return new h((rc2) this.l, this.k, (wc2) obj3, (qc2) obj2, sxVar);
            default:
                return new h((da1) obj3, this.k, (f91) obj2, sxVar, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r10.b(r5, r13) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r10.b(r0, r13) == r7) goto L24;
     */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j, sx sxVar, en1 en1Var, CharSequence charSequence) {
        super(2, sxVar);
        this.i = 1;
        this.m = en1Var;
        this.n = charSequence;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, long j, Object obj2, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.m = obj;
        this.k = j;
        this.n = obj2;
    }
}

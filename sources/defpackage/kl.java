package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kl extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ia k;
    public final /* synthetic */ float l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ tr0 n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(ia iaVar, float f, boolean z, tr0 tr0Var, da1 da1Var, sx sxVar) {
        super(2, sxVar);
        this.i = 2;
        this.k = iaVar;
        this.l = f;
        this.m = z;
        this.n = tr0Var;
        this.o = da1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((kl) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new kl(this.k, this.l, this.m, (ll) obj2, this.n, sxVar, 0);
            case 1:
                return new kl(this.k, this.l, this.m, (co) obj2, this.n, sxVar, 1);
            default:
                return new kl(this.k, this.l, this.m, this.n, (da1) obj2, sxVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r9.e(r16, r1) == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (defpackage.v90.a(r9, r10, r1, r14, r16) == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r8;
     */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl(ia iaVar, float f, boolean z, Object obj, tr0 tr0Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = iaVar;
        this.l = f;
        this.m = z;
        this.o = obj;
        this.n = tr0Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends wa2 implements ij0 {
    public final /* synthetic */ int i = 2;
    public int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ia iaVar, boolean z, g82 g82Var, ti0 ti0Var, sx sxVar) {
        super(2, sxVar);
        this.l = iaVar;
        this.k = z;
        this.m = g82Var;
        this.n = ti0Var;
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
        return ((j) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                return new j((f91) obj2, (rp1) this.m, this.k, (jq) obj3, sxVar);
            case 1:
                return new j((ia) obj2, this.k, (g82) this.m, (ti0) obj3, sxVar);
            default:
                return new j((da1) obj3, this.k, (f91) obj2, sxVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (((defpackage.f91) r2).b(r0, r11) == r5) goto L47;
     */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f91 f91Var, rp1 rp1Var, boolean z, jq jqVar, sx sxVar) {
        super(2, sxVar);
        this.l = f91Var;
        this.m = rp1Var;
        this.k = z;
        this.n = jqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(da1 da1Var, boolean z, f91 f91Var, sx sxVar) {
        super(2, sxVar);
        this.n = da1Var;
        this.k = z;
        this.l = f91Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q70 extends tt1 implements ij0 {
    public pn1 g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cs1 k;
    public final /* synthetic */ gs1 l;
    public final /* synthetic */ gs1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(cs1 cs1Var, gs1 gs1Var, gs1 gs1Var2, sx sxVar) {
        super(2, sxVar);
        this.k = cs1Var;
        this.l = gs1Var;
        this.m = gs1Var2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((q70) p((sx) obj2, (bb2) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        q70 q70Var = new q70(this.k, this.l, this.m, sxVar);
        q70Var.j = obj;
        return q70Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:2: B:16:0x0056->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0069 A[EDGE_INSN: B:74:0x0069->B:22:0x0069 BREAK  A[LOOP:2: B:16:0x0056->B:20:0x0065], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q70.r(java.lang.Object):java.lang.Object");
    }
}

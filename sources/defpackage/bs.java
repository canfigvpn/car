package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bs extends wa2 implements ij0 {
    public lo i;
    public byte[] j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pe0[] o;
    public final /* synthetic */ jj0 p;
    public final /* synthetic */ qe0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(sx sxVar, qe0 qe0Var, jj0 jj0Var, pe0[] pe0VarArr) {
        super(2, sxVar);
        this.o = pe0VarArr;
        this.p = jj0Var;
        this.q = qe0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((bs) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        bs bsVar = new bs(sxVar, this.q, this.p, this.o);
        bsVar.n = obj;
        return bsVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5 A[DONT_INVERT, EDGE_INSN: B:40:0x00c5->B:18:0x0082 BREAK  A[LOOP:0: B:29:0x00a4->B:46:?]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:29:0x00a4->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00db -> B:18:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs.r(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t6 extends tt1 implements ij0 {
    public final /* synthetic */ int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(int i, sx sxVar, Object obj) {
        super(2, sxVar);
        this.g = i;
        this.j = obj;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.g;
        ll2 ll2Var = ll2.a;
        bb2 bb2Var = (bb2) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((t6) p(sxVar, bb2Var)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.g;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                t6 t6Var = new t6(0, sxVar, (v6) obj2);
                t6Var.i = obj;
                return t6Var;
            case 1:
                t6 t6Var2 = new t6(1, sxVar, (qn1) obj2);
                t6Var2.i = obj;
                return t6Var2;
            default:
                t6 t6Var3 = new t6(2, sxVar, (tc0) obj2);
                t6Var3.i = obj;
                return t6Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101 A[LOOP:1: B:51:0x00ed->B:55:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bf -> B:44:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6.r(java.lang.Object):java.lang.Object");
    }
}

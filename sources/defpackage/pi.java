package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pi extends tt1 implements ij0 {
    public final /* synthetic */ int g = 0;
    public int h;
    public /* synthetic */ Object i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(h7 h7Var, a52 a52Var, id2 id2Var, sx sxVar) {
        super(2, sxVar);
        this.j = h7Var;
        this.k = a52Var;
        this.l = id2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.g;
        ll2 ll2Var = ll2.a;
        bb2 bb2Var = (bb2) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                ((pi) p(sxVar, bb2Var)).r(ll2Var);
                return fz.e;
            case 1:
                return ((pi) p(sxVar, bb2Var)).r(ll2Var);
            default:
                return ((pi) p(sxVar, bb2Var)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.g;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                pi piVar = new pi((ez) this.k, (mh2) obj2, sxVar);
                piVar.i = obj;
                return piVar;
            case 1:
                pi piVar2 = new pi((h7) this.j, (a52) this.k, (id2) obj2, sxVar);
                piVar2.i = obj;
                return piVar2;
            default:
                pi piVar3 = new pi((s92) obj2, sxVar);
                piVar3.i = obj;
                return piVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:215:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:217:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:218:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:221:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0245 -> B:138:0x0249). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x039a -> B:213:0x039d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d4 -> B:38:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:203:0x0367
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(ez ezVar, mh2 mh2Var, sx sxVar) {
        super(2, sxVar);
        this.k = ezVar;
        this.l = mh2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(s92 s92Var, sx sxVar) {
        super(2, sxVar);
        this.l = s92Var;
    }
}

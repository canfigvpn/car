package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ja extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public Object j;
    public int k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja(Object obj, Object obj2, Object obj3, Object obj4, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
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
        return ((ja) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                ja jaVar = new ja((lo) this.m, (ia) this.n, (da1) obj3, (da1) obj2, sxVar, 0);
                jaVar.j = obj;
                return jaVar;
            case 1:
                ja jaVar2 = new ja((qa1) obj3, (ej0) obj2, sxVar);
                jaVar2.n = obj;
                return jaVar2;
            default:
                return new ja((b21) this.m, (r11) this.n, (ez) obj3, (g) obj2, sxVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0205  */
    /* JADX WARN: Code duplicated, block: B:121:0x020f  */
    /* JADX WARN: Code duplicated, block: B:124:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x021f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Type inference failed for: r2v3, types: [int, ra1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0203 -> B:119:0x0207). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(qa1 qa1Var, ej0 ej0Var, sx sxVar) {
        super(2, sxVar);
        this.i = 1;
        this.o = qa1Var;
        this.p = ej0Var;
    }
}

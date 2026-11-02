package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z70 extends wa2 implements ij0 {
    public final /* synthetic */ int i = 0;
    public gs1 j;
    public gs1 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ny1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(gs1 gs1Var, ny1 ny1Var, sx sxVar) {
        super(2, sxVar);
        this.k = gs1Var;
        this.n = ny1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((z70) p((sx) obj2, (ej0) obj)).r(ll2Var);
            default:
                return ((z70) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        ny1 ny1Var = this.n;
        switch (i) {
            case 0:
                z70 z70Var = new z70(this.k, ny1Var, sxVar);
                z70Var.m = obj;
                return z70Var;
            default:
                z70 z70Var2 = new z70(ny1Var, sxVar);
                z70Var2.m = obj;
                return z70Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[PHI: r0 r2
  0x003a: PHI (r0v13 gs1) = (r0v5 gs1), (r0v17 gs1) binds: [B:14:0x0037, B:40:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r2v15 ez) = (r2v13 ez), (r2v16 ez) binds: [B:14:0x0037, B:40:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[PHI: r7
  0x005e: PHI (r7v15 ez) = (r7v7 ez), (r7v10 ez), (r7v10 ez), (r7v10 ez), (r7v13 ez), (r7v16 ez) binds: [B:19:0x0056, B:49:0x00db, B:51:0x00e8, B:45:0x00d4, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:42:0x00c1, B:44:0x00c7, B:48:0x00d9, B:50:0x00dd), top: B:88:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd A[Catch: CancellationException -> 0x00d7, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:42:0x00c1, B:44:0x00c7, B:48:0x00d9, B:50:0x00dd), top: B:88:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d4 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00db -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e8 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f6 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0142 -> B:79:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0146 -> B:81:0x0148). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z70.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(ny1 ny1Var, sx sxVar) {
        super(2, sxVar);
        this.n = ny1Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wl2 {
    public static final pb f = new pb(0.0f);
    public final nm2 a;
    public long b = Long.MIN_VALUE;
    public pb c = f;
    public boolean d;
    public float e;

    public wl2(nb nbVar) {
        this.a = nbVar.a(ir2.V);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x007e: PHI (r0v16 ej0) = (r0v9 ej0), (r0v17 ej0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r2v5 ti0) = (r2v3 ti0), (r2v6 ti0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r3v4 vl2) = (r3v2 vl2), (r3v5 vl2) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x00a9: PHI (r0v17 ej0) = (r0v16 ej0), (r0v20 ej0) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r2v6 ti0) = (r2v5 ti0), (r2v8 ti0) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r3v5 vl2) = (r3v4 vl2), (r3v7 vl2) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r13v2 float) = (r13v1 float), (r13v4 float) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[Catch: all -> 0x003a, PHI: r0 r2 r3
  0x00b0: PHI (r0v12 ej0) = (r0v16 ej0), (r0v17 ej0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r2v4 ti0) = (r2v5 ti0), (r2v6 ti0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r3v3 vl2) = (r3v4 vl2), (r3v5 vl2) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.o1 r17, defpackage.vf r18, defpackage.tx r19) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl2.a(o1, vf, tx):java.lang.Object");
    }
}

package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(ao1 ao1Var, jj0 jj0Var, ej0 ej0Var, pp1 pp1Var, sx sxVar) {
        super(2, sxVar);
        this.i = 9;
        this.l = ao1Var;
        this.n = jj0Var;
        this.m = ej0Var;
        this.o = pp1Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014c A[Catch: all -> 0x014f, TryCatch #6 {all -> 0x014f, blocks: (B:69:0x0148, B:71:0x014c, B:74:0x0151, B:76:0x0157), top: B:120:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0157 A[Catch: all -> 0x014f, TRY_LEAVE, TryCatch #6 {all -> 0x014f, blocks: (B:69:0x0148, B:71:0x014c, B:74:0x0151, B:76:0x0157), top: B:120:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x017e A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:87:0x017a, B:89:0x017e, B:92:0x0183, B:94:0x0189), top: B:110:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0189 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:87:0x017a, B:89:0x017e, B:92:0x0183, B:94:0x0189), top: B:110:0x017a }] */
    private final Object t(Object obj) throws Throwable {
        ot0 ot0VarZ;
        s82 s82Var;
        bm1 bm1Var;
        bm1 bm1Var2;
        p2 p2Var;
        Throwable th;
        List listD;
        qv qvVar;
        rr1 rr1Var;
        rr1 rr1Var2;
        fz fzVar = fz.e;
        int i = this.j;
        sx sxVar = null;
        if (i != 0) {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2Var = (p2) this.l;
            ot0VarZ = (ot0) this.k;
            try {
                ix.Q(obj);
                p2Var.a();
                rr1Var2 = (rr1) this.m;
                synchronized (rr1Var2.c) {
                    try {
                        if (rr1Var2.d == ot0VarZ) {
                            rr1Var2.d = null;
                        }
                        if (rr1Var2.y() != null) {
                            hv.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                s82 s82Var2 = rr1.z;
                mx.M(((rr1) this.m).y);
                return ll2.a;
            } catch (Throwable th3) {
                th = th3;
                p2Var.a();
                rr1Var = (rr1) this.m;
                synchronized (rr1Var.c) {
                    try {
                        if (rr1Var.d == ot0VarZ) {
                            rr1Var.d = null;
                        }
                        if (rr1Var.y() != null) {
                            hv.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                s82 s82Var3 = rr1.z;
                mx.M(((rr1) this.m).y);
                throw th;
            }
        }
        ix.Q(obj);
        ot0VarZ = mx.z(((ez) this.k).h());
        rr1 rr1Var3 = (rr1) this.m;
        s82 s82Var4 = rr1.z;
        synchronized (rr1Var3.c) {
            Throwable th5 = rr1Var3.e;
            if (th5 != null) {
                throw th5;
            }
            if (((or1) rr1Var3.u.getValue()).compareTo(or1.f) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (rr1Var3.d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            rr1Var3.d = ot0VarZ;
            if (rr1Var3.y() != null) {
                hv.a("called outside of runRecomposeAndApplyChanges");
            }
        }
        x7 x7Var = new x7(22, (rr1) this.m);
        x62.b(x62.a);
        synchronized (x62.c) {
            x62.h = vq.Z(x62.h, x7Var);
        }
        p2 p2Var2 = new p2(x7Var);
        iq1 iq1Var = ((rr1) this.m).y;
        do {
            s82Var = rr1.z;
            bm1Var = (bm1) s82Var.getValue();
            q90 q90Var = q90.J;
            tl1 tl1Var = bm1Var.g;
            if (tl1Var.containsKey(iq1Var)) {
                bm1Var2 = bm1Var;
            } else if (bm1Var.isEmpty()) {
                bm1Var2 = new bm1(iq1Var, iq1Var, tl1Var.a(iq1Var, new x21(q90Var, q90Var)));
            } else {
                Object obj2 = bm1Var.f;
                Object obj3 = tl1Var.get(obj2);
                obj3.getClass();
                bm1Var2 = new bm1(bm1Var.e, iq1Var, tl1Var.a(obj2, new x21(((x21) obj3).a, iq1Var)).a(iq1Var, new x21(obj2, q90Var)));
            }
            if (bm1Var == bm1Var2) {
                break;
            }
        } while (!s82Var.h(bm1Var, bm1Var2));
        try {
            rr1 rr1Var4 = (rr1) this.m;
            synchronized (rr1Var4.c) {
                listD = rr1Var4.D();
            }
            int size = listD.size();
            for (int i2 = 0; i2 < size; i2++) {
                for (Object obj4 : ((qv) listD.get(i2)).j.g) {
                    lr1 lr1Var = obj4 instanceof lr1 ? (lr1) obj4 : null;
                    if (lr1Var != null && (qvVar = lr1Var.a) != null) {
                        qvVar.s(lr1Var, null);
                    }
                }
            }
            g gVar = new g(17, sxVar, (qr1) this.n, (aa) this.o);
            this.k = ot0VarZ;
            this.l = p2Var2;
            this.j = 1;
            if (qx.w(gVar, this) == fzVar) {
                return fzVar;
            }
            p2Var = p2Var2;
            p2Var.a();
            rr1Var2 = (rr1) this.m;
            synchronized (rr1Var2.c) {
                if (rr1Var2.d == ot0VarZ) {
                    rr1Var2.d = null;
                }
                if (rr1Var2.y() != null) {
                    hv.a("called outside of runRecomposeAndApplyChanges");
                }
                s82 s82Var5 = rr1.z;
                mx.M(((rr1) this.m).y);
                return ll2.a;
            }
        } catch (Throwable th6) {
            p2Var = p2Var2;
            th = th6;
            p2Var.a();
            rr1Var = (rr1) this.m;
            synchronized (rr1Var.c) {
                if (rr1Var.d == ot0VarZ) {
                    rr1Var.d = null;
                }
                if (rr1Var.y() != null) {
                    hv.a("called outside of runRecomposeAndApplyChanges");
                }
                s82 s82Var6 = rr1.z;
                mx.M(((rr1) this.m).y);
                throw th;
            }
        }
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) throws Throwable {
        int i = this.i;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                ((m7) p((sx) obj2, (ez) obj)).r(ll2Var);
                return fzVar;
            case 1:
                return ((m7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 2:
                return ((m7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 3:
                return ((m7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 4:
                return ((m7) p((sx) obj2, (gq1) obj)).r(ll2Var);
            case 5:
                return ((m7) p((sx) obj2, (pe0) obj)).r(ll2Var);
            case 6:
                return ((m7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 7:
                return ((m7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 8:
                ((m7) p((sx) obj2, (qe0) obj)).r(ll2Var);
                return fzVar;
            default:
                return ((m7) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                m7 m7Var = new m7((j8) this.l, (ej0) this.m, (o7) this.n, (z01) obj2, sxVar, 0);
                m7Var.k = obj;
                return m7Var;
            case 1:
                m7 m7Var2 = new m7((xg) this.n, (Uri) obj2, sxVar);
                m7Var2.k = obj;
                return m7Var2;
            case 2:
                return new m7((f11) this.k, (da1) this.l, (ye2) this.m, (me2) this.n, (oo0) obj2, sxVar, 2);
            case 3:
                return new m7((fk) this.k, (te2) this.l, (f11) this.m, (if2) this.n, (xf1) obj2, sxVar, 3);
            case 4:
                m7 m7Var3 = new m7((b21) this.l, (r11) this.m, (uy) this.n, (pe0) obj2, sxVar, 4);
                m7Var3.k = obj;
                return m7Var3;
            case 5:
                m7 m7Var4 = new m7((hu) this.l, (da1) this.m, (zj1) this.n, (da1) obj2, sxVar, 5);
                m7Var4.k = obj;
                return m7Var4;
            case 6:
                m7 m7Var5 = new m7((rr1) this.m, (qr1) this.n, (aa) obj2, sxVar);
                m7Var5.k = obj;
                return m7Var5;
            case 7:
                return new m7((fz1) this.n, this.k, (ki2) obj2, sxVar);
            case 8:
                m7 m7Var6 = new m7((ti0) obj2, sxVar);
                m7Var6.n = obj;
                return m7Var6;
            default:
                m7 m7Var7 = new m7((ao1) this.l, (jj0) this.n, (ej0) this.m, (pp1) obj2, sxVar);
                m7Var7.k = obj;
                return m7Var7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0259  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a9 A[PHI: r7 r8 r9 r20
  0x02a9: PHI (r7v34 fz1) = (r7v21 fz1), (r7v36 fz1) binds: [B:127:0x02a6, B:63:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x02a9: PHI (r8v18 fz) = (r8v12 fz), (r8v21 fz) binds: [B:127:0x02a6, B:63:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x02a9: PHI (r9v53 java.lang.Object) = (r9v48 java.lang.Object), (r9v55 java.lang.Object) binds: [B:127:0x02a6, B:63:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x02a9: PHI (r20v6 float) = (r20v2 float), (r20v7 float) binds: [B:127:0x02a6, B:63:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x0070, PHI: r3 r4 r6 r8
  0x00cf: PHI (r3v58 java.lang.Object) = (r3v57 java.lang.Object), (r3v62 java.lang.Object) binds: [B:34:0x00cc, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r4v49 ??) = (r4v54 ??), (r4v55 ??) binds: [B:34:0x00cc, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r6v23 ??) = (r6v28 ??), (r6v29 ??) binds: [B:34:0x00cc, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r8v25 qe0) = (r8v24 qe0), (r8v29 qe0) binds: [B:34:0x00cc, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0070, blocks: (B:26:0x0088, B:36:0x00cf, B:33:0x00be, B:38:0x00d9, B:20:0x006c), top: B:302:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #1 {all -> 0x0070, blocks: (B:26:0x0088, B:36:0x00cf, B:33:0x00be, B:38:0x00d9, B:20:0x006c), top: B:302:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [tu] */
    /* JADX WARN: Type inference failed for: r4v41, types: [int] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [k12] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object, lo] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, lo] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [qk1] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, qk1] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d7 -> B:33:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00eb -> B:33:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(ti0 ti0Var, sx sxVar) {
        super(2, sxVar);
        this.i = 8;
        this.o = ti0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(xg xgVar, Uri uri, sx sxVar) {
        super(2, sxVar);
        this.i = 1;
        this.n = xgVar;
        this.o = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(rr1 rr1Var, qr1 qr1Var, aa aaVar, sx sxVar) {
        super(2, sxVar);
        this.i = 6;
        this.m = rr1Var;
        this.n = qr1Var;
        this.o = aaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(fz1 fz1Var, Object obj, ki2 ki2Var, sx sxVar) {
        super(2, sxVar);
        this.i = 7;
        this.n = fz1Var;
        this.k = obj;
        this.o = ki2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(Object obj, Object obj2, Object obj3, Object obj4, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.o = obj5;
    }
}

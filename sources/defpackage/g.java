package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r0.a(r1, r7) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (defpackage.nj2.K(r1, r2, r7) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.m
            pe0 r0 = (defpackage.pe0) r0
            java.lang.Object r1 = r7.l
            uy r1 = (defpackage.uy) r1
            int r2 = r7.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1e
            if (r2 == r5) goto L1a
            if (r2 != r4) goto L14
            goto L1a
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r7)
            return r3
        L1a:
            defpackage.ix.Q(r8)
            goto L4b
        L1e:
            defpackage.ix.Q(r8)
            java.lang.Object r8 = r7.k
            gq1 r8 = (defpackage.gq1) r8
            ab0 r2 = defpackage.ab0.e
            boolean r2 = defpackage.ws0.j(r1, r2)
            fz r6 = defpackage.fz.e
            if (r2 == 0) goto L3d
            se0 r1 = new se0
            r1.<init>(r8, r4)
            r7.j = r5
            java.lang.Object r7 = r0.a(r1, r7)
            if (r7 != r6) goto L4b
            goto L4a
        L3d:
            te0 r2 = new te0
            r2.<init>(r0, r8, r3, r5)
            r7.j = r4
            java.lang.Object r7 = defpackage.nj2.K(r1, r2, r7)
            if (r7 != r6) goto L4b
        L4a:
            return r6
        L4b:
            ll2 r7 = defpackage.ll2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    private final Object u(Object obj) throws Throwable {
        Throwable th;
        ge2 ge2Var;
        dd2 dd2Var = (dd2) this.l;
        int i = this.j;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        try {
            if (i == 0) {
                ix.Q(obj);
                fe2 fe2Var = dd2Var.v;
                if (fe2Var != null) {
                    this.j = 1;
                    if (fe2Var.h(this) == fzVar) {
                    }
                }
                return fzVar;
            }
            if (i == 1) {
                ix.Q(obj);
            } else if (i == 2) {
                ix.Q(obj);
                ge2Var = dd2Var.w;
                if (ge2Var != null) {
                    this.j = 3;
                    ge2Var.h(this);
                    if (ll2Var == fzVar) {
                        return fzVar;
                    }
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.k;
                    ix.Q(obj);
                    throw th;
                }
                ix.Q(obj);
            }
            return ll2Var;
            wc2 wc2Var = (wc2) this.m;
            this.j = 2;
            if (wc2Var.a(dd2Var, this) != fzVar) {
                ge2Var = dd2Var.w;
                if (ge2Var != null) {
                    this.j = 3;
                    ge2Var.h(this);
                    if (ll2Var == fzVar) {
                    }
                }
                return ll2Var;
            }
        } catch (Throwable th2) {
            ge2 ge2Var2 = dd2Var.w;
            if (ge2Var2 == null) {
                throw th2;
            }
            this.k = th2;
            this.j = 4;
            ge2Var2.h(this);
            if (ll2Var != fzVar) {
                th = th2;
            }
            return fzVar;
        }
        return fzVar;
    }

    private final Object v(Object obj) {
        ta1 ta1Var;
        tu tuVar = (tu) this.m;
        int i = this.j;
        if (i == 0) {
            ix.Q(obj);
            fz1 fz1Var = (fz1) tuVar;
            fz1Var.getClass();
            ((k72) oi2.b.getValue()).c(fz1Var, oi2.a, fz1Var.g);
            ta1 ta1Var2 = fz1Var.j;
            this.k = ta1Var2;
            this.l = tuVar;
            this.j = 1;
            Object objD = ta1Var2.d(this);
            fz fzVar = fz.e;
            if (objD == fzVar) {
                return fzVar;
            }
            ta1Var = ta1Var2;
        } else {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuVar = (tu) this.l;
            ta1Var = (ta1) this.k;
            ix.Q(obj);
        }
        try {
            ((fz1) tuVar).d = ((fz1) tuVar).b.getValue();
            om omVar = ((fz1) tuVar).i;
            if (omVar != null) {
                omVar.i(((fz1) tuVar).b.getValue());
            }
            ((fz1) tuVar).i = null;
            return ll2.a;
        } finally {
            ta1Var.b(null);
        }
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 1:
                return ((g) p((sx) obj2, (gq1) obj)).r(ll2Var);
            case 2:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 3:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 4:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 5:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 6:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 7:
                return ((g) p((sx) obj2, (xx1) obj)).r(ll2Var);
            case 8:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 9:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 10:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 11:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 12:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 13:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 14:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 15:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 16:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 17:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 18:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 19:
                return ((g) p((sx) obj2, (sy1) obj)).r(ll2Var);
            case 20:
                return ((g) p((sx) obj2, (xx1) obj)).r(ll2Var);
            case 21:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 22:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 23:
                return ((g) p((sx) obj2, (gq1) obj)).r(ll2Var);
            case 24:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 25:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 26:
                return ((g) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                return ((g) p((sx) obj2, (yh2) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new g((f91) this.k, (qp1) this.l, (e60) obj2, sxVar, 0);
            case 1:
                g gVar = new g(1, sxVar, (ki2) this.l, (da1) obj2);
                gVar.k = obj;
                return gVar;
            case 2:
                g gVar2 = new g(2, sxVar, (xg) this.l, (Uri) obj2);
                gVar2.k = obj;
                return gVar2;
            case 3:
                return new g((ej0) this.k, (ph) this.l, (ij0) obj2, sxVar, 3);
            case 4:
                return new g(4, sxVar, (s82) this.l, (mh2) obj2);
            case 5:
                return new g((jk) this.k, (me1) this.l, (v4) obj2, sxVar, 5);
            case 6:
                g gVar3 = new g(6, sxVar, (qe0) this.l, (no) obj2);
                gVar3.k = obj;
                return gVar3;
            case 7:
                g gVar4 = new g(7, sxVar, (l30) this.l, (ij0) obj2);
                gVar4.k = obj;
                return gVar4;
            case 8:
                return new g((l30) this.k, (ia1) this.l, (ij0) obj2, sxVar, 8);
            case 9:
                g gVar5 = new g(9, sxVar, (ur0) this.l, (he0) obj2);
                gVar5.k = obj;
                return gVar5;
            case 10:
                return new g((uy) this.k, (pe0) this.l, (gq1) obj2, sxVar, 10);
            case 11:
                return new g((f91) this.k, (tr0) this.l, (e60) obj2, sxVar, 11);
            case 12:
                return new g(12, sxVar, (zk) obj2);
            case 13:
                return new g(13, sxVar, (f41) obj2);
            case 14:
                return new g((f41) this.k, (g22) this.l, (ArrayList) obj2, sxVar, 14);
            case 15:
                return new g((fz1) this.k, (da1) this.l, (zj1) obj2, sxVar, 15);
            case 16:
                return new g(16, sxVar, (gs1) this.l, (io1) obj2);
            case 17:
                g gVar6 = new g(17, sxVar, (qr1) this.l, (aa) obj2);
                gVar6.k = obj;
                return gVar6;
            case 18:
                g gVar7 = new g(18, sxVar, (ls) this.l, (ij0) obj2);
                gVar7.k = obj;
                return gVar7;
            case 19:
                g gVar8 = new g(19, sxVar, (z70) this.l, (uy1) obj2);
                gVar8.k = obj;
                return gVar8;
            case 20:
                g gVar9 = new g(20, sxVar, (uy1) this.l, (ij0) obj2);
                gVar9.k = obj;
                return gVar9;
            case 21:
                g gVar10 = new g(21, sxVar, (p82) this.l, (ia) obj2);
                gVar10.k = obj;
                return gVar10;
            case 22:
                return new g((String) this.k, (x52) this.l, (ph) obj2, sxVar, 22);
            case 23:
                g gVar11 = new g(23, sxVar, (uy) this.l, (pe0) obj2);
                gVar11.k = obj;
                return gVar11;
            case 24:
                g gVar12 = new g(24, sxVar, (ot0) this.l, (ij0) obj2);
                gVar12.k = obj;
                return gVar12;
            case 25:
                return new g(25, sxVar, (dd2) this.l, (wc2) obj2);
            case 26:
                return new g(26, sxVar, (tu) obj2);
            default:
                g gVar13 = new g(27, sxVar, (ij2) obj2);
                gVar13.l = obj;
                return gVar13;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0545 */
    /* JADX WARN: Code duplicated, block: B:298:0x0568  */
    /* JADX WARN: Code duplicated, block: B:301:0x0572 A[Catch: all -> 0x0545, TryCatch #5 {, blocks: (B:289:0x053f, B:299:0x056a, B:301:0x0572, B:302:0x0580, B:310:0x0591, B:296:0x055b, B:312:0x0594, B:314:0x0599, B:315:0x059a, B:295:0x0556, B:303:0x0581, B:305:0x0587), top: B:602:0x0532, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0587 A[Catch: all -> 0x0598, TRY_LEAVE, TryCatch #12 {all -> 0x0598, blocks: (B:303:0x0581, B:305:0x0587), top: B:615:0x0581, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0594 A[Catch: all -> 0x0545, TryCatch #5 {, blocks: (B:289:0x053f, B:299:0x056a, B:301:0x0572, B:302:0x0580, B:310:0x0591, B:296:0x055b, B:312:0x0594, B:314:0x0599, B:315:0x059a, B:295:0x0556, B:303:0x0581, B:305:0x0587), top: B:602:0x0532, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:449:0x0827  */
    /* JADX WARN: Code duplicated, block: B:615:0x0581 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:305:0x0587, B:309:0x0590], limit reached: 672 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v37, types: [lo] */
    /* JADX WARN: Type inference failed for: r3v39, types: [zk] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [lo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:297:0x0566 -> B:299:0x056a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 2726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, sx sxVar, Object obj, Object obj2) {
        super(2, sxVar);
        this.i = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, sx sxVar, Object obj) {
        super(2, sxVar);
        this.i = i;
        this.m = obj;
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pi0 extends wa2 implements jj0 {
    public final /* synthetic */ int i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi0(int i, sx sxVar, Object obj) {
        super(3, sxVar);
        this.i = i;
        this.l = obj;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj4 = this.l;
        List list = (List) obj;
        List list2 = (List) obj2;
        sx sxVar = (sx) obj3;
        switch (i) {
            case 0:
                pi0 pi0Var = new pi0(0, sxVar, (wm) obj4);
                pi0Var.j = list;
                pi0Var.k = list2;
                return pi0Var.r(ll2Var);
            default:
                pi0 pi0Var2 = new pi0(1, sxVar, (ls0) obj4);
                pi0Var2.j = list;
                pi0Var2.k = list2;
                return pi0Var2.r(ll2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5 A[LOOP:4: B:41:0x00ef->B:43:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v8 java.lang.Object, still in use, count: 2, list:
          (r6v8 java.lang.Object) from 0x00ae: PHI (r6 I:??) = (r6v1 java.lang.Object), (r6v8 java.lang.Object) binds: [B:27:0x00ad, B:63:0x00ae] A[DONT_GENERATE, DONT_INLINE]
          (r6v8 java.lang.Object) from 0x00a0: CHECK_CAST (u22) (r6v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi0.r(java.lang.Object):java.lang.Object");
    }
}

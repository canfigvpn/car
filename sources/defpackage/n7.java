package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n7 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(r42 r42Var, pe0 pe0Var, s82 s82Var, Object obj, sx sxVar) {
        super(2, sxVar);
        this.i = 6;
        this.l = r42Var;
        this.m = pe0Var;
        this.n = s82Var;
        this.k = obj;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) throws Throwable {
        int i = this.i;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                ((n7) p((sx) obj2, (j8) obj)).r(ll2Var);
                return fzVar;
            case 1:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 2:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 3:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 4:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 5:
                return ((n7) p((sx) obj2, (p42) obj)).r(ll2Var);
            case 6:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 7:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 8:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 9:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 10:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 11:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 12:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 13:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 14:
                ((n7) p((sx) obj2, (qe0) obj)).r(ll2Var);
                return fzVar;
            default:
                return ((n7) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                n7 n7Var = new n7((ej0) this.l, (o7) obj3, (z01) obj2, sxVar, 0);
                n7Var.k = obj;
                return n7Var;
            case 1:
                return new n7(this.k, (ia) this.l, (da1) obj3, (da1) obj2, sxVar, 1);
            case 2:
                return new n7(2, sxVar, (kn) obj3, (mn) obj2);
            case 3:
                return new n7((qu) this.k, (ScrollCaptureSession) this.l, (Rect) obj3, (Consumer) obj2, sxVar, 3);
            case 4:
                return new n7((q01) this.k, (ej0) this.l, (bm) obj3, (lr0) obj2, sxVar, 4);
            case 5:
                n7 n7Var2 = new n7((pe0) this.l, (s82) obj3, this.n, sxVar, 5);
                n7Var2.k = obj;
                return n7Var2;
            case 6:
                return new n7((r42) this.l, (pe0) obj3, (s82) obj2, this.k, sxVar);
            case 7:
                n7 n7Var3 = new n7((fz1) this.l, (kb1) obj3, (ki2) obj2, sxVar, 7);
                n7Var3.k = obj;
                return n7Var3;
            case 8:
                return new n7(8, sxVar, (en1) obj3, (ij0) obj2);
            case 9:
                return new n7(9, sxVar, (ta1) obj3, (g) obj2);
            case 10:
                n7 n7Var4 = new n7((b21) this.l, (r11) obj3, (g) obj2, sxVar, 10);
                n7Var4.k = obj;
                return n7Var4;
            case 11:
                n7 n7Var5 = new n7((bv1) this.l, (om) obj3, (cv1) obj2, sxVar, 11);
                n7Var5.k = obj;
                return n7Var5;
            case 12:
                n7 n7Var6 = new n7((ej0) this.l, (AtomicReference) obj3, (ij0) obj2, sxVar, 12);
                n7Var6.k = obj;
                return n7Var6;
            case 13:
                n7 n7Var7 = new n7((ao1) this.l, (jj0) obj3, (wx) obj2, sxVar, 13);
                n7Var7.k = obj;
                return n7Var7;
            case 14:
                n7 n7Var8 = new n7((ij2) this.l, (int[]) obj3, (String[]) obj2, sxVar, 14);
                n7Var8.k = obj;
                return n7Var8;
            default:
                return new n7((gs1) this.k, (rr1) this.l, (y11) obj3, (tq2) obj2, sxVar, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:213:0x03db  */
    /* JADX WARN: Code duplicated, block: B:340:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:341:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:343:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:347:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:431:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0216, code lost:
    
        if (r2 == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0228, code lost:
    
        if (r3 == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x042a, code lost:
    
        if (r0 == r11) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0463, code lost:
    
        if (defpackage.c12.b(r3, 0.0f, r5, r3, r32, 4) == r11) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0466, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x049e, code lost:
    
        if (r11.a(r12, r32) == r0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04be, code lost:
    
        if (r11.a(r12, r32) == r0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04db, code lost:
    
        if (defpackage.sv.u(r1, r10, r32) == r0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0681, code lost:
    
        if (r3 == r10) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x06c2, code lost:
    
        if (r2 == r10) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [y11] */
    /* JADX WARN: Type inference failed for: r2v110, types: [y11] */
    /* JADX WARN: Type inference failed for: r2v112, types: [b21] */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v78, types: [int] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v91 */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(int i, sx sxVar, Object obj, Object obj2) {
        super(2, sxVar);
        this.i = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(Object obj, Object obj2, Object obj3, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(Object obj, Object obj2, Object obj3, Object obj4, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }
}

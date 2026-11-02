package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class s82 extends n0 implements pe0, uj0, q82, aa1 {
    public static final /* synthetic */ long j = we.a.objectFieldOffset(s82.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int i;

    public s82(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e8 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:32:0x007c, B:34:0x0086, B:37:0x008d, B:38:0x0091, B:40:0x0094, B:50:0x00b5, B:53:0x00c5, B:54:0x00e1, B:60:0x00f1, B:57:0x00e8, B:59:0x00ee, B:42:0x009a, B:46:0x00a1, B:65:0x00fb, B:66:0x0100, B:21:0x004b), top: B:69:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[LOOP:0: B:54:0x00e1->B:75:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [t82] */
    /* JADX WARN: Type inference failed for: r1v6, types: [t82] */
    /* JADX WARN: Type inference failed for: r1v7, types: [t82] */
    /* JADX WARN: Type inference failed for: r1v9, types: [t82] */
    /* JADX WARN: Type inference failed for: r8v1, types: [n0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00c4 -> B:31:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.pe0
    public final java.lang.Object a(defpackage.qe0 r14, defpackage.sx r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s82.a(qe0, sx):java.lang.Object");
    }

    @Override // defpackage.uj0
    public final pe0 b(uy uyVar, int i, vk vkVar) {
        return (((i < 0 || i >= 2) && i != -2) || vkVar != vk.f) ? ws0.v(this, uyVar, i, vkVar) : this;
    }

    @Override // defpackage.n0
    public final o0 d() {
        return new t82();
    }

    @Override // defpackage.n0
    public final o0[] e() {
        return new t82[2];
    }

    @Override // defpackage.q82
    public final Object getValue() {
        pa0 pa0Var = s5.J;
        Object objectVolatile = we.a.getObjectVolatile(this, j);
        if (objectVolatile == pa0Var) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean h(Object obj, Object obj2) {
        pa0 pa0Var = s5.J;
        if (obj == null) {
            obj = pa0Var;
        }
        if (obj2 == null) {
            obj2 = pa0Var;
        }
        return j(obj, obj2);
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = s5.J;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i;
        o0[] o0VarArr;
        pa0 pa0Var;
        synchronized (this) {
            Unsafe unsafe = we.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (obj != null && !ws0.j(objectVolatile, obj)) {
                return false;
            }
            if (ws0.j(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j2, obj2);
            int i2 = this.i;
            if ((i2 & 1) != 0) {
                this.i = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.i = i3;
            o0[] o0VarArr2 = this.e;
            while (true) {
                t82[] t82VarArr = (t82[]) o0VarArr2;
                if (t82VarArr != null) {
                    for (t82 t82Var : t82VarArr) {
                        if (t82Var != null) {
                            AtomicReference atomicReference = t82Var.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (pa0Var = j20.R)) {
                                    break;
                                }
                                pa0 pa0Var2 = j20.Q;
                                if (obj3 != pa0Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, pa0Var2)) {
                                            ((om) obj3).i(ll2.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, pa0Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.i;
                    if (i == i3) {
                        this.i = i3 + 1;
                        return true;
                    }
                    o0VarArr = this.e;
                }
                o0VarArr2 = o0VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        i(obj);
        return ll2.a;
    }
}

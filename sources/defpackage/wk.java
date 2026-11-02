package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wk implements jo2 {
    public Object e = bl.p;
    public om f;
    public final /* synthetic */ zk g;

    public wk(zk zkVar) {
        this.g = zkVar;
    }

    @Override // defpackage.jo2
    public final void a(gz1 gz1Var, int i) {
        om omVar = this.f;
        if (omVar != null) {
            omVar.a(gz1Var, i);
        }
    }

    public final Object b(tx txVar) {
        xo xoVarJ;
        Object obj = this.e;
        boolean z = true;
        if (obj == bl.p || obj == bl.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zk.j;
            zk zkVar = this.g;
            xo xoVar = (xo) atomicReferenceFieldUpdater.get(zkVar);
            while (!zkVar.v()) {
                long andIncrement = zk.g.getAndIncrement(zkVar);
                long j = bl.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (xoVar.d != j2) {
                    xoVarJ = zkVar.j(j2, xoVar);
                    if (xoVarJ == null) {
                        continue;
                    }
                } else {
                    xoVarJ = xoVar;
                }
                Object objI = zkVar.I(xoVarJ, i, andIncrement, null);
                pa0 pa0Var = bl.m;
                if (objI == pa0Var) {
                    fu1.h("unreachable");
                    return null;
                }
                pa0 pa0Var2 = bl.o;
                if (objI == pa0Var2) {
                    if (andIncrement < zkVar.r()) {
                        xoVarJ.a();
                    }
                    xoVar = xoVarJ;
                } else {
                    if (objI == bl.n) {
                        zk zkVar2 = this.g;
                        om omVarW = dv1.w(ex.y(txVar));
                        try {
                            this.f = omVarW;
                            Object objI2 = zkVar2.I(xoVarJ, i, andIncrement, this);
                            if (objI2 != pa0Var) {
                                if (objI2 == pa0Var2) {
                                    if (andIncrement < zkVar2.r()) {
                                        xoVarJ.a();
                                    }
                                    xo xoVar2 = (xo) zk.j.get(zkVar2);
                                    while (true) {
                                        if (zkVar2.v()) {
                                            om omVar = this.f;
                                            omVar.getClass();
                                            this.f = null;
                                            this.e = bl.l;
                                            Throwable thN = zkVar.n();
                                            if (thN != null) {
                                                omVar.i(new ut1(thN));
                                                break;
                                            }
                                            omVar.i(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = zk.g.getAndIncrement(zkVar2);
                                        long j3 = bl.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (xoVar2.d != j4) {
                                            xo xoVarJ2 = zkVar2.j(j4, xoVar2);
                                            if (xoVarJ2 != null) {
                                                xoVar2 = xoVarJ2;
                                            }
                                        }
                                        Object objI3 = zkVar2.I(xoVar2, i2, andIncrement2, this);
                                        if (objI3 == bl.m) {
                                            a(xoVar2, i2);
                                            break;
                                        }
                                        if (objI3 == bl.o) {
                                            if (andIncrement2 < zkVar2.r()) {
                                                xoVar2.a();
                                            }
                                        } else {
                                            if (objI3 == bl.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            xoVar2.a();
                                            this.e = objI3;
                                            this.f = null;
                                        }
                                    }
                                } else {
                                    xoVarJ.a();
                                    this.e = objI2;
                                    this.f = null;
                                }
                                omVarW.m(Boolean.TRUE, null);
                                break;
                            }
                            a(xoVarJ, i);
                            return omVarW.t();
                        } catch (Throwable th) {
                            omVarW.D();
                            throw th;
                        }
                    }
                    xoVarJ.a();
                    this.e = objI;
                }
            }
            this.e = bl.l;
            Throwable thN2 = zkVar.n();
            if (thN2 != null) {
                int i3 = i82.a;
                throw thN2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.e;
        pa0 pa0Var = bl.p;
        if (obj == pa0Var) {
            fu1.h("`hasNext()` has not been invoked");
            return null;
        }
        this.e = pa0Var;
        if (obj != bl.l) {
            return obj;
        }
        Throwable thO = this.g.o();
        int i = i82.a;
        throw thO;
    }
}

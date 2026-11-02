package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 implements nm, jo2 {
    public final om e;
    public final /* synthetic */ ta1 f;

    public sa1(ta1 ta1Var, om omVar) {
        this.f = ta1Var;
        this.e = omVar;
    }

    @Override // defpackage.jo2
    public final void a(gz1 gz1Var, int i) {
        this.e.a(gz1Var, i);
    }

    @Override // defpackage.sx
    public final uy f() {
        return this.e.i;
    }

    @Override // defpackage.sx
    public final void i(Object obj) throws IllegalAccessException, InvocationTargetException {
        this.e.i(obj);
    }

    @Override // defpackage.nm
    public final void m(Object obj, jj0 jj0Var) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ta1.m;
        ta1 ta1Var = this.f;
        atomicReferenceFieldUpdater.set(ta1Var, null);
        m mVar = new m(21, ta1Var, this);
        om omVar = this.e;
        omVar.E(ll2.a, omVar.g, new ji0(3, mVar));
    }

    @Override // defpackage.nm
    public final pa0 n(Object obj, jj0 jj0Var) {
        ta1 ta1Var = this.f;
        ji0 ji0Var = new ji0(ta1Var, this);
        pa0 pa0VarN = this.e.n((ll2) obj, ji0Var);
        if (pa0VarN != null) {
            ta1.m.set(ta1Var, null);
        }
        return pa0VarN;
    }

    @Override // defpackage.nm
    public final boolean o(Throwable th) {
        return this.e.o(th);
    }

    @Override // defpackage.nm
    public final void y(Object obj) {
        this.e.y(obj);
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wp1 extends tq {
    public final vp1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(mv0 mv0Var) {
        super(mv0Var);
        mv0Var.getClass();
        this.b = new vp1(mv0Var.c());
    }

    @Override // defpackage.o, defpackage.mv0
    public final Object a(n20 n20Var) {
        return i(n20Var);
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return this.b;
    }

    @Override // defpackage.tq, defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        int iH = h(obj);
        vp1 vp1Var = this.b;
        p61 p61VarU = p61Var.u(vp1Var);
        o(p61VarU, obj, iH);
        p61VarU.T(vp1Var);
    }

    @Override // defpackage.o
    public final Object e() {
        return (up1) k(n());
    }

    @Override // defpackage.o
    public final int f(Object obj) {
        up1 up1Var = (up1) obj;
        up1Var.getClass();
        return up1Var.d();
    }

    @Override // defpackage.o
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.o
    public final Object l(Object obj) {
        up1 up1Var = (up1) obj;
        up1Var.getClass();
        return up1Var.a();
    }

    @Override // defpackage.tq
    public final void m(int i, Object obj, Object obj2) {
        ((up1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(p61 p61Var, Object obj, int i);
}

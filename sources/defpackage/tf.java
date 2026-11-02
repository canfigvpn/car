package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tf extends t71 {
    public og2 s;
    public final /* synthetic */ uf t;

    public tf(uf ufVar) {
        this.t = ufVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void F0() {
        d dVar = new d(3, this, this.t);
        ax0 ax0VarV = qx.V(this);
        int i = ax0VarV.f;
        as1 rectManager = ((e5) dx0.a(ax0VarV)).getRectManager();
        pg2 pg2Var = rectManager.c;
        pg2Var.getClass();
        d91 d91Var = pg2Var.a;
        og2 og2Var = new og2(pg2Var, i, this, dVar);
        Object objB = d91Var.b(i);
        if (objB == null) {
            d91Var.h(i, og2Var);
            objB = og2Var;
        }
        og2 og2Var2 = (og2) objB;
        if (og2Var2 != og2Var) {
            while (true) {
                og2 og2Var3 = og2Var2.d;
                if (og2Var3 == null) {
                    break;
                } else {
                    og2Var2 = og2Var3;
                }
            }
            og2Var2.d = og2Var;
        }
        if (qx.V(this.e).k) {
            rectManager.b.h(i, true);
        }
        rectManager.e = true;
        rectManager.i();
        this.s = og2Var;
    }

    @Override // defpackage.t71
    public final void x0() {
        uf ufVar = this.t;
        ufVar.a = this;
        if (ufVar.b != null) {
            F0();
        }
    }

    @Override // defpackage.t71
    public final void y0() {
        uf ufVar = this.t;
        if (ufVar.a == this) {
            ufVar.a = null;
        }
        og2 og2Var = this.s;
        if (og2Var != null) {
            og2Var.b();
        }
        this.s = null;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u92 extends y71 {
    public final a70 a;

    public u92(a70 a70Var) {
        this.a = a70Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u92)) {
            return false;
        }
        u92 u92Var = (u92) obj;
        k8 k8Var = sv0.j0;
        return k8Var.equals(k8Var) && ws0.j(this.a, u92Var.a);
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new v92(sv0.j0, this.a);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        v92 v92Var = (v92) t71Var;
        k8 k8Var = sv0.j0;
        if (!ws0.j(v92Var.t, k8Var)) {
            v92Var.t = k8Var;
            if (v92Var.u) {
                v92Var.H0();
            }
        }
        v92Var.s = this.a;
    }

    public final int hashCode() {
        int iF = k3.f(1022 * 31, 31, false);
        a70 a70Var = this.a;
        return iF + (a70Var != null ? a70Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + sv0.j0 + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}

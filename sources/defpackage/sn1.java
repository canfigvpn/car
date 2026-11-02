package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sn1 extends y71 {
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
        if (!(obj instanceof sn1)) {
            return false;
        }
        k8 k8Var = p61.C;
        return k8Var.equals(k8Var);
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new tn1(p61.C, null);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        tn1 tn1Var = (tn1) t71Var;
        k8 k8Var = p61.C;
        if (ws0.j(tn1Var.t, k8Var)) {
            return;
        }
        tn1Var.t = k8Var;
        if (tn1Var.u) {
            tn1Var.H0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (p61.C.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + p61.C + ", overrideDescendants=false)";
    }
}

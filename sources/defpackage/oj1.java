package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class oj1 extends y71 {
    public final nj1 a;
    public final is1 b;
    public final yi c;

    public oj1(nj1 nj1Var, is1 is1Var, yi yiVar) {
        this.a = nj1Var;
        this.b = is1Var;
        this.c = yiVar;
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
        if (!(obj instanceof oj1)) {
            return false;
        }
        oj1 oj1Var = (oj1) obj;
        if (!ws0.j(this.a, oj1Var.a)) {
            return false;
        }
        wi wiVar = q90.j;
        return wiVar.equals(wiVar) && this.b.equals(oj1Var.b) && Float.compare(1.0f, 1.0f) == 0 && ws0.j(this.c, oj1Var.c);
    }

    @Override // defpackage.y71
    public final t71 f() {
        wi wiVar = q90.j;
        pj1 pj1Var = new pj1();
        pj1Var.s = this.a;
        pj1Var.t = true;
        pj1Var.u = wiVar;
        pj1Var.v = this.b;
        pj1Var.w = 1.0f;
        pj1Var.x = this.c;
        return pj1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        pj1 pj1Var = (pj1) t71Var;
        boolean z = pj1Var.t;
        nj1 nj1Var = this.a;
        boolean z2 = (z && d52.a(pj1Var.s.d(), nj1Var.d())) ? false : true;
        pj1Var.s = nj1Var;
        pj1Var.t = true;
        pj1Var.u = q90.j;
        pj1Var.v = this.b;
        pj1Var.w = 1.0f;
        pj1Var.x = this.c;
        if (z2) {
            rw.z(pj1Var);
        }
        vv.B(pj1Var);
    }

    public final int hashCode() {
        int iA = k3.a(1.0f, (this.b.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + k3.f(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        yi yiVar = this.c;
        return iA + (yiVar == null ? 0 : yiVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + q90.j + ", contentScale=" + this.b + ", alpha=1.0, colorFilter=" + this.c + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ri1 implements jj0 {
    public final /* synthetic */ te2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ io2 h;
    public final /* synthetic */ f91 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ij0 k;
    public final /* synthetic */ ij0 l;
    public final /* synthetic */ ij0 m;
    public final /* synthetic */ jd2 n;
    public final /* synthetic */ u32 o;

    public ri1(te2 te2Var, boolean z, boolean z2, io2 io2Var, f91 f91Var, boolean z3, ij0 ij0Var, ij0 ij0Var2, ij0 ij0Var3, jd2 jd2Var, u32 u32Var) {
        this.e = te2Var;
        this.f = z;
        this.g = z2;
        this.h = io2Var;
        this.i = f91Var;
        this.j = z3;
        this.k = ij0Var;
        this.l = ij0Var2;
        this.m = ij0Var3;
        this.n = jd2Var;
        this.o = u32Var;
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
    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        ij0 ij0Var = (ij0) obj;
        ak0 ak0Var = (ak0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ak0Var.h(ij0Var) ? 4 : 2;
        }
        if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
            q90 q90Var = q90.W;
            String str = this.e.a.f;
            u32 u32Var = this.o;
            boolean z = this.f;
            boolean z2 = this.j;
            f91 f91Var = this.i;
            jd2 jd2Var = this.n;
            q90Var.i(str, ij0Var, z, this.g, this.h, f91Var, z2, this.k, this.l, null, this.m, jd2Var, null, vs0.C(1409265477, new oi1(z, z2, f91Var, jd2Var, u32Var, 1), ak0Var), ak0Var, (iIntValue << 3) & 112);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

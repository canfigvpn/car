package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oa extends dw0 implements jj0 {
    public final /* synthetic */ h72 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ab h;
    public final /* synthetic */ gt i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(h72 h72Var, Object obj, ab abVar, gt gtVar) {
        super(3);
        this.f = h72Var;
        this.g = obj;
        this.h = abVar;
        this.i = gtVar;
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
    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        gb gbVar = (gb) obj;
        ak0 ak0Var = (ak0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ak0Var.f(gbVar) : ak0Var.h(gbVar) ? 4 : 2;
        }
        if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
            h72 h72Var = this.f;
            boolean zF = ak0Var.f(h72Var);
            Object obj4 = this.g;
            boolean zH = zF | ak0Var.h(obj4);
            ab abVar = this.h;
            boolean zH2 = zH | ak0Var.h(abVar);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (zH2 || objL == is1Var) {
                objL = new na(h72Var, obj4, abVar, 0);
                ak0Var.g0(objL);
            }
            s5.e(gbVar, (ej0) objL, ak0Var);
            w91 w91Var = abVar.d;
            gbVar.getClass();
            w91Var.m(obj4, ((hb) gbVar).a);
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = new ua();
                ak0Var.g0(objL2);
            }
            this.i.l((ua) objL2, obj4, ak0Var, 0);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

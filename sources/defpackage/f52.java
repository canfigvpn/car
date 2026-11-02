package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f52 {
    public static final gd0 a = new gd0(n50.f);
    public static final gd0 b;
    public static final gd0 c;
    public static final yq2 d;
    public static final yq2 e;
    public static final yq2 f;
    public static final yq2 g;

    static {
        n50 n50Var = n50.e;
        b = new gd0(n50Var);
        n50 n50Var2 = n50.g;
        c = new gd0(n50Var2);
        vi viVar = q90.p;
        int i = 4;
        d = new yq2(n50Var, new i72(i, viVar), viVar);
        vi viVar2 = q90.o;
        e = new yq2(n50Var, new i72(i, viVar2), viVar2);
        wi wiVar = q90.j;
        int i2 = 5;
        f = new yq2(n50Var2, new i72(i2, wiVar), wiVar);
        wi wiVar2 = q90.f;
        g = new yq2(n50Var2, new i72(i2, wiVar2), wiVar2);
    }

    public static final u71 a(u71 u71Var, float f2, float f3) {
        return u71Var.c(new sl2(f2, f3));
    }

    public static u71 b(u71 u71Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(u71Var, f2, f3);
    }

    public static final u71 c(u71 u71Var, float f2) {
        return u71Var.c(new e52(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final u71 d(u71 u71Var, float f2, float f3) {
        return u71Var.c(new e52(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static u71 e(u71 u71Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return d(u71Var, f2, f3);
    }

    public static final u71 f(u71 u71Var, float f2) {
        return u71Var.c(new e52(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final u71 g(u71 u71Var, float f2, float f3) {
        return u71Var.c(new e52(f2, f3, f2, f3, false));
    }

    public static u71 h(u71 u71Var, float f2, float f3, float f4, float f5, int i) {
        return u71Var.c(new e52(f2, (i & 2) != 0 ? Float.NaN : f3, (i & 4) != 0 ? Float.NaN : f4, (i & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final u71 i(float f2) {
        return new e52(f2, 0.0f, f2, 0.0f, false, 10);
    }

    public static final u71 j(float f2) {
        return new e52(f2, f2, f2, f2, true);
    }

    public static final u71 k(u71 u71Var, float f2, float f3) {
        return u71Var.c(new e52(f2, f3, f2, f3, true));
    }

    public static final u71 l(u71 u71Var, float f2, float f3, float f4, float f5) {
        return u71Var.c(new e52(f2, f3, f4, f5, true));
    }

    public static u71 m(u71 u71Var, float f2, float f3, float f4, int i) {
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f4 = Float.NaN;
        }
        return l(u71Var, f2, f3, f4, Float.NaN);
    }

    public static final u71 n(u71 u71Var, float f2) {
        return u71Var.c(new e52(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static u71 o(u71 u71Var) {
        yq2 yq2Var;
        vi viVar = q90.p;
        if (ws0.j(viVar, viVar)) {
            yq2Var = d;
        } else if (ws0.j(viVar, q90.o)) {
            yq2Var = e;
        } else {
            yq2Var = new yq2(n50.e, new i72(4, viVar), viVar);
        }
        return u71Var.c(yq2Var);
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
    public static u71 p(u71 u71Var, int i) {
        yq2 yq2Var;
        wi wiVar = q90.j;
        if (wiVar.equals(wiVar)) {
            yq2Var = f;
        } else if (wiVar.equals(q90.f)) {
            yq2Var = g;
        } else {
            yq2Var = new yq2(n50.g, new i72(5, wiVar), wiVar);
        }
        return u71Var.c(yq2Var);
    }
}

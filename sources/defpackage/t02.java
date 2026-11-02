package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t02 {
    public final ax0 a;
    public final eb0 b;
    public final gr0 c;
    public final p91 d = new p91(2);

    public t02(ax0 ax0Var, eb0 eb0Var, d91 d91Var) {
        this.a = ax0Var;
        this.b = eb0Var;
        this.c = d91Var;
    }

    public final p02 a() {
        return new p02(this.b, false, this.a, new i02());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
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
    public final void b(ax0 ax0Var, i02 i02Var) {
        String str;
        String strP;
        ch2 ch2Var;
        ch2 ch2Var2;
        y6 y6Var;
        p91 p91Var = this.d;
        Object[] objArr = p91Var.a;
        int i = p91Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            h4 h4Var = (h4) objArr[i2];
            qk1 qk1Var = h4Var.e;
            e5 e5Var = h4Var.g;
            i02 i02VarW = ax0Var.w();
            int i3 = ax0Var.f;
            y6 y6Var2 = null;
            if (i02Var != null) {
                Object objG = i02Var.e.g(u02.F);
                if (objG == null) {
                    objG = null;
                }
                yb ybVar = (yb) objG;
                if (ybVar != null) {
                    str = ybVar.f;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (i02VarW != null) {
                Object objG2 = i02VarW.e.g(u02.F);
                if (objG2 == null) {
                    objG2 = null;
                }
                yb ybVar2 = (yb) objG2;
                if (ybVar2 != null) {
                    strP = ybVar2.f;
                } else {
                    strP = null;
                }
            } else {
                strP = null;
            }
            if (str != strP) {
                if (str == null) {
                    qk1Var.B(e5Var, i3, true);
                } else if (strP == null) {
                    qk1Var.B(e5Var, i3, false);
                } else if (ws0.j((b6) j02.o(i02VarW, u02.s), q90.y)) {
                    if (strP.length() >= 5000) {
                        strP = (Character.isHighSurrogate(strP.charAt(4999)) && Character.isLowSurrogate(strP.charAt(5000))) ? h92.P(strP, 4999) : h92.P(strP, 5000);
                    }
                    ((AutofillManager) qk1Var.f).notifyValueChanged(e5Var, i3, AutofillValue.forText(strP));
                }
            }
            if (i02Var != null) {
                Object objG3 = i02Var.e.g(u02.K);
                if (objG3 == null) {
                    objG3 = null;
                }
                ch2Var = (ch2) objG3;
            } else {
                ch2Var = null;
            }
            if (i02VarW != null) {
                Object objG4 = i02VarW.e.g(u02.K);
                if (objG4 == null) {
                    objG4 = null;
                }
                ch2Var2 = (ch2) objG4;
            } else {
                ch2Var2 = null;
            }
            if (ch2Var != ch2Var2) {
                if (ch2Var == null) {
                    qk1Var.B(e5Var, i3, true);
                } else if (ch2Var2 == null) {
                    qk1Var.B(e5Var, i3, false);
                } else if (ws0.j((b6) j02.o(i02VarW, u02.s), q90.z)) {
                    int iOrdinal = ch2Var2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        ((AutofillManager) qk1Var.f).notifyValueChanged(e5Var, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (i02Var != null) {
                Object objG5 = i02Var.e.g(u02.t);
                if (objG5 == null) {
                    objG5 = null;
                }
                y6Var = (y6) objG5;
            } else {
                y6Var = null;
            }
            if (i02VarW != null) {
                Object objG6 = i02VarW.e.g(u02.t);
                y6Var2 = (y6) (objG6 != null ? objG6 : null);
            }
            if (!ws0.j(y6Var, y6Var2)) {
                if (y6Var == null) {
                    qk1Var.B(e5Var, i3, true);
                } else if (y6Var2 == null) {
                    qk1Var.B(e5Var, i3, false);
                } else {
                    ((AutofillManager) qk1Var.f).notifyValueChanged(e5Var, i3, y6Var2.a);
                }
            }
            boolean z = i02Var != null && i02Var.e.b(u02.r);
            boolean z2 = i02VarW != null && i02VarW.e.b(u02.r);
            if (z != z2) {
                e91 e91Var = h4Var.l;
                if (z2) {
                    e91Var.a(i3);
                } else {
                    e91Var.e(i3);
                }
            }
        }
    }
}

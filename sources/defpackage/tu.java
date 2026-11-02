package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tu {
    public final Object a;

    public tu(int i) {
        switch (i) {
            case 1:
                d91 d91Var = hr0.a;
                this.a = new d91();
                break;
            case 2:
                this.a = new Object();
                break;
            case 3:
                this.a = y12.s(Boolean.FALSE);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public boolean a(int i, ck0 ck0Var, Object obj) {
        ArrayList arrayList = ck0Var.a;
        if (arrayList == null) {
            b(i, ck0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof vj0)) {
                if (!(obj2 instanceof ck0)) {
                    qj.i(obj2, "Unexpected child source info ");
                    break;
                }
                if (a(i, (ck0) obj2, obj)) {
                    b(0, ck0Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, ck0Var, obj2);
                return true;
            }
        }
        return false;
    }

    public void b(int i, ck0 ck0Var, Object obj) {
        ((ArrayList) this.a).add(new uu(i, null, null));
    }

    public abstract void c(k12 k12Var);

    public abstract void d();

    public abstract void e();

    public abstract Object f();

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
    public List g(mz0 mz0Var, int i, long j) {
        d91 d91Var = (d91) this.a;
        List list = (List) d91Var.b(i);
        if (list != null) {
            return list;
        }
        jz0 jz0Var = mz0Var.g;
        d91 d91Var2 = mz0Var.h;
        List listF = (List) d91Var2.b(i);
        if (listF == null) {
            Object objB = jz0Var.b(i);
            listF = mz0Var.f.F(mz0Var.e.a(i, objB, jz0Var.c(i)), objB);
            d91Var2.h(i, listF);
        }
        int size = listF.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((r61) listF.get(i2)).e(j));
        }
        d91Var.h(i, arrayList);
        return arrayList;
    }

    public abstract Object h();

    public void i(int i, Object obj, ck0 ck0Var, Object obj2) {
        if (ws0.j(obj, cv.a)) {
            b(i, ck0Var, null);
        }
    }

    public abstract ej0 j(k12 k12Var);

    public abstract void k(Object obj);

    public abstract void l(ki2 ki2Var);

    public abstract void m();
}

package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sh implements sx, gz, Serializable {
    public final sx e;

    public sh(sx sxVar) {
        this.e = sxVar;
    }

    @Override // defpackage.gz
    public gz e() {
        sx sxVar = this.e;
        if (sxVar instanceof gz) {
            return (gz) sxVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.sx
    public final void i(Object obj) {
        ?? r2 = this;
        while (true) {
            sh shVar = (sh) r2;
            sx sxVar = shVar.e;
            sxVar.getClass();
            try {
                obj = shVar.r(obj);
                if (obj == fz.e) {
                    return;
                }
            } catch (Throwable th) {
                obj = new ut1(th);
            }
            shVar.s();
            if (!(sxVar instanceof sh)) {
                sxVar.i(obj);
                return;
            }
            r2 = sxVar;
        }
    }

    public sx p(sx sxVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement q() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        i20 i20Var = (i20) getClass().getAnnotation(i20.class);
        String str = null;
        if (i20Var == null || i20Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? i20Var.l()[iIntValue] : -1;
        ud udVar = dv1.o;
        ud udVar2 = dv1.p;
        if (udVar2 == null) {
            try {
                ud udVar3 = new ud(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 10);
                dv1.p = udVar3;
                udVar2 = udVar3;
            } catch (Exception unused2) {
                dv1.p = udVar;
                udVar2 = udVar;
            }
        }
        if (udVar2 != udVar && (method = (Method) udVar2.b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) udVar2.c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) udVar2.d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = i20Var.c();
        } else {
            strC = str + '/' + i20Var.c();
        }
        return new StackTraceElement(strC, i20Var.m(), i20Var.f(), i);
    }

    public abstract Object r(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objQ = q();
        if (objQ == null) {
            objQ = getClass().getName();
        }
        sb.append(objQ);
        return sb.toString();
    }

    public void s() {
    }
}

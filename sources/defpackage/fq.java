package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fq {
    public static final fq c = new fq();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, eq eqVar, q11 q11Var, Class cls) {
        q11 q11Var2 = (q11) map.get(eqVar);
        if (q11Var2 == null || q11Var == q11Var2) {
            if (q11Var2 == null) {
                map.put(eqVar, q11Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + eqVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + String.valueOf(q11Var2) + ", new value " + String.valueOf(q11Var));
    }

    public final dq a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            dq dqVarA = (dq) map2.get(superclass);
            if (dqVarA == null) {
                dqVarA = a(superclass, null);
            }
            map.putAll(dqVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            dq dqVarA2 = (dq) map2.get(cls2);
            if (dqVarA2 == null) {
                dqVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : dqVarA2.b.entrySet()) {
                b(map, (eq) entry.getKey(), (q11) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ng1 ng1Var = (ng1) method.getAnnotation(ng1.class);
            if (ng1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!y11.class.isAssignableFrom(parameterTypes[0])) {
                        qj.r("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                q11 q11VarValue = ng1Var.value();
                if (parameterTypes.length > 1) {
                    if (!q11.class.isAssignableFrom(parameterTypes[1])) {
                        qj.r("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (q11VarValue != q11.ON_ANY) {
                        qj.r("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    qj.r("cannot have more than 2 params");
                    return null;
                }
                b(map, new eq(i, method), q11VarValue, cls);
                z = true;
            }
        }
        dq dqVar = new dq(map);
        map2.put(cls, dqVar);
        this.b.put(cls, Boolean.valueOf(z));
        return dqVar;
    }
}

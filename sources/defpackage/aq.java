package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aq implements yp {
    public static final Map b;
    public final Class a;

    static {
        List listV = vs0.v(ti0.class, ej0.class, ij0.class, jj0.class, kj0.class, lj0.class, mj0.class, nj0.class, oj0.class, pj0.class, ui0.class, vi0.class, wi0.class, xi0.class, yi0.class, zi0.class, aj0.class, bj0.class, cj0.class, dj0.class, fj0.class, gj0.class, hj0.class);
        ArrayList arrayList = new ArrayList(wq.G(listV, 10));
        int i = 0;
        for (Object obj : listV) {
            int i2 = i + 1;
            if (i < 0) {
                vs0.D();
                throw null;
            }
            arrayList.add(new qj1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = h61.g0(arrayList);
    }

    public aq(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.yp
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String strM;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM2 = dv1.m(cls.getName());
            return strM2 == null ? cls.getCanonicalName() : strM2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM = dv1.m(componentType.getName())) != null) {
            strConcat = strM.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strL;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strL2 = dv1.L(cls.getName());
                return strL2 == null ? cls.getSimpleName() : strL2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strL = dv1.L(componentType.getName())) != null) {
                strConcat = strL.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return h92.N(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iG = h92.G(simpleName, '$', 0, 6);
            return iG == -1 ? simpleName : simpleName.substring(iG + 1, simpleName.length());
        }
        return h92.N(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class clsR = this.a;
        clsR.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(clsR);
        if (num != null) {
            return nj2.w(num.intValue(), obj);
        }
        if (clsR.isPrimitive()) {
            clsR = vv.r(js1.a(clsR));
        }
        return clsR.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aq) && vv.r(this).equals(vv.r((aq) obj));
    }

    public final int hashCode() {
        return vv.r(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}

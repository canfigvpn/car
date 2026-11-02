package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n31 {
    public static final tq1 a;

    static {
        Object ut1Var;
        try {
            ClassLoader classLoader = tw1.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof tq1) {
                        ut1Var = (tq1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof r40)) {
                    i++;
                }
                ut1Var = null;
                break;
            }
        } catch (Throwable th) {
            ut1Var = new ut1(th);
        }
        tq1 a90Var = (tq1) (ut1Var instanceof ut1 ? null : ut1Var);
        if (a90Var == null) {
            a90Var = new a90(1, new vr0(13));
        }
        a = a90Var;
    }
}

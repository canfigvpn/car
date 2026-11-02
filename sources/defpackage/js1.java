package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class js1 {
    public static final ks1 a;

    static {
        ks1 ks1Var = null;
        try {
            ks1Var = (ks1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ks1Var == null) {
            ks1Var = new ks1();
        }
        a = ks1Var;
    }

    public static aq a(Class cls) {
        a.getClass();
        return new aq(cls);
    }
}

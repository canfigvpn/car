package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u20 {
    public static final z30 a;

    static {
        String property;
        ul0 ul0Var;
        z30 z30Var;
        int i = nb2.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            j30 j30Var = u50.a;
            ul0Var = o51.a;
            ul0 ul0Var2 = ul0Var.j;
            if (ul0Var == null) {
                z30Var = ul0Var;
                z30Var = t20.o;
            }
        } else {
            z30Var = t20.o;
        }
        z30Var = ul0Var;
        a = z30Var;
    }
}

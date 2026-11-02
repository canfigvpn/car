package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class te {
    public static final int a;

    static {
        Object ut1Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            ut1Var = property != null ? o92.A(property) : null;
        } catch (Throwable th) {
            ut1Var = new ut1(th);
        }
        Integer num = (Integer) (ut1Var instanceof ut1 ? null : ut1Var);
        a = num != null ? num.intValue() : 2097152;
    }
}

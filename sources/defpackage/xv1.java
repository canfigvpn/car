package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface xv1 extends AutoCloseable {
    void D();

    void a(int i);

    void c(int i, long j);

    void e(String str, int i);

    String f(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    default boolean m() {
        return getLong(0) != 0;
    }

    void o(double d);

    boolean y();
}

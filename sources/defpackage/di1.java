package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class di1 {
    public static final di1 e;
    public static final di1 f;
    public static final /* synthetic */ di1[] g;

    static {
        di1 di1Var = new di1("Vertical", 0);
        e = di1Var;
        di1 di1Var2 = new di1("Horizontal", 1);
        f = di1Var2;
        g = new di1[]{di1Var, di1Var2};
    }

    public static di1 valueOf(String str) {
        return (di1) Enum.valueOf(di1.class, str);
    }

    public static di1[] values() {
        return (di1[]) g.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xh2 {
    public static final xh2 e;
    public static final xh2 f;
    public static final /* synthetic */ xh2[] g;

    static {
        xh2 xh2Var = new xh2("DEFERRED", 0);
        e = xh2Var;
        xh2 xh2Var2 = new xh2("IMMEDIATE", 1);
        f = xh2Var2;
        g = new xh2[]{xh2Var, xh2Var2, new xh2("EXCLUSIVE", 2)};
    }

    public static xh2 valueOf(String str) {
        return (xh2) Enum.valueOf(xh2.class, str);
    }

    public static xh2[] values() {
        return (xh2[]) g.clone();
    }
}

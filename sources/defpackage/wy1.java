package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 {
    public static final wy1 e;
    public static final wy1 f;
    public static final /* synthetic */ wy1[] g;

    static {
        wy1 wy1Var = new wy1("Inherit", 0);
        e = wy1Var;
        wy1 wy1Var2 = new wy1("SecureOn", 1);
        f = wy1Var2;
        g = new wy1[]{wy1Var, wy1Var2, new wy1("SecureOff", 2)};
    }

    public static wy1 valueOf(String str) {
        return (wy1) Enum.valueOf(wy1.class, str);
    }

    public static wy1[] values() {
        return (wy1[]) g.clone();
    }
}

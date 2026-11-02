package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b71 {
    public static final b71 e;
    public static final b71 f;
    public static final /* synthetic */ b71[] g;

    static {
        b71 b71Var = new b71("Width", 0);
        e = b71Var;
        b71 b71Var2 = new b71("Height", 1);
        f = b71Var2;
        g = new b71[]{b71Var, b71Var2};
    }

    public static b71 valueOf(String str) {
        return (b71) Enum.valueOf(b71.class, str);
    }

    public static b71[] values() {
        return (b71[]) g.clone();
    }
}

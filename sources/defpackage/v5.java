package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v5 {
    public static final v5 e;
    public static final v5 f;
    public static final /* synthetic */ v5[] g;

    static {
        v5 v5Var = new v5("SHOW_ORIGINAL", 0);
        e = v5Var;
        v5 v5Var2 = new v5("SHOW_TRANSLATED", 1);
        f = v5Var2;
        g = new v5[]{v5Var, v5Var2};
    }

    public static v5 valueOf(String str) {
        return (v5) Enum.valueOf(v5.class, str);
    }

    public static v5[] values() {
        return (v5[]) g.clone();
    }
}

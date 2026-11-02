package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a71 {
    public static final a71 e;
    public static final a71 f;
    public static final /* synthetic */ a71[] g;

    static {
        a71 a71Var = new a71("Min", 0);
        e = a71Var;
        a71 a71Var2 = new a71("Max", 1);
        f = a71Var2;
        g = new a71[]{a71Var, a71Var2};
    }

    public static a71 valueOf(String str) {
        return (a71) Enum.valueOf(a71.class, str);
    }

    public static a71[] values() {
        return (a71[]) g.clone();
    }
}

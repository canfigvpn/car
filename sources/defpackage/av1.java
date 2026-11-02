package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class av1 {
    public static final av1 e;
    public static final av1 f;
    public static final /* synthetic */ av1[] g;

    /* JADX INFO: Fake field, exist only in values array */
    av1 EF0;

    static {
        av1 av1Var = new av1("AUTOMATIC", 0);
        av1 av1Var2 = new av1("TRUNCATE", 1);
        e = av1Var2;
        av1 av1Var3 = new av1("WRITE_AHEAD_LOGGING", 2);
        f = av1Var3;
        g = new av1[]{av1Var, av1Var2, av1Var3};
    }

    public static av1 valueOf(String str) {
        return (av1) Enum.valueOf(av1.class, str);
    }

    public static av1[] values() {
        return (av1[]) g.clone();
    }
}

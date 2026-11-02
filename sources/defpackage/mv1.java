package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 {
    public static final mv1 e;
    public static final mv1 f;
    public static final /* synthetic */ mv1[] g;

    static {
        mv1 mv1Var = new mv1("PATH", 0);
        e = mv1Var;
        mv1 mv1Var2 = new mv1("QUERY", 1);
        f = mv1Var2;
        g = new mv1[]{mv1Var, mv1Var2};
    }

    public static mv1 valueOf(String str) {
        return (mv1) Enum.valueOf(mv1.class, str);
    }

    public static mv1[] values() {
        return (mv1[]) g.clone();
    }
}

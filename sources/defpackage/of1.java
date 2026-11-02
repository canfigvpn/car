package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class of1 {
    public static final of1 e;
    public static final of1 f;
    public static final /* synthetic */ of1[] g;

    static {
        of1 of1Var = new of1("HISTORY", 0);
        e = of1Var;
        of1 of1Var2 = new of1("TYPICAL_DAILY", 1);
        f = of1Var2;
        g = new of1[]{of1Var, of1Var2};
    }

    public static of1 valueOf(String str) {
        return (of1) Enum.valueOf(of1.class, str);
    }

    public static of1[] values() {
        return (of1[]) g.clone();
    }
}

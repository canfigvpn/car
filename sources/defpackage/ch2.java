package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ch2 {
    public static final ch2 e;
    public static final ch2 f;
    public static final /* synthetic */ ch2[] g;

    static {
        ch2 ch2Var = new ch2("On", 0);
        e = ch2Var;
        ch2 ch2Var2 = new ch2("Off", 1);
        f = ch2Var2;
        g = new ch2[]{ch2Var, ch2Var2, new ch2("Indeterminate", 2)};
    }

    public static ch2 valueOf(String str) {
        return (ch2) Enum.valueOf(ch2.class, str);
    }

    public static ch2[] values() {
        return (ch2[]) g.clone();
    }
}

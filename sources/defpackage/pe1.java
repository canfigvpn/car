package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 {
    public static final pe1 e;
    public static final pe1 f;
    public static final /* synthetic */ pe1[] g;

    static {
        pe1 pe1Var = new pe1("Min", 0);
        e = pe1Var;
        pe1 pe1Var2 = new pe1("Max", 1);
        f = pe1Var2;
        g = new pe1[]{pe1Var, pe1Var2};
    }

    public static pe1 valueOf(String str) {
        return (pe1) Enum.valueOf(pe1.class, str);
    }

    public static pe1[] values() {
        return (pe1[]) g.clone();
    }
}

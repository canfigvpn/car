package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n50 {
    public static final n50 e;
    public static final n50 f;
    public static final n50 g;
    public static final /* synthetic */ n50[] h;

    static {
        n50 n50Var = new n50("Vertical", 0);
        e = n50Var;
        n50 n50Var2 = new n50("Horizontal", 1);
        f = n50Var2;
        n50 n50Var3 = new n50("Both", 2);
        g = n50Var3;
        h = new n50[]{n50Var, n50Var2, n50Var3};
    }

    public static n50 valueOf(String str) {
        return (n50) Enum.valueOf(n50.class, str);
    }

    public static n50[] values() {
        return (n50[]) h.clone();
    }
}

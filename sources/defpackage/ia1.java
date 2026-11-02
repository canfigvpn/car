package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ia1 {
    public static final ia1 e;
    public static final ia1 f;
    public static final ia1 g;
    public static final /* synthetic */ ia1[] h;

    static {
        ia1 ia1Var = new ia1("Default", 0);
        e = ia1Var;
        ia1 ia1Var2 = new ia1("UserInput", 1);
        f = ia1Var2;
        ia1 ia1Var3 = new ia1("PreventUserInput", 2);
        g = ia1Var3;
        h = new ia1[]{ia1Var, ia1Var2, ia1Var3};
    }

    public static ia1 valueOf(String str) {
        return (ia1) Enum.valueOf(ia1.class, str);
    }

    public static ia1[] values() {
        return (ia1[]) h.clone();
    }
}

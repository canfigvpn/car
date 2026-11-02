package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pl1 {
    public static final pl1 e;
    public static final pl1 f;
    public static final pl1 g;
    public static final pl1 h;
    public static final pl1 i;
    public static final pl1 j;
    public static final pl1 k;
    public static final /* synthetic */ pl1[] l;

    static {
        pl1 pl1Var = new pl1("Invalid", 0);
        e = pl1Var;
        pl1 pl1Var2 = new pl1("Cancelled", 1);
        f = pl1Var2;
        pl1 pl1Var3 = new pl1("InitialPending", 2);
        g = pl1Var3;
        pl1 pl1Var4 = new pl1("RecomposePending", 3);
        h = pl1Var4;
        pl1 pl1Var5 = new pl1("Recomposing", 4);
        i = pl1Var5;
        pl1 pl1Var6 = new pl1("ApplyPending", 5);
        j = pl1Var6;
        pl1 pl1Var7 = new pl1("Applied", 6);
        k = pl1Var7;
        l = new pl1[]{pl1Var, pl1Var2, pl1Var3, pl1Var4, pl1Var5, pl1Var6, pl1Var7};
    }

    public static pl1 valueOf(String str) {
        return (pl1) Enum.valueOf(pl1.class, str);
    }

    public static pl1[] values() {
        return (pl1[]) l.clone();
    }
}

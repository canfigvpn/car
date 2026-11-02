package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class if1 {
    public static final if1 e;
    public static final if1 f;
    public static final if1 g;
    public static final /* synthetic */ if1[] h;

    static {
        if1 if1Var = new if1("NO_OP", 0);
        e = if1Var;
        if1 if1Var2 = new if1("ADD", 1);
        f = if1Var2;
        if1 if1Var3 = new if1("REMOVE", 2);
        g = if1Var3;
        h = new if1[]{if1Var, if1Var2, if1Var3};
    }

    public static if1 valueOf(String str) {
        return (if1) Enum.valueOf(if1.class, str);
    }

    public static if1[] values() {
        return (if1[]) h.clone();
    }
}

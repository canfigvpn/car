package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e70 {
    public static final e70 e;
    public static final e70 f;
    public static final e70 g;
    public static final /* synthetic */ e70[] h;

    static {
        e70 e70Var = new e70("Yes", 0);
        e = e70Var;
        e70 e70Var2 = new e70("No", 1);
        f = e70Var2;
        e70 e70Var3 = new e70("NotInitialized", 2);
        g = e70Var3;
        h = new e70[]{e70Var, e70Var2, e70Var3};
    }

    public static e70 valueOf(String str) {
        return (e70) Enum.valueOf(e70.class, str);
    }

    public static e70[] values() {
        return (e70[]) h.clone();
    }
}

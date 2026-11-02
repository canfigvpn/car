package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b51 {
    public static final b51 e;
    public static final b51 f;
    public static final b51 g;
    public static final /* synthetic */ b51[] h;

    static {
        b51 b51Var = new b51("IsPlacedInLookahead", 0);
        e = b51Var;
        b51 b51Var2 = new b51("IsPlacedInApproach", 1);
        f = b51Var2;
        b51 b51Var3 = new b51("IsNotPlaced", 2);
        g = b51Var3;
        h = new b51[]{b51Var, b51Var2, b51Var3};
    }

    public static b51 valueOf(String str) {
        return (b51) Enum.valueOf(b51.class, str);
    }

    public static b51[] values() {
        return (b51[]) h.clone();
    }
}

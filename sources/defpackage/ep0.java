package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 {
    public static final ep0 e;
    public static final ep0 f;
    public static final ep0 g;
    public static final /* synthetic */ ep0[] h;

    static {
        ep0 ep0Var = new ep0("Yes", 0);
        e = ep0Var;
        ep0 ep0Var2 = new ep0("No", 1);
        f = ep0Var2;
        ep0 ep0Var3 = new ep0("NotInitialized", 2);
        g = ep0Var3;
        h = new ep0[]{ep0Var, ep0Var2, ep0Var3};
    }

    public static ep0 valueOf(String str) {
        return (ep0) Enum.valueOf(ep0.class, str);
    }

    public static ep0[] values() {
        return (ep0[]) h.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 {
    public static final hb0 e;
    public static final hb0 f;
    public static final hb0 g;
    public static final /* synthetic */ hb0[] h;

    static {
        hb0 hb0Var = new hb0("PreEnter", 0);
        e = hb0Var;
        hb0 hb0Var2 = new hb0("Visible", 1);
        f = hb0Var2;
        hb0 hb0Var3 = new hb0("PostExit", 2);
        g = hb0Var3;
        h = new hb0[]{hb0Var, hb0Var2, hb0Var3};
    }

    public static hb0 valueOf(String str) {
        return (hb0) Enum.valueOf(hb0.class, str);
    }

    public static hb0[] values() {
        return (hb0[]) h.clone();
    }
}

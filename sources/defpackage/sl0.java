package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 {
    public static final sl0 e;
    public static final sl0 f;
    public static final sl0 g;
    public static final /* synthetic */ sl0[] h;

    static {
        sl0 sl0Var = new sl0("None", 0);
        e = sl0Var;
        sl0 sl0Var2 = new sl0("Selection", 1);
        f = sl0Var2;
        sl0 sl0Var3 = new sl0("Cursor", 2);
        g = sl0Var3;
        h = new sl0[]{sl0Var, sl0Var2, sl0Var3};
    }

    public static sl0 valueOf(String str) {
        return (sl0) Enum.valueOf(sl0.class, str);
    }

    public static sl0[] values() {
        return (sl0[]) h.clone();
    }
}

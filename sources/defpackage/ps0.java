package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 {
    public static final ps0 e;
    public static final ps0 f;
    public static final /* synthetic */ ps0[] g;

    static {
        ps0 ps0Var = new ps0("Min", 0);
        e = ps0Var;
        ps0 ps0Var2 = new ps0("Max", 1);
        f = ps0Var2;
        g = new ps0[]{ps0Var, ps0Var2};
    }

    public static ps0 valueOf(String str) {
        return (ps0) Enum.valueOf(ps0.class, str);
    }

    public static ps0[] values() {
        return (ps0[]) g.clone();
    }
}

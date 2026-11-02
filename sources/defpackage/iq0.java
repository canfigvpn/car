package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class iq0 {
    public static final iq0 e;
    public static final iq0 f;
    public static final iq0 g;
    public static final /* synthetic */ iq0[] h;

    static {
        iq0 iq0Var = new iq0("Focused", 0);
        e = iq0Var;
        iq0 iq0Var2 = new iq0("UnfocusedEmpty", 1);
        f = iq0Var2;
        iq0 iq0Var3 = new iq0("UnfocusedNotEmpty", 2);
        g = iq0Var3;
        h = new iq0[]{iq0Var, iq0Var2, iq0Var3};
    }

    public static iq0 valueOf(String str) {
        return (iq0) Enum.valueOf(iq0.class, str);
    }

    public static iq0[] values() {
        return (iq0[]) h.clone();
    }
}

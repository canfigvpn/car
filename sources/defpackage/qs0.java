package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 {
    public static final qs0 e;
    public static final qs0 f;
    public static final /* synthetic */ qs0[] g;

    static {
        qs0 qs0Var = new qs0("Min", 0);
        e = qs0Var;
        qs0 qs0Var2 = new qs0("Max", 1);
        f = qs0Var2;
        g = new qs0[]{qs0Var, qs0Var2};
    }

    public static qs0 valueOf(String str) {
        return (qs0) Enum.valueOf(qs0.class, str);
    }

    public static qs0[] values() {
        return (qs0[]) g.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ql0 {
    public static final ql0 e;
    public static final ql0 f;
    public static final ql0 g;
    public static final /* synthetic */ ql0[] h;

    static {
        ql0 ql0Var = new ql0("Cursor", 0);
        e = ql0Var;
        ql0 ql0Var2 = new ql0("SelectionStart", 1);
        f = ql0Var2;
        ql0 ql0Var3 = new ql0("SelectionEnd", 2);
        g = ql0Var3;
        h = new ql0[]{ql0Var, ql0Var2, ql0Var3};
    }

    public static ql0 valueOf(String str) {
        return (ql0) Enum.valueOf(ql0.class, str);
    }

    public static ql0[] values() {
        return (ql0[]) h.clone();
    }
}

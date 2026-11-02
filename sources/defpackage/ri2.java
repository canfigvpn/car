package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 {
    public static final ri2 e;
    public static final ri2 f;
    public static final ri2 g;
    public static final /* synthetic */ ri2[] h;

    static {
        ri2 ri2Var = new ri2("ContinueTraversal", 0);
        e = ri2Var;
        ri2 ri2Var2 = new ri2("SkipSubtreeAndContinueTraversal", 1);
        f = ri2Var2;
        ri2 ri2Var3 = new ri2("CancelTraversal", 2);
        g = ri2Var3;
        h = new ri2[]{ri2Var, ri2Var2, ri2Var3};
    }

    public static ri2 valueOf(String str) {
        return (ri2) Enum.valueOf(ri2.class, str);
    }

    public static ri2[] values() {
        return (ri2[]) h.clone();
    }
}

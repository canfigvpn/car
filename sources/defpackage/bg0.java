package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 {
    public static final bg0 e;
    public static final bg0 f;
    public static final bg0 g;
    public static final /* synthetic */ bg0[] h;

    static {
        bg0 bg0Var = new bg0("Active", 0);
        e = bg0Var;
        bg0 bg0Var2 = new bg0("ActiveParent", 1);
        f = bg0Var2;
        bg0 bg0Var3 = new bg0("Captured", 2);
        bg0 bg0Var4 = new bg0("Inactive", 3);
        g = bg0Var4;
        h = new bg0[]{bg0Var, bg0Var2, bg0Var3, bg0Var4};
    }

    public static bg0 valueOf(String str) {
        return (bg0) Enum.valueOf(bg0.class, str);
    }

    public static bg0[] values() {
        return (bg0[]) h.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                qj.p();
                return false;
            }
        }
        return true;
    }
}

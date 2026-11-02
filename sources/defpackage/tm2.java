package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tm2 {
    public static final tm2 e;
    public static final tm2 f;
    public static final /* synthetic */ tm2[] g;

    static {
        tm2 tm2Var = new tm2("Lsq2", 0);
        e = tm2Var;
        tm2 tm2Var2 = new tm2("Impulse", 1);
        f = tm2Var2;
        g = new tm2[]{tm2Var, tm2Var2};
    }

    public static tm2 valueOf(String str) {
        return (tm2) Enum.valueOf(tm2.class, str);
    }

    public static tm2[] values() {
        return (tm2[]) g.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ts0 {
    public static final ts0 e;
    public static final ts0 f;
    public static final /* synthetic */ ts0[] g;

    static {
        ts0 ts0Var = new ts0("Width", 0);
        e = ts0Var;
        ts0 ts0Var2 = new ts0("Height", 1);
        f = ts0Var2;
        g = new ts0[]{ts0Var, ts0Var2};
    }

    public static ts0 valueOf(String str) {
        return (ts0) Enum.valueOf(ts0.class, str);
    }

    public static ts0[] values() {
        return (ts0[]) g.clone();
    }
}

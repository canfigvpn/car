package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 {
    public static final d22 e;
    public static final d22 f;
    public static final /* synthetic */ d22[] g;

    static {
        d22 d22Var = new d22("CHANGE", 0);
        e = d22Var;
        d22 d22Var2 = new d22("REVIEW", 1);
        f = d22Var2;
        g = new d22[]{d22Var, d22Var2};
    }

    public static d22 valueOf(String str) {
        return (d22) Enum.valueOf(d22.class, str);
    }

    public static d22[] values() {
        return (d22[]) g.clone();
    }
}

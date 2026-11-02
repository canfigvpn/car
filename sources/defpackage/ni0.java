package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 {
    public static final ni0 e;
    public static final /* synthetic */ ni0[] f;
    public static final /* synthetic */ yb0 g;

    static {
        ni0 ni0Var = new ni0("GASOLINE", 0);
        e = ni0Var;
        ni0[] ni0VarArr = {ni0Var, new ni0("DIESEL", 1), new ni0("CNG_LPG", 2), new ni0("HYBRID", 3), new ni0("ELECTRIC", 4)};
        f = ni0VarArr;
        g = new yb0(ni0VarArr);
    }

    public static ni0 valueOf(String str) {
        return (ni0) Enum.valueOf(ni0.class, str);
    }

    public static ni0[] values() {
        return (ni0[]) f.clone();
    }
}

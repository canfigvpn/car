package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dg2 {
    public static final dg2 e;
    public static final /* synthetic */ dg2[] f;
    public static final /* synthetic */ yb0 g;

    static {
        dg2 dg2Var = new dg2("SYSTEM", 0);
        e = dg2Var;
        dg2[] dg2VarArr = {dg2Var, new dg2("LIGHT", 1), new dg2("DARK", 2)};
        f = dg2VarArr;
        g = new yb0(dg2VarArr);
    }

    public static dg2 valueOf(String str) {
        return (dg2) Enum.valueOf(dg2.class, str);
    }

    public static dg2[] values() {
        return (dg2[]) f.clone();
    }
}

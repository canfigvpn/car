package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v01 {
    public static final v01 e;
    public static final v01 f;
    public static final /* synthetic */ v01[] g;

    /* JADX INFO: Fake field, exist only in values array */
    v01 EF0;

    static {
        v01 v01Var = new v01("SYNCHRONIZED", 0);
        v01 v01Var2 = new v01("PUBLICATION", 1);
        e = v01Var2;
        v01 v01Var3 = new v01("NONE", 2);
        f = v01Var3;
        g = new v01[]{v01Var, v01Var2, v01Var3};
    }

    public static v01 valueOf(String str) {
        return (v01) Enum.valueOf(v01.class, str);
    }

    public static v01[] values() {
        return (v01[]) g.clone();
    }
}

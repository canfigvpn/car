package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 {
    public static final qe1 e;
    public static final qe1 f;
    public static final /* synthetic */ qe1[] g;

    static {
        qe1 qe1Var = new qe1("Width", 0);
        e = qe1Var;
        qe1 qe1Var2 = new qe1("Height", 1);
        f = qe1Var2;
        g = new qe1[]{qe1Var, qe1Var2};
    }

    public static qe1 valueOf(String str) {
        return (qe1) Enum.valueOf(qe1.class, str);
    }

    public static qe1[] values() {
        return (qe1[]) g.clone();
    }
}

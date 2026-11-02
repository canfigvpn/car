package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qn1 {
    public static final qn1 e;
    public static final qn1 f;
    public static final qn1 g;
    public static final /* synthetic */ qn1[] h;

    static {
        qn1 qn1Var = new qn1("Initial", 0);
        e = qn1Var;
        qn1 qn1Var2 = new qn1("Main", 1);
        f = qn1Var2;
        qn1 qn1Var3 = new qn1("Final", 2);
        g = qn1Var3;
        h = new qn1[]{qn1Var, qn1Var2, qn1Var3};
    }

    public static qn1 valueOf(String str) {
        return (qn1) Enum.valueOf(qn1.class, str);
    }

    public static qn1[] values() {
        return (qn1[]) h.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 {
    public static final jt1 e;
    public static final jt1 f;
    public static final /* synthetic */ jt1[] g;

    static {
        jt1 jt1Var = new jt1("Ltr", 0);
        e = jt1Var;
        jt1 jt1Var2 = new jt1("Rtl", 1);
        f = jt1Var2;
        g = new jt1[]{jt1Var, jt1Var2};
    }

    public static jt1 valueOf(String str) {
        return (jt1) Enum.valueOf(jt1.class, str);
    }

    public static jt1[] values() {
        return (jt1[]) g.clone();
    }
}

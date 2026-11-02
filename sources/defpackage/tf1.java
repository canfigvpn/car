package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 {
    public static final tf1 e;
    public static final /* synthetic */ tf1[] f;

    /* JADX INFO: Fake field, exist only in values array */
    tf1 EF0;

    static {
        tf1 tf1Var = new tf1("INITIAL", 0);
        tf1 tf1Var2 = new tf1("MANUAL", 1);
        e = tf1Var2;
        f = new tf1[]{tf1Var, tf1Var2, new tf1("SERVICE", 2)};
    }

    public static tf1 valueOf(String str) {
        return (tf1) Enum.valueOf(tf1.class, str);
    }

    public static tf1[] values() {
        return (tf1[]) f.clone();
    }
}

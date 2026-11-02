package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ka2 {
    public static final ka2 e;
    public static final ka2 f;
    public static final ka2 g;
    public static final ka2 h;
    public static final ka2 i;
    public static final /* synthetic */ ka2[] j;

    static {
        ka2 ka2Var = new ka2("END", 0);
        e = ka2Var;
        ka2 ka2Var2 = new ka2("ROLLBACK", 1);
        f = ka2Var2;
        ka2 ka2Var3 = new ka2("BEGIN_EXCLUSIVE", 2);
        g = ka2Var3;
        ka2 ka2Var4 = new ka2("BEGIN_IMMEDIATE", 3);
        h = ka2Var4;
        ka2 ka2Var5 = new ka2("BEGIN_DEFERRED", 4);
        i = ka2Var5;
        j = new ka2[]{ka2Var, ka2Var2, ka2Var3, ka2Var4, ka2Var5};
    }

    public static ka2 valueOf(String str) {
        return (ka2) Enum.valueOf(ka2.class, str);
    }

    public static ka2[] values() {
        return (ka2[]) j.clone();
    }
}

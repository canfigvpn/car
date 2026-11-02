package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class or1 {
    public static final or1 e;
    public static final or1 f;
    public static final or1 g;
    public static final or1 h;
    public static final or1 i;
    public static final or1 j;
    public static final /* synthetic */ or1[] k;

    static {
        or1 or1Var = new or1("ShutDown", 0);
        e = or1Var;
        or1 or1Var2 = new or1("ShuttingDown", 1);
        f = or1Var2;
        or1 or1Var3 = new or1("Inactive", 2);
        g = or1Var3;
        or1 or1Var4 = new or1("InactivePendingWork", 3);
        h = or1Var4;
        or1 or1Var5 = new or1("Idle", 4);
        i = or1Var5;
        or1 or1Var6 = new or1("PendingWork", 5);
        j = or1Var6;
        k = new or1[]{or1Var, or1Var2, or1Var3, or1Var4, or1Var5, or1Var6};
    }

    public static or1 valueOf(String str) {
        return (or1) Enum.valueOf(or1.class, str);
    }

    public static or1[] values() {
        return (or1[]) k.clone();
    }
}

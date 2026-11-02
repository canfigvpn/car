package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t22 {
    public static final t22 e;
    public static final t22 f;
    public static final t22 g;
    public static final t22 h;
    public static final t22 i;
    public static final /* synthetic */ t22[] j;

    static {
        t22 t22Var = new t22("OVERDUE", 0);
        e = t22Var;
        t22 t22Var2 = new t22("DUE_SOON", 1);
        f = t22Var2;
        t22 t22Var3 = new t22("OK", 2);
        g = t22Var3;
        t22 t22Var4 = new t22("NEVER_LOGGED", 3);
        h = t22Var4;
        t22 t22Var5 = new t22("NO_INTERVAL", 4);
        i = t22Var5;
        j = new t22[]{t22Var, t22Var2, t22Var3, t22Var4, t22Var5};
    }

    public static t22 valueOf(String str) {
        return (t22) Enum.valueOf(t22.class, str);
    }

    public static t22[] values() {
        return (t22[]) j.clone();
    }
}

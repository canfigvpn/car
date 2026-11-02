package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gx1 {
    public static final gx1 e;
    public static final gx1 f;
    public static final gx1 g;
    public static final gx1 h;
    public static final gx1 i;
    public static final /* synthetic */ gx1[] j;

    static {
        gx1 gx1Var = new gx1("TopBar", 0);
        e = gx1Var;
        gx1 gx1Var2 = new gx1("MainContent", 1);
        f = gx1Var2;
        gx1 gx1Var3 = new gx1("Snackbar", 2);
        g = gx1Var3;
        gx1 gx1Var4 = new gx1("Fab", 3);
        h = gx1Var4;
        gx1 gx1Var5 = new gx1("BottomBar", 4);
        i = gx1Var5;
        j = new gx1[]{gx1Var, gx1Var2, gx1Var3, gx1Var4, gx1Var5};
    }

    public static gx1 valueOf(String str) {
        return (gx1) Enum.valueOf(gx1.class, str);
    }

    public static gx1[] values() {
        return (gx1[]) j.clone();
    }
}

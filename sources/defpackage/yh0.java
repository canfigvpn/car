package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yh0 {
    public static final yh0 e;
    public static final yh0 f;
    public static final yh0 g;
    public static final yh0 h;
    public static final yh0 i;
    public static final /* synthetic */ yh0[] j;

    static {
        yh0 yh0Var = new yh0("ON_CONFIGURE", 0);
        e = yh0Var;
        yh0 yh0Var2 = new yh0("ON_CREATE", 1);
        f = yh0Var2;
        yh0 yh0Var3 = new yh0("ON_UPGRADE", 2);
        g = yh0Var3;
        yh0 yh0Var4 = new yh0("ON_DOWNGRADE", 3);
        h = yh0Var4;
        yh0 yh0Var5 = new yh0("ON_OPEN", 4);
        i = yh0Var5;
        j = new yh0[]{yh0Var, yh0Var2, yh0Var3, yh0Var4, yh0Var5};
    }

    public static yh0 valueOf(String str) {
        return (yh0) Enum.valueOf(yh0.class, str);
    }

    public static yh0[] values() {
        return (yh0[]) j.clone();
    }
}

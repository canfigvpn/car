package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r11 {
    public static final r11 e;
    public static final r11 f;
    public static final r11 g;
    public static final r11 h;
    public static final r11 i;
    public static final /* synthetic */ r11[] j;

    static {
        r11 r11Var = new r11("DESTROYED", 0);
        e = r11Var;
        r11 r11Var2 = new r11("INITIALIZED", 1);
        f = r11Var2;
        r11 r11Var3 = new r11("CREATED", 2);
        g = r11Var3;
        r11 r11Var4 = new r11("STARTED", 3);
        h = r11Var4;
        r11 r11Var5 = new r11("RESUMED", 4);
        i = r11Var5;
        j = new r11[]{r11Var, r11Var2, r11Var3, r11Var4, r11Var5};
    }

    public static r11 valueOf(String str) {
        return (r11) Enum.valueOf(r11.class, str);
    }

    public static r11[] values() {
        return (r11[]) j.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c02 {
    public static final c02 e;
    public static final c02 f;
    public static final c02 g;
    public static final /* synthetic */ c02[] h;

    static {
        c02 c02Var = new c02("Left", 0);
        e = c02Var;
        c02 c02Var2 = new c02("Middle", 1);
        f = c02Var2;
        c02 c02Var3 = new c02("Right", 2);
        g = c02Var3;
        h = new c02[]{c02Var, c02Var2, c02Var3};
    }

    public static c02 valueOf(String str) {
        return (c02) Enum.valueOf(c02.class, str);
    }

    public static c02[] values() {
        return (c02[]) h.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 {
    public static final h81 e;
    public static final h81 f;
    public static final h81 g;
    public static final h81 h;
    public static final h81 i;
    public static final /* synthetic */ h81[] j;

    static {
        h81 h81Var = new h81("DefaultSpatial", 0);
        e = h81Var;
        h81 h81Var2 = new h81("FastSpatial", 1);
        f = h81Var2;
        h81 h81Var3 = new h81("SlowSpatial", 2);
        h81 h81Var4 = new h81("DefaultEffects", 3);
        g = h81Var4;
        h81 h81Var5 = new h81("FastEffects", 4);
        h = h81Var5;
        h81 h81Var6 = new h81("SlowEffects", 5);
        i = h81Var6;
        j = new h81[]{h81Var, h81Var2, h81Var3, h81Var4, h81Var5, h81Var6};
    }

    public static h81 valueOf(String str) {
        return (h81) Enum.valueOf(h81.class, str);
    }

    public static h81[] values() {
        return (h81[]) j.clone();
    }
}

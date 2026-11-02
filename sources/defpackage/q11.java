package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q11 {
    private static final /* synthetic */ xb0 $ENTRIES;
    private static final /* synthetic */ q11[] $VALUES;
    public static final o11 Companion;
    public static final q11 ON_ANY;
    public static final q11 ON_CREATE;
    public static final q11 ON_DESTROY;
    public static final q11 ON_PAUSE;
    public static final q11 ON_RESUME;
    public static final q11 ON_START;
    public static final q11 ON_STOP;

    static {
        q11 q11Var = new q11("ON_CREATE", 0);
        ON_CREATE = q11Var;
        q11 q11Var2 = new q11("ON_START", 1);
        ON_START = q11Var2;
        q11 q11Var3 = new q11("ON_RESUME", 2);
        ON_RESUME = q11Var3;
        q11 q11Var4 = new q11("ON_PAUSE", 3);
        ON_PAUSE = q11Var4;
        q11 q11Var5 = new q11("ON_STOP", 4);
        ON_STOP = q11Var5;
        q11 q11Var6 = new q11("ON_DESTROY", 5);
        ON_DESTROY = q11Var6;
        q11 q11Var7 = new q11("ON_ANY", 6);
        ON_ANY = q11Var7;
        q11[] q11VarArr = {q11Var, q11Var2, q11Var3, q11Var4, q11Var5, q11Var6, q11Var7};
        $VALUES = q11VarArr;
        $ENTRIES = new yb0(q11VarArr);
        Companion = new o11();
    }

    public static q11 valueOf(String str) {
        return (q11) Enum.valueOf(q11.class, str);
    }

    public static q11[] values() {
        return (q11[]) $VALUES.clone();
    }

    public final r11 a() {
        switch (p11.a[ordinal()]) {
            case 1:
            case 2:
                return r11.g;
            case 3:
            case 4:
                return r11.h;
            case 5:
                return r11.i;
            case 6:
                return r11.e;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                qj.p();
                return null;
        }
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ww0 {
    public static final ww0 e;
    public static final ww0 f;
    public static final ww0 g;
    public static final ww0 h;
    public static final ww0 i;
    public static final /* synthetic */ ww0[] j;

    static {
        ww0 ww0Var = new ww0("Measuring", 0);
        e = ww0Var;
        ww0 ww0Var2 = new ww0("LookaheadMeasuring", 1);
        f = ww0Var2;
        ww0 ww0Var3 = new ww0("LayingOut", 2);
        g = ww0Var3;
        ww0 ww0Var4 = new ww0("LookaheadLayingOut", 3);
        h = ww0Var4;
        ww0 ww0Var5 = new ww0("Idle", 4);
        i = ww0Var5;
        j = new ww0[]{ww0Var, ww0Var2, ww0Var3, ww0Var4, ww0Var5};
    }

    public static ww0 valueOf(String str) {
        return (ww0) Enum.valueOf(ww0.class, str);
    }

    public static ww0[] values() {
        return (ww0[]) j.clone();
    }
}

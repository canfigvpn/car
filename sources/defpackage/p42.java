package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p42 {
    public static final p42 e;
    public static final p42 f;
    public static final p42 g;
    public static final /* synthetic */ p42[] h;

    static {
        p42 p42Var = new p42("START", 0);
        e = p42Var;
        p42 p42Var2 = new p42("STOP", 1);
        f = p42Var2;
        p42 p42Var3 = new p42("STOP_AND_RESET_REPLAY_CACHE", 2);
        g = p42Var3;
        h = new p42[]{p42Var, p42Var2, p42Var3};
    }

    public static p42 valueOf(String str) {
        return (p42) Enum.valueOf(p42.class, str);
    }

    public static p42[] values() {
        return (p42[]) h.clone();
    }
}

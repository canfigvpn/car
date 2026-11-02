package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dt0 {
    public static final dt0 e;
    public static final dt0 f;
    public static final dt0 g;
    public static final dt0 h;
    public static final /* synthetic */ dt0[] i;

    static {
        dt0 dt0Var = new dt0("LookaheadMeasurement", 0);
        e = dt0Var;
        dt0 dt0Var2 = new dt0("LookaheadPlacement", 1);
        f = dt0Var2;
        dt0 dt0Var3 = new dt0("Measurement", 2);
        g = dt0Var3;
        dt0 dt0Var4 = new dt0("Placement", 3);
        h = dt0Var4;
        i = new dt0[]{dt0Var, dt0Var2, dt0Var3, dt0Var4};
    }

    public static dt0 valueOf(String str) {
        return (dt0) Enum.valueOf(dt0.class, str);
    }

    public static dt0[] values() {
        return (dt0[]) i.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yw0 {
    public static final yw0 e;
    public static final yw0 f;
    public static final yw0 g;
    public static final /* synthetic */ yw0[] h;

    static {
        yw0 yw0Var = new yw0("InMeasureBlock", 0);
        e = yw0Var;
        yw0 yw0Var2 = new yw0("InLayoutBlock", 1);
        f = yw0Var2;
        yw0 yw0Var3 = new yw0("NotUsed", 2);
        g = yw0Var3;
        h = new yw0[]{yw0Var, yw0Var2, yw0Var3};
    }

    public static yw0 valueOf(String str) {
        return (yw0) Enum.valueOf(yw0.class, str);
    }

    public static yw0[] values() {
        return (yw0[]) h.clone();
    }
}

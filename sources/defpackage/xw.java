package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xw {
    public static final xw e;
    public static final xw f;
    public static final /* synthetic */ xw[] g;

    static {
        xw xwVar = new xw("VIEW_APPEAR", 0);
        e = xwVar;
        xw xwVar2 = new xw("VIEW_DISAPPEAR", 1);
        f = xwVar2;
        g = new xw[]{xwVar, xwVar2};
    }

    public static xw valueOf(String str) {
        return (xw) Enum.valueOf(xw.class, str);
    }

    public static xw[] values() {
        return (xw[]) g.clone();
    }
}

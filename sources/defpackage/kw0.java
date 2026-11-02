package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kw0 {
    public static final kw0 e;
    public static final kw0 f;
    public static final /* synthetic */ kw0[] g;

    static {
        kw0 kw0Var = new kw0("Ltr", 0);
        e = kw0Var;
        kw0 kw0Var2 = new kw0("Rtl", 1);
        f = kw0Var2;
        g = new kw0[]{kw0Var, kw0Var2};
    }

    public static kw0 valueOf(String str) {
        return (kw0) Enum.valueOf(kw0.class, str);
    }

    public static kw0[] values() {
        return (kw0[]) g.clone();
    }
}

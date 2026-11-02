package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class eh2 {
    public static final eh2 e;
    public static final eh2 f;
    public static final eh2 g;
    public static final /* synthetic */ eh2[] h;

    static {
        eh2 eh2Var = new eh2("Uninitialized", 0);
        e = eh2Var;
        eh2 eh2Var2 = new eh2("Detached", 1);
        f = eh2Var2;
        eh2 eh2Var3 = new eh2("Attached", 2);
        g = eh2Var3;
        h = new eh2[]{eh2Var, eh2Var2, eh2Var3};
    }

    public static eh2 valueOf(String str) {
        return (eh2) Enum.valueOf(eh2.class, str);
    }

    public static eh2[] values() {
        return (eh2[]) h.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fz {
    public static final fz e;
    public static final fz f;
    public static final fz g;
    public static final /* synthetic */ fz[] h;

    static {
        fz fzVar = new fz("COROUTINE_SUSPENDED", 0);
        e = fzVar;
        fz fzVar2 = new fz("UNDECIDED", 1);
        f = fzVar2;
        fz fzVar3 = new fz("RESUMED", 2);
        g = fzVar3;
        h = new fz[]{fzVar, fzVar2, fzVar3};
    }

    public static fz valueOf(String str) {
        return (fz) Enum.valueOf(fz.class, str);
    }

    public static fz[] values() {
        return (fz[]) h.clone();
    }
}

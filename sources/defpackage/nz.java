package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nz {
    public static final nz e;
    public static final nz f;
    public static final nz g;
    public static final /* synthetic */ nz[] h;

    static {
        nz nzVar = new nz("CROSSED", 0);
        e = nzVar;
        nz nzVar2 = new nz("NOT_CROSSED", 1);
        f = nzVar2;
        nz nzVar3 = new nz("COLLAPSED", 2);
        g = nzVar3;
        h = new nz[]{nzVar, nzVar2, nzVar3};
    }

    public static nz valueOf(String str) {
        return (nz) Enum.valueOf(nz.class, str);
    }

    public static nz[] values() {
        return (nz[]) h.clone();
    }
}

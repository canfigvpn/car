package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sz {
    public static final sz e;
    public static final sz f;
    public static final sz g;
    public static final /* synthetic */ sz[] h;

    static {
        sz szVar = new sz("None", 0);
        e = szVar;
        sz szVar2 = new sz("Cancelled", 1);
        f = szVar2;
        sz szVar3 = new sz("Redirected", 2);
        g = szVar3;
        h = new sz[]{szVar, szVar2, szVar3, new sz("RedirectCancelled", 3)};
    }

    public static sz valueOf(String str) {
        return (sz) Enum.valueOf(sz.class, str);
    }

    public static sz[] values() {
        return (sz[]) h.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hz {
    public static final hz e;
    public static final hz f;
    public static final hz g;
    public static final hz h;
    public static final /* synthetic */ hz[] i;

    static {
        hz hzVar = new hz("DEFAULT", 0);
        e = hzVar;
        hz hzVar2 = new hz("LAZY", 1);
        f = hzVar2;
        hz hzVar3 = new hz("ATOMIC", 2);
        g = hzVar3;
        hz hzVar4 = new hz("UNDISPATCHED", 3);
        h = hzVar4;
        i = new hz[]{hzVar, hzVar2, hzVar3, hzVar4};
    }

    public static hz valueOf(String str) {
        return (hz) Enum.valueOf(hz.class, str);
    }

    public static hz[] values() {
        return (hz[]) i.clone();
    }
}

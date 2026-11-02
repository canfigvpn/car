package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cz {
    public static final cz e;
    public static final cz f;
    public static final cz g;
    public static final cz h;
    public static final cz i;
    public static final /* synthetic */ cz[] j;

    static {
        cz czVar = new cz("CPU_ACQUIRED", 0);
        e = czVar;
        cz czVar2 = new cz("BLOCKING", 1);
        f = czVar2;
        cz czVar3 = new cz("PARKING", 2);
        g = czVar3;
        cz czVar4 = new cz("DORMANT", 3);
        h = czVar4;
        cz czVar5 = new cz("TERMINATED", 4);
        i = czVar5;
        j = new cz[]{czVar, czVar2, czVar3, czVar4, czVar5};
    }

    public static cz valueOf(String str) {
        return (cz) Enum.valueOf(cz.class, str);
    }

    public static cz[] values() {
        return (cz[]) j.clone();
    }
}

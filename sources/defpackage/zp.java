package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zp {
    public static final zp e;
    public static final zp f;
    public static final /* synthetic */ zp[] g;

    static {
        zp zpVar = new zp("NONE", 0);
        e = zpVar;
        zp zpVar2 = new zp("ALL_JSON_OBJECTS", 1);
        zp zpVar3 = new zp("POLYMORPHIC", 2);
        f = zpVar3;
        g = new zp[]{zpVar, zpVar2, zpVar3};
    }

    public static zp valueOf(String str) {
        return (zp) Enum.valueOf(zp.class, str);
    }

    public static zp[] values() {
        return (zp[]) g.clone();
    }
}

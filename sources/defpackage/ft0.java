package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 {
    public static final ft0 e;
    public static final ft0 f;
    public static final ft0 g;
    public static final ft0 h;
    public static final /* synthetic */ ft0[] i;

    static {
        ft0 ft0Var = new ft0("IGNORED", 0);
        e = ft0Var;
        ft0 ft0Var2 = new ft0("SCHEDULED", 1);
        f = ft0Var2;
        ft0 ft0Var3 = new ft0("DEFERRED", 2);
        g = ft0Var3;
        ft0 ft0Var4 = new ft0("IMMINENT", 3);
        h = ft0Var4;
        i = new ft0[]{ft0Var, ft0Var2, ft0Var3, ft0Var4};
    }

    public static ft0 valueOf(String str) {
        return (ft0) Enum.valueOf(ft0.class, str);
    }

    public static ft0[] values() {
        return (ft0[]) i.clone();
    }
}

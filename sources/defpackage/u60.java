package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u60 {
    public static final u60 e;
    public static final u60 f;
    public static final u60 g;
    public static final u60 h;
    public static final /* synthetic */ u60[] i;

    static {
        u60 u60Var = new u60("Up", 0);
        e = u60Var;
        u60 u60Var2 = new u60("Drag", 1);
        f = u60Var2;
        u60 u60Var3 = new u60("Timeout", 2);
        g = u60Var3;
        u60 u60Var4 = new u60("Cancel", 3);
        h = u60Var4;
        i = new u60[]{u60Var, u60Var2, u60Var3, u60Var4};
    }

    public static u60 valueOf(String str) {
        return (u60) Enum.valueOf(u60.class, str);
    }

    public static u60[] values() {
        return (u60[]) i.clone();
    }
}

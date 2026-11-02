package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 {
    public static final ja1 e;
    public static final /* synthetic */ ja1[] f;

    static {
        ja1 ja1Var = new ja1("Default", 0);
        e = ja1Var;
        f = new ja1[]{ja1Var, new ja1("UserInput", 1), new ja1("PreventUserInput", 2)};
    }

    public static ja1 valueOf(String str) {
        return (ja1) Enum.valueOf(ja1.class, str);
    }

    public static ja1[] values() {
        return (ja1[]) f.clone();
    }
}

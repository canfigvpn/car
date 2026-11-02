package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ze2 {
    public static final ze2 e;
    public static final ze2 f;
    public static final ze2 g;
    public static final ze2 h;
    public static final /* synthetic */ ze2[] i;

    static {
        ze2 ze2Var = new ze2("StartInput", 0);
        e = ze2Var;
        ze2 ze2Var2 = new ze2("StopInput", 1);
        f = ze2Var2;
        ze2 ze2Var3 = new ze2("ShowKeyboard", 2);
        g = ze2Var3;
        ze2 ze2Var4 = new ze2("HideKeyboard", 3);
        h = ze2Var4;
        i = new ze2[]{ze2Var, ze2Var2, ze2Var3, ze2Var4};
    }

    public static ze2 valueOf(String str) {
        return (ze2) Enum.valueOf(ze2.class, str);
    }

    public static ze2[] values() {
        return (ze2[]) i.clone();
    }
}

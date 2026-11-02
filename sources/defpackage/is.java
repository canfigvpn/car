package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class is {
    public static final is e;
    public static final is f;
    public static final /* synthetic */ is[] g;
    public static final /* synthetic */ yb0 h;

    static {
        is isVar = new is("SKIP", 0);
        e = isVar;
        is isVar2 = new is("REVIEW", 1);
        is isVar3 = new is("CHANGE", 2);
        f = isVar3;
        is[] isVarArr = {isVar, isVar2, isVar3};
        g = isVarArr;
        h = new yb0(isVarArr);
    }

    public static is valueOf(String str) {
        return (is) Enum.valueOf(is.class, str);
    }

    public static is[] values() {
        return (is[]) g.clone();
    }
}

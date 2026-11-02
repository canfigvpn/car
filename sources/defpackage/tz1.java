package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 {
    public static final tz1 e;
    public static final /* synthetic */ tz1[] f;

    static {
        tz1 tz1Var = new tz1("EditableText", 0);
        e = tz1Var;
        f = new tz1[]{tz1Var, new tz1("StaticText", 1)};
    }

    public static tz1 valueOf(String str) {
        return (tz1) Enum.valueOf(tz1.class, str);
    }

    public static tz1[] values() {
        return (tz1[]) f.clone();
    }
}

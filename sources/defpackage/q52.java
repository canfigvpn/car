package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q52 {
    public static final q52 e;
    public static final /* synthetic */ q52[] f;

    static {
        q52 q52Var = new q52("Short", 0);
        e = q52Var;
        f = new q52[]{q52Var, new q52("Long", 1), new q52("Indefinite", 2)};
    }

    public static q52 valueOf(String str) {
        return (q52) Enum.valueOf(q52.class, str);
    }

    public static q52[] values() {
        return (q52[]) f.clone();
    }
}

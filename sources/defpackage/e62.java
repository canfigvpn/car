package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e62 {
    public static final e62 e;
    public static final /* synthetic */ e62[] f;

    static {
        e62 e62Var = new e62("Dismissed", 0);
        e = e62Var;
        f = new e62[]{e62Var, new e62("ActionPerformed", 1)};
    }

    public static e62 valueOf(String str) {
        return (e62) Enum.valueOf(e62.class, str);
    }

    public static e62[] values() {
        return (e62[]) f.clone();
    }
}

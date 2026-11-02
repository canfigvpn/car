package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ac {
    public static final ac e;
    public static final ac f;
    public static final ac g;
    public static final ac h;
    public static final ac i;
    public static final ac j;
    public static final ac k;
    public static final /* synthetic */ ac[] l;

    static {
        ac acVar = new ac("Paragraph", 0);
        e = acVar;
        ac acVar2 = new ac("Span", 1);
        f = acVar2;
        ac acVar3 = new ac("VerbatimTts", 2);
        g = acVar3;
        ac acVar4 = new ac("Url", 3);
        h = acVar4;
        ac acVar5 = new ac("Link", 4);
        i = acVar5;
        ac acVar6 = new ac("Clickable", 5);
        j = acVar6;
        ac acVar7 = new ac("String", 6);
        k = acVar7;
        l = new ac[]{acVar, acVar2, acVar3, acVar4, acVar5, acVar6, acVar7};
    }

    public static ac valueOf(String str) {
        return (ac) Enum.valueOf(ac.class, str);
    }

    public static ac[] values() {
        return (ac[]) l.clone();
    }
}

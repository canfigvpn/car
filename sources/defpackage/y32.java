package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y32 {
    public static final y32 e;
    public static final y32 f;
    public static final y32 g;
    public static final y32 h;
    public static final y32 i;
    public static final y32 j;
    public static final /* synthetic */ y32[] k;

    /* JADX INFO: Fake field, exist only in values array */
    y32 EF0;

    static {
        y32 y32Var = new y32("CornerExtraExtraLarge", 0);
        y32 y32Var2 = new y32("CornerExtraLarge", 1);
        e = y32Var2;
        y32 y32Var3 = new y32("CornerExtraLargeIncreased", 2);
        y32 y32Var4 = new y32("CornerExtraLargeTop", 3);
        y32 y32Var5 = new y32("CornerExtraSmall", 4);
        f = y32Var5;
        y32 y32Var6 = new y32("CornerExtraSmallTop", 5);
        y32 y32Var7 = new y32("CornerFull", 6);
        g = y32Var7;
        y32 y32Var8 = new y32("CornerLarge", 7);
        h = y32Var8;
        y32 y32Var9 = new y32("CornerLargeEnd", 8);
        y32 y32Var10 = new y32("CornerLargeIncreased", 9);
        y32 y32Var11 = new y32("CornerLargeStart", 10);
        y32 y32Var12 = new y32("CornerLargeTop", 11);
        y32 y32Var13 = new y32("CornerMedium", 12);
        i = y32Var13;
        y32 y32Var14 = new y32("CornerNone", 13);
        y32 y32Var15 = new y32("CornerSmall", 14);
        j = y32Var15;
        k = new y32[]{y32Var, y32Var2, y32Var3, y32Var4, y32Var5, y32Var6, y32Var7, y32Var8, y32Var9, y32Var10, y32Var11, y32Var12, y32Var13, y32Var14, y32Var15};
    }

    public static y32 valueOf(String str) {
        return (y32) Enum.valueOf(y32.class, str);
    }

    public static y32[] values() {
        return (y32[]) k.clone();
    }
}

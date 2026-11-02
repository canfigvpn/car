package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qr {
    public static final float[] a;
    public static final float[] b;
    public static final zh2 c;
    public static final zh2 d;
    public static final ju1 e;
    public static final ju1 f;
    public static final ju1 g;
    public static final ju1 h;
    public static final ju1 i;
    public static final ju1 j;
    public static final ju1 k;
    public static final ju1 l;
    public static final ju1 m;
    public static final ju1 n;
    public static final ju1 o;
    public static final ju1 p;
    public static final ju1 q;
    public static final ju1 r;
    public static final cw0 s;
    public static final cw0 t;
    public static final ju1 u;
    public static final ju1 v;
    public static final ju1 w;
    public static final zf1 x;
    public static final mr[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        zh2 zh2Var = new zh2(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        zh2 zh2Var2 = new zh2(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        zh2 zh2Var3 = new zh2(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = zh2Var3;
        zh2 zh2Var4 = new zh2(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = zh2Var4;
        oo2 oo2Var = vs0.z;
        ju1 ju1Var = new ju1("sRGB IEC61966-2.1", fArr, oo2Var, zh2Var, 0);
        e = ju1Var;
        ju1 ju1Var2 = new ju1("sRGB IEC61966-2.1 (Linear)", fArr, oo2Var, 1.0d, 0.0f, 1.0f, 1);
        f = ju1Var2;
        ju1 ju1Var3 = new ju1("scRGB-nl IEC 61966-2-2:2003", fArr, oo2Var, null, new qj(2), new qj(3), -0.799f, 2.399f, zh2Var, 2);
        g = ju1Var3;
        ju1 ju1Var4 = new ju1("scRGB IEC 61966-2-2:2003", fArr, oo2Var, 1.0d, -0.5f, 7.499f, 3);
        h = ju1Var4;
        ju1 ju1Var5 = new ju1("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, oo2Var, new zh2(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = ju1Var5;
        ju1 ju1Var6 = new ju1("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, oo2Var, new zh2(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = ju1Var6;
        ju1 ju1Var7 = new ju1("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new oo2(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = ju1Var7;
        ju1 ju1Var8 = new ju1("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, oo2Var, zh2Var, 7);
        l = ju1Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        ju1 ju1Var9 = new ju1("NTSC (1953)", fArr2, vs0.w, new zh2(d4, d5, d6, d2, d3), 8);
        m = ju1Var9;
        ju1 ju1Var10 = new ju1("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, oo2Var, new zh2(d4, d5, d6, d2, d3), 9);
        n = ju1Var10;
        ju1 ju1Var11 = new ju1("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, oo2Var, 2.2d, 0.0f, 1.0f, 10);
        o = ju1Var11;
        ju1 ju1Var12 = new ju1("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, vs0.x, new zh2(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = ju1Var12;
        oo2 oo2Var2 = vs0.y;
        ju1 ju1Var13 = new ju1("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, oo2Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = ju1Var13;
        ju1 ju1Var14 = new ju1("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, oo2Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = ju1Var14;
        cw0 cw0Var = new cw0(14, 1, 12884901889L, "Generic XYZ");
        s = cw0Var;
        cw0 cw0Var2 = new cw0(15, 0, 12884901890L, "Generic L*a*b*");
        t = cw0Var2;
        ju1 ju1Var15 = new ju1("None", fArr, oo2Var, zh2Var2, 16);
        u = ju1Var15;
        ju1 ju1Var16 = new ju1("Hybrid Log Gamma encoding", fArr3, oo2Var, null, new qj(4), new qj(5), 0.0f, 1.0f, zh2Var3, 17);
        v = ju1Var16;
        ju1 ju1Var17 = new ju1("Perceptual Quantizer encoding", fArr3, oo2Var, null, new qj(6), new qj(7), 0.0f, 1.0f, zh2Var4, 18);
        w = ju1Var17;
        zf1 zf1Var = new zf1("Oklab", 12884901890L, 19);
        x = zf1Var;
        y = new mr[]{ju1Var, ju1Var2, ju1Var3, ju1Var4, ju1Var5, ju1Var6, ju1Var7, ju1Var8, ju1Var9, ju1Var10, ju1Var11, ju1Var12, ju1Var13, ju1Var14, cw0Var, cw0Var2, ju1Var15, ju1Var16, ju1Var17, zf1Var};
    }

    public static double a(zh2 zh2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = zh2Var.b;
        double d6 = zh2Var.c;
        double d7 = zh2Var.d;
        double d8 = zh2Var.e;
        double d9 = zh2Var.f;
        double d10 = d5 * d4;
        return (zh2Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(zh2 zh2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / zh2Var.b;
        double d5 = 1.0d / zh2Var.c;
        double d6 = 1.0d / zh2Var.d;
        double d7 = zh2Var.e;
        double d8 = zh2Var.f;
        double d9 = (d2 * d3) / (zh2Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(zh2 zh2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = zh2Var.b;
        double d6 = zh2Var.d;
        double dPow = (Math.pow(d4, d6) * zh2Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * zh2Var.f) + zh2Var.e), zh2Var.g) * d3;
    }

    public static double d(zh2 zh2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -zh2Var.b;
        double d6 = zh2Var.e;
        double d7 = 1.0d / zh2Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-zh2Var.f)) + zh2Var.c), 1.0d / zh2Var.d) * d3;
    }
}

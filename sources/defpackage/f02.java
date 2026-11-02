package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f02 {
    public static final qb a = new qb(Float.NaN, Float.NaN);
    public static final mj2 b = new mj2(new yw1(17), new yw1(18));
    public static final long c;
    public static final g82 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new g82(new uf1(jFloatToRawIntBits));
    }
}

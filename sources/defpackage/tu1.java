package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tu1 {
    public static final a90 a = new a90(0, new vr0(21));
    public static final vu1 b;
    public static final vu1 c;

    static {
        long j = dr.g;
        b = new vu1(true, Float.NaN, j);
        c = new vu1(false, Float.NaN, j);
    }

    public static vu1 a(boolean z, float f, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = dr.g;
        if (w60.b(f, Float.NaN) && vk2.a(j, j)) {
            return z ? b : c;
        }
        return new vu1(z, f, j);
    }
}

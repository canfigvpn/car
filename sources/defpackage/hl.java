package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hl {
    public static final kj1 a;
    public static final kj1 b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        float f = sv0.k0;
        float f2 = sv0.l0;
        a = new kj1(f, 8.0f, f2, 8.0f);
        if (!(f2 >= 0.0f)) {
            tp0.a("Padding must be non-negative");
        }
        b = new kj1(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            tp0.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
        e = s5.f;
    }

    public static gl a(jr jrVar) {
        gl glVar = jrVar.X;
        if (glVar != null) {
            return glVar;
        }
        long j = dr.f;
        gl glVar2 = new gl(j, lr.d(jrVar, kr.p), j, dr.b(ir2.U, lr.d(jrVar, ir2.T)));
        jrVar.X = glVar2;
        return glVar2;
    }
}

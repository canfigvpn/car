package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v90 {
    public static final lj2 a;
    public static final lj2 b;
    public static final lj2 c;

    static {
        oz ozVar = new oz(0.4f, 0.0f, 0.6f, 1.0f);
        a = new lj2(120, 0, d90.a);
        b = new lj2(150, 0, ozVar);
        c = new lj2(120, 0, ozVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v1 lj2) = (r1v0 lj2), (r1v0 lj2), (r1v0 lj2), (r1v2 lj2), (r1v2 lj2), (r1v2 lj2), (r1v2 lj2) binds: [B:18:0x0020, B:21:0x0025, B:27:0x0031, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(ia iaVar, float f, tr0 tr0Var, tr0 tr0Var2, tx txVar) {
        lj2 lj2Var;
        lj2 lj2Var2 = null;
        if (tr0Var2 != null) {
            boolean z = tr0Var2 instanceof rp1;
            lj2Var = a;
            if (z || (tr0Var2 instanceof b80) || (tr0Var2 instanceof wn0) || (tr0Var2 instanceof nf0)) {
                lj2Var2 = lj2Var;
            }
        } else if (tr0Var != null) {
            boolean z2 = tr0Var instanceof rp1;
            lj2Var = b;
            if (z2 || (tr0Var instanceof b80)) {
                lj2Var2 = lj2Var;
            } else if (tr0Var instanceof wn0) {
                lj2Var2 = c;
            } else if (tr0Var instanceof nf0) {
                lj2Var2 = lj2Var;
            }
        }
        fz fzVar = fz.e;
        if (lj2Var2 != null) {
            Object objA = ia.a(iaVar, new w60(f), lj2Var2, txVar);
            if (objA == fzVar) {
                return objA;
            }
        } else {
            Object objE = iaVar.e(txVar, new w60(f));
            if (objE == fzVar) {
                return objE;
            }
        }
        return ll2.a;
    }
}

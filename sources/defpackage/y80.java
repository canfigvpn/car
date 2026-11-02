package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y80 implements mv0 {
    public static final y80 a = new y80();
    public static final yp1 b = new yp1("kotlin.time.Duration", xp1.j);

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        w40 w40Var = w80.f;
        String strX = n20Var.x();
        strX.getClass();
        try {
            long jI = rw.I(strX);
            if (jI == w80.i) {
                throw new IllegalStateException("invariant failed");
            }
            return new w80(jI);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(k3.j("Invalid ISO duration string format: '", strX, "'."), e);
        }
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        long j = ((w80) obj).e;
        w40 w40Var = w80.f;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jG = j < 0 ? w80.g(j) : j;
        long jF = w80.f(jG, z80.HOURS);
        boolean z = false;
        int iF = w80.d(jG) ? 0 : (int) (w80.f(jG, z80.MINUTES) % 60);
        int iF2 = w80.d(jG) ? 0 : (int) (w80.f(jG, z80.SECONDS) % 60);
        int iC = w80.c(jG);
        if (w80.d(j)) {
            jF = 9999999999999L;
        }
        boolean z2 = jF != 0;
        boolean z3 = (iF2 == 0 && iC == 0) ? false : true;
        if (iF != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jF);
            sb.append('H');
        }
        if (z) {
            sb.append(iF);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            w80.b(sb, iF2, iC, 9, "S", true);
        }
        p61Var.Q(sb.toString());
    }
}

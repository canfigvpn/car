package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a01 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ c01 f;

    public /* synthetic */ a01(c01 c01Var, int i) {
        this.e = i;
        this.f = c01Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        c01 c01Var = this.f;
        switch (i) {
            case 0:
                jz0 jz0Var = (jz0) c01Var.s.a();
                int iA = jz0Var.a();
                int i2 = 0;
                while (i2 < iA) {
                    if (jz0Var.b(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                jz0 jz0Var2 = (jz0) c01Var.s.a();
                if (iIntValue < 0 || iIntValue >= jz0Var2.a()) {
                    StringBuilder sbM = k3.m(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM.append(jz0Var2.a());
                    sbM.append(')');
                    yp0.a(sbM.toString());
                }
                nj2.y(c01Var.t0(), null, new m10(c01Var, iIntValue, null, 1), 3);
                return Boolean.TRUE;
        }
    }
}

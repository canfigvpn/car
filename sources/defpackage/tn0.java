package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tn0 implements u32 {
    public static final tn0 b = new tn0(0);
    public static final tn0 c = new tn0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ tn0(int i) {
        this.a = i;
    }

    @Override // defpackage.u32
    public final mx a(long j, kw0 kw0Var, m40 m40Var) {
        switch (this.a) {
            case 0:
                float fO = m40Var.O(30.0f);
                return new hi1(new yr1(0.0f, -fO, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fO));
            case 1:
                float fO2 = m40Var.O(30.0f);
                return new hi1(new yr1(-fO2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fO2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new hi1(sv.e(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}

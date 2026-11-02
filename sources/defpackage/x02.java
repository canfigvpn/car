package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x02 extends dw0 implements ij0 {
    public static final x02 g;
    public static final x02 h;
    public final /* synthetic */ int f;

    static {
        int i = 2;
        g = new x02(i, 0);
        h = new x02(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x02(int i, int i2) {
        super(i);
        this.f = i2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return obj == null ? obj2 : obj;
            default:
                p02 p02Var = (p02) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                i02 i02Var = ((p02) obj).d;
                y02 y02Var = u02.u;
                Object objG = i02Var.e.g(y02Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = p02Var.d.e.g(y02Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}

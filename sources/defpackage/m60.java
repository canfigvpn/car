package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m60 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;

    public /* synthetic */ m60(float f, int i, long j) {
        this.e = i;
        this.f = f;
        this.g = j;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        float f = this.f;
        switch (i) {
            case 0:
                l80 l80Var = (l80) obj;
                float fX = l80Var.x(f);
                l80.L(l80Var, this.g, (((long) Float.floatToRawIntBits(l80Var.x(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(l80Var.x(f) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (l80Var.d() & 4294967295L))))), fX, 0, 496);
                break;
            default:
                l80 l80Var2 = (l80) obj;
                float fX2 = l80Var2.x(f);
                l80.L(l80Var2, this.g, (((long) Float.floatToRawIntBits(l80Var2.x(f) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (l80Var2.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(l80Var2.x(f) / 2.0f))), fX2, 0, 496);
                break;
        }
        return ll2Var;
    }
}

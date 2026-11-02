package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mb0 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ej0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb0(ej0 ej0Var, int i) {
        super(1);
        this.f = i;
        this.g = ej0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ej0 ej0Var = this.g;
        switch (i) {
            case 0:
                long j = ((qr0) obj).a;
                int i2 = (int) (j >> 32);
                return new qr0((((long) ((Number) ej0Var.h(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L) | (((long) i2) << 32));
            case 1:
                long j2 = ((qr0) obj).a;
                int i3 = (int) (j2 >> 32);
                return new qr0((((long) ((Number) ej0Var.h(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) i3) << 32));
            case 2:
                return new ir0(((long) ((Number) ej0Var.h(Integer.valueOf((int) (((qr0) obj).a & 4294967295L)))).intValue()) & 4294967295L);
            default:
                return new ir0(((long) ((Number) ej0Var.h(Integer.valueOf((int) (((qr0) obj).a & 4294967295L)))).intValue()) & 4294967295L);
        }
    }
}

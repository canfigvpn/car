package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 extends dw0 implements ti0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ru1 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(boolean z, ru1 ru1Var, String str) {
        super(0);
        this.f = z;
        this.g = ru1Var;
        this.h = str;
    }

    @Override // defpackage.ti0
    public final Object a() {
        if (this.f) {
            ru1 ru1Var = this.g;
            String str = this.h;
            sw1 sw1Var = (sw1) ru1Var.b;
            synchronized (sw1Var.c) {
            }
        }
        return ll2.a;
    }
}

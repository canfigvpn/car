package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mq0 extends t71 implements si2 {
    public uo2 s;
    public uo2 t;

    public mq0() {
        md0 md0Var = j20.X;
        this.s = md0Var;
        this.t = md0Var;
    }

    public abstract uo2 F0(uo2 uo2Var);

    public void G0() {
        this.t = F0(this.s);
        p12.o(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new lq0(this, 0));
    }

    @Override // defpackage.si2
    public final Object p() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.t71
    public void x0() {
        p12.m(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new lq0(this, 1));
        G0();
    }

    @Override // defpackage.t71
    public void y0() {
        this.t = this.s;
        p12.o(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new lq0(this, 0));
    }

    @Override // defpackage.t71
    public final void z0() {
        this.s = j20.X;
    }
}

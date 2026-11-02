package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t71 implements b40 {
    public rx f;
    public int g;
    public t71 i;
    public t71 j;
    public mf1 k;
    public me1 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public v4 q;
    public boolean r;
    public t71 e = this;
    public int h = -1;

    public void A0() {
        if (!this.r) {
            vp0.b("reset() called on an unattached node");
        }
        z0();
    }

    public void B0() {
        if (!this.r) {
            vp0.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.o) {
            vp0.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.o = false;
        x0();
        this.p = true;
    }

    public void C0() {
        if (!this.r) {
            vp0.b("node detached multiple times");
        }
        if (this.l == null) {
            vp0.b("detach invoked on a node without a coordinator");
        }
        if (!this.p) {
            vp0.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.p = false;
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.a();
        }
        y0();
    }

    public void D0(t71 t71Var) {
        this.e = t71Var;
    }

    public void E0(me1 me1Var) {
        this.l = me1Var;
    }

    public final ez t0() {
        rx rxVar = this.f;
        if (rxVar != null) {
            return rxVar;
        }
        rx rxVarB = qx.b(((e5) qx.W(this)).getCoroutineContext().k(new qt0((ot0) ((e5) qx.W(this)).getCoroutineContext().p(q90.P))));
        this.f = rxVarB;
        return rxVarB;
    }

    public boolean u0() {
        return !(this instanceof jg);
    }

    public void v0() {
        if (this.r) {
            vp0.b("node attached multiple times");
        }
        if (this.l == null) {
            vp0.b("attach invoked on a node without a coordinator");
        }
        this.r = true;
        this.o = true;
    }

    public void w0() {
        if (!this.r) {
            vp0.b("Cannot detach a node that is not attached");
        }
        if (this.o) {
            vp0.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.p) {
            vp0.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.r = false;
        rx rxVar = this.f;
        if (rxVar != null) {
            qx.o(rxVar, new x71("The Modifier.Node was detached", 2));
            this.f = null;
        }
    }

    public void x0() {
    }

    public void y0() {
    }

    public void z0() {
    }
}

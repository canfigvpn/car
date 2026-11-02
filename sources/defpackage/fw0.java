package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fw0 implements ss1, yy {
    public final uy e;
    public final ij0 f;
    public final rx g;
    public j82 h;

    public fw0(uy uyVar, ij0 ij0Var) {
        this.e = uyVar;
        this.f = ij0Var;
        this.g = qx.b(uyVar.k(this));
    }

    @Override // defpackage.ss1
    public final void a() {
        j82 j82Var = this.h;
        if (j82Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            j82Var.d(cancellationException);
        }
        this.h = nj2.y(this.g, null, this.f, 3);
    }

    @Override // defpackage.ss1
    public final void c() {
        j82 j82Var = this.h;
        if (j82Var != null) {
            j82Var.D(new sh0(1));
        }
        this.h = null;
    }

    @Override // defpackage.ss1
    public final void e() {
        j82 j82Var = this.h;
        if (j82Var != null) {
            j82Var.D(new sh0(1));
        }
        this.h = null;
    }

    @Override // defpackage.sy
    public final ty getKey() {
        return q90.B;
    }

    @Override // defpackage.uy
    public final uy k(uy uyVar) {
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public final sy p(ty tyVar) {
        return ex.t(this, tyVar);
    }

    @Override // defpackage.yy
    public final void q(uy uyVar, Throwable th) throws Throwable {
        ov ovVar = (ov) uyVar.p(ov.f);
        if (ovVar != null) {
            p61.r0(th, new n1(11, ovVar, this));
        }
        yy yyVar = (yy) this.e.p(q90.B);
        if (yyVar == null) {
            throw th;
        }
        yyVar.q(uyVar, th);
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.uy
    public final uy u(ty tyVar) {
        return ex.E(this, tyVar);
    }
}

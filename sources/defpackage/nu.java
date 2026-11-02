package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nu extends u0 {
    public final ez c;
    public ij0 d;
    public zk e;
    public j82 f;
    public boolean g;

    public nu(ez ezVar, fp1 fp1Var) {
        super(fp1Var);
        this.c = ezVar;
        this.d = new v9(2, null, 1);
    }

    @Override // defpackage.u0
    public final void e() {
        zk zkVar = this.e;
        if (zkVar != null) {
            zkVar.e(new CancellationException("onBack cancelled"), true);
        }
        j82 j82Var = this.f;
        if (j82Var != null) {
            j82Var.d(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.u0
    public final void f() {
        if (this.e != null && !this.g) {
            e();
        }
        if (this.e == null) {
            this.g = false;
            this.e = s5.d(-2, 4, vk.e);
            this.f = nj2.y(this.c, null, new e(9, null, this), 3);
        }
        zk zkVar = this.e;
        if (zkVar != null) {
            j12.g(zkVar);
        }
        this.g = false;
    }

    @Override // defpackage.u0
    public final void g(yf yfVar) {
        zk zkVar = this.e;
        if (zkVar != null) {
            zkVar.c(yfVar);
        }
    }

    @Override // defpackage.u0
    public final void h() {
        e();
        if (super.d()) {
            this.g = true;
            this.e = s5.d(-2, 4, vk.e);
            this.f = nj2.y(this.c, null, new e(9, null, this), 3);
        }
    }

    public final void j(boolean z) {
        j82 j82Var;
        if (!z && super.d() && (j82Var = this.f) != null && !j82Var.b()) {
            e();
        }
        ((ag) this.a).d(z);
        ((zf) this.b).f(z);
    }
}

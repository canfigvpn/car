package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qc2 implements nc2 {
    public final long e;
    public final /* synthetic */ rc2 f;

    public qc2(rc2 rc2Var, long j) {
        this.f = rc2Var;
        this.e = j;
    }

    @Override // defpackage.nc2
    public final long h(jw0 jw0Var) {
        jw0 jw0Var2 = (jw0) this.f.v.getValue();
        if (jw0Var2 != null) {
            return jw0Var.t(jw0Var2, this.e);
        }
        yp0.d("Tried to open context menu before the anchor was placed.");
        qj.e();
        return 0L;
    }

    @Override // defpackage.nc2
    public final yr1 m(jw0 jw0Var) {
        return sv.e(h(jw0Var), 0L);
    }

    @Override // defpackage.nc2
    public final mc2 o0() {
        return c22.a(this.f);
    }
}

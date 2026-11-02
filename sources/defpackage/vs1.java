package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vs1 implements ez, ss1 {
    public static final rm h = new rm(0);
    public final uy e;
    public final vs1 f = this;
    public volatile uy g;

    public vs1(uy uyVar) {
        this.e = uyVar;
    }

    public final void b() {
        synchronized (this.f) {
            try {
                uy uyVar = this.g;
                if (uyVar == null) {
                    this.g = h;
                } else {
                    mx.p(uyVar, new sh0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss1
    public final void c() {
        b();
    }

    @Override // defpackage.ss1
    public final void e() {
        b();
    }

    @Override // defpackage.ez
    public final uy h() {
        uy uyVarK;
        uy uyVar = this.g;
        if (uyVar == null || uyVar == h) {
            ov ovVar = (ov) this.e.p(ov.f);
            uy us1Var = ovVar != null ? new us1(ovVar, this) : ab0.e;
            synchronized (this.f) {
                try {
                    uy uyVar2 = this.g;
                    if (uyVar2 == null) {
                        uy uyVar3 = this.e;
                        uyVarK = uyVar3.k(new qt0((ot0) uyVar3.p(q90.P))).k(ab0.e).k(us1Var);
                    } else if (uyVar2 == h) {
                        uy uyVar4 = this.e;
                        qt0 qt0Var = new qt0((ot0) uyVar4.p(q90.P));
                        qt0Var.C(new sh0(0));
                        uyVarK = uyVar4.k(qt0Var).k(ab0.e).k(us1Var);
                    } else {
                        uyVarK = uyVar2;
                    }
                    this.g = uyVarK;
                } catch (Throwable th) {
                    throw th;
                }
            }
            uyVar = uyVarK;
        }
        uyVar.getClass();
        return uyVar;
    }

    @Override // defpackage.ss1
    public final void a() {
    }
}

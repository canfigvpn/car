package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class iv extends dv {
    public final yt0 c;
    public int d;

    public iv(qs qsVar, yt0 yt0Var) {
        super(qsVar);
        this.c = yt0Var;
    }

    @Override // defpackage.dv
    public final void a() {
        this.a = true;
        this.d++;
    }

    @Override // defpackage.dv
    public final void b() {
        this.a = false;
        qs qsVar = (qs) this.b;
        qsVar.m("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            qsVar.m(this.c.a.d);
        }
    }

    @Override // defpackage.dv
    public final void c() {
        if (this.a) {
            this.a = false;
        } else {
            b();
        }
    }

    @Override // defpackage.dv
    public final void k() {
        f(' ');
    }

    @Override // defpackage.dv
    public final void l() {
        this.d--;
    }
}

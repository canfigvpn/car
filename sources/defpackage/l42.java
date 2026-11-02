package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l42 implements e60 {
    public final n42 e;
    public final long f;
    public final Object g;
    public final om h;

    public l42(n42 n42Var, long j, Object obj, om omVar) {
        this.e = n42Var;
        this.f = j;
        this.g = obj;
        this.h = omVar;
    }

    @Override // defpackage.e60
    public final void a() {
        n42 n42Var = this.e;
        synchronized (n42Var) {
            if (this.f < n42Var.o()) {
                return;
            }
            Object[] objArr = n42Var.l;
            objArr.getClass();
            long j = this.f;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            ws0.R(objArr, j, ws0.M);
            n42Var.i();
        }
    }
}

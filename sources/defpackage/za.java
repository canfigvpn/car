package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class za extends rs0 {
    public fi2 t;
    public da1 u;
    public ab v;
    public long w;

    @Override // defpackage.rs0, defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        long j2;
        jm1 jm1VarE = r61Var.e(j);
        if (y61Var.r()) {
            j2 = (((long) jm1VarE.e) << 32) | (((long) jm1VarE.f) & 4294967295L);
        } else {
            fi2 fi2Var = this.t;
            int i = jm1VarE.e;
            if (fi2Var == null) {
                j2 = (((long) i) << 32) | (((long) jm1VarE.f) & 4294967295L);
                this.w = j2;
            } else {
                long j3 = (((long) jm1VarE.f) & 4294967295L) | (((long) i) << 32);
                ei2 ei2VarA = fi2Var.a(new ya(this, j3, 0), new ya(this, j3, 1));
                this.v.getClass();
                j2 = ((qr0) ei2VarA.getValue()).a;
                this.w = ((qr0) ei2VarA.getValue()).a;
            }
        }
        return y61Var.d0((int) (j2 >> 32), (int) (4294967295L & j2), db0.e, new xa(this, jm1VarE, j2));
    }

    @Override // defpackage.t71
    public final void z0() {
        this.w = -9223372034707292160L;
    }
}

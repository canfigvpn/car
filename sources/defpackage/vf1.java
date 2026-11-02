package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vf1 implements ae, xf1, pm2 {
    public final int e;
    public int f;
    public final Object g;

    public vf1(int i, int i2, c90 c90Var) {
        this.e = i;
        this.f = i2;
        this.g = new e4(new de0(i, i2, c90Var));
    }

    @Override // defpackage.ae
    public void c(int i, Object obj) {
        ((ae) this.g).c(i + (this.f == 0 ? this.e : 0), obj);
    }

    @Override // defpackage.ae
    public void d(Object obj) {
        this.f++;
        ((ae) this.g).d(obj);
    }

    @Override // defpackage.ae
    public void e() {
        ((ae) this.g).e();
    }

    @Override // defpackage.ae
    public void f(int i, Object obj) {
        ((ae) this.g).f(i + (this.f == 0 ? this.e : 0), obj);
    }

    @Override // defpackage.ae
    public void h(int i, int i2, int i3) {
        int i4 = this.f == 0 ? this.e : 0;
        ((ae) this.g).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ae
    public Object i() {
        return ((ae) this.g).i();
    }

    @Override // defpackage.ae
    public void j(int i, int i2) {
        ((ae) this.g).j(i + (this.f == 0 ? this.e : 0), i2);
    }

    @Override // defpackage.pm2
    public int k() {
        return this.f;
    }

    @Override // defpackage.nm2
    public tb l(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        return ((e4) this.g).l(j, tbVar, tbVar2, tbVar3);
    }

    @Override // defpackage.ae
    public void m(ij0 ij0Var, Object obj) {
        ((ae) this.g).m(ij0Var, obj);
    }

    @Override // defpackage.xf1
    public int n(int i) {
        int iN = ((xf1) this.g).n(i);
        if (i >= 0 && i <= this.f) {
            bm2.c(iN, this.e, i);
        }
        return iN;
    }

    @Override // defpackage.pm2
    public int o() {
        return this.e;
    }

    @Override // defpackage.nm2
    public tb p(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        return ((e4) this.g).p(j, tbVar, tbVar2, tbVar3);
    }

    @Override // defpackage.xf1
    public int r(int i) {
        int iR = ((xf1) this.g).r(i);
        if (i >= 0 && i <= this.e) {
            bm2.b(iR, this.f, i);
        }
        return iR;
    }

    @Override // defpackage.ae
    public void s() {
        if (this.f <= 0) {
            hv.a("OffsetApplier up called with no corresponding down");
        }
        this.f--;
        ((ae) this.g).s();
    }

    public vf1(ae aeVar, int i) {
        this.g = aeVar;
        this.e = i;
    }

    public vf1(xf1 xf1Var, int i, int i2) {
        this.g = xf1Var;
        this.e = i;
        this.f = i2;
    }
}

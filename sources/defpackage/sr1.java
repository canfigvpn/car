package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sr1 implements ae {
    public final c91 e = new c91();
    public final p91 f = new p91();
    public final Object g;

    public sr1(Object obj) {
        this.g = obj;
    }

    public final void a(gl2 gl2Var, rs1 rs1Var) {
        Exception exc;
        c91 c91Var = this.e;
        int i = c91Var.b;
        p91 p91Var = new p91();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            p91 p91Var2 = this.f;
            if (i2 >= i) {
                if (i3 != p91Var2.b) {
                    hv.a("Applier operation size mismatch");
                }
                p91Var2.d();
                c91Var.b = 0;
                gl2Var.g();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (c91Var.b(i2)) {
                        case 0:
                            gl2Var.s();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            gl2Var.d(p91Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            gl2Var.j(c91Var.b(i4), c91Var.b(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    gl2Var.h(c91Var.b(i4), c91Var.b(i7), c91Var.b(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            gl2Var.a();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            gl2Var.c(c91Var.b(i4), p91Var2.f(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                c91Var.b(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objF = p91Var2.f(i3);
                            objF.getClass();
                            nj2.i(2, objF);
                            i3 += 2;
                            gl2Var.m((ij0) objF, p91Var2.f(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = gl2Var.g;
                            if (obj instanceof ju) {
                                ju juVar = (ju) obj;
                                if (((fa1) rs1Var.e).j(juVar)) {
                                    juVar.b();
                                }
                            }
                            p91Var.a(obj);
                            gl2Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    gl2Var.g();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new lu(p91Var2, p91Var, c91Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.ae
    public final void c(int i, Object obj) {
        c91 c91Var = this.e;
        c91Var.a(5);
        c91Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.ae
    public final void d(Object obj) {
        this.e.a(1);
        this.f.a(obj);
    }

    @Override // defpackage.ae
    public final void e() {
        this.e.a(8);
    }

    @Override // defpackage.ae
    public final void f(int i, Object obj) {
        c91 c91Var = this.e;
        c91Var.a(6);
        c91Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.ae
    public final void h(int i, int i2, int i3) {
        c91 c91Var = this.e;
        c91Var.a(3);
        c91Var.a(i);
        c91Var.a(i2);
        c91Var.a(i3);
    }

    @Override // defpackage.ae
    public final Object i() {
        return this.g;
    }

    @Override // defpackage.ae
    public final void j(int i, int i2) {
        c91 c91Var = this.e;
        c91Var.a(2);
        c91Var.a(i);
        c91Var.a(i2);
    }

    @Override // defpackage.ae
    public final void m(ij0 ij0Var, Object obj) {
        this.e.a(7);
        p91 p91Var = this.f;
        p91Var.a(ij0Var);
        p91Var.a(obj);
    }

    @Override // defpackage.ae
    public final void s() {
        this.e.a(0);
    }
}

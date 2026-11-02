package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 extends am2 {
    public rk b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public rk g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public p92 q;
    public final d8 r;
    public d8 s;
    public d8 t;
    public final rx0 u;

    public rk1() {
        int i = jm2.a;
        this.d = cb0.e;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        d8 d8VarA = f8.a();
        this.r = d8VarA;
        this.s = d8VarA;
        this.u = vv.F(v01.f, wv.p);
    }

    @Override // defpackage.am2
    public final void a(l80 l80Var) {
        l80 l80Var2;
        p92 p92Var;
        if (this.n) {
            ex.R(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        rk rkVar = this.b;
        if (rkVar != null) {
            l80Var2 = l80Var;
            l80.s(l80Var2, this.s, rkVar, this.c, null, 56);
        } else {
            l80Var2 = l80Var;
        }
        rk rkVar2 = this.g;
        if (rkVar2 != null) {
            p92 p92Var2 = this.q;
            if (this.o || p92Var2 == null) {
                p92 p92Var3 = new p92(this.f, this.j, this.h, this.i, 16);
                this.q = p92Var3;
                this.o = false;
                p92Var = p92Var3;
            } else {
                p92Var = p92Var2;
            }
            l80.s(l80Var2, this.s, rkVar2, this.e, p92Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        d8 d8Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = d8Var;
            return;
        }
        d8 d8Var2 = this.s;
        if (d8Var2 != d8Var) {
            Path.FillType fillType = d8Var2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = f8.a();
        }
        rx0 rx0Var = this.u;
        ((e8) rx0Var.getValue()).a.setPath(d8Var.a, false);
        float length = ((e8) rx0Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((e8) rx0Var.getValue()).a(f4, f5, this.s);
            return;
        }
        d8 d8VarA = this.t;
        if (d8VarA == null) {
            d8VarA = f8.a();
            this.t = d8VarA;
        }
        d8VarA.e();
        ((e8) rx0Var.getValue()).a(f4, length, d8VarA);
        d8.a(this.s, d8VarA);
        d8VarA.e();
        ((e8) rx0Var.getValue()).a(0.0f, f5, d8VarA);
        d8.a(this.s, d8VarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}

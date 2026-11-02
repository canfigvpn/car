package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 extends TextPaint {
    public v7 a;
    public ed2 b;
    public int c;
    public q32 d;
    public dr e;
    public rk f;
    public v40 g;
    public d52 h;
    public m80 i;

    public final v7 a() {
        v7 v7Var = this.a;
        if (v7Var != null) {
            return v7Var;
        }
        v7 v7Var2 = new v7(this);
        this.a = v7Var2;
        return v7Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    public final void c(rk rkVar, long j, float f) {
        if (rkVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (rkVar instanceof o72) {
            d(n02.n(f, ((o72) rkVar).a));
            return;
        }
        if (!(rkVar instanceof sk)) {
            qj.p();
            return;
        }
        if (ws0.j(this.f, rkVar)) {
            d52 d52Var = this.h;
            if (!(d52Var == null ? false : d52.a(d52Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = rkVar;
                    this.h = new d52(j);
                    this.g = e72.b(new w8(rkVar, j));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = rkVar;
            this.h = new d52(j);
            this.g = e72.b(new w8(rkVar, j));
        }
        v7 v7VarA = a();
        v40 v40Var = this.g;
        v7VarA.h(v40Var != null ? (Shader) v40Var.getValue() : null);
        this.e = null;
        dv1.K(this, f);
    }

    public final void d(long j) {
        dr drVar = this.e;
        if ((drVar == null ? false : vk2.a(drVar.a, j)) || j == 16) {
            return;
        }
        this.e = new dr(j);
        setColor(ws0.V(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(m80 m80Var) {
        if (m80Var == null || ws0.j(this.i, m80Var)) {
            return;
        }
        this.i = m80Var;
        if (m80Var.equals(fd0.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(m80Var instanceof p92)) {
            qj.p();
            return;
        }
        a().l(1);
        p92 p92Var = (p92) m80Var;
        a().k(p92Var.a);
        v7 v7VarA = a();
        ((Paint) v7VarA.b).setStrokeMiter(p92Var.b);
        a().j(p92Var.d);
        a().i(p92Var.c);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(q32 q32Var) {
        if (q32Var == null || ws0.j(this.d, q32Var)) {
            return;
        }
        this.d = q32Var;
        if (q32Var.equals(q32.d)) {
            clearShadowLayer();
            return;
        }
        q32 q32Var2 = this.d;
        float f = q32Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (q32Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), ws0.V(this.d.a));
    }

    public final void g(ed2 ed2Var) {
        if (ed2Var == null || ws0.j(this.b, ed2Var)) {
            return;
        }
        this.b = ed2Var;
        int i = ed2Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}

package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class um implements l80 {
    public final tm e;
    public final ud f;
    public v7 g;
    public v7 h;

    public um() {
        p40 p40Var = nj2.e0;
        tm tmVar = new tm();
        tmVar.a = p40Var;
        tmVar.b = kw0.e;
        tmVar.c = za0.a;
        tmVar.d = 0L;
        this.e = tmVar;
        this.f = new ud(this);
    }

    public static v7 a(um umVar, long j, m80 m80Var, int i) {
        v7 v7VarE = umVar.e(m80Var);
        Paint paint = (Paint) v7VarE.b;
        long jC = ws0.c(paint.getColor());
        int i2 = dr.h;
        if (!vk2.a(jC, j)) {
            v7VarE.e(j);
        }
        if (((Shader) v7VarE.c) != null) {
            v7VarE.h(null);
        }
        if (!ws0.j((yi) v7VarE.d, null)) {
            v7VarE.f(null);
        }
        if (v7VarE.a != i) {
            v7VarE.d(i);
        }
        if (paint.isFilterBitmap()) {
            return v7VarE;
        }
        v7VarE.g(1);
        return v7VarE;
    }

    @Override // defpackage.l80
    public final ud B() {
        return this.f;
    }

    @Override // defpackage.l80
    public final void M(g7 g7Var, long j, long j2, long j3, float f, yi yiVar, int i) {
        this.e.c.d(g7Var, j, j2, j3, c(null, fd0.a, f, yiVar, 3, i));
    }

    @Override // defpackage.l80
    public final void S(long j, long j2, long j3, float f, int i) {
        sm smVar = this.e.c;
        v7 v7VarC = this.h;
        if (v7VarC == null) {
            v7VarC = vs0.c();
            v7VarC.l(1);
            this.h = v7VarC;
        }
        Paint paint = (Paint) v7VarC.b;
        long jC = ws0.c(paint.getColor());
        int i2 = dr.h;
        if (!vk2.a(jC, j)) {
            v7VarC.e(j);
        }
        if (((Shader) v7VarC.c) != null) {
            v7VarC.h(null);
        }
        if (!ws0.j((yi) v7VarC.d, null)) {
            v7VarC.f(null);
        }
        if (v7VarC.a != 3) {
            v7VarC.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            v7VarC.k(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (v7VarC.a() != i) {
            v7VarC.i(i);
        }
        if (v7VarC.b() != 0) {
            v7VarC.j(0);
        }
        if (!paint.isFilterBitmap()) {
            v7VarC.g(1);
        }
        smVar.m(j2, j3, v7VarC);
    }

    @Override // defpackage.l80
    public final void W(d8 d8Var, long j, m80 m80Var) {
        this.e.c.g(d8Var, a(this, j, m80Var, 3));
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e.a.b();
    }

    public final v7 c(rk rkVar, m80 m80Var, float f, yi yiVar, int i, int i2) {
        v7 v7VarE = e(m80Var);
        Paint paint = (Paint) v7VarE.b;
        if (rkVar != null) {
            rkVar.a(f, d(), v7VarE);
        } else {
            if (((Shader) v7VarE.c) != null) {
                v7VarE.h(null);
            }
            long jC = ws0.c(paint.getColor());
            long j = dr.b;
            if (!vk2.a(jC, j)) {
                v7VarE.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                v7VarE.c(f);
            }
        }
        if (!ws0.j((yi) v7VarE.d, yiVar)) {
            v7VarE.f(yiVar);
        }
        if (v7VarE.a != i) {
            v7VarE.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return v7VarE;
        }
        v7VarE.g(i2);
        return v7VarE;
    }

    public final v7 e(m80 m80Var) {
        if (ws0.j(m80Var, fd0.a)) {
            v7 v7Var = this.g;
            if (v7Var != null) {
                return v7Var;
            }
            v7 v7VarC = vs0.c();
            v7VarC.l(0);
            this.g = v7VarC;
            return v7VarC;
        }
        if (!(m80Var instanceof p92)) {
            qj.p();
            return null;
        }
        v7 v7VarC2 = this.h;
        if (v7VarC2 == null) {
            v7VarC2 = vs0.c();
            v7VarC2.l(1);
            this.h = v7VarC2;
        }
        Paint paint = (Paint) v7VarC2.b;
        float strokeWidth = paint.getStrokeWidth();
        p92 p92Var = (p92) m80Var;
        float f = p92Var.a;
        if (strokeWidth != f) {
            v7VarC2.k(f);
        }
        int iA = v7VarC2.a();
        int i = p92Var.c;
        if (iA != i) {
            v7VarC2.i(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = p92Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iB = v7VarC2.b();
        int i2 = p92Var.d;
        if (iB == i2) {
            return v7VarC2;
        }
        v7VarC2.j(i2);
        return v7VarC2;
    }

    @Override // defpackage.l80
    public final void g(d8 d8Var, rk rkVar, float f, m80 m80Var, int i) {
        this.e.c.g(d8Var, c(rkVar, m80Var, f, null, i, 1));
    }

    @Override // defpackage.l80
    public final kw0 getLayoutDirection() {
        return this.e.b;
    }

    @Override // defpackage.l80
    public final void i0(long j, float f, long j2, m80 m80Var) {
        this.e.c.c(f, j2, a(this, j, m80Var, 3));
    }

    @Override // defpackage.m40
    public final float l() {
        return this.e.a.l();
    }

    @Override // defpackage.l80
    public final void r0(int i, long j, long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.e.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)), a(this, j, fd0.a, i));
    }

    @Override // defpackage.l80
    public final void u(long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, fd0.a, 3));
    }
}

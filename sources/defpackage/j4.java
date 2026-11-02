package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 implements sm {
    public Canvas a = k4.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.sm
    public final void a(g7 g7Var, v7 v7Var) {
        this.a.drawBitmap(ir2.d(g7Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) v7Var.b);
    }

    @Override // defpackage.sm
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.sm
    public final void c(float f, long j, v7 v7Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) v7Var.b);
    }

    @Override // defpackage.sm
    public final void d(g7 g7Var, long j, long j2, long j3, v7 v7Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapD = ir2.d(g7Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapD, rect, rect2, (Paint) v7Var.b);
    }

    @Override // defpackage.sm
    public final void e(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.sm
    public final void f(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.sm
    public final void g(d8 d8Var, v7 v7Var) {
        Canvas canvas = this.a;
        if (!(d8Var instanceof d8)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(d8Var.a, vs0.q(v7Var));
    }

    @Override // defpackage.sm
    public final void h() {
        this.a.rotate(45.0f);
    }

    @Override // defpackage.sm
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.sm
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, v7 v7Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) v7Var.b);
    }

    @Override // defpackage.sm
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.sm
    public final void m(long j, long j2, v7 v7Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) v7Var.b);
    }

    @Override // defpackage.sm
    public final void n() {
        ir2.o(this.a, false);
    }

    @Override // defpackage.sm
    public final void o(yr1 yr1Var, v7 v7Var) {
        this.a.saveLayer(yr1Var.a, yr1Var.b, yr1Var.c, yr1Var.d, (Paint) v7Var.b, 31);
    }

    @Override // defpackage.sm
    public final void p(float f, float f2, float f3, float f4, v7 v7Var) {
        this.a.drawRect(f, f2, f3, f4, vs0.q(v7Var));
    }

    @Override // defpackage.sm
    public final void q(float[] fArr) {
        if (ex.z(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        s5.Q(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.sm
    public final void r() {
        ir2.o(this.a, true);
    }

    @Override // defpackage.sm
    public final void s(d8 d8Var) {
        Canvas canvas = this.a;
        if (!(d8Var instanceof d8)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(d8Var.a, Region.Op.INTERSECT);
    }
}

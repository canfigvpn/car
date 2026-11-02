package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b42 extends f42 {
    public final d42 c;
    public final float d;
    public final float e;

    public b42(d42 d42Var, float f, float f2) {
        this.c = d42Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.f42
    public final void a(Matrix matrix, s32 s32Var, int i, Canvas canvas) {
        d42 d42Var = this.c;
        float f = d42Var.c;
        float f2 = this.e;
        float f3 = d42Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        s32Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = s32Var.f;
        int[] iArr = s32.i;
        iArr[0] = i2;
        iArr[1] = s32Var.e;
        iArr[2] = s32Var.d;
        Paint paint = s32Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, s32.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        d42 d42Var = this.c;
        return (float) Math.toDegrees(Math.atan((d42Var.c - this.e) / (d42Var.b - this.d)));
    }
}

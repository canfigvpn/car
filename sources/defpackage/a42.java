package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a42 extends f42 {
    public final c42 c;

    public a42(c42 c42Var) {
        this.c = c42Var;
    }

    @Override // defpackage.f42
    public final void a(Matrix matrix, s32 s32Var, int i, Canvas canvas) {
        RectF rectF = c42.h;
        c42 c42Var = this.c;
        float f = c42Var.f;
        float f2 = c42Var.g;
        RectF rectF2 = new RectF(c42Var.b, c42Var.c, c42Var.d, c42Var.e);
        Paint paint = s32Var.b;
        boolean z = f2 < 0.0f;
        Path path = s32Var.g;
        int[] iArr = s32.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = s32Var.f;
            iArr[2] = s32Var.e;
            iArr[3] = s32Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = s32Var.d;
            iArr[2] = s32Var.e;
            iArr[3] = s32Var.f;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = s32.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, s32Var.h);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}

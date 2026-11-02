package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d8 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public d8(Path path) {
        this.a = path;
    }

    public static void a(d8 d8Var, d8 d8Var2) {
        Path path = d8Var.a;
        if (!(d8Var2 instanceof d8)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(d8Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(d8 d8Var, hv1 hv1Var) {
        RectF rectF = d8Var.b;
        if (rectF == null) {
            rectF = new RectF();
            d8Var.b = rectF;
        }
        float f = hv1Var.a;
        long j = hv1Var.h;
        long j2 = hv1Var.g;
        long j3 = hv1Var.f;
        long j4 = hv1Var.e;
        rectF.set(f, hv1Var.b, hv1Var.c, hv1Var.d);
        float[] fArr = d8Var.c;
        if (fArr == null) {
            fArr = new float[8];
            d8Var.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = d8Var.a;
        RectF rectF2 = d8Var.b;
        rectF2.getClass();
        float[] fArr2 = d8Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final yr1 c() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new yr1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(d8 d8Var, d8 d8Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(d8Var instanceof d8)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = d8Var.a;
        if (d8Var2 instanceof d8) {
            return this.a.op(path, d8Var2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.a.reset();
    }
}

package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qq0 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;

    public /* synthetic */ qq0(int i, int i2, jm1 jm1Var) {
        this.e = 1;
        this.f = i;
        this.g = jm1Var;
        this.h = i2;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.h;
        int i3 = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ((im1) obj).h((jm1) obj2, i3, i2, 0.0f);
                break;
            case 1:
                jm1 jm1Var = (jm1) obj2;
                ((im1) obj).h(jm1Var, p61.j0((i3 - jm1Var.e) / 2.0f), p61.j0((i2 - jm1Var.f) / 2.0f), 0.0f);
                break;
            case 2:
                ((im1) obj).h((jm1) obj2, i3, i2, 0.0f);
                break;
            default:
                d8 d8Var = (d8) obj2;
                sj1 sj1Var = (sj1) obj;
                y7 y7Var = sj1Var.a;
                int iD = sj1Var.d(i3);
                int iD2 = sj1Var.d(i2);
                CharSequence charSequence = y7Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    wp0.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                ff2 ff2Var = y7Var.d;
                ff2Var.f.getSelectionPath(iD, iD2, path);
                int i4 = ff2Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                d8 d8Var2 = new d8(path);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sj1Var.f)) & 4294967295L);
                Matrix matrix = d8Var2.d;
                if (matrix == null) {
                    d8Var2.d = new Matrix();
                } else {
                    matrix.reset();
                }
                Matrix matrix2 = d8Var2.d;
                matrix2.getClass();
                matrix2.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                Matrix matrix3 = d8Var2.d;
                matrix3.getClass();
                path.transform(matrix3);
                d8.a(d8Var, d8Var2);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ qq0(Object obj, int i, int i2, int i3) {
        this.e = i3;
        this.g = obj;
        this.f = i;
        this.h = i2;
    }
}

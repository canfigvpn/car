package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t81 {
    public final xf a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public t81(xf xfVar, long j, int i, int i2) {
        boolean z;
        int i3;
        int iG;
        int i4;
        this.a = xfVar;
        this.b = i;
        if (sw.j(j) != 0 || sw.i(j) != 0) {
            wp0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) xfVar.i;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= size) {
                z = false;
                break;
            }
            tj1 tj1Var = (tj1) arrayList2.get(i5);
            c8 c8Var = tj1Var.a;
            int iH = sw.h(j);
            if (sw.c(j)) {
                i3 = i5;
                iG = sw.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i3 = i5;
                iG = sw.g(j);
            }
            y7 y7Var = new y7(c8Var, this.b - i6, i2, tw.b(iH, iG, 5));
            float fB = y7Var.b() + f;
            ff2 ff2Var = y7Var.d;
            int i7 = i6 + ff2Var.g;
            arrayList.add(new sj1(y7Var, tj1Var.b, tj1Var.c, i6, i7, f, fB));
            if (!ff2Var.d) {
                if (i7 == this.b) {
                    i4 = i3;
                    if (i4 != vs0.o((ArrayList) this.a.i)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i7;
                f = fB;
            }
            z = true;
            i6 = i7;
            f = fB;
            break;
        }
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = sw.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            sj1 sj1Var = (sj1) arrayList.get(i8);
            List list = sj1Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                yr1 yr1Var = (yr1) list.get(i9);
                arrayList4.add(yr1Var != null ? sj1Var.a(yr1Var) : null);
            }
            ar.I(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.f).size()) {
            int size4 = ((List) this.a.f).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = vq.a0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(t81 t81Var, sm smVar, rk rkVar, float f, q32 q32Var, ed2 ed2Var, m80 m80Var) {
        smVar.l();
        ArrayList arrayList = t81Var.h;
        if (arrayList.size() <= 1 || (rkVar instanceof o72)) {
            j20.m(t81Var, smVar, rkVar, f, q32Var, ed2Var, m80Var);
        } else {
            if (!(rkVar instanceof sk)) {
                qj.p();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                sj1 sj1Var = (sj1) arrayList.get(i);
                fB += sj1Var.a.b();
                fMax = Math.max(fMax, sj1Var.a.d());
            }
            Float.floatToRawIntBits(fMax);
            Float.floatToRawIntBits(fB);
            Shader shader = ((sk) rkVar).c;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                y7 y7Var = ((sj1) arrayList.get(i2)).a;
                y7Var.g(smVar, new sk(shader), f, q32Var, ed2Var, m80Var);
                smVar.f(0.0f, y7Var.b());
                matrix.setTranslate(0.0f, -y7Var.b());
                shader.setLocalMatrix(matrix);
            }
        }
        smVar.i();
    }

    public final void a(long j, float[] fArr) {
        j(of2.f(j));
        k(of2.e(j));
        es1 es1Var = new es1();
        es1Var.e = 0;
        ix.x(this.h, j, new lj(j, fArr, es1Var, new ds1()));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.v(i, arrayList));
        y7 y7Var = sj1Var.a;
        return y7Var.d.e(i - sj1Var.d) + sj1Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.v(i, arrayList));
        y7 y7Var = sj1Var.a;
        int i2 = i - sj1Var.d;
        ff2 ff2Var = y7Var.d;
        if (z) {
            Layout layout = ff2Var.f;
            ThreadLocal threadLocal = jf2.a;
            if (layout.getEllipsisCount(i2) <= 0 || ff2Var.b != TextUtils.TruncateAt.END) {
                xf xfVarC = ff2Var.c();
                Layout layout2 = (Layout) xfVarC.e;
                iF = xfVarC.k(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = ff2Var.f(i2);
        }
        return iF + sj1Var.b;
    }

    public final int d(int i) {
        int iU;
        int length = ((yb) this.a.e).f.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iU = arrayList.size() - 1;
        } else {
            iU = i < 0 ? 0 : ix.u(i, arrayList);
        }
        sj1 sj1Var = (sj1) arrayList.get(iU);
        return sj1Var.a.d.f.getLineForOffset(sj1Var.d(i)) + sj1Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.w(arrayList, f));
        int i = sj1Var.c - sj1Var.b;
        int i2 = sj1Var.d;
        if (i == 0) {
            return i2;
        }
        y7 y7Var = sj1Var.a;
        float f2 = f - sj1Var.f;
        ff2 ff2Var = y7Var.d;
        return ff2Var.f.getLineForVertical(((int) f2) - ff2Var.h) + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.v(i, arrayList));
        y7 y7Var = sj1Var.a;
        return y7Var.d.g(i - sj1Var.d) + sj1Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.w(arrayList, fIntBitsToFloat));
        int i2 = sj1Var.c;
        int i3 = sj1Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        y7 y7Var = sj1Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - sj1Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        ff2 ff2Var = y7Var.d;
        int lineForVertical = ff2Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - ff2Var.h);
        return ff2Var.f.getOffsetForHorizontal(lineForVertical, (ff2Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(yr1 yr1Var, int i, fu1 fu1Var) {
        long jB;
        long j;
        float f = yr1Var.b;
        ArrayList arrayList = this.h;
        int iW = ix.w(arrayList, f);
        float f2 = ((sj1) arrayList.get(iW)).g;
        float f3 = yr1Var.d;
        if (f2 >= f3 || iW == arrayList.size() - 1) {
            sj1 sj1Var = (sj1) arrayList.get(iW);
            return sj1Var.b(sj1Var.a.c(sj1Var.c(yr1Var), i, fu1Var), true);
        }
        int iW2 = ix.w(arrayList, f3);
        long jB2 = of2.b;
        while (true) {
            jB = of2.b;
            if (!of2.b(jB2, jB) || iW > iW2) {
                break;
            }
            sj1 sj1Var2 = (sj1) arrayList.get(iW);
            jB2 = sj1Var2.b(sj1Var2.a.c(sj1Var2.c(yr1Var), i, fu1Var), true);
            iW++;
        }
        if (of2.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = of2.b;
            if (!of2.b(jB, j) || iW > iW2) {
                break;
            }
            sj1 sj1Var3 = (sj1) arrayList.get(iW2);
            jB = sj1Var3.b(sj1Var3.a.c(sj1Var3.c(yr1Var), i, fu1Var), true);
            iW2--;
        }
        return of2.b(jB, j) ? jB2 : j02.c((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void j(int i) {
        yb ybVar = (yb) this.a.e;
        if (i < 0 || i >= ybVar.f.length()) {
            StringBuilder sbM = k3.m(i, "offset(", ") is out of bounds [0, ");
            sbM.append(ybVar.f.length());
            sbM.append(')');
            wp0.a(sbM.toString());
        }
    }

    public final void k(int i) {
        yb ybVar = (yb) this.a.e;
        if (i < 0 || i > ybVar.f.length()) {
            StringBuilder sbM = k3.m(i, "offset(", ") is out of bounds [0, ");
            sbM.append(ybVar.f.length());
            sbM.append(']');
            wp0.a(sbM.toString());
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        wp0.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}

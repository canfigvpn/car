package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hf2 {
    public final gf2 a;
    public final t81 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public hf2(gf2 gf2Var, t81 t81Var, long j) {
        this.a = gf2Var;
        this.b = t81Var;
        this.c = j;
        ArrayList arrayList = t81Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((sj1) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            sj1 sj1Var = (sj1) vq.W(arrayList);
            ff2 ff2Var = sj1Var.a.d;
            fD = ff2Var.d(ff2Var.g - 1) + sj1Var.f;
        }
        this.e = fD;
        this.f = t81Var.g;
    }

    public final jt1 a(int i) {
        t81 t81Var = this.b;
        t81Var.k(i);
        int length = ((yb) t81Var.a.e).f.length();
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(i == length ? arrayList.size() - 1 : ix.u(i, arrayList));
        return sj1Var.a.d.f.isRtlCharAt(sj1Var.d(i)) ? jt1.f : jt1.e;
    }

    public final yr1 b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        t81 t81Var = this.b;
        t81Var.j(i);
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.u(i, arrayList));
        y7 y7Var = sj1Var.a;
        int iD = sj1Var.d(i);
        CharSequence charSequence = y7Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbM = k3.m(iD, "offset(", ") is out of bounds [0,");
            sbM.append(charSequence.length());
            sbM.append(')');
            wp0.a(sbM.toString());
        }
        ff2 ff2Var = y7Var.d;
        Layout layout = ff2Var.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = ff2Var.g(lineForOffset);
        float fE = ff2Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = ff2Var.i(iD, false);
                fH2 = ff2Var.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = ff2Var.h(iD, false);
                fH2 = ff2Var.h(iD + 1, true);
            } else {
                fI = ff2Var.i(iD, false);
                fI2 = ff2Var.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = ff2Var.h(iD, false);
            fI2 = ff2Var.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return sj1Var.a(new yr1(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final yr1 c(int i) {
        t81 t81Var = this.b;
        t81Var.k(i);
        int length = ((yb) t81Var.a.e).f.length();
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(i == length ? arrayList.size() - 1 : ix.u(i, arrayList));
        y7 y7Var = sj1Var.a;
        int iD = sj1Var.d(i);
        CharSequence charSequence = y7Var.e;
        ff2 ff2Var = y7Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbM = k3.m(iD, "offset(", ") is out of bounds [0,");
            sbM.append(charSequence.length());
            sbM.append(']');
            wp0.a(sbM.toString());
        }
        float fH = ff2Var.h(iD, false);
        int lineForOffset = ff2Var.f.getLineForOffset(iD);
        return sj1Var.a(new yr1(fH, ff2Var.g(lineForOffset), fH, ff2Var.e(lineForOffset)));
    }

    public final float d(int i) {
        t81 t81Var = this.b;
        t81Var.l(i);
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.v(i, arrayList));
        y7 y7Var = sj1Var.a;
        int i2 = i - sj1Var.d;
        ff2 ff2Var = y7Var.d;
        return ff2Var.f.getLineLeft(i2) + (i2 == ff2Var.g + (-1) ? ff2Var.j : 0.0f);
    }

    public final float e(int i) {
        t81 t81Var = this.b;
        t81Var.l(i);
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.v(i, arrayList));
        y7 y7Var = sj1Var.a;
        int i2 = i - sj1Var.d;
        ff2 ff2Var = y7Var.d;
        return ff2Var.f.getLineRight(i2) + (i2 == ff2Var.g + (-1) ? ff2Var.k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hf2) {
            hf2 hf2Var = (hf2) obj;
            if (ws0.j(this.a, hf2Var.a) && this.b == hf2Var.b && qr0.a(this.c, hf2Var.c) && this.d == hf2Var.d && this.e == hf2Var.e && this.f.equals(hf2Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i) {
        t81 t81Var = this.b;
        t81Var.l(i);
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(ix.v(i, arrayList));
        y7 y7Var = sj1Var.a;
        return y7Var.d.f.getLineStart(i - sj1Var.d) + sj1Var.b;
    }

    public final jt1 g(int i) {
        t81 t81Var = this.b;
        t81Var.k(i);
        int length = ((yb) t81Var.a.e).f.length();
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(i == length ? arrayList.size() - 1 : ix.u(i, arrayList));
        y7 y7Var = sj1Var.a;
        int iD = sj1Var.d(i);
        ff2 ff2Var = y7Var.d;
        return ff2Var.f.getParagraphDirection(ff2Var.f.getLineForOffset(iD)) == 1 ? jt1.e : jt1.f;
    }

    public final d8 h(int i, int i2) {
        t81 t81Var = this.b;
        yb ybVar = (yb) t81Var.a.e;
        if (i < 0 || i > i2 || i2 > ybVar.f.length()) {
            wp0.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + ybVar.f.length() + "), or start > end!");
        }
        if (i == i2) {
            return f8.a();
        }
        d8 d8VarA = f8.a();
        ix.x(t81Var.h, j02.c(i, i2), new qq0(d8VarA, i, i2, 3));
        return d8VarA;
    }

    public final int hashCode() {
        return this.f.hashCode() + k3.a(this.e, k3.a(this.d, k3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final long i(int i) {
        int iM;
        int iJ;
        int iJ2;
        t81 t81Var = this.b;
        t81Var.k(i);
        int length = ((yb) t81Var.a.e).f.length();
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(i == length ? arrayList.size() - 1 : ix.u(i, arrayList));
        y7 y7Var = sj1Var.a;
        int iD = sj1Var.d(i);
        uc ucVarJ = y7Var.d.j();
        if (ucVarJ.i(ucVarJ.m(iD))) {
            ucVarJ.b(iD);
            iM = iD;
            while (iM != -1 && (!ucVarJ.i(iM) || ucVarJ.e(iM))) {
                iM = ucVarJ.m(iM);
            }
        } else {
            ucVarJ.b(iD);
            if (ucVarJ.h(iD)) {
                iM = (!ucVarJ.f(iD) || ucVarJ.d(iD)) ? ucVarJ.m(iD) : iD;
            } else {
                iM = ucVarJ.d(iD) ? ucVarJ.m(iD) : -1;
            }
        }
        if (iM == -1) {
            iM = iD;
        }
        if (ucVarJ.e(ucVarJ.j(iD))) {
            ucVarJ.b(iD);
            iJ = iD;
            while (iJ != -1 && (ucVarJ.i(iJ) || !ucVarJ.e(iJ))) {
                iJ = ucVarJ.j(iJ);
            }
        } else {
            ucVarJ.b(iD);
            if (ucVarJ.d(iD)) {
                if (!ucVarJ.f(iD) || ucVarJ.h(iD)) {
                    iJ2 = ucVarJ.j(iD);
                    iJ = iJ2;
                } else {
                    iJ = iD;
                }
            } else if (ucVarJ.h(iD)) {
                iJ2 = ucVarJ.j(iD);
                iJ = iJ2;
            } else {
                iJ = -1;
            }
        }
        if (iJ != -1) {
            iD = iJ;
        }
        return sj1Var.b(j02.c(iM, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) qr0.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}

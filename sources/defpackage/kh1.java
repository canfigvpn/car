package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends zh1 {
    public static final kh1 c = new kh1(1, 0, 2);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        int[] iArr;
        vj0 vj0Var;
        int iC;
        int iD = vpVar.d(0);
        if (o52Var.n != 0) {
            hv.a("Cannot move a group while inserting");
        }
        if (iD < 0) {
            hv.a("Parameter offset is out of bounds");
        }
        if (iD == 0) {
            return;
        }
        int i = o52Var.t;
        int i2 = o52Var.v;
        int i3 = o52Var.u;
        int i4 = i;
        while (true) {
            iArr = o52Var.b;
            if (iD <= 0) {
                break;
            }
            i4 += iArr[(o52Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                hv.a("Parameter offset is out of bounds");
            }
            iD--;
        }
        int i5 = iArr[(o52Var.q(i4) * 5) + 3];
        int iF = o52Var.f(o52Var.b, o52Var.q(o52Var.t));
        int iF2 = o52Var.f(o52Var.b, o52Var.q(i4));
        int i6 = i4 + i5;
        int iF3 = o52Var.f(o52Var.b, o52Var.q(i6));
        int i7 = iF3 - iF2;
        o52Var.w(i7, Math.max(o52Var.t - 1, 0));
        o52Var.v(i5);
        int[] iArr2 = o52Var.b;
        int iQ = o52Var.q(i6) * 5;
        ve.u0(o52Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = o52Var.c;
            int iG = o52Var.g(iF2 + i7);
            System.arraycopy(objArr, iG, objArr, iF, o52Var.g(iF3 + i7) - iG);
        }
        int i8 = iF2 + i7;
        int i9 = i8 - iF;
        int i10 = o52Var.k;
        int i11 = o52Var.l;
        int length = o52Var.c.length;
        int i12 = o52Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = o52Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = o52.h(o52.h(o52Var.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), o52Var.k, o52Var.l, o52Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = o52Var.o();
        int iB = n52.b(o52Var.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < o52Var.d.size() && (iC = o52Var.c((vj0Var = (vj0) o52Var.d.get(iB)))) >= i6 && iC < i16) {
                arrayList.add(vj0Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            vj0 vj0Var2 = (vj0) arrayList.get(i18);
            int iC2 = o52Var.c(vj0Var2) + i17;
            if (iC2 >= o52Var.g) {
                vj0Var2.a = -(iO - iC2);
            } else {
                vj0Var2.a = iC2;
            }
            o52Var.d.add(n52.b(o52Var.d, iC2, iO), vj0Var2);
        }
        if (o52Var.H(i6, i5)) {
            hv.a("Unexpectedly removed anchors");
        }
        o52Var.l(i2, o52Var.u, i);
        if (i7 > 0) {
            o52Var.I(i8, i7, i6 - 1);
        }
    }
}

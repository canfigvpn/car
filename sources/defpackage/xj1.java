package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xj1 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        zf2[] zf2VarArr = yf2.b;
        a = yf2.c;
    }

    public static final wj1 a(wj1 wj1Var, int i, int i2, long j, xe2 xe2Var, ym1 ym1Var, o21 o21Var, int i3, int i4, mf2 mf2Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        xe2 xe2Var2 = xe2Var;
        ym1 ym1Var2 = ym1Var;
        o21 o21Var2 = o21Var;
        int i7 = i3;
        int i8 = i4;
        mf2 mf2Var2 = mf2Var;
        if (i5 == 0 || i5 == wj1Var.a) {
            zf2[] zf2VarArr = yf2.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (yf2.a(j3, wj1Var.c)) {
                }
            }
            if ((xe2Var2 == null || xe2Var2.equals(wj1Var.d)) && ((i6 == 0 || i6 == wj1Var.b) && ((ym1Var2 == null || ym1Var2.equals(wj1Var.e)) && ((o21Var2 == null || o21Var2.equals(wj1Var.f)) && ((i7 == 0 || i7 == wj1Var.g) && ((i8 == 0 || i8 == wj1Var.h) && (mf2Var2 == null || mf2Var2.equals(wj1Var.i)))))))) {
                return wj1Var;
            }
        } else {
            j2 = 0;
        }
        zf2[] zf2VarArr2 = yf2.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = wj1Var.c;
        }
        if (xe2Var2 == null) {
            xe2Var2 = wj1Var.d;
        }
        if (i5 == 0) {
            i5 = wj1Var.a;
        }
        if (i6 == 0) {
            i6 = wj1Var.b;
        }
        ym1 ym1Var3 = wj1Var.e;
        if (ym1Var3 != null && ym1Var2 == null) {
            ym1Var2 = ym1Var3;
        }
        if (o21Var2 == null) {
            o21Var2 = wj1Var.f;
        }
        if (i7 == 0) {
            i7 = wj1Var.g;
        }
        if (i8 == 0) {
            i8 = wj1Var.h;
        }
        if (mf2Var2 == null) {
            mf2Var2 = wj1Var.i;
        }
        return new wj1(i5, i6, j3, xe2Var2, ym1Var2, o21Var2, i7, i8, mf2Var2);
    }
}

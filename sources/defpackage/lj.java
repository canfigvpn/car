package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj implements ej0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lj(long j, float[] fArr, es1 es1Var, ds1 ds1Var) {
        this.f = j;
        this.g = fArr;
        this.h = es1Var;
        this.i = ds1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        long j;
        ll2 ll2Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        int i2 = this.e;
        ll2 ll2Var2 = ll2.a;
        Object obj2 = this.i;
        Serializable serializable = this.h;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                yr1 yr1Var = (yr1) obj3;
                gs1 gs1Var = (gs1) serializable;
                long j2 = this.f;
                yi yiVar = (yi) obj2;
                cx0 cx0Var = (cx0) obj;
                cx0Var.a();
                float f = yr1Var.a;
                float f2 = yr1Var.b;
                um umVar = cx0Var.e;
                ((ao2) umVar.f.b).w(f, f2);
                try {
                    l80.Q(cx0Var, (g7) gs1Var.e, j2, 0L, 0.0f, yiVar, 0, 890);
                    return ll2Var2;
                } finally {
                    ((ao2) umVar.f.b).w(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                es1 es1Var = (es1) serializable;
                ds1 ds1Var = (ds1) obj2;
                sj1 sj1Var = (sj1) obj;
                int i3 = sj1Var.b;
                y7 y7Var = sj1Var.a;
                int iE = sj1Var.c;
                long j3 = this.f;
                int iF = i3 > of2.f(j3) ? sj1Var.b : of2.f(j3);
                if (iE >= of2.e(j3)) {
                    iE = of2.e(j3);
                }
                long jC = j02.c(sj1Var.d(iF), sj1Var.d(iE));
                int i4 = es1Var.e;
                ff2 ff2Var = y7Var.d;
                int iF2 = of2.f(jC);
                int iE2 = of2.e(jC);
                Layout layout = ff2Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    wp0.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    wp0.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    wp0.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    wp0.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iE2 - iF2) * 4) {
                    wp0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                pn0 pn0Var = new pn0(ff2Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        j = jC;
                        int iF3 = ff2Var.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = ff2Var.g(lineForOffset);
                        float fE = ff2Var.e(lineForOffset);
                        ll2Var = ll2Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = pn0Var.a(i6, false, false, false);
                                    i = iMin;
                                    fA = pn0Var.a(i6 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = pn0Var.a(i6, false, false, false);
                                        fA2 = pn0Var.a(i6 + 1, true, true, false);
                                    } else {
                                        fA2 = pn0Var.a(i6, false, false, true);
                                        fA = pn0Var.a(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fA;
                                fArr[i5 + 1] = fG;
                                fArr[i5 + 2] = fA2;
                                fArr[i5 + 3] = fE;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fA = pn0Var.a(i6, z, z, true);
                                i = iMin;
                                fA2 = pn0Var.a(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fA;
                            fArr[i5 + 1] = fG;
                            fArr[i5 + 2] = fA2;
                            fArr[i5 + 3] = fE;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            jC = j;
                            i4 = i5;
                            ll2Var2 = ll2Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jC;
                    ll2Var = ll2Var2;
                    fArr = fArr2;
                }
                int iD = (of2.d(j) * 4) + es1Var.e;
                for (int i7 = es1Var.e; i7 < iD; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = ds1Var.e;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                es1Var.e = iD;
                ds1Var.e = y7Var.b() + ds1Var.e;
                return ll2Var;
        }
    }

    public /* synthetic */ lj(yr1 yr1Var, gs1 gs1Var, long j, yi yiVar) {
        this.g = yr1Var;
        this.h = gs1Var;
        this.f = j;
        this.i = yiVar;
    }
}

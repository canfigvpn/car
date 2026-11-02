package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h6 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h6(jm1 jm1Var, tg2 tg2Var, float f) {
        this.e = 2;
        this.g = jm1Var;
        this.h = tg2Var;
        this.f = f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[PHI: r0
  0x00a8: PHI (r0v15 float) = (r0v14 float), (r0v21 float) binds: [B:29:0x00bc, B:23:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        float fFloatValue;
        int i = this.e;
        float f = 0.0f;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.h;
        float f2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                g7 g7Var = (g7) obj3;
                yi yiVar = (yi) obj2;
                cx0 cx0Var = (cx0) obj;
                cx0Var.a();
                ud udVar = cx0Var.e.f;
                long jM = udVar.m();
                udVar.g().l();
                try {
                    ao2 ao2Var = (ao2) udVar.b;
                    ao2Var.w(f2, 0.0f);
                    sm smVarG = ((ud) ao2Var.f).g();
                    smVarG.f(Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                    smVarG.h();
                    smVarG.f(-Float.intBitsToFloat(0), -Float.intBitsToFloat(0));
                    l80.J(cx0Var, g7Var, yiVar);
                    return ll2Var;
                } finally {
                    k3.s(udVar, jM);
                }
            case 1:
                ds1 ds1Var = (ds1) obj3;
                m01 m01Var = (m01) obj2;
                mb mbVar = (mb) obj;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) mbVar.e.getValue()).floatValue();
                    if (fFloatValue > f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) mbVar.e.getValue()).floatValue();
                    if (fFloatValue < f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                }
                float f3 = f - ds1Var.e;
                if (f3 != ((xx1) m01Var.b).a(f3) || f != ((Number) mbVar.e.getValue()).floatValue()) {
                    mbVar.a();
                }
                ds1Var.e += f3;
                return ll2Var;
            case 2:
                jm1 jm1Var = (jm1) obj3;
                im1 im1Var = (im1) obj;
                ia iaVar = ((tg2) obj2).w;
                im1.k(im1Var, jm1Var, iaVar != null ? (int) ((Number) iaVar.d()).floatValue() : (int) f2, 0);
                return ll2Var;
            default:
                wl2 wl2Var = (wl2) obj3;
                ej0 ej0Var = (ej0) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = wl2Var.b;
                if (j == Long.MIN_VALUE) {
                    wl2Var.b = jLongValue;
                    j = jLongValue;
                }
                float f4 = wl2Var.e;
                pb pbVar = new pb(f4);
                pb pbVar2 = wl2.f;
                long jB = f2 == 0.0f ? wl2Var.a.b(new pb(f4), pbVar2, wl2Var.c) : p61.k0((jLongValue - j) / f2);
                float f5 = ((pb) wl2Var.a.p(jB, pbVar, pbVar2, wl2Var.c)).a;
                wl2Var.c = (pb) wl2Var.a.l(jB, pbVar, pbVar2, wl2Var.c);
                wl2Var.b = jLongValue;
                float f6 = wl2Var.e - f5;
                wl2Var.e = f5;
                ej0Var.h(Float.valueOf(f6));
                return ll2Var;
        }
    }

    public /* synthetic */ h6(float f, Object obj, Object obj2, int i) {
        this.e = i;
        this.f = f;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ h6(wl2 wl2Var, float f, ej0 ej0Var) {
        this.e = 3;
        this.g = wl2Var;
        this.f = f;
        this.h = ej0Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pd2 implements ij0 {
    public final /* synthetic */ vf2 e;
    public final /* synthetic */ vf2 f;
    public final /* synthetic */ p82 g;
    public final /* synthetic */ p82 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ p82 j;
    public final /* synthetic */ jj0 k;
    public final /* synthetic */ sd2 l;

    public pd2(vf2 vf2Var, vf2 vf2Var2, ii2 ii2Var, ii2 ii2Var2, boolean z, ii2 ii2Var3, jj0 jj0Var, sd2 sd2Var) {
        this.e = vf2Var;
        this.f = vf2Var2;
        this.g = ii2Var;
        this.h = ii2Var2;
        this.i = z;
        this.j = ii2Var3;
        this.k = jj0Var;
        this.l = sd2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        q32 q32VarJ;
        q32 q32Var;
        gn1 gn1Var;
        ym1 ym1Var;
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            float fFloatValue = ((Number) this.g.getValue()).floatValue();
            vf2 vf2Var = this.e;
            r72 r72Var = vf2Var.a;
            vf2 vf2Var2 = this.f;
            r72 r72Var2 = vf2Var2.a;
            ve2 ve2Var = s72.d;
            ve2 ve2Var2 = r72Var.a;
            ve2 ve2Var3 = r72Var2.a;
            boolean z = ve2Var2 instanceof tk;
            ve2 tkVar = ue2.a;
            if (!z && !(ve2Var3 instanceof tk)) {
                long jG = ws0.G(ve2Var2.b(), ve2Var3.b(), fFloatValue);
                if (jG != 16) {
                    tkVar = new sr(jG);
                }
            } else if (z && (ve2Var3 instanceof tk)) {
                tk tkVar2 = (tk) ve2Var2;
                tk tkVar3 = (tk) ve2Var3;
                rk rkVar = (rk) s72.b(tkVar2.a, tkVar3.a, fFloatValue);
                float fD = rw.D(tkVar2.b, tkVar3.b, fFloatValue);
                if (rkVar != null) {
                    if (rkVar instanceof o72) {
                        long jN = n02.n(fD, ((o72) rkVar).a);
                        if (jN != 16) {
                            tkVar = new sr(jN);
                        }
                    } else {
                        if (!(rkVar instanceof sk)) {
                            qj.p();
                            return null;
                        }
                        tkVar = new tk((sk) rkVar, fD);
                    }
                }
            } else {
                tkVar = (ve2) s72.b(ve2Var2, ve2Var3, fFloatValue);
            }
            ve2 ve2Var4 = tkVar;
            kg0 kg0Var = (kg0) s72.b(r72Var.f, r72Var2.f, fFloatValue);
            long jC = s72.c(r72Var.b, r72Var2.b, fFloatValue);
            lh0 lh0Var = r72Var.c;
            if (lh0Var == null) {
                lh0Var = lh0.i;
            }
            lh0 lh0Var2 = r72Var2.c;
            if (lh0Var2 == null) {
                lh0Var2 = lh0.i;
            }
            lh0 lh0Var3 = new lh0(ex.h(rw.E(fFloatValue, lh0Var.e, lh0Var2.e), 1, 1000));
            hh0 hh0Var = (hh0) s72.b(r72Var.d, r72Var2.d, fFloatValue);
            ih0 ih0Var = (ih0) s72.b(r72Var.e, r72Var2.e, fFloatValue);
            String str = (String) s72.b(r72Var.g, r72Var2.g, fFloatValue);
            long jC2 = s72.c(r72Var.h, r72Var2.h, fFloatValue);
            th thVar = r72Var.i;
            float f = thVar != null ? thVar.a : 0.0f;
            th thVar2 = r72Var2.i;
            float fD2 = rw.D(f, thVar2 != null ? thVar2.a : 0.0f, fFloatValue);
            we2 we2Var = r72Var.j;
            we2 we2Var2 = we2.c;
            if (we2Var == null) {
                we2Var = we2Var2;
            }
            we2 we2Var3 = r72Var2.j;
            if (we2Var3 != null) {
                we2Var2 = we2Var3;
            }
            we2 we2Var4 = new we2(rw.D(we2Var.a, we2Var2.a, fFloatValue), rw.D(we2Var.b, we2Var2.b, fFloatValue));
            q31 q31Var = (q31) s72.b(r72Var.k, r72Var2.k, fFloatValue);
            long jG2 = ws0.G(r72Var.l, r72Var2.l, fFloatValue);
            ed2 ed2Var = (ed2) s72.b(r72Var.m, r72Var2.m, fFloatValue);
            q32 q32Var2 = r72Var.n;
            q32 q32Var3 = r72Var2.n;
            if (q32Var2 == null && q32Var3 == null) {
                q32Var = null;
            } else {
                if (q32Var2 == null) {
                    q32Var3.getClass();
                    q32VarJ = j12.j(new q32(dr.b(0.0f, q32Var3.a), q32Var3.b, q32Var3.c), q32Var3, fFloatValue);
                } else {
                    q32VarJ = q32Var3 == null ? j12.j(q32Var2, new q32(dr.b(0.0f, q32Var2.a), q32Var2.b, q32Var2.c), fFloatValue) : j12.j(q32Var2, q32Var3, fFloatValue);
                }
                q32Var = q32VarJ;
            }
            gn1 gn1Var2 = r72Var.o;
            gn1 gn1Var3 = r72Var2.o;
            if (gn1Var2 == null && gn1Var3 == null) {
                gn1Var = null;
            } else {
                if (gn1Var2 == null) {
                    gn1Var2 = gn1.a;
                }
                gn1Var = gn1Var2;
            }
            r72 r72Var3 = new r72(ve2Var4, jC, lh0Var3, hh0Var, ih0Var, kg0Var, str, jC2, new th(fD2), we2Var4, q31Var, jG2, ed2Var, q32Var, gn1Var, (m80) s72.b(r72Var.p, r72Var2.p, fFloatValue));
            wj1 wj1Var = vf2Var.b;
            wj1 wj1Var2 = vf2Var2.b;
            int i = xj1.b;
            int i2 = ((gc2) s72.b(new gc2(wj1Var.a), new gc2(wj1Var2.a), fFloatValue)).a;
            int i3 = ((hd2) s72.b(new hd2(wj1Var.b), new hd2(wj1Var2.b), fFloatValue)).a;
            long jC3 = s72.c(wj1Var.c, wj1Var2.c, fFloatValue);
            xe2 xe2Var = wj1Var.d;
            if (xe2Var == null) {
                xe2Var = xe2.c;
            }
            xe2 xe2Var2 = wj1Var2.d;
            if (xe2Var2 == null) {
                xe2Var2 = xe2.c;
            }
            xe2 xe2Var3 = new xe2(s72.c(xe2Var.a, xe2Var2.a, fFloatValue), s72.c(xe2Var.b, xe2Var2.b, fFloatValue));
            ym1 ym1Var2 = wj1Var.e;
            ym1 ym1Var3 = wj1Var2.e;
            if (ym1Var2 == null && ym1Var3 == null) {
                ym1Var = null;
            } else {
                ym1 ym1Var4 = ym1.c;
                ym1 ym1Var5 = ym1Var2 == null ? ym1Var4 : ym1Var2;
                boolean z2 = ym1Var5.a;
                if (ym1Var3 == null) {
                    ym1Var3 = ym1Var4;
                }
                boolean z3 = ym1Var3.a;
                ym1Var = z2 == z3 ? ym1Var5 : new ym1(((ra0) s72.b(new ra0(ym1Var5.b), new ra0(ym1Var3.b), fFloatValue)).a, ((Boolean) s72.b(Boolean.valueOf(z2), Boolean.valueOf(z3), fFloatValue)).booleanValue());
            }
            vf2 vf2Var3 = new vf2(r72Var3, new wj1(i2, i3, jC3, xe2Var3, ym1Var, (o21) s72.b(wj1Var.f, wj1Var2.f, fFloatValue), ((j21) s72.b(new j21(wj1Var.g), new j21(wj1Var2.g), fFloatValue)).a, ((yn0) s72.b(new yn0(wj1Var.h), new yn0(wj1Var2.h), fFloatValue)).a, (mf2) s72.b(wj1Var.i, wj1Var2.i, fFloatValue)));
            if (this.i) {
                vf2Var3 = vf2.a(vf2Var3, ((dr) this.j.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            j12.b(((dr) this.h.getValue()).a, vf2Var3, vs0.C(1157484991, new ji(10, this.k, this.l), ak0Var), ak0Var, 384);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

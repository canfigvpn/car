package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o10 implements jj0 {
    public final /* synthetic */ long e;
    public final /* synthetic */ da1 f;
    public final /* synthetic */ ez g;
    public final /* synthetic */ q01 h;
    public final /* synthetic */ lr0 i;
    public final /* synthetic */ em j;
    public final /* synthetic */ n00 k;
    public final /* synthetic */ bm l;
    public final /* synthetic */ l00 m;

    public o10(long j, da1 da1Var, ez ezVar, q01 q01Var, lr0 lr0Var, em emVar, n00 n00Var, bm bmVar, l00 l00Var) {
        this.e = j;
        this.f = da1Var;
        this.g = ezVar;
        this.h = q01Var;
        this.i = lr0Var;
        this.j = emVar;
        this.k = n00Var;
        this.l = bmVar;
        this.m = l00Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        ak0 ak0Var = (ak0) obj2;
        ((Number) obj3).intValue();
        String strL = r02.l(R.string.m3c_date_picker_year_picker_pane_title, ak0Var);
        boolean zF = ak0Var.f(strL);
        Object objL = ak0Var.L();
        is1 is1Var = cv.a;
        if (zF || objL == is1Var) {
            objL = new ii(strL, 4);
            ak0Var.g0(objL);
        }
        r71 r71Var = r71.a;
        u71 u71VarA = l02.a(r71Var, false, (ej0) objL);
        wr wrVarA = ur.a(ws0.g, q90.r, ak0Var, 0);
        int iX = ws0.x(ak0Var);
        sl1 sl1VarL = ak0Var.l();
        u71 u71VarB = nj2.B(ak0Var, u71VarA);
        wu.c.getClass();
        wv wvVar = vu.b;
        ak0Var.Z();
        if (ak0Var.S) {
            ak0Var.k(wvVar);
        } else {
            ak0Var.j0();
        }
        p12.l(vu.f, ak0Var, wrVarA);
        p12.l(vu.e, ak0Var, sl1VarL);
        ra raVar = vu.g;
        if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
            k3.p(iX, ak0Var, iX, raVar);
        }
        p12.l(vu.d, ak0Var, u71VarB);
        kj1 kj1Var = e20.a;
        u71 u71VarE0 = p61.e0(f52.f(r71Var, 336.0f - l60.a), 12.0f, 0.0f, 2);
        da1 da1Var = this.f;
        boolean zF2 = ak0Var.f(da1Var);
        ez ezVar = this.g;
        boolean zH = zF2 | ak0Var.h(ezVar);
        q01 q01Var = this.h;
        boolean zF3 = zH | ak0Var.f(q01Var);
        lr0 lr0Var = this.i;
        boolean zH2 = zF3 | ak0Var.h(lr0Var);
        em emVar = this.j;
        boolean zF4 = zH2 | ak0Var.f(emVar);
        Object objL2 = ak0Var.L();
        if (zF4 || objL2 == is1Var) {
            q2 q2Var = new q2(ezVar, da1Var, q01Var, lr0Var, emVar);
            ak0Var.g0(q2Var);
            objL2 = q2Var;
        }
        long j = this.e;
        n00 n00Var = this.k;
        bm bmVar = this.l;
        l00 l00Var = this.m;
        e20.n(u71VarE0, j, (ej0) objL2, n00Var, bmVar, lr0Var, l00Var, ak0Var, 6);
        p61.h(null, 0.0f, l00Var.x, ak0Var, 0, 3);
        ak0Var.p(true);
        return ll2.a;
    }
}

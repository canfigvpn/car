package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y10 implements ij0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public y10(ti0 ti0Var, boolean z, ti0 ti0Var2, boolean z2) {
        this.h = ti0Var;
        this.f = z;
        this.i = ti0Var2;
        this.g = z2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    gd0 gd0Var = f52.a;
                    String str = (String) obj4;
                    l00 l00Var = (l00) obj3;
                    w61 w61VarC = xj.c(q90.j, false);
                    int iX = ws0.x(ak0Var);
                    sl1 sl1VarL = ak0Var.l();
                    u71 u71VarB = nj2.B(ak0Var, gd0Var);
                    wu.c.getClass();
                    wv wvVar = vu.b;
                    ak0Var.Z();
                    if (ak0Var.S) {
                        ak0Var.k(wvVar);
                    } else {
                        ak0Var.j0();
                    }
                    p12.l(vu.f, ak0Var, w61VarC);
                    p12.l(vu.e, ak0Var, sl1VarL);
                    ra raVar = vu.g;
                    if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                        k3.p(iX, ak0Var, iX, raVar);
                    }
                    p12.l(vu.d, ak0Var, u71VarB);
                    Object objL = ak0Var.L();
                    if (objL == cv.a) {
                        objL = new s1(29);
                        ak0Var.g0(objL);
                    }
                    AtomicInteger atomicInteger = l02.a;
                    gq gqVar = new gq((ej0) objL);
                    l00Var.getClass();
                    ef2.b(str, gqVar, ((dr) c52.a(this.g ? l00Var.j : this.f ? l00Var.i : l00Var.g, rw.Q(h81.g, ak0Var), ak0Var).getValue()).a, 0L, 0L, new gc2(3), 0L, 0, false, 0, 0, null, ak0Var, 0, 0, 261112);
                    ak0Var.p(true);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    ti0 ti0Var = (ti0) obj4;
                    ti0 ti0Var2 = (ti0) obj3;
                    sv1 sv1VarA = rv1.a(ws0.e, q90.o, ak0Var2, 0);
                    int iX2 = ws0.x(ak0Var2);
                    sl1 sl1VarL2 = ak0Var2.l();
                    u71 u71VarB2 = nj2.B(ak0Var2, r71.a);
                    wu.c.getClass();
                    wv wvVar2 = vu.b;
                    ak0Var2.Z();
                    if (ak0Var2.S) {
                        ak0Var2.k(wvVar2);
                    } else {
                        ak0Var2.j0();
                    }
                    p12.l(vu.f, ak0Var2, sv1VarA);
                    p12.l(vu.e, ak0Var2, sl1VarL2);
                    ra raVar2 = vu.g;
                    if (ak0Var2.S || !ws0.j(ak0Var2.L(), Integer.valueOf(iX2))) {
                        k3.p(iX2, ak0Var2, iX2, raVar2);
                    }
                    p12.l(vu.d, ak0Var2, u71VarB2);
                    jo0 jo0VarB = mx.e;
                    if (jo0VarB == null) {
                        io0 io0Var = new io0("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i2 = jm2.a;
                        o72 o72Var = new o72(dr.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new xk1(15.41f, 16.59f));
                        arrayList.add(new wk1(10.83f, 12.0f));
                        arrayList.add(new el1(4.58f, -4.59f));
                        arrayList.add(new wk1(14.0f, 6.0f));
                        arrayList.add(new el1(-6.0f, 6.0f));
                        arrayList.add(new el1(6.0f, 6.0f));
                        arrayList.add(new el1(1.41f, -1.41f));
                        arrayList.add(tk1.c);
                        io0.a(io0Var, arrayList, o72Var);
                        jo0VarB = io0Var.b();
                        mx.e = jo0VarB;
                    }
                    e20.h(ti0Var, jo0VarB, r02.l(R.string.m3c_date_picker_switch_to_previous_month, ak0Var2), null, this.f, ak0Var2, 0, 8);
                    jo0 jo0VarB2 = mx.f;
                    if (jo0VarB2 == null) {
                        io0 io0Var2 = new io0("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i3 = jm2.a;
                        o72 o72Var2 = new o72(dr.b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new xk1(8.59f, 16.59f));
                        arrayList2.add(new wk1(13.17f, 12.0f));
                        arrayList2.add(new wk1(8.59f, 7.41f));
                        arrayList2.add(new wk1(10.0f, 6.0f));
                        arrayList2.add(new el1(6.0f, 6.0f));
                        arrayList2.add(new el1(-6.0f, 6.0f));
                        arrayList2.add(new el1(-1.41f, -1.41f));
                        arrayList2.add(tk1.c);
                        io0.a(io0Var2, arrayList2, o72Var2);
                        jo0VarB2 = io0Var2.b();
                        mx.f = jo0VarB2;
                    }
                    e20.h(ti0Var2, jo0VarB2, r02.l(R.string.m3c_date_picker_switch_to_next_month, ak0Var2), null, this.g, ak0Var2, 0, 8);
                    ak0Var2.p(true);
                }
                break;
        }
        return ll2Var;
    }

    public y10(String str, l00 l00Var, boolean z, boolean z2) {
        this.h = str;
        this.i = l00Var;
        this.f = z;
        this.g = z2;
    }
}

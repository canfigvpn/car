package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(int i, Object obj) {
        super(1);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        int i2 = 0;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                z3 z3Var = (z3) obj;
                bx0 bx0Var = (bx0) obj2;
                if (z3Var.X() != Integer.MAX_VALUE) {
                    if (z3Var.a().b) {
                        z3Var.q();
                    }
                    for (Map.Entry entry : z3Var.a().i.entrySet()) {
                        bx0Var.a((u3) entry.getKey(), ((Number) entry.getValue()).intValue(), z3Var.o());
                    }
                    me1 me1Var = z3Var.o().u;
                    me1Var.getClass();
                    while (!me1Var.equals(bx0Var.a.o())) {
                        for (u3 u3Var : bx0Var.b(me1Var).keySet()) {
                            bx0Var.a(u3Var, bx0Var.c(me1Var, u3Var), me1Var);
                        }
                        me1Var = me1Var.u;
                        me1Var.getClass();
                    }
                }
                return ll2Var;
            case 1:
                return Boolean.valueOf(((cg0) obj).M0(((lf0) obj2).a));
            case 2:
                u41 u41Var = (u41) obj;
                e5 e5Var = ((r4) obj2).t;
                if (e5Var.getInsetsListener().k.h() > 0) {
                    d91 d91Var = jq2.a;
                    long jP = u41Var.a().P();
                    w91 w91Var = e5Var.getInsetsListener().j;
                    int i3 = (int) (jP >> 32);
                    int i4 = (int) (jP & 4294967295L);
                    for (hq2 hq2Var : jq2.b) {
                        Object objG = w91Var.g(hq2Var);
                        objG.getClass();
                        wq2 wq2Var = (wq2) objG;
                        jq2.a(u41Var, ((iq2) hq2Var).c, wq2Var.h, i3, i4);
                        if (((Boolean) wq2Var.b.getValue()).booleanValue()) {
                            jq2.a(u41Var, wq2Var.f, wq2Var.j, i3, i4);
                            jq2.a(u41Var, wq2Var.g, wq2Var.k, i3, i4);
                        }
                        jq2.a(u41Var, ((iq2) hq2Var).d, wq2Var.i, i3, i4);
                    }
                    p91 p91Var = e5Var.getInsetsListener().l;
                    if (p91Var.i()) {
                        h72 h72Var = e5Var.getInsetsListener().m;
                        Object[] objArr = p91Var.a;
                        int i5 = p91Var.b;
                        while (i2 < i5) {
                            da1 da1Var = (da1) objArr[i2];
                            cq0 cq0Var = (cq0) h72Var.get(i2);
                            Rect rect = (Rect) da1Var.getValue();
                            u41Var.c(cq0Var.b(), rect.left);
                            u41Var.c(cq0Var.d(), rect.top);
                            u41Var.c(cq0Var.c(), rect.right);
                            u41Var.c(cq0Var.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return ll2Var;
            case 3:
                return Boolean.valueOf(((gr0) obj2).a(((p02) obj).f));
            case 4:
                return Boolean.valueOf(ws0.E((p02) obj, (Resources) obj2));
            case 5:
                return Boolean.valueOf(ws0.j(obj, obj2));
            case 6:
                cx0 cx0Var = (cx0) obj;
                ((kc1) obj2).h(cx0Var);
                cx0Var.a();
                return ll2Var;
            case 7:
                sb sbVar = (sb) obj;
                float f = sbVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = sbVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = sbVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = sbVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new dr(dr.a(ws0.b(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, qr.x), (mr) obj2));
            case 8:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return ll2Var;
            case 9:
                return new r2(6, (f60) obj2);
            case 10:
                d70 d70Var = (d70) obj;
                if (!d70Var.e.r) {
                    return ri2.f;
                }
                d70 d70Var2 = d70Var.t;
                ri2 ri2Var = ri2.e;
                if (d70Var2 != null) {
                    y3 y3Var = new y3(10, (ao2) obj2);
                    if (y3Var.h(d70Var2) == ri2Var) {
                        p12.p(d70Var2, y3Var);
                    }
                }
                d70Var.t = null;
                d70Var.s = null;
                return ri2Var;
            case 11:
                if (uk0.b.compareAndSet(false, true)) {
                    ((zk) obj2).c(ll2Var);
                }
                return ll2Var;
            case 12:
                l80 l80Var = (l80) obj;
                al0 al0Var = (al0) obj2;
                d8 d8Var = al0Var.l;
                if (al0Var.n && al0Var.w && d8Var != null) {
                    ud udVarB = l80Var.B();
                    long jM = udVarB.m();
                    udVarB.g().l();
                    try {
                        ((ud) ((ao2) udVarB.b).f).g().s(d8Var);
                        al0Var.c(l80Var);
                    } finally {
                        k3.s(udVarB, jM);
                    }
                } else {
                    al0Var.c(l80Var);
                }
                return ll2Var;
            case 13:
                l80 l80Var2 = (l80) obj;
                sm smVarG = l80Var2.B().g();
                ij0 ij0Var = ((dl0) obj2).h;
                if (ij0Var != null) {
                    ij0Var.g(smVarG, (al0) l80Var2.B().c);
                }
                return ll2Var;
            case 14:
                am2 am2Var = (am2) obj;
                nl0 nl0Var = (nl0) obj2;
                nl0Var.g(am2Var);
                ej0 ej0Var = nl0Var.i;
                if (ej0Var != null) {
                    ej0Var.h(am2Var);
                }
                return ll2Var;
            case 15:
                ze1 ze1Var = (ze1) obj;
                vr1 vr1Var = ze1Var.b;
                if (vr1Var != null) {
                    vr1Var.closeConnection();
                    ze1Var.b = null;
                }
                eq0 eq0Var = (eq0) obj2;
                fa1 fa1Var = eq0Var.d;
                Object[] objArr2 = fa1Var.e;
                int i6 = fa1Var.g;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!ws0.j((lo2) objArr2[i2], ze1Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    fa1Var.k(i2);
                }
                if (fa1Var.g == 0) {
                    eq0Var.b.a();
                }
                return ll2Var;
            case 16:
                ((fa1) obj2).b((s71) obj);
                return Boolean.TRUE;
            case 17:
                w02.e((z02) obj, ((wu1) obj2).a);
                return ll2Var;
            case 18:
                w02.b((z02) obj, (String) obj2);
                return ll2Var;
            case 19:
                ((List) obj).add((Float) ((b01) obj2).a());
                return true;
            case 20:
                bu1 bu1Var = (bu1) obj;
                r32 r32Var = (r32) obj2;
                bu1Var.j(bu1Var.r.b() * 3.0f);
                bu1Var.k(r32Var.a);
                bu1Var.f(r32Var.b);
                bu1Var.e(r32Var.c);
                bu1Var.m(r32Var.d);
                return ll2Var;
            case 21:
                bu1 bu1Var2 = (bu1) obj;
                x42 x42Var = (x42) obj2;
                bu1Var2.h(x42Var.s);
                bu1Var2.i(x42Var.t);
                bu1Var2.c(x42Var.u);
                bu1Var2.j(x42Var.v);
                float f8 = x42Var.w;
                if (bu1Var2.l != f8) {
                    bu1Var2.e |= 1024;
                    bu1Var2.l = f8;
                }
                float f9 = x42Var.x;
                if (bu1Var2.m != f9) {
                    bu1Var2.e |= 2048;
                    bu1Var2.m = f9;
                }
                bu1Var2.n(x42Var.y);
                bu1Var2.k(x42Var.z);
                bu1Var2.f(x42Var.A);
                bu1Var2.e(x42Var.B);
                bu1Var2.m(x42Var.C);
                int i7 = x42Var.D;
                if (bu1Var2.t != i7) {
                    bu1Var2.e |= 524288;
                    bu1Var2.t = i7;
                }
                return ll2Var;
            default:
                Throwable th = (Throwable) obj;
                bb2 bb2Var = (bb2) obj2;
                om omVar = bb2Var.g;
                if (omVar != null) {
                    omVar.o(th);
                }
                bb2Var.g = null;
                return ll2Var;
        }
    }
}

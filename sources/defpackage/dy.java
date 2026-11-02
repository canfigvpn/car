package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ dy(ArrayList arrayList, es1 es1Var, List list, int i, gy0 gy0Var) {
        this.e = 1;
        this.f = arrayList;
        this.g = es1Var;
        this.h = list;
        this.i = gy0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006b  */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                f11 f11Var = (f11) obj5;
                ye2 ye2Var = (ye2) obj4;
                te2 te2Var = (te2) obj3;
                oo0 oo0Var = (oo0) obj2;
                if (f11Var.b()) {
                    dq0 dq0Var = f11Var.d;
                    ey eyVar = f11Var.v;
                    ey eyVar2 = f11Var.w;
                    gs1 gs1Var = new gs1();
                    o1 o1Var = new o1(dq0Var, eyVar, gs1Var, 13);
                    kn1 kn1Var = ye2Var.a;
                    kn1Var.h(te2Var, oo0Var, o1Var, eyVar2);
                    cf2 cf2Var = new cf2(ye2Var, kn1Var);
                    ye2Var.b.set(cf2Var);
                    gs1Var.e = cf2Var;
                    f11Var.e = cf2Var;
                }
                return new n8(1);
            case 1:
                List list = (List) obj5;
                es1 es1Var = (es1) obj4;
                List list2 = (List) obj3;
                gy0 gy0Var = (gy0) obj2;
                jp1 jp1Var = (jp1) obj;
                y92 y92Var = jp1Var.e;
                int iB = y92Var != null ? y92Var.b() : 0;
                int iD = 0;
                for (int i2 = 0; i2 < iB; i2++) {
                    di1 di1Var = gy0Var.q;
                    y92 y92Var2 = jp1Var.e;
                    iD += (int) (di1Var == di1.e ? 4294967295L & (y92Var2 != null ? y92Var2.d(i2) : 0L) : (y92Var2 != null ? y92Var2.d(i2) : 0L) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(iD));
                }
                if (es1Var.e != list2.size()) {
                    es1Var.e++;
                }
                return ll2Var;
            case 2:
                tz0 tz0Var = (tz0) obj5;
                tz0Var.c = new ew0((iz0) obj4, (aa2) obj3, (kp1) obj2);
                return new r2(10, tz0Var);
            case 3:
                ds1 ds1Var = (ds1) obj5;
                x40 x40Var = (x40) obj4;
                sy1 sy1Var = (sy1) obj3;
                q2 q2Var = (q2) obj2;
                mb mbVar = (mb) obj;
                float fFloatValue = ((Number) mbVar.e.getValue()).floatValue() - ds1Var.e;
                if (ex.A(fFloatValue)) {
                    if (((Boolean) q2Var.h(Float.valueOf(ds1Var.e))).booleanValue()) {
                        mbVar.a();
                    }
                } else if (ex.A(fFloatValue - x40Var.a(sy1Var, fFloatValue))) {
                    ds1Var.e += fFloatValue;
                    if (((Boolean) q2Var.h(Float.valueOf(ds1Var.e))).booleanValue()) {
                        mbVar.a();
                    }
                } else {
                    mbVar.a();
                }
                return ll2Var;
            default:
                kb1 kb1Var = (kb1) obj;
                kb1Var.getClass();
                ((cs1) obj5).e = true;
                ((rb1) obj4).a((zb1) obj3, (Bundle) obj2, kb1Var, cb0.e);
                return ll2Var;
        }
    }

    public /* synthetic */ dy(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}

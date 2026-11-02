package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x8 extends t71 implements rv, k80, hw0 {
    public boolean A;
    public qu1 C;
    public su1 D;
    public final ur0 s;
    public final boolean t;
    public final float u;
    public final g40 v;
    public final f40 w;
    public jp x;
    public float y;
    public long z = 0;
    public final p91 B = new p91();

    public x8(ur0 ur0Var, boolean z, float f, g40 g40Var, f40 f40Var) {
        this.s = ur0Var;
        this.t = z;
        this.u = f;
        this.v = g40Var;
        this.w = f40Var;
    }

    public final void F0(tp1 tp1Var) {
        su1 su1Var;
        if (!(tp1Var instanceof rp1)) {
            if (tp1Var instanceof sp1) {
                su1 su1Var2 = this.D;
                if (su1Var2 != null) {
                    su1Var2.d();
                    return;
                }
                return;
            }
            if (!(tp1Var instanceof qp1) || (su1Var = this.D) == null) {
                return;
            }
            su1Var.d();
            return;
        }
        rp1 rp1Var = (rp1) tp1Var;
        long j = this.z;
        float f = this.y;
        qu1 qu1Var = this.C;
        int i = 0;
        if (qu1Var == null) {
            Object obj = (View) ir2.j(this, u5.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    fu1.f(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    qu1 qu1Var2 = new qu1(viewGroup.getContext());
                    viewGroup.addView(qu1Var2);
                    qu1Var = qu1Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof qu1) {
                        qu1Var = (qu1) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.C = qu1Var;
        }
        ArrayList arrayList = qu1Var.f;
        ru1 ru1Var = qu1Var.h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ru1Var.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) ru1Var.b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) ru1Var.c;
        su1 su1Var3 = (su1) linkedHashMap.get(this);
        if (su1Var3 == null) {
            ArrayList arrayList2 = qu1Var.g;
            arrayList2.getClass();
            su1Var3 = (su1) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (su1Var3 == null) {
                if (qu1Var.i > vs0.o(arrayList)) {
                    su1Var3 = new su1(qu1Var.getContext());
                    qu1Var.addView(su1Var3);
                    arrayList.add(su1Var3);
                } else {
                    su1Var3 = (su1) arrayList.get(qu1Var.i);
                    x8 x8Var = (x8) linkedHashMap3.get(su1Var3);
                    if (x8Var != null) {
                        x8Var.D = null;
                        vv.B(x8Var);
                        su1 su1Var4 = (su1) linkedHashMap2.get(x8Var);
                        if (su1Var4 != null) {
                        }
                        linkedHashMap2.remove(x8Var);
                        su1Var3.c();
                    }
                }
                int i3 = qu1Var.i;
                if (i3 < qu1Var.e - 1) {
                    qu1Var.i = i3 + 1;
                } else {
                    qu1Var.i = 0;
                }
            }
            linkedHashMap2.put(this, su1Var3);
            linkedHashMap3.put(su1Var3, this);
        }
        int iJ0 = p61.j0(f);
        long jA = this.v.a();
        this.w.a();
        su1 su1Var5 = su1Var3;
        su1Var5.b(rp1Var, this.t, j, iJ0, jA, new w8(i, this));
        this.D = su1Var5;
        vv.B(this);
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        um umVar = cx0Var.e;
        cx0Var.a();
        jp jpVar = this.x;
        if (jpVar != null) {
            float f = this.y;
            long jA = this.v.a();
            float fFloatValue = ((Number) ((ia) jpVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = dr.b(fFloatValue, jA);
                if (jpVar.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (umVar.d() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (umVar.d() & 4294967295L));
                    ud udVar = umVar.f;
                    long jM = udVar.m();
                    udVar.g().l();
                    try {
                        ((ud) ((ao2) udVar.b).f).g().e(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        l80.C(cx0Var, jB, f, 0L, null, 124);
                        k3.s(udVar, jM);
                    } catch (Throwable th) {
                        k3.s(udVar, jM);
                        throw th;
                    }
                } else {
                    l80.C(cx0Var, jB, f, 0L, null, 124);
                }
            }
        }
        sm smVarG = umVar.f.g();
        su1 su1Var = this.D;
        if (su1Var != null) {
            long j = this.z;
            int iJ0 = p61.j0(this.y);
            long jA2 = this.v.a();
            this.w.a();
            su1Var.e(iJ0, j, jA2);
            su1Var.draw(k4.a(smVarG));
        }
    }

    @Override // defpackage.hw0, defpackage.z61
    public final void c(long j) {
        float fX;
        this.A = true;
        m40 m40Var = qx.V(this).B;
        this.z = ux.M(j);
        float f = this.u;
        if (Float.isNaN(f)) {
            long j2 = this.z;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fX = uf1.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.t) {
                fX += m40Var.x(10.0f);
            }
        } else {
            fX = m40Var.x(f);
        }
        this.y = fX;
        p91 p91Var = this.B;
        Object[] objArr = p91Var.a;
        int i = p91Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            F0((tp1) objArr[i2]);
        }
        p91Var.d();
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }

    @Override // defpackage.t71
    public final void x0() {
        nj2.y(t0(), null, new e(29, null, this), 3);
    }

    @Override // defpackage.t71
    public final void y0() {
        qu1 qu1Var = this.C;
        if (qu1Var != null) {
            this.D = null;
            vv.B(this);
            ru1 ru1Var = qu1Var.h;
            su1 su1Var = (su1) ((LinkedHashMap) ru1Var.b).get(this);
            if (su1Var != null) {
                su1Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) ru1Var.b;
                su1 su1Var2 = (su1) linkedHashMap.get(this);
                if (su1Var2 != null) {
                }
                linkedHashMap.remove(this);
                qu1Var.g.add(su1Var);
            }
        }
    }
}

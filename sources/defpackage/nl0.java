package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nl0 extends am2 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = dr.g;
    public List f;
    public boolean g;
    public d8 h;
    public ej0 i;
    public final y3 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public nl0() {
        int i = jm2.a;
        this.f = cb0.e;
        this.g = true;
        this.j = new y3(14, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.am2
    public final void a(l80 l80Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = q61.a();
                this.b = fArrA;
            } else {
                q61.d(fArrA);
            }
            q61.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            q61.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                d8 d8VarA = this.h;
                if (d8VarA == null) {
                    d8VarA = f8.a();
                    this.h = d8VarA;
                }
                ex.R(this.f, d8VarA);
            }
            this.g = false;
        }
        ud udVarB = l80Var.B();
        long jM = udVarB.m();
        udVarB.g().l();
        try {
            ud udVar = (ud) ((ao2) udVarB.b).f;
            float[] fArr = this.b;
            if (fArr != null) {
                udVar.g().q(fArr);
            }
            d8 d8Var = this.h;
            if (!this.f.isEmpty() && d8Var != null) {
                udVar.g().s(d8Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((am2) arrayList.get(i)).a(l80Var);
            }
        } finally {
            k3.s(udVarB, jM);
        }
    }

    @Override // defpackage.am2
    public final ej0 b() {
        return this.i;
    }

    @Override // defpackage.am2
    public final void d(y3 y3Var) {
        this.i = y3Var;
    }

    public final void e(int i, am2 am2Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, am2Var);
        } else {
            arrayList.add(am2Var);
        }
        g(am2Var);
        am2Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = jm2.a;
            if (dr.g(j2) == dr.g(j) && dr.f(j2) == dr.f(j) && dr.d(j2) == dr.d(j)) {
                return;
            }
            this.d = false;
            this.e = dr.g;
        }
    }

    public final void g(am2 am2Var) {
        if (!(am2Var instanceof rk1)) {
            if (am2Var instanceof nl0) {
                nl0 nl0Var = (nl0) am2Var;
                if (nl0Var.d && this.d) {
                    f(nl0Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = dr.g;
                    return;
                }
            }
            return;
        }
        rk1 rk1Var = (rk1) am2Var;
        rk rkVar = rk1Var.b;
        if (this.d && rkVar != null) {
            if (rkVar instanceof o72) {
                f(((o72) rkVar).a);
            } else {
                this.d = false;
                this.e = dr.g;
            }
        }
        rk rkVar2 = rk1Var.g;
        if (this.d && rkVar2 != null) {
            if (rkVar2 instanceof o72) {
                f(((o72) rkVar2).a);
            } else {
                this.d = false;
                this.e = dr.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            am2 am2Var = (am2) arrayList.get(i);
            sb.append("\t");
            sb.append(am2Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class co {
    public final float a;
    public final float b;

    public co(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final p82 a(boolean z, f91 f91Var, ak0 ak0Var, int i) {
        Object obj;
        ia iaVar;
        Object obj2;
        ak0Var.W(-1763481333);
        float f = 0.0f;
        Object obj3 = cv.a;
        if (f91Var == null) {
            ak0Var.W(167751211);
            Object objL = ak0Var.L();
            if (objL == obj3) {
                obj2 = objL;
                Object objS = y12.s(new w60(0.0f));
                ak0Var.g0(objS);
                obj2 = objS;
            }
            obj2 = objL;
            da1 da1Var = (da1) obj2;
            ak0Var.p(false);
            ak0Var.p(false);
            return da1Var;
        }
        ak0Var.W(167824247);
        ak0Var.p(false);
        Object objL2 = ak0Var.L();
        if (objL2 == obj3) {
            obj = objL2;
            Object h72Var = new h72();
            ak0Var.g0(h72Var);
            obj = h72Var;
        }
        obj = objL2;
        h72 h72Var2 = (h72) obj;
        int i2 = 1;
        boolean z2 = (((i & 112) ^ 48) > 32 && ak0Var.f(f91Var)) || (i & 48) == 32;
        Object objL3 = ak0Var.L();
        sx sxVar = null;
        Object obj4 = objL3;
        if (z2 || objL3 == obj3) {
            Object jlVar = new jl(f91Var, h72Var2, sxVar, i2);
            ak0Var.g0(jlVar);
            obj4 = jlVar;
        }
        s5.o((ij0) obj4, ak0Var, f91Var);
        tr0 tr0Var = (tr0) vq.X(h72Var2);
        if (z && !(tr0Var instanceof rp1)) {
            if (tr0Var instanceof wn0) {
                f = this.a;
            } else if (!(tr0Var instanceof nf0) && (tr0Var instanceof b80)) {
                f = this.b;
            }
        }
        Object objL4 = ak0Var.L();
        Object obj5 = objL4;
        if (objL4 == obj3) {
            Object iaVar2 = new ia(new w60(f), ir2.X, null, 12);
            ak0Var.g0(iaVar2);
            obj5 = iaVar2;
        }
        ia iaVar3 = (ia) obj5;
        w60 w60Var = new w60(f);
        int i3 = (ak0Var.h(iaVar3) ? 1 : 0) | (ak0Var.c(f) ? 1 : 0) | (((((i & 14) ^ 6) <= 4 || !ak0Var.g(z)) && (i & 6) != 4) ? 0 : 1);
        if ((((i & 896) ^ 384) <= 256 || !ak0Var.f(this)) && (i & 384) != 256) {
            i2 = 0;
        }
        int i4 = i3 | i2 | (ak0Var.h(tr0Var) ? 1 : 0);
        Object objL5 = ak0Var.L();
        if (i4 != 0 || objL5 == obj3) {
            iaVar = iaVar3;
            Object klVar = new kl(iaVar, f, z, this, tr0Var, null, 1);
            ak0Var.g0(klVar);
            objL5 = klVar;
        } else {
            iaVar = iaVar3;
        }
        s5.o((ij0) objL5, ak0Var, w60Var);
        ob obVar = iaVar.c;
        ak0Var.p(false);
        return obVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof co)) {
            return false;
        }
        return w60.b(0.0f, 0.0f) && w60.b(0.0f, 0.0f) && w60.b(0.0f, 0.0f) && w60.b(this.a, ((co) obj).a) && w60.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + k3.a(this.a, k3.a(0.0f, k3.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}

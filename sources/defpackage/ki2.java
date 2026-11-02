package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ki2 {
    public final tu a;
    public final ki2 b;
    public final String c;
    public final dk1 d;
    public final dk1 e;
    public final bk1 f = new bk1(0);
    public final bk1 g = new bk1(Long.MIN_VALUE);
    public final dk1 h;
    public final h72 i;
    public final h72 j;
    public final dk1 k;
    public final v40 l;

    public ki2(tu tuVar, ki2 ki2Var, String str) {
        this.a = tuVar;
        this.b = ki2Var;
        this.c = str;
        this.d = y12.s(tuVar.f());
        this.e = y12.s(new hi2(tuVar.f(), tuVar.f()));
        Boolean bool = Boolean.FALSE;
        this.h = y12.s(bool);
        this.i = new h72();
        this.j = new h72();
        this.k = y12.s(bool);
        this.l = e72.b(new di2(this, 1));
        tuVar.l(this);
    }

    public final void a(Object obj, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ak0Var.f(obj) : ak0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(this) ? 32 : 16;
        }
        int i3 = 0;
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            if (g()) {
                ak0Var.W(416369985);
            } else {
                ak0Var.W(466062241);
                p(obj);
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object objL = ak0Var.L();
                is1 is1Var = cv.a;
                if (z || objL == is1Var) {
                    objL = e72.b(new di2(this, i3));
                    ak0Var.g0(objL);
                }
                if (((Boolean) ((p82) objL).getValue()).booleanValue()) {
                    ak0Var.W(466470356);
                    Object objL2 = ak0Var.L();
                    if (objL2 == is1Var) {
                        objL2 = s5.E(ak0Var);
                        ak0Var.g0(objL2);
                    }
                    ez ezVar = (ez) objL2;
                    boolean zH = ak0Var.h(ezVar) | (i4 == 32);
                    Object objL3 = ak0Var.L();
                    if (zH || objL3 == is1Var) {
                        objL3 = new kc1(19, ezVar, this);
                        ak0Var.g0(objL3);
                    }
                    s5.f(ezVar, this, (ej0) objL3, ak0Var);
                } else {
                    ak0Var.W(416369985);
                }
                ak0Var.p(false);
            }
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(this, obj, i, 10);
        }
    }

    public final long b() {
        h72 h72Var = this.i;
        int size = h72Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((ii2) h72Var.get(i)).p.h());
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((ki2) h72Var2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        h72 h72Var = this.i;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ii2 ii2Var = (ii2) h72Var.get(i);
            ii2Var.j = null;
            ii2Var.i = null;
            ii2Var.m = false;
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ki2) h72Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        h72 h72Var = this.i;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            if (((ii2) h72Var.get(i)).i != null) {
                return true;
            }
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((ki2) h72Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        ki2 ki2Var = this.b;
        return ki2Var != null ? ki2Var.e() : this.f.h();
    }

    public final gi2 f() {
        return (gi2) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        bk1 bk1Var = this.g;
        long jH = bk1Var.h();
        tu tuVar = this.a;
        if (jH == Long.MIN_VALUE) {
            bk1Var.i(j);
            ((dk1) tuVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((dk1) tuVar.a).getValue()).booleanValue()) {
            ((dk1) tuVar.a).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        h72 h72Var = this.i;
        int size = h72Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ii2 ii2Var = (ii2) h72Var.get(i);
            dk1 dk1Var = ii2Var.k;
            dk1 dk1Var2 = ii2Var.k;
            if (!((Boolean) dk1Var.getValue()).booleanValue()) {
                long jC = z ? ii2Var.a().c() : j;
                ii2Var.d(ii2Var.a().b(jC));
                ii2Var.o = ii2Var.a().f(jC);
                if (ii2Var.a().g(jC)) {
                    dk1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) dk1Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ki2 ki2Var = (ki2) h72Var2.get(i2);
            dk1 dk1Var3 = ki2Var.d;
            tu tuVar2 = ki2Var.a;
            if (!ws0.j(dk1Var3.getValue(), tuVar2.f())) {
                ki2Var.h(j, z);
            }
            if (!ws0.j(ki2Var.d.getValue(), tuVar2.f())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.i(Long.MIN_VALUE);
        tu tuVar = this.a;
        if (tuVar instanceof ea1) {
            ((ea1) tuVar).k(this.d.getValue());
        }
        n(0L);
        ((dk1) tuVar.a).setValue(Boolean.FALSE);
        h72 h72Var = this.j;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ((ki2) h72Var.get(i)).i();
        }
    }

    public final void j(float f) {
        h72 h72Var = this.i;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ii2 ii2Var = (ii2) h72Var.get(i);
            ii2Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                cc2 cc2Var = ii2Var.j;
                if (cc2Var != null) {
                    ii2Var.a().h(cc2Var.c);
                    ii2Var.i = null;
                    ii2Var.j = null;
                }
                Object obj = f == -4.0f ? ii2Var.a().d : ii2Var.a().c;
                ii2Var.a().h(obj);
                ii2Var.a().i(obj);
                ii2Var.d(obj);
                ii2Var.p.i(ii2Var.a().c());
            } else {
                ii2Var.l.i(f);
            }
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ki2) h72Var2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        tu tuVar = this.a;
        ((dk1) tuVar.a).setValue(Boolean.FALSE);
        boolean zG = g();
        dk1 dk1Var = this.d;
        if (!zG || !ws0.j(tuVar.f(), obj) || !ws0.j(dk1Var.getValue(), obj2)) {
            if (!ws0.j(tuVar.f(), obj) && (tuVar instanceof ea1)) {
                ((ea1) tuVar).k(obj);
            }
            dk1Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new hi2(obj, obj2));
        }
        h72 h72Var = this.j;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ki2 ki2Var = (ki2) h72Var.get(i);
            ki2Var.getClass();
            if (ki2Var.g()) {
                ki2Var.k(ki2Var.a.f(), ki2Var.d.getValue());
            }
        }
        h72 h72Var2 = this.i;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ii2) h72Var2.get(i2)).b(0L);
        }
    }

    public final void l(long j) {
        bk1 bk1Var = this.g;
        if (bk1Var.h() == Long.MIN_VALUE) {
            bk1Var.i(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        h72 h72Var = this.i;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ((ii2) h72Var.get(i)).b(j);
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ki2 ki2Var = (ki2) h72Var2.get(i2);
            if (!ws0.j(ki2Var.d.getValue(), ki2Var.a.f())) {
                ki2Var.l(j);
            }
        }
    }

    public final void m(yy1 yy1Var) {
        h72 h72Var = this.i;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ii2 ii2Var = (ii2) h72Var.get(i);
            dk1 dk1Var = ii2Var.n;
            if (!ws0.j(ii2Var.a().c, ii2Var.a().d)) {
                ii2Var.j = ii2Var.a();
                ii2Var.i = yy1Var;
            }
            ii2Var.h.setValue(new cc2(ii2Var.r, ii2Var.e, dk1Var.getValue(), dk1Var.getValue(), ii2Var.o.c()));
            ii2Var.p.i(ii2Var.a().c());
            ii2Var.m = true;
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ki2) h72Var2.get(i2)).m(yy1Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.i(j);
        }
    }

    public final void o() {
        cc2 cc2Var;
        h72 h72Var = this.i;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ii2 ii2Var = (ii2) h72Var.get(i);
            yy1 yy1Var = ii2Var.i;
            if (yy1Var != null && (cc2Var = ii2Var.j) != null) {
                long jK0 = p61.k0(yy1Var.g * ((double) yy1Var.d));
                Object objB = cc2Var.b(jK0);
                if (ii2Var.m) {
                    ii2Var.a().i(objB);
                }
                ii2Var.a().h(objB);
                ii2Var.p.i(ii2Var.a().c());
                if (ii2Var.l.h() == -2.0f || ii2Var.m) {
                    ii2Var.d(objB);
                } else {
                    ii2Var.b(ii2Var.s.e());
                }
                if (jK0 >= yy1Var.g) {
                    ii2Var.i = null;
                    ii2Var.j = null;
                } else {
                    yy1Var.c = false;
                }
            }
        }
        h72 h72Var2 = this.j;
        int size2 = h72Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ki2) h72Var2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        dk1 dk1Var = this.d;
        if (ws0.j(dk1Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new hi2(dk1Var.getValue(), obj));
        tu tuVar = this.a;
        if (!ws0.j(tuVar.f(), dk1Var.getValue())) {
            tuVar.k(dk1Var.getValue());
        }
        dk1Var.setValue(obj);
        if (this.g.h() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        h72 h72Var = this.i;
        int size = h72Var.size();
        for (int i = 0; i < size; i++) {
            ((ii2) h72Var.get(i)).l.i(-2.0f);
        }
    }

    public final String toString() {
        h72 h72Var = this.i;
        int size = h72Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((ii2) h72Var.get(i)) + ", ";
        }
        return str;
    }
}

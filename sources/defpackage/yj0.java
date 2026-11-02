package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yj0 extends lv {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final x91 e;
    public final dk1 f;
    public final /* synthetic */ ak0 g;

    public yj0(ak0 ak0Var, long j, boolean z, boolean z2, ao2 ao2Var) {
        this.g = ak0Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        x91 x91Var = kx1.a;
        this.e = new x91();
        this.f = new dk1(sl1.h, is1.f);
    }

    @Override // defpackage.lv
    public final void a(qv qvVar, ij0 ij0Var) {
        this.g.b.a(qvVar, ij0Var);
    }

    @Override // defpackage.lv
    public final x91 b(qv qvVar, v42 v42Var, ij0 ij0Var) {
        return this.g.b.b(qvVar, v42Var, ij0Var);
    }

    @Override // defpackage.lv
    public final void c() {
        this.g.A--;
    }

    @Override // defpackage.lv
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.lv
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.lv
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.lv
    public final long g() {
        return this.a;
    }

    @Override // defpackage.lv
    public final kv h() {
        return this.g.h;
    }

    @Override // defpackage.lv
    public final sl1 i() {
        return (sl1) this.f.getValue();
    }

    @Override // defpackage.lv
    public final uy j() {
        return this.g.b.j();
    }

    @Override // defpackage.lv
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.lv
    public final void l(qv qvVar) {
        ak0 ak0Var = this.g;
        lv lvVar = ak0Var.b;
        lvVar.l(ak0Var.h);
        lvVar.l(qvVar);
    }

    @Override // defpackage.lv
    public final o81 m(p81 p81Var) {
        return this.g.b.m(p81Var);
    }

    @Override // defpackage.lv
    public final x91 n(qv qvVar, v42 v42Var, x91 x91Var) {
        return this.g.b.n(qvVar, v42Var, x91Var);
    }

    @Override // defpackage.lv
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.lv
    public final void p(ak0 ak0Var) {
        this.e.a(ak0Var);
    }

    @Override // defpackage.lv
    public final void q(lr1 lr1Var) {
        this.g.b.q(lr1Var);
    }

    @Override // defpackage.lv
    public final void r(qv qvVar) {
        this.g.b.r(qvVar);
    }

    @Override // defpackage.lv
    public final pm s(h8 h8Var) {
        return this.g.b.s(h8Var);
    }

    @Override // defpackage.lv
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.lv
    public final void u(ak0 ak0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                ak0Var.getClass();
                set.remove(ak0Var.w());
            }
        }
        if (ak0Var != null) {
            this.e.l(ak0Var);
        }
    }

    @Override // defpackage.lv
    public final void v(qv qvVar) {
        this.g.b.v(qvVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void w() {
        x91 x91Var = this.e;
        if (x91Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = x91Var.b;
                long[] jArr = x91Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ak0 ak0Var = (ak0) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(ak0Var.w());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            x91Var.b();
        }
    }
}

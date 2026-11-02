package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class me2 {
    public boolean A;
    public final jl2 a;
    public f11 d;
    public ti0 f;
    public mq g;
    public ez h;
    public bn1 i;
    public yl0 j;
    public xf0 k;
    public final dk1 l;
    public final dk1 m;
    public long n;
    public of2 o;
    public long p;
    public final dk1 q;
    public final dk1 r;
    public int s;
    public te2 t;
    public a52 u;
    public of2 v;
    public final dk1 w;
    public final ru1 x;
    public final ke2 y;
    public final a52 z;
    public xf1 b = bm2.a;
    public ej0 c = new v22(14);
    public final dk1 e = y12.s(new te2((String) null, 0, 7));

    public me2(jl2 jl2Var) {
        this.a = jl2Var;
        Boolean bool = Boolean.TRUE;
        this.l = y12.s(bool);
        this.m = y12.s(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = y12.s(null);
        this.r = y12.s(null);
        this.s = -1;
        this.t = new te2((String) null, 0L, 7);
        this.w = y12.s(Boolean.FALSE);
        ru1 ru1Var = new ru1(7);
        ru1Var.c = eh2.e;
        this.x = ru1Var;
        this.y = new ke2(this);
        this.z = new a52(this);
    }

    public static te2 b(yb ybVar, long j) {
        return new te2(ybVar, j, (of2) null);
    }

    public final j82 a(boolean z) {
        ez ezVar = this.h;
        if (ezVar != null) {
            return nj2.y(ezVar, null, new he2(this, z, null), 1);
        }
        return null;
    }

    public final void c() {
        ez ezVar = this.h;
        if (ezVar != null) {
            nj2.y(ezVar, null, new ee2(this, null, 1), 1);
        }
    }

    public final void d(uf1 uf1Var) {
        if (!of2.c(l().b)) {
            f11 f11Var = this.d;
            if2 if2VarD = f11Var != null ? f11Var.d() : null;
            int iE = (uf1Var == null || if2VarD == null) ? of2.e(l().b) : this.b.n(if2VarD.b(uf1Var.a, true));
            te2 te2VarA = te2.a(l(), null, j02.c(iE, iE), 5);
            this.c.h(te2VarA);
            this.v = new of2(te2VarA.b);
        }
        r((uf1Var == null || l().a.f.length() <= 0) ? sl0.e : sl0.g);
        u(false);
    }

    public final void e(boolean z) {
        xf0 xf0Var;
        f11 f11Var = this.d;
        if (f11Var != null && !f11Var.b() && (xf0Var = this.k) != null) {
            xf0.a(xf0Var);
        }
        this.t = l();
        u(z);
        r(sl0.f);
    }

    public final qj1 f() {
        String str;
        of2 of2Var;
        yb ybVarK = k();
        if (ybVarK == null || (str = ybVarK.f) == null || (of2Var = this.v) == null) {
            return null;
        }
        long j = of2Var.a;
        return new qj1(str, new of2(j02.c(this.b.r((int) (j >> 32)), this.b.r((int) (j & 4294967295L)))));
    }

    public final uf1 g() {
        return (uf1) this.r.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        if2 if2VarD;
        long j;
        f11 f11Var = this.d;
        if (f11Var == null || (if2VarD = f11Var.d()) == null) {
            return 9205357640488583168L;
        }
        hf2 hf2Var = if2VarD.a;
        t81 t81Var = hf2Var.b;
        yb ybVarK = k();
        if (ybVarK == null) {
            return 9205357640488583168L;
        }
        if (!ws0.j(ybVarK.f, hf2Var.a.a.f)) {
            return 9205357640488583168L;
        }
        te2 te2VarL = l();
        if (z) {
            long j2 = te2VarL.b;
            int i = of2.c;
            j = j2 >> 32;
        } else {
            long j3 = te2VarL.b;
            int i2 = of2.c;
            j = j3 & 4294967295L;
        }
        int iR = this.b.r((int) j);
        boolean zG = of2.g(l().b);
        long j4 = hf2Var.c;
        int iD = t81Var.d(iR);
        if (iD >= t81Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = hf2Var.a(((!z || zG) && (z || !zG)) ? Math.max(iR + (-1), 0) : iR) == hf2Var.g(iR);
        t81Var.k(iR);
        int length = ((yb) t81Var.a.e).f.length();
        ArrayList arrayList = t81Var.h;
        sj1 sj1Var = (sj1) arrayList.get(iR == length ? arrayList.size() - 1 : ix.u(iR, arrayList));
        y7 y7Var = sj1Var.a;
        int iD2 = sj1Var.d(iR);
        ff2 ff2Var = y7Var.d;
        return (((long) Float.floatToRawIntBits(ex.g(t81Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(ex.g(z2 ? ff2Var.h(iD2, false) : ff2Var.i(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final yb k() {
        f11 f11Var = this.d;
        if (f11Var != null) {
            return f11Var.a.a;
        }
        return null;
    }

    public final te2 l() {
        return (te2) this.e.getValue();
    }

    public final void m() {
        j82 j82Var;
        dd2 dd2Var = (dd2) this.x.b;
        if (dd2Var == null || (j82Var = dd2Var.y) == null) {
            return;
        }
        j82Var.d(null);
        dd2Var.y = null;
    }

    public final void n(of2 of2Var) {
        yb ybVarK;
        String str;
        ez ezVar;
        if (of2Var == null) {
            return;
        }
        long j = of2Var.a;
        bn1 bn1Var = this.i;
        if (bn1Var == null || (ybVarK = k()) == null || (str = ybVarK.f) == null) {
            return;
        }
        xf1 xf1Var = this.b;
        long jC = j02.c(xf1Var.r((int) (j >> 32)), xf1Var.r((int) (j & 4294967295L)));
        if (str.length() <= 0 || of2.c(jC) || (ezVar = this.h) == null) {
            return;
        }
        nj2.y(ezVar, null, new ax(bn1Var, str, jC, of2Var, this, xf1Var, null), 3);
    }

    public final void o() {
        ez ezVar = this.h;
        if (ezVar != null) {
            nj2.y(ezVar, null, new ee2(this, null, 2), 1);
        }
    }

    public final void p(uf1 uf1Var) {
        this.r.setValue(uf1Var);
    }

    public final void q(ql0 ql0Var) {
        this.q.setValue(ql0Var);
    }

    public final void r(sl0 sl0Var) {
        f11 f11Var = this.d;
        if (f11Var != null) {
            if (f11Var.a() == sl0Var) {
                f11Var = null;
            }
            if (f11Var != null) {
                f11Var.k.setValue(sl0Var);
            }
        }
    }

    public final void s() {
        f11 f11Var;
        wc2 wc2Var;
        o62 o62VarJ = c12.j();
        sx sxVar = null;
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            if (!i() || ((f11Var = this.d) != null && !((Boolean) f11Var.q.getValue()).booleanValue())) {
                c12.s(o62VarJ, o62VarP, ej0VarE);
                return;
            }
            c12.s(o62VarJ, o62VarP, ej0VarE);
            ru1 ru1Var = this.x;
            if (((eh2) ru1Var.c) == eh2.e) {
                yp0.c("ToolbarRequester is not initialized.");
            }
            dd2 dd2Var = (dd2) ru1Var.b;
            if (dd2Var == null || !dd2Var.r) {
                return;
            }
            j82 j82Var = dd2Var.y;
            if ((j82Var == null || !j82Var.b()) && (wc2Var = (wc2) ir2.j(dd2Var, yc2.b)) != null) {
                dd2Var.y = nj2.y(dd2Var.t0(), null, new g(25, sxVar, dd2Var, wc2Var), 1);
            }
        } catch (Throwable th) {
            c12.s(o62VarJ, o62VarP, ej0VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(tx txVar) {
        le2 le2Var;
        if (txVar instanceof le2) {
            le2Var = (le2) txVar;
            int i = le2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                le2Var.k = i - Integer.MIN_VALUE;
            } else {
                le2Var = new le2(this, txVar);
            }
        } else {
            le2Var = new le2(this, txVar);
        }
        Object objValueOf = le2Var.i;
        int i2 = le2Var.k;
        if (i2 == 0) {
            ix.Q(objValueOf);
            mq mqVar = this.g;
            if (mqVar != null) {
                le2Var.h = this;
                le2Var.k = 1;
                ClipDescription primaryClipDescription = ((l4) mqVar).a.a().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = fz.e;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return ll2.a;
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = le2Var.h;
        ix.Q(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.w.setValue(bool);
        return ll2.a;
    }

    public final void u(boolean z) {
        f11 f11Var = this.d;
        if (f11Var != null) {
            f11Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    public final long v(te2 te2Var, long j, boolean z, boolean z2, fu1 fu1Var, boolean z3) {
        if2 if2VarD;
        long j2;
        vz1 vz1Var;
        vz1 vz1Var2;
        boolean z4;
        yl0 yl0Var;
        uz1 uz1VarS;
        uz1 uz1Var;
        uz1 uz1Var2;
        vz1 vz1Var3;
        f11 f11Var = this.d;
        if (f11Var == null || (if2VarD = f11Var.d()) == null) {
            return of2.b;
        }
        xf1 xf1Var = this.b;
        long j3 = te2Var.b;
        yb ybVar = te2Var.a;
        int i = of2.c;
        long jC = j02.c(xf1Var.r((int) (j3 >> 32)), this.b.r((int) (j3 & 4294967295L)));
        int iB = if2VarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jC >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jC & 4294967295L);
        a52 a52Var = this.u;
        int i4 = -1;
        if (z || a52Var == null) {
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i5 = this.s;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        hf2 hf2Var = if2VarD.a;
        if (z) {
            vz1Var = null;
        } else {
            int i6 = (int) (jC >> 32);
            int i7 = (int) (jC & j2);
            vz1Var = new vz1(new uz1(qx.E(hf2Var, i6), i6, 1L), new uz1(qx.E(hf2Var, i7), i7, 1L), of2.g(jC));
        }
        a52 a52Var2 = new a52(z2, vz1Var, new vp(i2, i3, i4, hf2Var));
        if (vz1Var != null && a52Var != null && z2 == a52Var.b) {
            vp vpVar = (vp) a52Var.d;
            if (i2 == vpVar.b && i3 == vpVar.c) {
                return j3;
            }
        }
        this.u = a52Var2;
        this.s = iB;
        int i8 = fu1Var.e;
        nz nzVar = nz.e;
        Object obj = a52Var2.d;
        switch (i8) {
            case 4:
                vp vpVar2 = (vp) obj;
                vz1Var2 = new vz1(vpVar2.b(vpVar2.b), vpVar2.b(vpVar2.c), a52Var2.a() == nzVar);
                break;
            case 5:
                vz1Var2 = ix.j(a52Var2, is1.i);
                break;
            case 6:
                vz1Var2 = ix.j(a52Var2, is1.h);
                break;
            default:
                vz1Var2 = (vz1) a52Var2.c;
                vp vpVar3 = (vp) obj;
                if (vz1Var2 != null) {
                    uz1 uz1Var3 = vz1Var2.b;
                    uz1 uz1Var4 = vz1Var2.a;
                    if (a52Var2.b) {
                        uz1VarS = ix.S(a52Var2, vpVar3, uz1Var4);
                        uz1Var2 = uz1Var3;
                        uz1Var3 = uz1Var4;
                        uz1Var = uz1VarS;
                    } else {
                        uz1VarS = ix.S(a52Var2, vpVar3, uz1Var3);
                        uz1Var = uz1Var4;
                        uz1Var2 = uz1VarS;
                    }
                    if (!ws0.j(uz1VarS, uz1Var3)) {
                        vz1 vz1Var4 = new vz1(uz1Var, uz1Var2, a52Var2.a() == nzVar || (a52Var2.a() == nz.g && uz1Var.b > uz1Var2.b));
                        vp vpVar4 = (vp) obj;
                        uz1 uz1Var5 = vz1Var4.a;
                        long j4 = uz1Var5.c;
                        uz1 uz1Var6 = vz1Var4.b;
                        if (j4 != uz1Var6.c) {
                            boolean z5 = vz1Var4.c;
                            if ((z5 ? uz1Var5 : uz1Var6).b == 0) {
                                if (((hf2) vpVar4.e).a.a.f.length() == (z5 ? uz1Var6 : uz1Var5).b) {
                                    vz1Var3 = (vz1) a52Var2.c;
                                    String str = ((hf2) vpVar4.e).a.a.f;
                                    if (vz1Var3 == null) {
                                    }
                                }
                            }
                        } else if (uz1Var5.b == uz1Var6.b) {
                            vz1Var3 = (vz1) a52Var2.c;
                            String str2 = ((hf2) vpVar4.e).a.a.f;
                            if (vz1Var3 == null && str2.length() != 0) {
                                boolean z6 = a52Var2.b;
                                String str3 = ((hf2) vpVar4.e).a.a.f;
                                int i9 = vpVar4.b;
                                int length = str3.length();
                                if (i9 == 0) {
                                    int iC = c22.c(str3, 0);
                                    vz1Var2 = !z6 ? vz1.a(vz1Var4, null, ix.n(uz1Var6, vpVar4, iC), false, 1) : vz1.a(vz1Var4, ix.n(uz1Var5, vpVar4, iC), null, true, 2);
                                } else if (i9 != length) {
                                    boolean z7 = vz1Var3.c;
                                    int iD = z6 ^ z7 ? c22.d(str3, i9) : c22.c(str3, i9);
                                    vz1Var2 = !z6 ? vz1.a(vz1Var4, null, ix.n(uz1Var6, vpVar4, iD), z7, 1) : vz1.a(vz1Var4, ix.n(uz1Var5, vpVar4, iD), null, z7, 2);
                                } else {
                                    int iD2 = c22.d(str3, length);
                                    vz1Var2 = !z6 ? vz1.a(vz1Var4, null, ix.n(uz1Var6, vpVar4, iD2), true, 1) : vz1.a(vz1Var4, ix.n(uz1Var5, vpVar4, iD2), null, false, 2);
                                }
                                break;
                            }
                        }
                        vz1Var2 = vz1Var4;
                    }
                } else {
                    vz1Var2 = ix.j(a52Var2, is1.i);
                }
                break;
        }
        long jC2 = j02.c(this.b.n(vz1Var2.a.b), this.b.n(vz1Var2.b.b));
        if (of2.b(jC2, j3)) {
            return j3;
        }
        boolean z8 = of2.g(jC2) != of2.g(j3) && of2.b(j02.c((int) (jC2 & j2), (int) (jC2 >> 32)), j3);
        boolean z9 = of2.c(jC2) && of2.c(j3);
        if (z3 && ybVar.f.length() > 0 && !z8 && !z9 && (yl0Var = this.j) != null) {
            ((om1) yl0Var).a();
        }
        this.c.h(b(ybVar, jC2));
        this.v = new of2(jC2);
        if (!z3) {
            u(!of2.c(jC2));
        }
        f11 f11Var2 = this.d;
        if (f11Var2 != null) {
            f11Var2.q.setValue(Boolean.valueOf(z3));
        }
        f11 f11Var3 = this.d;
        if (f11Var3 != null) {
            f11Var3.m.setValue(Boolean.valueOf(!of2.c(jC2) && v12.n(this, true)));
        }
        f11 f11Var4 = this.d;
        if (f11Var4 != null) {
            z4 = false;
            f11Var4.n.setValue(Boolean.valueOf(!of2.c(jC2) && v12.n(this, false)));
        } else {
            z4 = false;
        }
        f11 f11Var5 = this.d;
        if (f11Var5 != null) {
            if (of2.c(jC2) && v12.n(this, true)) {
                z4 = true;
            }
            f11Var5.o.setValue(Boolean.valueOf(z4));
        }
        return jC2;
    }
}

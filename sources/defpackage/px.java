package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class px {
    public static final lx a;

    static {
        a90 a90Var = s8.a;
        long j = dr.c;
        long j2 = dr.b;
        a = new lx(j, j2, j2, dr.b(0.38f, j2), dr.b(0.38f, j2));
    }

    public static final void a(lx lxVar, u71 u71Var, gt gtVar, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-527864079);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(lxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(gtVar) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            vi viVar = ox.a;
            jv1 jv1VarA = kv1.a(4.0f);
            boolean z = w60.a(3.0f, 0.0f) > 0;
            long j = el0.a;
            u71 u71VarJ = nj2.J(p61.e0(dv1.S(p61.s((w60.a(3.0f, 0.0f) > 0 || z) ? u71Var.c(new r32(jv1VarA, z, j, j)) : u71Var, lxVar.a, vs0.C), qs0.f), 0.0f, ox.d, 1), nj2.E(ak0Var));
            int i3 = (i2 << 3) & 7168;
            wr wrVarA = ur.a(ws0.g, q90.r, ak0Var, 0);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarJ);
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
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            gtVar.d(xr.a, ak0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(lxVar, u71Var, gtVar, i, 5);
        }
    }

    public static final void b(u71 u71Var, lx lxVar, ej0 ej0Var, ak0 ak0Var, int i, int i2) {
        int i3;
        int i4;
        ak0Var.X(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (ak0Var.f(lxVar) ? 32 : 16);
        }
        int i7 = i4 | (ak0Var.h(ej0Var) ? 256 : 128);
        if (ak0Var.O(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                u71Var = r71.a;
            }
            if (i6 != 0) {
                lxVar = a;
            }
            a(lxVar, u71Var, vs0.C(-250345048, new in(3, ej0Var, lxVar), ak0Var), ak0Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            ak0Var.R();
        }
        u71 u71Var2 = u71Var;
        lx lxVar2 = lxVar;
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(u71Var2, lxVar2, ej0Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, lx lxVar, u71 u71Var, jj0 jj0Var, ti0 ti0Var, ak0 ak0Var, int i) {
        int i2;
        ak0 ak0Var2 = ak0Var;
        ak0Var2.X(-2001167027);
        if ((i & 6) == 0) {
            i2 = (ak0Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var2.f(lxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var2.f(u71Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var2.h(jj0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ak0Var2.h(ti0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (ak0Var2.O(i3 & 1, (74899 & i3) != 74898)) {
            vi viVar = ox.a;
            float f = ox.c;
            he heVar = new he(f, new ut(1));
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objL = ak0Var2.L();
            if (z2 || objL == cv.a) {
                objL = new iw(z, ti0Var, 1);
                ak0Var2.g0(objL);
            }
            u71 u71VarE0 = p61.e0(f52.l(sv0.T(u71Var, z, str, null, (ti0) objL, 12).c(f52.a), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            sv1 sv1VarA = rv1.a(heVar, viVar, ak0Var2, 54);
            int iHashCode = Long.hashCode(ak0Var2.T);
            sl1 sl1VarL = ak0Var2.l();
            u71 u71VarB = nj2.B(ak0Var2, u71VarE0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var2, sv1VarA);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var2, sl1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ra raVar3 = vu.g;
            p12.f(ak0Var2, numValueOf, raVar3);
            x4 x4Var = vu.h;
            p12.k(ak0Var2, x4Var);
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var2, u71VarB);
            if (jj0Var == null) {
                ak0Var2.W(-1597947094);
                ak0Var2.p(false);
            } else {
                ak0Var2.W(-1597947093);
                float f2 = ox.e;
                u71 u71VarH = f52.h(r71.a, f2, 0.0f, f2, f2, 2);
                w61 w61VarC = xj.c(q90.f, false);
                int iHashCode2 = Long.hashCode(ak0Var2.T);
                sl1 sl1VarL2 = ak0Var2.l();
                u71 u71VarB2 = nj2.B(ak0Var2, u71VarH);
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar);
                } else {
                    ak0Var2.j0();
                }
                p12.l(raVar, ak0Var2, w61VarC);
                p12.l(raVar2, ak0Var2, sl1VarL2);
                k3.q(iHashCode2, ak0Var2, raVar3, ak0Var2, x4Var);
                p12.l(raVar4, ak0Var2, u71VarB2);
                jj0Var.d(new dr(z ? lxVar.c : lxVar.e), ak0Var2, 0);
                ak0Var2.p(true);
                ak0Var2.p(false);
            }
            long j = z ? lxVar.b : lxVar.d;
            dv1.e(str, new px0(1.0f, true), new vf2(j, ox.h, ox.i, ox.k, ox.b, ox.j, 16613240), 0, false, 1, 0, ak0Var2, (i3 & 14) | 1572864, 952);
            ak0Var2 = ak0Var2;
            ak0Var2.p(true);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new gi(str, z, lxVar, u71Var, jj0Var, ti0Var, i);
        }
    }
}

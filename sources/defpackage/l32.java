package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import ir.alirezaivaz.mygarage.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l32 {
    public static final boolean a;
    public static final String[] b;

    static {
        a = Build.VERSION.SDK_INT >= 31;
        b = new String[]{"*/*"};
    }

    public static final void a(int i, ak0 ak0Var) {
        ak0 ak0Var2;
        ak0Var.X(161925803);
        if (ak0Var.O(i & 1, i != 0)) {
            ak0Var2 = ak0Var;
            nj2.d(f52.a, null, null, null, j20.v, ak0Var2, 196614);
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new xw1(i);
        }
    }

    public static final void b(String str, String str2, boolean z, ti0 ti0Var, ak0 ak0Var, int i) {
        ak0 ak0Var2 = ak0Var;
        ak0Var2.X(-1791862764);
        int i2 = (ak0Var2.f(str) ? 4 : 2) | i | (ak0Var2.f(str2) ? 32 : 16) | (ak0Var2.g(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= ak0Var2.h(ti0Var) ? 2048 : 1024;
        }
        if (ak0Var2.O(i2 & 1, (i2 & 1171) != 1170)) {
            u71 u71VarD0 = p61.d0(sv0.T(f52.a, z, null, new wu1(0), ti0Var, 10), 16.0f, 12.0f);
            wr wrVarA = ur.a(ws0.g, q90.r, ak0Var2, 0);
            int iHashCode = Long.hashCode(ak0Var2.T);
            sl1 sl1VarL = ak0Var2.l();
            u71 u71VarB = nj2.B(ak0Var2, u71VarD0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            p12.l(vu.f, ak0Var2, wrVarA);
            p12.l(vu.e, ak0Var2, sl1VarL);
            p12.f(ak0Var2, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var2, vu.h);
            p12.l(vu.d, ak0Var2, u71VarB);
            a90 a90Var = ik2.a;
            ef2.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(a90Var)).j, ak0Var2, i2 & 14, 0, 131070);
            ef2.b(str2, null, ((jr) ak0Var2.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(a90Var)).l, ak0Var2, (i2 >> 3) & 14, 0, 131066);
            ak0Var2 = ak0Var2;
            ak0Var2.p(true);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new z00(str, str2, z, ti0Var, i);
        }
    }

    public static final void c(String str, boolean z, ti0 ti0Var, ak0 ak0Var, int i) {
        ak0Var.X(-433140152);
        int i2 = i | (ak0Var.f(str) ? 4 : 2) | (ak0Var.g(z) ? 32 : 16) | (ak0Var.h(ti0Var) ? 256 : 128);
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            u71 u71VarD0 = p61.d0(s5.P(f52.a, z, new wu1(3), ti0Var), 16.0f, 12.0f);
            sv1 sv1VarA = rv1.a(ws0.e, q90.p, ak0Var, 48);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarD0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, sv1VarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            rw.h(z, null, false, null, ak0Var, 48 | ((i2 >> 3) & 14));
            r02.b(ak0Var, f52.n(r71.a, 16.0f));
            ef2.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var.j(ik2.a)).j, ak0Var, i2 & 14, 0, 131070);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new qc0(str, z, ti0Var, i, 2);
        }
    }

    public static final void d(dh dhVar, ti0 ti0Var, ak0 ak0Var, int i) {
        ak0Var.X(-940601523);
        int i2 = i | (ak0Var.f(dhVar) ? 4 : 2) | (ak0Var.h(ti0Var) ? 32 : 16);
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            final boolean z = dhVar instanceof bh;
            ir2.a(ti0Var, vs0.C(340319237, new pd(11, ti0Var), ak0Var), null, null, vs0.C(917958017, new ij0() { // from class: i32
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ak0 ak0Var2 = (ak0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ak0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ef2.b(j02.r(z ? R.string.backup_import_done_title : R.string.backup_import_failed_title, ak0Var2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var2, 0, 0, 262142);
                    } else {
                        ak0Var2.R();
                    }
                    return ll2.a;
                }
            }, ak0Var), vs0.C(1062367712, new x7(28, dhVar), ak0Var), null, 0L, 0L, 0L, 0L, null, ak0Var, ((i2 >> 3) & 14) | 1769520, 16284);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new nb1(dhVar, ti0Var, i, 2);
        }
    }

    public static final void e(ti0 ti0Var, ti0 ti0Var2, ak0 ak0Var, int i) {
        ak0Var.X(281561990);
        int i2 = i | (ak0Var.h(ti0Var2) ? 32 : 16);
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            ir2.a(ti0Var, vs0.C(-814435266, new pd(12, ti0Var2), ak0Var), null, vs0.C(-1399206916, new pd(13, ti0Var), ak0Var), j20.s, j20.t, null, 0L, 0L, 0L, 0L, null, ak0Var, 1772598, 16276);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new nb1(ti0Var, ti0Var2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final void f(o32 o32Var, ph phVar, ak0 ak0Var, int i) {
        o32 o32Var2;
        ph phVar2;
        o32 o32Var3;
        final ph phVar3;
        String strR;
        ph phVar4;
        String str;
        ?? r8;
        da1 da1Var;
        ak0Var.X(164928830);
        int i2 = i | 18;
        final int i3 = 1;
        final int i4 = 0;
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                co2 co2VarA = o31.a(ak0Var);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                o32 o32Var4 = (o32) p12.r(js1.a(o32.class), co2VarA, sv.y(co2VarA, ak0Var), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
                co2 co2VarA2 = o31.a(ak0Var);
                if (co2VarA2 == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    o32Var3 = o32Var4;
                    phVar3 = (ph) p12.r(js1.a(ph.class), co2VarA2, sv.y(co2VarA2, ak0Var), co2VarA2 instanceof zl0 ? ((zl0) co2VarA2).f() : jz.b, ak0Var);
                }
            } else {
                ak0Var.R();
                o32Var3 = o32Var;
                phVar3 = phVar;
            }
            ak0Var.q();
            da1 da1VarR = qx.r(o32Var3.c, ak0Var);
            da1 da1VarR2 = qx.r(phVar3.d, ak0Var);
            Activity activity = (Activity) ak0Var.j(h31.a);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new x52();
                ak0Var.g0(objL);
            }
            x52 x52Var = (x52) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == obj) {
                objL2 = y12.s(Boolean.FALSE);
                ak0Var.g0(objL2);
            }
            da1 da1Var2 = (da1) objL2;
            k2 k2Var = new k2(i4);
            boolean zH = ak0Var.h(phVar3);
            Object objL3 = ak0Var.L();
            if (zH || objL3 == obj) {
                objL3 = new ej0() { // from class: g32
                    @Override // defpackage.ej0
                    public final Object h(Object obj2) {
                        int i5 = i4;
                        ll2 ll2Var = ll2.a;
                        ph phVar5 = phVar3;
                        Uri uri = (Uri) obj2;
                        switch (i5) {
                            case 0:
                                if (uri != null) {
                                    phVar5.e(new oh(phVar5, uri, null, 0), new ut(3));
                                }
                                break;
                            default:
                                if (uri != null) {
                                    phVar5.e(new oh(phVar5, uri, null, 1), new ut(2));
                                }
                                break;
                        }
                        return ll2Var;
                    }
                };
                ak0Var.g0(objL3);
            }
            s51 s51VarG = dv1.G(k2Var, (ej0) objL3, ak0Var);
            k2 k2Var2 = new k2(i3);
            boolean zH2 = ak0Var.h(phVar3);
            Object objL4 = ak0Var.L();
            if (zH2 || objL4 == obj) {
                objL4 = new ej0() { // from class: g32
                    @Override // defpackage.ej0
                    public final Object h(Object obj2) {
                        int i5 = i3;
                        ll2 ll2Var = ll2.a;
                        ph phVar5 = phVar3;
                        Uri uri = (Uri) obj2;
                        switch (i5) {
                            case 0:
                                if (uri != null) {
                                    phVar5.e(new oh(phVar5, uri, null, 0), new ut(3));
                                }
                                break;
                            default:
                                if (uri != null) {
                                    phVar5.e(new oh(phVar5, uri, null, 1), new ut(2));
                                }
                                break;
                        }
                        return ll2Var;
                    }
                };
                ak0Var.g0(objL4);
            }
            s51 s51VarG2 = dv1.G(k2Var2, (ej0) objL4, ak0Var);
            dh dhVar = ((nh) da1VarR2.getValue()).b;
            sx sxVar = null;
            if (dhVar == null) {
                ak0Var.W(-46778305);
                ak0Var.p(false);
                strR = null;
            } else if (dhVar instanceof bh) {
                ak0Var.W(-417149655);
                strR = j02.r(R.string.backup_export_done, ak0Var);
                ak0Var.p(false);
            } else {
                ak0Var.W(-417147733);
                strR = j02.r(R.string.backup_export_failed, ak0Var);
                ak0Var.p(false);
            }
            boolean zF = ak0Var.f(strR) | ak0Var.h(phVar3);
            Object objL5 = ak0Var.L();
            if (zF || objL5 == obj) {
                String str2 = strR;
                phVar4 = phVar3;
                objL5 = new g(str2, x52Var, phVar4, sxVar, 22);
                str = str2;
                ak0Var.g0(objL5);
            } else {
                phVar4 = phVar3;
                str = strR;
            }
            s5.o((ij0) objL5, ak0Var, str);
            WeakHashMap weakHashMap = fq2.v;
            o32 o32Var5 = o32Var3;
            ix.f(null, j20.j, null, vs0.C(-680553032, new x7(27, x52Var), ak0Var), null, 0, 0L, 0L, new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15), vs0.C(710892751, new dn0(da1VarR, o32Var3, activity, da1VarR2, s51VarG, phVar4, da1Var2), ak0Var), ak0Var, 805309488, 245);
            if (((Boolean) da1Var2.getValue()).booleanValue()) {
                ak0Var.W(-41310245);
                Object objL6 = ak0Var.L();
                if (objL6 == obj) {
                    da1Var = da1Var2;
                    objL6 = new r9(da1Var, 28);
                    ak0Var.g0(objL6);
                } else {
                    da1Var = da1Var2;
                }
                ti0 ti0Var = (ti0) objL6;
                boolean zH3 = ak0Var.h(s51VarG2);
                Object objL7 = ak0Var.L();
                if (zH3 || objL7 == obj) {
                    objL7 = new gp1(4, s51VarG2, da1Var);
                    ak0Var.g0(objL7);
                }
                e(ti0Var, (ti0) objL7, ak0Var, 6);
                r8 = 0;
            } else {
                r8 = 0;
                ak0Var.W(-51389244);
            }
            ak0Var.p(r8);
            dh dhVar2 = ((nh) da1VarR2.getValue()).c;
            if (dhVar2 == null) {
                ak0Var.W(-41044669);
                ak0Var.p(r8);
                phVar2 = phVar4;
            } else {
                ak0Var.W(-41044668);
                phVar2 = phVar4;
                boolean zH4 = ak0Var.h(phVar2) | ak0Var.h(dhVar2) | ak0Var.h(activity);
                Object objL8 = ak0Var.L();
                if (zH4 || objL8 == obj) {
                    objL8 = new vf(phVar2, dhVar2, activity, 11);
                    ak0Var.g0(objL8);
                }
                d(dhVar2, (ti0) objL8, ak0Var, r8);
                ak0Var.p(r8);
            }
            o32Var2 = o32Var5;
        } else {
            ak0Var.R();
            o32Var2 = o32Var;
            phVar2 = phVar;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new nb1(o32Var2, phVar2, i, 1);
        }
    }

    public static final void g(String str, String str2, boolean z, ej0 ej0Var, ak0 ak0Var, int i) {
        ak0Var.X(-1873634089);
        int i2 = i | (ak0Var.f(str) ? 4 : 2) | (ak0Var.f(str2) ? 32 : 16) | (ak0Var.g(z) ? 256 : 128) | (ak0Var.h(ej0Var) ? 2048 : 1024);
        if (ak0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            u71 u71VarD0 = p61.d0(dv1.P(f52.a, z, new wu1(2), ej0Var), 16.0f, 12.0f);
            sv1 sv1VarA = rv1.a(ws0.e, q90.p, ak0Var, 48);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarD0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var, sv1VarA);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ra raVar3 = vu.g;
            p12.f(ak0Var, numValueOf, raVar3);
            x4 x4Var = vu.h;
            p12.k(ak0Var, x4Var);
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            px0 px0Var = new px0(1.0f, true);
            wr wrVarA = ur.a(ws0.g, q90.r, ak0Var, 0);
            int iHashCode2 = Long.hashCode(ak0Var.T);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, px0Var);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, wrVarA);
            p12.l(raVar2, ak0Var, sl1VarL2);
            k3.q(iHashCode2, ak0Var, raVar3, ak0Var, x4Var);
            p12.l(raVar4, ak0Var, u71VarB2);
            a90 a90Var = ik2.a;
            ef2.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var.j(a90Var)).j, ak0Var, i2 & 14, 0, 131070);
            ef2.b(str2, null, ((jr) ak0Var.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var.j(a90Var)).l, ak0Var, (i2 >> 3) & 14, 0, 131066);
            ak0Var.p(true);
            r02.b(ak0Var, f52.n(r71.a, 16.0f));
            gb2.a(z, null, null, false, null, ak0Var, 48 | ((i2 >> 6) & 14));
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new sc0(str, str2, z, ej0Var, i);
        }
    }
}

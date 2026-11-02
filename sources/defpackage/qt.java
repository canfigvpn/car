package defpackage;

import android.content.Context;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qt implements jj0 {
    public final /* synthetic */ int e;

    public /* synthetic */ qt(int i) {
        this.e = i;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        Object ut1Var;
        int i = this.e;
        db0 db0Var = db0.e;
        Object obj4 = cv.a;
        r71 r71Var = r71.a;
        ll2 ll2Var = ll2.a;
        final int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                lx lxVar = (lx) obj;
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ak0Var.f(lxVar) ? 4 : 2;
                }
                if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    xj.a(p61.s(f52.c(p61.e0(r71Var, 0.0f, ox.g, 1).c(f52.a), ox.f), lxVar.c, vs0.C), ak0Var, 0);
                } else {
                    ak0Var.R();
                }
                return ll2Var;
            case 1:
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    u71 u71VarC0 = p61.c0(f52.a, 16.0f);
                    sv1 sv1VarA = rv1.a(ws0.e, q90.p, ak0Var2, 48);
                    int iHashCode = Long.hashCode(ak0Var2.T);
                    sl1 sl1VarL = ak0Var2.l();
                    u71 u71VarB = nj2.B(ak0Var2, u71VarC0);
                    wu.c.getClass();
                    ti0 ti0Var = vu.b;
                    ak0Var2.Z();
                    if (ak0Var2.S) {
                        ak0Var2.k(ti0Var);
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
                    tq1 tq1Var = ik2.a;
                    ef2.b("🚗", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(tq1Var)).f, ak0Var2, 6, 0, 131070);
                    r02.b(ak0Var2, f52.n(r71Var, 16.0f));
                    px0 px0Var = new px0(1.0f, true);
                    wr wrVarA = ur.a(ws0.g, q90.r, ak0Var2, 0);
                    int iHashCode2 = Long.hashCode(ak0Var2.T);
                    sl1 sl1VarL2 = ak0Var2.l();
                    u71 u71VarB2 = nj2.B(ak0Var2, px0Var);
                    ak0Var2.Z();
                    if (ak0Var2.S) {
                        ak0Var2.k(ti0Var);
                    } else {
                        ak0Var2.j0();
                    }
                    p12.l(raVar, ak0Var2, wrVarA);
                    p12.l(raVar2, ak0Var2, sl1VarL2);
                    k3.q(iHashCode2, ak0Var2, raVar3, ak0Var2, x4Var);
                    p12.l(raVar4, ak0Var2, u71VarB2);
                    ef2.b(j02.r(R.string.app_name, ak0Var2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(tq1Var)).i, ak0Var2, 0, 0, 131070);
                    boolean z2 = l32.a;
                    Context context = (Context) ak0Var2.j(u5.b);
                    boolean zF = ak0Var2.f(context);
                    Object objL = ak0Var2.L();
                    if (zF || objL == obj4) {
                        try {
                            ut1Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                        } catch (Throwable th) {
                            ut1Var = new ut1(th);
                        }
                        Object obj5 = (String) (ut1Var instanceof ut1 ? null : ut1Var);
                        objL = obj5 == null ? "" : obj5;
                        ak0Var2.g0(objL);
                    }
                    String strN = (String) objL;
                    if (dv1.z(ak0Var2)) {
                        strN = dv1.N(strN);
                    }
                    ef2.b(j02.s(R.string.settings_version, new Object[]{k3.j("\u2066", strN, "\u2069")}, ak0Var2), null, ((jr) ak0Var2.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(ik2.a)).l, ak0Var2, 0, 0, 131066);
                    ak0Var2.p(true);
                    ak0Var2.p(true);
                    break;
                } else {
                    ak0Var2.R();
                }
                return ll2Var;
            case 2:
                y61 y61Var = (y61) obj;
                final int iO = y61Var.O(10.0f);
                int i3 = iO * 2;
                final jm1 jm1VarE = ((r61) obj2).e(tw.i(i3, 0, ((sw) obj3).a));
                return y61Var.d0(jm1VarE.e - i3, jm1VarE.f, db0Var, new ej0() { // from class: t1
                    @Override // defpackage.ej0
                    public final Object h(Object obj6) {
                        int i4 = i2;
                        ll2 ll2Var2 = ll2.a;
                        int i5 = iO;
                        jm1 jm1Var = jm1VarE;
                        im1 im1Var = (im1) obj6;
                        switch (i4) {
                            case 0:
                                im1Var.h(jm1Var, 0, -i5, 0.0f);
                                break;
                            default:
                                im1Var.h(jm1Var, -i5, 0, 0.0f);
                                break;
                        }
                        return ll2Var2;
                    }
                });
            case 3:
                y61 y61Var2 = (y61) obj;
                final int iO2 = y61Var2.O(10.0f);
                int i4 = iO2 * 2;
                final jm1 jm1VarE2 = ((r61) obj2).e(tw.i(0, i4, ((sw) obj3).a));
                int i5 = jm1VarE2.f - i4;
                int i6 = jm1VarE2.e;
                final int i7 = z ? 1 : 0;
                return y61Var2.d0(i6, i5, db0Var, new ej0() { // from class: t1
                    @Override // defpackage.ej0
                    public final Object h(Object obj6) {
                        int i8 = i7;
                        ll2 ll2Var2 = ll2.a;
                        int i9 = iO2;
                        jm1 jm1Var = jm1VarE2;
                        im1 im1Var = (im1) obj6;
                        switch (i8) {
                            case 0:
                                im1Var.h(jm1Var, 0, -i9, 0.0f);
                                break;
                            default:
                                im1Var.h(jm1Var, -i9, 0, 0.0f);
                                break;
                        }
                        return ll2Var2;
                    }
                });
            case 4:
                u71 u71Var = (u71) obj;
                ak0 ak0Var3 = (ak0) obj2;
                ((Integer) obj3).getClass();
                ak0Var3.W(-2126899193);
                long j = ((pf2) ak0Var3.j(qf2.a)).a;
                boolean zE = ak0Var3.e(j);
                Object objL2 = ak0Var3.L();
                if (zE || objL2 == obj4) {
                    objL2 = new g6(z ? 1 : 0, j);
                    ak0Var3.g0(objL2);
                }
                u71 u71VarC = u71Var.c(ir2.m(r71Var, (ej0) objL2));
                ak0Var3.p(false);
                return u71VarC;
            case 5:
                jm1 jm1VarE3 = ((r61) obj2).e(((sw) obj3).a);
                return ((y61) obj).N(jm1VarE3.e, jm1VarE3.f, db0.e, new s1(5), new ye(jm1VarE3, 1));
            case 6:
                ak0 ak0Var4 = (ak0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_ok, ak0Var4), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var4, 0, 0, 262142);
                } else {
                    ak0Var4.R();
                }
                return ll2Var;
            case 7:
                ak0 ak0Var5 = (ak0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var5.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_cancel, ak0Var5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var5, 0, 0, 262142);
                } else {
                    ak0Var5.R();
                }
                return ll2Var;
            case 8:
                ak0 ak0Var6 = (ak0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var6.O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_cancel, ak0Var6), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var6, 0, 0, 262142);
                } else {
                    ak0Var6.R();
                }
                return ll2Var;
            case 9:
                ak0 ak0Var7 = (ak0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var7.O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_ok, ak0Var7), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var7, 0, 0, 262142);
                } else {
                    ak0Var7.R();
                }
                return ll2Var;
            case 10:
                ak0 ak0Var8 = (ak0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var8.O(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_save, ak0Var8), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var8, 0, 0, 262142);
                } else {
                    ak0Var8.R();
                }
                return ll2Var;
            case 11:
                ak0 ak0Var9 = (ak0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var9.O(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    dv1.g(j02.r(R.string.fuel_fill_count, ak0Var9), p61.f0(r71.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), ak0Var9, 48, 12);
                } else {
                    ak0Var9.R();
                }
                return ll2Var;
            case 12:
                ak0 ak0Var10 = (ak0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var10.O(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    dv1.g(j02.r(R.string.home_service_health, ak0Var10), null, ak0Var10, 0, 14);
                } else {
                    ak0Var10.R();
                }
                return ll2Var;
            case 13:
                ak0 ak0Var11 = (ak0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var11.O(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ef2.b(j02.r(R.string.home_no_tracked_services, ak0Var11), null, ((jr) ak0Var11.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var11.j(ik2.a)).k, ak0Var11, 0, 0, 131066);
                } else {
                    ak0Var11.R();
                }
                return ll2Var;
            case 14:
                ak0 ak0Var12 = (ak0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var12.O(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_delete, ak0Var12), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var12, 0, 0, 262142);
                } else {
                    ak0Var12.R();
                }
                return ll2Var;
            case 15:
                ak0 ak0Var13 = (ak0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var13.O(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_cancel, ak0Var13), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var13, 0, 0, 262142);
                } else {
                    ak0Var13.R();
                }
                return ll2Var;
            case 16:
                ak0 ak0Var14 = (ak0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var14.O(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_save, ak0Var14), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var14, 0, 0, 262142);
                } else {
                    ak0Var14.R();
                }
                return ll2Var;
            case 17:
                ak0 ak0Var15 = (ak0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var15.O(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_cancel, ak0Var15), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var15, 0, 0, 262142);
                } else {
                    ak0Var15.R();
                }
                return ll2Var;
            case 18:
                ak0 ak0Var16 = (ak0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var16.O(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    ef2.b(j02.r(R.string.intervals_subtitle, ak0Var16), null, ((jr) ak0Var16.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var16.j(ik2.a)).k, ak0Var16, 0, 0, 131066);
                } else {
                    ak0Var16.R();
                }
                return ll2Var;
            case 19:
                ak0 ak0Var17 = (ak0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var17.O(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    ef2.b(j02.r(R.string.log_use_car_odometer, ak0Var17), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var17, 0, 0, 262142);
                } else {
                    ak0Var17.R();
                }
                return ll2Var;
            case 20:
                ak0 ak0Var18 = (ak0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var18.O(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_save, ak0Var18), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var18, 0, 0, 262142);
                } else {
                    ak0Var18.R();
                }
                return ll2Var;
            case 21:
                ak0 ak0Var19 = (ak0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var19.O(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_delete, ak0Var19), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var19, 0, 0, 262142);
                } else {
                    ak0Var19.R();
                }
                return ll2Var;
            case 22:
                ak0 ak0Var20 = (ak0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var20.O(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_cancel, ak0Var20), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var20, 0, 0, 262142);
                } else {
                    ak0Var20.R();
                }
                return ll2Var;
            case 23:
                ak0 ak0Var21 = (ak0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var21.O(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    dv1.g(j02.r(R.string.settings_about, ak0Var21), null, ak0Var21, 0, 14);
                } else {
                    ak0Var21.R();
                }
                return ll2Var;
            case 24:
                ak0 ak0Var22 = (ak0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var22.O(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    l32.a(0, ak0Var22);
                } else {
                    ak0Var22.R();
                }
                return ll2Var;
            case 25:
                ak0 ak0Var23 = (ak0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var23.O(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    ef2.b(j02.r(R.string.backup_replace_action, ak0Var23), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var23, 0, 0, 262142);
                } else {
                    ak0Var23.R();
                }
                return ll2Var;
            case 26:
                ak0 ak0Var24 = (ak0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var24.O(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_cancel, ak0Var24), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var24, 0, 0, 262142);
                } else {
                    ak0Var24.R();
                }
                return ll2Var;
            case 27:
                ak0 ak0Var25 = (ak0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var25.O(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    ef2.b(j02.r(R.string.action_ok, ak0Var25), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var25, 0, 0, 262142);
                } else {
                    ak0Var25.R();
                }
                return ll2Var;
            case 28:
                ak0 ak0Var26 = (ak0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var26.O(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    dv1.g(j02.r(R.string.settings_appearance, ak0Var26), null, ak0Var26, 0, 14);
                } else {
                    ak0Var26.R();
                }
                return ll2Var;
            default:
                ak0 ak0Var27 = (ak0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var27.O(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    dv1.g(j02.r(R.string.settings_language, ak0Var27), null, ak0Var27, 0, 14);
                } else {
                    ak0Var27.R();
                }
                return ll2Var;
        }
    }
}

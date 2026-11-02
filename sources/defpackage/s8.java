package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s8 {
    public static final a90 a = new a90(0, t5.n);
    public static final a90 b = new a90(0, t5.m);

    /* JADX WARN: Code duplicated, block: B:100:0x021e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:103:0x0248  */
    /* JADX WARN: Code duplicated, block: B:106:0x0252  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0154  */
    /* JADX WARN: Code duplicated, block: B:71:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x0193  */
    /* JADX WARN: Code duplicated, block: B:85:0x019d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f8  */
    public static final void a(xo1 xo1Var, ti0 ti0Var, yo1 yo1Var, gt gtVar, ak0 ak0Var, int i, int i2) {
        int i3;
        ti0 ti0Var2;
        yo1 yo1Var2;
        boolean z;
        ti0 ti0Var3;
        lr1 lr1VarR;
        ti0 ti0Var4;
        View view;
        m40 m40Var;
        String str;
        kw0 kw0Var;
        yj0 yj0VarN;
        da1 da1VarT;
        Object objL;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zBooleanValue;
        Object objL2;
        int i4;
        String str2;
        boolean z2;
        uo1 uo1Var;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zF;
        Object objL3;
        boolean z5;
        boolean z6;
        boolean zF2;
        Object objL4;
        boolean z7;
        boolean z8;
        Object obj3;
        boolean zH;
        Object obj4;
        boolean zH2;
        Object obj5;
        boolean zH3;
        Object obj6;
        ti0 ti0Var5;
        int i7;
        int i8;
        xo1 xo1Var2 = xo1Var;
        ak0Var.X(-1772091631);
        if ((i & 6) == 0) {
            i3 = (ak0Var.f(xo1Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                ti0Var2 = ti0Var;
                i3 |= ak0Var.h(ti0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                yo1Var2 = yo1Var;
                if (ak0Var.f(yo1Var2)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            } else {
                yo1Var2 = yo1Var;
            }
            if ((i & 3072) == 0) {
                if (ak0Var.h(gtVar)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ak0Var.O(i3 & 1, z)) {
                if (i9 != 0) {
                    ti0Var4 = null;
                } else {
                    ti0Var4 = ti0Var2;
                }
                view = (View) ak0Var.j(u5.f);
                m40Var = (m40) ak0Var.j(yv.h);
                str = (String) ak0Var.j(a);
                kw0Var = (kw0) ak0Var.j(yv.n);
                yj0VarN = ws0.N(ak0Var);
                da1VarT = y12.t(gtVar, ak0Var);
                Object[] objArr = new Object[0];
                objL = ak0Var.L();
                obj = cv.a;
                obj2 = objL;
                if (objL == obj) {
                    Object obj7 = t5.o;
                    ak0Var.g0(obj7);
                    obj2 = obj7;
                }
                uuid = (UUID) ex.H(objArr, (ti0) obj2, ak0Var, 48);
                zBooleanValue = ((Boolean) ak0Var.j(b)).booleanValue();
                objL2 = ak0Var.L();
                if (objL2 == obj) {
                    str2 = str;
                    i4 = i3;
                    z2 = true;
                    uo1 uo1Var2 = new uo1(ti0Var4, yo1Var2, str2, view, m40Var, xo1Var2, uuid, zBooleanValue);
                    xo1Var2 = xo1Var2;
                    uo1Var2.n(yj0VarN, new gt(new r8(uo1Var2, da1VarT, true ? 1 : 0), true, -297523940));
                    ak0Var.g0(uo1Var2);
                    objL2 = uo1Var2;
                } else {
                    i4 = i3;
                    str2 = str;
                    z2 = true;
                }
                uo1Var = (uo1) objL2;
                boolean zH4 = ak0Var.h(uo1Var);
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z9 = zH4 | z3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                zF = z9 | z4 | ak0Var.f(str2) | ak0Var.d(kw0Var.ordinal());
                objL3 = ak0Var.L();
                if (zF || objL3 == obj) {
                    Object l8Var = new l8(uo1Var, ti0Var4, yo1Var, str2, kw0Var);
                    ak0Var.g0(l8Var);
                    objL3 = l8Var;
                }
                s5.e(uo1Var, (ej0) objL3, ak0Var);
                boolean zH5 = ak0Var.h(uo1Var);
                if (i5 == 32) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z10 = zH5 | z5;
                if (i6 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                zF2 = z10 | z6 | ak0Var.f(str2) | ak0Var.d(kw0Var.ordinal());
                objL4 = ak0Var.L();
                if (zF2 || objL4 == obj) {
                    Object m8Var = new m8(uo1Var, ti0Var4, yo1Var, str2, kw0Var);
                    ak0Var.g0(m8Var);
                    objL4 = m8Var;
                }
                s5.v((ti0) objL4, ak0Var);
                boolean zH6 = ak0Var.h(uo1Var);
                if ((i4 & 14) == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                z8 = zH6 | z7;
                Object objL5 = ak0Var.L();
                obj3 = objL5;
                if (z8 == 0 || objL5 == obj) {
                    Object i8Var = new i8(2, uo1Var, xo1Var2);
                    ak0Var.g0(i8Var);
                    obj3 = i8Var;
                }
                s5.e(xo1Var2, (ej0) obj3, ak0Var);
                zH = ak0Var.h(uo1Var);
                Object objL6 = ak0Var.L();
                obj4 = objL6;
                if (zH || objL6 == obj) {
                    Object eVar = new e(4, null, uo1Var);
                    ak0Var.g0(eVar);
                    obj4 = eVar;
                }
                s5.o((ij0) obj4, ak0Var, uo1Var);
                zH2 = ak0Var.h(uo1Var);
                Object objL7 = ak0Var.L();
                obj5 = objL7;
                if (zH2 || objL7 == obj) {
                    Object o8Var = new o8(uo1Var, 0);
                    ak0Var.g0(o8Var);
                    obj5 = o8Var;
                }
                u71 u71VarZ = j20.z(r71.a, (ej0) obj5);
                zH3 = ak0Var.h(uo1Var) | ak0Var.d(kw0Var.ordinal());
                Object objL8 = ak0Var.L();
                obj6 = objL8;
                if (zH3 || objL8 == obj) {
                    Object p8Var = new p8(uo1Var, kw0Var);
                    ak0Var.g0(p8Var);
                    obj6 = p8Var;
                }
                w61 w61Var = (w61) obj6;
                int iHashCode = Long.hashCode(ak0Var.T);
                sl1 sl1VarL = ak0Var.l();
                u71 u71VarB = nj2.B(ak0Var, u71VarZ);
                wu.c.getClass();
                ti0Var5 = vu.b;
                ak0Var.Z();
                if (ak0Var.S) {
                    ak0Var.k(ti0Var5);
                } else {
                    ak0Var.j0();
                }
                p12.l(vu.f, ak0Var, w61Var);
                p12.l(vu.e, ak0Var, sl1VarL);
                p12.l(vu.g, ak0Var, Integer.valueOf(iHashCode));
                p12.k(ak0Var, vu.h);
                p12.l(vu.d, ak0Var, u71VarB);
                ak0Var.p(z2);
                ti0Var3 = ti0Var4;
            } else {
                ak0Var.R();
                ti0Var3 = ti0Var2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new q8(xo1Var2, ti0Var3, yo1Var, gtVar, i, i2);
            }
        }
        i3 |= 48;
        ti0Var2 = ti0Var;
        if ((i & 384) == 0) {
            yo1Var2 = yo1Var;
            if (ak0Var.f(yo1Var2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            yo1Var2 = yo1Var;
        }
        if ((i & 3072) == 0) {
            if (ak0Var.h(gtVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ak0Var.O(i3 & 1, z)) {
            if (i9 != 0) {
                ti0Var4 = null;
            } else {
                ti0Var4 = ti0Var2;
            }
            view = (View) ak0Var.j(u5.f);
            m40Var = (m40) ak0Var.j(yv.h);
            str = (String) ak0Var.j(a);
            kw0Var = (kw0) ak0Var.j(yv.n);
            yj0VarN = ws0.N(ak0Var);
            da1VarT = y12.t(gtVar, ak0Var);
            Object[] objArr2 = new Object[0];
            objL = ak0Var.L();
            obj = cv.a;
            obj2 = objL;
            if (objL == obj) {
                Object obj8 = t5.o;
                ak0Var.g0(obj8);
                obj2 = obj8;
            }
            uuid = (UUID) ex.H(objArr2, (ti0) obj2, ak0Var, 48);
            zBooleanValue = ((Boolean) ak0Var.j(b)).booleanValue();
            objL2 = ak0Var.L();
            if (objL2 == obj) {
                str2 = str;
                i4 = i3;
                z2 = true;
                uo1 uo1Var3 = new uo1(ti0Var4, yo1Var2, str2, view, m40Var, xo1Var2, uuid, zBooleanValue);
                xo1Var2 = xo1Var2;
                uo1Var3.n(yj0VarN, new gt(new r8(uo1Var3, da1VarT, true ? 1 : 0), true, -297523940));
                ak0Var.g0(uo1Var3);
                objL2 = uo1Var3;
            } else {
                i4 = i3;
                str2 = str;
                z2 = true;
            }
            uo1Var = (uo1) objL2;
            boolean zH7 = ak0Var.h(uo1Var);
            i5 = i4 & 112;
            if (i5 == 32) {
                z3 = z2;
            } else {
                z3 = false;
            }
            boolean z11 = zH7 | z3;
            i6 = i4 & 896;
            if (i6 == 256) {
                z4 = z2;
            } else {
                z4 = false;
            }
            zF = z11 | z4 | ak0Var.f(str2) | ak0Var.d(kw0Var.ordinal());
            objL3 = ak0Var.L();
            if (zF) {
                Object l8Var2 = new l8(uo1Var, ti0Var4, yo1Var, str2, kw0Var);
                ak0Var.g0(l8Var2);
                objL3 = l8Var2;
            } else {
                Object l8Var3 = new l8(uo1Var, ti0Var4, yo1Var, str2, kw0Var);
                ak0Var.g0(l8Var3);
                objL3 = l8Var3;
            }
            s5.e(uo1Var, (ej0) objL3, ak0Var);
            boolean zH8 = ak0Var.h(uo1Var);
            if (i5 == 32) {
                z5 = z2;
            } else {
                z5 = false;
            }
            boolean z12 = zH8 | z5;
            if (i6 == 256) {
                z6 = z2;
            } else {
                z6 = false;
            }
            zF2 = z12 | z6 | ak0Var.f(str2) | ak0Var.d(kw0Var.ordinal());
            objL4 = ak0Var.L();
            if (zF2) {
                Object m8Var2 = new m8(uo1Var, ti0Var4, yo1Var, str2, kw0Var);
                ak0Var.g0(m8Var2);
                objL4 = m8Var2;
            } else {
                Object m8Var3 = new m8(uo1Var, ti0Var4, yo1Var, str2, kw0Var);
                ak0Var.g0(m8Var3);
                objL4 = m8Var3;
            }
            s5.v((ti0) objL4, ak0Var);
            boolean zH9 = ak0Var.h(uo1Var);
            if ((i4 & 14) == 4) {
                z7 = z2;
            } else {
                z7 = false;
            }
            z8 = zH9 | z7;
            Object objL9 = ak0Var.L();
            obj3 = objL9;
            if (z8 == 0) {
                Object i8Var2 = new i8(2, uo1Var, xo1Var2);
                ak0Var.g0(i8Var2);
                obj3 = i8Var2;
            } else {
                Object i8Var3 = new i8(2, uo1Var, xo1Var2);
                ak0Var.g0(i8Var3);
                obj3 = i8Var3;
            }
            s5.e(xo1Var2, (ej0) obj3, ak0Var);
            zH = ak0Var.h(uo1Var);
            Object objL10 = ak0Var.L();
            obj4 = objL10;
            if (zH) {
                Object eVar2 = new e(4, null, uo1Var);
                ak0Var.g0(eVar2);
                obj4 = eVar2;
            } else {
                Object eVar3 = new e(4, null, uo1Var);
                ak0Var.g0(eVar3);
                obj4 = eVar3;
            }
            s5.o((ij0) obj4, ak0Var, uo1Var);
            zH2 = ak0Var.h(uo1Var);
            Object objL11 = ak0Var.L();
            obj5 = objL11;
            if (zH2) {
                Object o8Var2 = new o8(uo1Var, 0);
                ak0Var.g0(o8Var2);
                obj5 = o8Var2;
            } else {
                Object o8Var3 = new o8(uo1Var, 0);
                ak0Var.g0(o8Var3);
                obj5 = o8Var3;
            }
            u71 u71VarZ2 = j20.z(r71.a, (ej0) obj5);
            zH3 = ak0Var.h(uo1Var) | ak0Var.d(kw0Var.ordinal());
            Object objL12 = ak0Var.L();
            obj6 = objL12;
            if (zH3) {
                Object p8Var2 = new p8(uo1Var, kw0Var);
                ak0Var.g0(p8Var2);
                obj6 = p8Var2;
            } else {
                Object p8Var3 = new p8(uo1Var, kw0Var);
                ak0Var.g0(p8Var3);
                obj6 = p8Var3;
            }
            w61 w61Var2 = (w61) obj6;
            int iHashCode2 = Long.hashCode(ak0Var.T);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, u71VarZ2);
            wu.c.getClass();
            ti0Var5 = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var5);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61Var2);
            p12.l(vu.e, ak0Var, sl1VarL2);
            p12.l(vu.g, ak0Var, Integer.valueOf(iHashCode2));
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB2);
            ak0Var.p(z2);
            ti0Var3 = ti0Var4;
        } else {
            ak0Var.R();
            ti0Var3 = ti0Var2;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q8(xo1Var2, ti0Var3, yo1Var, gtVar, i, i2);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}

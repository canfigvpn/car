package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import ir.alirezaivaz.mygarage.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j20 {
    public static final float A;
    public static final kr B;
    public static final float C;
    public static final kr D;
    public static final float E;
    public static final kr F;
    public static final kr G;
    public static final float H;
    public static final kr I;
    public static final StackTraceElement[] J;
    public static final kr K;
    public static final kr L;
    public static final float M;
    public static final kr N;
    public static final kr O;
    public static final yr1 P;
    public static final pa0 Q;
    public static final pa0 R;
    public static final Object S;
    public static final Object T;
    public static final Object U;
    public static final Object V;
    public static final Object W;
    public static final md0 X;
    public static final /* synthetic */ int Y = 0;
    public static final gt h;
    public static final gt i;
    public static final gt j;
    public static final gt m;
    public static final gt n;
    public static final gt o;
    public static final gt p;
    public static final gt q;
    public static final gt r;
    public static final gt s;
    public static final gt t;
    public static final gt v;
    public static final kr z;
    public static final sx[] a = new sx[0];
    public static final float[] b = new float[91];
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final gt g = new gt(new pt(), false, -1571120048);
    public static final gt k = new gt(new qt(28), false, 314525284);
    public static final gt l = new gt(new qt(29), false, 837622684);
    public static final gt u = new gt(new qt(27), false, -510456984);
    public static final dg0 w = new dg0(7);
    public static final po0 x = new po0(false);
    public static final w40 y = new w40(13);

    static {
        final int i2 = 0;
        h = new gt(new qt(i2), false, -1455401925);
        int i3 = 23;
        i = new gt(new tt(i3), false, 580373182);
        int i4 = 26;
        j = new gt(new tt(i4), false, -1098441734);
        m = new gt(new jj0() { // from class: yt
            @Override // defpackage.jj0
            public final Object d(Object obj, Object obj2, Object obj3) {
                int i5 = i2;
                ll2 ll2Var = ll2.a;
                vy0 vy0Var = (vy0) obj;
                ak0 ak0Var = (ak0) obj2;
                Integer num = (Integer) obj3;
                switch (i5) {
                    case 0:
                        int iIntValue = num.intValue();
                        vy0Var.getClass();
                        if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                            ak0Var.R();
                        } else {
                            dv1.g(j02.r(R.string.settings_odometer, ak0Var), null, ak0Var, 0, 14);
                        }
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        vy0Var.getClass();
                        if (!ak0Var.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            ak0Var.R();
                        } else {
                            dv1.g(j02.r(R.string.settings_data, ak0Var), null, ak0Var, 0, 14);
                        }
                        break;
                }
                return ll2Var;
            }
        }, false, -278345442);
        final int i5 = 1;
        n = new gt(new jj0() { // from class: yt
            @Override // defpackage.jj0
            public final Object d(Object obj, Object obj2, Object obj3) {
                int i6 = i5;
                ll2 ll2Var = ll2.a;
                vy0 vy0Var = (vy0) obj;
                ak0 ak0Var = (ak0) obj2;
                Integer num = (Integer) obj3;
                switch (i6) {
                    case 0:
                        int iIntValue = num.intValue();
                        vy0Var.getClass();
                        if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                            ak0Var.R();
                        } else {
                            dv1.g(j02.r(R.string.settings_odometer, ak0Var), null, ak0Var, 0, 14);
                        }
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        vy0Var.getClass();
                        if (!ak0Var.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            ak0Var.R();
                        } else {
                            dv1.g(j02.r(R.string.settings_data, ak0Var), null, ak0Var, 0, 14);
                        }
                        break;
                }
                return ll2Var;
            }
        }, false, -1394313568);
        o = new gt(new qt(i3), false, 1784685602);
        int i6 = 24;
        p = new gt(new qt(i6), false, 1226701539);
        int i7 = 25;
        q = new gt(new qt(i7), false, -1414787807);
        r = new gt(new qt(i4), false, -1999559457);
        s = new gt(new tt(i6), false, -1983978566);
        t = new gt(new tt(i7), false, 2018602905);
        v = new gt(new qt(i5), false, 24351609);
        kr krVar = kr.l;
        z = krVar;
        A = 0.38f;
        B = krVar;
        C = 0.38f;
        D = krVar;
        E = 0.38f;
        F = krVar;
        kr krVar2 = kr.m;
        G = krVar2;
        H = 24.0f;
        I = krVar2;
        J = new StackTraceElement[0];
        K = krVar;
        L = krVar;
        M = 20.0f;
        N = kr.p;
        O = krVar2;
        P = new yr1(0.0f, 0.0f, 10.0f, 10.0f);
        Q = new pa0("NONE", i5);
        R = new pa0("PENDING", i5);
        S = new Object();
        T = new Object();
        U = new Object();
        V = new Object();
        W = new Object();
        X = new md0();
    }

    public static final Object A(Object obj) {
        return obj instanceof os ? ix.q(((os) obj).a) : obj;
    }

    public static final f31 B(int i2, int i3, ak0 ak0Var) {
        int i4 = 0;
        int i5 = 1;
        boolean z2 = (i3 & 4) != 0;
        Object systemService = ((Context) ak0Var.j(u5.b)).getSystemService("accessibility");
        systemService.getClass();
        Object obj = (AccessibilityManager) systemService;
        boolean z3 = ((((i2 & 896) ^ 384) > 256 && ak0Var.g(z2)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && ak0Var.g(true)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ak0Var.g(true)) || (i2 & 48) == 32);
        Object objL = ak0Var.L();
        Object obj2 = cv.a;
        if (z3 || objL == obj2) {
            objL = new f31(true, true, z2);
            ak0Var.g0(objL);
        }
        f31 f31Var = (f31) objL;
        y11 y11Var = (y11) ak0Var.j(j31.a);
        boolean zF = ak0Var.f(f31Var) | ak0Var.h(obj);
        Object objL2 = ak0Var.L();
        if (zF || objL2 == obj2) {
            objL2 = new d(i5, f31Var, obj);
            ak0Var.g0(objL2);
        }
        ej0 ej0Var = (ej0) objL2;
        boolean zF2 = ak0Var.f(f31Var) | ak0Var.h(obj);
        Object objL3 = ak0Var.L();
        if (zF2 || objL3 == obj2) {
            objL3 = new n1(i4, f31Var, obj);
            ak0Var.g0(objL3);
        }
        g(y11Var, ej0Var, (ti0) objL3, ak0Var, 0);
        return f31Var;
    }

    public static final void C(k1 k1Var, p02 p02Var) {
        Object objG = p02Var.k().e.g(u02.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            fu1.c();
            return;
        }
        p02 p02VarL = p02Var.l();
        if (p02VarL == null) {
            return;
        }
        Object objG2 = p02VarL.k().e.g(u02.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = p02VarL.k().e.g(u02.f);
            sq sqVar = (sq) (objG3 != null ? objG3 : null);
            if (sqVar == null || (sqVar.a >= 0 && sqVar.b >= 0)) {
                if (p02Var.k().e.c(u02.J)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = p02.j(4, p02VarL);
                    int size = listJ.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        p02 p02Var2 = (p02) listJ.get(i3);
                        if (p02Var2.k().e.c(u02.J)) {
                            arrayList.add(p02Var2);
                            if (p02Var2.c.v() < p02Var.c.v()) {
                                i2++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zI = i(arrayList);
                    int i4 = zI ? 0 : i2;
                    int i5 = zI ? i2 : 0;
                    Object objG4 = p02Var.k().e.g(u02.J);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    k1Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, 1, i5, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static final String D(sx sxVar) {
        Object ut1Var;
        if (sxVar instanceof p50) {
            return ((p50) sxVar).toString();
        }
        try {
            ut1Var = sxVar + '@' + s(sxVar);
        } catch (Throwable th) {
            ut1Var = new ut1(th);
        }
        if (vt1.a(ut1Var) != null) {
            ut1Var = sxVar.getClass().getName() + '@' + s(sxVar);
        }
        return (String) ut1Var;
    }

    public static final int E(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static float F() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static ob a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new ob(ir2.V, Float.valueOf(f2), new pb(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(boolean z2, ti0 ti0Var, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(-1339183247);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(ti0Var) ? 32 : 16;
        }
        int i4 = 1;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            s5.b(z2, ti0Var, ak0Var, i3 & 126);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eg(z2, ti0Var, i2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0111  */
    /* JADX WARN: Code duplicated, block: B:103:0x0114  */
    /* JADX WARN: Code duplicated, block: B:106:0x011d  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a  */
    /* JADX WARN: Code duplicated, block: B:121:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x014e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0154  */
    /* JADX WARN: Code duplicated, block: B:128:0x0163  */
    /* JADX WARN: Code duplicated, block: B:130:0x0171  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01da  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:156:0x0214  */
    /* JADX WARN: Code duplicated, block: B:158:0x0229  */
    /* JADX WARN: Code duplicated, block: B:161:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0246  */
    /* JADX WARN: Code duplicated, block: B:167:0x025e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0260  */
    /* JADX WARN: Code duplicated, block: B:176:0x0271  */
    /* JADX WARN: Code duplicated, block: B:177:0x0288  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:190:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x02da  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:203:0x030a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0311  */
    /* JADX WARN: Code duplicated, block: B:208:0x035b  */
    /* JADX WARN: Code duplicated, block: B:211:0x036a  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0102  */
    public static final void c(final ti0 ti0Var, final u71 u71Var, boolean z2, u32 u32Var, gl glVar, ll llVar, gj1 gj1Var, final jj0 jj0Var, ak0 ak0Var, final int i2, final int i3) {
        int i4;
        boolean z3;
        u32 u32VarA;
        gl glVar2;
        ll llVar2;
        int i5;
        int i6;
        gj1 gj1Var2;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        final gj1 gj1Var3;
        final boolean z6;
        final u32 u32Var2;
        final gl glVar3;
        final ll llVar3;
        lr1 lr1VarR;
        int i9;
        gl glVar4;
        ll llVar4;
        gj1 gj1Var4;
        int i10;
        boolean z7;
        gl glVar5;
        u32 u32Var3;
        jr jrVar;
        Object objL;
        Object obj;
        f91 f91Var;
        long j2;
        long j3;
        int i11;
        Object objL2;
        h72 h72Var;
        f91 f91Var2;
        boolean zF;
        Object objL3;
        tr0 tr0Var;
        float f2;
        Object objL4;
        ia iaVar;
        boolean zH;
        Object objL5;
        ll llVar5;
        ob obVar;
        float f3;
        Object objL6;
        int i12;
        ak0Var.X(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (ak0Var.h(ti0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & 384) == 0) {
                z3 = z2;
                i4 |= ak0Var.g(z3) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    u32VarA = u32Var;
                    int i14 = ak0Var.f(u32VarA) ? 2048 : 1024;
                    i4 |= i14;
                } else {
                    u32VarA = u32Var;
                }
                i4 |= i14;
            } else {
                u32VarA = u32Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    glVar2 = glVar;
                    int i15 = ak0Var.f(glVar2) ? 16384 : 8192;
                    i4 |= i15;
                } else {
                    glVar2 = glVar;
                }
                i4 |= i15;
            } else {
                glVar2 = glVar;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    llVar2 = llVar;
                    int i16 = ak0Var.f(llVar2) ? 131072 : 65536;
                    i4 |= i16;
                } else {
                    llVar2 = llVar;
                }
                i4 |= i16;
            } else {
                llVar2 = llVar;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (ak0Var.f(null)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i4 |= i5;
            }
            i6 = i3 & 128;
            if (i6 != 0) {
                if ((12582912 & i2) == 0) {
                    gj1Var2 = gj1Var;
                    if (ak0Var.f(gj1Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (ak0Var.f(null)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                if ((805306368 & i2) != 0) {
                    if (ak0Var.h(jj0Var)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                z4 = true;
                if ((i4 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ak0Var.O(i4 & 1, z5)) {
                    ak0Var.T();
                    i9 = -458753;
                    if ((i2 & 1) != 0 || ak0Var.y()) {
                        if (i13 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            kj1 kj1Var = hl.a;
                            i4 &= -7169;
                            u32VarA = j42.a(s5.e, ak0Var);
                        }
                        if ((i3 & 16) != 0) {
                            kj1 kj1Var2 = hl.a;
                            jrVar = (jr) ak0Var.j(lr.a);
                            glVar4 = jrVar.W;
                            if (glVar4 == null) {
                                glVar4 = new gl(lr.d(jrVar, nj2.f0), lr.d(jrVar, nj2.l0), dr.b(nj2.h0, lr.d(jrVar, nj2.g0)), dr.b(nj2.j0, lr.d(jrVar, nj2.i0)));
                                jrVar.W = glVar4;
                            }
                            i4 &= -57345;
                        } else {
                            i9 = -458753;
                            glVar4 = glVar2;
                        }
                        if ((i3 & 32) != 0) {
                            kj1 kj1Var3 = hl.a;
                            llVar4 = new ll(nj2.k0);
                            i4 &= i9;
                        } else {
                            llVar4 = llVar2;
                        }
                        if (i6 != 0) {
                            gj1Var4 = hl.a;
                        } else {
                            gj1Var4 = gj1Var;
                        }
                        boolean z8 = z3;
                        i10 = i4;
                        z7 = z8;
                        gj1Var2 = gj1Var4;
                        glVar5 = glVar4;
                        u32Var3 = u32VarA;
                        llVar2 = llVar4;
                    } else {
                        ak0Var.R();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        boolean z9 = z3;
                        i10 = i4;
                        z7 = z9;
                        u32Var3 = u32VarA;
                        glVar5 = glVar2;
                    }
                    ak0Var.q();
                    ak0Var.W(1691738187);
                    objL = ak0Var.L();
                    obj = cv.a;
                    if (objL == obj) {
                        objL = new f91();
                        ak0Var.g0(objL);
                    }
                    f91Var = (f91) objL;
                    ak0Var.p(false);
                    if (z7) {
                        j2 = glVar5.a;
                    } else {
                        j2 = glVar5.c;
                    }
                    if (z7) {
                        j3 = glVar5.b;
                    } else {
                        j3 = glVar5.d;
                    }
                    long j4 = j3;
                    if (llVar2 == null) {
                        ak0Var.W(1691921830);
                        ak0Var.p(false);
                        f91Var2 = f91Var;
                        glVar5 = glVar5;
                        u32Var3 = u32Var3;
                        llVar5 = llVar2;
                        obVar = null;
                    } else {
                        ak0Var.W(-499611205);
                        i11 = ((i10 >> 9) & 896) | ((i10 >> 6) & 14);
                        objL2 = ak0Var.L();
                        if (objL2 == obj) {
                            objL2 = new h72();
                            ak0Var.g0(objL2);
                        }
                        h72Var = (h72) objL2;
                        f91Var2 = f91Var;
                        zF = ak0Var.f(f91Var2);
                        objL3 = ak0Var.L();
                        if (zF || objL3 == obj) {
                            objL3 = new jl(f91Var2, h72Var, null, 0);
                            ak0Var.g0(objL3);
                        }
                        s5.o((ij0) objL3, ak0Var, f91Var2);
                        tr0Var = (tr0) vq.X(h72Var);
                        if (z7 || (tr0Var instanceof rp1) || !(tr0Var instanceof wn0)) {
                            f2 = 0.0f;
                        } else {
                            f2 = llVar2.a;
                        }
                        objL4 = ak0Var.L();
                        if (objL4 == obj) {
                            objL4 = new ia(new w60(f2), ir2.X, null, 12);
                            ak0Var.g0(objL4);
                        }
                        iaVar = (ia) objL4;
                        w60 w60Var = new w60(f2);
                        boolean zH2 = ak0Var.h(iaVar) | ak0Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ak0Var.g(z7)) || (i11 & 6) == 4);
                        if ((((i11 & 896) ^ 384) > 256 || !ak0Var.f(llVar2)) && (i11 & 384) != 256) {
                        }
                        zH = zH2 | z4 | ak0Var.h(tr0Var);
                        objL5 = ak0Var.L();
                        if (!zH || objL5 == obj) {
                            llVar5 = llVar2;
                            objL5 = new kl(iaVar, f2, z7, llVar5, tr0Var, null, 0);
                            ak0Var.g0(objL5);
                        } else {
                            llVar5 = llVar2;
                        }
                        s5.o((ij0) objL5, ak0Var, w60Var);
                        obVar = iaVar.c;
                        ak0Var.p(false);
                    }
                    if (obVar != null) {
                        f3 = ((w60) obVar.f.getValue()).e;
                    } else {
                        f3 = 0.0f;
                    }
                    objL6 = ak0Var.L();
                    if (objL6 == obj) {
                        objL6 = new s1(12);
                        ak0Var.g0(objL6);
                    }
                    gj1 gj1Var5 = gj1Var2;
                    u32 u32Var4 = u32Var3;
                    ra2.c(ti0Var, l02.a(u71Var, false, (ej0) objL6), z7, u32Var4, j2, j4, 0.0f, f3, f91Var2, vs0.C(-535639973, new nl(j4, gj1Var5, jj0Var, 0), ak0Var), ak0Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
                    z6 = z7;
                    u32Var2 = u32Var4;
                    gj1Var3 = gj1Var5;
                    llVar3 = llVar5;
                    glVar3 = glVar5;
                } else {
                    ak0Var.R();
                    gj1Var3 = gj1Var;
                    z6 = z3;
                    u32Var2 = u32VarA;
                    glVar3 = glVar2;
                    llVar3 = llVar2;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ml
                        @Override // defpackage.ij0
                        public final Object g(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            j20.c(ti0Var, u71Var, z6, u32Var2, glVar3, llVar3, gj1Var3, jj0Var, (ak0) obj2, ei1.P(i2 | 1), i3);
                            return ll2.a;
                        }
                    };
                }
            }
            i4 |= 12582912;
            gj1Var2 = gj1Var;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (ak0Var.f(null)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((805306368 & i2) != 0) {
                if (ak0Var.h(jj0Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            z4 = true;
            if ((i4 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ak0Var.O(i4 & 1, z5)) {
                ak0Var.T();
                i9 = -458753;
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        kj1 kj1Var4 = hl.a;
                        i4 &= -7169;
                        u32VarA = j42.a(s5.e, ak0Var);
                    }
                    if ((i3 & 16) != 0) {
                        kj1 kj1Var5 = hl.a;
                        jrVar = (jr) ak0Var.j(lr.a);
                        glVar4 = jrVar.W;
                        if (glVar4 == null) {
                            glVar4 = new gl(lr.d(jrVar, nj2.f0), lr.d(jrVar, nj2.l0), dr.b(nj2.h0, lr.d(jrVar, nj2.g0)), dr.b(nj2.j0, lr.d(jrVar, nj2.i0)));
                            jrVar.W = glVar4;
                        }
                        i4 &= -57345;
                    } else {
                        i9 = -458753;
                        glVar4 = glVar2;
                    }
                    if ((i3 & 32) != 0) {
                        kj1 kj1Var6 = hl.a;
                        llVar4 = new ll(nj2.k0);
                        i4 &= i9;
                    } else {
                        llVar4 = llVar2;
                    }
                    if (i6 != 0) {
                        gj1Var4 = hl.a;
                    } else {
                        gj1Var4 = gj1Var;
                    }
                    boolean z10 = z3;
                    i10 = i4;
                    z7 = z10;
                    gj1Var2 = gj1Var4;
                    glVar5 = glVar4;
                    u32Var3 = u32VarA;
                    llVar2 = llVar4;
                } else {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        kj1 kj1Var7 = hl.a;
                        i4 &= -7169;
                        u32VarA = j42.a(s5.e, ak0Var);
                    }
                    if ((i3 & 16) != 0) {
                        kj1 kj1Var8 = hl.a;
                        jrVar = (jr) ak0Var.j(lr.a);
                        glVar4 = jrVar.W;
                        if (glVar4 == null) {
                            glVar4 = new gl(lr.d(jrVar, nj2.f0), lr.d(jrVar, nj2.l0), dr.b(nj2.h0, lr.d(jrVar, nj2.g0)), dr.b(nj2.j0, lr.d(jrVar, nj2.i0)));
                            jrVar.W = glVar4;
                        }
                        i4 &= -57345;
                    } else {
                        i9 = -458753;
                        glVar4 = glVar2;
                    }
                    if ((i3 & 32) != 0) {
                        kj1 kj1Var9 = hl.a;
                        llVar4 = new ll(nj2.k0);
                        i4 &= i9;
                    } else {
                        llVar4 = llVar2;
                    }
                    if (i6 != 0) {
                        gj1Var4 = hl.a;
                    } else {
                        gj1Var4 = gj1Var;
                    }
                    boolean z11 = z3;
                    i10 = i4;
                    z7 = z11;
                    gj1Var2 = gj1Var4;
                    glVar5 = glVar4;
                    u32Var3 = u32VarA;
                    llVar2 = llVar4;
                }
                ak0Var.q();
                ak0Var.W(1691738187);
                objL = ak0Var.L();
                obj = cv.a;
                if (objL == obj) {
                    objL = new f91();
                    ak0Var.g0(objL);
                }
                f91Var = (f91) objL;
                ak0Var.p(false);
                if (z7) {
                    j2 = glVar5.a;
                } else {
                    j2 = glVar5.c;
                }
                if (z7) {
                    j3 = glVar5.b;
                } else {
                    j3 = glVar5.d;
                }
                long j5 = j3;
                if (llVar2 == null) {
                    ak0Var.W(1691921830);
                    ak0Var.p(false);
                    f91Var2 = f91Var;
                    glVar5 = glVar5;
                    u32Var3 = u32Var3;
                    llVar5 = llVar2;
                    obVar = null;
                } else {
                    ak0Var.W(-499611205);
                    i11 = ((i10 >> 9) & 896) | ((i10 >> 6) & 14);
                    objL2 = ak0Var.L();
                    if (objL2 == obj) {
                        objL2 = new h72();
                        ak0Var.g0(objL2);
                    }
                    h72Var = (h72) objL2;
                    f91Var2 = f91Var;
                    zF = ak0Var.f(f91Var2);
                    objL3 = ak0Var.L();
                    if (zF) {
                        objL3 = new jl(f91Var2, h72Var, null, 0);
                        ak0Var.g0(objL3);
                    } else {
                        objL3 = new jl(f91Var2, h72Var, null, 0);
                        ak0Var.g0(objL3);
                    }
                    s5.o((ij0) objL3, ak0Var, f91Var2);
                    tr0Var = (tr0) vq.X(h72Var);
                    if (z7) {
                        f2 = 0.0f;
                    } else {
                        f2 = llVar2.a;
                    }
                    objL4 = ak0Var.L();
                    if (objL4 == obj) {
                        objL4 = new ia(new w60(f2), ir2.X, null, 12);
                        ak0Var.g0(objL4);
                    }
                    iaVar = (ia) objL4;
                    w60 w60Var2 = new w60(f2);
                    boolean zH3 = ak0Var.h(iaVar) | ak0Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ak0Var.g(z7)) || (i11 & 6) == 4);
                    z4 = ((i11 & 896) ^ 384) > 256 ? false : false;
                    zH = zH3 | z4 | ak0Var.h(tr0Var);
                    objL5 = ak0Var.L();
                    if (zH) {
                        llVar5 = llVar2;
                        objL5 = new kl(iaVar, f2, z7, llVar5, tr0Var, null, 0);
                        ak0Var.g0(objL5);
                    } else {
                        llVar5 = llVar2;
                        objL5 = new kl(iaVar, f2, z7, llVar5, tr0Var, null, 0);
                        ak0Var.g0(objL5);
                    }
                    s5.o((ij0) objL5, ak0Var, w60Var2);
                    obVar = iaVar.c;
                    ak0Var.p(false);
                }
                if (obVar != null) {
                    f3 = ((w60) obVar.f.getValue()).e;
                } else {
                    f3 = 0.0f;
                }
                objL6 = ak0Var.L();
                if (objL6 == obj) {
                    objL6 = new s1(12);
                    ak0Var.g0(objL6);
                }
                gj1 gj1Var6 = gj1Var2;
                u32 u32Var5 = u32Var3;
                ra2.c(ti0Var, l02.a(u71Var, false, (ej0) objL6), z7, u32Var5, j2, j5, 0.0f, f3, f91Var2, vs0.C(-535639973, new nl(j5, gj1Var6, jj0Var, 0), ak0Var), ak0Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
                z6 = z7;
                u32Var2 = u32Var5;
                gj1Var3 = gj1Var6;
                llVar3 = llVar5;
                glVar3 = glVar5;
            } else {
                ak0Var.R();
                gj1Var3 = gj1Var;
                z6 = z3;
                u32Var2 = u32VarA;
                glVar3 = glVar2;
                llVar3 = llVar2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ml
                    @Override // defpackage.ij0
                    public final Object g(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        j20.c(ti0Var, u71Var, z6, u32Var2, glVar3, llVar3, gj1Var3, jj0Var, (ak0) obj2, ei1.P(i2 | 1), i3);
                        return ll2.a;
                    }
                };
            }
        }
        i4 |= 384;
        z3 = z2;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                u32VarA = u32Var;
                if (ak0Var.f(u32VarA)) {
                }
                i4 |= i14;
            } else {
                u32VarA = u32Var;
            }
            i4 |= i14;
        } else {
            u32VarA = u32Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                glVar2 = glVar;
                if (ak0Var.f(glVar2)) {
                }
                i4 |= i15;
            } else {
                glVar2 = glVar;
            }
            i4 |= i15;
        } else {
            glVar2 = glVar;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                llVar2 = llVar;
                if (ak0Var.f(llVar2)) {
                }
                i4 |= i16;
            } else {
                llVar2 = llVar;
            }
            i4 |= i16;
        } else {
            llVar2 = llVar;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (ak0Var.f(null)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        i6 = i3 & 128;
        if (i6 != 0) {
            if ((12582912 & i2) == 0) {
                gj1Var2 = gj1Var;
                if (ak0Var.f(gj1Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (ak0Var.f(null)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((805306368 & i2) != 0) {
                if (ak0Var.h(jj0Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            z4 = true;
            if ((i4 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ak0Var.O(i4 & 1, z5)) {
                ak0Var.T();
                i9 = -458753;
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        kj1 kj1Var10 = hl.a;
                        i4 &= -7169;
                        u32VarA = j42.a(s5.e, ak0Var);
                    }
                    if ((i3 & 16) != 0) {
                        kj1 kj1Var11 = hl.a;
                        jrVar = (jr) ak0Var.j(lr.a);
                        glVar4 = jrVar.W;
                        if (glVar4 == null) {
                            glVar4 = new gl(lr.d(jrVar, nj2.f0), lr.d(jrVar, nj2.l0), dr.b(nj2.h0, lr.d(jrVar, nj2.g0)), dr.b(nj2.j0, lr.d(jrVar, nj2.i0)));
                            jrVar.W = glVar4;
                        }
                        i4 &= -57345;
                    } else {
                        i9 = -458753;
                        glVar4 = glVar2;
                    }
                    if ((i3 & 32) != 0) {
                        kj1 kj1Var12 = hl.a;
                        llVar4 = new ll(nj2.k0);
                        i4 &= i9;
                    } else {
                        llVar4 = llVar2;
                    }
                    if (i6 != 0) {
                        gj1Var4 = hl.a;
                    } else {
                        gj1Var4 = gj1Var;
                    }
                    boolean z12 = z3;
                    i10 = i4;
                    z7 = z12;
                    gj1Var2 = gj1Var4;
                    glVar5 = glVar4;
                    u32Var3 = u32VarA;
                    llVar2 = llVar4;
                } else {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        kj1 kj1Var13 = hl.a;
                        i4 &= -7169;
                        u32VarA = j42.a(s5.e, ak0Var);
                    }
                    if ((i3 & 16) != 0) {
                        kj1 kj1Var14 = hl.a;
                        jrVar = (jr) ak0Var.j(lr.a);
                        glVar4 = jrVar.W;
                        if (glVar4 == null) {
                            glVar4 = new gl(lr.d(jrVar, nj2.f0), lr.d(jrVar, nj2.l0), dr.b(nj2.h0, lr.d(jrVar, nj2.g0)), dr.b(nj2.j0, lr.d(jrVar, nj2.i0)));
                            jrVar.W = glVar4;
                        }
                        i4 &= -57345;
                    } else {
                        i9 = -458753;
                        glVar4 = glVar2;
                    }
                    if ((i3 & 32) != 0) {
                        kj1 kj1Var15 = hl.a;
                        llVar4 = new ll(nj2.k0);
                        i4 &= i9;
                    } else {
                        llVar4 = llVar2;
                    }
                    if (i6 != 0) {
                        gj1Var4 = hl.a;
                    } else {
                        gj1Var4 = gj1Var;
                    }
                    boolean z13 = z3;
                    i10 = i4;
                    z7 = z13;
                    gj1Var2 = gj1Var4;
                    glVar5 = glVar4;
                    u32Var3 = u32VarA;
                    llVar2 = llVar4;
                }
                ak0Var.q();
                ak0Var.W(1691738187);
                objL = ak0Var.L();
                obj = cv.a;
                if (objL == obj) {
                    objL = new f91();
                    ak0Var.g0(objL);
                }
                f91Var = (f91) objL;
                ak0Var.p(false);
                if (z7) {
                    j2 = glVar5.a;
                } else {
                    j2 = glVar5.c;
                }
                if (z7) {
                    j3 = glVar5.b;
                } else {
                    j3 = glVar5.d;
                }
                long j6 = j3;
                if (llVar2 == null) {
                    ak0Var.W(1691921830);
                    ak0Var.p(false);
                    f91Var2 = f91Var;
                    glVar5 = glVar5;
                    u32Var3 = u32Var3;
                    llVar5 = llVar2;
                    obVar = null;
                } else {
                    ak0Var.W(-499611205);
                    i11 = ((i10 >> 9) & 896) | ((i10 >> 6) & 14);
                    objL2 = ak0Var.L();
                    if (objL2 == obj) {
                        objL2 = new h72();
                        ak0Var.g0(objL2);
                    }
                    h72Var = (h72) objL2;
                    f91Var2 = f91Var;
                    zF = ak0Var.f(f91Var2);
                    objL3 = ak0Var.L();
                    if (zF) {
                        objL3 = new jl(f91Var2, h72Var, null, 0);
                        ak0Var.g0(objL3);
                    } else {
                        objL3 = new jl(f91Var2, h72Var, null, 0);
                        ak0Var.g0(objL3);
                    }
                    s5.o((ij0) objL3, ak0Var, f91Var2);
                    tr0Var = (tr0) vq.X(h72Var);
                    if (z7) {
                        f2 = 0.0f;
                    } else {
                        f2 = llVar2.a;
                    }
                    objL4 = ak0Var.L();
                    if (objL4 == obj) {
                        objL4 = new ia(new w60(f2), ir2.X, null, 12);
                        ak0Var.g0(objL4);
                    }
                    iaVar = (ia) objL4;
                    w60 w60Var3 = new w60(f2);
                    boolean zH4 = ak0Var.h(iaVar) | ak0Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ak0Var.g(z7)) || (i11 & 6) == 4);
                    if (((i11 & 896) ^ 384) > 256) {
                    }
                    zH = zH4 | z4 | ak0Var.h(tr0Var);
                    objL5 = ak0Var.L();
                    if (zH) {
                        llVar5 = llVar2;
                        objL5 = new kl(iaVar, f2, z7, llVar5, tr0Var, null, 0);
                        ak0Var.g0(objL5);
                    } else {
                        llVar5 = llVar2;
                        objL5 = new kl(iaVar, f2, z7, llVar5, tr0Var, null, 0);
                        ak0Var.g0(objL5);
                    }
                    s5.o((ij0) objL5, ak0Var, w60Var3);
                    obVar = iaVar.c;
                    ak0Var.p(false);
                }
                if (obVar != null) {
                    f3 = ((w60) obVar.f.getValue()).e;
                } else {
                    f3 = 0.0f;
                }
                objL6 = ak0Var.L();
                if (objL6 == obj) {
                    objL6 = new s1(12);
                    ak0Var.g0(objL6);
                }
                gj1 gj1Var7 = gj1Var2;
                u32 u32Var6 = u32Var3;
                ra2.c(ti0Var, l02.a(u71Var, false, (ej0) objL6), z7, u32Var6, j2, j6, 0.0f, f3, f91Var2, vs0.C(-535639973, new nl(j6, gj1Var7, jj0Var, 0), ak0Var), ak0Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
                z6 = z7;
                u32Var2 = u32Var6;
                gj1Var3 = gj1Var7;
                llVar3 = llVar5;
                glVar3 = glVar5;
            } else {
                ak0Var.R();
                gj1Var3 = gj1Var;
                z6 = z3;
                u32Var2 = u32VarA;
                glVar3 = glVar2;
                llVar3 = llVar2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ml
                    @Override // defpackage.ij0
                    public final Object g(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        j20.c(ti0Var, u71Var, z6, u32Var2, glVar3, llVar3, gj1Var3, jj0Var, (ak0) obj2, ei1.P(i2 | 1), i3);
                        return ll2.a;
                    }
                };
            }
        }
        i4 |= 12582912;
        gj1Var2 = gj1Var;
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (ak0Var.f(null)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        if ((805306368 & i2) != 0) {
            if (ak0Var.h(jj0Var)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        z4 = true;
        if ((i4 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (ak0Var.O(i4 & 1, z5)) {
            ak0Var.T();
            i9 = -458753;
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    kj1 kj1Var16 = hl.a;
                    i4 &= -7169;
                    u32VarA = j42.a(s5.e, ak0Var);
                }
                if ((i3 & 16) != 0) {
                    kj1 kj1Var17 = hl.a;
                    jrVar = (jr) ak0Var.j(lr.a);
                    glVar4 = jrVar.W;
                    if (glVar4 == null) {
                        glVar4 = new gl(lr.d(jrVar, nj2.f0), lr.d(jrVar, nj2.l0), dr.b(nj2.h0, lr.d(jrVar, nj2.g0)), dr.b(nj2.j0, lr.d(jrVar, nj2.i0)));
                        jrVar.W = glVar4;
                    }
                    i4 &= -57345;
                } else {
                    i9 = -458753;
                    glVar4 = glVar2;
                }
                if ((i3 & 32) != 0) {
                    kj1 kj1Var18 = hl.a;
                    llVar4 = new ll(nj2.k0);
                    i4 &= i9;
                } else {
                    llVar4 = llVar2;
                }
                if (i6 != 0) {
                    gj1Var4 = hl.a;
                } else {
                    gj1Var4 = gj1Var;
                }
                boolean z14 = z3;
                i10 = i4;
                z7 = z14;
                gj1Var2 = gj1Var4;
                glVar5 = glVar4;
                u32Var3 = u32VarA;
                llVar2 = llVar4;
            } else {
                if (i13 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    kj1 kj1Var19 = hl.a;
                    i4 &= -7169;
                    u32VarA = j42.a(s5.e, ak0Var);
                }
                if ((i3 & 16) != 0) {
                    kj1 kj1Var110 = hl.a;
                    jrVar = (jr) ak0Var.j(lr.a);
                    glVar4 = jrVar.W;
                    if (glVar4 == null) {
                        glVar4 = new gl(lr.d(jrVar, nj2.f0), lr.d(jrVar, nj2.l0), dr.b(nj2.h0, lr.d(jrVar, nj2.g0)), dr.b(nj2.j0, lr.d(jrVar, nj2.i0)));
                        jrVar.W = glVar4;
                    }
                    i4 &= -57345;
                } else {
                    i9 = -458753;
                    glVar4 = glVar2;
                }
                if ((i3 & 32) != 0) {
                    kj1 kj1Var111 = hl.a;
                    llVar4 = new ll(nj2.k0);
                    i4 &= i9;
                } else {
                    llVar4 = llVar2;
                }
                if (i6 != 0) {
                    gj1Var4 = hl.a;
                } else {
                    gj1Var4 = gj1Var;
                }
                boolean z15 = z3;
                i10 = i4;
                z7 = z15;
                gj1Var2 = gj1Var4;
                glVar5 = glVar4;
                u32Var3 = u32VarA;
                llVar2 = llVar4;
            }
            ak0Var.q();
            ak0Var.W(1691738187);
            objL = ak0Var.L();
            obj = cv.a;
            if (objL == obj) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91Var = (f91) objL;
            ak0Var.p(false);
            if (z7) {
                j2 = glVar5.a;
            } else {
                j2 = glVar5.c;
            }
            if (z7) {
                j3 = glVar5.b;
            } else {
                j3 = glVar5.d;
            }
            long j7 = j3;
            if (llVar2 == null) {
                ak0Var.W(1691921830);
                ak0Var.p(false);
                f91Var2 = f91Var;
                glVar5 = glVar5;
                u32Var3 = u32Var3;
                llVar5 = llVar2;
                obVar = null;
            } else {
                ak0Var.W(-499611205);
                i11 = ((i10 >> 9) & 896) | ((i10 >> 6) & 14);
                objL2 = ak0Var.L();
                if (objL2 == obj) {
                    objL2 = new h72();
                    ak0Var.g0(objL2);
                }
                h72Var = (h72) objL2;
                f91Var2 = f91Var;
                zF = ak0Var.f(f91Var2);
                objL3 = ak0Var.L();
                if (zF) {
                    objL3 = new jl(f91Var2, h72Var, null, 0);
                    ak0Var.g0(objL3);
                } else {
                    objL3 = new jl(f91Var2, h72Var, null, 0);
                    ak0Var.g0(objL3);
                }
                s5.o((ij0) objL3, ak0Var, f91Var2);
                tr0Var = (tr0) vq.X(h72Var);
                if (z7) {
                    f2 = 0.0f;
                } else {
                    f2 = llVar2.a;
                }
                objL4 = ak0Var.L();
                if (objL4 == obj) {
                    objL4 = new ia(new w60(f2), ir2.X, null, 12);
                    ak0Var.g0(objL4);
                }
                iaVar = (ia) objL4;
                w60 w60Var4 = new w60(f2);
                boolean zH5 = ak0Var.h(iaVar) | ak0Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ak0Var.g(z7)) || (i11 & 6) == 4);
                if (((i11 & 896) ^ 384) > 256) {
                }
                zH = zH5 | z4 | ak0Var.h(tr0Var);
                objL5 = ak0Var.L();
                if (zH) {
                    llVar5 = llVar2;
                    objL5 = new kl(iaVar, f2, z7, llVar5, tr0Var, null, 0);
                    ak0Var.g0(objL5);
                } else {
                    llVar5 = llVar2;
                    objL5 = new kl(iaVar, f2, z7, llVar5, tr0Var, null, 0);
                    ak0Var.g0(objL5);
                }
                s5.o((ij0) objL5, ak0Var, w60Var4);
                obVar = iaVar.c;
                ak0Var.p(false);
            }
            if (obVar != null) {
                f3 = ((w60) obVar.f.getValue()).e;
            } else {
                f3 = 0.0f;
            }
            objL6 = ak0Var.L();
            if (objL6 == obj) {
                objL6 = new s1(12);
                ak0Var.g0(objL6);
            }
            gj1 gj1Var8 = gj1Var2;
            u32 u32Var7 = u32Var3;
            ra2.c(ti0Var, l02.a(u71Var, false, (ej0) objL6), z7, u32Var7, j2, j7, 0.0f, f3, f91Var2, vs0.C(-535639973, new nl(j7, gj1Var8, jj0Var, 0), ak0Var), ak0Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
            z6 = z7;
            u32Var2 = u32Var7;
            gj1Var3 = gj1Var8;
            llVar3 = llVar5;
            glVar3 = glVar5;
        } else {
            ak0Var.R();
            gj1Var3 = gj1Var;
            z6 = z3;
            u32Var2 = u32VarA;
            glVar3 = glVar2;
            llVar3 = llVar2;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ml
                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    j20.c(ti0Var, u71Var, z6, u32Var2, glVar3, llVar3, gj1Var3, jj0Var, (ak0) obj2, ei1.P(i2 | 1), i3);
                    return ll2.a;
                }
            };
        }
    }

    public static final void d(final ti0 ti0Var, u71 u71Var, boolean z2, co0 co0Var, u32 u32Var, final ij0 ij0Var, ak0 ak0Var, final int i2, final int i3) {
        int i4;
        final u71 u71Var2;
        int i5;
        boolean z3;
        int i6;
        final u32 u32Var2;
        final boolean z4;
        final co0 co0Var2;
        int i7;
        co0 co0Var3;
        u32 u32VarA;
        int i8;
        u71 u71Var3;
        co0 co0Var4;
        boolean z5;
        ak0Var.X(1413012038);
        if ((i2 & 6) == 0) {
            i4 = i2 | (ak0Var.h(ti0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 = i4 | 48;
            u71Var2 = u71Var;
        } else {
            u71Var2 = u71Var;
            i5 = i4 | (ak0Var.f(u71Var2) ? 32 : 16);
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i6 = i5 | 384;
            z3 = z2;
        } else {
            z3 = z2;
            i6 = i5 | (ak0Var.g(z3) ? 256 : 128);
        }
        int i11 = i6 | 91136;
        if (ak0Var.O(i11 & 1, (599187 & i11) != 599186)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                u71 u71Var4 = i9 != 0 ? r71.a : u71Var2;
                boolean z6 = i10 == 0 ? z3 : true;
                long j2 = ((dr) ak0Var.j(yw.a)).a;
                jr jrVar = (jr) ak0Var.j(lr.a);
                co0 co0Var5 = jrVar.c0;
                if (co0Var5 == null) {
                    long j3 = dr.f;
                    co0 co0Var6 = new co0(j3, j2, j3, dr.b(0.38f, j2));
                    jrVar.c0 = co0Var6;
                    co0Var5 = co0Var6;
                }
                long j4 = co0Var5.b;
                if (vk2.a(j4, j2)) {
                    co0Var3 = co0Var5;
                    i7 = -465921;
                } else {
                    long jB = dr.b(0.38f, j2);
                    long j5 = co0Var5.a;
                    i7 = -465921;
                    long j6 = co0Var5.c;
                    if (j2 == 16) {
                        j2 = j4;
                    }
                    co0Var3 = new co0(j5, j2, j6, jB != 16 ? jB : co0Var5.d);
                }
                u32VarA = j42.a(p61.E, ak0Var);
                i8 = i11 & i7;
                u71Var3 = u71Var4;
                co0Var4 = co0Var3;
                z5 = z6;
            } else {
                ak0Var.R();
                co0Var4 = co0Var;
                z5 = z3;
                i8 = i11 & (-465921);
                u71Var3 = u71Var2;
                u32VarA = u32Var;
            }
            ak0Var.q();
            e(u71Var3, ti0Var, z5, u32VarA, co0Var4, ij0Var, ak0Var, 1769472 | (i8 & 896) | ((i8 >> 3) & 14) | ((i8 << 3) & 112));
            u32Var2 = u32VarA;
            co0Var2 = co0Var4;
            u71Var2 = u71Var3;
            z4 = z5;
        } else {
            ak0Var.R();
            u32Var2 = u32Var;
            z4 = z3;
            co0Var2 = co0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: do0
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j20.d(ti0Var, u71Var2, z4, co0Var2, u32Var2, ij0Var, (ak0) obj, ei1.P(i2 | 1), i3);
                    return ll2.a;
                }
            };
        }
    }

    public static final void e(u71 u71Var, ti0 ti0Var, boolean z2, u32 u32Var, co0 co0Var, ij0 ij0Var, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(ti0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.f(u32Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ak0Var.f(co0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ak0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ak0Var.h(ij0Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (ak0Var.O(i4 & 1, (599187 & i4) != 599186)) {
            ak0Var.W(977045485);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            on0 on0Var = yr0.a;
            u71 u71VarC = u71Var.c(o71.a);
            float f2 = p61.F;
            long jA = mx.a(p61.G + f2 + f2, 40.0f);
            gd0 gd0Var = f52.a;
            u71 u71VarR = sv0.R(sv0.S(p61.s(nj2.k(f52.k(u71VarC, z60.b(jA), z60.a(jA)), u32Var), z2 ? co0Var.a : co0Var.c, u32Var), f91Var, tu1.a(false, 0.0f, 7), z2, new wu1(0), ti0Var, 8));
            w61 w61VarC = xj.c(q90.j, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarR);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            sv.a(yw.a.a(new dr(z2 ? co0Var.b : co0Var.d)), ij0Var, ak0Var, ((i4 >> 15) & 112) | 8);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new gi(u71Var, ti0Var, z2, u32Var, co0Var, ij0Var, i2);
        }
    }

    public static final s82 f(Object obj) {
        if (obj == null) {
            obj = s5.J;
        }
        return new s82(obj);
    }

    public static final void g(y11 y11Var, ej0 ej0Var, ti0 ti0Var, ak0 ak0Var, int i2) {
        ak0Var.X(-1868327245);
        int i3 = (ak0Var.h(y11Var) ? 4 : 2) | i2 | (ak0Var.h(ej0Var) ? 32 : 16) | (ak0Var.h(ti0Var) ? 256 : 128);
        int i4 = 0;
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = ((i3 & 112) == 32) | ak0Var.h(y11Var) | ((i3 & 896) == 256);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new o1(y11Var, ej0Var, ti0Var, i4);
                ak0Var.g0(objL);
            }
            s5.e(y11Var, (ej0) objL, ak0Var);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(y11Var, ej0Var, ti0Var, i2, 0);
        }
    }

    public static final void h(ti0 ti0Var, u71 u71Var, boolean z2, u32 u32Var, gl glVar, gj1 gj1Var, jj0 jj0Var, ak0 ak0Var, int i2, int i3) {
        int i4;
        gl glVar2;
        boolean z3;
        u32 u32Var2;
        gj1 gj1Var2;
        gl glVar3;
        u71 u71Var2;
        gl glVarA;
        gl glVar4;
        u32 u32Var3;
        boolean z4;
        u71 u71Var3;
        ak0Var.X(-1061374109);
        if ((i2 & 6) == 0) {
            i4 = (ak0Var.h(ti0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        int i6 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i6 |= ((i3 & 8) == 0 && ak0Var.f(u32Var)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                glVar2 = glVar;
                int i7 = ak0Var.f(glVar2) ? 16384 : 8192;
                i6 |= i7;
            } else {
                glVar2 = glVar;
            }
            i6 |= i7;
        } else {
            glVar2 = glVar;
        }
        if ((i3 & 32) != 0) {
            i6 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i6 |= ak0Var.f(null) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i6 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i6 |= ak0Var.f(null) ? 1048576 : 524288;
        }
        int i8 = i6 | 113246208;
        if ((805306368 & i2) == 0) {
            i8 |= ak0Var.h(jj0Var) ? 536870912 : 268435456;
        }
        if (ak0Var.O(i8 & 1, (306783379 & i8) != 306783378)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                if (i5 != 0) {
                    u71Var = r71.a;
                }
                if ((i3 & 8) != 0) {
                    kj1 kj1Var = hl.a;
                    u32Var = j42.a(s5.e, ak0Var);
                    i8 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    kj1 kj1Var2 = hl.a;
                    glVarA = hl.a((jr) ak0Var.j(lr.a));
                    i8 &= -57345;
                } else {
                    glVarA = glVar2;
                }
                glVar4 = glVarA;
                u32Var3 = u32Var;
                gj1Var2 = hl.b;
                z4 = true;
                u71Var3 = u71Var;
            } else {
                ak0Var.R();
                if ((i3 & 8) != 0) {
                    i8 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i8 &= -57345;
                }
                u71Var3 = u71Var;
                u32Var3 = u32Var;
                gj1Var2 = gj1Var;
                glVar4 = glVar2;
                z4 = z2;
            }
            ak0Var.q();
            c(ti0Var, u71Var3, z4, u32Var3, glVar4, null, gj1Var2, jj0Var, ak0Var, i8 & 2147483646, 0);
            glVar3 = glVar4;
            u32Var2 = u32Var3;
            z3 = z4;
            u71Var2 = u71Var3;
        } else {
            ak0Var.R();
            z3 = z2;
            u32Var2 = u32Var;
            gj1Var2 = gj1Var;
            glVar3 = glVar2;
            u71Var2 = u71Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new r7(ti0Var, u71Var2, z3, u32Var2, glVar3, gj1Var2, jj0Var, i2, i3);
        }
    }

    public static final boolean i(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = cb0.e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    p02 p02Var = (p02) obj2;
                    p02 p02Var2 = (p02) obj;
                    arrayList2.add(new uf1((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (p02Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (p02Var.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (p02Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (p02Var.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((uf1) vq.Q(list)).a;
            } else {
                if (list.isEmpty()) {
                    c31.c("Empty collection can't be reduced.");
                }
                Object objQ = vq.Q(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objQ = new uf1(uf1.e(((uf1) objQ).a, ((uf1) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((uf1) objQ).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void j(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder sbM = k3.m(i2, "radix ", " was not in valid range ");
            sbM.append(new lr0(2, 36, 1));
            throw new IllegalArgumentException(sbM.toString());
        }
    }

    public static ob k(ob obVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) obVar.f.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((pb) obVar.g).a;
        }
        return new ob(obVar.e, Float.valueOf(f2), new pb(f3), obVar.h, obVar.i, obVar.j);
    }

    public static final pe0 l(pe0 pe0Var) {
        return ((pe0Var instanceof q82) || (pe0Var instanceof k60)) ? pe0Var : new k60(pe0Var);
    }

    public static final void m(t81 t81Var, sm smVar, rk rkVar, float f2, q32 q32Var, ed2 ed2Var, m80 m80Var) {
        ArrayList arrayList = t81Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sj1 sj1Var = (sj1) arrayList.get(i2);
            sj1Var.a.g(smVar, rkVar, f2, q32Var, ed2Var, m80Var);
            smVar.f(0.0f, sj1Var.a.b());
        }
    }

    public static final boolean n(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final d91 o(t02 t02Var, ej0 ej0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            p02 p02VarA = t02Var.a();
            ax0 ax0Var = p02VarA.c;
            if (ax0Var.I() && ax0Var.H()) {
                yr1 yr1VarG = p02VarA.g();
                d91 d91Var = new d91(48);
                qk1 qk1Var = new qk1(6);
                qk1Var.F(qx.Y(yr1VarG));
                r(ej0Var, d91Var, new qk1(6), qk1Var, p02VarA, p02VarA);
                return d91Var;
            }
            d91 d91Var2 = hr0.a;
            d91Var2.getClass();
            return d91Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void p(ej0 ej0Var, d91 d91Var, qk1 qk1Var, qk1 qk1Var2, p02 p02Var, p02 p02Var2) {
        qk1 qk1Var3 = qk1Var;
        Region region = (Region) qk1Var3.f;
        qk1 qk1Var4 = qk1Var2;
        Region region2 = (Region) qk1Var4.f;
        ax0 ax0Var = p02Var2.c;
        ax0 ax0Var2 = p02Var2.c;
        if (!ax0Var.I() || !ax0Var2.H() || region2.isEmpty()) {
            if (p02Var2.n()) {
                q(d91Var, p02Var, p02Var2);
                return;
            }
            return;
        }
        yr1 yr1VarM = p02Var2.m();
        if (yr1VarM.f()) {
            Object objF = p02Var2.f();
            if (objF == null) {
                bq0 bq0Var = ax0Var2.I.c;
                yr1VarM = sv.A(bq0Var).K(bq0Var, false);
            } else {
                t71 t71Var = ((t71) objF).e;
                Object objG = p02Var2.d.e.g(h02.b);
                if (objG == null) {
                    objG = null;
                }
                yr1VarM = n02.i(t71Var, objG != null, false);
            }
        }
        mr0 mr0VarY = qx.Y(yr1VarM);
        qk1Var3.F(mr0VarY);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = p02Var2.f;
            if (i2 == p02Var.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            d91Var.h(i2, new s02(p02Var2, new mr0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listJ = p02.j(4, p02Var2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) ej0Var.h(listJ.get(size))).booleanValue()) {
                    p(ej0Var, d91Var, qk1Var3, qk1Var4, p02Var, (p02) listJ.get(size));
                }
                size--;
                qk1Var3 = qk1Var;
                qk1Var4 = qk1Var2;
            }
            if (w(p02Var2)) {
                region2.op(mr0VarY.a, mr0VarY.b, mr0VarY.c, mr0VarY.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void q(d91 d91Var, p02 p02Var, p02 p02Var2) {
        ax0 ax0Var;
        p02 p02VarL = p02Var2.l();
        yr1 yr1VarG = (p02VarL == null || (ax0Var = p02VarL.c) == null || !ax0Var.I()) ? P : p02VarL.g();
        int i2 = p02Var2.f;
        if (i2 == p02Var.f) {
            i2 = -1;
        }
        d91Var.h(i2, new s02(p02Var2, qx.Y(yr1VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162  */
    /* JADX WARN: Code duplicated, block: B:82:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x0177  */
    public static final void r(ej0 ej0Var, d91 d91Var, qk1 qk1Var, qk1 qk1Var2, p02 p02Var, p02 p02Var2) {
        int size;
        boolean z2;
        yr1 yr1VarI;
        ej0 ej0Var2 = ej0Var;
        d91 d91Var2 = d91Var;
        int i2 = p02Var.f;
        Region region = (Region) qk1Var.f;
        qk1 qk1Var3 = qk1Var2;
        Region region2 = (Region) qk1Var3.f;
        ax0 ax0Var = p02Var2.c;
        i02 i02Var = p02Var2.d;
        ax0 ax0Var2 = p02Var2.c;
        int i3 = p02Var2.f;
        boolean z3 = (ax0Var.I() && ax0Var2.H()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z3 || p02Var2.n()) {
                mr0 mr0VarY = qx.Y(p02Var2.m());
                qk1Var.F(mr0VarY);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (p02Var2.n()) {
                        q(d91Var2, p02Var, p02Var2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            d91Var2.h(i3, new s02(p02Var2, new mr0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                d91Var2.h(i3, new s02(p02Var2, new mr0(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = p02.j(4, p02Var2);
                if (i02Var.g) {
                    p02 p02VarL = p02Var2.l();
                    while (true) {
                        if (p02VarL == null) {
                            p02VarL = null;
                            break;
                        }
                        w91 w91Var = p02VarL.d.e;
                        if (w91Var.c(u02.w) || w91Var.c(u02.v)) {
                            break;
                        } else {
                            p02VarL = p02VarL.l();
                        }
                    }
                    if (p02VarL == null) {
                        z2 = false;
                    } else {
                        me1 me1VarD = p02Var2.d();
                        if (me1VarD == null) {
                            me1VarD = null;
                        } else {
                            if (!me1VarD.S0().r) {
                                me1VarD = null;
                            }
                            if (me1VarD == null) {
                                me1VarD = null;
                            }
                        }
                        me1 me1VarD2 = p02VarL.d();
                        if (me1VarD2 == null) {
                            me1VarD2 = null;
                        } else {
                            if (!me1VarD2.S0().r) {
                                me1VarD2 = null;
                            }
                            if (me1VarD2 == null) {
                                me1VarD2 = null;
                            }
                        }
                        if (me1VarD == null || me1VarD2 == null) {
                            z2 = false;
                        } else {
                            yr1 yr1VarK = me1VarD2.K(me1VarD, false);
                            z2 = !yr1VarK.equals(yr1VarK.e(sv.e(0L, ux.M(me1VarD2.g))));
                        }
                    }
                    if (z2) {
                        qk1 qk1Var4 = new qk1(6);
                        Object objF = p02Var2.f();
                        if (objF == null) {
                            bq0 bq0Var = ax0Var2.I.c;
                            yr1VarI = sv.A(bq0Var).K(bq0Var, false);
                        } else {
                            t71 t71Var = ((t71) objF).e;
                            Object objG = i02Var.e.g(h02.b);
                            yr1VarI = n02.i(t71Var, (objG == null ? null : objG) != null, false);
                        }
                        qk1Var4.F(qx.Y(yr1VarI));
                        int size2 = listJ.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) ej0Var2.h(listJ.get(size2))).booleanValue()) {
                                p(ej0Var2, d91Var2, new qk1(6), qk1Var4, p02Var, (p02) listJ.get(size2));
                            }
                            size2--;
                            d91Var2 = d91Var;
                        }
                    } else {
                        size = listJ.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) ej0Var2.h(listJ.get(size))).booleanValue()) {
                                r(ej0Var2, d91Var, qk1Var, qk1Var3, p02Var, (p02) listJ.get(size));
                            }
                            size--;
                            ej0Var2 = ej0Var;
                            qk1Var3 = qk1Var2;
                        }
                    }
                } else {
                    size = listJ.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) ej0Var2.h(listJ.get(size))).booleanValue()) {
                            r(ej0Var2, d91Var, qk1Var, qk1Var3, p02Var, (p02) listJ.get(size));
                        }
                        size--;
                        ej0Var2 = ej0Var;
                        qk1Var3 = qk1Var2;
                    }
                }
                if (w(p02Var2)) {
                    region2.op(mr0VarY.a, mr0VarY.b, mr0VarY.c, mr0VarY.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final String s(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static boolean t() {
        try {
            if (e5.Q0 == null) {
                e5.Q0 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = e5.R0;
            if (declaredMethod == null) {
                Class cls = e5.Q0;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                e5.R0 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return ws0.j(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static int u(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return tr.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean v(p02 p02Var) {
        me1 me1VarD = p02Var.d();
        w91 w91Var = p02Var.d.e;
        return (me1VarD != null ? me1VarD.a1() : false) || w91Var.c(u02.q) || w91Var.c(u02.p);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean w(p02 p02Var) {
        if (!v(p02Var)) {
            i02 i02Var = p02Var.d;
            if (i02Var.g) {
                return true;
            }
            w91 w91Var = i02Var.e;
            Object[] objArr = w91Var.b;
            Object[] objArr2 = w91Var.c;
            long[] jArr = w91Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((y02) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static boolean x(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static float y(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final u71 z(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new lg1(ej0Var));
    }
}

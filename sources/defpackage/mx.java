package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.inputmethod.HandwritingGesture;
import android.widget.EdgeEffect;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mx {
    public static final float a = 16.0f;
    public static final float b = 12.0f;
    public static final float c = 20.0f;
    public static final float d = 80.0f;
    public static jo0 e;
    public static jo0 f;
    public static jo0 g;
    public static final /* synthetic */ int h = 0;

    public static final void B(uy uyVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            yy yyVar = (yy) uyVar.p(q90.B);
            if (yyVar != null) {
                yyVar.q(uyVar, th);
            } else {
                ei1.x(uyVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                vv.e(runtimeException, th);
                th = runtimeException;
            }
            ei1.x(uyVar, th);
        }
    }

    public static final e60 C(ot0 ot0Var, boolean z, rt0 rt0Var) {
        if (ot0Var instanceof vt0) {
            return ((vt0) ot0Var).S(z, rt0Var);
        }
        return ot0Var.B(rt0Var.m(), z, new f(1, rt0Var, rt0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 14));
    }

    public static final boolean D(uy uyVar) {
        ot0 ot0Var = (ot0) uyVar.p(q90.P);
        if (ot0Var != null) {
            return ot0Var.b();
        }
        return true;
    }

    public static final boolean E(pn1 pn1Var) {
        MotionEvent motionEventA;
        List list = pn1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((wn1) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = pn1Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = pn1Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final ArrayList F(Map map, ej0 ej0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            jb1 jb1Var = (jb1) entry.getValue();
            Boolean boolValueOf = jb1Var != null ? Boolean.valueOf(jb1Var.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !jb1Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) ej0Var.h((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final sc1 G(ej0 ej0Var) {
        tc1 tc1Var = new tc1();
        ej0Var.h(tc1Var);
        boolean z = tc1Var.b;
        boolean z2 = tc1Var.c;
        int i = tc1Var.d;
        boolean z3 = tc1Var.e;
        yc0 yc0Var = tc1Var.a;
        return new sc1(z, z2, i, false, z3, yc0Var.a, yc0Var.b);
    }

    public static void H(long j, yb ybVar, boolean z, tr1 tr1Var) {
        if (z) {
            int i = of2.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(ybVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < ybVar.f.length() ? Character.codePointAt(ybVar, iCharCount2) : 10;
            if (qx.L(iCodePointBefore) && (qx.K(iCodePointAt) || qx.J(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(ybVar, iCharCount);
                    }
                } while (qx.L(iCodePointBefore));
                j = j02.c(iCharCount, iCharCount2);
            } else if (qx.L(iCodePointAt) && (qx.K(iCodePointBefore) || qx.J(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == ybVar.f.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(ybVar, iCharCount2);
                    }
                } while (qx.L(iCodePointAt));
                j = j02.c(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        tr1Var.h(new xl0(new r90[]{new c32(i2, i2), new j40(of2.d(j), 0)}));
    }

    public static final long I(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final List J(xv1 xv1Var) {
        int iS = qx.s(xv1Var, "id");
        int iS2 = qx.s(xv1Var, "seq");
        int iS3 = qx.s(xv1Var, "from");
        int iS4 = qx.s(xv1Var, "to");
        z21 z21VarL = vs0.l();
        while (xv1Var.y()) {
            z21VarL.add(new rh0((int) xv1Var.getLong(iS), (int) xv1Var.getLong(iS2), xv1Var.f(iS3), xv1Var.f(iS4)));
        }
        return vq.c0(vs0.i(z21VarL));
    }

    public static final qb2 K(vv1 vv1Var, String str, boolean z) {
        xv1 xv1VarC = vv1Var.C("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iS = qx.s(xv1VarC, "seqno");
            int iS2 = qx.s(xv1VarC, "cid");
            int iS3 = qx.s(xv1VarC, "name");
            int iS4 = qx.s(xv1VarC, "desc");
            if (iS != -1 && iS2 != -1 && iS3 != -1 && iS4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (xv1VarC.y()) {
                    if (((int) xv1VarC.getLong(iS2)) >= 0) {
                        int i = (int) xv1VarC.getLong(iS);
                        String strF = xv1VarC.f(iS3);
                        String str2 = xv1VarC.getLong(iS4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strF);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listD0 = vq.d0(linkedHashMap.entrySet(), new dg0(8));
                ArrayList arrayList = new ArrayList(wq.G(listD0, 10));
                Iterator it = listD0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listH0 = vq.h0(arrayList);
                List listD1 = vq.d0(linkedHashMap2.entrySet(), new dg0(9));
                ArrayList arrayList2 = new ArrayList(wq.G(listD1, 10));
                Iterator it2 = listD1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                qb2 qb2Var = new qb2(str, z, listH0, vq.h0(arrayList2));
                ir2.h(xv1VarC, null);
                return qb2Var;
            }
            ir2.h(xv1VarC, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    public static final fg2 L(ak0 ak0Var) {
        boolean z = dv1.z(ak0Var);
        boolean zG = ak0Var.g(z);
        Object objL = ak0Var.L();
        if (zG || objL == cv.a) {
            objL = new fg2(z ? (char) 1644 : ',');
            ak0Var.g0(objL);
        }
        return (fg2) objL;
    }

    public static void M(iq1 iq1Var) {
        s82 s82Var;
        bm1 bm1Var;
        bm1 bm1Var2;
        do {
            s82Var = rr1.z;
            bm1Var = (bm1) s82Var.getValue();
            tl1 tl1VarA = bm1Var.g;
            x21 x21Var = (x21) tl1VarA.get(iq1Var);
            if (x21Var == null) {
                bm1Var2 = bm1Var;
            } else {
                Object obj = x21Var.a;
                Object obj2 = x21Var.b;
                wi2 wi2Var = tl1VarA.e;
                wi2 wi2VarV = wi2Var.v(iq1Var != null ? iq1Var.hashCode() : 0, 0, iq1Var);
                if (wi2Var != wi2VarV) {
                    tl1VarA = wi2VarV == null ? tl1.g : new tl1(wi2VarV, tl1VarA.f - 1);
                }
                q90 q90Var = q90.J;
                if (obj != q90Var) {
                    Object obj3 = tl1VarA.get(obj);
                    obj3.getClass();
                    tl1VarA = tl1VarA.a(obj, new x21(((x21) obj3).a, obj2));
                }
                if (obj2 != q90Var) {
                    Object obj4 = tl1VarA.get(obj2);
                    obj4.getClass();
                    tl1VarA = tl1VarA.a(obj2, new x21(obj, ((x21) obj4).b));
                }
                Object obj5 = obj != q90Var ? bm1Var.e : obj2;
                if (obj2 != q90Var) {
                    obj = bm1Var.f;
                }
                bm1Var2 = new bm1(obj5, obj, tl1VarA);
            }
            if (bm1Var == bm1Var2) {
                return;
            }
        } while (!s82Var.h(bm1Var, bm1Var2));
    }

    public static final long N(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final long a(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void b(final gt gtVar, final gt gtVar2, final ti0 ti0Var, u71 u71Var, boolean z, u32 u32Var, long j, long j2, ee0 ee0Var, ak0 ak0Var, final int i) {
        final u71 u71Var2;
        final boolean z2;
        final u32 u32Var2;
        final long j3;
        final long j4;
        final ee0 ee0Var2;
        int i2;
        u32 u32Var3;
        u71 u71Var3;
        boolean z3;
        long j5;
        long j6;
        ee0 ee0Var3;
        ak0Var.X(-1161000600);
        int i3 = i | (ak0Var.h(ti0Var) ? 256 : 128) | 843672576;
        if (ak0Var.O(i3 & 1, (306783379 & i3) != 306783378)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                u32 u32VarA = j42.a(ws0.r, ak0Var);
                long jE = lr.e(p61.t, ak0Var);
                long jB = lr.b(jE, ak0Var);
                ee0 ee0Var4 = new ee0(p61.u, p61.x, p61.v, p61.w);
                i2 = i3 & (-268369921);
                u32Var3 = u32VarA;
                u71Var3 = r71.a;
                z3 = true;
                j5 = jE;
                j6 = jB;
                ee0Var3 = ee0Var4;
            } else {
                ak0Var.R();
                i2 = i3 & (-268369921);
                u71Var3 = u71Var;
                z3 = z;
                u32Var3 = u32Var;
                j5 = j;
                j6 = j2;
                ee0Var3 = ee0Var;
            }
            ak0Var.q();
            c(ti0Var, u71Var3, u32Var3, j5, j6, ee0Var3, vs0.C(632971498, new le0(z3, gtVar2, gtVar), ak0Var), ak0Var, 14155824 | ((i2 >> 6) & 14));
            z2 = z3;
            j4 = j6;
            u71Var2 = u71Var3;
            j3 = j5;
            ee0Var2 = ee0Var3;
            u32Var2 = u32Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            z2 = z;
            u32Var2 = u32Var;
            j3 = j;
            j4 = j2;
            ee0Var2 = ee0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(gtVar2, ti0Var, u71Var2, z2, u32Var2, j3, j4, ee0Var2, i) { // from class: ie0
                public final /* synthetic */ gt f;
                public final /* synthetic */ ti0 g;
                public final /* synthetic */ u71 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ u32 j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ ee0 m;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(55);
                    mx.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void c(final ti0 ti0Var, final u71 u71Var, final u32 u32Var, final long j, final long j2, final ee0 ee0Var, final gt gtVar, ak0 ak0Var, final int i) {
        ti0 ti0Var2;
        int i2;
        u32 u32Var2;
        ak0Var.X(748201188);
        if ((i & 6) == 0) {
            ti0Var2 = ti0Var;
            i2 = (ak0Var.h(ti0Var2) ? 4 : 2) | i;
        } else {
            ti0Var2 = ti0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            u32Var2 = u32Var;
            i2 |= ak0Var.f(u32Var2) ? 256 : 128;
        } else {
            u32Var2 = u32Var;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var.e(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ak0Var.f(ee0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ak0Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ak0Var.h(gtVar) ? 8388608 : 4194304;
        }
        if (ak0Var.O(i2 & 1, (4793491 & i2) != 4793490)) {
            ak0Var.T();
            if ((i & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            int i3 = i2 << 9;
            d(ti0Var2, ik2.a(ws0.s, ak0Var), sv0.n, u71Var, u32Var2, j, j2, ee0Var, gtVar, ak0Var, (i2 & 14) | 3456 | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), (i2 >> 21) & 14);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: je0
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mx.c(ti0Var, u71Var, u32Var, j, j2, ee0Var, gtVar, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void d(final ti0 ti0Var, final vf2 vf2Var, final float f2, final u71 u71Var, final u32 u32Var, final long j, final long j2, final ee0 ee0Var, final gt gtVar, ak0 ak0Var, final int i, final int i2) {
        int i3;
        gt gtVar2;
        int i4;
        ak0Var.X(121669932);
        if ((i & 6) == 0) {
            i3 = (ak0Var.h(ti0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var.f(vf2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ak0Var.c(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ak0Var.c(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ak0Var.f(u71Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ak0Var.f(u32Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ak0Var.e(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ak0Var.e(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ak0Var.f(ee0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ak0Var.f(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            gtVar2 = gtVar;
            i4 = i2 | (ak0Var.h(gtVar2) ? 4 : 2);
        } else {
            gtVar2 = gtVar;
            i4 = i2;
        }
        if (ak0Var.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            ak0Var.T();
            if ((i & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            ak0Var.W(-282833393);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            Object objL2 = ak0Var.L();
            if (objL2 == obj) {
                objL2 = new n30(2);
                ak0Var.g0(objL2);
            }
            u71 u71VarA = l02.a(u71Var, false, (ej0) objL2);
            float f3 = ee0Var.a;
            int i5 = i3 >> 21;
            int i6 = i5 & 112;
            boolean zF = ak0Var.f(f91Var);
            Object objL3 = ak0Var.L();
            if (zF || objL3 == obj) {
                objL3 = new he0(ee0Var.a, ee0Var.b, ee0Var.d, ee0Var.c);
                ak0Var.g0(objL3);
            }
            he0 he0Var = (he0) objL3;
            boolean zH = ak0Var.h(he0Var) | (((i6 ^ 48) > 32 && ak0Var.f(ee0Var)) || (i5 & 48) == 32);
            Object objL4 = ak0Var.L();
            if (zH || objL4 == obj) {
                objL4 = new e(15, null, he0Var, ee0Var);
                ak0Var.g0(objL4);
            }
            s5.o((ij0) objL4, ak0Var, ee0Var);
            boolean zF2 = ak0Var.f(f91Var) | ak0Var.h(he0Var);
            Object objL5 = ak0Var.L();
            if (zF2 || objL5 == obj) {
                objL5 = new g(9, null, f91Var, he0Var);
                ak0Var.g0(objL5);
            }
            s5.o((ij0) objL5, ak0Var, f91Var);
            int i7 = i3 >> 6;
            ra2.c(ti0Var, u71VarA, false, u32Var, j, j2, f3, ((w60) he0Var.e.c.f.getValue()).e, f91Var, vs0.C(-1779603465, new ne0(j2, vf2Var, f2, gtVar2), ak0Var), ak0Var, (i3 & 14) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 260);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ke0
                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(i | 1);
                    int iP2 = ei1.P(i2);
                    mx.d(ti0Var, vf2Var, f2, u71Var, u32Var, j, j2, ee0Var, gtVar, (ak0) obj2, iP, iP2);
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void e(u71 u71Var, q01 q01Var, final kj1 kj1Var, final ie ieVar, s3 s3Var, pd0 pd0Var, boolean z, v6 v6Var, final ej0 ej0Var, ak0 ak0Var, final int i, final int i2) {
        u71 u71Var2;
        int i3;
        q01 q01Var2;
        int i4;
        int i5;
        boolean z2;
        final s3 s3Var2;
        final pd0 pd0Var2;
        final boolean z3;
        final v6 v6Var2;
        final u71 u71Var3;
        final q01 q01Var3;
        lr1 lr1VarR;
        u71 u71Var4;
        q01 q01VarA;
        pd0 pd0VarB;
        v6 v6VarA;
        int i6;
        boolean z4;
        s3 s3Var3;
        ak0Var.X(53695811);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            u71Var2 = u71Var;
        } else {
            u71Var2 = u71Var;
            i3 = i | (ak0Var.f(u71Var2) ? 4 : 2);
        }
        if ((i2 & 2) == 0) {
            q01Var2 = q01Var;
            int i8 = ak0Var.f(q01Var2) ? 32 : 16;
            int i9 = i3 | i8 | 46861312;
            if (ak0Var.h(ej0Var)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i5 = i9 | i4;
            if ((306783379 & i5) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ak0Var.O(i5 & 1, z2)) {
                ak0Var.T();
                if ((i & 1) != 0 || ak0Var.y()) {
                    if (i7 != 0) {
                        u71Var4 = r71.a;
                    } else {
                        u71Var4 = u71Var2;
                    }
                    if ((i2 & 2) != 0) {
                        q01VarA = r01.a(0, 3, ak0Var);
                        i5 &= -113;
                    } else {
                        q01VarA = q01Var2;
                    }
                    ui uiVar = q90.r;
                    pd0VarB = sv.B(ak0Var);
                    v6VarA = yi1.a(ak0Var);
                    i6 = i5 & (-238551041);
                    z4 = true;
                    s3Var3 = uiVar;
                } else {
                    ak0Var.R();
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                    }
                    s3Var3 = s3Var;
                    pd0VarB = pd0Var;
                    z4 = z;
                    v6VarA = v6Var;
                    i6 = i5 & (-238551041);
                    u71Var4 = u71Var2;
                    q01VarA = q01Var2;
                }
                ak0Var.q();
                vv.c(u71Var4, q01VarA, kj1Var, true, pd0VarB, z4, v6VarA, s3Var3, ieVar, null, null, ej0Var, ak0Var, (i6 & 14) | 24576 | (i6 & 112) | 806882688, 6 | ((i6 >> 18) & 7168), 6400);
                pd0Var2 = pd0VarB;
                z3 = z4;
                v6Var2 = v6VarA;
                s3Var2 = s3Var3;
                u71Var3 = u71Var4;
                q01Var3 = q01VarA;
            } else {
                ak0Var.R();
                s3Var2 = s3Var;
                pd0Var2 = pd0Var;
                z3 = z;
                v6Var2 = v6Var;
                u71Var3 = u71Var2;
                q01Var3 = q01Var2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0(q01Var3, kj1Var, ieVar, s3Var2, pd0Var2, z3, v6Var2, ej0Var, i, i2) { // from class: tx0
                    public final /* synthetic */ q01 f;
                    public final /* synthetic */ kj1 g;
                    public final /* synthetic */ ie h;
                    public final /* synthetic */ s3 i;
                    public final /* synthetic */ pd0 j;
                    public final /* synthetic */ boolean k;
                    public final /* synthetic */ v6 l;
                    public final /* synthetic */ ej0 m;
                    public final /* synthetic */ int n;

                    {
                        this.n = i2;
                    }

                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = ei1.P(24961);
                        mx.e(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ak0) obj, iP, this.n);
                        return ll2.a;
                    }
                };
            }
        }
        q01Var2 = q01Var;
        int i10 = i3 | i8 | 46861312;
        if (ak0Var.h(ej0Var)) {
            i4 = 536870912;
        } else {
            i4 = 268435456;
        }
        i5 = i10 | i4;
        if ((306783379 & i5) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ak0Var.O(i5 & 1, z2)) {
            ak0Var.T();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    u71Var4 = r71.a;
                } else {
                    u71Var4 = u71Var2;
                }
                if ((i2 & 2) != 0) {
                    q01VarA = r01.a(0, 3, ak0Var);
                    i5 &= -113;
                } else {
                    q01VarA = q01Var2;
                }
                ui uiVar2 = q90.r;
                pd0VarB = sv.B(ak0Var);
                v6VarA = yi1.a(ak0Var);
                i6 = i5 & (-238551041);
                z4 = true;
                s3Var3 = uiVar2;
            } else {
                if (i7 != 0) {
                    u71Var4 = r71.a;
                } else {
                    u71Var4 = u71Var2;
                }
                if ((i2 & 2) != 0) {
                    q01VarA = r01.a(0, 3, ak0Var);
                    i5 &= -113;
                } else {
                    q01VarA = q01Var2;
                }
                ui uiVar3 = q90.r;
                pd0VarB = sv.B(ak0Var);
                v6VarA = yi1.a(ak0Var);
                i6 = i5 & (-238551041);
                z4 = true;
                s3Var3 = uiVar3;
            }
            ak0Var.q();
            vv.c(u71Var4, q01VarA, kj1Var, true, pd0VarB, z4, v6VarA, s3Var3, ieVar, null, null, ej0Var, ak0Var, (i6 & 14) | 24576 | (i6 & 112) | 806882688, 6 | ((i6 >> 18) & 7168), 6400);
            pd0Var2 = pd0VarB;
            z3 = z4;
            v6Var2 = v6VarA;
            s3Var2 = s3Var3;
            u71Var3 = u71Var4;
            q01Var3 = q01VarA;
        } else {
            ak0Var.R();
            s3Var2 = s3Var;
            pd0Var2 = pd0Var;
            z3 = z;
            v6Var2 = v6Var;
            u71Var3 = u71Var2;
            q01Var3 = q01Var2;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(q01Var3, kj1Var, ieVar, s3Var2, pd0Var2, z3, v6Var2, ej0Var, i, i2) { // from class: tx0
                public final /* synthetic */ q01 f;
                public final /* synthetic */ kj1 g;
                public final /* synthetic */ ie h;
                public final /* synthetic */ s3 i;
                public final /* synthetic */ pd0 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ v6 l;
                public final /* synthetic */ ej0 m;
                public final /* synthetic */ int n;

                {
                    this.n = i2;
                }

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(24961);
                    mx.e(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ak0) obj, iP, this.n);
                    return ll2.a;
                }
            };
        }
    }

    public static final void f(ti0 ti0Var, u71 u71Var, tz0 tz0Var, lz0 lz0Var, ak0 ak0Var, int i) {
        lz0 lz0Var2;
        tz0 tz0Var2;
        u71 u71Var2;
        ak0Var.X(1055276397);
        int i2 = (ak0Var.h(ti0Var) ? 4 : 2) | i | (ak0Var.f(u71Var) ? 32 : 16) | (ak0Var.f(tz0Var) ? 256 : 128) | (ak0Var.f(lz0Var) ? 2048 : 1024);
        if (ak0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            lz0Var2 = lz0Var;
            kz0 kz0Var = new kz0(tz0Var, u71Var, lz0Var2, y12.t(ti0Var, ak0Var), 0);
            tz0Var2 = tz0Var;
            u71Var2 = u71Var;
            ex.d(vs0.C(-933153643, kz0Var, ak0Var), ak0Var, 6);
        } else {
            lz0Var2 = lz0Var;
            tz0Var2 = tz0Var;
            u71Var2 = u71Var;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new yh(ti0Var, u71Var2, tz0Var2, lz0Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x015a  */
    /* JADX WARN: Code duplicated, block: B:92:0x016e  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void g(u71 u71Var, q01 q01Var, gj1 gj1Var, ge geVar, vi viVar, pd0 pd0Var, boolean z, v6 v6Var, final ej0 ej0Var, ak0 ak0Var, final int i, final int i2) {
        u71 u71Var2;
        int i3;
        q01 q01VarA;
        int i4;
        int i5;
        gj1 kj1Var;
        int i6;
        int i7;
        ge geVar2;
        pd0 pd0Var2;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        final vi viVar2;
        final u71 u71Var3;
        final q01 q01Var2;
        final gj1 gj1Var2;
        final ge geVar3;
        final pd0 pd0Var3;
        final boolean z4;
        final v6 v6Var2;
        lr1 lr1VarR;
        u71 u71Var4;
        pd0 pd0VarB;
        int i10;
        vi viVar3;
        gj1 gj1Var3;
        v6 v6VarA;
        ak0Var.X(-1884325601);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            u71Var2 = u71Var;
        } else {
            u71Var2 = u71Var;
            i3 = (ak0Var.f(u71Var2) ? 4 : 2) | i;
        }
        if ((i2 & 2) == 0) {
            q01VarA = q01Var;
            int i12 = ak0Var.f(q01VarA) ? 32 : 16;
            i4 = i3 | i12;
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    kj1Var = gj1Var;
                    if (ak0Var.f(kj1Var)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 3072;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        geVar2 = geVar;
                        int i13 = ak0Var.f(geVar2) ? 16384 : 8192;
                        i7 |= i13;
                    } else {
                        geVar2 = geVar;
                    }
                    i7 |= i13;
                } else {
                    geVar2 = geVar;
                }
                int i14 = i7 | 196608;
                if ((i2 & 64) == 0) {
                    pd0Var2 = pd0Var;
                    int i15 = ak0Var.f(pd0Var2) ? 1048576 : 524288;
                    int i16 = i14 | i15 | 46137344;
                    if (ak0Var.h(ej0Var)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i9 = i16 | i8;
                    z2 = true;
                    if ((306783379 & i9) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (ak0Var.O(i9 & 1, z3)) {
                        ak0Var.T();
                        if ((i & 1) != 0 || ak0Var.y()) {
                            if (i11 != 0) {
                                u71Var4 = r71.a;
                            } else {
                                u71Var4 = u71Var2;
                            }
                            if ((i2 & 2) != 0) {
                                i9 &= -113;
                                q01VarA = r01.a(0, 3, ak0Var);
                            }
                            if (i5 != 0) {
                                kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i9 &= -57345;
                                geVar2 = ws0.e;
                            }
                            vi viVar4 = q90.o;
                            if ((i2 & 64) != 0) {
                                pd0VarB = sv.B(ak0Var);
                                i9 &= -3670017;
                            } else {
                                pd0VarB = pd0Var2;
                            }
                            i10 = i9 & (-234881025);
                            viVar3 = viVar4;
                            gj1Var3 = kj1Var;
                            v6VarA = yi1.a(ak0Var);
                        } else {
                            ak0Var.R();
                            if ((i2 & 2) != 0) {
                                i9 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i9 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                            }
                            viVar3 = viVar;
                            z2 = z;
                            i10 = i9 & (-234881025);
                            u71Var4 = u71Var2;
                            gj1Var3 = kj1Var;
                            pd0VarB = pd0Var2;
                            v6VarA = v6Var;
                        }
                        ge geVar4 = geVar2;
                        ak0Var.q();
                        u71 u71Var5 = u71Var4;
                        q01 q01Var3 = q01VarA;
                        pd0 pd0Var4 = pd0VarB;
                        boolean z5 = z2;
                        vv.c(u71Var5, q01Var3, gj1Var3, false, pd0Var4, z5, v6VarA, null, null, viVar3, geVar4, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
                        gj1Var2 = gj1Var3;
                        z4 = z5;
                        v6Var2 = v6VarA;
                        viVar2 = viVar3;
                        q01Var2 = q01Var3;
                        pd0Var3 = pd0Var4;
                        geVar3 = geVar4;
                        u71Var3 = u71Var5;
                    } else {
                        ak0Var.R();
                        viVar2 = viVar;
                        u71Var3 = u71Var2;
                        q01Var2 = q01VarA;
                        gj1Var2 = kj1Var;
                        geVar3 = geVar2;
                        pd0Var3 = pd0Var2;
                        z4 = z;
                        v6Var2 = v6Var;
                    }
                    lr1VarR = ak0Var.r();
                    if (lr1VarR != null) {
                        lr1VarR.d = new ij0() { // from class: ux0
                            @Override // defpackage.ij0
                            public final Object g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                                return ll2.a;
                            }
                        };
                    }
                }
                pd0Var2 = pd0Var;
                int i17 = i14 | i15 | 46137344;
                if (ak0Var.h(ej0Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i9 = i17 | i8;
                z2 = true;
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ak0Var.O(i9 & 1, z3)) {
                    ak0Var.T();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            u71Var4 = r71.a;
                        } else {
                            u71Var4 = u71Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i9 &= -113;
                            q01VarA = r01.a(0, 3, ak0Var);
                        }
                        if (i5 != 0) {
                            kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            geVar2 = ws0.e;
                        }
                        vi viVar5 = q90.o;
                        if ((i2 & 64) != 0) {
                            pd0VarB = sv.B(ak0Var);
                            i9 &= -3670017;
                        } else {
                            pd0VarB = pd0Var2;
                        }
                        i10 = i9 & (-234881025);
                        viVar3 = viVar5;
                        gj1Var3 = kj1Var;
                        v6VarA = yi1.a(ak0Var);
                    } else {
                        if (i11 != 0) {
                            u71Var4 = r71.a;
                        } else {
                            u71Var4 = u71Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i9 &= -113;
                            q01VarA = r01.a(0, 3, ak0Var);
                        }
                        if (i5 != 0) {
                            kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            geVar2 = ws0.e;
                        }
                        vi viVar6 = q90.o;
                        if ((i2 & 64) != 0) {
                            pd0VarB = sv.B(ak0Var);
                            i9 &= -3670017;
                        } else {
                            pd0VarB = pd0Var2;
                        }
                        i10 = i9 & (-234881025);
                        viVar3 = viVar6;
                        gj1Var3 = kj1Var;
                        v6VarA = yi1.a(ak0Var);
                    }
                    ge geVar5 = geVar2;
                    ak0Var.q();
                    u71 u71Var6 = u71Var4;
                    q01 q01Var4 = q01VarA;
                    pd0 pd0Var5 = pd0VarB;
                    boolean z6 = z2;
                    vv.c(u71Var6, q01Var4, gj1Var3, false, pd0Var5, z6, v6VarA, null, null, viVar3, geVar5, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
                    gj1Var2 = gj1Var3;
                    z4 = z6;
                    v6Var2 = v6VarA;
                    viVar2 = viVar3;
                    q01Var2 = q01Var4;
                    pd0Var3 = pd0Var5;
                    geVar3 = geVar5;
                    u71Var3 = u71Var6;
                } else {
                    ak0Var.R();
                    viVar2 = viVar;
                    u71Var3 = u71Var2;
                    q01Var2 = q01VarA;
                    gj1Var2 = kj1Var;
                    geVar3 = geVar2;
                    pd0Var3 = pd0Var2;
                    z4 = z;
                    v6Var2 = v6Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ux0
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                            return ll2.a;
                        }
                    };
                }
            }
            i4 |= 384;
            kj1Var = gj1Var;
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    geVar2 = geVar;
                    if (ak0Var.f(geVar2)) {
                    }
                    i7 |= i13;
                } else {
                    geVar2 = geVar;
                }
                i7 |= i13;
            } else {
                geVar2 = geVar;
            }
            int i18 = i7 | 196608;
            if ((i2 & 64) == 0) {
                pd0Var2 = pd0Var;
                if (ak0Var.f(pd0Var2)) {
                }
                int i19 = i18 | i15 | 46137344;
                if (ak0Var.h(ej0Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i9 = i19 | i8;
                z2 = true;
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ak0Var.O(i9 & 1, z3)) {
                    ak0Var.T();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            u71Var4 = r71.a;
                        } else {
                            u71Var4 = u71Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i9 &= -113;
                            q01VarA = r01.a(0, 3, ak0Var);
                        }
                        if (i5 != 0) {
                            kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            geVar2 = ws0.e;
                        }
                        vi viVar7 = q90.o;
                        if ((i2 & 64) != 0) {
                            pd0VarB = sv.B(ak0Var);
                            i9 &= -3670017;
                        } else {
                            pd0VarB = pd0Var2;
                        }
                        i10 = i9 & (-234881025);
                        viVar3 = viVar7;
                        gj1Var3 = kj1Var;
                        v6VarA = yi1.a(ak0Var);
                    } else {
                        if (i11 != 0) {
                            u71Var4 = r71.a;
                        } else {
                            u71Var4 = u71Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i9 &= -113;
                            q01VarA = r01.a(0, 3, ak0Var);
                        }
                        if (i5 != 0) {
                            kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            geVar2 = ws0.e;
                        }
                        vi viVar8 = q90.o;
                        if ((i2 & 64) != 0) {
                            pd0VarB = sv.B(ak0Var);
                            i9 &= -3670017;
                        } else {
                            pd0VarB = pd0Var2;
                        }
                        i10 = i9 & (-234881025);
                        viVar3 = viVar8;
                        gj1Var3 = kj1Var;
                        v6VarA = yi1.a(ak0Var);
                    }
                    ge geVar6 = geVar2;
                    ak0Var.q();
                    u71 u71Var7 = u71Var4;
                    q01 q01Var5 = q01VarA;
                    pd0 pd0Var6 = pd0VarB;
                    boolean z7 = z2;
                    vv.c(u71Var7, q01Var5, gj1Var3, false, pd0Var6, z7, v6VarA, null, null, viVar3, geVar6, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
                    gj1Var2 = gj1Var3;
                    z4 = z7;
                    v6Var2 = v6VarA;
                    viVar2 = viVar3;
                    q01Var2 = q01Var5;
                    pd0Var3 = pd0Var6;
                    geVar3 = geVar6;
                    u71Var3 = u71Var7;
                } else {
                    ak0Var.R();
                    viVar2 = viVar;
                    u71Var3 = u71Var2;
                    q01Var2 = q01VarA;
                    gj1Var2 = kj1Var;
                    geVar3 = geVar2;
                    pd0Var3 = pd0Var2;
                    z4 = z;
                    v6Var2 = v6Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ux0
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                            return ll2.a;
                        }
                    };
                }
            }
            pd0Var2 = pd0Var;
            int i110 = i18 | i15 | 46137344;
            if (ak0Var.h(ej0Var)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i9 = i110 | i8;
            z2 = true;
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ak0Var.O(i9 & 1, z3)) {
                ak0Var.T();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        u71Var4 = r71.a;
                    } else {
                        u71Var4 = u71Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                        q01VarA = r01.a(0, 3, ak0Var);
                    }
                    if (i5 != 0) {
                        kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        geVar2 = ws0.e;
                    }
                    vi viVar9 = q90.o;
                    if ((i2 & 64) != 0) {
                        pd0VarB = sv.B(ak0Var);
                        i9 &= -3670017;
                    } else {
                        pd0VarB = pd0Var2;
                    }
                    i10 = i9 & (-234881025);
                    viVar3 = viVar9;
                    gj1Var3 = kj1Var;
                    v6VarA = yi1.a(ak0Var);
                } else {
                    if (i11 != 0) {
                        u71Var4 = r71.a;
                    } else {
                        u71Var4 = u71Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                        q01VarA = r01.a(0, 3, ak0Var);
                    }
                    if (i5 != 0) {
                        kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        geVar2 = ws0.e;
                    }
                    vi viVar10 = q90.o;
                    if ((i2 & 64) != 0) {
                        pd0VarB = sv.B(ak0Var);
                        i9 &= -3670017;
                    } else {
                        pd0VarB = pd0Var2;
                    }
                    i10 = i9 & (-234881025);
                    viVar3 = viVar10;
                    gj1Var3 = kj1Var;
                    v6VarA = yi1.a(ak0Var);
                }
                ge geVar7 = geVar2;
                ak0Var.q();
                u71 u71Var8 = u71Var4;
                q01 q01Var6 = q01VarA;
                pd0 pd0Var7 = pd0VarB;
                boolean z8 = z2;
                vv.c(u71Var8, q01Var6, gj1Var3, false, pd0Var7, z8, v6VarA, null, null, viVar3, geVar7, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
                gj1Var2 = gj1Var3;
                z4 = z8;
                v6Var2 = v6VarA;
                viVar2 = viVar3;
                q01Var2 = q01Var6;
                pd0Var3 = pd0Var7;
                geVar3 = geVar7;
                u71Var3 = u71Var8;
            } else {
                ak0Var.R();
                viVar2 = viVar;
                u71Var3 = u71Var2;
                q01Var2 = q01VarA;
                gj1Var2 = kj1Var;
                geVar3 = geVar2;
                pd0Var3 = pd0Var2;
                z4 = z;
                v6Var2 = v6Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ux0
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                        return ll2.a;
                    }
                };
            }
        }
        q01VarA = q01Var;
        i4 = i3 | i12;
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 384) == 0) {
                kj1Var = gj1Var;
                if (ak0Var.f(kj1Var)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    geVar2 = geVar;
                    if (ak0Var.f(geVar2)) {
                    }
                    i7 |= i13;
                } else {
                    geVar2 = geVar;
                }
                i7 |= i13;
            } else {
                geVar2 = geVar;
            }
            int i111 = i7 | 196608;
            if ((i2 & 64) == 0) {
                pd0Var2 = pd0Var;
                if (ak0Var.f(pd0Var2)) {
                }
                int i112 = i111 | i15 | 46137344;
                if (ak0Var.h(ej0Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i9 = i112 | i8;
                z2 = true;
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ak0Var.O(i9 & 1, z3)) {
                    ak0Var.T();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            u71Var4 = r71.a;
                        } else {
                            u71Var4 = u71Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i9 &= -113;
                            q01VarA = r01.a(0, 3, ak0Var);
                        }
                        if (i5 != 0) {
                            kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            geVar2 = ws0.e;
                        }
                        vi viVar11 = q90.o;
                        if ((i2 & 64) != 0) {
                            pd0VarB = sv.B(ak0Var);
                            i9 &= -3670017;
                        } else {
                            pd0VarB = pd0Var2;
                        }
                        i10 = i9 & (-234881025);
                        viVar3 = viVar11;
                        gj1Var3 = kj1Var;
                        v6VarA = yi1.a(ak0Var);
                    } else {
                        if (i11 != 0) {
                            u71Var4 = r71.a;
                        } else {
                            u71Var4 = u71Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i9 &= -113;
                            q01VarA = r01.a(0, 3, ak0Var);
                        }
                        if (i5 != 0) {
                            kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            geVar2 = ws0.e;
                        }
                        vi viVar12 = q90.o;
                        if ((i2 & 64) != 0) {
                            pd0VarB = sv.B(ak0Var);
                            i9 &= -3670017;
                        } else {
                            pd0VarB = pd0Var2;
                        }
                        i10 = i9 & (-234881025);
                        viVar3 = viVar12;
                        gj1Var3 = kj1Var;
                        v6VarA = yi1.a(ak0Var);
                    }
                    ge geVar8 = geVar2;
                    ak0Var.q();
                    u71 u71Var9 = u71Var4;
                    q01 q01Var7 = q01VarA;
                    pd0 pd0Var8 = pd0VarB;
                    boolean z9 = z2;
                    vv.c(u71Var9, q01Var7, gj1Var3, false, pd0Var8, z9, v6VarA, null, null, viVar3, geVar8, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
                    gj1Var2 = gj1Var3;
                    z4 = z9;
                    v6Var2 = v6VarA;
                    viVar2 = viVar3;
                    q01Var2 = q01Var7;
                    pd0Var3 = pd0Var8;
                    geVar3 = geVar8;
                    u71Var3 = u71Var9;
                } else {
                    ak0Var.R();
                    viVar2 = viVar;
                    u71Var3 = u71Var2;
                    q01Var2 = q01VarA;
                    gj1Var2 = kj1Var;
                    geVar3 = geVar2;
                    pd0Var3 = pd0Var2;
                    z4 = z;
                    v6Var2 = v6Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ux0
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                            return ll2.a;
                        }
                    };
                }
            }
            pd0Var2 = pd0Var;
            int i113 = i111 | i15 | 46137344;
            if (ak0Var.h(ej0Var)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i9 = i113 | i8;
            z2 = true;
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ak0Var.O(i9 & 1, z3)) {
                ak0Var.T();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        u71Var4 = r71.a;
                    } else {
                        u71Var4 = u71Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                        q01VarA = r01.a(0, 3, ak0Var);
                    }
                    if (i5 != 0) {
                        kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        geVar2 = ws0.e;
                    }
                    vi viVar13 = q90.o;
                    if ((i2 & 64) != 0) {
                        pd0VarB = sv.B(ak0Var);
                        i9 &= -3670017;
                    } else {
                        pd0VarB = pd0Var2;
                    }
                    i10 = i9 & (-234881025);
                    viVar3 = viVar13;
                    gj1Var3 = kj1Var;
                    v6VarA = yi1.a(ak0Var);
                } else {
                    if (i11 != 0) {
                        u71Var4 = r71.a;
                    } else {
                        u71Var4 = u71Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                        q01VarA = r01.a(0, 3, ak0Var);
                    }
                    if (i5 != 0) {
                        kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        geVar2 = ws0.e;
                    }
                    vi viVar14 = q90.o;
                    if ((i2 & 64) != 0) {
                        pd0VarB = sv.B(ak0Var);
                        i9 &= -3670017;
                    } else {
                        pd0VarB = pd0Var2;
                    }
                    i10 = i9 & (-234881025);
                    viVar3 = viVar14;
                    gj1Var3 = kj1Var;
                    v6VarA = yi1.a(ak0Var);
                }
                ge geVar9 = geVar2;
                ak0Var.q();
                u71 u71Var10 = u71Var4;
                q01 q01Var8 = q01VarA;
                pd0 pd0Var9 = pd0VarB;
                boolean z10 = z2;
                vv.c(u71Var10, q01Var8, gj1Var3, false, pd0Var9, z10, v6VarA, null, null, viVar3, geVar9, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
                gj1Var2 = gj1Var3;
                z4 = z10;
                v6Var2 = v6VarA;
                viVar2 = viVar3;
                q01Var2 = q01Var8;
                pd0Var3 = pd0Var9;
                geVar3 = geVar9;
                u71Var3 = u71Var10;
            } else {
                ak0Var.R();
                viVar2 = viVar;
                u71Var3 = u71Var2;
                q01Var2 = q01VarA;
                gj1Var2 = kj1Var;
                geVar3 = geVar2;
                pd0Var3 = pd0Var2;
                z4 = z;
                v6Var2 = v6Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ux0
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                        return ll2.a;
                    }
                };
            }
        }
        i4 |= 384;
        kj1Var = gj1Var;
        i7 = i4 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                geVar2 = geVar;
                if (ak0Var.f(geVar2)) {
                }
                i7 |= i13;
            } else {
                geVar2 = geVar;
            }
            i7 |= i13;
        } else {
            geVar2 = geVar;
        }
        int i114 = i7 | 196608;
        if ((i2 & 64) == 0) {
            pd0Var2 = pd0Var;
            if (ak0Var.f(pd0Var2)) {
            }
            int i115 = i114 | i15 | 46137344;
            if (ak0Var.h(ej0Var)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i9 = i115 | i8;
            z2 = true;
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ak0Var.O(i9 & 1, z3)) {
                ak0Var.T();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        u71Var4 = r71.a;
                    } else {
                        u71Var4 = u71Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                        q01VarA = r01.a(0, 3, ak0Var);
                    }
                    if (i5 != 0) {
                        kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        geVar2 = ws0.e;
                    }
                    vi viVar15 = q90.o;
                    if ((i2 & 64) != 0) {
                        pd0VarB = sv.B(ak0Var);
                        i9 &= -3670017;
                    } else {
                        pd0VarB = pd0Var2;
                    }
                    i10 = i9 & (-234881025);
                    viVar3 = viVar15;
                    gj1Var3 = kj1Var;
                    v6VarA = yi1.a(ak0Var);
                } else {
                    if (i11 != 0) {
                        u71Var4 = r71.a;
                    } else {
                        u71Var4 = u71Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                        q01VarA = r01.a(0, 3, ak0Var);
                    }
                    if (i5 != 0) {
                        kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        geVar2 = ws0.e;
                    }
                    vi viVar16 = q90.o;
                    if ((i2 & 64) != 0) {
                        pd0VarB = sv.B(ak0Var);
                        i9 &= -3670017;
                    } else {
                        pd0VarB = pd0Var2;
                    }
                    i10 = i9 & (-234881025);
                    viVar3 = viVar16;
                    gj1Var3 = kj1Var;
                    v6VarA = yi1.a(ak0Var);
                }
                ge geVar10 = geVar2;
                ak0Var.q();
                u71 u71Var11 = u71Var4;
                q01 q01Var9 = q01VarA;
                pd0 pd0Var10 = pd0VarB;
                boolean z11 = z2;
                vv.c(u71Var11, q01Var9, gj1Var3, false, pd0Var10, z11, v6VarA, null, null, viVar3, geVar10, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
                gj1Var2 = gj1Var3;
                z4 = z11;
                v6Var2 = v6VarA;
                viVar2 = viVar3;
                q01Var2 = q01Var9;
                pd0Var3 = pd0Var10;
                geVar3 = geVar10;
                u71Var3 = u71Var11;
            } else {
                ak0Var.R();
                viVar2 = viVar;
                u71Var3 = u71Var2;
                q01Var2 = q01VarA;
                gj1Var2 = kj1Var;
                geVar3 = geVar2;
                pd0Var3 = pd0Var2;
                z4 = z;
                v6Var2 = v6Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ux0
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                        return ll2.a;
                    }
                };
            }
        }
        pd0Var2 = pd0Var;
        int i116 = i114 | i15 | 46137344;
        if (ak0Var.h(ej0Var)) {
            i8 = 536870912;
        } else {
            i8 = 268435456;
        }
        i9 = i116 | i8;
        z2 = true;
        if ((306783379 & i9) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ak0Var.O(i9 & 1, z3)) {
            ak0Var.T();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    u71Var4 = r71.a;
                } else {
                    u71Var4 = u71Var2;
                }
                if ((i2 & 2) != 0) {
                    i9 &= -113;
                    q01VarA = r01.a(0, 3, ak0Var);
                }
                if (i5 != 0) {
                    kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                    geVar2 = ws0.e;
                }
                vi viVar17 = q90.o;
                if ((i2 & 64) != 0) {
                    pd0VarB = sv.B(ak0Var);
                    i9 &= -3670017;
                } else {
                    pd0VarB = pd0Var2;
                }
                i10 = i9 & (-234881025);
                viVar3 = viVar17;
                gj1Var3 = kj1Var;
                v6VarA = yi1.a(ak0Var);
            } else {
                if (i11 != 0) {
                    u71Var4 = r71.a;
                } else {
                    u71Var4 = u71Var2;
                }
                if ((i2 & 2) != 0) {
                    i9 &= -113;
                    q01VarA = r01.a(0, 3, ak0Var);
                }
                if (i5 != 0) {
                    kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                    geVar2 = ws0.e;
                }
                vi viVar18 = q90.o;
                if ((i2 & 64) != 0) {
                    pd0VarB = sv.B(ak0Var);
                    i9 &= -3670017;
                } else {
                    pd0VarB = pd0Var2;
                }
                i10 = i9 & (-234881025);
                viVar3 = viVar18;
                gj1Var3 = kj1Var;
                v6VarA = yi1.a(ak0Var);
            }
            ge geVar11 = geVar2;
            ak0Var.q();
            u71 u71Var12 = u71Var4;
            q01 q01Var10 = q01VarA;
            pd0 pd0Var11 = pd0VarB;
            boolean z12 = z2;
            vv.c(u71Var12, q01Var10, gj1Var3, false, pd0Var11, z12, v6VarA, null, null, viVar3, geVar11, ej0Var, ak0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 3072 | ((i10 >> 3) & 458752) | 1572864, ((i10 >> 18) & 7168) | ((i10 >> 6) & 896) | 48, 1792);
            gj1Var2 = gj1Var3;
            z4 = z12;
            v6Var2 = v6VarA;
            viVar2 = viVar3;
            q01Var2 = q01Var10;
            pd0Var3 = pd0Var11;
            geVar3 = geVar11;
            u71Var3 = u71Var12;
        } else {
            ak0Var.R();
            viVar2 = viVar;
            u71Var3 = u71Var2;
            q01Var2 = q01VarA;
            gj1Var2 = kj1Var;
            geVar3 = geVar2;
            pd0Var3 = pd0Var2;
            z4 = z;
            v6Var2 = v6Var;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ux0
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mx.g(u71Var3, q01Var2, gj1Var2, geVar3, viVar2, pd0Var3, z4, v6Var2, ej0Var, (ak0) obj, ei1.P(i | 1), i2);
                    return ll2.a;
                }
            };
        }
    }

    public static final void h(Boolean bool, Object obj, y11 y11Var, ej0 ej0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(696924721);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.h(ej0Var) ? 2048 : 1024;
        }
        if (ak0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                y11Var = (y11) ak0Var.j(j31.a);
            } else {
                ak0Var.R();
            }
            int i3 = i2 & (-897);
            ak0Var.q();
            boolean zF = ak0Var.f(bool) | ak0Var.f(obj) | ak0Var.f(y11Var);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new f21(y11Var.h());
                ak0Var.g0(objL);
            }
            i(y11Var, (f21) objL, ej0Var, ak0Var, (i3 >> 3) & 896);
        } else {
            ak0Var.R();
        }
        y11 y11Var2 = y11Var;
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new i3(bool, obj, y11Var2, ej0Var, i, 3);
        }
    }

    public static final void i(y11 y11Var, f21 f21Var, ej0 ej0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(228371534);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(y11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(f21Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(ej0Var) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = ak0Var.h(f21Var) | ((i2 & 896) == 256) | ak0Var.h(y11Var);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new o1(y11Var, f21Var, ej0Var);
                ak0Var.g0(objL);
            }
            s5.f(y11Var, f21Var, (ej0) objL, ak0Var);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(y11Var, f21Var, ej0Var, i, 12);
        }
    }

    public static float j(EdgeEffect edgeEffect, float f2, float f3, m40 m40Var) {
        float f4 = f90.a;
        double dB = m40Var.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f2) * 0.35f;
        double d2 = ((double) f90.a) * dB;
        float fExp = (float) (Math.exp((f90.b / f90.c) * Math.log(dAbs / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? x5.d(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int iJ0 = p61.j0(f2);
        if (i >= 31) {
            edgeEffect.onAbsorb(iJ0);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iJ0);
        }
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int k(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx.k(int, int, int, boolean):int");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void l(tx txVar) {
        a40 a40Var;
        if (txVar instanceof a40) {
            a40Var = (a40) txVar;
            int i = a40Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                a40Var.i = i - Integer.MIN_VALUE;
            } else {
                a40Var = new a40(txVar);
            }
        } else {
            a40Var = new a40(txVar);
        }
        Object obj = a40Var.h;
        int i2 = a40Var.i;
        if (i2 == 0) {
            ix.Q(obj);
            a40Var.i = 1;
            om omVar = new om(1, ex.y(a40Var));
            omVar.v();
            if (omVar.t() == fz.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ix.Q(obj);
        }
        qj.e();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.getNextBlockInIfSuccessorChain(IfRegionMaker.java:646)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.getNextIfNodeInfo(IfRegionMaker.java:620)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.getNextIf(IfRegionMaker.java:602)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.mergeNestedIfNodes(IfRegionMaker.java:409)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        */
    public static final java.lang.Object m(defpackage.bb2 r6, defpackage.sh r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ku1
            if (r0 == 0) goto L13
            r0 = r7
            ku1 r0 = (defpackage.ku1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ku1 r0 = new ku1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            bb2 r6 = r0.h
            defpackage.ix.Q(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.ix.Q(r7)
        L31:
            r0.h = r6
            r0.j = r2
            qn1 r7 = defpackage.qn1.f
            java.lang.Object r7 = r6.a(r7, r0)
            fz r1 = defpackage.fz.e
            if (r7 != r1) goto L40
            return r1
        L40:
            pn1 r7 = (defpackage.pn1) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            wn1 r5 = (defpackage.wn1) r5
            boolean r5 = defpackage.sv.n(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx.m(bb2, sh):java.lang.Object");
    }

    public static mi0 o(ArrayList arrayList) {
        Double dValueOf;
        Double dValueOf2;
        int iIntValue;
        if (arrayList.isEmpty()) {
            return new mi0();
        }
        List<g22> listD0 = vq.d0(arrayList, s5.C(new n30(5), new n30(6)));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listD0) {
            g22 g22Var = (g22) obj;
            Double d2 = g22Var.g;
            if ((d2 != null ? d2.doubleValue() : 0.0d) > 0.0d && g22Var.f != null) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i = 0;
        double dDoubleValue = 0.0d;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            Double d3 = ((g22) obj2).g;
            d3.getClass();
            dDoubleValue += d3.doubleValue();
        }
        Double dValueOf3 = Double.valueOf(dDoubleValue);
        if (dDoubleValue <= 0.0d) {
            dValueOf3 = null;
        }
        if (dValueOf3 != null) {
            double dDoubleValue2 = dValueOf3.doubleValue();
            int size2 = arrayList2.size();
            int i2 = 0;
            double dLongValue = 0.0d;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                Long l = ((g22) obj3).f;
                l.getClass();
                dLongValue += l.longValue();
            }
            dValueOf = Double.valueOf(dLongValue / dDoubleValue2);
        } else {
            dValueOf = null;
        }
        z21 z21VarL = vs0.l();
        boolean z = true;
        double dDoubleValue3 = 0.0d;
        Integer num = null;
        for (g22 g22Var2 : listD0) {
            Double d4 = g22Var2.g;
            Integer num2 = g22Var2.e;
            if (num2 != null) {
                if (num != null && (iIntValue = num2.intValue() - num.intValue()) > 0 && d4 != null && z) {
                    z21VarL.add(new ei0(g22Var2.a, iIntValue, d4.doubleValue() + dDoubleValue3));
                }
                z = true;
                dDoubleValue3 = 0.0d;
                num = num2;
            } else if (d4 != null) {
                dDoubleValue3 += d4.doubleValue();
            } else {
                z = false;
            }
        }
        z21 z21VarI = vs0.i(z21VarL);
        ListIterator listIterator = z21VarI.listIterator(0);
        int i3 = 0;
        while (true) {
            tm0 tm0Var = (tm0) listIterator;
            if (!tm0Var.hasNext()) {
                break;
            }
            i3 += ((ei0) tm0Var.next()).b;
        }
        Integer numValueOf = Integer.valueOf(i3);
        if (i3 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            ListIterator listIterator2 = z21VarI.listIterator(0);
            double d5 = 0.0d;
            while (true) {
                tm0 tm0Var2 = (tm0) listIterator2;
                if (!tm0Var2.hasNext()) {
                    break;
                }
                d5 += ((ei0) tm0Var2.next()).c;
            }
            dValueOf2 = Double.valueOf((d5 / ((double) iIntValue2)) * 100.0d);
        } else {
            dValueOf2 = null;
        }
        Double dValueOf4 = dValueOf2 != null ? dValueOf != null ? Double.valueOf((dValueOf2.doubleValue() / 100.0d) * dValueOf.doubleValue()) : null : null;
        int size3 = listD0.size();
        Iterator it = listD0.iterator();
        double dDoubleValue4 = 0.0d;
        while (it.hasNext()) {
            Double d6 = ((g22) it.next()).g;
            dDoubleValue4 += d6 != null ? d6.doubleValue() : 0.0d;
        }
        Iterator it2 = listD0.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            Long l2 = ((g22) it2.next()).f;
            jLongValue += l2 != null ? l2.longValue() : 0L;
        }
        Integer numValueOf2 = !z21VarI.isEmpty() ? Integer.valueOf(i3) : null;
        ei0 ei0Var = (ei0) vq.X(z21VarI);
        return new mi0(size3, dDoubleValue4, jLongValue, dValueOf, numValueOf2, dValueOf2, ei0Var != null ? Double.valueOf((ei0Var.c / ((double) ei0Var.b)) * 100.0d) : null, dValueOf4, z21VarI);
    }

    public static final void p(uy uyVar, CancellationException cancellationException) {
        ot0 ot0Var = (ot0) uyVar.p(q90.P);
        if (ot0Var != null) {
            ot0Var.d(cancellationException);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final da1 r(ur0 ur0Var, ak0 ak0Var, int i) {
        Object objL = ak0Var.L();
        is1 is1Var = cv.a;
        if (objL == is1Var) {
            objL = y12.s(Boolean.FALSE);
            ak0Var.g0(objL);
        }
        da1 da1Var = (da1) objL;
        boolean z = (((i & 14) ^ 6) > 4 && ak0Var.f(ur0Var)) || (i & 6) == 4;
        Object objL2 = ak0Var.L();
        if (z || objL2 == is1Var) {
            objL2 = new e(17, null, ur0Var, da1Var);
            ak0Var.g0(objL2);
        }
        s5.o((ij0) objL2, ak0Var, ur0Var);
        return da1Var;
    }

    public static final Object t(long j, tx txVar) {
        if (j > 0) {
            om omVar = new om(1, ex.y(txVar));
            omVar.v();
            if (j < Long.MAX_VALUE) {
                y(omVar.i).h(j, omVar);
            }
            Object objT = omVar.t();
            if (objT == fz.e) {
                return objT;
            }
        }
        return ll2.a;
    }

    public static final void u(uy uyVar) {
        ot0 ot0Var = (ot0) uyVar.p(q90.P);
        if (ot0Var != null && !ot0Var.b()) {
            throw ot0Var.r();
        }
    }

    public static int v(HandwritingGesture handwritingGesture, tr1 tr1Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        tr1Var.h(new es(fallbackText, 1));
        return 5;
    }

    public static final int x(xv1 xv1Var, String str) {
        xv1Var.getClass();
        int iS = qx.s(xv1Var, str);
        if (iS >= 0) {
            return iS;
        }
        int columnCount = xv1Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(xv1Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + vq.V(arrayList, null, null, null, null, 63) + ']');
    }

    public static final z30 y(uy uyVar) {
        sy syVarP = uyVar.p(q90.A);
        z30 z30Var = syVarP instanceof z30 ? (z30) syVarP : null;
        return z30Var == null ? u20.a : z30Var;
    }

    public static final ot0 z(uy uyVar) {
        ot0 ot0Var = (ot0) uyVar.p(q90.P);
        if (ot0Var != null) {
            return ot0Var;
        }
        qj.i(uyVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public void A(vv1 vv1Var, Object obj) {
        vv1Var.getClass();
        if (obj == null) {
            return;
        }
        xv1 xv1VarC = vv1Var.C(s());
        try {
            n(xv1VarC, obj);
            xv1VarC.y();
            ir2.h(xv1VarC, null);
            ei1.v(vv1Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    public abstract void n(xv1 xv1Var, Object obj);

    public abstract String s();

    public abstract yr1 w();
}

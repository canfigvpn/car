package defpackage;

import android.graphics.PointF;
import android.os.Build;
import android.view.inputmethod.ExtractedText;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx {
    public static jo0 a;
    public static final /* synthetic */ int b = 0;
    public static jo0 c;
    public static jo0 d;
    public static jo0 e;
    public static jo0 f;

    public static final int A(t81 t81Var, long j, on2 on2Var) {
        float f2 = on2Var != null ? on2Var.f() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = t81Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < t81Var.f(iE) - f2 || Float.intBitsToFloat(i) > t81Var.b(iE) + f2) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-f2) || Float.intBitsToFloat(i2) > t81Var.d + f2) {
            return -1;
        }
        return iE;
    }

    public static final int B(f11 f11Var, long j, on2 on2Var) {
        long jZ;
        int iA;
        if2 if2VarD = f11Var.d();
        if (if2VarD != null) {
            t81 t81Var = if2VarD.a.b;
            jw0 jw0VarC = f11Var.c();
            if (jw0VarC != null && (iA = A(t81Var, (jZ = jw0VarC.z(j)), on2Var)) != -1) {
                return t81Var.g(uf1.a((t81Var.b(iA) + t81Var.f(iA)) / 2.0f, 1, jZ));
            }
        }
        return -1;
    }

    public static final long C(f11 f11Var, yr1 yr1Var, int i) {
        fu1 fu1Var = is1.s;
        if2 if2VarD = f11Var.d();
        t81 t81Var = if2VarD != null ? if2VarD.a.b : null;
        jw0 jw0VarC = f11Var.c();
        return (t81Var == null || jw0VarC == null) ? of2.b : t81Var.h(yr1Var.i(jw0VarC.z(0L)), i, fu1Var);
    }

    public static final long D(f11 f11Var, yr1 yr1Var, yr1 yr1Var2, int i) {
        long jC = C(f11Var, yr1Var, i);
        if (of2.c(jC)) {
            return of2.b;
        }
        long jC2 = C(f11Var, yr1Var2, i);
        if (of2.c(jC2)) {
            return of2.b;
        }
        int i2 = (int) (jC >> 32);
        int i3 = (int) (jC2 & 4294967295L);
        return j02.c(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final jt1 E(hf2 hf2Var, int i) {
        gf2 gf2Var = hf2Var.a;
        t81 t81Var = hf2Var.b;
        if (gf2Var.a.f.length() != 0) {
            int iD = t81Var.d(i);
            if ((i != 0 && iD == t81Var.d(i - 1)) || (i != gf2Var.a.f.length() && iD == t81Var.d(i + 1))) {
                return hf2Var.a(i);
            }
        }
        return hf2Var.g(i);
    }

    public static final boolean H(ez ezVar) {
        ot0 ot0Var = (ot0) ezVar.h().p(q90.P);
        if (ot0Var != null) {
            return ot0Var.b();
        }
        return true;
    }

    public static final boolean I(hf2 hf2Var, int i) {
        t81 t81Var = hf2Var.b;
        int iD = t81Var.d(i);
        return i == hf2Var.f(iD) || i == t81Var.c(iD, false) ? hf2Var.g(i) != hf2Var.a(i) : hf2Var.a(i) != hf2Var.a(i - 1);
    }

    public static final boolean J(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean K(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean L(int i) {
        int type;
        return (!K(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final sz M(cg0 cg0Var) {
        int iOrdinal = cg0Var.K0().ordinal();
        sz szVar = sz.e;
        if (iOrdinal != 0) {
            sz szVar2 = sz.f;
            if (iOrdinal == 1) {
                cg0 cg0VarR = ux.r(cg0Var);
                if (cg0VarR == null) {
                    qj.r("ActiveParent with no focused child");
                    return null;
                }
                sz szVarM = M(cg0VarR);
                sz szVar3 = szVarM != szVar ? szVarM : null;
                if (szVar3 != null) {
                    return szVar3;
                }
                if (cg0Var.t) {
                    return szVar;
                }
                cg0Var.t = true;
                try {
                    wf0 wf0VarH0 = cg0Var.H0();
                    vf0 vf0Var = (vf0) ((e5) W(cg0Var)).getFocusOwner();
                    cg0 cg0VarF = vf0Var.f();
                    wf0VarH0.k.getClass();
                    cg0 cg0VarF2 = vf0Var.f();
                    if (cg0VarF == cg0VarF2 || cg0VarF2 == null) {
                        return szVar;
                    }
                    return xf0.d == xf0.c ? szVar2 : sz.g;
                } finally {
                    cg0Var.t = false;
                }
            }
            if (iOrdinal == 2) {
                return szVar2;
            }
            if (iOrdinal != 3) {
                qj.p();
                return null;
            }
        }
        return szVar;
    }

    public static final sz N(cg0 cg0Var) {
        if (!cg0Var.u) {
            cg0Var.u = true;
            try {
                wf0 wf0VarH0 = cg0Var.H0();
                vf0 vf0Var = (vf0) ((e5) W(cg0Var)).getFocusOwner();
                cg0 cg0VarF = vf0Var.f();
                wf0VarH0.j.getClass();
                cg0 cg0VarF2 = vf0Var.f();
                if (cg0VarF != cg0VarF2 && cg0VarF2 != null) {
                    return xf0.d == xf0.c ? sz.f : sz.g;
                }
            } finally {
                cg0Var.u = false;
            }
        }
        return sz.e;
    }

    public static final sz O(cg0 cg0Var) {
        t71 t71VarP;
        he1 he1Var;
        int iOrdinal = cg0Var.K0().ordinal();
        sz szVar = sz.e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cg0 cg0VarR = ux.r(cg0Var);
                if (cg0VarR != null) {
                    return M(cg0VarR);
                }
                qj.r("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    qj.p();
                    return null;
                }
                if (!cg0Var.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71 t71Var = cg0Var.e.i;
                ax0 ax0VarV = V(cg0Var);
                loop0: while (true) {
                    if (ax0VarV == null) {
                        t71VarP = null;
                        break;
                    }
                    if ((ax0VarV.I.f.h & 1024) != 0) {
                        while (t71Var != null) {
                            if ((t71Var.g & 1024) != 0) {
                                t71VarP = t71Var;
                                fa1 fa1Var = null;
                                while (t71VarP != null) {
                                    if (t71VarP instanceof cg0) {
                                        break loop0;
                                    }
                                    if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                        int i = 0;
                                        for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                            if ((t71Var2.g & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    t71VarP = t71Var2;
                                                } else {
                                                    if (fa1Var == null) {
                                                        fa1Var = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP != null) {
                                                        fa1Var.b(t71VarP);
                                                        t71VarP = null;
                                                    }
                                                    fa1Var.b(t71Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    t71VarP = P(fa1Var);
                                }
                            }
                            t71Var = t71Var.i;
                        }
                    }
                    ax0VarV = ax0VarV.u();
                    t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
                }
                cg0 cg0Var2 = (cg0) t71VarP;
                if (cg0Var2 == null) {
                    return szVar;
                }
                int iOrdinal2 = cg0Var2.K0().ordinal();
                if (iOrdinal2 == 0) {
                    return N(cg0Var2);
                }
                if (iOrdinal2 == 1) {
                    return O(cg0Var2);
                }
                if (iOrdinal2 == 2) {
                    return sz.f;
                }
                if (iOrdinal2 != 3) {
                    qj.p();
                    return null;
                }
                sz szVarO = O(cg0Var2);
                sz szVar2 = szVarO != szVar ? szVarO : null;
                return szVar2 == null ? N(cg0Var2) : szVar2;
            }
        }
        return szVar;
    }

    public static final t71 P(fa1 fa1Var) {
        int i;
        if (fa1Var == null || (i = fa1Var.g) == 0) {
            return null;
        }
        return (t71) fa1Var.k(i - 1);
    }

    public static final boolean Q(w91 w91Var, Object obj, Object obj2) {
        Object objG = w91Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof x91)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            w91Var.k(obj);
            return true;
        }
        x91 x91Var = (x91) objG;
        boolean zL = x91Var.l(obj2);
        if (zL && x91Var.g()) {
            w91Var.k(obj);
        }
        return zL;
    }

    public static final void R(w91 w91Var, Object obj) {
        boolean zG;
        long[] jArr = w91Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = w91Var.b[i4];
                        Object obj3 = w91Var.c[i4];
                        if (obj3 instanceof x91) {
                            x91 x91Var = (x91) obj3;
                            x91Var.l(obj);
                            zG = x91Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            w91Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void S(b40 b40Var) {
        h4 h4Var;
        ax0 ax0VarV = V(b40Var);
        if (ax0VarV.w) {
            return;
        }
        e5 e5Var = (e5) dx0.a(ax0VarV);
        if (!e5.f() || (h4Var = e5Var.Q) == null) {
            return;
        }
        h4Var.h.b.j(ax0VarV.f, new g4(h4Var, ax0VarV));
    }

    public static final me1 T(b40 b40Var, int i) {
        me1 me1Var = ((t71) b40Var).e.l;
        me1Var.getClass();
        if (me1Var.S0() != b40Var || !ne1.g(i)) {
            return me1Var;
        }
        me1 me1Var2 = me1Var.t;
        me1Var2.getClass();
        return me1Var2;
    }

    public static final me1 U(b40 b40Var) {
        if (!((t71) b40Var).e.r) {
            vp0.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        me1 me1VarT = T(b40Var, 2);
        if (!me1VarT.S0().r) {
            vp0.b("LayoutCoordinates is not attached.");
        }
        return me1VarT;
    }

    public static final ax0 V(b40 b40Var) {
        me1 me1Var = ((t71) b40Var).e.l;
        if (me1Var != null) {
            return me1Var.s;
        }
        throw k3.g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final aj1 W(b40 b40Var) {
        aj1 aj1Var = V(b40Var).r;
        if (aj1Var != null) {
            return aj1Var;
        }
        throw k3.g("This node does not have an owner.");
    }

    public static final u71 X(float f2) {
        r71 r71Var = r71.a;
        return f2 == 0.0f ? r71Var : nj2.v(r71Var, 0.0f, f2, null, 524031);
    }

    public static final mr0 Y(yr1 yr1Var) {
        return new mr0(Math.round(yr1Var.a), Math.round(yr1Var.b), Math.round(yr1Var.c), Math.round(yr1Var.d));
    }

    public static final void Z(int i, int i2, s12 s12Var) {
        s12Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(s12Var.e(i4));
            }
            i3 >>>= 1;
        }
        throw new q71(arrayList, s12Var.b());
    }

    public static final void a(me2 me2Var, gt gtVar, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(2080741862);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(me2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        int i3 = 1;
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            ir2.b(me2Var, gtVar, ak0Var, i2 & 126);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new fs(me2Var, gtVar, i, i3);
        }
    }

    public static final ExtractedText a0(te2 te2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = te2Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = te2Var.b;
        extractedText.selectionStart = of2.f(j);
        extractedText.selectionEnd = of2.e(j);
        extractedText.flags = !h92.D(te2Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final rx b(uy uyVar) {
        if (uyVar.p(q90.P) == null) {
            uyVar = uyVar.k(new qt0(null));
        }
        return new rx(uyVar);
    }

    public static final cs0 b0(s12 s12Var) {
        String strY = o92.y(s12Var.b(), "?", "");
        if (ws0.j(s12Var.c(), x12.b)) {
            return s12Var.h() ? cs0.y : cs0.x;
        }
        if (strY.equals("kotlin.Int")) {
            return s12Var.h() ? cs0.f : cs0.e;
        }
        if (strY.equals("kotlin.Boolean")) {
            return s12Var.h() ? cs0.h : cs0.g;
        }
        if (strY.equals("kotlin.Double")) {
            return s12Var.h() ? cs0.j : cs0.i;
        }
        if (strY.equals("kotlin.Float")) {
            return s12Var.h() ? cs0.l : cs0.k;
        }
        if (strY.equals("kotlin.Long")) {
            return s12Var.h() ? cs0.n : cs0.m;
        }
        if (strY.equals("kotlin.String")) {
            return s12Var.h() ? cs0.p : cs0.o;
        }
        if (strY.equals("kotlin.IntArray")) {
            return cs0.q;
        }
        if (strY.equals("kotlin.DoubleArray")) {
            return cs0.s;
        }
        if (strY.equals("kotlin.BooleanArray")) {
            return cs0.r;
        }
        if (strY.equals("kotlin.FloatArray")) {
            return cs0.t;
        }
        if (strY.equals("kotlin.LongArray")) {
            return cs0.u;
        }
        if (strY.equals("kotlin.Array")) {
            return cs0.v;
        }
        return strY.startsWith("kotlin.collections.ArrayList") ? cs0.w : cs0.z;
    }

    public static final mr0 c(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new mr0(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final long c0(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    public static final void d(Object obj, int i, qz0 qz0Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(872548579);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(qz0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.h(gtVar) ? 2048 : 1024;
        }
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = ak0Var.f(obj) | ak0Var.f(qz0Var);
            Object objL = ak0Var.L();
            Object obj2 = cv.a;
            if (zF || objL == obj2) {
                objL = new pz0(obj, qz0Var);
                ak0Var.g0(objL);
            }
            pz0 pz0Var = (pz0) objL;
            pz0Var.c = i;
            dk1 dk1Var = pz0Var.g;
            tq1 tq1Var = hm1.a;
            pz0 pz0Var2 = (pz0) ak0Var.j(tq1Var);
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            try {
                if (pz0Var2 != ((pz0) dk1Var.getValue())) {
                    dk1Var.setValue(pz0Var2);
                    if (pz0Var.d > 0) {
                        pz0 pz0Var3 = pz0Var.e;
                        if (pz0Var3 != null) {
                            pz0Var3.b();
                        }
                        if (pz0Var2 != null) {
                            pz0Var2.a();
                        } else {
                            pz0Var2 = null;
                        }
                        pz0Var.e = pz0Var2;
                    }
                }
                c12.s(o62VarJ, o62VarP, ej0VarE);
                boolean zF2 = ak0Var.f(pz0Var);
                Object objL2 = ak0Var.L();
                if (zF2 || objL2 == obj2) {
                    objL2 = new m(15, pz0Var);
                    ak0Var.g0(objL2);
                }
                s5.e(pz0Var, (ej0) objL2, ak0Var);
                sv.a(tq1Var.a(pz0Var), gtVar, ak0Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                c12.s(o62VarJ, o62VarP, ej0VarE);
                throw th;
            }
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ld(obj, i, qz0Var, gtVar, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x016f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0182  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void e(kl0 kl0Var, u71 u71Var, ry0 ry0Var, gj1 gj1Var, ie ieVar, ge geVar, pd0 pd0Var, boolean z, v6 v6Var, ej0 ej0Var, ak0 ak0Var, int i, int i2) {
        u71 u71Var2;
        ie ieVar2;
        ge geVar2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        gj1 gj1Var2;
        pd0 pd0Var2;
        v6 v6Var2;
        ie ieVar3;
        boolean z4;
        ge geVar3;
        lr1 lr1VarR;
        gj1 kj1Var;
        ie ieVar4;
        ge geVar4;
        int i5;
        v6 v6VarA;
        pd0 pd0Var3;
        ie ieVar5;
        boolean z5;
        int i6;
        boolean z6;
        Object objL;
        ak0Var.X(-2072102870);
        int i7 = i | (ak0Var.f(kl0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            u71Var2 = u71Var;
            i7 |= ak0Var.f(u71Var2) ? 32 : 16;
        } else {
            u71Var2 = u71Var;
        }
        int i8 = i7 | (ak0Var.f(ry0Var) ? 256 : 128) | 27648;
        if ((i & 196608) == 0) {
            if ((i2 & 32) == 0) {
                ieVar2 = ieVar;
                int i9 = ak0Var.f(ieVar2) ? 131072 : 65536;
                i8 |= i9;
            } else {
                ieVar2 = ieVar;
            }
            i8 |= i9;
        } else {
            ieVar2 = ieVar;
        }
        int i10 = i2 & 64;
        if (i10 == 0) {
            if ((i & 1572864) == 0) {
                geVar2 = geVar;
                i8 |= ak0Var.f(geVar2) ? 1048576 : 524288;
            }
            i3 = i8 | 373293056;
            if (ak0Var.h(ej0Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            z2 = true;
            if ((306783379 & i3) == 306783378 || (i4 & 3) != 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ak0Var.O(i3 & 1, z3)) {
                ak0Var.T();
                if ((i & 1) != 0 || ak0Var.y()) {
                    kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                    if ((i2 & 32) != 0) {
                        ieVar4 = ws0.g;
                        i3 &= -458753;
                    } else {
                        ieVar4 = ieVar2;
                    }
                    if (i10 != 0) {
                        geVar4 = ws0.e;
                    } else {
                        geVar4 = geVar2;
                    }
                    w20 w20VarB = sv.B(ak0Var);
                    i5 = i3 & (-1908408321);
                    geVar2 = geVar4;
                    v6VarA = yi1.a(ak0Var);
                    pd0Var3 = w20VarB;
                    ieVar5 = ieVar4;
                    z5 = true;
                } else {
                    ak0Var.R();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i5 = i3 & (-1908408321);
                    kj1Var = gj1Var;
                    pd0Var3 = pd0Var;
                    ieVar5 = ieVar2;
                    z5 = z;
                    v6VarA = v6Var;
                }
                ak0Var.q();
                i6 = (i5 & 14) | ((i5 >> 15) & 112);
                boolean z7 = (((i6 & 14) ^ 6) <= 4 && ak0Var.f(kl0Var)) || (i6 & 6) == 4;
                if ((((i6 & 112) ^ 48) > 32 || !ak0Var.f(geVar2)) && (i6 & 48) != 32) {
                }
                z6 = z7 | z2;
                objL = ak0Var.L();
                if (z6 || objL == cv.a) {
                    objL = new ml0(new x7(kl0Var, geVar2));
                    ak0Var.g0(objL);
                }
                int i11 = i5 >> 3;
                gj1 gj1Var3 = kj1Var;
                ux.d(u71Var2, ry0Var, (ml0) objL, gj1Var3, pd0Var3, z5, v6VarA, ieVar5, geVar2, ej0Var, ak0Var, (i11 & 112) | (i11 & 14) | 196608 | 12610560 | ((i5 << 12) & 1879048192), ((i5 >> 18) & 14) | ((i4 << 3) & 112));
                gj1Var2 = gj1Var3;
                ieVar3 = ieVar5;
                v6Var2 = v6VarA;
                z4 = z5;
                pd0Var2 = pd0Var3;
            } else {
                ak0Var.R();
                gj1Var2 = gj1Var;
                pd0Var2 = pd0Var;
                v6Var2 = v6Var;
                ieVar3 = ieVar2;
                z4 = z;
            }
            geVar3 = geVar2;
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new wx0(kl0Var, u71Var, ry0Var, gj1Var2, ieVar3, geVar3, pd0Var2, z4, v6Var2, ej0Var, i, i2);
            }
        }
        i8 |= 1572864;
        geVar2 = geVar;
        i3 = i8 | 373293056;
        if (ak0Var.h(ej0Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        z2 = true;
        if ((306783379 & i3) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (ak0Var.O(i3 & 1, z3)) {
            ak0Var.T();
            if ((i & 1) != 0) {
                kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                if ((i2 & 32) != 0) {
                    ieVar4 = ws0.g;
                    i3 &= -458753;
                } else {
                    ieVar4 = ieVar2;
                }
                if (i10 != 0) {
                    geVar4 = ws0.e;
                } else {
                    geVar4 = geVar2;
                }
                w20 w20VarB2 = sv.B(ak0Var);
                i5 = i3 & (-1908408321);
                geVar2 = geVar4;
                v6VarA = yi1.a(ak0Var);
                pd0Var3 = w20VarB2;
                ieVar5 = ieVar4;
                z5 = true;
            } else {
                kj1Var = new kj1(0.0f, 0.0f, 0.0f, 0.0f);
                if ((i2 & 32) != 0) {
                    ieVar4 = ws0.g;
                    i3 &= -458753;
                } else {
                    ieVar4 = ieVar2;
                }
                if (i10 != 0) {
                    geVar4 = ws0.e;
                } else {
                    geVar4 = geVar2;
                }
                w20 w20VarB3 = sv.B(ak0Var);
                i5 = i3 & (-1908408321);
                geVar2 = geVar4;
                v6VarA = yi1.a(ak0Var);
                pd0Var3 = w20VarB3;
                ieVar5 = ieVar4;
                z5 = true;
            }
            ak0Var.q();
            i6 = (i5 & 14) | ((i5 >> 15) & 112);
            if (((i6 & 14) ^ 6) <= 4) {
            }
            z2 = ((i6 & 112) ^ 48) > 32 ? false : false;
            z6 = z7 | z2;
            objL = ak0Var.L();
            if (z6) {
                objL = new ml0(new x7(kl0Var, geVar2));
                ak0Var.g0(objL);
            } else {
                objL = new ml0(new x7(kl0Var, geVar2));
                ak0Var.g0(objL);
            }
            int i12 = i5 >> 3;
            gj1 gj1Var4 = kj1Var;
            ux.d(u71Var2, ry0Var, (ml0) objL, gj1Var4, pd0Var3, z5, v6VarA, ieVar5, geVar2, ej0Var, ak0Var, (i12 & 112) | (i12 & 14) | 196608 | 12610560 | ((i5 << 12) & 1879048192), ((i5 >> 18) & 14) | ((i4 << 3) & 112));
            gj1Var2 = gj1Var4;
            ieVar3 = ieVar5;
            v6Var2 = v6VarA;
            z4 = z5;
            pd0Var2 = pd0Var3;
        } else {
            ak0Var.R();
            gj1Var2 = gj1Var;
            pd0Var2 = pd0Var;
            v6Var2 = v6Var;
            ieVar3 = ieVar2;
            z4 = z;
        }
        geVar3 = geVar2;
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new wx0(kl0Var, u71Var, ry0Var, gj1Var2, ieVar3, geVar3, pd0Var2, z4, v6Var2, ej0Var, i, i2);
        }
    }

    public static final void f(kb1 kb1Var, ew1 ew1Var, gt gtVar, ak0 ak0Var, int i) {
        ak0Var.X(233973821);
        if ((((ak0Var.h(kb1Var) ? 4 : 2) | i | (ak0Var.h(ew1Var) ? 32 : 16)) & 147) == 146 && ak0Var.A()) {
            ak0Var.R();
        } else {
            sv.b(new vq1[]{o31.a.a(kb1Var), j31.a.a(kb1Var), n31.a.a(kb1Var)}, vs0.C(1808964477, new ji(6, ew1Var, gtVar), ak0Var), ak0Var, 56);
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(kb1Var, ew1Var, gtVar, i, 10);
        }
    }

    public static final void g(boolean z, ij0 ij0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-642000585);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ak0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(ij0Var) ? 32 : 16;
        }
        int i4 = 0;
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            Object objA = k31.a(ak0Var);
            if (objA == null) {
                ak0Var.W(1512740606);
                objA = l31.a(ak0Var);
            } else {
                ak0Var.W(1512737723);
            }
            ak0Var.p(false);
            if (objA == null) {
                fu1.h("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = ak0Var.f(objA);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (zF || objL == is1Var) {
                id1 id1Var = objA instanceof id1 ? (id1) objA : null;
                e4 e4VarA = id1Var != null ? id1Var.a() : null;
                jg1 jg1Var = objA instanceof jg1 ? (jg1) objA : null;
                objL = new bg(e4VarA, jg1Var != null ? jg1Var.b() : null);
                ak0Var.g0(objL);
            }
            bg bgVar = (bg) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = s5.E(ak0Var);
                ak0Var.g0(objL2);
            }
            ez ezVar = (ez) objL2;
            long j = ak0Var.T;
            boolean zF2 = ak0Var.f(bgVar) | ak0Var.e(j);
            Object objL3 = ak0Var.L();
            if (zF2 || objL3 == is1Var) {
                objL3 = new nu(ezVar, new fp1(j, objA));
                ak0Var.g0(objL3);
            }
            nu nuVar = (nu) objL3;
            ak0Var.W(-348514256);
            boolean zH = ak0Var.h(nuVar) | ak0Var.h(ij0Var);
            Object objL4 = ak0Var.L();
            if (zH || objL4 == is1Var) {
                objL4 = new gp1(i4, nuVar, ij0Var);
                ak0Var.g0(objL4);
            }
            s5.v((ti0) objL4, ak0Var);
            int i5 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i5 & 14;
            boolean zH2 = ak0Var.h(nuVar) | (i6 == 4);
            Object objL5 = ak0Var.L();
            if (zH2 || objL5 == is1Var) {
                objL5 = new dg(nuVar, z, 3);
                ak0Var.g0(objL5);
            }
            mx.h(boolValueOf, nuVar, null, (ej0) objL5, ak0Var, i6);
            boolean zH3 = ak0Var.h(bgVar) | ak0Var.h(nuVar);
            Object objL6 = ak0Var.L();
            if (zH3 || objL6 == is1Var) {
                objL6 = new kc1(5, bgVar, nuVar);
                ak0Var.g0(objL6);
            }
            s5.f(bgVar, nuVar, (ej0) objL6, ak0Var);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eg(z, ij0Var, i, i3);
        }
    }

    public static final void h(ew1 ew1Var, gt gtVar, ak0 ak0Var, int i) {
        ak0Var.X(832919318);
        int i2 = (ak0Var.h(ew1Var) ? 4 : 2) | i | (ak0Var.h(gtVar) ? 32 : 16);
        int i3 = 0;
        if ((i2 & 19) == 18 && ak0Var.A()) {
            ak0Var.R();
        } else {
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new o01(11);
                ak0Var.g0(objL);
            }
            ej0 ej0Var = (ej0) objL;
            co2 co2VarA = o31.a(ak0Var);
            if (co2VarA == null) {
                fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            aq aqVarA = js1.a(hg.class);
            qp0 qp0Var = new qp0(0);
            qp0Var.a(js1.a(hg.class), ej0Var);
            hg hgVar = (hg) p12.r(aqVarA, co2VarA, qp0Var.b(), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
            hgVar.c = new mo2(ew1Var);
            ew1Var.b(hgVar.b, gtVar, ak0Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new nb1(ew1Var, gtVar, i, i3);
        }
    }

    public static final void i(w91 w91Var, Object obj, Object obj2) {
        int iF = w91Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : w91Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof x91) {
                ((x91) obj3).a(obj2);
            } else if (obj3 != obj2) {
                x91 x91Var = new x91();
                x91Var.a(obj3);
                x91Var.a(obj2);
                obj2 = x91Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            w91Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        w91Var.b[i] = obj;
        w91Var.c[i] = obj2;
    }

    public static final void j(fa1 fa1Var, t71 t71Var) {
        fa1 fa1VarZ = V(t71Var).z();
        int i = fa1VarZ.g - 1;
        Object[] objArr = fa1VarZ.e;
        if (i < objArr.length) {
            while (i >= 0) {
                fa1Var.b(((ax0) objArr[i]).I.f);
                i--;
            }
        }
    }

    public static final b92 k(n20 n20Var) {
        n20Var.getClass();
        b92 b92Var = n20Var instanceof b92 ? (b92) n20Var : null;
        if (b92Var != null) {
            return b92Var;
        }
        qj.q(js1.a(n20Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final void l(p61 p61Var) {
        p61Var.getClass();
        if ((p61Var instanceof c92 ? (c92) p61Var : null) != null) {
            return;
        }
        qj.q(js1.a(p61Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final sw0 m(t71 t71Var) {
        if ((t71Var.g & 2) != 0) {
            if (t71Var instanceof sw0) {
                return (sw0) t71Var;
            }
            if (t71Var instanceof c40) {
                t71 t71Var2 = ((c40) t71Var).t;
                while (t71Var2 != 0) {
                    if (t71Var2 instanceof sw0) {
                        return (sw0) t71Var2;
                    }
                    t71Var2 = (!(t71Var2 instanceof c40) || (t71Var2.g & 2) == 0) ? t71Var2.j : ((c40) t71Var2).t;
                }
            }
        }
        return null;
    }

    public static final void o(ez ezVar, x71 x71Var) {
        ot0 ot0Var = (ot0) ezVar.h().p(q90.P);
        if (ot0Var != null) {
            ot0Var.d(x71Var);
        } else {
            qj.i(ezVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void p(int i) {
        if (i >= 1) {
            return;
        }
        qj.f(k3.i("Expected positive parallelism level, but got ", i));
    }

    public static final boolean q(cg0 cg0Var, boolean z) {
        int iOrdinal = cg0Var.K0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cg0 cg0VarR = ux.r(cg0Var);
                if (!(cg0VarR != null ? q(cg0VarR, z) : true)) {
                    return false;
                }
                cg0Var.G0(bg0.f, bg0.g);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                qj.p();
                return false;
            }
        }
        return true;
    }

    public static final da1 r(q82 q82Var, ak0 ak0Var) {
        y11 y11Var = (y11) ak0Var.j(j31.a);
        Object value = q82Var.getValue();
        Object objH = y11Var.h();
        r11 r11Var = r11.h;
        Object obj = ab0.e;
        Object[] objArr = {q82Var, objH, r11Var, obj};
        boolean zH = ak0Var.h(objH) | ak0Var.d(r11Var.ordinal()) | ak0Var.h(obj) | ak0Var.h(q82Var);
        Object objL = ak0Var.L();
        Object obj2 = cv.a;
        if (zH || objL == obj2) {
            Object m7Var = new m7(objH, r11Var, obj, q82Var, null, 4);
            ak0Var.g0(m7Var);
            objL = m7Var;
        }
        ij0 ij0Var = (ij0) objL;
        Object objL2 = ak0Var.L();
        if (objL2 == obj2) {
            objL2 = y12.s(value);
            ak0Var.g0(objL2);
        }
        da1 da1Var = (da1) objL2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH2 = ak0Var.h(ij0Var);
        Object objL3 = ak0Var.L();
        if (zH2 || objL3 == obj2) {
            objL3 = new f72(ij0Var, da1Var, null, 2);
            ak0Var.g0(objL3);
        }
        ij0 ij0Var2 = (ij0) objL3;
        uy uyVar = ak0Var.R;
        boolean zF = false;
        for (Object obj3 : Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)) {
            zF |= ak0Var.f(obj3);
        }
        Object objL4 = ak0Var.L();
        if (!zF && objL4 != obj2) {
            return da1Var;
        }
        ak0Var.g0(new fw0(uyVar, ij0Var2));
        return da1Var;
    }

    public static final int s(xv1 xv1Var, String str) {
        xv1Var.getClass();
        int columnCount = xv1Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(xv1Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = xv1Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(xv1Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = xv1Var.getColumnCount();
            String strConcat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = xv1Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(strConcat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static w91 t() {
        long[] jArr = jx1.a;
        return new w91();
    }

    public static da1 u() {
        return new dk1(ll2.a, q90.U);
    }

    public static final boolean v(d70 d70Var, long j) {
        if (!d70Var.e.r) {
            return false;
        }
        bq0 bq0Var = V(d70Var).I.c;
        if (!bq0Var.V.r) {
            return false;
        }
        long jR = bq0Var.R(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR & 4294967295L));
        long j2 = d70Var.u;
        float f2 = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final Object w(ij0 ij0Var, sx sxVar) {
        mx1 mx1Var = new mx1(sxVar, sxVar.f());
        return c12.A(mx1Var, mx1Var, ij0Var);
    }

    public static void y(l80 l80Var, mx mxVar, long j) {
        if (mxVar instanceof hi1) {
            yr1 yr1Var = ((hi1) mxVar).i;
            l80Var.r0(3, j, (((long) Float.floatToRawIntBits(yr1Var.a)) << 32) | (((long) Float.floatToRawIntBits(yr1Var.b)) & 4294967295L), (((long) Float.floatToRawIntBits(yr1Var.c - yr1Var.a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(yr1Var.d - yr1Var.b))));
            return;
        }
        boolean z = mxVar instanceof ii1;
        fd0 fd0Var = fd0.a;
        if (!z) {
            if (mxVar instanceof gi1) {
                l80Var.W(((gi1) mxVar).i, j, fd0Var);
                return;
            } else {
                qj.p();
                return;
            }
        }
        ii1 ii1Var = (ii1) mxVar;
        d8 d8Var = ii1Var.j;
        if (d8Var != null) {
            l80Var.W(d8Var, j, fd0Var);
            return;
        }
        hv1 hv1Var = ii1Var.i;
        float f2 = hv1Var.b;
        float f3 = hv1Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (hv1Var.h >> 32));
        l80Var.u(j, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(hv1Var.c - f3)) << 32) | (((long) Float.floatToRawIntBits(hv1Var.d - f2)) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static jo0 z() {
        jo0 jo0Var = f;
        if (jo0Var != null) {
            return jo0Var;
        }
        io0 io0Var = new io0("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i = jm2.a;
        o72 o72Var = new o72(dr.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new xk1(7.0f, 10.0f));
        arrayList.add(new el1(5.0f, 5.0f));
        arrayList.add(new el1(5.0f, -5.0f));
        arrayList.add(tk1.c);
        io0.a(io0Var, arrayList, o72Var);
        jo0 jo0VarB = io0Var.b();
        f = jo0VarB;
        return jo0VarB;
    }

    public void F(vv1 vv1Var, Object obj) {
        if (obj == null) {
            return;
        }
        xv1 xv1VarC = vv1Var.C(x());
        try {
            n(xv1VarC, obj);
            xv1VarC.y();
            ir2.h(xv1VarC, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    public long G(vv1 vv1Var, Object obj) {
        xv1 xv1VarC = vv1Var.C(x());
        try {
            n(xv1VarC, obj);
            xv1VarC.y();
            ir2.h(xv1VarC, null);
            if (ei1.v(vv1Var) == 0) {
                return -1L;
            }
            xv1 xv1VarC2 = vv1Var.C("SELECT last_insert_rowid()");
            try {
                xv1VarC2.y();
                long j = xv1VarC2.getLong(0);
                ir2.h(xv1VarC2, null);
                return j;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ir2.h(xv1VarC2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ir2.h(xv1VarC, th3);
                throw th4;
            }
        }
    }

    public abstract void n(xv1 xv1Var, Object obj);

    public abstract String x();
}

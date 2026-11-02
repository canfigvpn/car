package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class jq extends c40 implements zn1, vv0, m02, si2, rv, lf1, mp0 {
    public static final is1 P = new is1(14);
    public ti0 A;
    public final gg0 B;
    public bp0 C;
    public b40 D;
    public rp1 E;
    public wn0 F;
    public final h91 G;
    public long H;
    public rp1 I;
    public f91 J;
    public boolean K;
    public dq0 L;
    public j82 M;
    public final is1 N;
    public wn1 O;
    public f91 u;
    public bp0 v;
    public boolean w;
    public String x;
    public wu1 y;
    public boolean z;

    public jq(f91 f91Var, bp0 bp0Var, boolean z, boolean z2, String str, wu1 wu1Var, ti0 ti0Var) {
        this.u = f91Var;
        this.v = bp0Var;
        this.w = z;
        this.x = str;
        this.y = wu1Var;
        this.z = z2;
        this.A = ti0Var;
        this.B = new gg0(f91Var, 0, new f(1, this, jq.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = j41.a;
        this.G = new h91(6);
        this.H = 0L;
        f91 f91Var2 = this.u;
        this.J = f91Var2;
        this.K = f91Var2 == null;
        this.N = P;
    }

    @Override // defpackage.mp0
    public final void D(h7 h7Var, qn1 qn1Var) {
        ArrayList arrayList = (ArrayList) h7Var.g;
        N0();
        if (this.z) {
            dq0 dq0Var = this.L;
            if (dq0Var == null) {
                dq0Var = new dq0(this);
                this.L = dq0Var;
            }
            ti0 ti0Var = this.A;
            jq jqVar = (jq) dq0Var.f;
            int i = 0;
            if (qn1Var != qn1.f) {
                if (qn1Var != qn1.g || ((dp0) dq0Var.g) == null) {
                    return;
                }
                int size = arrayList.size();
                while (i < size) {
                    dp0 dp0Var = (dp0) arrayList.get(i);
                    if (dp0Var.i && dp0Var != ((dp0) dq0Var.g)) {
                        dq0Var.v();
                        return;
                    }
                    i++;
                }
                return;
            }
            dp0 dp0Var2 = (dp0) dq0Var.g;
            if (dp0Var2 == null) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dp0 dp0Var3 = (dp0) arrayList.get(i2);
                    if (!dp0Var3.h && dp0Var3.d) {
                        dp0 dp0Var4 = (dp0) arrayList.get(0);
                        dq0Var.g = dp0Var4;
                        jqVar.M0(dp0Var4.c, true);
                        dp0Var4.i = true;
                        return;
                    }
                }
                return;
            }
            long j = dp0Var2.c;
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                dp0 dp0Var5 = (dp0) arrayList.get(i3);
                if (dp0Var5.h && dp0Var5.d) {
                    if (Math.abs(uf1.c(uf1.d(((dp0) arrayList.get(0)).c, j))) > ((on2) ir2.j(jqVar, yv.t)).d()) {
                        dq0Var.v();
                        return;
                    }
                    return;
                }
            }
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                dp0 dp0Var6 = (dp0) arrayList.get(i4);
                if (dp0Var6.i || !dp0Var6.h || dp0Var6.d) {
                    int size5 = arrayList.size();
                    while (i < size5) {
                        if (((dp0) arrayList.get(i)).i) {
                            dq0Var.v();
                            return;
                        }
                        i++;
                    }
                    return;
                }
            }
            ((dp0) arrayList.get(0)).i = true;
            jqVar.L0(j, true);
            ti0Var.a();
            dq0Var.g = null;
        }
    }

    @Override // defpackage.zn1
    public final void G(pn1 pn1Var, qn1 qn1Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.H = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        N0();
        boolean z = this.z;
        qn1 qn1Var2 = qn1.f;
        sx sxVar = null;
        int i = 1;
        int i2 = 0;
        if (z && qn1Var == qn1Var2) {
            int i3 = pn1Var.f;
            if (i3 == 4) {
                nj2.y(t0(), null, new l(this, sxVar, i2), 3);
            } else if (i3 == 5) {
                nj2.y(t0(), null, new l(this, sxVar, i), 3);
            }
        }
        if (qn1Var != qn1Var2) {
            if (qn1Var != qn1.g || this.O == null) {
                return;
            }
            List list = pn1Var.a;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                wn1 wn1Var = (wn1) list.get(i4);
                if (wn1Var.b() && wn1Var != this.O) {
                    this.O = null;
                    K0(false);
                    return;
                }
            }
            return;
        }
        wn1 wn1Var2 = this.O;
        if (wn1Var2 == null) {
            if (bc2.c(pn1Var, true)) {
                wn1 wn1Var3 = (wn1) pn1Var.a.get(0);
                wn1Var3.a();
                this.O = wn1Var3;
                if (this.z) {
                    M0(wn1Var3.c, false);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = pn1Var.a;
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (!sv.p((wn1) list2.get(i5))) {
                long jY = qx.V(this).B.Y(((on2) ir2.j(this, yv.t)).g());
                float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jY >> 32)) - ((int) (j >> 32))) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jY & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                int size3 = list2.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    wn1 wn1Var4 = (wn1) list2.get(i6);
                    if (wn1Var4.b() || sv.N(wn1Var4, j, jFloatToRawIntBits)) {
                        this.O = null;
                        K0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((wn1) list2.get(0)).a();
        if (this.z) {
            L0(wn1Var2.c, false);
            this.A.a();
        }
        this.O = null;
    }

    @Override // defpackage.lf1
    public final void I() {
        if (this.w) {
            ux.C(this, new c(this, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void J0() {
        f91 f91Var = this.u;
        h91 h91Var = this.G;
        if (f91Var != null) {
            rp1 rp1Var = this.E;
            if (rp1Var != null) {
                f91Var.c(new qp1(rp1Var));
            }
            rp1 rp1Var2 = this.I;
            if (rp1Var2 != null) {
                f91Var.c(new qp1(rp1Var2));
            }
            wn0 wn0Var = this.F;
            if (wn0Var != null) {
                f91Var.c(new xn0(wn0Var));
            }
            Object[] objArr = h91Var.c;
            long[] jArr = h91Var.a;
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
                                f91Var.c(new qp1((rp1) objArr[(i << 3) + i3]));
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
        this.E = null;
        this.I = null;
        this.F = null;
        h91Var.a();
    }

    public final void K0(boolean z) {
        f91 f91Var = this.u;
        if (f91Var != null) {
            j82 j82Var = this.M;
            sx sxVar = null;
            if (j82Var == null || !j82Var.b()) {
                rp1 rp1Var = z ? this.I : this.E;
                if (rp1Var != null) {
                    qp1 qp1Var = new qp1(rp1Var);
                    ot0 ot0Var = (ot0) ((rx) t0()).e.p(q90.P);
                    nj2.y(t0(), null, new g(f91Var, qp1Var, ot0Var != null ? ot0Var.t(new d(0, f91Var, qp1Var)) : null, sxVar, 0), 3);
                }
            } else {
                j82 j82Var2 = this.M;
                if (j82Var2 != null) {
                    j82Var2.d(null);
                }
            }
            if (z) {
                this.I = null;
            } else {
                this.E = null;
            }
        }
    }

    public final void L0(long j, boolean z) {
        f91 f91Var = this.u;
        if (f91Var != null) {
            j82 j82Var = this.M;
            if (j82Var == null || !j82Var.b()) {
                rp1 rp1Var = z ? this.I : this.E;
                if (rp1Var != null) {
                    nj2.y(t0(), null, new i(rp1Var, f91Var, (sx) null), 3);
                }
            } else {
                j82Var.d(null);
                nj2.y(t0(), null, new h(j82Var, j, f91Var, (sx) null, 0), 3);
            }
            if (z) {
                this.I = null;
            } else {
                this.E = null;
            }
        }
    }

    public final void M0(long j, boolean z) {
        f91 f91Var = this.u;
        if (f91Var != null) {
            rp1 rp1Var = new rp1(j);
            cs1 cs1Var = new cs1();
            p12.m(this, cy1.t, new m(7, cs1Var));
            if (!cs1Var.e) {
                int i = kq.b;
                ViewParent parent = ux.E(this).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                if (z) {
                    this.I = rp1Var;
                } else {
                    this.E = rp1Var;
                }
                nj2.y(t0(), null, new i(f91Var, rp1Var, (sx) null), 3);
                return;
            }
            this.M = nj2.y(t0(), null, new j(f91Var, rp1Var, z, this, (sx) null), 3);
        }
    }

    public final void N0() {
        if (this.D != null) {
            return;
        }
        bp0 bp0Var = this.w ? this.C : this.v;
        if (bp0Var != null) {
            f91 f91Var = this.u;
            if (f91Var == null) {
                f91Var = new f91();
                this.u = f91Var;
            }
            this.B.K0(f91Var);
            f91 f91Var2 = this.u;
            f91Var2.getClass();
            b40 b40VarA = bp0Var.a(f91Var2);
            F0(b40VarA);
            this.D = b40VarA;
        }
    }

    public final void O0(f91 f91Var, bp0 bp0Var, boolean z, boolean z2, String str, wu1 wu1Var, ti0 ti0Var) {
        boolean z3;
        boolean z4;
        b40 b40Var;
        boolean z5 = true;
        if (ws0.j(this.J, f91Var)) {
            z3 = false;
        } else {
            J0();
            this.J = f91Var;
            this.u = f91Var;
            z3 = true;
        }
        if (!ws0.j(this.v, bp0Var)) {
            this.v = bp0Var;
            z3 = true;
        }
        if (this.w != z) {
            this.w = z;
            if (z) {
                I();
            }
            z3 = true;
        }
        boolean z6 = this.z;
        gg0 gg0Var = this.B;
        if (z6 != z2) {
            if (z2) {
                F0(gg0Var);
            } else {
                G0(gg0Var);
                J0();
            }
            n02.l(this);
            this.z = z2;
        }
        if (!ws0.j(this.x, str)) {
            this.x = str;
            n02.l(this);
        }
        if (!ws0.j(this.y, wu1Var)) {
            this.y = wu1Var;
            n02.l(this);
        }
        this.A = ti0Var;
        boolean z7 = this.K;
        f91 f91Var2 = this.J;
        if (z7 == (f91Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = f91Var2 == null;
            this.K = z4;
            if (z4 || this.D != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((b40Var = this.D) != null || !z4)) {
            if (b40Var != null) {
                G0(b40Var);
            }
            this.D = null;
            N0();
        }
        gg0Var.K0(this.u);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[LOOP:1: B:24:0x009c->B:29:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0106  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a A[LOOP:0: B:23:0x006e->B:44:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd A[EDGE_INSN: B:46:0x00cd->B:33:0x00cd BREAK  A[LOOP:0: B:23:0x006e->B:44:0x011a, LOOP_LABEL: LOOP:0: B:23:0x006e->B:44:0x011a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vv0
    public final boolean R(KeyEvent keyEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        long j2;
        long j3;
        int iNumberOfTrailingZeros;
        Object obj;
        rp1 rp1Var;
        long j4;
        N0();
        long jD0 = sv0.d0(keyEvent);
        boolean z2 = this.z;
        int i5 = 3;
        sx sxVar = null;
        h91 h91Var = this.G;
        int i6 = 1;
        if (z2) {
            int i7 = 2;
            if (sv0.g0(keyEvent) == 2 && sv0.i0(keyEvent)) {
                if (!h91Var.b(jD0)) {
                    rp1 rp1Var2 = new rp1(this.H);
                    h91Var.f(jD0, rp1Var2);
                    if (this.u == null) {
                        return true;
                    }
                    nj2.y(t0(), null, new k(this, rp1Var2, sxVar, i7), 3);
                    return true;
                }
            } else if (this.z && sv0.g0(keyEvent) == 1 && sv0.i0(keyEvent)) {
                h91Var.getClass();
                int iHashCode = Long.hashCode(jD0) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                i = i8 & 127;
                i2 = h91Var.d;
                i3 = (i8 >>> 7) & i2;
                i4 = 0;
                loop0: while (true) {
                    long[] jArr = h91Var.a;
                    int i9 = i3 >> 3;
                    int i10 = (i3 & 7) << 3;
                    z = i6;
                    j = (((-i10) >> 63) & (jArr[i9 + i6] << (64 - i10))) | (jArr[i9] >>> i10);
                    long j5 = (((long) i) * 72340172838076673L) ^ j;
                    j2 = -9187201950435737472L;
                    j3 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
                    while (j3 != 0) {
                        iNumberOfTrailingZeros = (i3 + (Long.numberOfTrailingZeros(j3) >> 3)) & i2;
                        j4 = j2;
                        if (h91Var.b[iNumberOfTrailingZeros] == jD0) {
                            break loop0;
                        }
                        j3 &= j3 - 1;
                        j2 = j4;
                    }
                    if ((j & ((~j) << 6) & j2) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i4 += 8;
                    i3 = (i3 + i4) & i2;
                    i6 = z ? 1 : 0;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    h91Var.e--;
                    long[] jArr2 = h91Var.a;
                    int i11 = h91Var.d;
                    int i12 = iNumberOfTrailingZeros >> 3;
                    int i13 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr2[i12] & (~(255 << i13))) | (254 << i13);
                    jArr2[i12] = j6;
                    jArr2[(((iNumberOfTrailingZeros - 7) & i11) + (i11 & 7)) >> 3] = j6;
                    Object[] objArr = h91Var.c;
                    obj = objArr[iNumberOfTrailingZeros];
                    objArr[iNumberOfTrailingZeros] = null;
                } else {
                    obj = null;
                }
                rp1Var = (rp1) obj;
                if (rp1Var != null) {
                    if (this.u != null) {
                        nj2.y(t0(), null, new k(this, rp1Var, sxVar, i5), 3);
                    }
                    this.A.a();
                }
                if (rp1Var != null) {
                    return z;
                }
                return false;
            }
        } else if (this.z) {
            h91Var.getClass();
            int iHashCode2 = Long.hashCode(jD0) * (-862048943);
            int i14 = iHashCode2 ^ (iHashCode2 << 16);
            i = i14 & 127;
            i2 = h91Var.d;
            i3 = (i14 >>> 7) & i2;
            i4 = 0;
            loop0: while (true) {
                long[] jArr3 = h91Var.a;
                int i15 = i3 >> 3;
                int i16 = (i3 & 7) << 3;
                z = i6;
                j = (((-i16) >> 63) & (jArr3[i15 + i6] << (64 - i16))) | (jArr3[i15] >>> i16);
                long j7 = (((long) i) * 72340172838076673L) ^ j;
                j2 = -9187201950435737472L;
                j3 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = (i3 + (Long.numberOfTrailingZeros(j3) >> 3)) & i2;
                    j4 = j2;
                    if (h91Var.b[iNumberOfTrailingZeros] == jD0) {
                        break loop0;
                        break loop0;
                    }
                    j3 &= j3 - 1;
                    j2 = j4;
                }
                if ((j & ((~j) << 6) & j2) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i4 += 8;
                i3 = (i3 + i4) & i2;
                i6 = z ? 1 : 0;
            }
            if (iNumberOfTrailingZeros >= 0) {
                h91Var.e--;
                long[] jArr4 = h91Var.a;
                int i17 = h91Var.d;
                int i18 = iNumberOfTrailingZeros >> 3;
                int i19 = (iNumberOfTrailingZeros & 7) << 3;
                long j8 = (jArr4[i18] & (~(255 << i19))) | (254 << i19);
                jArr4[i18] = j8;
                jArr4[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j8;
                Object[] objArr2 = h91Var.c;
                obj = objArr2[iNumberOfTrailingZeros];
                objArr2[iNumberOfTrailingZeros] = null;
            } else {
                obj = null;
            }
            rp1Var = (rp1) obj;
            if (rp1Var != null) {
                if (this.u != null) {
                    nj2.y(t0(), null, new k(this, rp1Var, sxVar, i5), 3);
                }
                this.A.a();
            }
            if (rp1Var != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        wu1 wu1Var = this.y;
        if (wu1Var != null) {
            w02.e(z02Var, wu1Var.a);
        }
        String str = this.x;
        c cVar = new c(this, 1);
        lv0[] lv0VarArr = w02.a;
        z02Var.a(h02.b, new p0(str, cVar));
        if (this.z) {
            this.B.e0(z02Var);
        } else {
            z02Var.a(u02.j, ll2.a);
        }
        I0(z02Var);
    }

    @Override // defpackage.zn1
    public final void f0() {
        wn0 wn0Var;
        f91 f91Var = this.u;
        if (f91Var != null && (wn0Var = this.F) != null) {
            f91Var.c(new xn0(wn0Var));
        }
        this.F = null;
        if (this.O != null) {
            this.O = null;
            K0(false);
        }
    }

    @Override // defpackage.m02
    public final boolean h0() {
        return true;
    }

    @Override // defpackage.vv0
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.si2
    public final Object p() {
        return this.N;
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }

    @Override // defpackage.t71
    public final void x0() {
        I();
        if (!this.K) {
            N0();
        }
        if (this.z) {
            F0(this.B);
        }
    }

    @Override // defpackage.t71
    public final void y0() {
        J0();
        if (this.J == null) {
            this.u = null;
        }
        b40 b40Var = this.D;
        if (b40Var != null) {
            G0(b40Var);
        }
        this.D = null;
    }

    @Override // defpackage.mp0
    public final void z() {
        dq0 dq0Var = this.L;
        if (dq0Var != null) {
            dq0Var.v();
        }
    }

    public void I0(z02 z02Var) {
    }
}

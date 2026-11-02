package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ak0 {
    public int A;
    public int B;
    public boolean C;
    public final zj0 D;
    public final ArrayList E;
    public boolean F;
    public k52 G;
    public l52 H;
    public o52 I;
    public boolean J;
    public sl1 K;
    public io L;
    public final ev M;
    public vj0 N;
    public od0 O;
    public v42 P;
    public final ov Q;
    public final uy R;
    public boolean S;
    public long T;
    public bk0 U;
    public final gl2 a;
    public final lv b;
    public final l52 c;
    public final z91 d;
    public final io e;
    public final io f;
    public final ao2 g;
    public final qv h;
    public dk0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public b91 p;
    public boolean q;
    public boolean r;
    public d91 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final rr0 n = new rr0();
    public final ArrayList s = new ArrayList();
    public final rr0 t = new rr0();
    public sl1 u = sl1.h;
    public final rr0 x = new rr0();
    public int z = -1;

    public ak0(gl2 gl2Var, lv lvVar, l52 l52Var, z91 z91Var, io ioVar, io ioVar2, ao2 ao2Var, qv qvVar) {
        this.a = gl2Var;
        this.b = lvVar;
        this.c = l52Var;
        this.d = z91Var;
        this.e = ioVar;
        this.f = ioVar2;
        this.g = ao2Var;
        this.h = qvVar;
        int i = 0;
        this.C = lvVar.f() || lvVar.d();
        this.D = new zj0(i, this);
        this.E = new ArrayList();
        k52 k52VarC = l52Var.c();
        k52VarC.c();
        this.G = k52VarC;
        l52 l52Var2 = new l52();
        if (lvVar.f()) {
            l52Var2.b();
        }
        if (lvVar.d()) {
            l52Var2.o = new d91();
        }
        this.H = l52Var2;
        o52 o52VarD = l52Var2.d();
        o52VarD.e(true);
        this.I = o52VarD;
        this.M = new ev(this, ioVar);
        k52 k52VarC2 = this.H.c();
        try {
            vj0 vj0VarA = k52VarC2.a(0);
            k52VarC2.c();
            this.N = vj0VarA;
            this.O = new od0();
            this.Q = new ov(this);
            uy uyVarJ = lvVar.j();
            uy uyVarZ = z();
            this.R = uyVarJ.k(uyVarZ == null ? ab0.e : uyVarZ);
        } catch (Throwable th) {
            k52VarC2.c();
            throw th;
        }
    }

    public static final int N(ak0 ak0Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        k52 k52Var;
        k52 k52Var2 = ak0Var.G;
        int i6 = 0;
        if (k52Var2.j(i)) {
            int i7 = k52Var2.i(i);
            Object objP = k52Var2.p(k52Var2.b, i);
            if (i7 == 206 && ws0.j(objP, hv.e)) {
                Object objH = k52Var2.h(i, 0);
                ek0 ek0Var = objH instanceof ek0 ? (ek0) objH : null;
                ss1 ss1Var = ek0Var != null ? ek0Var.a : null;
                xj0 xj0Var = ss1Var instanceof xj0 ? (xj0) ss1Var : null;
                if (xj0Var != null) {
                    x91 x91Var = xj0Var.e.e;
                    Object[] objArr = x91Var.b;
                    long[] jArr2 = x91Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr2[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i6;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        ak0 ak0Var2 = (ak0) objArr[(i8 << 3) + i11];
                                        l52 l52Var = ak0Var2.c;
                                        if (l52Var.f <= 0 || (l52Var.e[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            qv qvVar = ak0Var2.h;
                                            synchronized (qvVar.h) {
                                                qvVar.p();
                                                w91 w91Var = qvVar.r;
                                                qvVar.r = qx.t();
                                                try {
                                                    qvVar.z.c0(w91Var);
                                                } catch (Throwable th) {
                                                    qvVar.r = w91Var;
                                                    throw th;
                                                }
                                            }
                                            io ioVar = new io();
                                            ak0Var2.L = ioVar;
                                            k52 k52VarC = ak0Var2.c.c();
                                            try {
                                                ak0Var2.G = k52VarC;
                                                ev evVar = ak0Var2.M;
                                                io ioVar2 = evVar.b;
                                                try {
                                                    evVar.b = ioVar;
                                                    ak0Var2.M(0);
                                                    ev evVar2 = ak0Var2.M;
                                                    evVar2.b();
                                                    try {
                                                        if (evVar2.c) {
                                                            k52Var = k52VarC;
                                                            try {
                                                                evVar2.b.d.Z(sh1.c);
                                                                if (evVar2.c) {
                                                                    evVar2.d(false);
                                                                    evVar2.d(false);
                                                                    evVar2.b.d.Z(ch1.c);
                                                                    i5 = 0;
                                                                    evVar2.c = false;
                                                                }
                                                                evVar.b = ioVar2;
                                                                k52Var.c();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                evVar.b = ioVar2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            k52Var = k52VarC;
                                                        }
                                                        evVar.b = ioVar2;
                                                        k52Var.c();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        k52Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    k52Var = k52VarC;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                k52Var = k52VarC;
                                            }
                                        }
                                        ak0Var.b.r(ak0Var2.h);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i9 = i9;
                                    }
                                    j >>= i9;
                                    i11++;
                                    i9 = i9;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return k52Var2.o(i);
            }
            i3 = 1;
            if (!k52Var2.l(i)) {
                return k52Var2.o(i);
            }
        } else {
            i3 = 1;
            if (k52Var2.d(i)) {
                int i12 = k52Var2.b[(i * 5) + 3] + i;
                int iN = 0;
                for (int i13 = i + 1; i13 < i12; i13 += k52Var2.b[(i13 * 5) + 3]) {
                    boolean zL = k52Var2.l(i13);
                    if (zL) {
                        ak0Var.M.c();
                        ev evVar3 = ak0Var.M;
                        Object objN = k52Var2.n(i13);
                        evVar3.c();
                        evVar3.h.add(objN);
                    }
                    iN += N(ak0Var, i13, zL || z, zL ? 0 : i2 + iN);
                    if (zL) {
                        ak0Var.M.c();
                        ak0Var.M.a();
                    }
                }
                if (!k52Var2.l(i)) {
                    return iN;
                }
            } else if (!k52Var2.l(i)) {
                return k52Var2.o(i);
            }
        }
        return i3;
    }

    public final boolean A() {
        lr1 lr1VarX;
        return (this.S || this.y || this.w || (lr1VarX = x()) == null || (lr1VarX.b & 8) != 0) ? false : true;
    }

    public final void B(ArrayList arrayList) {
        ak0 ak0Var = this;
        io ioVar = ak0Var.f;
        ev evVar = ak0Var.M;
        io ioVar2 = evVar.b;
        try {
            evVar.b = ioVar;
            ioVar.d.Z(qh1.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                qj1 qj1Var = (qj1) arrayList.get(i);
                p81 p81Var = (p81) qj1Var.e;
                p81Var.getClass();
                vj0 vj0VarJ = sv.j(null);
                l52 l52VarA = n52.a(null);
                int iA = l52VarA.a(vj0VarJ);
                nr0 nr0Var = new nr0();
                evVar.b();
                bi1 bi1Var = evVar.b.d;
                bi1Var.Z(zg1.c);
                ex.P(bi1Var, 0, nr0Var, 1, vj0VarJ);
                if (l52VarA == ak0Var.H) {
                    if (!ak0Var.I.w) {
                        hv.a("Check failed");
                    }
                    ak0Var.v();
                }
                k52 k52VarC = l52VarA.c();
                try {
                    k52VarC.r(iA);
                    evVar.f = iA;
                    io ioVar3 = new io();
                    ak0Var.G(null, null, null, cb0.e, new vf(ak0Var, ioVar3, k52VarC, p81Var));
                    io ioVar4 = evVar.b;
                    ioVar4.getClass();
                    if (!ioVar3.d.Y()) {
                        bi1 bi1Var2 = ioVar4.d;
                        bi1Var2.Z(vg1.c);
                        ex.P(bi1Var2, 0, ioVar3, 1, nr0Var);
                    }
                    k52VarC.c();
                    evVar.b.d.Z(sh1.c);
                    i++;
                    ak0Var = this;
                } catch (Throwable th) {
                    k52VarC.c();
                    throw th;
                }
            }
            evVar.b();
            evVar.b.d.Z(dh1.c);
            evVar.f = 0;
            evVar.b = ioVar2;
        } catch (Throwable th2) {
            evVar.b = ioVar2;
            throw th2;
        }
    }

    public final void C(sl1 sl1Var, Object obj) {
        S(null, 126665345, null, 0);
        D();
        h0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                o52.y(this.I);
            }
            boolean z = (this.S || ws0.j(this.G.f(), sl1Var)) ? false : true;
            if (z) {
                J(sl1Var);
            }
            S(hv.c, 202, sl1Var, 0);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            rw.A(this, new gt(new x7(9, obj), true, -59194059));
            this.w = z2;
            p(false);
            this.K = null;
            this.T = j;
            p(false);
        } catch (Throwable th) {
            try {
                p61.r0(th, new wj0(2, this));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object D() {
        boolean z = this.S;
        is1 is1Var = cv.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof au1)) {
                return objM;
            }
        } else if (this.r) {
            hv.a("A call to createNode(), emitNode() or useNode() expected");
            return is1Var;
        }
        return is1Var;
    }

    public final List E() {
        lv lvVar = this.b;
        kv kvVarH = lvVar.h();
        qv qvVar = kvVarH != null ? (qv) kvVarH : null;
        if (qvVar != null) {
            l52 l52Var = qvVar.j;
            k52 k52VarC = n52.a(l52Var).c();
            try {
                Integer numA0 = sv0.a0(k52VarC, lvVar, 0, k52VarC.c);
                k52VarC.c();
                if (numA0 != null) {
                    k52 k52VarC2 = n52.a(l52Var).c();
                    try {
                        return vq.a0(sv0.m0(k52VarC2, numA0.intValue(), 0), qvVar.z.E());
                    } finally {
                        k52VarC2.c();
                    }
                }
            } catch (Throwable th) {
                k52VarC.c();
                throw th;
            }
        }
        return cb0.e;
    }

    public final int F(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    public final Object G(qv qvVar, qv qvVar2, Integer num, List list, ti0 ti0Var) {
        Object objA;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                qj1 qj1Var = (qj1) list.get(i2);
                lr1 lr1Var = (lr1) qj1Var.e;
                Object obj = qj1Var.f;
                if (obj != null) {
                    b0(lr1Var, obj);
                } else {
                    b0(lr1Var, null);
                }
            }
            if (qvVar == null) {
                objA = ti0Var.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (qvVar2 == null || qvVar2 == qvVar || iIntValue < 0) {
                    objA = ti0Var.a();
                } else {
                    qvVar.v = qvVar2;
                    qvVar.w = iIntValue;
                    try {
                        objA = ti0Var.a();
                        qvVar.v = null;
                        qvVar.w = 0;
                    } catch (Throwable th) {
                        qvVar.v = null;
                        qvVar.w = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                    objA = ti0Var.a();
                }
            }
            this.F = z;
            this.k = i;
            return objA;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void H() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak0.H():void");
    }

    public final void I() throws Throwable {
        int i;
        M(this.G.g);
        ev evVar = this.M;
        evVar.d(false);
        rr0 rr0Var = evVar.d;
        ak0 ak0Var = evVar.a;
        k52 k52Var = ak0Var.G;
        if (k52Var.c > 0 && rr0Var.a(-2) != (i = k52Var.i)) {
            if (!evVar.c && evVar.e) {
                evVar.d(false);
                evVar.b.d.Z(gh1.c);
                evVar.c = true;
            }
            if (i > 0) {
                vj0 vj0VarA = k52Var.a(i);
                rr0Var.c(i);
                evVar.d(false);
                bi1 bi1Var = evVar.b.d;
                bi1Var.Z(fh1.c);
                ex.O(bi1Var, 0, vj0VarA);
                evVar.c = true;
            }
        }
        evVar.b.d.Z(oh1.c);
        int i2 = evVar.f;
        k52 k52Var2 = ak0Var.G;
        evVar.f = k52Var2.b[(k52Var2.g * 5) + 3] + i2;
    }

    public final void J(sl1 sl1Var) {
        d91 d91Var = this.v;
        if (d91Var == null) {
            d91Var = new d91();
            this.v = d91Var;
        }
        d91Var.h(this.G.g, sl1Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void K(int i, int i2, int i3) {
        k52 k52Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (k52Var.q(i) == i2) {
                i3 = i2;
            } else if (k52Var.q(i2) == i) {
                i3 = i;
            } else if (k52Var.q(i) == k52Var.q(i2)) {
                i3 = k52Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = k52Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = k52Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = k52Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = k52Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = k52Var.q(iQ5)) {
                    i3 = k52Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (k52Var.l(i)) {
                this.M.a();
            }
            i = k52Var.q(i);
        }
        o(i2, i3);
    }

    public final Object L() {
        boolean z = this.S;
        is1 is1Var = cv.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof au1)) {
                return objM instanceof ek0 ? ((ek0) objM).a : objM;
            }
        } else if (this.r) {
            hv.a("A call to createNode(), emitNode() or useNode() expected");
            return is1Var;
        }
        return is1Var;
    }

    public final void M(int i) throws Throwable {
        boolean zL = this.G.l(i);
        ev evVar = this.M;
        if (zL) {
            evVar.c();
            Object objN = this.G.n(i);
            evVar.c();
            evVar.h.add(objN);
        }
        N(this, i, zL, 0);
        evVar.c();
        if (zL) {
            evVar.a();
        }
    }

    public final boolean O(int i, boolean z) {
        lr1 lr1VarX;
        if ((i & 1) == 0 && (this.S || this.y)) {
            v42 v42Var = this.P;
            if (v42Var != null && (lr1VarX = x()) != null && v42Var.b()) {
                int i2 = lr1VarX.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                lr1VarX.b = i3;
                lr1VarX.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                bi1 bi1Var = this.M.b.d;
                bi1Var.Z(nh1.c);
                ex.O(bi1Var, 0, lr1VarX);
                this.b.q(lr1VarX);
                return false;
            }
        } else if (!z && A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void P() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        k52 k52Var = this.G;
        int iG = k52Var.g();
        int[] iArr = k52Var.b;
        int i = k52Var.g;
        Object objP = i < k52Var.h ? k52Var.p(iArr, i) : null;
        Object objF = k52Var.f();
        int i2 = this.m;
        is1 is1Var = cv.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(is1Var)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            V(null, (iArr[(k52Var.g * 5) + 1] & 1073741824) != 0);
            H();
            k52Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(is1Var)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        V(null, (iArr[(k52Var.g * 5) + 1] & 1073741824) != 0);
        H();
        k52Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void Q() {
        k52 k52Var = this.G;
        int i = k52Var.i;
        this.l = i >= 0 ? k52Var.b[(i * 5) + 1] & 67108863 : 0;
        k52Var.t();
    }

    public final void R() {
        if (this.l != 0) {
            hv.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        lr1 lr1VarX = x();
        if (lr1VarX != null) {
            int i = lr1VarX.b;
            if ((i & 128) == 0) {
                lr1VarX.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            Q();
        } else {
            H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0357  */
    /* JADX WARN: Code duplicated, block: B:180:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:187:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x036f  */
    /* JADX WARN: Code duplicated, block: B:192:0x039d  */
    /* JADX WARN: Code duplicated, block: B:193:0x039f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void S(Object obj, int i, Object obj2, int i2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        dk0 dk0Var;
        dk0 dk0Var2;
        ArrayList arrayList;
        d91 d91Var;
        int i3;
        Object objValueOf;
        w91 w91Var;
        Object objG;
        p91 p91Var;
        o52 o52Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        k52 k52Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        k52 k52Var2;
        int i13;
        Object objP;
        o52 o52Var2;
        int i14;
        dk0 dk0Var3;
        Object obj4 = obj;
        if (this.r) {
            hv.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = cv.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                o52Var2 = this.I;
                i14 = o52Var2.t;
                if (z) {
                    o52Var2.P(i, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    o52Var2.P(i, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    o52Var2.P(i, obj4, obj5, false);
                }
                dk0Var3 = this.j;
                if (dk0Var3 != null) {
                    int i16 = (-2) - i14;
                    tv0 tv0Var = new tv0(-1, i, i16, -1);
                    dk0Var3.e.h(i16, new ol0(-1, this.k - dk0Var3.b, 0));
                    dk0Var3.d.add(tv0Var);
                }
                u(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    k52Var2 = this.G;
                    i13 = k52Var2.g;
                    if (i13 < k52Var2.h) {
                        objP = k52Var2.p(k52Var2.b, i13);
                    } else {
                        objP = null;
                    }
                    if (ws0.j(obj4, objP)) {
                        V(obj2, z);
                        z3 = z2;
                    }
                }
                k52Var = this.G;
                iArr = k52Var.b;
                arrayList2 = new ArrayList();
                if (k52Var.k <= 0) {
                    i10 = k52Var.g;
                    while (i10 < k52Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = k52Var.p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new tv0(objP2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new dk0(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            dk0Var = this.j;
            if (dk0Var != null) {
                arrayList = dk0Var.d;
                d91Var = dk0Var.e;
                i3 = dk0Var.b;
                if (obj4 != null) {
                    objValueOf = new wt0(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                w91Var = ((z81) dk0Var.f.getValue()).a;
                objG = w91Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof p91) {
                    p91Var = (p91) objG;
                    Object objK = p91Var.k(0);
                    if (p91Var.h()) {
                        w91Var.k(objValueOf);
                    }
                    if (p91Var.b == 1) {
                        w91Var.m(objValueOf, p91Var.e());
                    }
                    objG = objK;
                } else {
                    w91Var.k(objValueOf);
                }
                tv0 tv0Var2 = (tv0) objG;
                if (!z3 || tv0Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        o52 o52VarD = this.H.d();
                        this.I = o52VarD;
                        o52VarD.L();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    o52Var = this.I;
                    int i19 = o52Var.t;
                    if (z) {
                        o52Var.P(i, obj5, obj5, true);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        o52Var.P(i, obj5, obj2, false);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        o52Var.P(i, obj3, obj5, false);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    tv0 tv0Var3 = new tv0(-1, i, i20, -1);
                    d91Var.h(i20, new ol0(-1, this.k - i3, i4));
                    arrayList.add(tv0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    dk0Var2 = new dk0(i5, arrayList3);
                } else {
                    int i21 = tv0Var2.c;
                    arrayList.add(tv0Var2);
                    ol0 ol0Var = (ol0) d91Var.b(i21);
                    this.k = (ol0Var != null ? ol0Var.b : -1) + i3;
                    ol0 ol0Var2 = (ol0) d91Var.b(i21);
                    int i22 = ol0Var2 != null ? ol0Var2.a : -1;
                    int i23 = dk0Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = d91Var.c;
                            long[] jArr = d91Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                ol0 ol0Var3 = (ol0) objArr3[(i26 << 3) + i28];
                                                int i29 = ol0Var3.a;
                                                if (i29 == i22) {
                                                    ol0Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        ol0Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = d91Var.c;
                        long[] jArr2 = d91Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            ol0 ol0Var4 = (ol0) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = ol0Var4.a;
                                            if (i33 == i22) {
                                                ol0Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                ol0Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i25 = i9;
                                        i24 = i8;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    ev evVar = this.M;
                    int i34 = evVar.f;
                    ak0 ak0Var = evVar.a;
                    evVar.f = (i21 - ak0Var.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        evVar.d(false);
                        rr0 rr0Var = evVar.d;
                        k52 k52Var3 = ak0Var.G;
                        if (k52Var3.c > 0 && rr0Var.a(-2) != (i7 = k52Var3.i)) {
                            if (!evVar.c && evVar.e) {
                                evVar.d(false);
                                evVar.b.d.Z(gh1.c);
                                evVar.c = true;
                            }
                            if (i7 > 0) {
                                vj0 vj0VarA = k52Var3.a(i7);
                                rr0Var.c(i7);
                                evVar.d(false);
                                bi1 bi1Var = evVar.b.d;
                                bi1Var.Z(fh1.c);
                                ex.O(bi1Var, 0, vj0VarA);
                                evVar.c = true;
                            }
                        }
                        bi1 bi1Var2 = evVar.b.d;
                        bi1Var2.Z(kh1.c);
                        bi1Var2.g[bi1Var2.h - bi1Var2.e[bi1Var2.f - 1].a] = i6;
                    }
                    V(obj2, z);
                    dk0Var2 = null;
                }
            } else {
                dk0Var2 = null;
            }
            u(z, dk0Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            o52Var2 = this.I;
            i14 = o52Var2.t;
            if (z) {
                o52Var2.P(i, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                o52Var2.P(i, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                o52Var2.P(i, obj4, obj5, false);
            }
            dk0Var3 = this.j;
            if (dk0Var3 != null) {
                int i110 = (-2) - i14;
                tv0 tv0Var4 = new tv0(-1, i, i110, -1);
                dk0Var3.e.h(i110, new ol0(-1, this.k - dk0Var3.b, 0));
                dk0Var3.d.add(tv0Var4);
            }
            u(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                k52Var2 = this.G;
                i13 = k52Var2.g;
                if (i13 < k52Var2.h) {
                    objP = k52Var2.p(k52Var2.b, i13);
                } else {
                    objP = null;
                }
                if (ws0.j(obj4, objP)) {
                    V(obj2, z);
                    z3 = z2;
                }
            }
            k52Var = this.G;
            iArr = k52Var.b;
            arrayList2 = new ArrayList();
            if (k52Var.k <= 0) {
                i10 = k52Var.g;
                while (i10 < k52Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = k52Var.p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new tv0(objP3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new dk0(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        dk0Var = this.j;
        if (dk0Var != null) {
            arrayList = dk0Var.d;
            d91Var = dk0Var.e;
            i3 = dk0Var.b;
            if (obj4 != null) {
                objValueOf = new wt0(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            w91Var = ((z81) dk0Var.f.getValue()).a;
            objG = w91Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof p91) {
                p91Var = (p91) objG;
                Object objK2 = p91Var.k(0);
                if (p91Var.h()) {
                    w91Var.k(objValueOf);
                }
                if (p91Var.b == 1) {
                    w91Var.m(objValueOf, p91Var.e());
                }
                objG = objK2;
            } else {
                w91Var.k(objValueOf);
            }
            tv0 tv0Var5 = (tv0) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                o52 o52VarD2 = this.H.d();
                this.I = o52VarD2;
                o52VarD2.L();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            o52Var = this.I;
            int i113 = o52Var.t;
            if (z) {
                o52Var.P(i, obj5, obj5, true);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                o52Var.P(i, obj5, obj2, false);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                o52Var.P(i, obj3, obj5, false);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            tv0 tv0Var6 = new tv0(-1, i, i210, -1);
            d91Var.h(i210, new ol0(-1, this.k - i3, i4));
            arrayList.add(tv0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            dk0Var2 = new dk0(i5, arrayList4);
        } else {
            dk0Var2 = null;
        }
        u(z, dk0Var2);
    }

    public final void T() {
        S(null, -127, null, 0);
    }

    public final void U(int i, sg1 sg1Var) {
        S(sg1Var, i, null, 0);
    }

    public final void V(Object obj, boolean z) {
        if (z) {
            k52 k52Var = this.G;
            if (k52Var.k <= 0) {
                if ((k52Var.b[(k52Var.g * 5) + 1] & 1073741824) == 0) {
                    cp1.a("Expected a node group");
                }
                k52Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            ev evVar = this.M;
            evVar.getClass();
            evVar.d(false);
            bi1 bi1Var = evVar.b.d;
            bi1Var.Z(vh1.c);
            ex.O(bi1Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            S(null, i, null, 0);
            return;
        }
        if (this.r) {
            hv.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        k52 k52Var = this.G;
        boolean z = this.S;
        is1 is1Var = cv.a;
        if (z) {
            k52Var.k++;
            this.I.P(i, is1Var, is1Var, false);
            u(false, null);
            return;
        }
        if (k52Var.g() == i && ((i3 = k52Var.g) >= k52Var.h || (k52Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            k52Var.u();
            u(false, null);
            return;
        }
        if (k52Var.k <= 0 && (i2 = k52Var.g) != k52Var.h) {
            int i4 = this.k;
            I();
            this.M.e(i4, k52Var.s());
            dv1.I(this.s, i2, k52Var.g);
        }
        k52Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            o52 o52VarD = this.H.d();
            this.I = o52VarD;
            o52VarD.L();
            this.J = false;
            this.K = null;
        }
        o52 o52Var = this.I;
        o52Var.d();
        int i5 = o52Var.t;
        o52Var.P(i, is1Var, is1Var, false);
        this.N = o52Var.b(i5);
        u(false, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final ak0 X(int i) {
        lr1 lr1Var;
        boolean z;
        W(i);
        boolean z2 = this.S;
        ao2 ao2Var = this.g;
        ArrayList arrayList = this.E;
        qv qvVar = this.h;
        if (z2) {
            lr1 lr1Var2 = new lr1(qvVar);
            arrayList.add(lr1Var2);
            h0(lr1Var2);
            lr1Var2.e = this.B;
            lr1Var2.b &= -17;
            ao2Var.j();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iS = dv1.s(i2, arrayList2);
        et0 et0Var = iS >= 0 ? (et0) arrayList2.remove(iS) : null;
        Object objM = this.G.m();
        if (ws0.j(objM, cv.a)) {
            lr1Var = new lr1(qvVar);
            h0(lr1Var);
        } else {
            objM.getClass();
            lr1Var = (lr1) objM;
        }
        if (et0Var == null) {
            int i3 = lr1Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                lr1Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = lr1Var.b;
        lr1Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(lr1Var);
        lr1Var.e = this.B;
        lr1Var.b &= -17;
        ao2Var.j();
        int i5 = lr1Var.b;
        if ((i5 & 256) != 0) {
            lr1Var.b = (i5 & (-257)) | 512;
            bi1 bi1Var = this.M.b.d;
            bi1Var.Z(th1.c);
            ex.O(bi1Var, 0, lr1Var);
            if (!this.y) {
                int i6 = lr1Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    lr1Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void Y(Object obj) {
        if (!this.S && this.G.g() == 207 && !ws0.j(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        S(null, 207, obj, 0);
    }

    public final void Z() {
        S(null, 125, null, 2);
        this.r = true;
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        od0 od0Var = this.O;
        od0Var.f.W();
        od0Var.e.W();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        k52 k52Var = this.G;
        if (!k52Var.f) {
            k52Var.c();
        }
        if (this.I.w) {
            return;
        }
        v();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a0() {
        this.m = 0;
        this.G = this.c.c();
        S(null, 100, null, 0);
        lv lvVar = this.b;
        lvVar.t();
        sl1 sl1VarI = lvVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(sl1VarI);
        this.K = null;
        if (!this.q) {
            this.q = lvVar.e();
        }
        boolean zF = this.C;
        if (!zF) {
            zF = lvVar.f();
            this.C = zF;
        }
        if (zF) {
            a90 a90Var = pv.a;
            a90Var.getClass();
            sl1VarI = sl1VarI.b(a90Var, new y82(z()));
        }
        this.u = sl1VarI;
        Set set = (Set) vv.N(sl1VarI, vq0.a);
        if (set != null) {
            set.add(w());
            lvVar.o(set);
        }
        S(null, Long.hashCode(lvVar.g()), null, 0);
    }

    public final void b(ij0 ij0Var, Object obj) {
        if (this.S) {
            bi1 bi1Var = this.O.e;
            bi1Var.Z(wh1.c);
            ex.O(bi1Var, 0, obj);
            ij0Var.getClass();
            nj2.i(2, ij0Var);
            ex.O(bi1Var, 1, ij0Var);
            return;
        }
        ev evVar = this.M;
        evVar.b();
        bi1 bi1Var2 = evVar.b.d;
        bi1Var2.Z(wh1.c);
        ij0Var.getClass();
        nj2.i(2, ij0Var);
        ex.P(bi1Var2, 0, obj, 1, ij0Var);
    }

    public final boolean b0(lr1 lr1Var, Object obj) {
        vj0 vj0Var = lr1Var.c;
        if (vj0Var == null) {
            return false;
        }
        int iA = this.G.a.a(sv.j(vj0Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iS = dv1.s(iA, arrayList);
        if (iS < 0) {
            int i = -(iS + 1);
            if (!(obj instanceof v40)) {
                obj = null;
            }
            arrayList.add(i, new et0(lr1Var, iA, obj));
            return true;
        }
        et0 et0Var = (et0) arrayList.get(iS);
        if (!(obj instanceof v40)) {
            et0Var.c = null;
            return true;
        }
        Object obj2 = et0Var.c;
        if (obj2 == null) {
            et0Var.c = obj;
            return true;
        }
        if (obj2 instanceof x91) {
            ((x91) obj2).a(obj);
            return true;
        }
        x91 x91Var = kx1.a;
        x91 x91Var2 = new x91(2);
        x91Var2.k(obj2);
        x91Var2.k(obj);
        et0Var.c = x91Var2;
        return true;
    }

    public final boolean c(float f) {
        Object objD = D();
        if ((objD instanceof Float) && f == ((Number) objD).floatValue()) {
            return false;
        }
        h0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void c0(w91 w91Var) {
        ArrayList arrayList = this.s;
        for (int iO = vs0.o(arrayList); -1 < iO; iO--) {
            et0 et0Var = (et0) arrayList.get(iO);
            vj0 vj0Var = et0Var.a.c;
            vj0 vj0VarJ = vj0Var != null ? sv.j(vj0Var) : null;
            if (vj0VarJ == null || !vj0VarJ.a()) {
                arrayList.remove(iO);
            } else {
                int i = et0Var.b;
                int i2 = vj0VarJ.a;
                if (i != i2) {
                    et0Var.b = i2;
                }
            }
        }
        Object[] objArr = w91Var.b;
        Object[] objArr2 = w91Var.c;
        long[] jArr = w91Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            lr1 lr1Var = (lr1) obj;
                            vj0 vj0Var2 = lr1Var.c;
                            if (vj0Var2 != null) {
                                int i7 = sv.j(vj0Var2).a;
                                if (obj2 == is1.g) {
                                    obj2 = null;
                                }
                                arrayList.add(new et0(lr1Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        zq.H(arrayList, dv1.m);
    }

    public final boolean d(int i) {
        Object objD = D();
        if ((objD instanceof Integer) && i == ((Number) objD).intValue()) {
            return false;
        }
        h0(Integer.valueOf(i));
        return true;
    }

    public final void d0(int i, int i2) {
        if (i0(i) != i2) {
            if (i < 0) {
                b91 b91Var = this.p;
                if (b91Var == null) {
                    b91Var = new b91();
                    this.p = b91Var;
                }
                b91Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean e(long j) {
        Object objD = D();
        if ((objD instanceof Long) && j == ((Number) objD).longValue()) {
            return false;
        }
        h0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i, int i2) {
        int iI0 = i0(i);
        if (iI0 != i2) {
            int i3 = i2 - iI0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iI1 = i0(i) + i3;
                d0(i, iI1);
                for (int i4 = size; -1 < i4; i4--) {
                    dk0 dk0Var = (dk0) arrayList.get(i4);
                    if (dk0Var != null && dk0Var.a(i, iI1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                k52 k52Var = this.G;
                if (i < 0) {
                    i = k52Var.i;
                } else if (k52Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean f(Object obj) {
        if (ws0.j(D(), obj)) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final sl1 f0(sl1 sl1Var, sl1 sl1Var2) {
        sl1Var.getClass();
        rl1 rl1Var = new rl1(sl1Var);
        rl1Var.putAll(sl1Var2);
        sl1 sl1VarA = rl1Var.a();
        U(204, hv.d);
        D();
        h0(sl1VarA);
        D();
        h0(sl1Var2);
        p(false);
        return sl1VarA;
    }

    public final boolean g(boolean z) {
        Object objD = D();
        if ((objD instanceof Boolean) && z == ((Boolean) objD).booleanValue()) {
            return false;
        }
        h0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(Object obj) {
        if (obj instanceof ss1) {
            ek0 ek0Var = new ek0((ss1) obj, this.m - 1);
            if (this.S) {
                bi1 bi1Var = this.M.b.d;
                bi1Var.Z(mh1.c);
                ex.O(bi1Var, 0, ek0Var);
            }
            this.d.add(obj);
            obj = ek0Var;
        }
        h0(obj);
    }

    public final boolean h(Object obj) {
        if (D() == obj) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void h0(Object obj) {
        if (this.S) {
            o52 o52Var = this.I;
            if (o52Var.n <= 0 || o52Var.i == o52Var.k) {
                o52Var.E(obj);
                return;
            }
            d91 d91Var = o52Var.s;
            if (d91Var == null) {
                d91Var = new d91();
            }
            o52Var.s = d91Var;
            int i = o52Var.v;
            Object objB = d91Var.b(i);
            if (objB == null) {
                objB = new p91();
                d91Var.h(i, objB);
            }
            ((p91) objB).a(obj);
            return;
        }
        k52 k52Var = this.G;
        boolean z = k52Var.n;
        ev evVar = this.M;
        if (!z) {
            vj0 vj0VarA = k52Var.a(k52Var.i);
            bi1 bi1Var = evVar.b.d;
            bi1Var.Z(ug1.c);
            ex.P(bi1Var, 0, vj0VarA, 1, obj);
            return;
        }
        int iD = (k52Var.l - n52.d(k52Var.b, k52Var.i)) - 1;
        if (evVar.a.G.i - evVar.f >= 0) {
            evVar.d(true);
            bi1 bi1Var2 = evVar.b.d;
            bi1Var2.Z(hh1.g);
            ex.O(bi1Var2, 0, obj);
            bi1Var2.g[bi1Var2.h - bi1Var2.e[bi1Var2.f - 1].a] = iD;
            return;
        }
        k52 k52Var2 = this.G;
        vj0 vj0VarA2 = k52Var2.a(k52Var2.i);
        bi1 bi1Var3 = evVar.b.d;
        bi1Var3.Z(hh1.f);
        ex.P(bi1Var3, 0, obj, 1, vj0VarA2);
        bi1Var3.g[bi1Var3.h - bi1Var3.e[bi1Var3.f - 1].a] = iD;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        ev evVar = this.M;
        evVar.c = false;
        evVar.d.b = 0;
        evVar.f = 0;
        evVar.e = true;
        evVar.g = 0;
        evVar.h.clear();
        evVar.i = -1;
        evVar.j = -1;
        evVar.k = -1;
        evVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final int i0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        b91 b91Var = this.p;
        if (b91Var != null && b91Var.c(i) >= 0) {
            int iC = b91Var.c(i);
            if (iC >= 0) {
                return b91Var.c[iC];
            }
            fu1.k(k3.i("Cannot find value for key ", i));
        }
        return 0;
    }

    public final Object j(tq1 tq1Var) {
        return vv.N(l(), tq1Var);
    }

    public final void j0() {
        if (!this.r) {
            hv.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            hv.a("useNode() called while inserting");
        }
        k52 k52Var = this.G;
        Object objN = k52Var.n(k52Var.i);
        ev evVar = this.M;
        evVar.c();
        evVar.h.add(objN);
        if (this.y && (objN instanceof ju)) {
            evVar.b();
            evVar.b.d.Z(yh1.c);
        }
    }

    public final void k(ti0 ti0Var) {
        if (!this.r) {
            hv.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            hv.a("createNode() can only be called when inserting");
        }
        rr0 rr0Var = this.n;
        int i = rr0Var.a[rr0Var.b - 1];
        o52 o52Var = this.I;
        vj0 vj0VarB = o52Var.b(o52Var.v);
        this.l++;
        od0 od0Var = this.O;
        bi1 bi1Var = od0Var.e;
        bi1Var.Z(hh1.d);
        ex.O(bi1Var, 0, ti0Var);
        bi1Var.g[bi1Var.h - bi1Var.e[bi1Var.f - 1].a] = i;
        ex.O(bi1Var, 1, vj0VarB);
        bi1 bi1Var2 = od0Var.f;
        bi1Var2.Z(hh1.e);
        bi1Var2.g[bi1Var2.h - bi1Var2.e[bi1Var2.f - 1].a] = i;
        ex.O(bi1Var2, 0, vj0VarB);
    }

    public final sl1 l() {
        sl1 sl1Var;
        sl1 sl1Var2 = this.K;
        if (sl1Var2 != null) {
            return sl1Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        sg1 sg1Var = hv.c;
        if (z && this.J) {
            int iD = this.I.v;
            while (iD > 0) {
                if (this.I.r(iD) == 202 && ws0.j(this.I.s(iD), sg1Var)) {
                    Object objP = this.I.p(iD);
                    objP.getClass();
                    sl1 sl1Var3 = (sl1) objP;
                    this.K = sl1Var3;
                    return sl1Var3;
                }
                o52 o52Var = this.I;
                iD = o52Var.D(o52Var.b, iD);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    k52 k52Var = this.G;
                    if (ws0.j(k52Var.p(k52Var.b, iQ), sg1Var)) {
                        d91 d91Var = this.v;
                        if (d91Var == null || (sl1Var = (sl1) d91Var.b(iQ)) == null) {
                            k52 k52Var2 = this.G;
                            Object objB = k52Var2.b(k52Var2.b, iQ);
                            objB.getClass();
                            sl1Var = (sl1) objB;
                        }
                        this.K = sl1Var;
                        return sl1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        sl1 sl1Var4 = this.u;
        this.K = sl1Var4;
        return sl1Var4;
    }

    public final su m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        z21 z21VarL = vs0.l();
        o52 o52Var = this.I;
        z21VarL.addAll(sv0.O(o52Var, null, o52Var.t, null));
        k52 k52Var = this.G;
        boolean z = k52Var.f;
        int[] iArr = k52Var.b;
        if (z || k52Var.c == 0) {
            collection = cb0.e;
        } else {
            gr1 gr1Var = new gr1(k52Var);
            int iQ = k52Var.i;
            Object objValueOf = Integer.valueOf(k52Var.l - n52.d(iArr, iQ));
            while (iQ >= 0) {
                gr1Var.i(k52Var.i(iQ), k52Var.k(iQ) ? k52Var.p(iArr, iQ) : cv.a, k52Var.a.f(iQ), objValueOf);
                objValueOf = k52Var.a(iQ);
                iQ = k52Var.q(iQ);
            }
            collection = (ArrayList) gr1Var.a;
        }
        z21VarL.addAll(collection);
        z21VarL.addAll(E());
        return new su(vs0.i(z21VarL), this.C);
    }

    public final void n(w91 w91Var, ij0 ij0Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            hv.a("Reentrant composition is not supported");
        }
        this.g.j();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(x62.h().g());
            this.v = null;
            c0(w91Var);
            this.k = 0;
            int i = 1;
            this.F = true;
            try {
                a0();
                Object objD = D();
                if (objD != ij0Var && ij0Var != null) {
                    h0(ij0Var);
                }
                zj0 zj0Var = this.D;
                fa1 fa1VarA = e72.a();
                try {
                    fa1VarA.b(zj0Var);
                    sg1 sg1Var = hv.a;
                    if (ij0Var != null) {
                        U(200, sg1Var);
                        rw.A(this, ij0Var);
                        p(false);
                    } else if (!this.w || objD == null || objD.equals(cv.a)) {
                        P();
                    } else {
                        U(200, sg1Var);
                        nj2.i(2, objD);
                        rw.A(this, (ij0) objD);
                        p(false);
                    }
                    fa1VarA.k(fa1VarA.g - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        hv.a("Check failed");
                    }
                    v();
                    Trace.endSection();
                } catch (Throwable th) {
                    fa1VarA.k(fa1VarA.g - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    p61.r0(th2, new wj0(i, this));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        hv.a("Check failed");
                    }
                    v();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            ev evVar = this.M;
            evVar.c();
            evVar.h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        rr0 rr0Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        rr0 rr0Var2;
        int i7;
        x91 x91Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        rr0 rr0Var3 = this.n;
        int i15 = rr0Var3.a[rr0Var3.b - 2] - 1;
        boolean z2 = this.S;
        is1 is1Var = cv.a;
        if (z2) {
            o52 o52Var = this.I;
            int i16 = o52Var.v;
            int iR = o52Var.r(i16);
            Object objS = this.I.s(i16);
            Object objP = this.I.p(i16);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode()));
            } else if (objP == null || iR != 207 || objP.equals(is1Var)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iR);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            k52 k52Var = this.G;
            int i17 = k52Var.i;
            int i18 = k52Var.i(i17);
            k52 k52Var2 = this.G;
            Object objP2 = k52Var2.p(k52Var2.b, i17);
            k52 k52Var3 = this.G;
            Object objB = k52Var3.b(k52Var3.b, i17);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(is1Var)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        dk0 dk0Var = this.j;
        ArrayList arrayList4 = this.s;
        ev evVar = this.M;
        if (dk0Var != null) {
            d91 d91Var = dk0Var.e;
            int i20 = dk0Var.b;
            ArrayList arrayList5 = dk0Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = dk0Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                x91 x91Var2 = kx1.a;
                x91 x91Var3 = new x91();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    tv0 tv0Var = (tv0) arrayList5.get(i22);
                    if (hashSet2.contains(tv0Var)) {
                        rr0Var2 = rr0Var3;
                        i7 = i22;
                        if (!x91Var3.c(tv0Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                tv0 tv0Var2 = (tv0) arrayList6.get(i25);
                                if (tv0Var2 != tv0Var) {
                                    ol0 ol0Var = (ol0) d91Var.b(tv0Var2.c);
                                    int i26 = ol0Var != null ? ol0Var.b : -1;
                                    x91Var3.a(tv0Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        ol0 ol0Var2 = (ol0) d91Var.b(tv0Var2.c);
                                        int i27 = ol0Var2 != null ? ol0Var2.c : tv0Var2.d;
                                        x91Var = x91Var3;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = evVar.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (evVar.j == i28 - i30 && evVar.k == i29 - i30) {
                                                    evVar.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            evVar.c();
                                            evVar.j = i28;
                                            evVar.k = i29;
                                            evVar.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            evVar.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = d91Var.c;
                                                long[] jArr5 = d91Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    ol0 ol0Var3 = (ol0) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = ol0Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        ol0Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        ol0Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = d91Var.c;
                                            long[] jArr6 = d91Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                ol0 ol0Var4 = (ol0) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = ol0Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    ol0Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    ol0Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        x91Var = x91Var3;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    x91Var = x91Var3;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                ol0 ol0Var5 = (ol0) d91Var.b(tv0Var2.c);
                                int i41 = i10 + (ol0Var5 != null ? ol0Var5.c : tv0Var2.d);
                                i22 = i11;
                                dk0Var = dk0Var;
                                x91Var3 = x91Var;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                rr0Var3 = rr0Var2;
                            } else {
                                i23 = i25;
                                rr0Var3 = rr0Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        rr0Var2 = rr0Var3;
                        ol0 ol0Var6 = (ol0) d91Var.b(tv0Var.c);
                        int i42 = ol0Var6 != null ? ol0Var6.b : -1;
                        int i43 = tv0Var.c;
                        i7 = i22;
                        evVar.e(i42 + i20, tv0Var.d);
                        dk0Var.a(i43, 0);
                        evVar.f = (i43 - evVar.a.G.g) + evVar.f;
                        this.G.r(i43);
                        I();
                        this.G.s();
                        dv1.I(arrayList4, i43, this.G.b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    rr0Var3 = rr0Var2;
                }
                rr0Var = rr0Var3;
                arrayList = arrayList4;
                evVar.c();
                if (arrayList5.size() > 0) {
                    k52 k52Var4 = this.G;
                    evVar.f = (k52Var4.h - evVar.a.G.g) + evVar.f;
                    k52Var4.t();
                }
            } else {
                rr0Var = rr0Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            rr0Var = rr0Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            k52 k52Var5 = this.G;
            int i44 = k52Var5.m - k52Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    evVar.d(false);
                    rr0 rr0Var4 = evVar.d;
                    k52 k52Var6 = evVar.a.G;
                    if (k52Var6.c > 0 && rr0Var4.a(-2) != (i6 = k52Var6.i)) {
                        if (!evVar.c && evVar.e) {
                            evVar.d(false);
                            evVar.b.d.Z(gh1.c);
                            evVar.c = true;
                        }
                        if (i6 > 0) {
                            vj0 vj0VarA = k52Var6.a(i6);
                            rr0Var4.c(i6);
                            evVar.d(false);
                            bi1 bi1Var = evVar.b.d;
                            bi1Var.Z(fh1.c);
                            ex.O(bi1Var, 0, vj0VarA);
                            evVar.c = true;
                        }
                    }
                    bi1 bi1Var2 = evVar.b.d;
                    bi1Var2.Z(uh1.c);
                    bi1Var2.g[bi1Var2.h - bi1Var2.e[bi1Var2.f - 1].a] = i44;
                } else {
                    evVar.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            k52 k52Var7 = this.G;
            if (k52Var7.k > 0 || (i5 = k52Var7.g) == k52Var7.h) {
                break;
            }
            I();
            evVar.e(i45, this.G.s());
            dv1.I(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                od0 od0Var = this.O;
                bi1 bi1Var3 = od0Var.f;
                if (bi1Var3.f == 0) {
                    hv.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                bi1 bi1Var4 = od0Var.e;
                zh1[] zh1VarArr = bi1Var3.e;
                int i46 = bi1Var3.f - 1;
                bi1Var3.f = i46;
                zh1 zh1Var = zh1VarArr[i46];
                zh1VarArr[i46] = null;
                bi1Var4.Z(zh1Var);
                Object[] objArr7 = bi1Var3.i;
                Object[] objArr8 = bi1Var4.i;
                int i47 = bi1Var4.j;
                int i48 = zh1Var.b;
                int i49 = bi1Var3.j;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = bi1Var3.i;
                int i51 = bi1Var3.j;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = bi1Var3.g;
                int[] iArr2 = bi1Var4.g;
                int i52 = bi1Var4.h;
                int i53 = zh1Var.a;
                int i54 = bi1Var3.h;
                ve.u0(i52 - i53, i54 - i53, i54, iArr, iArr2);
                bi1Var3.j -= i48;
                bi1Var3.h -= i53;
                i19 = 1;
            }
            k52 k52Var8 = this.G;
            if (k52Var8.k <= 0) {
                cp1.a("Unbalanced begin/end empty");
            }
            k52Var8.k--;
            o52 o52Var2 = this.I;
            int i55 = o52Var2.v;
            o52Var2.i();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.j();
                this.I.e(true);
                vj0 vj0Var = this.N;
                boolean zY = this.O.e.Y();
                l52 l52Var = this.H;
                if (zY) {
                    evVar.b();
                    evVar.d(false);
                    rr0 rr0Var5 = evVar.d;
                    k52 k52Var9 = evVar.a.G;
                    if (k52Var9.c <= 0 || rr0Var5.a(-2) == (i4 = k52Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!evVar.c && evVar.e) {
                            evVar.d(false);
                            evVar.b.d.Z(gh1.c);
                            evVar.c = true;
                        }
                        if (i4 > 0) {
                            vj0 vj0VarA2 = k52Var9.a(i4);
                            rr0Var5.c(i4);
                            evVar.d(false);
                            bi1 bi1Var5 = evVar.b.d;
                            bi1Var5.Z(fh1.c);
                            ex.O(bi1Var5, 0, vj0VarA2);
                            i3 = 1;
                            evVar.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    evVar.c();
                    bi1 bi1Var6 = evVar.b.d;
                    bi1Var6.Z(ih1.c);
                    ex.P(bi1Var6, 0, vj0Var, i3, l52Var);
                    r3 = 0;
                } else {
                    od0 od0Var2 = this.O;
                    evVar.b();
                    evVar.d(false);
                    rr0 rr0Var6 = evVar.d;
                    k52 k52Var10 = evVar.a.G;
                    if (k52Var10.c > 0 && rr0Var6.a(-2) != (i2 = k52Var10.i)) {
                        if (!evVar.c && evVar.e) {
                            evVar.d(false);
                            evVar.b.d.Z(gh1.c);
                            evVar.c = true;
                        }
                        if (i2 > 0) {
                            vj0 vj0VarA3 = k52Var10.a(i2);
                            rr0Var6.c(i2);
                            evVar.d(false);
                            bi1 bi1Var7 = evVar.b.d;
                            bi1Var7.Z(fh1.c);
                            ex.O(bi1Var7, 0, vj0VarA3);
                            evVar.c = true;
                        }
                    }
                    evVar.c();
                    bi1 bi1Var8 = evVar.b.d;
                    bi1Var8.Z(jh1.c);
                    int i57 = bi1Var8.j - bi1Var8.e[bi1Var8.f - 1].b;
                    Object[] objArr10 = bi1Var8.i;
                    objArr10[i57] = vj0Var;
                    objArr10[i57 + 1] = l52Var;
                    objArr10[i57 + 2] = od0Var2;
                    this.O = new od0();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.f != 0) {
                    d0(i56, r3);
                    e0(i56, i19);
                }
            }
        } else {
            if (z) {
                evVar.a();
            }
            int i58 = evVar.a.G.i;
            rr0 rr0Var7 = evVar.d;
            int i59 = i;
            if (rr0Var7.a(i59) > i58) {
                hv.a("Missed recording an endGroup");
            }
            if (rr0Var7.a(i59) == i58) {
                evVar.d(false);
                rr0Var7.b();
                evVar.b.d.Z(ch1.c);
            }
            int i60 = this.G.i;
            if (i19 != i0(i60)) {
                e0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            evVar.c();
        }
        ArrayList arrayList7 = this.i;
        dk0 dk0Var2 = (dk0) arrayList7.remove(arrayList7.size() - 1);
        if (dk0Var2 != null && !z3) {
            dk0Var2.c++;
        }
        this.j = dk0Var2;
        this.k = rr0Var.b() + i19;
        this.m = rr0Var.b();
        this.l = rr0Var.b() + i19;
    }

    public final void q() {
        p(false);
        lr1 lr1VarX = x();
        if (lr1VarX != null) {
            int i = lr1VarX.b;
            if ((i & 1) != 0) {
                lr1VarX.b = i | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[LOOP:0: B:15:0x003e->B:27:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[EDGE_INSN: B:28:0x0082->B:29:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0082 A[SYNTHETIC] */
    public final lr1 r() {
        lr1 lr1Var;
        vj0 vj0VarA;
        md mdVar;
        ArrayList arrayList = this.E;
        int i = 1;
        lr1 lr1Var2 = !arrayList.isEmpty() ? (lr1) arrayList.remove(arrayList.size() - 1) : null;
        if (lr1Var2 != null) {
            lr1Var2.b &= -9;
            this.g.j();
            int i2 = this.B;
            l91 l91Var = lr1Var2.f;
            if (l91Var == null || (lr1Var2.b & 16) != 0) {
                mdVar = null;
                break;
            }
            Object[] objArr = l91Var.b;
            int[] iArr = l91Var.c;
            long[] jArr = l91Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                mdVar = null;
                break;
            }
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            if (iArr[i6] != i2) {
                                mdVar = new md(lr1Var2, i2, l91Var, i);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 == 8) {
                        if (i3 == length) {
                            i3++;
                        }
                    }
                    mdVar = null;
                    break;
                }
                if (i3 == length) {
                    mdVar = null;
                    break;
                }
                i3++;
            }
            ev evVar = this.M;
            if (mdVar != null) {
                bi1 bi1Var = evVar.b.d;
                bi1Var.Z(bh1.c);
                ex.P(bi1Var, 0, mdVar, 1, this.h);
            }
            int i7 = lr1Var2.b;
            if ((i7 & 512) != 0) {
                lr1Var2.b = i7 & (-513);
                bi1 bi1Var2 = evVar.b.d;
                bi1Var2.Z(eh1.c);
                ex.O(bi1Var2, 0, lr1Var2);
                int i8 = lr1Var2.b;
                lr1Var2.b = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    lr1Var2.b = i8 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (lr1Var2 != null) {
            int i9 = lr1Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (lr1Var2.c == null) {
                    if (this.S) {
                        o52 o52Var = this.I;
                        vj0VarA = o52Var.b(o52Var.v);
                    } else {
                        k52 k52Var = this.G;
                        vj0VarA = k52Var.a(k52Var.i);
                    }
                    lr1Var2.c = vj0VarA;
                }
                lr1Var2.b &= -5;
                lr1Var = lr1Var2;
            } else {
                lr1Var = null;
            }
        } else {
            lr1Var = null;
        }
        p(false);
        return lr1Var;
    }

    public final void s() {
        if (this.F || this.z != 0) {
            cp1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void t() {
        p(false);
        this.b.c();
        p(false);
        ev evVar = this.M;
        if (evVar.c) {
            evVar.d(false);
            evVar.d(false);
            evVar.b.d.Z(ch1.c);
            evVar.c = false;
        }
        evVar.b();
        if (evVar.d.b != 0) {
            hv.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            hv.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void u(boolean z, dk0 dk0Var) {
        this.i.add(this.j);
        this.j = dk0Var;
        int i = this.l;
        rr0 rr0Var = this.n;
        rr0Var.c(i);
        rr0Var.c(this.m);
        rr0Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void v() {
        l52 l52Var = new l52();
        if (this.C) {
            l52Var.b();
        }
        if (this.b.d()) {
            l52Var.o = new d91();
        }
        this.H = l52Var;
        o52 o52VarD = l52Var.d();
        o52VarD.e(true);
        this.I = o52VarD;
    }

    public final nv w() {
        bk0 bk0Var = this.U;
        if (bk0Var != null) {
            return bk0Var;
        }
        bk0 bk0Var2 = new bk0(this.h);
        this.U = bk0Var2;
        return bk0Var2;
    }

    public final lr1 x() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (lr1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean y() {
        if (!A() || this.w) {
            return true;
        }
        lr1 lr1VarX = x();
        return (lr1VarX == null || (lr1VarX.b & 4) == 0) ? false : true;
    }

    public final ov z() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }
}

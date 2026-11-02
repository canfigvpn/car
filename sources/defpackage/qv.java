package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qv implements kv {
    public int A;
    public final lv e;
    public final gl2 f;
    public final AtomicReference g = new AtomicReference(null);
    public final Object h = new Object();
    public final z91 i;
    public final l52 j;
    public final w91 k;
    public final x91 l;
    public final x91 m;
    public final w91 n;
    public final io o;
    public final io p;
    public final w91 q;
    public w91 r;
    public boolean s;
    public v42 t;
    public nl1 u;
    public qv v;
    public int w;
    public final ao2 x;
    public final rs1 y;
    public final ak0 z;

    public qv(lv lvVar, gl2 gl2Var) {
        this.e = lvVar;
        this.f = gl2Var;
        z91 z91Var = new z91(new x91());
        this.i = z91Var;
        l52 l52Var = new l52();
        if (lvVar.d()) {
            l52Var.o = new d91();
        }
        if (lvVar.f()) {
            l52Var.b();
        }
        this.j = l52Var;
        this.k = qx.t();
        this.l = new x91();
        this.m = new x91();
        this.n = qx.t();
        io ioVar = new io();
        this.o = ioVar;
        io ioVar2 = new io();
        this.p = ioVar2;
        this.q = qx.t();
        this.r = qx.t();
        ao2 ao2Var = new ao2(7, lvVar);
        this.x = ao2Var;
        this.y = new rs1(0);
        ak0 ak0Var = new ak0(gl2Var, lvVar, n52.a(l52Var), z91Var, ioVar, ioVar2, ao2Var, this);
        lvVar.p(ak0Var);
        this.z = ak0Var;
    }

    public final void A(ij0 ij0Var) {
        boolean zI = i();
        q();
        lv lvVar = this.e;
        if (!zI) {
            lvVar.a(this, ij0Var);
            return;
        }
        ak0 ak0Var = this.z;
        ak0Var.z = 0;
        ak0Var.y = true;
        lvVar.a(this, ij0Var);
        ak0Var.s();
    }

    public final void a() {
        this.g.set(null);
        this.o.d.W();
        this.p.d.W();
        z91 z91Var = this.i;
        if (z91Var.e.g()) {
            return;
        }
        rs1 rs1Var = this.y;
        try {
            rs1Var.i(z91Var, this.z.z());
            rs1Var.c();
        } finally {
            rs1Var.b();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.k.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof x91;
        ft0 ft0Var = ft0.e;
        x91 x91Var = this.l;
        x91 x91Var2 = this.m;
        w91 w91Var = this.q;
        if (!z2) {
            lr1 lr1Var = (lr1) objG;
            if (qx.Q(w91Var, obj, lr1Var) || lr1Var.b(obj) == ft0Var) {
                return;
            }
            if (lr1Var.g == null || z) {
                x91Var.a(lr1Var);
                return;
            } else {
                x91Var2.a(lr1Var);
                return;
            }
        }
        x91 x91Var3 = (x91) objG;
        Object[] objArr = x91Var3.b;
        long[] jArr = x91Var3.a;
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
                        lr1 lr1Var2 = (lr1) objArr[(i << 3) + i3];
                        if (!qx.Q(w91Var, obj, lr1Var2) && lr1Var2.b(obj) != ft0Var) {
                            if (lr1Var2.g == null || z) {
                                x91Var.a(lr1Var2);
                            } else {
                                x91Var2.a(lr1Var2);
                            }
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

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof lx1;
        w91 w91Var = this.n;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            x91 x91Var = ((lx1) set).e;
            Object[] objArr = x91Var.b;
            long[] jArr9 = x91Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof lr1) {
                                    ((lr1) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = w91Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof x91) {
                                            x91 x91Var2 = (x91) objG;
                                            Object[] objArr2 = x91Var2.b;
                                            long[] jArr10 = x91Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                b((v40) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            b((v40) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof lr1) {
                    ((lr1) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = w91Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof x91) {
                            x91 x91Var3 = (x91) objG2;
                            Object[] objArr3 = x91Var3.b;
                            long[] jArr12 = x91Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((v40) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((v40) objG2, z);
                        }
                    }
                }
            }
        }
        w91 w91Var2 = this.k;
        x91 x91Var4 = this.l;
        if (z) {
            x91 x91Var5 = this.m;
            if (x91Var5.h()) {
                long[] jArr13 = w91Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = w91Var2.b[i18];
                                    Object obj5 = w91Var2.c[i18];
                                    if (obj5 instanceof x91) {
                                        x91 x91Var6 = (x91) obj5;
                                        Object[] objArr4 = x91Var6.b;
                                        long[] jArr14 = x91Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            lr1 lr1Var = (lr1) objArr5[i22];
                                                            if (x91Var5.c(lr1Var) || x91Var4.c(lr1Var)) {
                                                                x91Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = x91Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        lr1 lr1Var2 = (lr1) obj5;
                                        zG = x91Var5.c(lr1Var2) || x91Var4.c(lr1Var2);
                                    }
                                    if (zG) {
                                        w91Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                x91Var5.b();
                h();
                return;
            }
        }
        if (x91Var4.h()) {
            long[] jArr16 = w91Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = w91Var2.b[i26];
                                Object obj7 = w91Var2.c[i26];
                                if (obj7 instanceof x91) {
                                    x91 x91Var7 = (x91) obj7;
                                    Object[] objArr6 = x91Var7.b;
                                    long[] jArr17 = x91Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (x91Var4.c((lr1) objArr7[i30])) {
                                                            x91Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = x91Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = x91Var4.c((lr1) obj7);
                                }
                                if (zC) {
                                    w91Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            h();
            x91Var4.b();
        }
    }

    public final void d() {
        synchronized (this.h) {
            try {
                e(this.o);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        rs1 rs1Var = this.y;
                        try {
                            rs1Var.i(this.i, this.z.z());
                            rs1Var.c();
                        } finally {
                            rs1Var.b();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:78:0x0136 BREAK  A[LOOP:2: B:146:0x00e9->B:76:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: all -> 0x011c, LOOP:2: B:146:0x00e9->B:76:0x012c, LOOP_END, TryCatch #6 {all -> 0x011c, blocks: (B:60:0x00e9, B:62:0x00f8, B:64:0x0102, B:66:0x0108, B:68:0x0118, B:72:0x0121, B:78:0x0136, B:86:0x0158, B:89:0x016b, B:76:0x012c, B:81:0x0140, B:95:0x0189, B:97:0x0195), top: B:146:0x00e9 }] */
    public final void e(io ioVar) throws Throwable {
        rs1 rs1Var;
        long[] jArr;
        int i;
        long[] jArr2;
        rs1 rs1Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        io ioVar2 = this.p;
        ak0 ak0Var = this.z;
        ov ovVarZ = ak0Var.z();
        rs1 rs1Var3 = this.y;
        rs1Var3.i(this.i, ovVarZ);
        try {
            if (ioVar.d.Y()) {
                try {
                    if (ioVar2.d.Y() && this.u == null) {
                        rs1Var3.c();
                    }
                    return;
                } finally {
                    rs1Var3.b();
                }
            }
            nl1 nl1Var = this.u;
            ae aeVar = nl1Var != null ? nl1Var.l : this.f;
            try {
                Trace.beginSection(aeVar.equals(nl1Var != null ? nl1Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    nl1 nl1Var2 = this.u;
                    rs1 rs1Var4 = nl1Var2 != null ? nl1Var2.k : rs1Var3;
                    l52 l52Var = this.j;
                    ov ovVarZ2 = ak0Var.z();
                    o52 o52VarD = n52.a(l52Var).d();
                    int i3 = 0;
                    try {
                        ioVar.U(aeVar, o52VarD, rs1Var4, ovVarZ2);
                        o52VarD.e(true);
                        aeVar.g();
                        Trace.endSection();
                        rs1Var3.d();
                        rs1Var3.e();
                        if (this.s) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.s = false;
                                w91 w91Var = this.k;
                                long[] jArr3 = w91Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = w91Var.b[i8];
                                                    Object obj2 = w91Var.c[i8];
                                                    if (obj2 instanceof x91) {
                                                        x91 x91Var = (x91) obj2;
                                                        Object[] objArr = x91Var.b;
                                                        long[] jArr4 = x91Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        rs1Var2 = rs1Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((lr1) objArr[i13]).a()) {
                                                                                    x91Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = x91Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        rs1Var2 = rs1Var3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((lr1) obj2).a();
                                                    }
                                                    if (zG) {
                                                        w91Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    rs1Var2 = rs1Var3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                rs1Var3 = rs1Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            rs1Var = rs1Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            rs1Var = rs1Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        rs1Var3 = rs1Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    rs1Var = rs1Var3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            rs1Var = rs1Var3;
                        }
                        try {
                            if (ioVar2.d.Y() && this.u == null) {
                                rs1Var.c();
                            }
                            return;
                        } finally {
                            rs1Var.b();
                        }
                    } catch (Throwable th3) {
                        try {
                            o52VarD.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (ioVar2.d.Y() && this.u == null) {
                rs1Var3.c();
            }
            throw th;
        } finally {
            rs1Var3.b();
        }
    }

    public final void f() {
        synchronized (this.h) {
            try {
                io ioVar = this.p;
                ioVar.getClass();
                if (!ioVar.d.Y()) {
                    e(this.p);
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        rs1 rs1Var = this.y;
                        try {
                            rs1Var.i(this.i, this.z.z());
                            rs1Var.c();
                        } finally {
                            rs1Var.b();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.h) {
            try {
                this.z.v = null;
                if (!this.i.e.g()) {
                    rs1 rs1Var = this.y;
                    try {
                        rs1Var.i(this.i, this.z.z());
                        rs1Var.c();
                        rs1Var.b();
                    } catch (Throwable th) {
                        rs1Var.b();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.i.e.g()) {
                        rs1 rs1Var2 = this.y;
                        try {
                            rs1Var2.i(this.i, this.z.z());
                            rs1Var2.c();
                        } finally {
                            rs1Var2.b();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        w91 w91Var = this.n;
        long[] jArr3 = w91Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = w91Var.b[i10];
                            Object obj2 = w91Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof x91;
                            j5 = j8;
                            w91 w91Var2 = this.k;
                            if (z) {
                                x91 x91Var = (x91) obj2;
                                Object[] objArr = x91Var.b;
                                long[] jArr4 = x91Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!w91Var2.c((v40) objArr[i15])) {
                                                        x91Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = x91Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !w91Var2.c((v40) obj2);
                            }
                            if (zG) {
                                w91Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        x91 x91Var2 = this.m;
        if (!x91Var2.h()) {
            return;
        }
        Object[] objArr2 = x91Var2.b;
        long[] jArr5 = x91Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((lr1) objArr2[i20]).g == null) {
                            x91Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.h) {
            z = true;
            if (this.A != 1) {
                z = false;
            }
            if (z) {
                this.A = 0;
            }
        }
        return z;
    }

    public final void j(ij0 ij0Var) {
        try {
            synchronized (this.h) {
                n();
                w91 w91Var = this.r;
                this.r = qx.t();
                try {
                    ak0 ak0Var = this.z;
                    v42 v42Var = this.t;
                    if (!ak0Var.e.d.Y()) {
                        hv.a("Expected applyChanges() to have been called");
                    }
                    ak0Var.P = v42Var;
                    try {
                        ak0Var.n(w91Var, ij0Var);
                        ak0Var.P = null;
                    } catch (Throwable th) {
                        ak0Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.r = w91Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.i.e.g()) {
                    rs1 rs1Var = this.y;
                    try {
                        rs1Var.i(this.i, this.z.z());
                        rs1Var.c();
                    } finally {
                        rs1Var.b();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final nl1 k(boolean z, ij0 ij0Var) {
        if (this.u != null) {
            cp1.b("A pausable composition is in progress");
        }
        nl1 nl1Var = new nl1(this, this.e, this.z, this.i, ij0Var, z, this.f, this.h);
        this.u = nl1Var;
        return nl1Var;
    }

    public final void l() {
        synchronized (this.h) {
            try {
                if (this.u != null) {
                    cp1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.j.f == 0;
                if (!z || !this.i.e.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        rs1 rs1Var = this.y;
                        try {
                            rs1Var.i(this.i, this.z.z());
                            if (!z) {
                                l52 l52Var = this.j;
                                rs1 rs1Var2 = this.y;
                                o52 o52VarD = l52Var.d();
                                try {
                                    o52VarD.m(o52VarD.t, new jd(15, rs1Var2, o52VarD));
                                    o52VarD.e(true);
                                    this.f.g();
                                    rs1Var.d();
                                } catch (Throwable th) {
                                    o52VarD.e(false);
                                    throw th;
                                }
                            }
                            rs1Var.c();
                            rs1Var.b();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            rs1Var.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.k.a();
                this.n.a();
                this.r.a();
                this.o.d.W();
                this.p.d.W();
                ak0 ak0Var = this.z;
                ak0Var.E.clear();
                ak0Var.s.clear();
                ak0Var.e.d.W();
                ak0Var.v = null;
                this.A = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.h) {
            try {
                if (this.z.F) {
                    cp1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.A != 3) {
                    this.A = 3;
                    io ioVar = this.z.L;
                    if (ioVar != null) {
                        e(ioVar);
                    }
                    boolean z = this.j.f == 0;
                    if (!z || !this.i.e.g()) {
                        rs1 rs1Var = this.y;
                        try {
                            rs1Var.i(this.i, this.z.z());
                            if (!z) {
                                l52 l52Var = this.j;
                                rs1 rs1Var2 = this.y;
                                o52 o52VarD = l52Var.d();
                                try {
                                    o52VarD.m(o52VarD.t, new x7(4, rs1Var2));
                                    o52VarD.G();
                                    o52VarD.e(true);
                                    this.f.a();
                                    this.f.g();
                                    rs1Var.d();
                                } catch (Throwable th) {
                                    o52VarD.e(false);
                                    throw th;
                                }
                            }
                            rs1Var.c();
                            rs1Var.b();
                        } catch (Throwable th2) {
                            rs1Var.b();
                            throw th2;
                        }
                    }
                    ak0 ak0Var = this.z;
                    ak0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        ak0Var.b.u(ak0Var);
                        ak0Var.E.clear();
                        ak0Var.s.clear();
                        ak0Var.e.d.W();
                        ak0Var.v = null;
                        ak0Var.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.e.v(this);
    }

    public final void n() {
        Object obj = vs0.k;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                hv.b("pending composition has not been applied");
                qj.e();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                hv.b("corrupt pendingModifications drain: " + atomicReference);
                qj.e();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(null);
        if (ws0.j(andSet, vs0.k)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.u == null) {
                hv.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            hv.b("corrupt pendingModifications drain: " + atomicReference);
            qj.e();
        }
    }

    public final void p() {
        gb0 gb0Var = gb0.e;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(gb0Var);
        if (ws0.j(andSet, vs0.k) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            hv.b("corrupt pendingModifications drain: " + atomicReference);
            qj.e();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            cp1.b(str);
        }
        if (this.u == null) {
            return;
        }
        cp1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        z91 z91Var = this.i;
        ak0 ak0Var = this.z;
        if (arrayList.size() > 0) {
            ((p81) ((qj1) arrayList.get(0)).e).getClass();
            hv.a("Check failed");
        }
        try {
            ak0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    ak0Var.B(arrayList);
                    ak0Var.i();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                ak0Var.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!z91Var.e.g()) {
                    rs1 rs1Var = this.y;
                    try {
                        rs1Var.i(z91Var, ak0Var.z());
                        rs1Var.c();
                    } finally {
                        rs1Var.b();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final ft0 s(lr1 lr1Var, Object obj) {
        qv qvVar;
        int i = lr1Var.b;
        if ((i & 2) != 0) {
            lr1Var.b = i | 4;
        }
        vj0 vj0Var = lr1Var.c;
        if (vj0Var == null || !vj0Var.a()) {
            return ft0.e;
        }
        l52 l52Var = this.j;
        l52Var.getClass();
        vj0 vj0Var2 = lr1Var.c;
        if (vj0Var2 != null && l52Var.e(sv.j(vj0Var2))) {
            if (lr1Var.d == null) {
                return ft0.e;
            }
            ft0 ft0VarT = t(lr1Var, vj0Var, obj);
            if (ft0VarT != ft0.e) {
                this.x.j();
            }
            return ft0VarT;
        }
        synchronized (this.h) {
            qvVar = this.v;
        }
        if (qvVar != null) {
            ak0 ak0Var = qvVar.z;
            if (ak0Var.F && ak0Var.b0(lr1Var, obj)) {
                return ft0.h;
            }
        }
        return ft0.e;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final ft0 t(lr1 lr1Var, vj0 vj0Var, Object obj) {
        synchronized (this.h) {
            try {
                qv qvVar = this.v;
                qv qvVar2 = null;
                if (qvVar != null) {
                    l52 l52Var = this.j;
                    int i = this.w;
                    if (l52Var.k) {
                        hv.a("Writer is active");
                    }
                    if (i < 0 || i >= l52Var.f) {
                        hv.a("Invalid group index");
                    }
                    vj0 vj0VarJ = sv.j(vj0Var);
                    if (l52Var.e(vj0VarJ)) {
                        int i2 = l52Var.e[(i * 5) + 3] + i;
                        int i3 = vj0VarJ.a;
                        if (i > i3 || i3 >= i2) {
                            qvVar = null;
                        }
                    } else {
                        qvVar = null;
                    }
                    qvVar2 = qvVar;
                }
                if (qvVar2 == null) {
                    ak0 ak0Var = this.z;
                    if (ak0Var.F && ak0Var.b0(lr1Var, obj)) {
                        return ft0.h;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof v40;
                        w91 w91Var = this.r;
                        if (z) {
                            Object objG = w91Var.g(lr1Var);
                            if (objG == null) {
                                qx.i(this.r, lr1Var, obj);
                                break;
                            }
                            if (objG instanceof x91) {
                                x91 x91Var = (x91) objG;
                                Object[] objArr = x91Var.b;
                                long[] jArr = x91Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    qx.i(this.r, lr1Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == is1.g) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        qx.i(this.r, lr1Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        qx.i(this.r, lr1Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objG != is1.g) {
                                    qx.i(this.r, lr1Var, obj);
                                    break;
                                }
                            }
                        } else {
                            w91Var.m(lr1Var, is1.g);
                        }
                    } else {
                        this.r.m(lr1Var, is1.g);
                    }
                }
                if (qvVar2 != null) {
                    return qvVar2.t(lr1Var, vj0Var, obj);
                }
                this.e.l(this);
                return this.z.F ? ft0.g : ft0.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.k.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof x91;
        ft0 ft0Var = ft0.h;
        w91 w91Var = this.q;
        if (!z) {
            lr1 lr1Var = (lr1) objG;
            if (lr1Var.b(obj) == ft0Var) {
                qx.i(w91Var, obj, lr1Var);
                return;
            }
            return;
        }
        x91 x91Var = (x91) objG;
        Object[] objArr = x91Var.b;
        long[] jArr = x91Var.a;
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
                        lr1 lr1Var2 = (lr1) objArr[(i << 3) + i3];
                        if (lr1Var2.b(obj) == ft0Var) {
                            qx.i(w91Var, obj, lr1Var2);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean v(Set set) {
        boolean z = set instanceof lx1;
        w91 w91Var = this.n;
        w91 w91Var2 = this.k;
        if (z) {
            x91 x91Var = ((lx1) set).e;
            Object[] objArr = x91Var.b;
            long[] jArr = x91Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (w91Var2.c(obj) || w91Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (w91Var2.c(obj2) || w91Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        synchronized (this.h) {
            nl1 nl1Var = this.u;
            boolean z = false;
            if (nl1Var != null && (nl1Var.h.get() != pl1.i || nl1Var.i != y12.d())) {
                AtomicReference atomicReference = nl1Var.h;
                pl1 pl1Var = pl1.j;
                pl1 pl1Var2 = pl1.h;
                while (!atomicReference.compareAndSet(pl1Var, pl1Var2) && atomicReference.get() == pl1Var) {
                }
                nl1Var.l.e.a(9);
                return false;
            }
            n();
            try {
                w91 w91Var = this.r;
                this.r = qx.t();
                try {
                    ak0 ak0Var = this.z;
                    v42 v42Var = this.t;
                    bi1 bi1Var = ak0Var.e.d;
                    if (!bi1Var.Y()) {
                        hv.a("Expected applyChanges() to have been called");
                    }
                    if (w91Var.e > 0 || !ak0Var.s.isEmpty()) {
                        ak0Var.P = v42Var;
                        try {
                            ak0Var.n(w91Var, null);
                            ak0Var.P = null;
                            z = !bi1Var.Y();
                        } catch (Throwable th) {
                            ak0Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.r = w91Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.i.e.g()) {
                        rs1 rs1Var = this.y;
                        try {
                            rs1Var.i(this.i, this.z.z());
                            rs1Var.c();
                        } finally {
                            rs1Var.b();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(lx1 lx1Var) {
        Object obj;
        while (true) {
            Object obj2 = this.g.get();
            if (obj2 == null || obj2.equals(vs0.k)) {
                obj = lx1Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, lx1Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    fu1.g(this.g, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = lx1Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.g;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.h) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void y(Object obj) {
        lr1 lr1VarX;
        int i;
        boolean z;
        ak0 ak0Var = this.z;
        if (ak0Var.A <= 0 && (lr1VarX = ak0Var.x()) != null) {
            int i2 = lr1VarX.b | 1;
            lr1VarX.b = i2;
            if ((i2 & 32) == 0) {
                l91 l91Var = lr1VarX.f;
                if (l91Var == null) {
                    l91Var = new l91();
                    lr1VarX.f = l91Var;
                }
                int i3 = lr1VarX.e;
                int iC = l91Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = l91Var.c[iC];
                }
                l91Var.b[iC] = obj;
                l91Var.c[iC] = i3;
                if (i == lr1VarX.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.x.j();
            if (z) {
                return;
            }
            if (obj instanceof w82) {
                ((w82) obj).g(1);
            }
            qx.i(this.k, obj, lr1VarX);
            if (obj instanceof v40) {
                v40 v40Var = (v40) obj;
                u40 u40VarI = v40Var.i();
                w91 w91Var = this.n;
                qx.R(w91Var, obj);
                l91 l91Var2 = u40VarI.e;
                Object[] objArr = l91Var2.b;
                long[] jArr = l91Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    v82 v82Var = (v82) objArr[(i4 << 3) + i7];
                                    if (v82Var instanceof w82) {
                                        ((w82) v82Var).g(1);
                                    }
                                    qx.i(w91Var, v82Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = u40VarI.f;
                w91 w91Var2 = lr1VarX.g;
                if (w91Var2 == null) {
                    w91Var2 = new w91();
                    lr1VarX.g = w91Var2;
                }
                w91Var2.m(v40Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.h) {
            try {
                u(obj);
                Object objG = this.n.g(obj);
                if (objG != null) {
                    if (objG instanceof x91) {
                        x91 x91Var = (x91) objG;
                        Object[] objArr = x91Var.b;
                        long[] jArr = x91Var.a;
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
                                            u((v40) objArr[(i << 3) + i3]);
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
                    } else {
                        u((v40) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class ba1 extends o62 {
    public static final int[] n = new int[0];
    public final ej0 e;
    public final ej0 f;
    public int g;
    public x91 h;
    public ArrayList i;
    public u62 j;
    public int[] k;
    public int l;
    public boolean m;

    public ba1(long j, u62 u62Var, ej0 ej0Var, ej0 ej0Var2) {
        super(j, u62Var);
        this.e = ej0Var;
        this.f = ej0Var2;
        this.j = u62.i;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (x62.c) {
            this.j = this.j.e(j);
        }
    }

    public void B(x91 x91Var) {
        this.h = x91Var;
    }

    public ba1 C(ej0 ej0Var, ej0 ej0Var2) {
        td1 td1Var;
        if (this.c) {
            cp1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            cp1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = x62.c;
        synchronized (obj) {
            long j = x62.e;
            x62.e = j + 1;
            x62.d = x62.d.e(j);
            u62 u62VarD = d();
            r(u62VarD.e(j));
            td1Var = new td1(j, x62.a(u62VarD, g() + 1, j), x62.i(ej0Var, e(), true), x62.j(ej0Var2, i()), this);
        }
        if (this.m || this.c) {
            return td1Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = x62.e;
            x62.e = j2 + 1;
            s(j2);
            x62.d = x62.d.e(g());
        }
        r(x62.a(d(), jG + 1, g()));
        return td1Var;
    }

    @Override // defpackage.o62
    public final void b() {
        x62.d = x62.d.b(g()).a(this.j);
    }

    @Override // defpackage.o62
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (x62.c) {
            o();
        }
        l();
    }

    @Override // defpackage.o62
    public boolean f() {
        return false;
    }

    @Override // defpackage.o62
    public int h() {
        return this.g;
    }

    @Override // defpackage.o62
    public ej0 i() {
        return this.f;
    }

    @Override // defpackage.o62
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.o62
    public void l() {
        if (this.l <= 0) {
            cp1.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        x91 x91VarX = x();
        if (x91VarX != null) {
            if (this.m) {
                cp1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = x91VarX.b;
            long[] jArr = x91VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (x82 x82VarA = ((v82) objArr[(i2 << 3) + i4]).a(); x82VarA != null; x82VarA = x82VarA.b) {
                                    long j2 = x82VarA.a;
                                    if (j2 == jG || vq.O(this.j, Long.valueOf(j2))) {
                                        v22 v22Var = x62.a;
                                        x82VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.o62
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.o62
    public void n(v82 v82Var) {
        x91 x91VarX = x();
        if (x91VarX == null) {
            x91 x91Var = kx1.a;
            x91VarX = new x91();
            B(x91VarX);
        }
        x91VarX.a(v82Var);
    }

    @Override // defpackage.o62
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            x62.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.o62
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.o62
    public o62 u(ej0 ej0Var) {
        ud1 ud1Var;
        if (this.c) {
            cp1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            cp1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = x62.c;
        synchronized (obj) {
            long j = x62.e;
            x62.e = j + 1;
            x62.d = x62.d.e(j);
            ud1Var = new ud1(j, x62.a(d(), jG + 1, j), x62.i(ej0Var, e(), true), this);
        }
        if (this.m || this.c) {
            return ud1Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = x62.e;
            x62.e = j2 + 1;
            s(j2);
            x62.d = x62.d.e(g());
        }
        r(x62.a(d(), jG2 + 1, g()));
        return ud1Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (x62.c) {
            long j = x62.e;
            x62.e = j + 1;
            s(j);
            x62.d = x62.d.e(g());
        }
        r(x62.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public j12 w() {
        HashMap mapM;
        List list;
        x91 x91Var;
        long j;
        long j2;
        x91 x91VarX = x();
        if (x91VarX != null) {
            long j3 = x62.j.b;
            mapM = x62.m(j3, this, x62.d.b(j3));
        } else {
            mapM = null;
        }
        cb0 cb0Var = cb0.e;
        synchronized (x62.c) {
            try {
                x62.v(this);
                if (x91VarX == null || x91VarX.d == 0) {
                    b();
                    tk0 tk0Var = x62.j;
                    x91 x91Var2 = tk0Var.h;
                    x62.u(tk0Var, x62.a);
                    if (x91Var2 == null || !x91Var2.h()) {
                        list = cb0Var;
                        x91Var = null;
                    } else {
                        list = x62.h;
                        x91Var = x91Var2;
                    }
                } else {
                    tk0 tk0Var2 = x62.j;
                    j12 j12VarZ = z(x62.e, x91VarX, mapM, x62.d.b(tk0Var2.b));
                    if (!j12VarZ.equals(r62.a)) {
                        return j12VarZ;
                    }
                    b();
                    x91Var = tk0Var2.h;
                    x62.u(tk0Var2, x62.a);
                    B(null);
                    tk0Var2.h = null;
                    list = x62.h;
                }
                this.m = true;
                if (x91Var != null) {
                    lx1 lx1Var = new lx1(x91Var);
                    if (!x91Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((ij0) list.get(i)).g(lx1Var, this);
                        }
                    }
                }
                if (x91VarX != null && x91VarX.h()) {
                    lx1 lx1Var2 = new lx1(x91VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ij0) list.get(i2)).g(lx1Var2, this);
                    }
                }
                synchronized (x62.c) {
                    try {
                        p();
                        x62.d();
                        if (x91Var != null) {
                            Object[] objArr = x91Var.b;
                            long[] jArr = x91Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                x62.p((v82) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (x91VarX != null) {
                            Object[] objArr2 = x91VarX.b;
                            long[] jArr2 = x91VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                x62.p((v82) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                x62.p((v82) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return r62.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public x91 x() {
        return this.h;
    }

    @Override // defpackage.o62
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ej0 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final j12 z(long j, x91 x91Var, HashMap map, u62 u62Var) {
        ArrayList arrayList;
        ArrayList arrayListA0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        v82 v82Var;
        x82 x82Var;
        u62 u62Var2;
        Object[] objArr;
        long[] jArr;
        u62 u62Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        x82 x82VarB;
        u62 u62VarD = d().e(g()).d(this.j);
        Object[] objArr3 = x91Var.b;
        long[] jArr3 = x91Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListA0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            v82 v82Var2 = (v82) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            x82 x82VarA = v82Var2.a();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            x82 x82VarR = x62.r(x82VarA, j, u62Var);
                            if (x82VarR == null) {
                                arrayList4 = arrayListA0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListA0;
                                j2 = j3;
                                x82 x82VarR2 = x62.r(x82VarA, g(), u62VarD);
                                if (x82VarR2 != null && x82VarR2.a != 1 && !x82VarR.equals(x82VarR2)) {
                                    u62Var3 = u62VarD;
                                    x82 x82VarR3 = x62.r(x82VarA, g(), d());
                                    if (x82VarR3 == null) {
                                        x62.q();
                                        throw null;
                                    }
                                    if (map == null || (x82VarB = (x82) map.get(x82VarR)) == null) {
                                        x82VarB = v82Var2.b(x82VarR2, x82VarR, x82VarR3);
                                    }
                                    if (x82VarB == null) {
                                        return new q62(this);
                                    }
                                    if (!x82VarB.equals(x82VarR3)) {
                                        if (x82VarB.equals(x82VarR)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new qj1(v82Var2, x82VarR.b(g())));
                                            arrayListA0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListA0.add(v82Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!x82VarB.equals(x82VarR2) ? new qj1(v82Var2, x82VarB) : new qj1(v82Var2, x82VarR2.b(g())));
                                        }
                                    }
                                    arrayListA0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListA0 = arrayList4;
                            }
                            u62Var3 = u62VarD;
                            arrayList2 = arrayList5;
                            arrayListA0 = arrayList4;
                        } else {
                            u62Var3 = u62VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        u62VarD = u62Var3;
                    }
                    u62Var2 = u62VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    u62Var2 = u62VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    u62VarD = u62Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    qj1 qj1Var = (qj1) arrayList2.get(i2);
                    v82Var = (v82) qj1Var.e;
                    x82Var = (x82) qj1Var.f;
                    x82Var.a = j;
                    synchronized (x62.c) {
                        x82Var.b = v82Var.a();
                        v82Var.d(x82Var);
                    }
                }
            }
            if (arrayListA0 != null) {
                size = arrayListA0.size();
                for (i = 0; i < size; i++) {
                    x91Var.l((v82) arrayListA0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListA0 = vq.a0(arrayList3, arrayListA0);
                }
                this.i = arrayListA0;
            }
            return r62.a;
        }
        arrayList = null;
        arrayListA0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                qj1 qj1Var2 = (qj1) arrayList2.get(i2);
                v82Var = (v82) qj1Var2.e;
                x82Var = (x82) qj1Var2.f;
                x82Var.a = j;
                synchronized (x62.c) {
                    x82Var.b = v82Var.a();
                    v82Var.d(x82Var);
                }
            }
        }
        if (arrayListA0 != null) {
            size = arrayListA0.size();
            while (i < size) {
                x91Var.l((v82) arrayListA0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListA0 = vq.a0(arrayList3, arrayListA0);
            }
            this.i = arrayListA0;
        }
        return r62.a;
    }
}

package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s10 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ s10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.k = obj6;
        this.l = obj7;
        this.m = obj8;
        this.n = obj9;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0217 A[LOOP:2: B:122:0x01e0->B:137:0x0217, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0197 A[LOOP:4: B:275:0x0160->B:98:0x0197, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection, java.util.List] */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        boolean z;
        ll2 ll2Var;
        o62 o62Var;
        char c;
        long j;
        List list;
        List list2;
        boolean z2;
        switch (this.e) {
            case 0:
                lr0 lr0Var = (lr0) this.f;
                bm bmVar = (bm) this.g;
                em emVar = (em) this.h;
                ej0 ej0Var = (ej0) this.i;
                zl zlVar = (zl) this.j;
                Long l = (Long) this.k;
                r00 r00Var = (r00) this.l;
                n00 n00Var = (n00) this.m;
                l00 l00Var = (l00) this.n;
                kj1 kj1Var = e20.a;
                ((f01) obj).V(((lr0Var.f - lr0Var.e) + 1) * 12, null, jy0.g, new gt(new t10(bmVar, emVar, ej0Var, zlVar, l, r00Var, n00Var, l00Var), true, 72599078));
                return ll2.a;
            default:
                ll2 ll2Var2 = ll2.a;
                rr1 rr1Var = (rr1) this.f;
                x91 x91Var = (x91) this.g;
                x91 x91Var2 = (x91) this.h;
                List list3 = (List) this.i;
                List list4 = (List) this.j;
                x91 x91Var3 = (x91) this.k;
                ?? r8 = (List) this.l;
                x91 x91Var4 = (x91) this.m;
                Set set = (Set) this.n;
                long jLongValue = ((Long) obj).longValue();
                s82 s82Var = rr1.z;
                synchronized (rr1Var.c) {
                    z = rr1Var.z();
                }
                boolean z3 = false;
                if (z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((xf) rr1Var.a.g).f(new g6(1, jLongValue));
                        synchronized (x62.c) {
                            x91 x91Var5 = x62.j.h;
                            z2 = x91Var5 != null && x91Var5.h();
                        }
                        if (z2) {
                            x62.c();
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    rr1Var.K();
                    synchronized (rr1Var.c) {
                        try {
                            fa1 fa1Var = rr1Var.i;
                            Object[] objArr = fa1Var.e;
                            int i = fa1Var.g;
                            for (int i2 = 0; i2 < i; i2++) {
                                list3.add((qv) objArr[i2]);
                            }
                            rr1Var.i.g();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    x91Var.b();
                    x91Var2.b();
                    while (true) {
                        if (list3.isEmpty() && list4.isEmpty()) {
                            o62 o62VarH = x62.h();
                            o62 pi2Var = o62VarH instanceof ba1 ? new pi2((ba1) o62VarH, null, null, true, false) : new qi2(o62VarH, null, true, z3);
                            try {
                                o62 o62VarJ = pi2Var.j();
                                try {
                                    if (!r8.isEmpty()) {
                                        try {
                                            int size = r8.size();
                                            for (?? r3 = z3; r3 < size; r3++) {
                                                x91Var4.a((qv) r8.get(r3));
                                            }
                                            int size2 = r8.size();
                                            for (?? r4 = z3; r4 < size2; r4++) {
                                                ((qv) r8.get(r4)).d();
                                            }
                                            r8.clear();
                                        } catch (Throwable th3) {
                                            try {
                                                rr1Var.J(th3, null);
                                                qr1.t(rr1Var, list3, list4, r8, x91Var3, x91Var4, x91Var, x91Var2);
                                                r8.clear();
                                                o62.q(o62VarJ);
                                                pi2Var.c();
                                                Trace.endSection();
                                                return ll2Var2;
                                            } catch (Throwable th4) {
                                                r8.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    try {
                                        if (x91Var3.h()) {
                                            try {
                                                x91Var4.j(x91Var3);
                                                Object[] objArr2 = x91Var3.b;
                                                c = 7;
                                                long[] jArr = x91Var3.a;
                                                int length = jArr.length - 2;
                                                if (length >= 0) {
                                                    ll2Var = ll2Var2;
                                                    int i3 = 0;
                                                    j = 128;
                                                    while (true) {
                                                        try {
                                                            long j2 = jArr[i3];
                                                            o62Var = o62VarJ;
                                                            long[] jArr2 = jArr;
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                                                for (int i5 = 0; i5 < i4; i5++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        try {
                                                                            ((qv) objArr2[(i3 << 3) + i5]).f();
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            try {
                                                                                rr1Var.J(th, null);
                                                                                qr1.t(rr1Var, list3, list4, r8, x91Var3, x91Var4, x91Var, x91Var2);
                                                                                x91Var3.b();
                                                                                o62.q(o62Var);
                                                                                pi2Var.c();
                                                                                Trace.endSection();
                                                                                return ll2Var;
                                                                            } catch (Throwable th6) {
                                                                                x91Var3.b();
                                                                                throw th6;
                                                                            }
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i4 == 8) {
                                                                    if (i3 != length) {
                                                                        i3++;
                                                                        o62VarJ = o62Var;
                                                                        jArr = jArr2;
                                                                    }
                                                                }
                                                            } else if (i3 != length) {
                                                                i3++;
                                                                o62VarJ = o62Var;
                                                                jArr = jArr2;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            o62Var = o62VarJ;
                                                            rr1Var.J(th, null);
                                                            qr1.t(rr1Var, list3, list4, r8, x91Var3, x91Var4, x91Var, x91Var2);
                                                            x91Var3.b();
                                                            o62.q(o62Var);
                                                            pi2Var.c();
                                                            Trace.endSection();
                                                            return ll2Var;
                                                        }
                                                    }
                                                } else {
                                                    ll2Var = ll2Var2;
                                                    o62Var = o62VarJ;
                                                    j = 128;
                                                }
                                                x91Var3.b();
                                            } catch (Throwable th8) {
                                                th = th8;
                                                ll2Var = ll2Var2;
                                            }
                                        } else {
                                            ll2Var = ll2Var2;
                                            o62Var = o62VarJ;
                                            c = 7;
                                            j = 128;
                                        }
                                        if (x91Var4.h()) {
                                            try {
                                                Object[] objArr3 = x91Var4.b;
                                                long[] jArr3 = x91Var4.a;
                                                int length2 = jArr3.length - 2;
                                                if (length2 >= 0) {
                                                    int i6 = 0;
                                                    while (true) {
                                                        long j3 = jArr3[i6];
                                                        list = list3;
                                                        list2 = list4;
                                                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                            for (int i8 = 0; i8 < i7; i8++) {
                                                                if ((j3 & 255) < j) {
                                                                    try {
                                                                        ((qv) objArr3[(i6 << 3) + i8]).g();
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        try {
                                                                            rr1Var.J(th, null);
                                                                            qr1.t(rr1Var, list, list2, r8, x91Var3, x91Var4, x91Var, x91Var2);
                                                                            x91Var4.b();
                                                                            o62.q(o62Var);
                                                                            pi2Var.c();
                                                                            Trace.endSection();
                                                                            return ll2Var;
                                                                        } catch (Throwable th10) {
                                                                            x91Var4.b();
                                                                            throw th10;
                                                                        }
                                                                    }
                                                                }
                                                                j3 >>= 8;
                                                            }
                                                            if (i7 == 8) {
                                                                if (i6 != length2) {
                                                                    i6++;
                                                                    list3 = list;
                                                                    list4 = list2;
                                                                }
                                                            }
                                                        } else if (i6 != length2) {
                                                            i6++;
                                                            list3 = list;
                                                            list4 = list2;
                                                        }
                                                    }
                                                }
                                                x91Var4.b();
                                            } catch (Throwable th11) {
                                                th = th11;
                                                list = list3;
                                                list2 = list4;
                                            }
                                        }
                                        o62.q(o62Var);
                                        pi2Var.c();
                                        synchronized (rr1Var.c) {
                                            if (rr1Var.y() != null) {
                                                hv.a("unexpected to get continuation here");
                                                break;
                                            }
                                        }
                                        x62.h().m();
                                        x91Var2.b();
                                        x91Var.b();
                                        rr1Var.q = null;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        o62.q(o62Var);
                                        throw th;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    o62Var = o62VarJ;
                                    o62.q(o62Var);
                                    throw th;
                                }
                            } catch (Throwable th14) {
                                pi2Var.c();
                                throw th14;
                            }
                        } else {
                            ll2Var = ll2Var2;
                            try {
                                int size3 = list3.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    qv qvVar = (qv) list3.get(i9);
                                    qv qvVarI = rr1Var.I(qvVar, x91Var);
                                    if (qvVarI != null) {
                                        r8.add(qvVarI);
                                    }
                                    x91Var2.a(qvVar);
                                }
                                list3.clear();
                                if (x91Var.h() || rr1Var.i.g != 0) {
                                    synchronized (rr1Var.c) {
                                        try {
                                            List listD = rr1Var.D();
                                            int size4 = listD.size();
                                            for (int i10 = 0; i10 < size4; i10++) {
                                                qv qvVar2 = (qv) listD.get(i10);
                                                if (!x91Var2.c(qvVar2) && qvVar2.v(set)) {
                                                    list3.add(qvVar2);
                                                }
                                            }
                                            fa1 fa1Var2 = rr1Var.i;
                                            int i11 = fa1Var2.g;
                                            int i12 = 0;
                                            int i13 = 0;
                                            while (true) {
                                                Object[] objArr4 = fa1Var2.e;
                                                if (i12 < i11) {
                                                    qv qvVar3 = (qv) objArr4[i12];
                                                    if (!x91Var2.c(qvVar3) && !list3.contains(qvVar3)) {
                                                        list3.add(qvVar3);
                                                        i13++;
                                                    } else if (i13 > 0) {
                                                        Object[] objArr5 = fa1Var2.e;
                                                        objArr5[i12 - i13] = objArr5[i12];
                                                    }
                                                    i12++;
                                                } else {
                                                    int i14 = i11 - i13;
                                                    Arrays.fill(objArr4, i14, i11, (Object) null);
                                                    fa1Var2.g = i14;
                                                }
                                            }
                                        } catch (Throwable th15) {
                                            throw th15;
                                        }
                                    }
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        qr1.u(list4, rr1Var);
                                        while (!list4.isEmpty()) {
                                            List listH = rr1Var.H(list4, x91Var);
                                            x91Var3.getClass();
                                            Iterator it = listH.iterator();
                                            while (it.hasNext()) {
                                                x91Var3.k(it.next());
                                            }
                                            qr1.u(list4, rr1Var);
                                        }
                                    } catch (Throwable th16) {
                                        rr1Var.J(th16, null);
                                        qr1.t(rr1Var, list3, list4, r8, x91Var3, x91Var4, x91Var, x91Var2);
                                    }
                                }
                                ll2Var2 = ll2Var;
                                z3 = false;
                            } catch (Throwable th17) {
                                try {
                                    rr1Var.J(th17, null);
                                    qr1.t(rr1Var, list3, list4, r8, x91Var3, x91Var4, x91Var, x91Var2);
                                    list3.clear();
                                } catch (Throwable th18) {
                                    list3.clear();
                                    throw th18;
                                }
                            }
                        }
                        Trace.endSection();
                        return ll2Var;
                    }
                } catch (Throwable th19) {
                    Trace.endSection();
                    throw th19;
                }
        }
    }
}

package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jp1 implements sz0 {
    public final int a;
    public final ud b;
    public final ej0 c;
    public sw d;
    public y92 e;
    public nx0 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public ip1 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ ew0 r;

    public jp1(ew0 ew0Var, int i, ud udVar, ej0 ej0Var) {
        this.r = ew0Var;
        this.a = i;
        this.b = udVar;
        this.c = ej0Var;
        int i2 = z71.b;
        this.p = System.nanoTime() - z71.a;
    }

    @Override // defpackage.sz0
    public final void a() {
        this.m = true;
    }

    public final void b() {
        nx0 nx0Var = this.f;
        if (nx0Var != null) {
            switch (nx0Var.a) {
                case 0:
                    break;
                default:
                    gx0 gx0VarB = nx0Var.b();
                    if ((gx0VarB != null ? gx0VarB.f : null) != null) {
                        nx0Var.b.g(nx0Var.c);
                    }
                    break;
            }
        }
        this.f = null;
        y92 y92Var = this.e;
        if (y92Var != null) {
            y92Var.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(u8 u8Var) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(u8Var);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(u8Var);
        }
        nj2.G("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // defpackage.sz0
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01f3  */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final boolean d(u8 u8Var) {
        ?? r12;
        y92 y92VarE;
        int i = this.a;
        long j = i;
        nj2.G("compose:lazy:prefetch:execute:item", j);
        jz0 jz0Var = (jz0) ((iz0) this.r.b).b.a();
        if (!this.h) {
            int iA = jz0Var.a();
            if (i >= 0 && i < iA) {
                Object objB = jz0Var.b(i);
                Object obj = this.j;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = jz0Var.c(i);
                ud udVar = this.b;
                sf sfVar = (sf) udVar.d;
                if (udVar.c != objC || sfVar == null) {
                    w91 w91Var = (w91) udVar.b;
                    Object objG = w91Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        sf sfVar2 = new sf();
                        sfVar2.e = -1;
                        w91Var.m(objC, sfVar2);
                        obj2 = sfVar2;
                    }
                    sfVar = (sf) obj2;
                    udVar.c = objC;
                    udVar.d = sfVar;
                }
                e();
                long jA = u8Var.a();
                this.n = jA;
                int i2 = z71.b;
                this.p = System.nanoTime() - z71.a;
                this.o = 0L;
                nj2.G("compose:lazy:prefetch:available_time_nanos", jA);
                if (!e()) {
                    if (g(this.n, sfVar.a + sfVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objB, objC, sfVar);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, sfVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        nx0 nx0Var = this.f;
                        if (nx0Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (nx0Var.a) {
                            case 0:
                                y92VarE = nx0Var.b.e(nx0Var.c);
                                break;
                            default:
                                ox0 ox0Var = nx0Var.b;
                                gx0 gx0VarB = nx0Var.b();
                                if (gx0VarB != null) {
                                    ox0Var.c(gx0VarB, false);
                                }
                                y92VarE = ox0Var.e(nx0Var.c);
                                break;
                        }
                        this.e = y92VarE;
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        sfVar.c = sf.a(this.o, sfVar.c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.k) {
                    if (this.n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        y92 y92Var = this.e;
                        if (y92Var != null) {
                            gs1 gs1Var = new gs1();
                            y92Var.c(new gc1(gs1Var, 1));
                            List list = (List) gs1Var.e;
                            ip1 ip1Var = list != null ? new ip1(this, list) : null;
                            this.l = ip1Var;
                            this.k = true;
                            Trace.endSection();
                        } else {
                            yp0.b("Should precompose before resolving nested prefetch states");
                            qj.e();
                        }
                        this.l = ip1Var;
                        this.k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                ip1 ip1Var2 = this.l;
                if (ip1Var2 != null) {
                    int i3 = sfVar.e;
                    boolean z = this.m;
                    List[] listArr = ip1Var2.b;
                    int i4 = ip1Var2.c;
                    List list2 = ip1Var2.a;
                    if (i4 < list2.size()) {
                        if (ip1Var2.f.h) {
                            yp0.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((tz0) list2.get(i5)).d = i3;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (ip1Var2.c < list2.size()) {
                                try {
                                    if (listArr[ip1Var2.c] == null) {
                                        if (u8Var.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i6 = ip1Var2.c;
                                        tz0 tz0Var = (tz0) list2.get(i6);
                                        ej0 ej0Var = tz0Var.a;
                                        rz0 rz0Var = new rz0(tz0Var, tz0Var.d);
                                        ej0Var.h(rz0Var);
                                        ArrayList arrayList = rz0Var.b;
                                        tz0Var.f = arrayList.size();
                                        listArr[i6] = arrayList;
                                    }
                                    List list3 = listArr[ip1Var2.c];
                                    list3.getClass();
                                    while (ip1Var2.d < list3.size()) {
                                        jp1 jp1Var = (jp1) list3.get(ip1Var2.d);
                                        if (z) {
                                            jp1 jp1Var2 = jp1Var != null ? jp1Var : null;
                                            if (jp1Var2 != null) {
                                                r12 = 1;
                                                jp1Var2.m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        ip1Var2.e = r12;
                                        if (jp1Var.c(u8Var)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        ip1Var2.d += r12;
                                    }
                                    ip1Var2.d = 0;
                                    ip1Var2.c++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                ip1 ip1Var3 = this.l;
                if (ip1Var3 != null && ip1Var3.e) {
                    h();
                    nj2.G("compose:lazy:prefetch:execute:item", j);
                    ip1 ip1Var4 = this.l;
                    if (ip1Var4 != null) {
                        ip1Var4.e = false;
                    }
                }
                sw swVar = this.d;
                if (!this.g && swVar != null) {
                    if (!g(this.n, sfVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = swVar.a;
                        if (this.h) {
                            yp0.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            yp0.a("Request was already measured!");
                        }
                        this.g = true;
                        y92 y92Var2 = this.e;
                        if (y92Var2 != null) {
                            int iB = y92Var2.b();
                            for (int i7 = 0; i7 < iB; i7++) {
                                y92Var2.e(i7, j2);
                            }
                        } else {
                            yp0.b("performComposition() must be called before performMeasure()");
                            qj.e();
                        }
                        Trace.endSection();
                        h();
                        sfVar.d = sf.a(this.o, sfVar.d);
                        ej0 ej0Var2 = this.c;
                        if (ej0Var2 != null) {
                            ej0Var2.h(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                ip1 ip1Var5 = this.l;
                if (this.g && this.k && ip1Var5 != null) {
                    List list4 = ip1Var5.a;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i8 = 0; i8 < size2; i8++) {
                        iMin = Math.min(iMin, ((tz0) list4.get(i8)).e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i9 = sfVar.e;
                    sfVar.e = i9 == -1 ? iMin : ((i9 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i10 = 0; i10 < size3; i10++) {
                        iMin2 = Math.min(iMin2, ((tz0) list4.get(i10)).f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        sfVar.d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        nx0 nx0Var;
        return this.i || ((nx0Var = this.f) != null && nx0Var.c());
    }

    public final void f(Object obj, Object obj2, final sf sfVar) {
        nx0 nx0Var;
        nx0 nx0Var2 = this.f;
        int i = 0;
        if (nx0Var2 == null) {
            ew0 ew0Var = this.r;
            ij0 ij0VarA = ((iz0) ew0Var.b).a(this.a, obj, obj2);
            ox0 ox0VarA = ((aa2) ew0Var.c).a();
            if (ox0VarA.e.H()) {
                ox0VarA.k(obj, ij0VarA, true);
                nx0Var = new nx0(ox0VarA, obj, 1);
            } else {
                nx0Var = new nx0(ox0VarA, obj, i);
            }
            nx0Var2 = nx0Var;
            this.f = nx0Var2;
            this.j = obj;
        }
        this.q = false;
        while (!nx0Var2.c() && !this.q) {
            v42 v42Var = new v42() { // from class: hp1
                @Override // defpackage.v42
                public final boolean b() {
                    jp1 jp1Var = this.e;
                    boolean z = jp1Var.q;
                    if (z) {
                        return z;
                    }
                    jp1Var.h();
                    long j = jp1Var.o;
                    sf sfVar2 = sfVar;
                    long jA = sf.a(j, sfVar2.a);
                    sfVar2.a = jA;
                    boolean z2 = !jp1Var.g(jp1Var.n, jA + sfVar2.b);
                    jp1Var.q = z2;
                    return z2;
                }
            };
            switch (nx0Var2.a) {
                case 0:
                    break;
                default:
                    gx0 gx0VarB = nx0Var2.b();
                    nl1 nl1Var = gx0VarB != null ? gx0VarB.f : null;
                    if (nl1Var == null || nl1Var.c()) {
                        break;
                    } else {
                        o62 o62VarJ = c12.j();
                        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
                        o62 o62VarP = c12.p(o62VarJ);
                        try {
                            nl1Var.e(v42Var);
                            c12.s(o62VarJ, o62VarP, ej0VarE);
                            break;
                        } catch (Throwable th) {
                            try {
                                gx0VarB.getClass();
                                throw th;
                            } catch (Throwable th2) {
                                c12.s(o62VarJ, o62VarP, ej0VarE);
                                throw th2;
                            }
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            sfVar.b = sf.a(j, sfVar.b);
        } else {
            sfVar.a = sf.a(j, sfVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long j;
        int i = z71.b;
        long jNanoTime = System.nanoTime() - z71.a;
        long j2 = this.p;
        long jP = 0;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j2) {
                w40 w40Var = w80.f;
            } else {
                jP = w80.g(j2 < 0 ? w80.h : w80.g);
            }
        } else if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
            jP = jNanoTime < 0 ? w80.h : w80.g;
        } else {
            long j3 = jNanoTime - j2;
            long j4 = (j3 ^ jNanoTime) & (~(j3 ^ j2));
            z80 z80Var = z80.NANOSECONDS;
            if (j4 < 0) {
                z80 z80Var2 = z80.MILLISECONDS;
                if (z80Var.compareTo(z80Var2) < 0) {
                    long j5 = (jNanoTime / 1000000) - (j2 / 1000000);
                    long j6 = (jNanoTime % 1000000) - (j2 % 1000000);
                    w40 w40Var2 = w80.f;
                    jP = w80.e(rw.P(j5, z80Var2), rw.P(j6, z80Var));
                } else {
                    jP = w80.g(j3 < 0 ? w80.h : w80.g);
                }
            } else {
                jP = rw.P(j3, z80Var);
            }
        }
        long j7 = jP >> 1;
        w40 w40Var3 = w80.f;
        if ((1 & ((int) jP)) == 0) {
            j = j7;
        } else if (j7 > 9223372036854L) {
            j = Long.MAX_VALUE;
        } else {
            j = j7 < -9223372036854L ? Long.MIN_VALUE : j7 * 1000000;
        }
        this.o = j;
        long j8 = this.n - j;
        this.n = j8;
        this.p = jNanoTime;
        nj2.G("compose:lazy:prefetch:available_time_nanos", j8);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.h + " }";
    }
}

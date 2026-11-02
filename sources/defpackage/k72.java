package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k72 {
    public final ej0 a;
    public boolean c;
    public p2 h;
    public j72 i;
    public final AtomicReference b = new AtomicReference(null);
    public final i72 d = new i72(0, this);
    public final tr1 e = new tr1(10, this);
    public final fa1 f = new fa1(new j72[16]);
    public final Object g = new Object();
    public long j = -1;

    public k72(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final void a() {
        synchronized (this.g) {
            fa1 fa1Var = this.f;
            Object[] objArr = fa1Var.e;
            int i = fa1Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                j72 j72Var = (j72) objArr[i2];
                j72Var.e.a();
                j72Var.f.a();
                j72Var.l.a();
                j72Var.m.clear();
            }
        }
    }

    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        hv.b("Unexpected notification");
                        qj.e();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                fa1 fa1Var = this.f;
                Object[] objArr = fa1Var.e;
                int i = fa1Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((j72) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Object obj, ej0 ej0Var, ti0 ti0Var) {
        fa1 fa1Var;
        Object obj2;
        j72 j72Var;
        boolean z;
        j72 j72Var2;
        long j;
        long j2;
        j72 j72Var3;
        o62 pi2Var;
        long j3;
        l91 l91Var;
        int i;
        long j4;
        l91 l91Var2;
        long jD = y12.d();
        synchronized (this.g) {
            fa1Var = this.f;
            Object[] objArr = fa1Var.e;
            int i2 = fa1Var.g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((j72) obj2).a == ej0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            j72Var = (j72) obj2;
            z = true;
            if (j72Var == null) {
                ej0Var.getClass();
                nj2.i(1, ej0Var);
                j72Var = new j72(ej0Var);
                fa1Var.b(j72Var);
            }
            j72Var2 = this.i;
            j = this.j;
        }
        Object obj3 = fa1Var;
        if (j != -1 && j != jD) {
            obj3 = fa1Var;
            cp1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jD + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
        }
        try {
            obj3 = fa1Var;
            synchronized (this.g) {
                try {
                    this.i = j72Var;
                    this.j = jD;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            tr1 tr1Var = this.e;
            Object obj4 = j72Var.b;
            l91 l91Var3 = j72Var.c;
            int i4 = j72Var.d;
            j72Var.b = obj;
            j72Var.c = (l91) j72Var.f.g(obj);
            if (j72Var.d == -1) {
                j72Var.d = Long.hashCode(x62.h().g());
            }
            zj0 zj0Var = j72Var.i;
            fa1 fa1VarA = e72.a();
            try {
                fa1VarA.b(zj0Var);
                if (tr1Var == null) {
                    ti0Var.a();
                    j72Var3 = j72Var;
                } else {
                    o62 o62Var = (o62) x62.b.f();
                    if (o62Var instanceof pi2) {
                        j72Var3 = j72Var;
                        if (((pi2) o62Var).t == y12.d()) {
                            ej0 ej0Var2 = ((pi2) o62Var).r;
                            ej0 ej0Var3 = ((pi2) o62Var).s;
                            try {
                                ((pi2) o62Var).r = x62.i(tr1Var, ej0Var2, true);
                                ((pi2) o62Var).s = ej0Var3;
                                ti0Var.a();
                                ((pi2) o62Var).r = ej0Var2;
                                ((pi2) o62Var).s = ej0Var3;
                            } catch (Throwable th2) {
                                ((pi2) o62Var).r = ej0Var2;
                                ((pi2) o62Var).s = ej0Var3;
                                throw th2;
                            }
                        }
                    } else {
                        j72Var3 = j72Var;
                    }
                    if (o62Var == null || (o62Var instanceof ba1)) {
                        pi2Var = new pi2(o62Var instanceof ba1 ? (ba1) o62Var : null, tr1Var, null, true, false);
                    } else {
                        pi2Var = o62Var.u(tr1Var);
                    }
                    try {
                        o62 o62VarJ = pi2Var.j();
                        try {
                            ti0Var.a();
                            o62.q(o62VarJ);
                            pi2Var.c();
                        } catch (Throwable th3) {
                            try {
                                o62.q(o62VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    pi2Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    fa1VarA.k(fa1VarA.g - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                fa1VarA.k(fa1VarA.g - 1);
                j72 j72Var4 = j72Var3;
                Object obj5 = j72Var4.b;
                obj5.getClass();
                int i5 = j72Var4.d;
                l91 l91Var4 = j72Var4.c;
                if (l91Var4 != null) {
                    try {
                        long[] jArr = l91Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                l91 l91Var5 = l91Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            l91Var2 = l91Var5;
                                            Object obj6 = l91Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = l91Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    j72Var4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    l91Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = j72Var2;
                                                    this.j = j2;
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            l91Var2 = l91Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        l91Var5 = l91Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    l91Var = l91Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    l91Var = l91Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                l91Var4 = l91Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = j72Var2;
                            this.j = j2;
                        }
                        throw th;
                    }
                } else {
                    j3 = j;
                }
                j72Var4.b = obj4;
                j72Var4.c = l91Var3;
                j72Var4.d = i4;
                synchronized (this.g) {
                    this.i = j72Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                fa1VarA.k(fa1VarA.g - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void d() {
        i72 i72Var = this.d;
        x62.b(x62.a);
        synchronized (x62.c) {
            x62.h = vq.Z(x62.h, i72Var);
        }
        this.h = new p2(i72Var);
    }
}

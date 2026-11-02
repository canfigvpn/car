package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o62 {
    public u62 a;
    public long b;
    public boolean c;
    public int d;

    public o62(long j, u62 u62Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = u62Var;
        this.b = j;
        v22 v22Var = x62.a;
        if (j != 0) {
            u62 u62VarD = d();
            long j2 = u62VarD.g;
            long[] jArr = u62VarD.h;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = u62VarD.f;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = u62VarD.e;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (x62.c) {
                iA = x62.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(o62 o62Var) {
        x62.b.v(o62Var);
    }

    public final void a() {
        synchronized (x62.c) {
            b();
            p();
        }
    }

    public void b() {
        x62.d = x62.d.b(g());
    }

    public abstract void c();

    public u62 d() {
        return this.a;
    }

    public abstract ej0 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract ej0 i();

    public final o62 j() {
        ud udVar = x62.b;
        o62 o62Var = (o62) udVar.f();
        udVar.v(this);
        return o62Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(v82 v82Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            x62.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(u62 u62Var) {
        this.a = u62Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract o62 u(ej0 ej0Var);
}

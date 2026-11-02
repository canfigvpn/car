package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bb2 implements m40, sx {
    public final /* synthetic */ cb2 e;
    public final om f;
    public om g;
    public qn1 h = qn1.f;
    public final /* synthetic */ cb2 i;

    public bb2(cb2 cb2Var, om omVar) {
        this.i = cb2Var;
        this.e = cb2Var;
        this.f = omVar;
    }

    @Override // defpackage.m40
    public final float H(long j) {
        return this.e.H(j);
    }

    @Override // defpackage.m40
    public final int O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.m40
    public final long Y(long j) {
        return this.e.Y(j);
    }

    public final Object a(qn1 qn1Var, sh shVar) {
        om omVar = new om(1, ex.y(shVar));
        omVar.v();
        this.h = qn1Var;
        this.g = omVar;
        return omVar.t();
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e.b();
    }

    @Override // defpackage.m40
    public final float b0(long j) {
        return this.e.b0(j);
    }

    public final long c() {
        cb2 cb2Var = this.i;
        long jY = cb2Var.Y(qx.V(cb2Var).D.g());
        long j = cb2Var.B;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jY >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jY & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final on2 e() {
        return qx.V(this.i).D;
    }

    @Override // defpackage.sx
    public final uy f() {
        return ab0.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(long j, ij0 ij0Var, sh shVar) throws Throwable {
        za2 za2Var;
        Throwable th;
        j82 j82Var;
        om omVar;
        if (shVar instanceof za2) {
            za2Var = (za2) shVar;
            int i = za2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                za2Var.k = i - Integer.MIN_VALUE;
            } else {
                za2Var = new za2(this, shVar);
            }
        } else {
            za2Var = new za2(this, shVar);
        }
        Object objG = za2Var.i;
        int i2 = za2Var.k;
        if (i2 != 0) {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j82Var = za2Var.h;
            try {
                ix.Q(objG);
                j82Var.d(mm.f);
                return objG;
            } catch (Throwable th2) {
                th = th2;
                j82Var.d(mm.f);
                throw th;
            }
        }
        ix.Q(objG);
        if (j <= 0 && (omVar = this.g) != null) {
            omVar.i(new ut1(new rn1(j)));
        }
        j82 j82VarY = nj2.y(this.i.t0(), null, new in0(j, this, null), 3);
        try {
            za2Var.h = j82VarY;
            za2Var.k = 1;
            objG = ij0Var.g(this, za2Var);
            Object obj = fz.e;
            if (objG == obj) {
                return obj;
            }
            j82Var = j82VarY;
            j82Var.d(mm.f);
            return objG;
        } catch (Throwable th3) {
            th = th3;
            j82Var = j82VarY;
            j82Var.d(mm.f);
            throw th;
        }
    }

    @Override // defpackage.sx
    public final void i(Object obj) throws IllegalAccessException, InvocationTargetException {
        cb2 cb2Var = this.i;
        synchronized (cb2Var.y) {
            cb2Var.x.j(this);
        }
        this.f.i(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j, ij0 ij0Var, sh shVar) {
        ab2 ab2Var;
        if (shVar instanceof ab2) {
            ab2Var = (ab2) shVar;
            int i = ab2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ab2Var.j = i - Integer.MIN_VALUE;
            } else {
                ab2Var = new ab2(this, shVar);
            }
        } else {
            ab2Var = new ab2(this, shVar);
        }
        Object obj = ab2Var.h;
        int i2 = ab2Var.j;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ix.Q(obj);
                    return obj;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
            ab2Var.j = 1;
            Object objH = h(j, ij0Var, ab2Var);
            Object obj2 = fz.e;
            return objH == obj2 ? obj2 : objH;
        } catch (rn1 unused) {
            return null;
        }
    }

    @Override // defpackage.m40
    public final long j0(float f) {
        return this.e.j0(f);
    }

    @Override // defpackage.m40
    public final float l() {
        return this.e.l();
    }

    @Override // defpackage.m40
    public final float n0(int i) {
        return this.e.n0(i);
    }

    @Override // defpackage.m40
    public final float q0(float f) {
        return f / this.e.b();
    }

    @Override // defpackage.m40
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.m40
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.m40
    public final float x(float f) {
        return this.e.b() * f;
    }
}

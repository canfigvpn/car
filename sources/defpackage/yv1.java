package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 extends tx implements qe0 {
    public final qe0 h;
    public final uy i;
    public final int j;
    public uy k;
    public sx l;

    public yv1(qe0 qe0Var, uy uyVar) {
        super(ns.g, ab0.e);
        this.h = qe0Var;
        this.i = uyVar;
        this.j = ((Number) uyVar.s(new vy(13), 0)).intValue();
    }

    @Override // defpackage.sh, defpackage.gz
    public final gz e() {
        sx sxVar = this.l;
        if (sxVar instanceof gz) {
            return (gz) sxVar;
        }
        return null;
    }

    @Override // defpackage.tx, defpackage.sx
    public final uy f() {
        uy uyVar = this.k;
        return uyVar == null ? ab0.e : uyVar;
    }

    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        try {
            Object objT = t(sxVar, obj);
            return objT == fz.e ? objT : ll2.a;
        } catch (Throwable th) {
            this.k = new v60(sxVar.f(), th);
            throw th;
        }
    }

    @Override // defpackage.sh
    public final StackTraceElement q() {
        return null;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        Throwable thA = vt1.a(obj);
        if (thA != null) {
            this.k = new v60(f(), thA);
        }
        sx sxVar = this.l;
        if (sxVar != null) {
            sxVar.i(obj);
        }
        return fz.e;
    }

    public final Object t(sx sxVar, Object obj) {
        uy uyVarF = sxVar.f();
        mx.u(uyVarF);
        uy uyVar = this.k;
        if (uyVar != uyVarF) {
            if (uyVar instanceof v60) {
                throw new IllegalStateException(i92.s("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((v60) uyVar).f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) uyVarF.s(new x7(23, this), 0)).intValue() != this.j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.i + ",\n\t\tbut emission happened in " + uyVarF + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.k = uyVarF;
        }
        this.l = sxVar;
        jj0 jj0Var = aw1.a;
        qe0 qe0Var = this.h;
        qe0Var.getClass();
        Object objD = jj0Var.d(qe0Var, obj, this);
        if (!ws0.j(objD, fz.e)) {
            this.l = null;
        }
        return objD;
    }
}

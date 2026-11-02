package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wz extends wa2 implements ij0 {
    public xh2 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ bv1 n;
    public final /* synthetic */ ej0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(sx sxVar, ej0 ej0Var, bv1 bv1Var, boolean z, boolean z2) {
        super(2, sxVar);
        this.l = z;
        this.m = z2;
        this.n = bv1Var;
        this.o = ej0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((wz) p((sx) obj2, (yh2) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        wz wzVar = new wz(sxVar, this.o, this.n, this.l, this.m);
        wzVar.k = obj;
        return wzVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[DONT_INVERT, PHI: r0 r12
  0x00a3: PHI (r0v11 yh2) = (r0v8 yh2), (r0v16 yh2) binds: [B:37:0x00a0, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r12v18 java.lang.Object) = (r12v16 java.lang.Object), (r12v0 java.lang.Object) binds: [B:37:0x00a0, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[RETURN] */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        xh2 xh2Var;
        yh2 yh2Var;
        xh2 xh2Var2;
        yh2 yh2Var2;
        yh2 yh2Var3;
        Boolean boolC;
        Object obj2;
        int i = this.j;
        ej0 ej0Var = this.o;
        bv1 bv1Var = this.n;
        boolean z = this.m;
        fz fzVar = fz.e;
        if (i == 0) {
            ix.Q(obj);
            yh2 yh2Var4 = (yh2) this.k;
            if (!this.l) {
                yh2Var4.getClass();
                return ej0Var.h(((fr1) yh2Var4).b());
            }
            xh2Var = z ? xh2.e : xh2.f;
            if (z) {
                xh2 xh2Var3 = xh2Var;
                yh2Var = yh2Var4;
                xh2Var2 = xh2Var3;
                qz qzVar = new qz(null, ej0Var);
                this.k = yh2Var;
                this.i = null;
                this.j = 3;
                obj = yh2Var.a(xh2Var2, qzVar, this);
                if (obj != fzVar) {
                    if (z) {
                        return obj;
                    }
                    this.k = obj;
                    this.j = 4;
                    boolC = yh2Var.c(this);
                    if (boolC != fzVar) {
                        Object obj3 = obj;
                        obj = boolC;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            gt0 gt0VarE = bv1Var.e();
                            gt0VarE.b.c(gt0VarE.e, gt0VarE.f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.k = yh2Var4;
                this.i = xh2Var;
                this.j = 1;
                Boolean boolC2 = yh2Var4.c(this);
                if (boolC2 != fzVar) {
                    yh2Var2 = yh2Var4;
                    obj = boolC2;
                }
            }
            return fzVar;
        }
        if (i == 1) {
            xh2Var = this.i;
            yh2Var2 = (yh2) this.k;
            ix.Q(obj);
        } else {
            if (i == 2) {
                xh2Var = this.i;
                yh2Var3 = (yh2) this.k;
                ix.Q(obj);
                xh2Var2 = xh2Var;
                yh2Var = yh2Var3;
                qz qzVar2 = new qz(null, ej0Var);
                this.k = yh2Var;
                this.i = null;
                this.j = 3;
                obj = yh2Var.a(xh2Var2, qzVar2, this);
                if (obj != fzVar) {
                    if (z) {
                        return obj;
                    }
                    this.k = obj;
                    this.j = 4;
                    boolC = yh2Var.c(this);
                    if (boolC != fzVar) {
                        Object obj4 = obj;
                        obj = boolC;
                        obj2 = obj4;
                    }
                }
                return fzVar;
            }
            if (i == 3) {
                yh2Var = (yh2) this.k;
                ix.Q(obj);
                if (z) {
                    return obj;
                }
                this.k = obj;
                this.j = 4;
                boolC = yh2Var.c(this);
                if (boolC != fzVar) {
                    Object obj5 = obj;
                    obj = boolC;
                    obj2 = obj5;
                }
                return fzVar;
            }
            if (i != 4) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.k;
            ix.Q(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            gt0 gt0VarE2 = bv1Var.e();
            gt0VarE2.b.c(gt0VarE2.e, gt0VarE2.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            xh2Var2 = xh2Var;
            yh2Var = yh2Var2;
            qz qzVar3 = new qz(null, ej0Var);
            this.k = yh2Var;
            this.i = null;
            this.j = 3;
            obj = yh2Var.a(xh2Var2, qzVar3, this);
            if (obj != fzVar) {
                if (z) {
                    return obj;
                }
                this.k = obj;
                this.j = 4;
                boolC = yh2Var.c(this);
                if (boolC != fzVar) {
                    Object obj6 = obj;
                    obj = boolC;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        gt0 gt0VarE3 = bv1Var.e();
                        gt0VarE3.b.c(gt0VarE3.e, gt0VarE3.f);
                    }
                    return obj2;
                }
            }
        } else {
            gt0 gt0VarE4 = bv1Var.e();
            this.k = yh2Var2;
            this.i = xh2Var;
            this.j = 2;
            Object objF = gt0VarE4.b.f(this);
            if (objF != fzVar) {
                objF = ll2.a;
            }
            if (objF != fzVar) {
                yh2Var3 = yh2Var2;
                xh2Var2 = xh2Var;
                yh2Var = yh2Var3;
                qz qzVar4 = new qz(null, ej0Var);
                this.k = yh2Var;
                this.i = null;
                this.j = 3;
                obj = yh2Var.a(xh2Var2, qzVar4, this);
                if (obj != fzVar) {
                    if (z) {
                        return obj;
                    }
                    this.k = obj;
                    this.j = 4;
                    boolC = yh2Var.c(this);
                    if (boolC != fzVar) {
                        Object obj7 = obj;
                        obj = boolC;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            gt0 gt0VarE5 = bv1Var.e();
                            gt0VarE5.b.c(gt0VarE5.e, gt0VarE5.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return fzVar;
    }
}

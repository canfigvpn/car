package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mi extends tt1 implements ij0 {
    public s82 g;
    public qn1 h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ez l;
    public final /* synthetic */ mh2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(ez ezVar, mh2 mh2Var, sx sxVar) {
        super(2, sxVar);
        this.l = ezVar;
        this.m = mh2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((mi) p((sx) obj2, (bb2) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        mi miVar = new mi(this.l, this.m, sxVar);
        miVar.k = obj;
        return miVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00be, B:43:0x00c2), top: B:50:0x0014 }] */
    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        s82 s82VarF;
        qn1 qn1Var;
        long j;
        bb2 bb2Var;
        s82 s82Var;
        s82 s82Var2;
        wn1 wn1Var;
        int i = this.j;
        int i2 = 1;
        sx sxVar = null;
        fz fzVar = fz.e;
        if (i == 0) {
            ix.Q(obj);
            bb2 bb2Var2 = (bb2) this.k;
            s82VarF = j20.f(Boolean.FALSE);
            long jC = bb2Var2.e().c();
            this.k = bb2Var2;
            this.g = s82VarF;
            qn1Var = qn1.e;
            this.h = qn1Var;
            this.i = jC;
            this.j = 1;
            Object objA = bc2.a(bb2Var2, (2 & 1) != 0, (2 & 2) != 0 ? qn1.f : qn1.e, this);
            if (objA != fzVar) {
                j = jC;
                bb2Var = bb2Var2;
                obj = objA;
            }
            return fzVar;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s82Var2 = (s82) this.k;
                try {
                    ix.Q(obj);
                    wn1Var = (wn1) obj;
                    if (wn1Var != null) {
                        wn1Var.a();
                    }
                    Boolean bool = Boolean.FALSE;
                    s82Var2.getClass();
                    s82Var2.j(null, bool);
                    return ll2.a;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    s82Var2.getClass();
                    s82Var2.j(null, bool2);
                    throw th;
                }
            }
            qn1 qn1Var2 = this.h;
            s82Var = this.g;
            bb2Var = (bb2) this.k;
            try {
                ix.Q(obj);
                Boolean bool3 = Boolean.FALSE;
                s82Var.getClass();
                s82Var.j(null, bool3);
            } catch (rn1 unused) {
                qn1Var = qn1Var2;
                s82VarF = s82Var;
                nj2.y(this.l, null, new g(4, sxVar, s82VarF, this.m), 1);
                this.k = s82VarF;
                this.g = null;
                this.h = null;
                this.j = 3;
                obj = bc2.e(bb2Var, qn1Var, this);
                if (obj != fzVar) {
                    s82Var2 = s82VarF;
                    wn1Var = (wn1) obj;
                    if (wn1Var != null) {
                        wn1Var.a();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    s82Var2.getClass();
                    s82Var2.j(null, bool4);
                }
                return fzVar;
            } catch (Throwable th2) {
                th = th2;
                s82Var2 = s82Var;
                Boolean bool5 = Boolean.FALSE;
                s82Var2.getClass();
                s82Var2.j(null, bool5);
                throw th;
            }
            return ll2.a;
        }
        long j2 = this.i;
        qn1 qn1Var3 = this.h;
        s82 s82Var3 = this.g;
        bb2 bb2Var3 = (bb2) this.k;
        ix.Q(obj);
        qn1Var = qn1Var3;
        s82VarF = s82Var3;
        j = j2;
        bb2Var = bb2Var3;
        long j3 = j;
        int i3 = ((wn1) obj).i;
        if (i3 == 1 || i3 == 3) {
            try {
                try {
                    t6 t6Var = new t6(i2, sxVar, qn1Var);
                    this.k = bb2Var;
                    this.g = s82VarF;
                    this.h = qn1Var;
                    this.j = 2;
                    if (bb2Var.h(j3, t6Var, this) != fzVar) {
                        s82Var = s82VarF;
                        Boolean bool6 = Boolean.FALSE;
                        s82Var.getClass();
                        s82Var.j(null, bool6);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    s82Var2 = s82VarF;
                    Boolean bool7 = Boolean.FALSE;
                    s82Var2.getClass();
                    s82Var2.j(null, bool7);
                    throw th;
                }
            } catch (rn1 unused2) {
                nj2.y(this.l, null, new g(4, sxVar, s82VarF, this.m), 1);
                this.k = s82VarF;
                this.g = null;
                this.h = null;
                this.j = 3;
                obj = bc2.e(bb2Var, qn1Var, this);
                if (obj != fzVar) {
                    s82Var2 = s82VarF;
                    wn1Var = (wn1) obj;
                    if (wn1Var != null) {
                        wn1Var.a();
                    }
                    Boolean bool8 = Boolean.FALSE;
                    s82Var2.getClass();
                    s82Var2.j(null, bool8);
                    return ll2.a;
                }
            }
            return fzVar;
        }
        return ll2.a;
    }
}

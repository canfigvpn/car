package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 extends tt1 implements ij0 {
    public Object g;
    public Object h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ez k;
    public final /* synthetic */ jj0 l;
    public final /* synthetic */ wx m;
    public final /* synthetic */ pp1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb2(ez ezVar, jj0 jj0Var, wx wxVar, pp1 pp1Var, sx sxVar) {
        super(2, sxVar);
        this.k = ezVar;
        this.l = jj0Var;
        this.m = wxVar;
        this.n = pp1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((zb2) p((sx) obj2, (bb2) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        zb2 zb2Var = new zb2(this.k, this.l, this.m, this.n, sxVar);
        zb2Var.j = obj;
        return zb2Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168  */
    /* JADX WARN: Code duplicated, block: B:65:0x016e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        fz fzVar;
        bb2 bb2Var;
        Object objA;
        wn1 wn1Var;
        j82 j82VarY;
        Object objE;
        ot0 ot0Var;
        Object objE2;
        ot0 ot0Var2;
        wn1 wn1Var2;
        me2 me2Var = this.m.f;
        int i = this.i;
        int i2 = 3;
        int i3 = 2;
        int i4 = 6;
        wn1 wn1Var3 = null;
        qn1 qn1Var = qn1.f;
        ez ezVar = this.k;
        n41 n41Var = n41.a;
        jj0 jj0Var = this.l;
        ll2 ll2Var = ll2.a;
        int i5 = 1;
        pp1 pp1Var = this.n;
        sx sxVar = null;
        fz fzVar2 = fz.e;
        switch (i) {
            case 0:
                fzVar = fzVar2;
                ix.Q(obj);
                bb2Var = (bb2) this.j;
                this.j = bb2Var;
                this.i = 1;
                objA = bc2.a(bb2Var, (2 & 1) != 0, (2 & 2) != 0 ? qn1.f : qn1.e, this);
                if (objA != fzVar) {
                    wn1Var = (wn1) objA;
                    wn1Var.a();
                    d80 d80Var = bc2.a;
                    j82VarY = nj2.y(ezVar, null, new xb2(pp1Var, sxVar, i5), 1);
                    if (jj0Var != bc2.a) {
                        bc2.d(ezVar, j82VarY, new vb2(jj0Var, pp1Var, wn1Var, sxVar, 1));
                    }
                    this.j = bb2Var;
                    this.g = j82VarY;
                    this.i = 2;
                    objE = bc2.e(bb2Var, qn1Var, this);
                    if (objE != fzVar) {
                        ot0Var = j82VarY;
                        wn1Var3 = (wn1) objE;
                        if (wn1Var3 == null) {
                            bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, i2));
                        } else {
                            wn1Var3.a();
                            bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, 4));
                        }
                        if (wn1Var3 != null) {
                            me2Var.s();
                        }
                        return ll2Var;
                    }
                }
                return fzVar;
            case 1:
                fzVar = fzVar2;
                bb2Var = (bb2) this.j;
                ix.Q(obj);
                objA = obj;
                wn1Var = (wn1) objA;
                wn1Var.a();
                d80 d80Var2 = bc2.a;
                j82VarY = nj2.y(ezVar, null, new xb2(pp1Var, sxVar, i5), 1);
                if (jj0Var != bc2.a) {
                    bc2.d(ezVar, j82VarY, new vb2(jj0Var, pp1Var, wn1Var, sxVar, 1));
                }
                this.j = bb2Var;
                this.g = j82VarY;
                this.i = 2;
                objE = bc2.e(bb2Var, qn1Var, this);
                if (objE != fzVar) {
                    ot0Var = j82VarY;
                    wn1Var3 = (wn1) objE;
                    if (wn1Var3 == null) {
                        bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, i2));
                    } else {
                        wn1Var3.a();
                        bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, 4));
                    }
                    if (wn1Var3 != null) {
                        me2Var.s();
                    }
                    return ll2Var;
                }
                return fzVar;
            case 2:
                ot0Var = (ot0) this.g;
                ix.Q(obj);
                objE = obj;
                wn1Var3 = (wn1) objE;
                if (wn1Var3 == null) {
                    bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, i2));
                } else {
                    wn1Var3.a();
                    bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, 4));
                }
                if (wn1Var3 != null) {
                    me2Var.s();
                }
                return ll2Var;
            case 3:
                ot0Var = (ot0) this.h;
                wn1 wn1Var4 = (wn1) this.g;
                ix.Q(obj);
                o41 o41Var = (o41) obj;
                if (ws0.j(o41Var, n41Var)) {
                    long j = wn1Var4.c;
                    throw null;
                }
                if (!(o41Var instanceof m41) && !(o41Var instanceof l41)) {
                    qj.p();
                    return null;
                }
                if (wn1Var3 == null) {
                    bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, i2));
                } else {
                    wn1Var3.a();
                    bc2.d(ezVar, ot0Var, new wb2(pp1Var, sxVar, 4));
                }
                if (wn1Var3 != null) {
                    me2Var.s();
                }
                return ll2Var;
            case 4:
                ot0 ot0Var3 = (ot0) this.j;
                ix.Q(obj);
                bc2.d(ezVar, ot0Var3, new wb2(pp1Var, sxVar, i3));
                return ll2Var;
            case 5:
                ot0 ot0Var4 = (ot0) this.h;
                wn1 wn1Var5 = (wn1) this.g;
                bb2 bb2Var2 = (bb2) this.j;
                ix.Q(obj);
                fzVar = fzVar2;
                wn1 wn1Var6 = (wn1) obj;
                if (wn1Var6 == null) {
                    long j2 = wn1Var5.c;
                    me2Var.s();
                    return ll2Var;
                }
                d80 d80Var3 = bc2.a;
                j82 j82VarY2 = nj2.y(ezVar, null, new cv1(i4, sxVar, ot0Var4, pp1Var), 1);
                if (jj0Var != bc2.a) {
                    bc2.d(ezVar, j82VarY2, new vb2(jj0Var, pp1Var, wn1Var6, sxVar, 2));
                }
                this.j = j82VarY2;
                this.g = wn1Var5;
                this.h = null;
                this.i = 6;
                objE2 = bc2.e(bb2Var2, qn1Var, this);
                if (objE2 != fzVar) {
                    ot0Var2 = j82VarY2;
                    wn1Var2 = wn1Var5;
                    wn1Var3 = (wn1) objE2;
                    if (wn1Var3 != null) {
                        wn1Var3.a();
                        bc2.d(ezVar, ot0Var2, new wb2(pp1Var, sxVar, 5));
                        throw null;
                    }
                    bc2.d(ezVar, ot0Var2, new wb2(pp1Var, sxVar, i4));
                    long j3 = wn1Var2.c;
                    me2Var.s();
                    return ll2Var;
                }
                return fzVar;
            case 6:
                wn1Var2 = (wn1) this.g;
                ot0 ot0Var5 = (ot0) this.j;
                ix.Q(obj);
                ot0Var2 = ot0Var5;
                objE2 = obj;
                wn1Var3 = (wn1) objE2;
                if (wn1Var3 != null) {
                    wn1Var3.a();
                    bc2.d(ezVar, ot0Var2, new wb2(pp1Var, sxVar, 5));
                    throw null;
                }
                bc2.d(ezVar, ot0Var2, new wb2(pp1Var, sxVar, i4));
                long j4 = wn1Var2.c;
                me2Var.s();
                return ll2Var;
            case 7:
                wn1Var2 = (wn1) this.h;
                ot0Var2 = (ot0) this.g;
                ix.Q(obj);
                o41 o41Var2 = (o41) obj;
                if (ws0.j(o41Var2, n41Var)) {
                    throw null;
                }
                if (!(o41Var2 instanceof m41)) {
                    if (!(o41Var2 instanceof l41)) {
                        qj.p();
                        return null;
                    }
                    wn1Var3 = null;
                }
                if (wn1Var3 != null) {
                    wn1Var3.a();
                    bc2.d(ezVar, ot0Var2, new wb2(pp1Var, sxVar, 5));
                    throw null;
                }
                bc2.d(ezVar, ot0Var2, new wb2(pp1Var, sxVar, i4));
                long j5 = wn1Var2.c;
                me2Var.s();
                return ll2Var;
            case 8:
                ot0 ot0Var6 = (ot0) this.j;
                ix.Q(obj);
                bc2.d(ezVar, ot0Var6, new wb2(pp1Var, sxVar, 7));
                return ll2Var;
            default:
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

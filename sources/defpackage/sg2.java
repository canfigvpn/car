package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sg2 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ Object k;
    public /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg2(tg2 tg2Var, float f, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = tg2Var;
        this.l = f;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((sg2) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 1:
                return ((sg2) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                return ((sg2) p((sx) obj2, Float.valueOf(((Number) obj).floatValue()))).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new sg2((tg2) obj2, this.l, sxVar, 0);
            case 1:
                return new sg2((tg2) obj2, this.l, sxVar, 1);
            default:
                sg2 sg2Var = new sg2((qu) obj2, sxVar);
                sg2Var.l = ((Number) obj).floatValue();
                return sg2Var;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                tg2 tg2Var = (tg2) obj2;
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    ia iaVar = tg2Var.x;
                    if (iaVar == null) {
                        return ll2Var;
                    }
                    Float f = new Float(this.l);
                    nb nbVar = tg2Var.v ? gb2.f : tg2Var.u;
                    this.j = 1;
                    obj = ia.a(iaVar, f, nbVar, this);
                    if (obj == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i2 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            case 1:
                tg2 tg2Var2 = (tg2) obj2;
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    ia iaVar2 = tg2Var2.w;
                    if (iaVar2 == null) {
                        return ll2Var;
                    }
                    Float f2 = new Float(this.l);
                    nb nbVar2 = tg2Var2.v ? gb2.f : tg2Var2.u;
                    this.j = 1;
                    obj = ia.a(iaVar2, f2, nbVar2, this);
                    if (obj == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            default:
                qu quVar = (qu) obj2;
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    float f3 = this.l;
                    Object objG = quVar.a.d.e.g(h02.e);
                    ij0 ij0Var = (ij0) (objG != null ? objG : null);
                    if (ij0Var == null) {
                        throw k3.g("Required value was null.");
                    }
                    uf1 uf1Var = new uf1((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.j = 1;
                    obj = ij0Var.g(uf1Var, this);
                    if (obj == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i4 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((uf1) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg2(qu quVar, sx sxVar) {
        super(2, sxVar);
        this.i = 2;
        this.k = quVar;
    }
}

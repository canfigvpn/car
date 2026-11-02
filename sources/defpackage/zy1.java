package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 extends wa2 implements ej0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public final /* synthetic */ fz1 k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ ki2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy1(ki2 ki2Var, fz1 fz1Var, Object obj, sx sxVar) {
        super(1, sxVar);
        this.m = ki2Var;
        this.k = fz1Var;
        this.l = obj;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ki2 ki2Var = this.m;
        Object obj2 = this.l;
        fz1 fz1Var = this.k;
        sx sxVar = (sx) obj;
        switch (i) {
            case 0:
                return new zy1(ki2Var, fz1Var, obj2, sxVar).r(ll2Var);
            default:
                return new zy1(fz1Var, obj2, ki2Var, sxVar).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        float f;
        int i = this.i;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        fz1 fz1Var = this.k;
        Object obj2 = this.l;
        ki2 ki2Var = this.m;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    m7 m7Var = new m7(fz1Var, obj2, ki2Var, (sx) null);
                    this.j = 1;
                    if (qx.w(m7Var, this) == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i2 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                ki2Var.i();
                return ll2Var;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    fz1Var.o();
                    dk1 dk1Var = fz1Var.b;
                    fz1Var.l = Long.MIN_VALUE;
                    fz1Var.u(0.0f);
                    if (obj2.equals(fz1Var.c.getValue())) {
                        f = -4.0f;
                    } else {
                        f = obj2.equals(dk1Var.getValue()) ? -5.0f : -3.0f;
                    }
                    ki2Var.p(obj2);
                    ki2Var.n(0L);
                    dk1Var.setValue(obj2);
                    fz1Var.u(0.0f);
                    fz1Var.k(obj2);
                    ki2Var.j(f);
                    if (f == -3.0f) {
                        this.j = 1;
                        if (fz1Var.w(this) == fzVar) {
                            return fzVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                ki2Var.i();
                return ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy1(fz1 fz1Var, Object obj, ki2 ki2Var, sx sxVar) {
        super(1, sxVar);
        this.k = fz1Var;
        this.l = obj;
        this.m = ki2Var;
    }
}

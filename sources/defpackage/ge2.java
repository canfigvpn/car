package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ge2 extends wa2 implements ej0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ me2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge2(me2 me2Var, sx sxVar, int i) {
        super(1, sxVar);
        this.i = i;
        this.j = me2Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        me2 me2Var = this.j;
        sx sxVar = (sx) obj;
        switch (i) {
            case 0:
                new ge2(me2Var, sxVar, 0).r(ll2Var);
                break;
            case 1:
                new ge2(me2Var, sxVar, 1).r(ll2Var);
                break;
            case 2:
                new ge2(me2Var, sxVar, 2).r(ll2Var);
                break;
            default:
                new ge2(me2Var, sxVar, 3).r(ll2Var);
                break;
        }
        return ll2Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        me2 me2Var = this.j;
        switch (i) {
            case 0:
                ix.Q(obj);
                me2Var.A = false;
                break;
            case 1:
                ix.Q(obj);
                me2Var.c();
                break;
            case 2:
                ix.Q(obj);
                me2Var.a(me2Var.A);
                break;
            default:
                ix.Q(obj);
                me2Var.o();
                break;
        }
        return ll2Var;
    }
}

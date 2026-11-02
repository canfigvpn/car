package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq0 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ mq0 f;

    public /* synthetic */ lq0(mq0 mq0Var, int i) {
        this.e = i;
        this.f = mq0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        mq0 mq0Var = this.f;
        si2 si2Var = (si2) obj;
        switch (i) {
            case 0:
                si2Var.getClass();
                mq0 mq0Var2 = (mq0) si2Var;
                uo2 uo2Var = mq0Var.t;
                if (!ws0.j(mq0Var2.s, uo2Var)) {
                    mq0Var2.s = uo2Var;
                    mq0Var2.G0();
                }
                return ri2.f;
            default:
                si2Var.getClass();
                mq0Var.s = ((mq0) si2Var).t;
                return Boolean.FALSE;
        }
    }
}

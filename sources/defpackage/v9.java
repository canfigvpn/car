package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends wa2 implements ij0 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9(int i, sx sxVar, int i2) {
        super(i, sxVar);
        this.i = i2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((v9) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                ((v9) p((sx) obj2, (pe0) obj)).r(ll2Var);
                return ll2Var;
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                return new v9(2, sxVar, 0);
            default:
                return new v9(2, sxVar, 1);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        switch (this.i) {
            case 0:
                ix.Q(obj);
                return Choreographer.getInstance();
            default:
                ix.Q(obj);
                return ll2.a;
        }
    }
}

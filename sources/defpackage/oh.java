package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oh extends wa2 implements ej0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ph k;
    public final /* synthetic */ Uri l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh(ph phVar, Uri uri, sx sxVar, int i) {
        super(1, sxVar);
        this.i = i;
        this.k = phVar;
        this.l = uri;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Uri uri = this.l;
        ph phVar = this.k;
        sx sxVar = (sx) obj;
        switch (i) {
            case 0:
                return new oh(phVar, uri, sxVar, 0).r(ll2Var);
            default:
                return new oh(phVar, uri, sxVar, 1).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        Uri uri = this.l;
        ph phVar = this.k;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ix.Q(obj);
                        return obj;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                xg xgVar = phVar.b;
                this.j = 1;
                xgVar.getClass();
                j30 j30Var = u50.a;
                Object objK = nj2.K(b30.g, new m7(xgVar, uri, null), this);
                return objK == fzVar ? fzVar : objK;
            default:
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ix.Q(obj);
                        return obj;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                xg xgVar2 = phVar.b;
                this.j = 1;
                xgVar2.getClass();
                j30 j30Var2 = u50.a;
                Object objK2 = nj2.K(b30.g, new g(2, null, xgVar2, uri), this);
                return objK2 == fzVar ? fzVar : objK2;
        }
    }
}

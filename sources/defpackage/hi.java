package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hi extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi(int i, sx sxVar, Object obj) {
        super(2, sxVar);
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                ((hi) p(sxVar, ezVar)).r(ll2Var);
                return ll2Var;
            default:
                return ((hi) p(sxVar, ezVar)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new hi(0, sxVar, (mh2) obj2);
            default:
                return new hi(1, sxVar, (en1) obj2);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ix.Q(obj);
                ((mh2) obj2).a();
                return ll2.a;
            default:
                ix.Q(obj);
                en1 en1Var = (en1) obj2;
                TextClassifier textClassifierB = v50.b(en1Var.b, en1Var.c);
                en1Var.f = textClassifierB;
                return textClassifierB;
        }
    }
}

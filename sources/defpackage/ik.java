package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ik extends wa2 implements ij0 {
    public final /* synthetic */ int i = 1;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Serializable m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(Long l, bm bmVar, d00 d00Var, Locale locale, da1 da1Var, sx sxVar) {
        super(2, sxVar);
        this.j = l;
        this.k = bmVar;
        this.l = d00Var;
        this.m = locale;
        this.n = da1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                return ((ik) p(sxVar, ezVar)).r(ll2Var);
            default:
                ((ik) p(sxVar, ezVar)).r(ll2Var);
                return ll2Var;
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Serializable serializable = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ik ikVar = new ik((jk) obj4, (me1) obj3, (v4) serializable, (vf) obj2, sxVar);
                ikVar.j = obj;
                return ikVar;
            default:
                return new ik((Long) this.j, (bm) obj4, (d00) obj3, (Locale) serializable, (da1) obj2, sxVar);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Serializable serializable = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ix.Q(obj);
                ez ezVar = (ez) this.j;
                jk jkVar = (jk) obj4;
                sx sxVar = null;
                nj2.y(ezVar, null, new g(jkVar, (me1) obj3, (v4) serializable, sxVar, 5), 3);
                return nj2.y(ezVar, null, new e(6, sxVar, jkVar, (vf) obj2), 3);
            default:
                ix.Q(obj);
                Long l = (Long) this.j;
                if (l != null) {
                    da1 da1Var = (da1) obj2;
                    String strA = ((bm) obj4).a(l.longValue(), ((d00) obj3).c, (Locale) serializable);
                    te2 te2Var = new te2(strA, strA.length() == 0 ? of2.b : j02.c(strA.length(), strA.length()), 4);
                    kj1 kj1Var = j00.a;
                    da1Var.setValue(te2Var);
                }
                return ll2.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(jk jkVar, me1 me1Var, v4 v4Var, vf vfVar, sx sxVar) {
        super(2, sxVar);
        this.k = jkVar;
        this.l = me1Var;
        this.m = v4Var;
        this.n = vfVar;
    }
}

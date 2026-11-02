package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class as extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as(Object obj, int i, Object obj2, Object obj3, sx sxVar, int i2) {
        super(2, sxVar);
        this.i = i2;
        this.l = obj;
        this.k = i;
        this.m = obj2;
        this.n = obj3;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((as) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                return new as((pe0[]) obj4, this.k, (AtomicInteger) obj3, (zk) obj2, sxVar, 0);
            default:
                return new as((q01) obj4, this.k, (lr0) obj3, (em) obj2, sxVar, 1);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.n;
        Object obj3 = this.m;
        int i2 = this.k;
        Object obj4 = this.l;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                zk zkVar = (zk) obj2;
                int i3 = this.j;
                try {
                    if (i3 == 0) {
                        ix.Q(obj);
                        pe0 pe0Var = ((pe0[]) obj4)[i2];
                        zr zrVar = new zr(zkVar, i2);
                        this.j = 1;
                        if (pe0Var.a(zrVar, this) == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i3 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return ll2Var;
                    }
                    j12.g(zkVar);
                    return ll2Var;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        j12.g(zkVar);
                    }
                    throw th;
                }
            default:
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    int i5 = (((i2 - ((lr0) obj3).e) * 12) + ((em) obj2).b) - 1;
                    this.j = 1;
                    return q01.l((q01) obj4, i5, this) == fzVar ? fzVar : ll2Var;
                }
                if (i4 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

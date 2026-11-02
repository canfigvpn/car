package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ga extends wa2 implements ej0 {
    public ob i;
    public cs1 j;
    public int k;
    public final /* synthetic */ ia l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ cc2 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ia iaVar, Object obj, cc2 cc2Var, long j, sx sxVar) {
        super(1, sxVar);
        this.l = iaVar;
        this.m = obj;
        this.n = cc2Var;
        this.o = j;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        cc2 cc2Var = this.n;
        long j = this.o;
        return new ga(this.l, this.m, cc2Var, j, (sx) obj).r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ob obVar;
        cs1 cs1Var;
        cc2 cc2Var = this.n;
        int i = this.k;
        int i2 = 1;
        ia iaVar = this.l;
        try {
            if (i == 0) {
                ix.Q(obj);
                iaVar.c.g = (tb) iaVar.a.a.h(this.m);
                iaVar.e.setValue(cc2Var.c);
                iaVar.d.setValue(Boolean.TRUE);
                ob obVar2 = iaVar.c;
                ob obVar3 = new ob(obVar2.e, obVar2.f.getValue(), vs0.k(obVar2.g), obVar2.h, Long.MIN_VALUE, obVar2.j);
                cs1 cs1Var2 = new cs1();
                long j = this.o;
                o1 o1Var = new o1(iaVar, obVar3, cs1Var2, i2);
                this.i = obVar3;
                this.j = cs1Var2;
                this.k = 1;
                Object objA = c12.a(obVar3, cc2Var, j, o1Var, this);
                fz fzVar = fz.e;
                if (objA == fzVar) {
                    return fzVar;
                }
                obVar = obVar3;
                cs1Var = cs1Var2;
            } else {
                if (i != 1) {
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cs1Var = this.j;
                obVar = this.i;
                ix.Q(obj);
            }
            jb jbVar = cs1Var.e ? jb.e : jb.f;
            iaVar.c();
            return new lb(obVar, jbVar);
        } catch (CancellationException e) {
            iaVar.c();
            throw e;
        }
    }
}

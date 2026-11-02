package defpackage;

import android.database.SQLException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dj2 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ij2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj2(ij2 ij2Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.l = ij2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((dj2) p((sx) obj2, (jk1) obj)).r(ll2Var);
            default:
                return ((dj2) p((sx) obj2, (yh2) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        ij2 ij2Var = this.l;
        switch (i) {
            case 0:
                dj2 dj2Var = new dj2(ij2Var, sxVar, 0);
                dj2Var.k = obj;
                return dj2Var;
            default:
                dj2 dj2Var2 = new dj2(ij2Var, sxVar, 1);
                dj2Var2.k = obj;
                return dj2Var2;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        yh2 yh2Var;
        int i = this.i;
        ij2 ij2Var = this.l;
        fz fzVar = fz.e;
        sx sxVar = null;
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
                jk1 jk1Var = (jk1) this.k;
                this.j = 1;
                Object objA = ij2Var.a(jk1Var, this);
                return objA == fzVar ? fzVar : objA;
            default:
                int i3 = this.j;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            yh2Var = (yh2) this.k;
                            ix.Q(obj);
                        } else {
                            if (i3 != 2) {
                                fu1.h("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ix.Q(obj);
                        }
                        return (Set) obj;
                    }
                    ix.Q(obj);
                    yh2Var = (yh2) this.k;
                    this.k = yh2Var;
                    this.j = 1;
                    obj = yh2Var.c(this);
                    if (obj == fzVar) {
                        return fzVar;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        xh2 xh2Var = xh2.f;
                        dj2 dj2Var = new dj2(ij2Var, sxVar, 0);
                        this.k = null;
                        this.j = 2;
                        obj = yh2Var.a(xh2Var, dj2Var, this);
                        if (obj == fzVar) {
                            return fzVar;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return gb0.e;
        }
    }
}

package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aa implements sy {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public aa(aa aaVar) {
        this.e = 2;
        this.f = aaVar;
        this.g = new ew0();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final Object a(sx sxVar, ej0 ej0Var) {
        ml1 ml1Var;
        boolean z;
        Object objT;
        switch (this.e) {
            case 0:
                y9 y9Var = (y9) this.g;
                om omVar = new om(1, ex.y(sxVar));
                omVar.v();
                z9 z9Var = new z9(omVar, this, ej0Var);
                if (ws0.j(y9Var.g, (Choreographer) this.f)) {
                    synchronized (y9Var.i) {
                        y9Var.k.add(z9Var);
                        if (!y9Var.n) {
                            y9Var.n = true;
                            y9Var.g.postFrameCallback(y9Var.o);
                        }
                        break;
                    }
                    omVar.x(new i8(3, y9Var, z9Var));
                } else {
                    ((Choreographer) this.f).postFrameCallback(z9Var);
                    omVar.x(new i8(4, this, z9Var));
                }
                return omVar.t();
            case 1:
                om omVar2 = new om(1, ex.y(sxVar));
                omVar2.v();
                xf xfVar = (xf) this.g;
                pk pkVar = new pk();
                pkVar.a = omVar2;
                pkVar.b = ej0Var;
                omVar2.x(new qk(0, xfVar.d(pkVar, (mr1) this.f)));
                return omVar2.t();
            default:
                if (sxVar instanceof ml1) {
                    ml1Var = (ml1) sxVar;
                    int i = ml1Var.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ml1Var.k = i - Integer.MIN_VALUE;
                    } else {
                        ml1Var = new ml1(this, sxVar);
                    }
                } else {
                    ml1Var = new ml1(this, sxVar);
                }
                Object obj = ml1Var.i;
                fz fzVar = fz.e;
                int i2 = ml1Var.k;
                if (i2 == 0) {
                    ix.Q(obj);
                    ew0 ew0Var = (ew0) this.g;
                    ml1Var.h = ej0Var;
                    ml1Var.k = 1;
                    synchronized (ew0Var.b) {
                        z = ew0Var.a;
                    }
                    if (z) {
                        objT = ll2.a;
                    } else {
                        om omVar3 = new om(1, ex.y(ml1Var));
                        omVar3.v();
                        synchronized (ew0Var.b) {
                            ((ArrayList) ew0Var.c).add(omVar3);
                        }
                        omVar3.x(new qi(9, ew0Var, omVar3));
                        objT = omVar3.t();
                        if (objT != fzVar) {
                            objT = ll2.a;
                        }
                    }
                    if (objT != fzVar) {
                    }
                    return fzVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ix.Q(obj);
                        return obj;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ej0Var = ml1Var.h;
                ix.Q(obj);
                aa aaVar = (aa) this.f;
                ml1Var.h = null;
                ml1Var.k = 2;
                Object objA = aaVar.a(ml1Var, ej0Var);
                if (objA != fzVar) {
                    return objA;
                }
                return fzVar;
        }
    }

    @Override // defpackage.sy
    public ty getKey() {
        return q90.R;
    }

    @Override // defpackage.uy
    public final uy k(uy uyVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public final sy p(ty tyVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ex.t(this, tyVar);
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.uy
    public final uy u(ty tyVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ex.E(this, tyVar);
    }

    public aa(Choreographer choreographer, y9 y9Var) {
        this.e = 0;
        this.f = choreographer;
        this.g = y9Var;
    }

    public aa(mr1 mr1Var) {
        this.e = 1;
        this.f = mr1Var;
        this.g = new xf();
    }
}

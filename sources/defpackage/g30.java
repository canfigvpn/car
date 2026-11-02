package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g30 implements w11 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public g30(x11 x11Var) {
        this.e = 3;
        this.f = x11Var;
        fq fqVar = fq.c;
        Class<?> cls = x11Var.getClass();
        dq dqVar = (dq) fqVar.a.get(cls);
        this.g = dqVar == null ? fqVar.a(cls, null) : dqVar;
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                e30 e30Var = (e30) obj;
                switch (f30.a[q11Var.ordinal()]) {
                    case 1:
                    case 4:
                    case 6:
                        break;
                    case 2:
                        e30Var.d(y11Var);
                        break;
                    case 3:
                        e30Var.h(y11Var);
                        break;
                    case 5:
                        e30Var.b(y11Var);
                        break;
                    case 7:
                        qj.r("ON_ANY must not been send by anybody");
                        break;
                    default:
                        qj.p();
                        break;
                }
                w11 w11Var = (w11) obj2;
                if (w11Var != null) {
                    w11Var.j(y11Var, q11Var);
                }
                break;
            case 1:
                if (q11Var == q11.ON_START) {
                    ((b21) obj).f(this);
                    ((ru1) obj2).q();
                }
                break;
            case 2:
                dg1 dg1Var = (dg1) obj;
                int i2 = hg1.a[q11Var.ordinal()];
                if (i2 == 1) {
                    dg1Var.g(true);
                    break;
                } else if (i2 == 2) {
                    dg1Var.g(false);
                    break;
                } else if (i2 == 3) {
                    dg1Var.e();
                    ((b21) obj2).f(this);
                    break;
                }
                break;
            default:
                x11 x11Var = (x11) obj;
                HashMap map = ((dq) obj2).a;
                dq.a((List) map.get(q11Var), y11Var, q11Var, x11Var);
                dq.a((List) map.get(q11.ON_ANY), y11Var, q11Var, x11Var);
                break;
        }
    }

    public /* synthetic */ g30(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public g30(dg1 dg1Var, ig1 ig1Var, b21 b21Var) {
        this.e = 2;
        this.f = dg1Var;
        this.g = b21Var;
    }
}

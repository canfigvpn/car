package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m01 implements xx1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m01(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public static int b(m01 m01Var, int i) {
        Object obj;
        q01 q01Var = (q01) m01Var.c;
        k01 k01VarJ = q01Var.j();
        if (!k01VarJ.k.isEmpty()) {
            int iH = q01Var.h();
            if (i > m01Var.c() || iH > i) {
                return ((i - q01Var.h()) * rw.R(k01VarJ)) - q01Var.i();
            }
            List list = k01VarJ.k;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((l01) obj).a == i) {
                    break;
                }
                i2++;
            }
            l01 l01Var = (l01) obj;
            if (l01Var != null) {
                return l01Var.l;
            }
        }
        return 0;
    }

    @Override // defpackage.xx1
    public final float a(float f) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((xx1) obj).a(f);
            default:
                uy1 uy1Var = (uy1) obj;
                if (Math.abs(f) == 0.0f || ((Boolean) uy1Var.h.a()).booleanValue()) {
                    return uy1Var.d(uy1Var.g(((sy1) this.c).a(2, uy1Var.e(uy1Var.h(f)))));
                }
                throw new td0("The fling animation was cancelled", 0);
        }
    }

    public int c() {
        l01 l01Var = (l01) vq.X(((q01) this.c).j().k);
        if (l01Var != null) {
            return l01Var.a;
        }
        return 0;
    }
}

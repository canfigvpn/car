package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements w11 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) {
        int i = this.e;
        int i2 = 0;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((ej0) obj).h(q11Var);
                break;
            case 1:
                rb1 rb1Var = (rb1) obj;
                rb1Var.q = q11Var.a();
                if (rb1Var.c != null) {
                    ArrayList arrayListI0 = vq.i0(rb1Var.f);
                    int size = arrayListI0.size();
                    while (i2 < size) {
                        Object obj2 = arrayListI0.get(i2);
                        i2++;
                        kb1 kb1Var = (kb1) obj2;
                        kb1Var.getClass();
                        mb1 mb1Var = kb1Var.l;
                        mb1Var.getClass();
                        mb1Var.a.h = q11Var.a();
                        mb1Var.d = q11Var.a();
                        mb1Var.b();
                    }
                }
                break;
            default:
                sw1 sw1Var = (sw1) obj;
                if (q11Var == q11.ON_START) {
                    sw1Var.h = true;
                } else if (q11Var == q11.ON_STOP) {
                    sw1Var.h = false;
                }
                break;
        }
    }
}

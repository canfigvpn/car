package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ck {
    public final fa1 a;

    public ck(int i) {
        switch (i) {
            case 1:
                this.a = new fa1(new wy0[16]);
                break;
            default:
                this.a = new fa1(new zw[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        fa1 fa1Var = this.a;
        int i = fa1Var.g;
        nm[] nmVarArr = new nm[i];
        for (int i2 = 0; i2 < i; i2++) {
            nmVarArr[i2] = ((zw) fa1Var.e[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            nmVarArr[i3].o(cancellationException);
        }
        if (fa1Var.g == 0) {
            return;
        }
        yp0.c("uncancelled requests present");
    }

    public void b() throws IllegalAccessException, InvocationTargetException {
        fa1 fa1Var = this.a;
        lr0 lr0VarS = ex.S(0, fa1Var.g);
        int i = lr0VarS.e;
        int i2 = lr0VarS.f;
        if (i <= i2) {
            while (true) {
                ((zw) fa1Var.e[i]).b.i(ll2.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        fa1Var.g();
    }
}

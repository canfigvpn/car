package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb1 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ic1 f;

    public /* synthetic */ cb1(ic1 ic1Var, int i) {
        this.e = i;
        this.f = ic1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i;
        int i2 = this.e;
        ll2 ll2Var = ll2.a;
        ic1 ic1Var = this.f;
        switch (i2) {
            case 0:
                ic1Var.b();
                return ll2Var;
            case 1:
                ic1.a(ic1Var, new fn());
                return ll2Var;
            case 2:
                ic1Var.b();
                return ll2Var;
            case 3:
                ic1.a(ic1Var, new fn());
                return ll2Var;
            case 4:
                ei1.C(ic1Var, qh2.FUEL);
                return ll2Var;
            case 5:
                ic1.a(ic1Var, new fn());
                return ll2Var;
            case 6:
                ic1Var.b();
                return ll2Var;
            case 7:
                ag agVar = ic1Var.f;
                boolean z = false;
                if (ic1Var.g) {
                    le leVar = ic1Var.b.f;
                    if (leVar == null || !leVar.isEmpty()) {
                        Iterator it = leVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((kb1) it.next()).f instanceof cc1) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                agVar.d(z);
                return ll2Var;
            default:
                Context context = ic1Var.a;
                rd1 rd1Var = ic1Var.b.s;
                context.getClass();
                rd1Var.getClass();
                return new rc1();
        }
    }
}

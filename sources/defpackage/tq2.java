package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tq2 implements w11 {
    public final /* synthetic */ rx e;
    public final /* synthetic */ aa f;
    public final /* synthetic */ rr1 g;
    public final /* synthetic */ gs1 h;

    public tq2(rx rxVar, aa aaVar, rr1 rr1Var, gs1 gs1Var) {
        this.e = rxVar;
        this.f = aaVar;
        this.g = rr1Var;
        this.h = gs1Var;
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        nm nmVarY = null;
        switch (sq2.a[q11Var.ordinal()]) {
            case 1:
                nj2.y(this.e, null, new n7(this.h, this.g, y11Var, this, null, 15), 1);
                return;
            case 2:
                aa aaVar = this.f;
                if (aaVar != null) {
                    ew0 ew0Var = (ew0) aaVar.g;
                    synchronized (ew0Var.b) {
                        try {
                            synchronized (ew0Var.b) {
                                z = ew0Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) ew0Var.c;
                                ew0Var.c = (ArrayList) ew0Var.d;
                                ew0Var.d = arrayList;
                                ew0Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((sx) arrayList.get(i)).i(ll2.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                rr1 rr1Var = this.g;
                synchronized (rr1Var.c) {
                    if (rr1Var.t) {
                        rr1Var.t = false;
                        nmVarY = rr1Var.y();
                    }
                    break;
                }
                if (nmVarY != null) {
                    ((om) nmVarY).i(ll2.a);
                    return;
                }
                return;
            case 3:
                rr1 rr1Var2 = this.g;
                synchronized (rr1Var2.c) {
                    rr1Var2.t = true;
                }
                return;
            case 4:
                this.g.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                qj.p();
                return;
        }
    }
}

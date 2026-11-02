package defpackage;

import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q22 {
    public final MyGarageDatabase a;
    public final jb2 b;
    public final bn c;
    public final w22 d;
    public final s22 e;
    public final i22 f;
    public final rf1 g;

    public q22(MyGarageDatabase myGarageDatabase, jb2 jb2Var) {
        myGarageDatabase.getClass();
        jb2Var.getClass();
        this.a = myGarageDatabase;
        this.b = jb2Var;
        this.c = myGarageDatabase.m();
        this.d = myGarageDatabase.q();
        this.e = myGarageDatabase.p();
        this.f = myGarageDatabase.o();
        this.g = myGarageDatabase.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, tx txVar) {
        k22 k22Var;
        if (txVar instanceof k22) {
            k22Var = (k22) txVar;
            int i = k22Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                k22Var.j = i - Integer.MIN_VALUE;
            } else {
                k22Var = new k22(this, txVar);
            }
        } else {
            k22Var = new k22(this, txVar);
        }
        Object objR = k22Var.h;
        int i2 = k22Var.j;
        if (i2 == 0) {
            ix.Q(objR);
            k22Var.j = 1;
            objR = sv.R(k22Var, new g6(7, j), this.f.a, true, false);
            fz fzVar = fz.e;
            if (objR == fzVar) {
                return fzVar;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(objR);
        }
        j22 j22Var = (j22) objR;
        if (j22Var != null) {
            return ei1.J(j22Var);
        }
        return null;
    }

    public final rn b(long j) {
        return new rn(ei1.n(this.f.a, new String[]{"service_records"}, new g6(8, j)), 2);
    }

    public final rn c(long j) {
        return new rn(ei1.n(this.e.a, new String[]{"car_service_schedules"}, new g6(9, j)), 3);
    }

    public final rn d() {
        return new rn(ei1.n(this.d.a, new String[]{"service_types"}, new yw1(29)), 4);
    }
}

package defpackage;

import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vn {
    public final MyGarageDatabase a;
    public final jb2 b;
    public final bn c;
    public final w22 d;
    public final s22 e;
    public final rf1 f;

    public vn(MyGarageDatabase myGarageDatabase, jb2 jb2Var) {
        myGarageDatabase.getClass();
        jb2Var.getClass();
        this.a = myGarageDatabase;
        this.b = jb2Var;
        this.c = myGarageDatabase.m();
        this.d = myGarageDatabase.q();
        this.e = myGarageDatabase.p();
        this.f = myGarageDatabase.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, tx txVar) {
        on onVar;
        if (txVar instanceof on) {
            onVar = (on) txVar;
            int i = onVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                onVar.j = i - Integer.MIN_VALUE;
            } else {
                onVar = new on(this, txVar);
            }
        } else {
            onVar = new on(this, txVar);
        }
        Object objR = onVar.h;
        int i2 = onVar.j;
        if (i2 == 0) {
            ix.Q(objR);
            onVar.j = 1;
            objR = sv.R(onVar, new g6(3, j), this.c.a, true, false);
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
        cn cnVar = (cn) objR;
        if (cnVar != null) {
            return ei1.I(cnVar);
        }
        return null;
    }

    public final rn b() {
        return new rn(ei1.n(this.c.a, new String[]{"cars"}, new s1(15)), 0);
    }
}

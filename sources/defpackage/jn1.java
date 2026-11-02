package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jn1 {
    public static final a90 a = new a90(1, wv.r);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(z01 z01Var, n7 n7Var, tx txVar) {
        hn1 hn1Var;
        if (txVar instanceof hn1) {
            hn1Var = (hn1) txVar;
            int i = hn1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn1Var.i = i - Integer.MIN_VALUE;
            } else {
                hn1Var = new hn1(txVar);
            }
        } else {
            hn1Var = new hn1(txVar);
        }
        Object obj = hn1Var.h;
        int i2 = hn1Var.i;
        if (i2 != 0) {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                ix.Q(obj);
                qj.e();
                return;
            }
        }
        ix.Q(obj);
        if (!z01Var.e.r) {
            qj.r("establishTextInputSession called from an unattached node");
            return;
        }
        aj1 aj1VarW = qx.W(z01Var);
        sl1 sl1Var = (sl1) qx.V(z01Var).E;
        sl1Var.getClass();
        if (vv.N(sl1Var, a) != null) {
            fu1.c();
        } else {
            hn1Var.i = 1;
            b(aj1VarW, n7Var, hn1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(aj1 aj1Var, ij0 ij0Var, tx txVar) {
        in1 in1Var;
        if (txVar instanceof in1) {
            in1Var = (in1) txVar;
            int i = in1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                in1Var.i = i - Integer.MIN_VALUE;
            } else {
                in1Var = new in1(txVar);
            }
        } else {
            in1Var = new in1(txVar);
        }
        Object obj = in1Var.h;
        int i2 = in1Var.i;
        if (i2 == 0) {
            ix.Q(obj);
            in1Var.i = 1;
            ((e5) aj1Var).J(ij0Var, in1Var);
        } else if (i2 == 1) {
            ix.Q(obj);
            qj.e();
        } else if (i2 != 2) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
        } else {
            ix.Q(obj);
            qj.e();
        }
    }
}

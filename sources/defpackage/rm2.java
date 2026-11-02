package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 {
    public final yd0 a;
    public tb b;
    public tb c;
    public tb d;
    public final float e;

    public rm2(yd0 yd0Var) {
        this.a = yd0Var;
        this.e = yd0Var.f();
    }

    public final tb a(long j, tb tbVar, tb tbVar2) {
        tb tbVarC = this.c;
        if (tbVarC == null) {
            tbVarC = tbVar.c();
            this.c = tbVarC;
        }
        int iB = tbVarC.b();
        int i = 0;
        while (true) {
            tb tbVar3 = this.c;
            if (i >= iB) {
                if (tbVar3 != null) {
                    return tbVar3;
                }
                ws0.U("velocityVector");
                throw null;
            }
            if (tbVar3 == null) {
                ws0.U("velocityVector");
                throw null;
            }
            tbVar.getClass();
            tbVar3.e(i, this.a.m(tbVar2.a(i), j));
            i++;
        }
    }
}

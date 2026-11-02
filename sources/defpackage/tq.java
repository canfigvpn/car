package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq extends o {
    public final mv0 a;

    public tq(mv0 mv0Var) {
        this.a = mv0Var;
    }

    @Override // defpackage.mv0
    public void d(p61 p61Var, Object obj) {
        int iH = h(obj);
        s12 s12VarC = c();
        s12VarC.getClass();
        p61 p61VarU = p61Var.u(s12VarC);
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            p61VarU.N(c(), i, this.a, itG.next());
        }
        p61VarU.T(s12VarC);
    }

    @Override // defpackage.o
    public void j(jv jvVar, int i, Object obj) {
        m(i, obj, jvVar.u(c(), i, this.a, null));
    }

    public abstract void m(int i, Object obj, Object obj2);
}

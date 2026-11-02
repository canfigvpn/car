package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements mv0 {
    @Override // defpackage.mv0
    public Object a(n20 n20Var) {
        return i(n20Var);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(n20 n20Var) {
        Object objE = e();
        int iF = f(objE);
        jv jvVarA = n20Var.A(c());
        while (true) {
            int iH = jvVarA.h(c());
            if (iH == -1) {
                jvVarA.p(c());
                return l(objE);
            }
            j(jvVarA, iH + iF, objE);
        }
    }

    public abstract void j(jv jvVar, int i, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}

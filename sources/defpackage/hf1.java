package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hf1 implements mv0 {
    public final Object a;
    public final List b;
    public final rx0 c;

    public hf1(Object obj, String str) {
        obj.getClass();
        this.a = obj;
        this.b = cb0.e;
        this.c = vv.F(v01.e, new n1(29, str, this));
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12VarC = c();
        jv jvVarA = n20Var.A(s12VarC);
        int iH = jvVarA.h(c());
        if (iH != -1) {
            throw new a22(k3.i("Unexpected index ", iH));
        }
        jvVarA.p(s12VarC);
        return this.a;
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return (s12) this.c.getValue();
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        obj.getClass();
        p61Var.u(c()).T(c());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hf1(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kj2 implements mv0 {
    public final mv0 a;
    public final mv0 b;
    public final mv0 c;
    public final u12 d = v12.c("kotlin.Triple", new s12[0], new tr1(16, this));

    public kj2(mv0 mv0Var, mv0 mv0Var2, mv0 mv0Var3) {
        this.a = mv0Var;
        this.b = mv0Var2;
        this.c = mv0Var3;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        u12 u12Var = this.d;
        jv jvVarA = n20Var.A(u12Var);
        Object obj = nj2.C0;
        Object objU = obj;
        Object objU2 = objU;
        Object objU3 = objU2;
        while (true) {
            int iH = jvVarA.h(u12Var);
            if (iH == -1) {
                jvVarA.p(u12Var);
                if (objU == obj) {
                    throw new a22("Element 'first' is missing");
                }
                if (objU2 == obj) {
                    throw new a22("Element 'second' is missing");
                }
                if (objU3 != obj) {
                    return new jj2(objU, objU2, objU3);
                }
                throw new a22("Element 'third' is missing");
            }
            if (iH == 0) {
                objU = jvVarA.u(u12Var, 0, this.a, null);
            } else if (iH == 1) {
                objU2 = jvVarA.u(u12Var, 1, this.b, null);
            } else {
                if (iH != 2) {
                    throw new a22(k3.i("Unexpected index ", iH));
                }
                objU3 = jvVarA.u(u12Var, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return this.d;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        jj2 jj2Var = (jj2) obj;
        jj2Var.getClass();
        u12 u12Var = this.d;
        p61 p61VarU = p61Var.u(u12Var);
        p61VarU.N(u12Var, 0, this.a, jj2Var.e);
        p61VarU.N(u12Var, 1, this.b, jj2Var.f);
        p61VarU.N(u12Var, 2, this.c, jj2Var.g);
        p61VarU.T(u12Var);
    }
}

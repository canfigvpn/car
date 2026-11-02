package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t40 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ t40(jm1[] jm1VarArr, sv1 sv1Var, int i, int[] iArr) {
        this.e = 2;
        this.g = jm1VarArr;
        this.h = sv1Var;
        this.f = i;
        this.i = iArr;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        int i2 = 0;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.i;
        int i3 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                nr0 nr0Var = (nr0) obj3;
                l91 l91Var = (l91) obj2;
                if (obj == ((v40) obj4)) {
                    fu1.h("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof v82)) {
                    return ll2Var;
                }
                int i4 = nr0Var.a - i3;
                int iD = l91Var.d(obj);
                l91Var.g(Math.min(i4, iD >= 0 ? l91Var.c[iD] : Integer.MAX_VALUE), obj);
                return ll2Var;
            case 1:
                sn0 sn0Var = (sn0) obj4;
                y61 y61Var = (y61) obj3;
                jm1 jm1Var = (jm1) obj2;
                im1 im1Var = (im1) obj;
                int i5 = sn0Var.b;
                de2 de2Var = sn0Var.a;
                bi2 bi2Var = sn0Var.c;
                if2 if2Var = (if2) sn0Var.d.a();
                de2Var.a(di1.f, p12.d(im1Var, i5, bi2Var, if2Var != null ? if2Var.a : null, y61Var.getLayoutDirection() == kw0.f, jm1Var.e), i3, jm1Var.e);
                im1.k(im1Var, jm1Var, Math.round(-de2Var.a.h()), 0);
                return ll2Var;
            default:
                jm1[] jm1VarArr = (jm1[]) obj4;
                sv1 sv1Var = (sv1) obj3;
                int[] iArr = (int[]) obj2;
                im1 im1Var2 = (im1) obj;
                int length = jm1VarArr.length;
                int i6 = 0;
                while (i2 < length) {
                    jm1 jm1Var2 = jm1VarArr[i2];
                    int i7 = i6 + 1;
                    jm1Var2.getClass();
                    Object objJ = jm1Var2.j();
                    qv1 qv1Var = objJ instanceof qv1 ? (qv1) objJ : null;
                    mz mzVar = qv1Var != null ? qv1Var.c : null;
                    im1Var2.h(jm1Var2, iArr[i6], mzVar != null ? mzVar.a.a(jm1Var2.f, i3, kw0.e) : sv1Var.b.a(jm1Var2.f, i3), 0.0f);
                    i2++;
                    i6 = i7;
                }
                return ll2Var;
        }
    }

    public /* synthetic */ t40(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = i;
    }
}

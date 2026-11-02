package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ii1 extends mx {
    public final hv1 i;
    public final d8 j;

    public ii1(hv1 hv1Var) {
        d8 d8VarA;
        this.i = hv1Var;
        if (ux.A(hv1Var)) {
            d8VarA = null;
        } else {
            d8VarA = f8.a();
            d8.b(d8VarA, hv1Var);
        }
        this.j = d8VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ii1) {
            return this.i.equals(((ii1) obj).i);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // defpackage.mx
    public final yr1 w() {
        hv1 hv1Var = this.i;
        return new yr1(hv1Var.a, hv1Var.b, hv1Var.c, hv1Var.d);
    }
}

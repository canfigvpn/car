package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class il implements qe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h72 f;

    public /* synthetic */ il(h72 h72Var, int i) {
        this.e = i;
        this.f = h72Var;
    }

    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        h72 h72Var = this.f;
        switch (i) {
            case 0:
                tr0 tr0Var = (tr0) obj;
                if (tr0Var instanceof wn0) {
                    h72Var.add(tr0Var);
                } else if (tr0Var instanceof xn0) {
                    h72Var.remove(((xn0) tr0Var).a);
                } else if (tr0Var instanceof nf0) {
                    h72Var.add(tr0Var);
                } else if (tr0Var instanceof of0) {
                    h72Var.remove(((of0) tr0Var).a);
                } else if (tr0Var instanceof rp1) {
                    h72Var.add(tr0Var);
                } else if (tr0Var instanceof sp1) {
                    h72Var.remove(((sp1) tr0Var).a);
                } else if (tr0Var instanceof qp1) {
                    h72Var.remove(((qp1) tr0Var).a);
                }
                break;
            case 1:
                tr0 tr0Var2 = (tr0) obj;
                if (tr0Var2 instanceof wn0) {
                    h72Var.add(tr0Var2);
                } else if (tr0Var2 instanceof xn0) {
                    h72Var.remove(((xn0) tr0Var2).a);
                } else if (tr0Var2 instanceof nf0) {
                    h72Var.add(tr0Var2);
                } else if (tr0Var2 instanceof of0) {
                    h72Var.remove(((of0) tr0Var2).a);
                } else if (tr0Var2 instanceof rp1) {
                    h72Var.add(tr0Var2);
                } else if (tr0Var2 instanceof sp1) {
                    h72Var.remove(((sp1) tr0Var2).a);
                } else if (tr0Var2 instanceof qp1) {
                    h72Var.remove(((qp1) tr0Var2).a);
                } else if (tr0Var2 instanceof b80) {
                    h72Var.add(tr0Var2);
                } else if (tr0Var2 instanceof c80) {
                    h72Var.remove(((c80) tr0Var2).a);
                } else if (tr0Var2 instanceof a80) {
                    h72Var.remove(((a80) tr0Var2).a);
                }
                break;
            default:
                tr0 tr0Var3 = (tr0) obj;
                if (tr0Var3 instanceof wn0) {
                    h72Var.add(tr0Var3);
                } else if (tr0Var3 instanceof xn0) {
                    h72Var.remove(((xn0) tr0Var3).a);
                } else if (tr0Var3 instanceof nf0) {
                    h72Var.add(tr0Var3);
                } else if (tr0Var3 instanceof of0) {
                    h72Var.remove(((of0) tr0Var3).a);
                } else if (tr0Var3 instanceof rp1) {
                    h72Var.add(tr0Var3);
                } else if (tr0Var3 instanceof sp1) {
                    h72Var.remove(((sp1) tr0Var3).a);
                } else if (tr0Var3 instanceof qp1) {
                    h72Var.remove(((qp1) tr0Var3).a);
                } else if (tr0Var3 instanceof b80) {
                    h72Var.add(tr0Var3);
                } else if (tr0Var3 instanceof c80) {
                    h72Var.remove(((c80) tr0Var3).a);
                } else if (tr0Var3 instanceof a80) {
                    h72Var.remove(((a80) tr0Var3).a);
                }
                break;
        }
        return ll2Var;
    }
}

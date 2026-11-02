package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface sw0 extends b40 {
    default int A(x41 x41Var, r61 r61Var, int i) {
        return e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, pe1.e, qe1.f, 2), tw.b(i, 0, 13)).c();
    }

    default int P(x41 x41Var, r61 r61Var, int i) {
        return e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, pe1.e, qe1.e, 2), tw.b(0, i, 7)).e();
    }

    x61 e(y61 y61Var, r61 r61Var, long j);

    default int f(x41 x41Var, r61 r61Var, int i) {
        return e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, pe1.f, qe1.e, 2), tw.b(0, i, 7)).e();
    }

    default int n(x41 x41Var, r61 r61Var, int i) {
        return e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, pe1.f, qe1.f, 2), tw.b(i, 0, 13)).c();
    }
}

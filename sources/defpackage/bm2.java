package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bm2 {
    public static final vf1 a = new vf1(wf1.a, 0, 0);

    public static final bi2 a(io2 io2Var, yb ybVar) {
        bi2 bi2VarA = io2Var.a(ybVar);
        int length = ybVar.f.length();
        yb ybVar2 = bi2VarA.a;
        xf1 xf1Var = bi2VarA.b;
        int length2 = ybVar2.f.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(xf1Var.r(i), length2, i);
        }
        b(xf1Var.r(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(xf1Var.n(i2), length, i2);
        }
        c(xf1Var.n(length2), length, length2);
        return new bi2(ybVar2, new vf1(xf1Var, ybVar.f.length(), ybVar2.f.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        yp0.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        yp0.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
    }
}

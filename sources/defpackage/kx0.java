package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kx0 extends xw0 {
    public final /* synthetic */ ox0 b;
    public final /* synthetic */ ij0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx0(ox0 ox0Var, ij0 ij0Var, String str) {
        super(str);
        this.b = ox0Var;
        this.c = ij0Var;
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        ox0 ox0Var = this.b;
        ix0 ix0Var = ox0Var.l;
        ix0Var.e = y61Var.getLayoutDirection();
        ix0Var.f = y61Var.b();
        ix0Var.g = y61Var.l();
        boolean zR = y61Var.r();
        ij0 ij0Var = this.c;
        if (zR || ox0Var.e.l == null) {
            ox0Var.h = 0;
            x61 x61Var = (x61) ij0Var.g(ix0Var, new sw(j));
            return new jx0(x61Var, ox0Var, ox0Var.h, x61Var, 1);
        }
        ox0Var.i = 0;
        x61 x61Var2 = (x61) ij0Var.g(ox0Var.m, new sw(j));
        return new jx0(x61Var2, ox0Var, ox0Var.i, x61Var2, 0);
    }
}

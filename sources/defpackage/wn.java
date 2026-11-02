package defpackage;

import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wn implements wq1 {
    public final /* synthetic */ int a;
    public final wq1 b;
    public final wq1 c;

    public /* synthetic */ wn(wq1 wq1Var, wq1 wq1Var2, int i) {
        this.a = i;
        this.b = wq1Var;
        this.c = wq1Var2;
    }

    @Override // defpackage.wq1
    public final Object get() {
        int i = this.a;
        wq1 wq1Var = this.c;
        wq1 wq1Var2 = this.b;
        switch (i) {
            case 0:
                return new vn((MyGarageDatabase) wq1Var2.get(), (jb2) wq1Var.get());
            case 1:
                return new ao((vn) wq1Var2.get(), (sz1) wq1Var.get());
            case 2:
                return new q22((MyGarageDatabase) wq1Var2.get(), (jb2) wq1Var.get());
            default:
                return new ls0((q22) wq1Var2.get(), (kw1) ((zd) wq1Var).b);
        }
    }
}

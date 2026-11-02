package defpackage;

import android.content.Context;
import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yg implements wq1 {
    public final /* synthetic */ int a;
    public final wq1 b;
    public final wq1 c;
    public final wq1 d;
    public final wq1 e;
    public final wq1 f;

    public /* synthetic */ yg(wq1 wq1Var, wq1 wq1Var2, wq1 wq1Var3, wq1 wq1Var4, wq1 wq1Var5, int i) {
        this.a = i;
        this.b = wq1Var;
        this.c = wq1Var2;
        this.d = wq1Var3;
        this.e = wq1Var4;
        this.f = wq1Var5;
    }

    @Override // defpackage.wq1
    public final Object get() {
        int i = this.a;
        wq1 wq1Var = this.f;
        wq1 wq1Var2 = this.e;
        wq1 wq1Var3 = this.d;
        wq1 wq1Var4 = this.c;
        wq1 wq1Var5 = this.b;
        switch (i) {
            case 0:
                return new xg((Context) wq1Var5.get(), (MyGarageDatabase) wq1Var4.get(), (m32) wq1Var3.get(), (sz1) wq1Var2.get(), (jb2) wq1Var.get());
            default:
                return new ln0((vn) wq1Var5.get(), (q22) wq1Var4.get(), (sz1) wq1Var3.get(), (m32) wq1Var2.get(), (jb2) wq1Var.get());
        }
    }
}

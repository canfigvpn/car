package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qh implements wq1 {
    public final /* synthetic */ int a;
    public final wq1 b;

    public /* synthetic */ qh(wq1 wq1Var, int i) {
        this.a = i;
        this.b = wq1Var;
    }

    @Override // defpackage.wq1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ph((xg) this.b.get());
            case 1:
                return new q51((vn) this.b.get());
            case 2:
                return new sz1((Context) this.b.get());
            case 3:
                return new m32((Context) this.b.get());
            default:
                return new o32((m32) this.b.get());
        }
    }
}

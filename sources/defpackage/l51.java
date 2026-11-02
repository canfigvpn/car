package defpackage;

import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l51 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ l51(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        MainActivity mainActivity = this.f;
        switch (i) {
            case 0:
                return mainActivity.e();
            case 1:
                return mainActivity.g();
            case 2:
                return mainActivity.f();
            case 3:
                return mainActivity.e();
            case 4:
                return mainActivity.g();
            default:
                return mainActivity.f();
        }
    }
}

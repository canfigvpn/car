package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ rs(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        MainActivity mainActivity = this.f;
        switch (i) {
            case 0:
                mainActivity.reportFullyDrawn();
                return ll2.a;
            case 1:
                return new si0(mainActivity.j, new rs(mainActivity, 0));
            case 2:
                m50 m50Var = new m50();
                mainActivity.a().d(m50Var);
                return m50Var;
            case 3:
                return new uw1(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            default:
                ig1 ig1Var = new ig1(new p(4, mainActivity));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (ws0.j(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.e.a(new ss(ig1Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new w5(1, mainActivity, ig1Var));
                    }
                }
                return ig1Var;
        }
    }
}

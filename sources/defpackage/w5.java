package defpackage;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w5(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                x5.b((a6) obj2, (LongSparseArray) obj);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.e.a(new ss((ig1) obj, mainActivity));
                return;
            case 2:
                ((uc) obj2).l((Typeface) obj);
                return;
            case 3:
                qk1 qk1Var = (qk1) obj2;
                ((ru1) qk1Var.f).l().bringToFront();
                ((qj) obj).getClass();
                qj.v(qk1Var);
                return;
            case 4:
                wh2 wh2Var = (wh2) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    wh2Var.a();
                }
            default:
                cr2 cr2Var = (cr2) obj2;
                b21 b21Var = (b21) obj;
                if (cr2Var.g) {
                    return;
                }
                cr2Var.h = b21Var;
                b21Var.a(cr2Var);
                return;
        }
    }
}

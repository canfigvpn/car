package defpackage;

import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements lk0 {
    public final MainActivity e;
    public final MainActivity f;
    public volatile yz g;
    public final Object h = new Object();

    public x2(MainActivity mainActivity) {
        this.e = mainActivity;
        this.f = mainActivity;
    }

    @Override // defpackage.lk0
    public final Object d() {
        if (this.g == null) {
            synchronized (this.h) {
                try {
                    if (this.g == null) {
                        MainActivity mainActivity = this.e;
                        t2 t2Var = new t2(0, this.f);
                        bo2 bo2VarG = mainActivity.g();
                        lz lzVarJ = v12.j(mainActivity);
                        lzVarJ.getClass();
                        e4 e4Var = new e4(bo2VarG, t2Var, lzVarJ);
                        aq aqVarA = js1.a(v2.class);
                        String strB = aqVarA.b();
                        if (strB == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.g = ((v2) e4Var.j(aqVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.g;
    }
}

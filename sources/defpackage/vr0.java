package defpackage;

import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr0 implements ti0 {
    public final /* synthetic */ int e;

    public /* synthetic */ vr0(int i) {
        this.e = i;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return new w60(48.0f);
            case 1:
            case 2:
                return ll2Var;
            case 3:
                return bv0.b;
            case 4:
                return uu0.b;
            case 5:
                return ru0.b;
            case 6:
                return yu0.b;
            case 7:
                return cu0.b;
            case 8:
                return null;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 10:
            case 11:
                return null;
            case 12:
                a90 a90Var = m31.a;
                return q90.M;
            case 13:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 14:
                return Boolean.FALSE;
            case 15:
                return g81.a;
            case 16:
                return new uw1();
            case 17:
                qp0 qp0Var = new qp0(0);
                qp0Var.a(js1.a(lb1.class), new o01(10));
                return qp0Var.b();
            case 18:
                float f = fd1.a;
                return i30.a;
            case 19:
                return new vi1();
            case 20:
                j30 j30Var = u50.a;
                return b30.g;
            case 21:
                return new pu1();
            case 22:
                return new fw1(new LinkedHashMap());
            case 23:
                return null;
            case 24:
                return new zx1(0);
            case 25:
                return null;
            case 26:
                return new hf1("ir.alirezaivaz.mygarage.ui.navigation.SettingsRoute", e32.INSTANCE, new Annotation[0]);
            case 27:
                return new i42();
            case 28:
                return new w60(0.0f);
            default:
                return null;
        }
    }

    public /* synthetic */ vr0(gt0 gt0Var, int i) {
        this.e = i;
    }
}

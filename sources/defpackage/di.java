package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ di(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba1 ba1VarC;
        int i = this.e;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                vf2 vf2Var = (vf2) obj5;
                kw0 kw0Var = (kw0) obj4;
                String str = (String) obj3;
                m40 m40Var = (m40) obj2;
                jg0 jg0Var = (jg0) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    o62 o62VarH = x62.h();
                    ba1 ba1Var = o62VarH instanceof ba1 ? (ba1) o62VarH : null;
                    if (ba1Var == null || (ba1VarC = ba1Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        o62 o62VarJ = ba1VarC.j();
                        try {
                            vf2 vf2VarP = n02.p(vf2Var, kw0Var);
                            cb0 cb0Var = cb0.e;
                            new c8(str, vf2VarP, cb0Var, cb0Var, jg0Var, m40Var).c();
                            o62.q(o62VarJ);
                            ba1VarC.w().f();
                            ba1VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            o62.q(o62VarJ);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ba1VarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                p90 p90Var = (p90) obj5;
                ib2 ib2Var = (ib2) obj4;
                ib2 ib2Var2 = (ib2) obj3;
                View view = (View) obj;
                Window window = ((bt) obj2).getWindow();
                window.getClass();
                ej0 ej0Var = ib2Var.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) ej0Var.h(resources)).booleanValue();
                ej0 ej0Var2 = ib2Var2.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                p90Var.b(ib2Var, ib2Var2, window, view, zBooleanValue, ((Boolean) ej0Var2.h(resources2)).booleanValue());
                return;
        }
    }
}

package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cg1 implements OnBackAnimationCallback {
    public final /* synthetic */ bg1 a;

    public cg1(bg1 bg1Var) {
        this.a = bg1Var;
    }

    public final void onBackCancelled() {
        bg1 bg1Var = this.a;
        e4 e4Var = bg1Var.a;
        if (e4Var == null) {
            fu1.h("This input is not added to any dispatcher.");
            return;
        }
        if (!bg1Var.b) {
            e4Var.g(bg1Var, null);
        }
        md1 md1Var = (md1) e4Var.f;
        if (bg1Var.equals(md1Var.h) && -1 == md1Var.g) {
            jd1 jd1VarC = md1Var.f;
            if (jd1VarC == null) {
                jd1VarC = md1Var.c(-1);
            }
            md1Var.f = null;
            md1Var.g = 0;
            md1Var.h = null;
            if (jd1VarC != null) {
                jd1VarC.a();
            }
            md1Var.a.j(null, nd1.e);
        }
        bg1Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        hd1 hd1VarE = ex.e(backEvent);
        bg1 bg1Var = this.a;
        e4 e4Var = bg1Var.a;
        if (e4Var == null) {
            fu1.h("This input is not added to any dispatcher.");
            return;
        }
        if (bg1Var.b) {
            md1 md1Var = (md1) e4Var.f;
            if (bg1Var.equals(md1Var.h) && -1 == md1Var.g) {
                jd1 jd1VarC = md1Var.f;
                if (jd1VarC == null) {
                    jd1VarC = md1Var.c(-1);
                }
                if (jd1VarC != null) {
                    jd1VarC.c(hd1VarE);
                }
                md1Var.a.j(null, new od1(hd1VarE));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        hd1 hd1VarE = ex.e(backEvent);
        bg1 bg1Var = this.a;
        e4 e4Var = bg1Var.a;
        if (e4Var == null) {
            fu1.h("This input is not added to any dispatcher.");
        } else {
            if (bg1Var.b) {
                return;
            }
            e4Var.g(bg1Var, hd1VarE);
            bg1Var.b = true;
        }
    }
}

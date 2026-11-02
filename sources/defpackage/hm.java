package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hm implements Runnable {
    public final /* synthetic */ int e;
    public Object f;
    public final Object g;

    public hm(i21 i21Var, Runnable runnable) {
        this.e = 2;
        this.g = i21Var;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                Typeface typeface = (Typeface) obj;
                uc ucVar = (uc) ((qk1) this.f).f;
                if (ucVar != null) {
                    ucVar.l(typeface);
                }
                break;
            case 1:
                ((om) this.f).F((ul0) obj);
                break;
            case 2:
                i21 i21Var = (i21) obj;
                xy xyVar = i21Var.h;
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f).run();
                    } catch (Throwable th) {
                        mx.B(ab0.e, th);
                    }
                    Runnable runnableI = i21Var.I();
                    if (runnableI == null) {
                        break;
                    } else {
                        this.f = runnableI;
                        i2++;
                        if (i2 >= 16 && xyVar.G(i21Var)) {
                            xyVar.E(i21Var, this);
                            break;
                        }
                    }
                    break;
                }
                break;
            case 3:
                ((xg0) this.f).a(obj);
                break;
            default:
                ((om) obj).F((jc0) this.f);
                break;
        }
    }

    public /* synthetic */ hm(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}

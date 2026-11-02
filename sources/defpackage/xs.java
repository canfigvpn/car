package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import ir.alirezaivaz.mygarage.MainActivity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xs implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long e = SystemClock.uptimeMillis() + 10000;
    public Runnable f;
    public boolean g;
    public final /* synthetic */ MainActivity h;

    public xs(MainActivity mainActivity) {
        this.h = mainActivity;
    }

    public final void a(View view) {
        if (this.g) {
            return;
        }
        this.g = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f = runnable;
        View decorView = this.h.getWindow().getDecorView();
        decorView.getClass();
        if (!this.g) {
            decorView.postOnAnimation(new p(5, this));
        } else if (ws0.j(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.e) {
                this.g = false;
                this.h.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f = null;
        si0 si0Var = (si0) this.h.k.getValue();
        synchronized (si0Var.a) {
            z = si0Var.b;
        }
        if (z) {
            this.g = false;
            this.h.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

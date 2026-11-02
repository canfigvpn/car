package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zu implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ av e;

    public zu(av avVar) {
        this.e = avVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.e.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        av avVar = this.e;
        avVar.f.a.clear();
        lt1 lt1Var = avVar.g;
        synchronized (lt1Var) {
            lt1Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        av avVar = this.e;
        avVar.f.a.clear();
        lt1 lt1Var = avVar.g;
        synchronized (lt1Var) {
            lt1Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.e.s.a.setValue(Boolean.valueOf(z));
    }
}

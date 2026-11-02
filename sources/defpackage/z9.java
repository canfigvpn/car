package defpackage;

import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z9 implements Choreographer.FrameCallback {
    public final /* synthetic */ om e;
    public final /* synthetic */ ej0 f;

    public z9(om omVar, aa aaVar, ej0 ej0Var) {
        this.e = omVar;
        this.f = ej0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) throws IllegalAccessException, InvocationTargetException {
        Object ut1Var;
        try {
            ut1Var = this.f.h(Long.valueOf(j));
        } catch (Throwable th) {
            ut1Var = new ut1(th);
        }
        this.e.i(ut1Var);
    }
}

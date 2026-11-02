package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qu implements ScrollCaptureCallback {
    public final p02 a;
    public final mr0 b;
    public final px1 c;
    public final e5 d;
    public final rx e;
    public final pn0 f;

    public qu(p02 p02Var, mr0 mr0Var, rx rxVar, px1 px1Var, e5 e5Var) {
        this.a = p02Var;
        this.b = mr0Var;
        this.c = px1Var;
        this.d = e5Var;
        this.e = new rx(rxVar.e.k(o50.f));
        this.f = new pn0(mr0Var.b(), new sg2(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, mr0 mr0Var, tx txVar) {
        pu puVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionG;
        int i3;
        mr0 mr0Var2;
        int i4;
        int iH;
        int iH2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (txVar instanceof pu) {
            puVar = (pu) txVar;
            int i7 = puVar.n;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                puVar.n = i7 - Integer.MIN_VALUE;
            } else {
                puVar = new pu(this, txVar);
            }
        } else {
            puVar = new pu(this, txVar);
        }
        Object obj = puVar.l;
        int i8 = puVar.n;
        pn0 pn0Var = this.f;
        fz fzVar = fz.e;
        if (i8 == 0) {
            ix.Q(obj);
            i = mr0Var.b;
            i2 = mr0Var.d;
            puVar.h = scrollCaptureSession;
            puVar.i = mr0Var;
            puVar.j = i;
            puVar.k = i2;
            puVar.n = 1;
            int i9 = pn0Var.a;
            if (i > i2) {
                qj.f(k3.h(i, i2, "Expected min=", " ≤ max="));
                return null;
            }
            int i10 = i2 - i;
            if (i10 > i9) {
                qj.f(k3.h(i10, i9, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            float f = i;
            float f2 = pn0Var.b;
            Object obj2 = ll2.a;
            if (f < f2 || i2 > i9 + f2) {
                Object objB = pn0Var.b((((i10 / 2) + i) - (i9 / 2)) - f2, puVar);
                if (objB != fzVar) {
                    objB = obj2;
                }
                if (objB == fzVar) {
                    obj2 = objB;
                }
            }
            if (obj2 != fzVar) {
            }
            return fzVar;
        }
        if (i8 == 1) {
            int i11 = puVar.k;
            int i12 = puVar.j;
            mr0 mr0Var3 = puVar.i;
            ScrollCaptureSession scrollCaptureSessionG2 = o5.g(puVar.h);
            ix.Q(obj);
            i = i12;
            mr0Var = mr0Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionG2;
        } else {
            if (i8 != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = puVar.k;
            i4 = puVar.j;
            mr0Var2 = puVar.i;
            scrollCaptureSessionG = o5.g(puVar.h);
            ix.Q(obj);
        }
        iH = ex.h(i4 - p61.j0(pn0Var.b), 0, pn0Var.a);
        iH2 = ex.h(i3 - p61.j0(pn0Var.b), 0, pn0Var.a);
        i5 = mr0Var2.a;
        i6 = mr0Var2.c;
        if (iH == iH2) {
            return mr0.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionG.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iH);
            mr0 mr0Var4 = this.b;
            canvasLockHardwareCanvas.translate(-mr0Var4.a, -mr0Var4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iJ0 = p61.j0(pn0Var.b);
            return new mr0(i5, iH + iJ0, i6, iH2 + iJ0);
        } finally {
            scrollCaptureSessionG.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        x4 x4Var = x4.t;
        puVar.h = scrollCaptureSession;
        puVar.i = mr0Var;
        puVar.j = i;
        puVar.k = i2;
        puVar.n = 2;
        uy uyVar = puVar.f;
        uyVar.getClass();
        if (sv.K(uyVar).a(puVar, x4Var) != fzVar) {
            scrollCaptureSessionG = scrollCaptureSession;
            i3 = i2;
            mr0Var2 = mr0Var;
            i4 = i;
            iH = ex.h(i4 - p61.j0(pn0Var.b), 0, pn0Var.a);
            iH2 = ex.h(i3 - p61.j0(pn0Var.b), 0, pn0Var.a);
            i5 = mr0Var2.a;
            i6 = mr0Var2.c;
            if (iH == iH2) {
                return mr0.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionG.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iH);
            mr0 mr0Var5 = this.b;
            canvasLockHardwareCanvas.translate(-mr0Var5.a, -mr0Var5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iJ1 = p61.j0(pn0Var.b);
            return new mr0(i5, iH + iJ1, i6, iH2 + iJ1);
        }
        return fzVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        nj2.y(this.e, se1.f, new e(10, null, this, runnable), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        j82 j82VarY = nj2.y(this.e, null, new n7(this, scrollCaptureSession, rect, consumer, null, 3), 3);
        j82VarY.t(new y3(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new ru(0, j82VarY));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ux.J(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}

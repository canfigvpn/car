package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sn2 extends View {
    public static final j50 o = new j50(2);
    public final i80 e;
    public final vm f;
    public final um g;
    public boolean h;
    public Outline i;
    public boolean j;
    public m40 k;
    public kw0 l;
    public ej0 m;
    public al0 n;

    public sn2(i80 i80Var, vm vmVar, um umVar) {
        super(i80Var.getContext());
        this.e = i80Var;
        this.f = vmVar;
        this.g = umVar;
        setOutlineProvider(o);
        this.j = true;
        this.k = nj2.e0;
        this.l = kw0.e;
        cl0.a.getClass();
        this.m = x4.I;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vm vmVar = this.f;
        j4 j4Var = vmVar.a;
        Canvas canvas2 = j4Var.a;
        j4Var.a = canvas;
        m40 m40Var = this.k;
        kw0 kw0Var = this.l;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        al0 al0Var = this.n;
        ej0 ej0Var = this.m;
        um umVar = this.g;
        ud udVar = umVar.f;
        tm tmVar = ((um) udVar.d).e;
        m40 m40Var2 = tmVar.a;
        kw0 kw0Var2 = tmVar.b;
        sm smVarG = udVar.g();
        ud udVar2 = umVar.f;
        long jM = udVar2.m();
        al0 al0Var2 = (al0) udVar2.c;
        udVar2.x(m40Var);
        udVar2.y(kw0Var);
        udVar2.w(j4Var);
        udVar2.z(jFloatToRawIntBits);
        udVar2.c = al0Var;
        j4Var.l();
        try {
            ej0Var.h(umVar);
            j4Var.i();
            udVar2.x(m40Var2);
            udVar2.y(kw0Var2);
            udVar2.w(smVarG);
            udVar2.z(jM);
            udVar2.c = al0Var2;
            vmVar.a.a = canvas2;
            this.h = false;
        } catch (Throwable th) {
            j4Var.i();
            udVar2.x(m40Var2);
            udVar2.y(kw0Var2);
            udVar2.w(smVarG);
            udVar2.z(jM);
            udVar2.c = al0Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.j;
    }

    public final vm getCanvasHolder() {
        return this.f;
    }

    public final View getOwnerView() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.j;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.h) {
            return;
        }
        this.h = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fl0 implements cl0 {
    public static final AtomicBoolean x = new AtomicBoolean(true);
    public final vm b;
    public final um c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;

    public fl0(e5 e5Var, vm vmVar, um umVar) {
        this.b = vmVar;
        this.c = umVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", e5Var);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (x.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                ys1.c(renderNodeCreate, ys1.a(renderNodeCreate));
                ys1.d(renderNodeCreate, ys1.b(renderNodeCreate));
            }
            xs1.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        O(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = dr.b;
        this.q = j;
        this.r = j;
        this.t = 8.0f;
    }

    @Override // defpackage.cl0
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            ys1.d(this.d, ws0.V(j));
        }
    }

    @Override // defpackage.cl0
    public final void B(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.cl0
    public final Matrix C() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.cl0
    public final void D(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (qr0.a(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.cl0
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.cl0
    public final void F(float f) {
        this.t = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.cl0
    public final float G() {
        return this.p;
    }

    @Override // defpackage.cl0
    public final boolean H() {
        return this.d.isValid();
    }

    @Override // defpackage.cl0
    public final float I() {
        return this.o;
    }

    @Override // defpackage.cl0
    public final float J() {
        return this.s;
    }

    @Override // defpackage.cl0
    public final int K() {
        return this.k;
    }

    @Override // defpackage.cl0
    public final void L(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.cl0
    public final long M() {
        return this.q;
    }

    public final void N() {
        boolean z = this.u;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.v) {
            this.v = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.w) {
            this.w = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            O(i);
        } else {
            O(1);
        }
    }

    @Override // defpackage.cl0
    public final float a() {
        return this.l;
    }

    @Override // defpackage.cl0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.cl0
    public final void c(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.cl0
    public final float d() {
        return this.n;
    }

    @Override // defpackage.cl0
    public final void e(float f) {
        this.p = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.cl0
    public final float f() {
        return 0.0f;
    }

    @Override // defpackage.cl0
    public final void g() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.cl0
    public final void h(float f) {
        this.s = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.cl0
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.cl0
    public final long j() {
        return this.r;
    }

    @Override // defpackage.cl0
    public final void k(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            ys1.c(this.d, ws0.V(j));
        }
    }

    @Override // defpackage.cl0
    public final void l(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // defpackage.cl0
    public final void m() {
        P();
    }

    @Override // defpackage.cl0
    public final void n(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.cl0
    public final void o(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(s5.V(i)));
        P();
    }

    @Override // defpackage.cl0
    public final float p() {
        return this.t;
    }

    @Override // defpackage.cl0
    public final void q() {
        xs1.a(this.d);
    }

    @Override // defpackage.cl0
    public final float r() {
        return 0.0f;
    }

    @Override // defpackage.cl0
    public final void s() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.cl0
    public final void t(sm smVar) {
        Canvas canvas = k4.a;
        DisplayListCanvas displayListCanvas = ((j4) smVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.cl0
    public final void u(boolean z) {
        this.u = z;
        N();
    }

    @Override // defpackage.cl0
    public final int v() {
        return this.j;
    }

    @Override // defpackage.cl0
    public final float w() {
        return 0.0f;
    }

    @Override // defpackage.cl0
    public final void x(m40 m40Var, kw0 kw0Var, al0 al0Var, y3 y3Var) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            j4 j4Var = this.b.a;
            Canvas canvas = j4Var.a;
            j4Var.a = canvasStart;
            um umVar = this.c;
            ud udVar = umVar.f;
            long jM = ux.M(this.e);
            tm tmVar = ((um) udVar.d).e;
            m40 m40Var2 = tmVar.a;
            kw0 kw0Var2 = tmVar.b;
            sm smVarG = udVar.g();
            long jM2 = udVar.m();
            al0 al0Var2 = (al0) udVar.c;
            udVar.x(m40Var);
            udVar.y(kw0Var);
            udVar.w(j4Var);
            udVar.z(jM);
            udVar.c = al0Var;
            j4Var.l();
            try {
                y3Var.h(umVar);
                j4Var.i();
                udVar.x(m40Var2);
                udVar.y(kw0Var2);
                udVar.w(smVarG);
                udVar.z(jM2);
                udVar.c = al0Var2;
                j4Var.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                j4Var.i();
                ud udVar2 = umVar.f;
                udVar2.x(m40Var2);
                udVar2.y(kw0Var2);
                udVar2.w(smVarG);
                udVar2.z(jM2);
                udVar2.c = al0Var2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // defpackage.cl0
    public final yi y() {
        return null;
    }

    @Override // defpackage.cl0
    public final void z(int i) {
        this.j = i;
        P();
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hl0 implements cl0 {
    public final vm b;
    public final um c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;

    public hl0() {
        vm vmVar = new vm();
        um umVar = new um();
        this.b = vmVar;
        this.c = umVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        O(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = dr.b;
        this.n = j;
        this.o = j;
        this.q = 8.0f;
        this.u = 0;
    }

    @Override // defpackage.cl0
    public final void A(long j) {
        this.o = j;
        this.d.setSpotShadowColor(ws0.V(j));
    }

    @Override // defpackage.cl0
    public final void B(float f) {
        this.l = f;
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
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = ux.M(j);
    }

    @Override // defpackage.cl0
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.cl0
    public final void F(float f) {
        this.q = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.cl0
    public final float G() {
        return this.m;
    }

    @Override // defpackage.cl0
    public final boolean H() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.cl0
    public final float I() {
        return this.l;
    }

    @Override // defpackage.cl0
    public final float J() {
        return this.p;
    }

    @Override // defpackage.cl0
    public final int K() {
        return this.j;
    }

    @Override // defpackage.cl0
    public final void L(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.cl0
    public final long M() {
        return this.n;
    }

    public final void N() {
        boolean z = this.r;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.s) {
            this.s = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.t) {
            this.t = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.u;
        if (i != 1 && this.j == 3) {
            O(this.d, i);
        } else {
            O(this.d, 1);
        }
    }

    @Override // defpackage.cl0
    public final float a() {
        return this.i;
    }

    @Override // defpackage.cl0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.cl0
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.cl0
    public final float d() {
        return this.k;
    }

    @Override // defpackage.cl0
    public final void e(float f) {
        this.m = f;
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
        this.p = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.cl0
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.cl0
    public final long j() {
        return this.o;
    }

    @Override // defpackage.cl0
    public final void k(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(ws0.V(j));
    }

    @Override // defpackage.cl0
    public final void l(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // defpackage.cl0
    public final void m() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // defpackage.cl0
    public final void n(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.cl0
    public final void o(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(s5.U(i));
        P();
    }

    @Override // defpackage.cl0
    public final float p() {
        return this.q;
    }

    @Override // defpackage.cl0
    public final void q() {
        this.d.discardDisplayList();
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
        ((j4) smVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.cl0
    public final void u(boolean z) {
        this.r = z;
        N();
    }

    @Override // defpackage.cl0
    public final int v() {
        return this.u;
    }

    @Override // defpackage.cl0
    public final float w() {
        return 0.0f;
    }

    @Override // defpackage.cl0
    public final void x(m40 m40Var, kw0 kw0Var, al0 al0Var, y3 y3Var) {
        um umVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            vm vmVar = this.b;
            j4 j4Var = vmVar.a;
            Canvas canvas = j4Var.a;
            j4Var.a = recordingCanvasBeginRecording;
            ud udVar = umVar.f;
            udVar.x(m40Var);
            udVar.y(kw0Var);
            udVar.c = al0Var;
            udVar.z(this.e);
            udVar.w(j4Var);
            y3Var.h(umVar);
            vmVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.cl0
    public final yi y() {
        return null;
    }

    @Override // defpackage.cl0
    public final void z(int i) {
        this.u = i;
        P();
    }
}

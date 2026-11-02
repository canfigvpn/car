package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jl0 implements cl0 {
    public static final il0 x = new il0();
    public final i80 b;
    public final vm c;
    public final sn2 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;

    public jl0(i80 i80Var) {
        vm vmVar = new vm();
        um umVar = new um();
        this.b = i80Var;
        this.c = vmVar;
        sn2 sn2Var = new sn2(i80Var, vmVar, umVar);
        this.d = sn2Var;
        this.e = i80Var.getResources();
        this.f = new Rect();
        i80Var.addView(sn2Var);
        sn2Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = dr.b;
        this.u = j;
        this.v = j;
    }

    @Override // defpackage.cl0
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineSpotShadowColor(ws0.V(j));
        }
    }

    @Override // defpackage.cl0
    public final void B(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.cl0
    public final Matrix C() {
        return this.d.getMatrix();
    }

    @Override // defpackage.cl0
    public final void D(int i, int i2, long j) {
        boolean zA = qr0.a(this.j, j);
        sn2 sn2Var = this.d;
        if (zA) {
            int i3 = this.h;
            if (i3 != i) {
                sn2Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                sn2Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || sn2Var.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            sn2Var.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                sn2Var.setPivotX(i5 / 2.0f);
                sn2Var.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.cl0
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.cl0
    public final void F(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.cl0
    public final float G() {
        return this.t;
    }

    @Override // defpackage.cl0
    public final float I() {
        return this.s;
    }

    @Override // defpackage.cl0
    public final float J() {
        return this.w;
    }

    @Override // defpackage.cl0
    public final int K() {
        return this.n;
    }

    @Override // defpackage.cl0
    public final void L(long j) {
        long j2 = 9223372034707292159L & j;
        sn2 sn2Var = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            sn2Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            sn2Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                sn2Var.resetPivot();
                return;
            }
            this.q = true;
            sn2Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            sn2Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.cl0
    public final long M() {
        return this.u;
    }

    public final void N(int i) {
        Paint paint = this.g;
        sn2 sn2Var = this.d;
        boolean z = true;
        if (i == 1) {
            sn2Var.setLayerType(2, paint);
        } else if (i == 2) {
            sn2Var.setLayerType(0, paint);
            z = false;
        } else {
            sn2Var.setLayerType(0, paint);
        }
        sn2Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void O() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // defpackage.cl0
    public final float a() {
        return this.p;
    }

    @Override // defpackage.cl0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.cl0
    public final void c(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.cl0
    public final float d() {
        return this.r;
    }

    @Override // defpackage.cl0
    public final void e(float f) {
        this.t = f;
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
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.cl0
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.cl0
    public final long j() {
        return this.v;
    }

    @Override // defpackage.cl0
    public final void k(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            this.d.setOutlineAmbientShadowColor(ws0.V(j));
        }
    }

    @Override // defpackage.cl0
    public final void l(Outline outline, long j) {
        sn2 sn2Var = this.d;
        sn2Var.i = outline;
        sn2Var.invalidateOutline();
        if ((this.m || sn2Var.getClipToOutline()) && outline != null) {
            sn2Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.cl0
    public final void m() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // defpackage.cl0
    public final void n(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.cl0
    public final void o(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(s5.V(i)));
        O();
    }

    @Override // defpackage.cl0
    public final float p() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.cl0
    public final void q() {
        this.b.removeViewInLayout(this.d);
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
        Rect rect;
        boolean z = this.k;
        sn2 sn2Var = this.d;
        if (z) {
            if ((this.m || sn2Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = sn2Var.getWidth();
                rect.bottom = sn2Var.getHeight();
            } else {
                rect = null;
            }
            sn2Var.setClipBounds(rect);
        }
        Canvas canvas = k4.a;
        if (((j4) smVar).a.isHardwareAccelerated()) {
            this.b.a(smVar, sn2Var, sn2Var.getDrawingTime());
        }
    }

    @Override // defpackage.cl0
    public final void u(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.cl0
    public final int v() {
        return this.o;
    }

    @Override // defpackage.cl0
    public final float w() {
        return 0.0f;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cl0
    public final void x(m40 m40Var, kw0 kw0Var, al0 al0Var, y3 y3Var) {
        sn2 sn2Var = this.d;
        ViewParent parent = sn2Var.getParent();
        i80 i80Var = this.b;
        if (parent == null) {
            i80Var.addView(sn2Var);
        }
        sn2Var.k = m40Var;
        sn2Var.l = kw0Var;
        sn2Var.m = y3Var;
        sn2Var.n = al0Var;
        if (sn2Var.isAttachedToWindow()) {
            sn2Var.setVisibility(4);
            sn2Var.setVisibility(0);
            try {
                j4 j4Var = this.c.a;
                il0 il0Var = x;
                Canvas canvas = j4Var.a;
                j4Var.a = il0Var;
                i80Var.a(j4Var, sn2Var, sn2Var.getDrawingTime());
                j4Var.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.cl0
    public final yi y() {
        return null;
    }

    @Override // defpackage.cl0
    public final void z(int i) {
        this.o = i;
        O();
    }
}

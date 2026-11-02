package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class su1 extends View {
    public static final int[] j = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] k = new int[0];
    public ql2 e;
    public Boolean f;
    public Long g;
    public p h;
    public w8 i;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.h;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? j : k;
            ql2 ql2Var = this.e;
            if (ql2Var != null) {
                ql2Var.setState(iArr);
            }
        } else {
            p pVar = new p(9, this);
            this.h = pVar;
            postDelayed(pVar, 50L);
        }
        this.g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(su1 su1Var) {
        ql2 ql2Var = su1Var.e;
        if (ql2Var != null) {
            ql2Var.setState(k);
        }
        su1Var.h = null;
    }

    public final void b(rp1 rp1Var, boolean z, long j2, int i, long j3, w8 w8Var) {
        long j4 = rp1Var.a;
        if (this.e == null || !Boolean.valueOf(z).equals(this.f)) {
            ql2 ql2Var = new ql2(z);
            setBackground(ql2Var);
            this.e = ql2Var;
            this.f = Boolean.valueOf(z);
        }
        ql2 ql2Var2 = this.e;
        ql2Var2.getClass();
        this.i = w8Var;
        e(i, j2, j3);
        if (z) {
            ql2Var2.setHotspot(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4)));
        } else {
            ql2Var2.setHotspot(ql2Var2.getBounds().centerX(), ql2Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.i = null;
        p pVar = this.h;
        if (pVar != null) {
            removeCallbacks(pVar);
            p pVar2 = this.h;
            pVar2.getClass();
            pVar2.run();
        } else {
            ql2 ql2Var = this.e;
            if (ql2Var != null) {
                ql2Var.setState(k);
            }
        }
        ql2 ql2Var2 = this.e;
        if (ql2Var2 == null) {
            return;
        }
        ql2Var2.setVisible(false, false);
        unscheduleDrawable(ql2Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j2, long j3) {
        ql2 ql2Var = this.e;
        if (ql2Var == null) {
            return;
        }
        Integer num = ql2Var.g;
        if (num == null || num.intValue() != i) {
            ql2Var.g = Integer.valueOf(i);
            ql2Var.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = dr.b(f, j3);
        dr drVar = ql2Var.f;
        if (!(drVar == null ? false : vk2.a(drVar.a, jB))) {
            ql2Var.f = new dr(jB);
            ql2Var.setColor(ColorStateList.valueOf(ws0.V(jB)));
        }
        Rect rect = new Rect(0, 0, p61.j0(Float.intBitsToFloat((int) (j2 >> 32))), p61.j0(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        ql2Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        w8 w8Var = this.i;
        if (w8Var != null) {
            w8Var.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

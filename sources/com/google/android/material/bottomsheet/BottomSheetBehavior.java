package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.ao2;
import defpackage.m61;
import defpackage.n61;
import defpackage.pj;
import defpackage.qj;
import defpackage.ux;
import defpackage.v32;
import defpackage.ws0;
import defpackage.zq1;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends ux {
    public final boolean b;
    public int c;
    public boolean d;
    public final n61 e;
    public final ColorStateList f;
    public final boolean g;
    public final v32 h;
    public boolean i;
    public final ValueAnimator j;
    public final int k;
    public final boolean l;
    public int m;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int resourceId;
        ColorStateList colorStateListW;
        this.b = true;
        new ao2(this);
        this.m = 4;
        new ArrayList();
        new SparseIntArray();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zq1.a);
        int i3 = 3;
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateListW = ws0.w(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateListW;
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.h = v32.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        v32 v32Var = this.h;
        if (v32Var != null) {
            n61 n61Var = new n61(v32Var);
            this.e = n61Var;
            n61Var.h(context);
            ColorStateList colorStateList = this.f;
            if (colorStateList != null) {
                n61 n61Var2 = this.e;
                m61 m61Var = n61Var2.b;
                if (m61Var.c != colorStateList) {
                    m61Var.c = colorStateList;
                    n61Var2.onStateChange(n61Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.j.addUpdateListener(new pj(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            S(i2);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.l != z) {
            this.l = z;
            if (!z && this.m == 5 && this.m != 4) {
                this.m = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.b != z2) {
            this.b = z2;
            if (!z2 || (i = this.m) != 6) {
                i3 = this.m;
                i = i3;
            }
            if (i != i3) {
                this.m = i3;
                i = i3;
            }
            T(i);
        }
        typedArrayObtainStyledAttributes.getBoolean(13, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            qj.r("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset < 0) {
                qj.r("offset must be greater than or equal to 0");
                throw null;
            }
            this.k = dimensionPixelOffset;
            T(this.m);
        } else {
            int i4 = typedValuePeekValue2.data;
            if (i4 < 0) {
                qj.r("offset must be greater than or equal to 0");
                throw null;
            }
            this.k = i4;
            T(this.m);
        }
        typedArrayObtainStyledAttributes.getInt(12, 500);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        typedArrayObtainStyledAttributes.getBoolean(20, false);
        typedArrayObtainStyledAttributes.getBoolean(21, true);
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.g = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void S(int i) {
        boolean z = this.d;
        if (i == -1) {
            if (z) {
                return;
            }
            this.d = true;
        } else if (z || this.c != i) {
            this.d = false;
            this.c = Math.max(0, i);
        }
    }

    public final void T(int i) {
        n61 n61Var;
        if (i == 2) {
            return;
        }
        boolean z = this.m == 3 && this.g;
        if (this.i == z || (n61Var = this.e) == null) {
            return;
        }
        this.i = z;
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(n61Var.b.h, z ? 0.0f : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float f = this.i ? 0.0f : 1.0f;
        m61 m61Var = n61Var.b;
        if (m61Var.h != f) {
            m61Var.h = f;
            n61Var.f = true;
            n61Var.g = true;
            n61Var.invalidateSelf();
        }
    }

    public BottomSheetBehavior() {
        this.b = true;
        new ao2(this);
        this.m = 4;
        new ArrayList();
        new SparseIntArray();
    }
}

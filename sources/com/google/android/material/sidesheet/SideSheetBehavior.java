package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.m61;
import defpackage.n61;
import defpackage.qk1;
import defpackage.ux;
import defpackage.v32;
import defpackage.ws0;
import defpackage.zq1;
import ir.alirezaivaz.mygarage.R;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends ux {
    public final n61 b;
    public final ColorStateList c;
    public final v32 d;
    public int e;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        int resourceId;
        ColorStateList colorStateListW;
        new qk1(this);
        this.e = 5;
        new LinkedHashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zq1.h);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateListW = ws0.w(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateListW;
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = v32.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        v32 v32Var = this.d;
        if (v32Var != null) {
            n61 n61Var = new n61(v32Var);
            this.b = n61Var;
            n61Var.h(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                n61 n61Var2 = this.b;
                m61 m61Var = n61Var2.b;
                if (m61Var.c != colorStateList) {
                    m61Var.c = colorStateList;
                    n61Var2.onStateChange(n61Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new qk1(this);
        this.e = 5;
        new LinkedHashSet();
    }
}

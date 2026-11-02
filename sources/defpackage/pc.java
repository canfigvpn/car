package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pc {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public pc() {
        this.b = new rn0[32];
        this.c = new float[32];
        this.d = new byte[32];
        x91 x91Var = kx1.a;
        this.e = new x91();
        this.f = new x91();
    }

    public void a() {
        TextView textView = (TextView) this.b;
        Drawable background = textView.getBackground();
        if (background != null) {
            if (((yg2) this.d) != null) {
                yg2 yg2Var = (yg2) this.f;
                if (yg2Var == null) {
                    yg2Var = new yg2();
                    this.f = yg2Var;
                }
                yg2Var.a = null;
                yg2Var.d = false;
                yg2Var.b = null;
                yg2Var.c = false;
                Field field = ln2.a;
                ColorStateList backgroundTintList = textView.getBackgroundTintList();
                if (backgroundTintList != null) {
                    yg2Var.d = true;
                    yg2Var.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = textView.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    yg2Var.c = true;
                    yg2Var.b = backgroundTintMode;
                }
                if (yg2Var.d || yg2Var.c) {
                    int[] drawableState = textView.getDrawableState();
                    PorterDuff.Mode mode = rc.b;
                    nt1.i(background, yg2Var, drawableState);
                    return;
                }
            }
            yg2 yg2Var2 = (yg2) this.e;
            if (yg2Var2 != null) {
                int[] drawableState2 = textView.getDrawableState();
                PorterDuff.Mode mode2 = rc.b;
                nt1.i(background, yg2Var2, drawableState2);
            } else {
                yg2 yg2Var3 = (yg2) this.d;
                if (yg2Var3 != null) {
                    int[] drawableState3 = textView.getDrawableState();
                    PorterDuff.Mode mode3 = rc.b;
                    nt1.i(background, yg2Var3, drawableState3);
                }
            }
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int resourceId;
        ColorStateList colorStateListG;
        TextView textView = (TextView) this.b;
        Context context = textView.getContext();
        int[] iArr = ar1.h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView2 = (TextView) this.b;
        ln2.b(textView2, textView2.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                rc rcVar = (rc) this.c;
                Context context2 = textView.getContext();
                int i2 = this.a;
                synchronized (rcVar) {
                    colorStateListG = rcVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    d(colorStateListG);
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                if (!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0 || (colorStateList = ws0.w(context, resourceId)) == null) {
                    colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
                }
                textView.setBackgroundTintList(colorStateList);
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                textView.setBackgroundTintMode(t80.a(typedArrayObtainStyledAttributes.getInt(2, -1)));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public yb1 c(String str) {
        xb1 xb1Var;
        str.getClass();
        hb2 hb2Var = (hb2) this.f;
        if (hb2Var == null || (xb1Var = (xb1) hb2Var.getValue()) == null) {
            return null;
        }
        int i = zb1.i;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = xb1Var.d(uri, (LinkedHashMap) this.d);
        if (bundleD == null) {
            return null;
        }
        return new yb1((zb1) this.b, bundleD, xb1Var.l, xb1Var.b(uri), false);
    }

    public void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            yg2 yg2Var = (yg2) this.d;
            if (yg2Var == null) {
                yg2Var = new yg2();
                this.d = yg2Var;
            }
            yg2Var.a = colorStateList;
            yg2Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public pc(TextView textView) {
        rc rcVar;
        this.a = -1;
        this.b = textView;
        PorterDuff.Mode mode = rc.b;
        synchronized (rc.class) {
            try {
                if (rc.c == null) {
                    rc.b();
                }
                rcVar = rc.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = rcVar;
    }
}

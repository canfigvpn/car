package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zc {
    public final TextView a;
    public yg2 b;
    public yg2 c;
    public yg2 d;
    public yg2 e;
    public yg2 f;
    public yg2 g;
    public yg2 h;
    public final id i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public zc(TextView textView) {
        this.a = textView;
        this.i = new id(textView);
    }

    public static yg2 c(Context context, rc rcVar, int i) {
        ColorStateList colorStateListG;
        synchronized (rcVar) {
            colorStateListG = rcVar.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        yg2 yg2Var = new yg2();
        yg2Var.d = true;
        yg2Var.a = colorStateListG;
        return yg2Var;
    }

    public final void a(Drawable drawable, yg2 yg2Var) {
        if (drawable == null || yg2Var == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = rc.b;
        nt1.i(drawable, yg2Var, drawableState);
    }

    public final void b() {
        yg2 yg2Var = this.b;
        TextView textView = this.a;
        if (yg2Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    /* JADX WARN: Code duplicated, block: B:234:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:236:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:242:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:244:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:246:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    public final void d(AttributeSet attributeSet, int i) {
        rc rcVar;
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        int[] iArr = ar1.g;
        id idVar = this.i;
        TextView textView = this.a;
        Context context = textView.getContext();
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
        int[] iArr2 = ar1.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TextView textView2 = this.a;
        ln2.b(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes, i);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.b = c(context, rcVar, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.c = c(context, rcVar, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            this.d = c(context, rcVar, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.e = c(context, rcVar, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.f = c(context, rcVar, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.g = c(context, rcVar, typedArrayObtainStyledAttributes.getResourceId(6, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId3, iArr);
            ud udVar = new ud(context, typedArrayObtainStyledAttributes2);
            if (z3 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
                z = true;
            }
            f(context, udVar);
            string2 = typedArrayObtainStyledAttributes2.hasValue(15) ? typedArrayObtainStyledAttributes2.getString(15) : null;
            string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes2.hasValue(13)) ? null : typedArrayObtainStyledAttributes2.getString(13);
            udVar.t();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ud udVar2 = new ud(context, typedArrayObtainStyledAttributes3);
        if (!z3 && typedArrayObtainStyledAttributes3.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes3.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes3.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes3.getString(15);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && typedArrayObtainStyledAttributes3.hasValue(13)) {
            string = typedArrayObtainStyledAttributes3.getString(13);
        }
        if (i4 >= 28 && typedArrayObtainStyledAttributes3.hasValue(0) && typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, udVar2);
        udVar2.t();
        if (!z3 && z) {
            this.a.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            xc.d(textView, string);
        }
        if (string2 != null) {
            wc.b(textView, wc.a(string2));
        }
        Context context2 = idVar.j;
        int[] iArr3 = ar1.b;
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView3 = idVar.i;
        ln2.b(textView3, textView3.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes4, i);
        if (typedArrayObtainStyledAttributes4.hasValue(5)) {
            idVar.a = typedArrayObtainStyledAttributes4.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes4.hasValue(4) ? typedArrayObtainStyledAttributes4.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes4.hasValue(2) ? typedArrayObtainStyledAttributes4.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes4.hasValue(1) ? typedArrayObtainStyledAttributes4.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes4.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes4.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes4.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                idVar.f = id.b(iArr4);
                idVar.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (idVar.a == 1) {
            if (!idVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                idVar.i(dimension2, dimension3, dimension);
            }
            idVar.g();
        }
        if (fo2.a && idVar.a != 0) {
            int[] iArr5 = idVar.f;
            if (iArr5.length > 0) {
                if (xc.a(textView) != -1.0f) {
                    xc.b(textView, Math.round(idVar.d), Math.round(idVar.e), Math.round(idVar.c), 0);
                } else {
                    xc.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, ar1.b);
        int resourceId4 = typedArrayObtainStyledAttributes5.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? rcVar.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes5.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? rcVar.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes5.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? rcVar.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes5.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? rcVar.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes5.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? rcVar.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes5.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? rcVar.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[0];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            Drawable drawable = drawableA6;
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawable, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable2 = compoundDrawablesRelative2[0];
            if (drawable2 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawableA2, compoundDrawablesRelative2[2], drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes5.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes5.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes5.getResourceId(11, 0)) == 0 || (colorStateList = ws0.w(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes5.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes5.hasValue(12)) {
            textView.setCompoundDrawableTintMode(t80.a(typedArrayObtainStyledAttributes5.getInt(12, -1)));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes5.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes5.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes5.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes5.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes5.getDimensionPixelSize(19, -1);
            } else {
                int i6 = typedValuePeekValue.data;
                int i7 = i6 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i6);
                i3 = i7;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes5.recycle();
            if (dimensionPixelSize2 != i2) {
                c12.v(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                c12.x(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == i2) {
                    c12.y(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    t0.l(textView, i3, dimensionPixelSize);
                } else {
                    c12.y(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = -1.0f;
        i3 = i2;
        typedArrayObtainStyledAttributes5.recycle();
        if (dimensionPixelSize2 != i2) {
            c12.v(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            c12.x(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                c12.y(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                t0.l(textView, i3, dimensionPixelSize);
            } else {
                c12.y(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ar1.g);
        ud udVar = new ud(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, udVar);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            xc.d(textView, string);
        }
        udVar.t();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(Context context, ud udVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) udVar.b;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = udVar.i(i5, this.j, new uc(this, i6, i7, new WeakReference(this.a)));
                if (typefaceI != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceI;
                    } else {
                        this.l = yc.a(Typeface.create(typefaceI, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = yc.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}

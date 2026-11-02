package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v32 {
    public final /* synthetic */ int a;
    public rw b;
    public rw c;
    public rw d;
    public rw e;
    public qy f;
    public qy g;
    public qy h;
    public qy i;
    public q90 j;
    public q90 k;
    public q90 l;
    public q90 m;

    public v32(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.b = new lv1();
                this.c = new lv1();
                this.d = new lv1();
                this.e = new lv1();
                this.f = new b(0.0f);
                this.g = new b(0.0f);
                this.h = new b(0.0f);
                this.i = new b(0.0f);
                int i2 = 0;
                this.j = new q90(i2);
                this.k = new q90(i2);
                this.l = new q90(i2);
                this.m = new q90(i2);
                break;
        }
    }

    public static v32 b(Context context, AttributeSet attributeSet, int i, int i2) {
        b bVar = new b(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zq1.e, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(zq1.g);
        try {
            int i3 = typedArrayObtainStyledAttributes2.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes2.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes2.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes2.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes2.getInt(1, i3);
            qy qyVarC = c(typedArrayObtainStyledAttributes2, 5, bVar);
            qy qyVarC2 = c(typedArrayObtainStyledAttributes2, 8, qyVarC);
            qy qyVarC3 = c(typedArrayObtainStyledAttributes2, 9, qyVarC);
            qy qyVarC4 = c(typedArrayObtainStyledAttributes2, 7, qyVarC);
            qy qyVarC5 = c(typedArrayObtainStyledAttributes2, 6, qyVarC);
            v32 v32Var = new v32(0);
            v32Var.b = sv.w(i4);
            v32Var.f = qyVarC2;
            v32Var.c = sv.w(i5);
            v32Var.g = qyVarC3;
            v32Var.d = sv.w(i6);
            v32Var.h = qyVarC4;
            v32Var.e = sv.w(i7);
            v32Var.i = qyVarC5;
            return v32Var;
        } finally {
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    public static qy c(TypedArray typedArray, int i, qy qyVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new b(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new ns1(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return qyVar;
    }

    public v32 a() {
        v32 v32Var = new v32(1);
        v32Var.b = this.b;
        v32Var.c = this.c;
        v32Var.d = this.d;
        v32Var.e = this.e;
        v32Var.f = this.f;
        v32Var.g = this.g;
        v32Var.h = this.h;
        v32Var.i = this.i;
        v32Var.j = this.j;
        v32Var.k = this.k;
        v32Var.l = this.l;
        v32Var.m = this.m;
        return v32Var;
    }

    public boolean d() {
        return (this.c instanceof lv1) && (this.b instanceof lv1) && (this.d instanceof lv1) && (this.e instanceof lv1);
    }

    public boolean e(RectF rectF) {
        boolean z = this.m.getClass().equals(q90.class) && this.k.getClass().equals(q90.class) && this.j.getClass().equals(q90.class) && this.l.getClass().equals(q90.class);
        float fA = this.f.a(rectF);
        return z && ((this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0 && (this.i.a(rectF) > fA ? 1 : (this.i.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "[" + this.f + ", " + this.g + ", " + this.h + ", " + this.i + "]";
            default:
                return super.toString();
        }
    }
}

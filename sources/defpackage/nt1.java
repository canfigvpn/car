package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import ir.alirezaivaz.mygarage.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nt1 {
    public static nt1 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public qc e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final mt1 h = new mt1(6);

    public static synchronized nt1 c() {
        nt1 nt1Var;
        nt1Var = g;
        if (nt1Var == null) {
            nt1Var = new nt1();
            g = nt1Var;
        }
        return nt1Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        mt1 mt1Var = h;
        mt1Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) mt1Var.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, yg2 yg2Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = yg2Var.d;
        if (!z && !yg2Var.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? yg2Var.a : null;
        PorterDuff.Mode mode = yg2Var.c ? yg2Var.b : f;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        v72 v72Var = (v72) weakHashMap.get(context);
        if (v72Var == null) {
            v72Var = new v72();
            this.a.put(context, v72Var);
        }
        int i2 = v72Var.h;
        if (i2 != 0 && i <= v72Var.f[i2 - 1]) {
            v72Var.c(i, colorStateList);
            return;
        }
        if (v72Var.e && i2 >= v72Var.f.length) {
            s5.G(v72Var);
        }
        int i3 = v72Var.h;
        if (i3 >= v72Var.f.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            v72Var.f = Arrays.copyOf(v72Var.f, i7);
            v72Var.g = Arrays.copyOf(v72Var.g, i7);
        }
        v72Var.f[i3] = i;
        v72Var.g[i3] = colorStateList;
        v72Var.h = i3 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawableC;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            t41 t41Var = (t41) this.b.get(context);
            layerDrawableC = null;
            if (t41Var != null && (weakReference = (WeakReference) t41Var.a(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    t41Var.d(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableC = qc.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = qc.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = qc.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                t41 t41Var2 = (t41) this.b.get(context);
                if (t41Var2 == null) {
                    t41Var2 = new t41();
                    this.b.put(context, t41Var2);
                }
                t41Var2.c(j, new WeakReference(constantState2));
                return layerDrawableC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i);
    }

    public final synchronized Drawable e(Context context, int i) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, drawableB);
            }
            if (drawableB != null) {
                int[] iArr = t80.a;
                String name = drawableB.getClass().getName();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = drawableB.getState();
                    if (state == null || state.length == 0) {
                        drawableB.setState(t80.a);
                    } else {
                        drawableB.setState(t80.b);
                    }
                    drawableB.setState(state);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        v72 v72Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (v72Var = (v72) weakHashMap.get(context)) == null) ? null : (ColorStateList) s5.B(v72Var, i);
        if (colorStateList == null) {
            qc qcVar = this.e;
            if (qcVar != null) {
                colorStateListD = qcVar.d(context, i);
            }
            if (colorStateListD != null) {
                a(context, i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, Drawable drawable) {
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            PorterDuff.Mode mode = null;
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        qc qcVar = this.e;
        int i2 = R.attr.colorControlNormal;
        if (qcVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = eg2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = rc.b;
                qc.e(drawableFindDrawableByLayerId, iC, mode2);
                qc.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), eg2.c(context, R.attr.colorControlNormal), mode2);
                qc.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), eg2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = eg2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = rc.b;
                qc.e(drawableFindDrawableByLayerId2, iB, mode3);
                qc.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), eg2.c(context, R.attr.colorControlActivated), mode3);
                qc.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), eg2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        qc qcVar2 = this.e;
        if (qcVar2 != null) {
            PorterDuff.Mode mode4 = rc.b;
            boolean z = true;
            if (qc.a(qcVar2.a, i)) {
                iRound = -1;
            } else {
                if (qc.a(qcVar2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zA = qc.a(qcVar2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z = false;
                    }
                }
                iRound = -1;
            }
            if (z) {
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = eg2.c(context, i2);
                synchronized (rc.class) {
                    porterDuffColorFilterF = f(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterF);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
            }
        }
        return drawable;
    }
}

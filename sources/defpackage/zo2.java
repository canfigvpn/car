package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import ir.alirezaivaz.mygarage.R;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 implements View.OnApplyWindowInsetsListener {
    public final vo2 a;
    public aq2 b;

    public zo2(View view, vo2 vo2Var) {
        aq2 aq2VarB;
        this.a = vo2Var;
        Field field = ln2.a;
        aq2 aq2VarA = gn2.a(view);
        if (aq2VarA != null) {
            int i = Build.VERSION.SDK_INT;
            aq2VarB = (i >= 36 ? new mp2(aq2VarA) : i >= 35 ? new lp2(aq2VarA) : i >= 34 ? new kp2(aq2VarA) : i >= 31 ? new jp2(aq2VarA) : i >= 30 ? new ip2(aq2VarA) : i >= 29 ? new hp2(aq2VarA) : new gp2(aq2VarA)).b();
        } else {
            aq2VarB = null;
        }
        this.b = aq2VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = aq2.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        aq2 aq2VarC = aq2.c(windowInsets, view);
        xp2 xp2Var = aq2VarC.a;
        aq2 aq2VarA = this.b;
        if (aq2VarA == null) {
            Field field = ln2.a;
            aq2VarA = gn2.a(view);
            this.b = aq2VarA;
        }
        if (aq2VarA == null) {
            this.b = aq2VarC;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            vo2 vo2VarJ = ap2.j(view);
            if (vo2VarJ == null || !Objects.equals(vo2VarJ.e, aq2VarC)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                aq2 aq2Var = this.b;
                int i = 1;
                while (i <= 512) {
                    kq0 kq0VarH = xp2Var.h(i);
                    kq0 kq0VarH2 = aq2Var.a.h(i);
                    int i2 = kq0VarH.a;
                    int i3 = kq0VarH.d;
                    int i4 = kq0VarH.c;
                    int i5 = kq0VarH.b;
                    int i6 = kq0VarH2.a;
                    int i7 = kq0VarH2.d;
                    int[] iArr3 = iArr;
                    int i8 = kq0VarH2.c;
                    int i9 = kq0VarH2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = aq2VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    aq2 aq2Var2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = ap2.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = ap2.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = ap2.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? ap2.h : null;
                    }
                    fp2 fp2Var = new fp2(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    fp2Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(fp2Var.a.b());
                    kq0 kq0VarH3 = xp2Var.h(i12);
                    kq0 kq0VarH4 = aq2Var2.a.h(i12);
                    int iMin = Math.min(kq0VarH3.a, kq0VarH4.a);
                    int i13 = kq0VarH3.b;
                    int i14 = kq0VarH4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = kq0VarH3.c;
                    int i16 = kq0VarH4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = kq0VarH3.d;
                    int i18 = kq0VarH4.d;
                    ru1 ru1Var = new ru1(11, kq0.b(iMin, iMin2, iMin3, Math.min(i17, i18)), kq0.b(Math.max(kq0VarH3.a, kq0VarH4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    ap2.g(view, fp2Var, aq2VarC, false);
                    duration.addUpdateListener(new wo2(fp2Var, aq2VarC, aq2Var2, i12, view));
                    duration.addListener(new xo2(fp2Var, view));
                    rg1 rg1Var = new rg1(view, new yo2(view, fp2Var, ru1Var, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(rg1Var);
                    view.addOnAttachStateChangeListener(rg1Var);
                    this.b = aq2VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd extends TextView {
    public final pc e;
    public final zc f;
    public final dq0 g;
    public sc h;
    public boolean i;
    public ao2 j;
    public Future k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        Object obj = xg2.a;
        if (!(context.getResources() instanceof zg2)) {
            context.getResources();
            int i = hm2.a;
        }
        this.i = false;
        this.j = null;
        eg2.a(this, getContext());
        pc pcVar = new pc(this);
        this.e = pcVar;
        pcVar.b(attributeSet, R.attr.textViewStyle);
        zc zcVar = new zc(this);
        this.f = zcVar;
        zcVar.d(attributeSet, R.attr.textViewStyle);
        zcVar.b();
        dq0 dq0Var = new dq0(2, false);
        dq0Var.f = this;
        this.g = dq0Var;
        sc emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray typedArrayObtainStyledAttributes = emojiTextViewHelper.a.getContext().obtainStyledAttributes(attributeSet, ar1.b, R.attr.textViewStyle, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((ex) emojiTextViewHelper.b.f).N(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private sc getEmojiTextViewHelper() {
        sc scVar = this.h;
        if (scVar != null) {
            return scVar;
        }
        sc scVar2 = new sc(this);
        this.h = scVar2;
        return scVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        pc pcVar = this.e;
        if (pcVar != null) {
            pcVar.a();
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (fo2.a) {
            return super.getAutoSizeMaxTextSize();
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            return Math.round(zcVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (fo2.a) {
            return super.getAutoSizeMinTextSize();
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            return Math.round(zcVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (fo2.a) {
            return super.getAutoSizeStepGranularity();
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            return Math.round(zcVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (fo2.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        zc zcVar = this.f;
        return zcVar != null ? zcVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (fo2.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            return zcVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return (!(customSelectionActionModeCallback instanceof ag2) || Build.VERSION.SDK_INT < 26) ? customSelectionActionModeCallback : ((ag2) customSelectionActionModeCallback).a;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ad getSuperCaller() {
        ao2 ao2Var = this.j;
        if (ao2Var != null) {
            return ao2Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            cd cdVar = new cd(this);
            this.j = cdVar;
            return cdVar;
        }
        if (i >= 28) {
            bd bdVar = new bd(this);
            this.j = bdVar;
            return bdVar;
        }
        if (i < 26) {
            return ao2Var;
        }
        ao2 ao2Var2 = new ao2(4, this);
        this.j = ao2Var2;
        return ao2Var2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        yg2 yg2Var;
        pc pcVar = this.e;
        if (pcVar == null || (yg2Var = (yg2) pcVar.e) == null) {
            return null;
        }
        return yg2Var.a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yg2 yg2Var;
        pc pcVar = this.e;
        if (pcVar == null || (yg2Var = (yg2) pcVar.e) == null) {
            return null;
        }
        return yg2Var.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        yg2 yg2Var = this.f.h;
        if (yg2Var != null) {
            return yg2Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        yg2 yg2Var = this.f.h;
        if (yg2Var != null) {
            return yg2Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.k;
        if (future != null) {
            try {
                this.k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                c12.m(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        dq0 dq0Var;
        if (Build.VERSION.SDK_INT >= 28 || (dq0Var = this.g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) dq0Var.g;
        return textClassifier == null ? tc.a((dd) dq0Var.f) : textClassifier;
    }

    public ap1 getTextMetricsParamsCompat() {
        return c12.m(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            sv.T(editorInfo, getText());
        }
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zc zcVar = this.f;
        if (zcVar == null || fo2.a) {
            return;
        }
        zcVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.k;
        if (future != null) {
            try {
                this.k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                c12.m(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        zc zcVar = this.f;
        if (zcVar == null || fo2.a) {
            return;
        }
        id idVar = zcVar.i;
        if (idVar.a != 0) {
            idVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((ex) getEmojiTextViewHelper().b.f).M(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (fo2.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            id idVar = zcVar.i;
            DisplayMetrics displayMetrics = idVar.j.getResources().getDisplayMetrics();
            idVar.i(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (idVar.g()) {
                idVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (fo2.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            id idVar = zcVar.i;
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = idVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                idVar.f = id.b(iArrCopyOf);
                if (!idVar.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                idVar.g = false;
            }
            if (idVar.g()) {
                idVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (fo2.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            id idVar = zcVar.i;
            if (i == 0) {
                idVar.a = 0;
                idVar.d = -1.0f;
                idVar.e = -1.0f;
                idVar.c = -1.0f;
                idVar.f = new int[0];
                idVar.b = false;
                return;
            }
            if (i != 1) {
                qj.r(k3.i("Unknown auto-size text type: ", i));
                return;
            }
            DisplayMetrics displayMetrics = idVar.j.getResources().getDisplayMetrics();
            idVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (idVar.g()) {
                idVar.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        pc pcVar = this.e;
        if (pcVar != null) {
            pcVar.a = -1;
            pcVar.d(null);
            pcVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        ColorStateList colorStateListG;
        super.setBackgroundResource(i);
        pc pcVar = this.e;
        if (pcVar != null) {
            pcVar.a = i;
            rc rcVar = (rc) pcVar.c;
            if (rcVar != null) {
                Context context = ((TextView) pcVar.b).getContext();
                synchronized (rcVar) {
                    colorStateListG = rcVar.a.g(context, i);
                }
            } else {
                colorStateListG = null;
            }
            pcVar.d(colorStateListG);
            pcVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ws0.y(context, i) : null, i2 != 0 ? ws0.y(context, i2) : null, i3 != 0 ? ws0.y(context, i3) : null, i4 != 0 ? ws0.y(context, i4) : null);
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ws0.y(context, i) : null, i2 != 0 ? ws0.y(context, i2) : null, i3 != 0 ? ws0.y(context, i3) : null, i4 != 0 ? ws0.y(context, i4) : null);
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof ag2) && callback != null) {
            callback = new ag2(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((ex) getEmojiTextViewHelper().b.f).N(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((ex) getEmojiTextViewHelper().b.f).v(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            c12.v(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            c12.x(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().e(i, f);
        } else if (i2 >= 34) {
            t0.l(this, i, f);
        } else {
            c12.y(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(bp1 bp1Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        c12.m(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        pc pcVar = this.e;
        if (pcVar != null) {
            yg2 yg2Var = (yg2) pcVar.e;
            if (yg2Var == null) {
                yg2Var = new yg2();
                pcVar.e = yg2Var;
            }
            yg2Var.a = colorStateList;
            yg2Var.d = true;
            pcVar.a();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        pc pcVar = this.e;
        if (pcVar != null) {
            yg2 yg2Var = (yg2) pcVar.e;
            if (yg2Var == null) {
                yg2Var = new yg2();
                pcVar.e = yg2Var;
            }
            yg2Var.b = mode;
            yg2Var.c = true;
            pcVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        zc zcVar = this.f;
        yg2 yg2Var = zcVar.h;
        if (yg2Var == null) {
            yg2Var = new yg2();
            zcVar.h = yg2Var;
        }
        yg2 yg2Var2 = yg2Var;
        yg2Var.a = colorStateList;
        yg2Var.d = colorStateList != null;
        zcVar.b = yg2Var2;
        zcVar.c = yg2Var2;
        zcVar.d = yg2Var2;
        zcVar.e = yg2Var2;
        zcVar.f = yg2Var2;
        zcVar.g = yg2Var2;
        zcVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        zc zcVar = this.f;
        yg2 yg2Var = zcVar.h;
        if (yg2Var == null) {
            yg2Var = new yg2();
            zcVar.h = yg2Var;
        }
        yg2 yg2Var2 = yg2Var;
        yg2Var.b = mode;
        yg2Var.c = mode != null;
        zcVar.b = yg2Var2;
        zcVar.c = yg2Var2;
        zcVar.d = yg2Var2;
        zcVar.e = yg2Var2;
        zcVar.f = yg2Var2;
        zcVar.g = yg2Var2;
        zcVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        dq0 dq0Var;
        if (Build.VERSION.SDK_INT >= 28 || (dq0Var = this.g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            dq0Var.g = textClassifier;
        }
    }

    public void setTextFuture(Future<bp1> future) {
        this.k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(ap1 ap1Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = ap1Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(ap1Var.a);
        setBreakStrategy(ap1Var.c);
        setHyphenationFrequency(ap1Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = fo2.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        zc zcVar = this.f;
        if (zcVar != null) {
            id idVar = zcVar.i;
            if (z || idVar.a != 0) {
                return;
            }
            idVar.f(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.i) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            j02 j02Var = rj2.a;
            if (context == null) {
                qj.r("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.i = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.i = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        c12.y(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zc zcVar = this.f;
        if (zcVar != null) {
            zcVar.b();
        }
    }
}

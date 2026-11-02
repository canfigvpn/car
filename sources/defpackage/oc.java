package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oc extends AutoCompleteTextView {
    public static final int[] h = {R.attr.popupBackground};
    public final pc e;
    public final zc f;
    public final ao2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, ir.alirezaivaz.mygarage.R.attr.autoCompleteTextViewStyle);
        Object obj = xg2.a;
        if (!(context.getResources() instanceof zg2)) {
            context.getResources();
            int i = hm2.a;
        }
        eg2.a(this, getContext());
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, h, ir.alirezaivaz.mygarage.R.attr.autoCompleteTextViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : ws0.y(context2, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
        pc pcVar = new pc(this);
        this.e = pcVar;
        pcVar.b(attributeSet, ir.alirezaivaz.mygarage.R.attr.autoCompleteTextViewStyle);
        zc zcVar = new zc(this);
        this.f = zcVar;
        zcVar.d(attributeSet, ir.alirezaivaz.mygarage.R.attr.autoCompleteTextViewStyle);
        zcVar.b();
        ao2 ao2Var = new ao2(this, 3);
        this.g = ao2Var;
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, ar1.b, ir.alirezaivaz.mygarage.R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes2.hasValue(14) ? typedArrayObtainStyledAttributes2.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes2.recycle();
            ao2Var.v(z);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM = ao2Var.m(keyListener);
            if (keyListenerM == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return (!(customSelectionActionModeCallback instanceof ag2) || Build.VERSION.SDK_INT < 26) ? customSelectionActionModeCallback : ((ag2) customSelectionActionModeCallback).a;
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        ao2 ao2Var = (ao2) this.g.f;
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return inputConnectionOnCreateInputConnection instanceof ja0 ? inputConnectionOnCreateInputConnection : new ja0((oc) ((dq0) ao2Var.f).f, inputConnectionOnCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof ag2) && callback != null) {
            callback = new ag2(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ws0.y(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.g.v(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.g.m(keyListener));
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
}

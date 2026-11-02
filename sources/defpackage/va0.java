package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class va0 implements TextWatcher {
    public final oc e;
    public ua0 f;
    public boolean g = true;

    public va0(oc ocVar) {
        this.e = ocVar;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ca0 ca0VarA = ca0.a();
            if (editableText == null) {
                length = 0;
            } else {
                ca0VarA.getClass();
                length = editableText.length();
            }
            ca0VarA.g(editableText, 0, length, 0);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        oc ocVar = this.e;
        if (!ocVar.isInEditMode() && this.g && ca0.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = ca0.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    ca0.a().g((Spannable) charSequence, i, i3 + i, 0);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            ca0 ca0VarA = ca0.a();
            ua0 ua0Var = this.f;
            if (ua0Var == null) {
                ua0Var = new ua0(ocVar);
                this.f = ua0Var;
            }
            ca0VarA.h(ua0Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

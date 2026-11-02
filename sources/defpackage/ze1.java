package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class ze1 implements InputConnection {
    public final y3 a;
    public vr1 b;

    public ze1(vr1 vr1Var, y3 y3Var) {
        this.a = y3Var;
        this.b = vr1Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            if (vr1Var != null) {
                vr1Var.closeConnection();
                this.b = null;
            }
            this.a.h(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.setSelection(i, i2);
        }
        return false;
    }
}

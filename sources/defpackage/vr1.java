package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vr1 implements InputConnection {
    public final ao2 a;
    public final boolean b;
    public final f11 c;
    public final me2 d;
    public final on2 e;
    public int f;
    public te2 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public vr1(te2 te2Var, ao2 ao2Var, boolean z, f11 f11Var, me2 me2Var, on2 on2Var) {
        this.a = ao2Var;
        this.b = z;
        this.c = f11Var;
        this.d = me2Var;
        this.e = on2Var;
        this.g = te2Var;
    }

    public final void a(r90 r90Var) {
        this.f++;
        try {
            this.j.add(r90Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((g11) this.a.f).c.h(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((g11) this.a.f).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (ws0.j(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new es(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new j40(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new k40(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new kd0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        te2 te2Var = this.g;
        return TextUtils.getCapsMode(te2Var.a.f, of2.f(te2Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return qx.a0(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (of2.c(this.g.b)) {
            return null;
        }
        return y12.m(this.g).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return y12.n(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return y12.o(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new c32(0, this.g.a.f.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((g11) this.a.f).d.h(new no0(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x026c  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        yb ybVar;
        long jH;
        int i;
        int i2;
        int i3;
        String string;
        if2 if2VarD;
        if2 if2VarD2;
        gf2 gf2Var;
        if (Build.VERSION.SDK_INT >= 34) {
            tr1 tr1Var = new tr1(0, this);
            f11 f11Var = this.c;
            int iV = 3;
            if (f11Var != null && (ybVar = f11Var.j) != null) {
                if2 if2VarD3 = f11Var.d();
                if (ybVar.equals((if2VarD3 == null || (gf2Var = if2VarD3.a.a) == null) ? null : gf2Var.a)) {
                    boolean zQ = i7.q(handwritingGesture);
                    me2 me2Var = this.d;
                    if (zQ) {
                        SelectGesture selectGestureK = i7.k(handwritingGesture);
                        long jC = qx.C(f11Var, ux.L(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() != 1 ? 0 : 1);
                        if (of2.c(jC)) {
                            iV = mx.v(wl0.o(selectGestureK), tr1Var);
                        } else {
                            tr1Var.h(new c32((int) (jC >> 32), (int) (jC & 4294967295L)));
                            if (me2Var != null) {
                                me2Var.e(true);
                            }
                            iV = 1;
                        }
                    } else if (wl0.A(handwritingGesture)) {
                        DeleteGesture deleteGestureM = wl0.m(handwritingGesture);
                        int i4 = deleteGestureM.getGranularity() != 1 ? 0 : 1;
                        long jC2 = qx.C(f11Var, ux.L(deleteGestureM.getDeletionArea()), i4);
                        if (of2.c(jC2)) {
                            iV = mx.v(wl0.o(deleteGestureM), tr1Var);
                        } else {
                            mx.H(jC2, ybVar, i4 == 1, tr1Var);
                            iV = 1;
                        }
                    } else if (wl0.C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureR = wl0.r(handwritingGesture);
                        long jD = qx.D(f11Var, ux.L(selectRangeGestureR.getSelectionStartArea()), ux.L(selectRangeGestureR.getSelectionEndArea()), selectRangeGestureR.getGranularity() != 1 ? 0 : 1);
                        if (of2.c(jD)) {
                            iV = mx.v(wl0.o(selectRangeGestureR), tr1Var);
                        } else {
                            tr1Var.h(new c32((int) (jD >> 32), (int) (jD & 4294967295L)));
                            if (me2Var != null) {
                                me2Var.e(true);
                            }
                            iV = 1;
                        }
                    } else if (wl0.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureN = wl0.n(handwritingGesture);
                        int i5 = deleteRangeGestureN.getGranularity() != 1 ? 0 : 1;
                        long jD2 = qx.D(f11Var, ux.L(deleteRangeGestureN.getDeletionStartArea()), ux.L(deleteRangeGestureN.getDeletionEndArea()), i5);
                        if (of2.c(jD2)) {
                            iV = mx.v(wl0.o(deleteRangeGestureN), tr1Var);
                        } else {
                            mx.H(jD2, ybVar, i5 == 1, tr1Var);
                            iV = 1;
                        }
                    } else {
                        boolean zV = wl0.v(handwritingGesture);
                        on2 on2Var = this.e;
                        if (zV) {
                            JoinOrSplitGesture joinOrSplitGestureP = wl0.p(handwritingGesture);
                            if (on2Var == null) {
                                iV = mx.v(wl0.z(joinOrSplitGestureP), tr1Var);
                            } else {
                                int iB = qx.B(f11Var, qx.c0(joinOrSplitGestureP.getJoinOrSplitPoint()), on2Var);
                                if (iB == -1 || ((if2VarD2 = f11Var.d()) != null && qx.I(if2VarD2.a, iB))) {
                                    iV = mx.v(wl0.o(joinOrSplitGestureP), tr1Var);
                                } else {
                                    int iCharCount = iB;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(ybVar, iCharCount);
                                        if (!qx.K(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iB < ybVar.f.length()) {
                                        int iCodePointAt = Character.codePointAt(ybVar, iB);
                                        if (!qx.K(iCodePointAt)) {
                                            break;
                                        } else {
                                            iB += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jC3 = j02.c(iCharCount, iB);
                                    if (of2.c(jC3)) {
                                        int i6 = (int) (jC3 >> 32);
                                        tr1Var.h(new xl0(new r90[]{new c32(i6, i6), new es(" ", 1)}));
                                    } else {
                                        mx.H(jC3, ybVar, false, tr1Var);
                                    }
                                    iV = 1;
                                }
                            }
                        } else if (i7.v(handwritingGesture)) {
                            InsertGesture insertGestureJ = i7.j(handwritingGesture);
                            if (on2Var == null) {
                                iV = mx.v(wl0.z(insertGestureJ), tr1Var);
                            } else {
                                int iB2 = qx.B(f11Var, qx.c0(insertGestureJ.getInsertionPoint()), on2Var);
                                if (iB2 == -1 || ((if2VarD = f11Var.d()) != null && qx.I(if2VarD.a, iB2))) {
                                    iV = mx.v(wl0.o(insertGestureJ), tr1Var);
                                } else {
                                    tr1Var.h(new xl0(new r90[]{new c32(iB2, iB2), new es(insertGestureJ.getTextToInsert(), 1)}));
                                    iV = 1;
                                }
                            }
                        } else if (i7.x(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureQ = wl0.q(handwritingGesture);
                            if2 if2VarD4 = f11Var.d();
                            hf2 hf2Var = if2VarD4 != null ? if2VarD4.a : null;
                            long jC0 = qx.c0(removeSpaceGestureQ.getStartPoint());
                            long jC1 = qx.c0(removeSpaceGestureQ.getEndPoint());
                            jw0 jw0VarC = f11Var.c();
                            if (hf2Var != null) {
                                t81 t81Var = hf2Var.b;
                                if (jw0VarC == null) {
                                    jH = of2.b;
                                } else {
                                    long jZ = jw0VarC.z(jC0);
                                    long jZ2 = jw0VarC.z(jC1);
                                    int iA = qx.A(t81Var, jZ, on2Var);
                                    int iA2 = qx.A(t81Var, jZ2, on2Var);
                                    if (iA != -1) {
                                        if (iA2 != -1) {
                                            iA = Math.min(iA, iA2);
                                        }
                                        iA2 = iA;
                                    } else if (iA2 == -1) {
                                        jH = of2.b;
                                    }
                                    float fB = (t81Var.b(iA2) + t81Var.f(iA2)) / 2.0f;
                                    int i7 = (int) (jZ >> 32);
                                    int i8 = (int) (jZ2 >> 32);
                                    jH = t81Var.h(new yr1(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fB - 0.1f, Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fB + 0.1f), 0, is1.r);
                                }
                            } else {
                                jH = of2.b;
                            }
                            if (of2.c(jH)) {
                                iV = mx.v(wl0.o(removeSpaceGestureQ), tr1Var);
                            } else {
                                String str = ybVar.subSequence(of2.f(jH), of2.e(jH)).f;
                                Pattern patternCompile = Pattern.compile("\\s+");
                                patternCompile.getClass();
                                str.getClass();
                                Matcher matcher = patternCompile.matcher(str);
                                matcher.getClass();
                                ud udVarT = rw.t(matcher, 0, str);
                                if (udVarT == null) {
                                    string = str.toString();
                                    i2 = -1;
                                    i = -1;
                                } else {
                                    int length = str.length();
                                    StringBuilder sb = new StringBuilder(length);
                                    i = -1;
                                    int i9 = 0;
                                    while (true) {
                                        sb.append((CharSequence) str, i9, udVarT.l().e);
                                        if (i == -1) {
                                            i = udVarT.l().e;
                                        }
                                        i2 = udVarT.l().f + 1;
                                        sb.append((CharSequence) "");
                                        i3 = udVarT.l().f + 1;
                                        udVarT = udVarT.r();
                                        if (i3 >= length || udVarT == null) {
                                            break;
                                        } else {
                                            i9 = i3;
                                        }
                                    }
                                    if (i3 < length) {
                                        sb.append((CharSequence) str, i3, length);
                                    }
                                    string = sb.toString();
                                }
                                if (i == -1 || i2 == -1) {
                                    iV = mx.v(wl0.o(removeSpaceGestureQ), tr1Var);
                                } else {
                                    int i10 = (int) (jH >> 32);
                                    tr1Var.h(new xl0(new r90[]{new c32(i10 + i, i10 + i2), new es(string.substring(i, string.length() - (of2.d(jH) - i2)), 1)}));
                                    iV = 1;
                                }
                            }
                        } else {
                            iV = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new gc(iV, 0, intConsumer));
            } else {
                intConsumer.accept(iV);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        f11 f11Var;
        yb ybVar;
        gf2 gf2Var;
        if (Build.VERSION.SDK_INT >= 34 && (f11Var = this.c) != null && (ybVar = f11Var.j) != null) {
            if2 if2VarD = f11Var.d();
            if (ybVar.equals((if2VarD == null || (gf2Var = if2VarD.a.a) == null) ? null : gf2Var.a)) {
                boolean zQ = i7.q(previewableHandwritingGesture);
                int i = 1;
                sl0 sl0Var = sl0.e;
                me2 me2Var = this.d;
                if (zQ) {
                    SelectGesture selectGestureK = i7.k(previewableHandwritingGesture);
                    if (me2Var != null) {
                        long jC = qx.C(f11Var, ux.L(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() != 1 ? 0 : 1);
                        f11 f11Var2 = me2Var.d;
                        if (f11Var2 != null) {
                            f11Var2.f(jC);
                        }
                        f11 f11Var3 = me2Var.d;
                        if (f11Var3 != null) {
                            f11Var3.e(of2.b);
                        }
                        if (!of2.c(jC)) {
                            me2Var.u(false);
                            me2Var.r(sl0Var);
                        }
                    }
                } else if (wl0.A(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM = wl0.m(previewableHandwritingGesture);
                    if (me2Var != null) {
                        long jC2 = qx.C(f11Var, ux.L(deleteGestureM.getDeletionArea()), deleteGestureM.getGranularity() != 1 ? 0 : 1);
                        f11 f11Var4 = me2Var.d;
                        if (f11Var4 != null) {
                            f11Var4.e(jC2);
                        }
                        f11 f11Var5 = me2Var.d;
                        if (f11Var5 != null) {
                            f11Var5.f(of2.b);
                        }
                        if (!of2.c(jC2)) {
                            me2Var.u(false);
                            me2Var.r(sl0Var);
                        }
                    }
                } else if (wl0.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureR = wl0.r(previewableHandwritingGesture);
                    if (me2Var != null) {
                        long jD = qx.D(f11Var, ux.L(selectRangeGestureR.getSelectionStartArea()), ux.L(selectRangeGestureR.getSelectionEndArea()), selectRangeGestureR.getGranularity() != 1 ? 0 : 1);
                        f11 f11Var6 = me2Var.d;
                        if (f11Var6 != null) {
                            f11Var6.f(jD);
                        }
                        f11 f11Var7 = me2Var.d;
                        if (f11Var7 != null) {
                            f11Var7.e(of2.b);
                        }
                        if (!of2.c(jD)) {
                            me2Var.u(false);
                            me2Var.r(sl0Var);
                        }
                    }
                } else if (wl0.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureN = wl0.n(previewableHandwritingGesture);
                    if (me2Var != null) {
                        long jD2 = qx.D(f11Var, ux.L(deleteRangeGestureN.getDeletionStartArea()), ux.L(deleteRangeGestureN.getDeletionEndArea()), deleteRangeGestureN.getGranularity() != 1 ? 0 : 1);
                        f11 f11Var8 = me2Var.d;
                        if (f11Var8 != null) {
                            f11Var8.e(jD2);
                        }
                        f11 f11Var9 = me2Var.d;
                        if (f11Var9 != null) {
                            f11Var9.f(of2.b);
                        }
                        if (!of2.c(jD2)) {
                            me2Var.u(false);
                            me2Var.r(sl0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new ru(i, me2Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        b11 b11Var;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            b11Var = ((g11) this.a.f).m;
            synchronized (b11Var.c) {
                try {
                    b11Var.f = z2;
                    b11Var.g = z3;
                    b11Var.h = z5;
                    b11Var.i = z;
                    if (z6) {
                        b11Var.e = true;
                        if (b11Var.j != null) {
                            b11Var.a();
                        }
                    }
                    b11Var.d = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        b11Var = ((g11) this.a.f).m;
        synchronized (b11Var.c) {
            b11Var.f = z2;
            b11Var.g = z3;
            b11Var.h = z5;
            b11Var.i = z;
            if (z6) {
                b11Var.e = true;
                if (b11Var.j != null) {
                    b11Var.a();
                }
            }
            b11Var.d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((g11) this.a.f).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new a32(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new b32(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new c32(i, i2));
        return true;
    }
}

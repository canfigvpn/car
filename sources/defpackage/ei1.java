package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.ExtractedText;
import android.widget.EdgeEffect;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ei1 {
    public static final float a = 32.0f;
    public static final /* synthetic */ int b = 0;
    public static jo0 c;
    public static final /* synthetic */ int d = 0;

    public ei1(vv vvVar) {
        new Rect();
    }

    public static final boolean A(long j) {
        return (j & 1) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0165, code lost:
    
        if (r3 == r13) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.bb2 r17, defpackage.a52 r18, defpackage.h7 r19, defpackage.pn1 r20, defpackage.sh r21) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei1.B(bb2, a52, h7, pn1, sh):java.lang.Object");
    }

    public static final void C(ic1 ic1Var, qh2 qh2Var) {
        Object obj = qh2Var.e;
        eb1 eb1Var = new eb1(ic1Var, 3);
        ic1Var.getClass();
        obj.getClass();
        rb1 rb1Var = ic1Var.b;
        rb1Var.getClass();
        rb1Var.l(obj, mx.G(eb1Var));
    }

    public static final t71 D(b40 b40Var, int i) {
        t71 t71Var = ((t71) b40Var).e.j;
        if (t71Var == null || (t71Var.h & i) == 0) {
            return null;
        }
        while (t71Var != null) {
            int i2 = t71Var.g;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return t71Var;
            }
            t71Var = t71Var.j;
        }
        return null;
    }

    public static float E(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e90.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0299  */
    /* JADX WARN: Code duplicated, block: B:167:0x0374  */
    /* JADX WARN: Code duplicated, block: B:174:0x0388  */
    /* JADX WARN: Code duplicated, block: B:179:0x0392  */
    /* JADX WARN: Code duplicated, block: B:184:0x039b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bb A[LOOP:5: B:192:0x03b9->B:193:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:207:0x0410  */
    /* JADX WARN: Code duplicated, block: B:209:0x0414  */
    /* JADX WARN: Code duplicated, block: B:212:0x0195 A[EDGE_INSN: B:212:0x0195->B:68:0x0195 BREAK  A[LOOP:0: B:7:0x003c->B:66:0x0173], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0171 A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0171: PHI (r6v14 b6) = (r6v13 b6), (r6v15 b6) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r21v7 ch2) = (r21v6 ch2), (r21v8 ch2) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r22v5 yb) = (r22v4 yb), (r22v6 yb) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r23v5 y6) = (r23v4 y6), (r23v6 y6) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r24v6 hx) = (r24v5 hx), (r24v7 hx) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r26v8 wu1) = (r26v7 wu1), (r26v9 wu1) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0173 A[LOOP:0: B:7:0x003c->B:66:0x0173, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:193:0x03bb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(ViewStructure viewStructure, ax0 ax0Var, AutofillId autofillId, String str, as1 as1Var) {
        long j;
        long j2;
        char c2;
        long j3;
        boolean zBooleanValue;
        ch2 ch2Var;
        yb ybVar;
        y6 y6Var;
        wu1 wu1Var;
        b6 b6Var;
        boolean z;
        hx hxVar;
        Boolean bool;
        boolean z2;
        Integer num;
        int i;
        List list;
        Integer numValueOf;
        boolean z3;
        String[] strArrA;
        boolean z4;
        boolean z5;
        boolean z6;
        String strB;
        int size;
        String str2;
        int i2;
        String[] strArrA2;
        String[] strArrA3;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        ch2 ch2Var2;
        yb ybVar2;
        y6 y6Var2;
        wu1 wu1Var2;
        y02 y02Var = u02.a;
        y02 y02Var2 = h02.a;
        i02 i02VarW = ax0Var.w();
        int i4 = 8;
        if (i02VarW != null) {
            w91 w91Var = i02VarW.e;
            Object[] objArr3 = w91Var.b;
            j = 128;
            Object[] objArr4 = w91Var.c;
            long[] jArr3 = w91Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                b6Var = null;
                j2 = 255;
                z = false;
                ch2Var2 = null;
                ybVar2 = null;
                y6Var2 = null;
                hxVar = null;
                bool = null;
                wu1Var2 = null;
                z2 = false;
                num = null;
                c2 = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i5 != length) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                y02 y02Var3 = (y02) obj;
                                if (ws0.j(y02Var3, u02.s)) {
                                    obj2.getClass();
                                    b6Var = (b6) obj2;
                                } else if (ws0.j(y02Var3, u02.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) vq.R((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (ws0.j(y02Var3, u02.r)) {
                                    obj2.getClass();
                                    hxVar = (hx) obj2;
                                } else if (ws0.j(y02Var3, u02.t)) {
                                    obj2.getClass();
                                    y6Var2 = (y6) obj2;
                                } else if (ws0.j(y02Var3, u02.G)) {
                                    obj2.getClass();
                                    ybVar2 = (yb) obj2;
                                } else if (ws0.j(y02Var3, u02.l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (ws0.j(y02Var3, u02.P)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (ws0.j(y02Var3, u02.L)) {
                                    z2 = true;
                                } else if (ws0.j(y02Var3, u02.o)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (ws0.j(y02Var3, u02.z)) {
                                    obj2.getClass();
                                    wu1Var2 = (wu1) obj2;
                                } else if (ws0.j(y02Var3, u02.J)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (ws0.j(y02Var3, u02.K)) {
                                    obj2.getClass();
                                    ch2Var2 = (ch2) obj2;
                                } else if (ws0.j(y02Var3, h02.b)) {
                                    viewStructure.setClickable(true);
                                } else if (ws0.j(y02Var3, h02.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (ws0.j(y02Var3, h02.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (ws0.j(y02Var3, h02.k)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 != length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            } else {
                j2 = 255;
                c2 = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                b6Var = null;
                z = false;
                ch2Var2 = null;
                ybVar2 = null;
                y6Var2 = null;
                hxVar = null;
                bool = null;
                wu1Var2 = null;
                z2 = false;
                num = null;
            }
            ch2Var = ch2Var2;
            ybVar = ybVar2;
            y6Var = y6Var2;
            wu1Var = wu1Var2;
        } else {
            j = 128;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            ch2Var = null;
            ybVar = null;
            y6Var = null;
            wu1Var = null;
            b6Var = null;
            z = false;
            hxVar = null;
            bool = null;
            z2 = false;
            num = null;
        }
        i02 i02VarW2 = ax0Var.w();
        if (i02VarW2 != null && i02VarW2.g && !i02VarW2.h) {
            i02VarW2 = i02VarW2.b();
            p91 p91Var = new p91(((fa1) ((n91) ax0Var.n()).f).g);
            p91Var.c(ax0Var.n());
            while (p91Var.i()) {
                ax0 ax0Var2 = (ax0) p91Var.k(p91Var.b - 1);
                i02 i02VarW3 = ax0Var2.w();
                if (i02VarW3 != null && !i02VarW3.g) {
                    i02VarW2.d(i02VarW3);
                    if (!i02VarW3.h) {
                        p91Var.c(ax0Var2.n());
                    }
                }
            }
        }
        if (i02VarW2 != null) {
            w91 w91Var2 = i02VarW2.e;
            Object[] objArr5 = w91Var2.b;
            Object[] objArr6 = w91Var2.c;
            long[] jArr4 = w91Var2.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                i = 1;
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c2) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                y02 y02Var4 = (y02) obj3;
                                objArr2 = objArr5;
                                if (ws0.j(y02Var4, u02.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (ws0.j(y02Var4, u02.C)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            } else {
                i = 1;
                list = null;
            }
        } else {
            i = 1;
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(ax0Var.f);
        if (ax0Var.u() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (b6Var != null) {
            numValueOf = Integer.valueOf(b6Var.a);
        } else if (z) {
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = ch2Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (ybVar != null) {
            String strP = ybVar.f;
            if (strP.length() >= 5000) {
                strP = (Character.isHighSurrogate(strP.charAt(4999)) && Character.isLowSurrogate(strP.charAt(5000))) ? h92.P(strP, 4999) : h92.P(strP, 5000);
            }
            viewStructure.setAutofillValue(AutofillValue.forText(strP));
        }
        if (y6Var != null) {
            viewStructure.setAutofillValue(y6Var.a);
        }
        if (hxVar != null && (strArrA3 = ix.A(hxVar)) != null) {
            viewStructure.setAutofillHints(strArrA3);
        }
        as1Var.b.j(ax0Var.f, new so1(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (ch2Var == null) {
            if (bool != null && (wu1Var == null || wu1Var.a != 4)) {
                z3 = true;
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            hx.a.getClass();
            strArrA = ix.A(gx.b);
            strArrA.getClass();
            if (strArrA.length != 0) {
                fu1.k("Array is empty.");
                return;
            }
            String str3 = strArrA[0];
            if (hxVar != null || (strArrA2 = ix.A(hxVar)) == null || ve.G0(strArrA2, str3) < 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (!z2 || z4) {
                z5 = z3;
            } else {
                z5 = false;
            }
            if (!z5 || zBooleanValue) {
                z6 = z3;
            } else {
                z6 = false;
            }
            viewStructure.setDataIsSensitive(z6);
            viewStructure.setVisibility(ax0Var.I.d.a1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i2 = 0; i2 < size; i2++) {
                    str2 = str2 + ((yb) list.get(i2)).f + '\n';
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((n91) ax0Var.n()).isEmpty() && wu1Var != null && (strB = c12.B(wu1Var.a)) != null) {
                viewStructure.setClassName(strB);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z5) {
                    viewStructure.setInputType(129);
                }
            }
        }
        viewStructure.setCheckable(i);
        viewStructure.setChecked(ch2Var == ch2.e);
        z3 = true;
        hx.a.getClass();
        strArrA = ix.A(gx.b);
        strArrA.getClass();
        if (strArrA.length != 0) {
            fu1.k("Array is empty.");
            return;
        }
        String str4 = strArrA[0];
        if (hxVar != null) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z2) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        if (z5) {
            z6 = z3;
        } else {
            z6 = z3;
        }
        viewStructure.setDataIsSensitive(z6);
        viewStructure.setVisibility(ax0Var.I.d.a1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i2 < size) {
                str2 = str2 + ((yb) list.get(i2)).f + '\n';
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((n91) ax0Var.n()).isEmpty()) {
            viewStructure.setClassName(strB);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z5) {
                viewStructure.setInputType(129);
            }
        }
    }

    public static k71 G(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    k71 k71Var = new k71();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    k71Var.h = byteBufferDuplicate;
                    k71Var.e = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    k71Var.f = i6;
                    k71Var.g = ((ByteBuffer) k71Var.h).getShort(i6);
                    return k71Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final long H(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final wm I(cn cnVar) {
        Object ut1Var;
        cnVar.getClass();
        long j = cnVar.a;
        String str = cnVar.b;
        String str2 = cnVar.c;
        String str3 = cnVar.d;
        Integer num = cnVar.e;
        j11 j11Var = new j11(cnVar.f, cnVar.g, cnVar.h, cnVar.i);
        try {
            ut1Var = ni0.valueOf(cnVar.j);
        } catch (Throwable th) {
            ut1Var = new ut1(th);
        }
        if (ut1Var instanceof ut1) {
            ut1Var = ni0.e;
        }
        return new wm(j, str, str2, str3, num, j11Var, (ni0) ut1Var, cnVar.k, cnVar.l, cnVar.m, cnVar.n);
    }

    public static final g22 J(j22 j22Var) {
        Object ut1Var;
        j22Var.getClass();
        long j = j22Var.a;
        long j2 = j22Var.b;
        long j3 = j22Var.c;
        int i = j22Var.d;
        Integer num = j22Var.e;
        Long l = j22Var.f;
        Double d2 = j22Var.g;
        String str = j22Var.h;
        try {
            ut1Var = d22.valueOf(j22Var.i);
        } catch (Throwable th) {
            ut1Var = new ut1(th);
        }
        if (ut1Var instanceof ut1) {
            ut1Var = d22.e;
        }
        return new g22(j, j2, j3, i, num, l, d2, str, (d22) ut1Var);
    }

    public static final cn K(wm wmVar) {
        long j = wmVar.a;
        String str = wmVar.b;
        String str2 = wmVar.c;
        String str3 = wmVar.d;
        Integer num = wmVar.e;
        j11 j11Var = wmVar.f;
        return new cn(j, str, str2, str3, num, j11Var.a, j11Var.b, j11Var.c, j11Var.d, wmVar.g.name(), wmVar.h, wmVar.i, wmVar.j, wmVar.k);
    }

    public static final j22 L(g22 g22Var) {
        g22Var.getClass();
        return new j22(g22Var.a, g22Var.b, g22Var.c, g22Var.d, g22Var.e, g22Var.f, g22Var.g, g22Var.h, g22Var.i.name());
    }

    public static final ExtractedText M(te2 te2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = te2Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = te2Var.b;
        extractedText.selectionStart = of2.f(j);
        extractedText.selectionEnd = of2.e(j);
        extractedText.flags = !h92.D(te2Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object N(defpackage.bb2 r12, defpackage.id2 r13, defpackage.pn1 r14, defpackage.sh r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei1.N(bb2, id2, pn1, sh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object O(defpackage.bb2 r11, defpackage.id2 r12, defpackage.pn1 r13, int r14, defpackage.sh r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei1.O(bb2, id2, pn1, int, sh):java.lang.Object");
    }

    public static final int P(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void a(u71 u71Var, ic1 ic1Var, ao aoVar, ak0 ak0Var, int i) {
        u71 u71Var2;
        ic1 ic1Var2;
        ao aoVar2;
        final ic1 ic1Var3;
        u71 u71Var3;
        ao aoVar3;
        Object next;
        ak0Var.X(1427179323);
        int i2 = i | 150;
        byte b2 = 0;
        int i3 = 1;
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            ak0Var.T();
            int i4 = i & 1;
            is1 is1Var = cv.a;
            if (i4 == 0 || ak0Var.y()) {
                Context context = (Context) ak0Var.j(u5.b);
                Object[] objArrCopyOf = Arrays.copyOf(new qd1[0], 0);
                ru1 ru1Var = new ru1(4, new vy(7), new m(22, context));
                boolean zH = ak0Var.h(context);
                Object objL = ak0Var.L();
                if (zH || objL == is1Var) {
                    objL = new w8(18, context);
                    ak0Var.g0(objL);
                }
                ic1 ic1Var4 = (ic1) ex.J(objArrCopyOf, ru1Var, (ti0) objL, ak0Var, 0, 4);
                co2 co2VarA = o31.a(ak0Var);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                ao aoVar4 = (ao) p12.r(js1.a(ao.class), co2VarA, sv.y(co2VarA, ak0Var), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
                ic1Var3 = ic1Var4;
                u71Var3 = r71.a;
                aoVar3 = aoVar4;
            } else {
                ak0Var.R();
                u71Var3 = u71Var;
                ic1Var3 = ic1Var;
                aoVar3 = aoVar;
            }
            ak0Var.q();
            kb1 kb1Var = (kb1) v12.f(new hr1(ic1Var3.b.z), null, ak0Var, 48, 2).getValue();
            zb1 zb1Var = kb1Var != null ? kb1Var.f : null;
            yb0 yb0Var = qh2.m;
            yb0Var.getClass();
            v vVar = new v(b2 == true ? 1 : 0, yb0Var);
            loop0: while (true) {
                if (!vVar.hasNext()) {
                    next = null;
                    break;
                }
                next = vVar.next();
                qh2 qh2Var = (qh2) next;
                if (zb1Var != null) {
                    int i5 = zb1.i;
                    for (zb1 zb1Var2 : vv.o(zb1Var)) {
                        int i6 = zb1.i;
                        aq aqVar = qh2Var.f;
                        zb1Var2.getClass();
                        aqVar.getClass();
                        if (sv.C(c22.m(aqVar)) == zb1Var2.f.a) {
                            break loop0;
                        }
                    }
                }
            }
            final qh2 qh2Var2 = (qh2) next;
            final boolean z = !((yn) qx.r(aoVar3.c, ak0Var).getValue()).a.isEmpty();
            final boolean z2 = qh2Var2 != null;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = ak0Var.g(z) | ak0Var.d(qh2Var2 == null ? -1 : qh2Var2.ordinal()) | ak0Var.h(ic1Var3);
            Object objL2 = ak0Var.L();
            if (zG || objL2 == is1Var) {
                objL2 = new fb1(z, qh2Var2, ic1Var3, null);
                ak0Var.g0(objL2);
            }
            s5.p(boolValueOf, qh2Var2, (ij0) objL2, ak0Var);
            ic1 ic1Var5 = ic1Var3;
            ix.f(u71Var3, null, vs0.C(-733466090, new ij0() { // from class: za1
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ak0 ak0Var2 = (ak0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i7 = 1;
                    if (ak0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        if (z2) {
                            ak0Var2.W(2105380208);
                            fd1.a(null, 0L, 0L, null, vs0.C(624163604, new uc0(i7, qh2Var2, ic1Var3, z), ak0Var2), ak0Var2, 196608);
                        } else {
                            ak0Var2.W(2101265516);
                        }
                        ak0Var2.p(false);
                    } else {
                        ak0Var2.R();
                    }
                    return ll2.a;
                }
            }, ak0Var), null, null, 0, 0L, 0L, null, vs0.C(-1014274932, new g9(ic1Var3, z2, i3), ak0Var), ak0Var, 805306758, 506);
            u71Var2 = u71Var3;
            aoVar2 = aoVar3;
            ic1Var2 = ic1Var5;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            ic1Var2 = ic1Var;
            aoVar2 = aoVar;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(u71Var2, ic1Var2, aoVar2, i, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:232:0x0482  */
    /* JADX WARN: Code duplicated, block: B:234:0x0486  */
    /* JADX WARN: Code duplicated, block: B:236:0x0491  */
    /* JADX WARN: Code duplicated, block: B:237:0x0494  */
    /* JADX WARN: Code duplicated, block: B:238:0x0496  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:253:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:254:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:256:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:283:0x05a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:285:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:288:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:290:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:291:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:294:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:296:0x05d3 A[LOOP:11: B:292:0x05c3->B:296:0x05d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x060b  */
    /* JADX WARN: Code duplicated, block: B:302:0x0611  */
    /* JADX WARN: Code duplicated, block: B:304:0x0617  */
    /* JADX WARN: Code duplicated, block: B:305:0x061a  */
    /* JADX WARN: Code duplicated, block: B:307:0x0625  */
    /* JADX WARN: Code duplicated, block: B:309:0x062c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0632 A[LOOP:13: B:312:0x0632->B:314:0x0641, LOOP_START, PHI: r12
  0x0632: PHI (r12v11 zb1) = (r12v10 zb1), (r12v13 zb1) binds: [B:310:0x062e, B:314:0x0641] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:314:0x0641 A[LOOP:13: B:312:0x0632->B:314:0x0641, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:316:0x064d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0699  */
    /* JADX WARN: Code duplicated, block: B:353:0x077d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0782  */
    /* JADX WARN: Code duplicated, block: B:356:0x0785  */
    /* JADX WARN: Code duplicated, block: B:358:0x078b  */
    /* JADX WARN: Code duplicated, block: B:360:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:362:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:365:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:368:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:369:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:375:0x0809  */
    /* JADX WARN: Code duplicated, block: B:381:0x083b  */
    /* JADX WARN: Code duplicated, block: B:384:0x0860  */
    /* JADX WARN: Code duplicated, block: B:387:0x0883  */
    /* JADX WARN: Code duplicated, block: B:390:0x0894  */
    /* JADX WARN: Code duplicated, block: B:400:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:401:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:407:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:418:0x0914  */
    /* JADX WARN: Code duplicated, block: B:419:0x0917  */
    /* JADX WARN: Code duplicated, block: B:425:0x0924  */
    /* JADX WARN: Code duplicated, block: B:428:0x093c  */
    /* JADX WARN: Code duplicated, block: B:429:0x093f  */
    /* JADX WARN: Code duplicated, block: B:433:0x0948  */
    /* JADX WARN: Code duplicated, block: B:437:0x0962  */
    /* JADX WARN: Code duplicated, block: B:440:0x0976  */
    /* JADX WARN: Code duplicated, block: B:443:0x0994  */
    /* JADX WARN: Code duplicated, block: B:448:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:450:0x09de  */
    /* JADX WARN: Code duplicated, block: B:455:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:462:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:465:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:469:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:473:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:476:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:477:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:479:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:481:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:518:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0671 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x066e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x064b A[EDGE_INSN: B:538:0x064b->B:315:0x064b BREAK  A[LOOP:13: B:312:0x0632->B:314:0x0641], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:253:0x04d9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ic1 ic1Var, cc1 cc1Var, u71 u71Var, t3 t3Var, final ej0 ej0Var, final ej0 ej0Var2, final ej0 ej0Var3, final ej0 ej0Var4, ak0 ak0Var, int i) {
        rd1 rd1Var;
        y11 y11Var;
        hu huVar;
        rd1 rd1Var2;
        qd1 qd1VarB;
        hu huVar2;
        da1 da1VarF;
        Object objL;
        is1 is1Var;
        Object obj;
        zj1 zj1Var;
        Object objL2;
        Object obj2;
        final da1 da1Var;
        boolean z;
        boolean zF;
        Object objL3;
        da1 da1Var2;
        y11 y11Var2;
        boolean zH;
        int i2;
        Object obj3;
        fw1 fw1VarD;
        int i3;
        da1 da1VarF2;
        Object objL4;
        Object obj4;
        p82 p82Var;
        kb1 kb1Var;
        Object objL5;
        Object obj5;
        k91 k91Var;
        hu huVar3;
        ak0 ak0Var2;
        qd1 qd1VarB2;
        h50 h50Var;
        lr1 lr1VarR;
        h50 h50Var2;
        int i4;
        int i5;
        Object objL6;
        final hu huVar4;
        int i6;
        ej0 ej0Var5;
        int i7;
        int i8;
        Object objL7;
        ej0 ej0Var6;
        int i9;
        Object obj6;
        ej0 ej0Var7;
        boolean zH2;
        Object obj7;
        Object objL8;
        Object obj8;
        fz1 fz1Var;
        ki2 ki2VarD;
        boolean zH3;
        Object objL9;
        ki2 ki2Var;
        fz1 fz1Var2;
        boolean zH4;
        Object objL10;
        p82 p82Var2;
        k91 k91Var2;
        hu huVar5;
        Object objL11;
        Object obj9;
        p82 p82Var3;
        ki2 ki2Var2;
        boolean zF2;
        Object objL12;
        boolean zF3;
        Object objL13;
        lr1 lr1VarR2;
        int[] intArray;
        int[] iArr;
        ArrayList arrayList;
        cc1 cc1Var2;
        int length;
        int i10;
        String strN;
        int length2;
        Bundle[] bundleArr;
        int i11;
        int i12;
        boolean z2;
        int i13;
        cc1 cc1Var3;
        int length3;
        int i14;
        Bundle bundle;
        zb1 zb1VarM;
        cc1 cc1Var4;
        fc1 fc1Var;
        int i15;
        int i16;
        int i17;
        Bundle bundle2;
        zb1 zb1VarC;
        Bundle bundle3;
        int i18;
        zb1 zb1VarM2;
        cc1 cc1Var5;
        cc1 cc1Var6;
        boolean z3;
        ak0Var.X(-1964664536);
        int i19 = (i & 6) == 0 ? (ak0Var.h(ic1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i19 |= ak0Var.h(cc1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i19 |= ak0Var.f(u71Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i19 |= ak0Var.f(t3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i19 |= ak0Var.h(ej0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i19 |= ak0Var.h(ej0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i19 |= ak0Var.h(ej0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i19 |= ak0Var.h(ej0Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i19 |= ak0Var.h(null) ? 67108864 : 33554432;
        }
        int i20 = i19;
        if ((38347923 & i20) == 38347922 && ak0Var.A()) {
            ak0Var.R();
            ak0Var2 = ak0Var;
        } else {
            ak0Var.T();
            if ((i & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            y11 y11Var3 = (y11) ak0Var.j(j31.a);
            co2 co2VarA = o31.a(ak0Var);
            if (co2VarA == null) {
                fu1.h("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            bo2 bo2VarG = co2VarA.g();
            ic1Var.getClass();
            rb1 rb1Var = ic1Var.b;
            rb1Var.getClass();
            rd1 rd1Var3 = rb1Var.s;
            if (!ws0.j(rb1Var.o, sv.J(bo2VarG))) {
                if (!rb1Var.f.isEmpty()) {
                    fu1.h("ViewModelStore should be set before setGraph call");
                    return;
                }
                rb1Var.o = sv.J(bo2VarG);
            }
            cc1Var.getClass();
            rb1Var.getClass();
            LinkedHashMap linkedHashMap = rb1Var.t;
            fc1 fc1Var2 = cc1Var.j;
            le<kb1> leVar = rb1Var.f;
            if (!leVar.isEmpty() && rb1Var.h() == r11.e) {
                fu1.h("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z4 = false;
            if (ws0.j(rb1Var.c, cc1Var)) {
                rd1Var = rd1Var3;
                i20 = i20;
                y11Var = y11Var3;
                huVar = null;
                int iD = ((v72) fc1Var2.f).d();
                for (int i21 = 0; i21 < iD; i21++) {
                    zb1 zb1Var = (zb1) ((v72) fc1Var2.f).e(i21);
                    cc1 cc1Var7 = rb1Var.c;
                    cc1Var7.getClass();
                    int iB = ((v72) cc1Var7.j.f).b(i21);
                    cc1 cc1Var8 = rb1Var.c;
                    cc1Var8.getClass();
                    v72 v72Var = (v72) cc1Var8.j.f;
                    if (v72Var.e) {
                        s5.G(v72Var);
                    }
                    int iM = sv0.M(v72Var.h, iB, v72Var.f);
                    if (iM >= 0) {
                        Object[] objArr = v72Var.g;
                        Object obj10 = objArr[iM];
                        objArr[iM] = zb1Var;
                    }
                }
                for (kb1 kb1Var2 : leVar) {
                    int i22 = zb1.i;
                    du1 du1Var = new du1(o12.u(vv.o(kb1Var2.f)));
                    zb1 zb1VarM3 = rb1Var.c;
                    zb1VarM3.getClass();
                    Iterator it = du1Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((cu1) it).f;
                        if (listIterator.hasPrevious()) {
                            zb1 zb1Var2 = (zb1) listIterator.previous();
                            if (!ws0.j(zb1Var2, rb1Var.c) || !zb1VarM3.equals(cc1Var)) {
                                if (zb1VarM3 instanceof cc1) {
                                    zb1VarM3 = ((cc1) zb1VarM3).j.m(zb1Var2.f.a);
                                    zb1VarM3.getClass();
                                }
                            }
                        }
                    }
                    kb1Var2.f = zb1VarM3;
                }
            } else {
                cc1 cc1Var9 = rb1Var.c;
                if (cc1Var9 != null) {
                    ArrayList arrayList2 = new ArrayList(rb1Var.l.keySet());
                    int size = arrayList2.size();
                    int i23 = 0;
                    while (i23 < size) {
                        Object obj11 = arrayList2.get(i23);
                        int i24 = i23 + 1;
                        Integer num = (Integer) obj11;
                        num.getClass();
                        ArrayList arrayList3 = arrayList2;
                        int iIntValue = num.intValue();
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((pb1) it2.next()).d = true;
                            i24 = i24;
                        }
                        int i25 = i24;
                        boolean zQ = rb1Var.q(iIntValue, null, new sc1(z4, true, -1, z4, z4, -1, -1));
                        for (Iterator it3 = linkedHashMap.values().iterator(); it3.hasNext(); it3 = it3) {
                            ((pb1) it3.next()).d = false;
                            zQ = zQ;
                        }
                        if (zQ) {
                            rb1Var.m(iIntValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        i23 = i25;
                        z4 = false;
                    }
                    rb1Var.m(cc1Var9.f.a, true, false);
                }
                rb1Var.c = cc1Var;
                rd1 rd1Var4 = rb1Var.s;
                ic1 ic1Var2 = rb1Var.a;
                b7 b7Var = ic1Var2.c;
                Bundle bundle4 = rb1Var.d;
                if (bundle4 != null && bundle4.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        rw.C("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        String str = stringArrayList.get(i26);
                        i26++;
                        ArrayList<String> arrayList4 = stringArrayList;
                        String str2 = str;
                        rd1Var4.b(str2);
                        if (bundle4.containsKey(str2)) {
                            vv.u(str2, bundle4);
                        }
                        stringArrayList = arrayList4;
                    }
                }
                Bundle[] bundleArr2 = rb1Var.e;
                if (bundleArr2 != null) {
                    int length4 = bundleArr2.length;
                    int i27 = 0;
                    while (i27 < length4) {
                        Bundle[] bundleArr3 = bundleArr2;
                        Bundle bundle5 = bundleArr3[i27];
                        bundle5.getClass();
                        int i28 = length4;
                        bundle5.setClassLoader(ob1.class.getClassLoader());
                        String strX = vv.x("nav-entry-state:id", bundle5);
                        int iP = vv.p("nav-entry-state:destination-id", bundle5);
                        int i29 = i27;
                        Bundle bundle6 = bundle5.getBundle("nav-entry-state:args");
                        if (bundle6 == null) {
                            rw.C("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle7 = bundle5.getBundle("nav-entry-state:saved-state");
                        if (bundle7 == null) {
                            rw.C("nav-entry-state:saved-state");
                            throw null;
                        }
                        zb1 zb1VarC2 = rb1Var.c(iP, null);
                        if (zb1VarC2 == null) {
                            int i30 = zb1.i;
                            throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + vv.n(b7Var, iP) + " cannot be found from the current destination " + rb1Var.f());
                        }
                        r11 r11VarH = rb1Var.h();
                        sb1 sb1Var = rb1Var.o;
                        b7Var.getClass();
                        r11VarH.getClass();
                        Context context = b7Var.a;
                        bundle6.setClassLoader(context != null ? context.getClassLoader() : null);
                        kb1 kb1Var3 = new kb1(b7Var, zb1VarC2, bundle6, r11VarH, sb1Var, strX, bundle7);
                        qd1 qd1VarB3 = rd1Var4.b(zb1VarC2.e);
                        Object obj12 = linkedHashMap.get(qd1VarB3);
                        Object obj13 = obj12;
                        if (obj12 == null) {
                            pb1 pb1Var = new pb1(ic1Var2, qd1VarB3);
                            linkedHashMap.put(qd1VarB3, pb1Var);
                            obj13 = pb1Var;
                        }
                        leVar.addLast(kb1Var3);
                        ((pb1) obj13).a(kb1Var3);
                        cc1 cc1Var10 = kb1Var3.f.g;
                        if (cc1Var10 != null) {
                            rb1Var.j(kb1Var3, rb1Var.e(cc1Var10.f.a));
                        }
                        i27 = i29 + 1;
                        bundleArr2 = bundleArr3;
                        length4 = i28;
                    }
                    rb1Var.b.a();
                    rb1Var.e = null;
                }
                Collection collectionValues = h61.h0(rd1Var4.a).values();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj14 : collectionValues) {
                    if (!((qd1) obj14).b) {
                        arrayList5.add(obj14);
                    }
                }
                int size3 = arrayList5.size();
                int i31 = 0;
                while (i31 < size3) {
                    Object obj15 = arrayList5.get(i31);
                    i31++;
                    qd1 qd1Var = (qd1) obj15;
                    Object pb1Var2 = linkedHashMap.get(qd1Var);
                    if (pb1Var2 == null) {
                        qd1Var.getClass();
                        pb1Var2 = new pb1(ic1Var2, qd1Var);
                        linkedHashMap.put(qd1Var, pb1Var2);
                    }
                    qd1Var.getClass();
                    qd1Var.a = (pb1) pb1Var2;
                    qd1Var.b = true;
                }
                if (rb1Var.c == null || !leVar.isEmpty()) {
                    rd1Var = rd1Var3;
                    i20 = i20;
                    y11Var = y11Var3;
                    huVar = null;
                    rb1Var.b();
                } else {
                    Activity activity = ic1Var2.d;
                    if (ic1Var2.e || activity == null) {
                        rd1Var = rd1Var3;
                        i20 = i20;
                        y11Var = y11Var3;
                        cc1 cc1Var11 = rb1Var.c;
                        cc1Var11.getClass();
                        huVar = null;
                        rb1Var.k(cc1Var11, null, null);
                    } else {
                        Intent intent = activity.getIntent();
                        rb1 rb1Var2 = ic1Var2.b;
                        if (intent == null) {
                            rd1Var = rd1Var3;
                            i20 = i20;
                            y11Var = y11Var3;
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e) {
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                            Bundle bundle8 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle8 != null) {
                                bundleW.putAll(bundle8);
                            }
                            if (intArray == null || intArray.length == 0) {
                                cc1 cc1VarI = rb1Var2.i();
                                y11Var = y11Var3;
                                rd1Var = rd1Var3;
                                yb1 yb1VarD = cc1VarI.d(new ud(intent.getData(), intent.getAction(), intent.getType(), 11), cc1VarI);
                                if (yb1VarD != null) {
                                    zb1 zb1Var3 = yb1VarD.e;
                                    le leVar2 = new le();
                                    zb1 zb1Var4 = zb1Var3;
                                    while (true) {
                                        pc pcVar = zb1Var4.f;
                                        cc1 cc1Var12 = zb1Var4.g;
                                        if (cc1Var12 == null || cc1Var12.j.b != pcVar.a) {
                                            leVar2.addFirst(zb1Var4);
                                        }
                                        if (ws0.j(cc1Var12, null) || cc1Var12 == null) {
                                            break;
                                        } else {
                                            zb1Var4 = cc1Var12;
                                        }
                                    }
                                    List listH0 = vq.h0(leVar2);
                                    ArrayList arrayList6 = new ArrayList(wq.G(listH0, 10));
                                    Iterator it4 = listH0.iterator();
                                    while (it4.hasNext()) {
                                        arrayList6.add(Integer.valueOf(((zb1) it4.next()).f.a));
                                    }
                                    int[] iArrG0 = vq.g0(arrayList6);
                                    Bundle bundleA = zb1Var3.a(yb1VarD.f);
                                    if (bundleA != null) {
                                        bundleW.putAll(bundleA);
                                    }
                                    iArr = iArrG0;
                                    arrayList = null;
                                }
                                if (iArr != null && iArr.length != 0) {
                                    rb1Var2.getClass();
                                    cc1Var2 = rb1Var2.c;
                                    length = iArr.length;
                                    i10 = 0;
                                    while (true) {
                                        if (i10 < length) {
                                            strN = null;
                                            break;
                                        }
                                        i18 = iArr[i10];
                                        if (i10 == 0) {
                                            cc1Var6 = rb1Var2.c;
                                            cc1Var6.getClass();
                                            if (cc1Var6.f.a == i18) {
                                                zb1VarM2 = rb1Var2.c;
                                            } else {
                                                zb1VarM2 = null;
                                            }
                                        } else {
                                            cc1Var2.getClass();
                                            zb1VarM2 = cc1Var2.j.m(i18);
                                        }
                                        if (zb1VarM2 == null) {
                                            int i32 = zb1.i;
                                            strN = vv.n(rb1Var2.a.c, i18);
                                            break;
                                        }
                                        if (i10 == iArr.length - 1 && (zb1VarM2 instanceof cc1)) {
                                            while (true) {
                                                cc1Var5 = (cc1) zb1VarM2;
                                                cc1Var5.getClass();
                                                fc1 fc1Var3 = cc1Var5.j;
                                                if (!(fc1Var3.m(fc1Var3.b) instanceof cc1)) {
                                                    break;
                                                } else {
                                                    zb1VarM2 = fc1Var3.m(fc1Var3.b);
                                                }
                                            }
                                            cc1Var2 = cc1Var5;
                                        }
                                        i10++;
                                    }
                                    if (strN != null) {
                                        Log.i("NavController", "Could not find destination " + strN + " in the navigation graph, ignoring the deep link from " + intent);
                                    } else {
                                        bundleW.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        length2 = iArr.length;
                                        bundleArr = new Bundle[length2];
                                        for (i11 = 0; i11 < length2; i11++) {
                                            Bundle bundleW2 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                                            bundleW2.putAll(bundleW);
                                            if (arrayList == null && (bundle3 = (Bundle) arrayList.get(i11)) != null) {
                                                bundleW2.putAll(bundle3);
                                            }
                                            bundleArr[i11] = bundleW2;
                                        }
                                        int flags = intent.getFlags();
                                        i12 = 268435456 & flags;
                                        if (i12 == 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            Context context2 = ic1Var2.a;
                                            ArrayList arrayList7 = new ArrayList();
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(context2.getPackageManager());
                                            }
                                            if (component != null) {
                                                int size4 = arrayList7.size();
                                                try {
                                                    for (Intent intentL = sv.L(context2, component); intentL != null; intentL = sv.L(context2, intentL.getComponent())) {
                                                        arrayList7.add(size4, intentL);
                                                    }
                                                } catch (PackageManager.NameNotFoundException e2) {
                                                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                    throw new IllegalArgumentException(e2);
                                                }
                                            }
                                            arrayList7.add(intent);
                                            if (arrayList7.isEmpty()) {
                                                fu1.h("No intents added to TaskStackBuilder; cannot startActivities");
                                                return;
                                            }
                                            Intent[] intentArr = (Intent[]) arrayList7.toArray(new Intent[0]);
                                            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                            context2.startActivities(intentArr, null);
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else {
                                            if (i12 != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                if (rb1Var2.f.isEmpty()) {
                                                    i15 = 0;
                                                } else {
                                                    cc1 cc1Var13 = rb1Var2.c;
                                                    cc1Var13.getClass();
                                                    i15 = 0;
                                                    rb1Var2.m(cc1Var13.f.a, true, false);
                                                }
                                                while (i15 < iArr.length) {
                                                    i16 = iArr[i15];
                                                    i17 = i15 + 1;
                                                    bundle2 = bundleArr[i15];
                                                    zb1VarC = rb1Var2.c(i16, null);
                                                    if (zb1VarC == null) {
                                                        int i33 = zb1.i;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + vv.n(b7Var, i16) + " cannot be found from the current destination " + rb1Var2.f());
                                                    }
                                                    rb1Var2.k(zb1VarC, bundle2, mx.G(new d(29, zb1VarC, ic1Var2)));
                                                    i15 = i17;
                                                }
                                                ic1Var2.e = true;
                                            } else {
                                                cc1Var3 = rb1Var2.c;
                                                length3 = iArr.length;
                                                for (i13 = 0; i13 < length3; i13++) {
                                                    i14 = iArr[i13];
                                                    bundle = bundleArr[i13];
                                                    if (i13 == 0) {
                                                        zb1VarM = rb1Var2.c;
                                                    } else {
                                                        cc1Var3.getClass();
                                                        zb1VarM = cc1Var3.j.m(i14);
                                                    }
                                                    if (zb1VarM == null) {
                                                        int i34 = zb1.i;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + vv.n(b7Var, i14) + " cannot be found in graph " + cc1Var3);
                                                    }
                                                    if (i13 == iArr.length - 1) {
                                                        cc1 cc1Var14 = rb1Var2.c;
                                                        cc1Var14.getClass();
                                                        rb1Var2.k(zb1VarM, bundle, new sc1(false, false, cc1Var14.f.a, true, false, 0, 0));
                                                    } else if (zb1VarM instanceof cc1) {
                                                        while (true) {
                                                            cc1Var4 = (cc1) zb1VarM;
                                                            cc1Var4.getClass();
                                                            fc1Var = cc1Var4.j;
                                                            if (!(fc1Var.m(fc1Var.b) instanceof cc1)) {
                                                                break;
                                                            } else {
                                                                zb1VarM = fc1Var.m(fc1Var.b);
                                                            }
                                                        }
                                                        cc1Var3 = cc1Var4;
                                                    }
                                                }
                                                ic1Var2.e = true;
                                            }
                                        }
                                        huVar = null;
                                    }
                                }
                            } else {
                                rd1Var = rd1Var3;
                                y11Var = y11Var3;
                            }
                            arrayList = parcelableArrayList;
                            iArr = intArray;
                            if (iArr != null) {
                                rb1Var2.getClass();
                                cc1Var2 = rb1Var2.c;
                                length = iArr.length;
                                i10 = 0;
                                while (true) {
                                    if (i10 < length) {
                                        strN = null;
                                        break;
                                    }
                                    i18 = iArr[i10];
                                    if (i10 == 0) {
                                        cc1Var6 = rb1Var2.c;
                                        cc1Var6.getClass();
                                        if (cc1Var6.f.a == i18) {
                                            zb1VarM2 = rb1Var2.c;
                                        } else {
                                            zb1VarM2 = null;
                                        }
                                    } else {
                                        cc1Var2.getClass();
                                        zb1VarM2 = cc1Var2.j.m(i18);
                                    }
                                    if (zb1VarM2 == null) {
                                        int i35 = zb1.i;
                                        strN = vv.n(rb1Var2.a.c, i18);
                                        break;
                                    } else {
                                        if (i10 == iArr.length - 1) {
                                        }
                                        i10++;
                                    }
                                }
                                if (strN != null) {
                                    Log.i("NavController", "Could not find destination " + strN + " in the navigation graph, ignoring the deep link from " + intent);
                                } else {
                                    bundleW.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                    length2 = iArr.length;
                                    bundleArr = new Bundle[length2];
                                    while (i11 < length2) {
                                        Bundle bundleW3 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                                        bundleW3.putAll(bundleW);
                                        if (arrayList == null) {
                                        }
                                        bundleArr[i11] = bundleW3;
                                    }
                                    int flags2 = intent.getFlags();
                                    i12 = 268435456 & flags2;
                                    if (i12 == 0) {
                                        if (i12 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            if (rb1Var2.f.isEmpty()) {
                                                cc1 cc1Var15 = rb1Var2.c;
                                                cc1Var15.getClass();
                                                i15 = 0;
                                                rb1Var2.m(cc1Var15.f.a, true, false);
                                            } else {
                                                i15 = 0;
                                            }
                                            while (i15 < iArr.length) {
                                                i16 = iArr[i15];
                                                i17 = i15 + 1;
                                                bundle2 = bundleArr[i15];
                                                zb1VarC = rb1Var2.c(i16, null);
                                                if (zb1VarC == null) {
                                                    int i36 = zb1.i;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + vv.n(b7Var, i16) + " cannot be found from the current destination " + rb1Var2.f());
                                                }
                                                rb1Var2.k(zb1VarC, bundle2, mx.G(new d(29, zb1VarC, ic1Var2)));
                                                i15 = i17;
                                            }
                                            ic1Var2.e = true;
                                        } else {
                                            cc1Var3 = rb1Var2.c;
                                            length3 = iArr.length;
                                            while (i13 < length3) {
                                                i14 = iArr[i13];
                                                bundle = bundleArr[i13];
                                                if (i13 == 0) {
                                                    zb1VarM = rb1Var2.c;
                                                } else {
                                                    cc1Var3.getClass();
                                                    zb1VarM = cc1Var3.j.m(i14);
                                                }
                                                if (zb1VarM == null) {
                                                    int i37 = zb1.i;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + vv.n(b7Var, i14) + " cannot be found in graph " + cc1Var3);
                                                }
                                                if (i13 == iArr.length - 1) {
                                                    cc1 cc1Var16 = rb1Var2.c;
                                                    cc1Var16.getClass();
                                                    rb1Var2.k(zb1VarM, bundle, new sc1(false, false, cc1Var16.f.a, true, false, 0, 0));
                                                } else if (zb1VarM instanceof cc1) {
                                                    while (true) {
                                                        cc1Var4 = (cc1) zb1VarM;
                                                        cc1Var4.getClass();
                                                        fc1Var = cc1Var4.j;
                                                        if (!(fc1Var.m(fc1Var.b) instanceof cc1)) {
                                                            break;
                                                            break;
                                                        }
                                                        zb1VarM = fc1Var.m(fc1Var.b);
                                                    }
                                                    cc1Var3 = cc1Var4;
                                                }
                                            }
                                            ic1Var2.e = true;
                                        }
                                    } else {
                                        if (i12 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            if (rb1Var2.f.isEmpty()) {
                                                cc1 cc1Var17 = rb1Var2.c;
                                                cc1Var17.getClass();
                                                i15 = 0;
                                                rb1Var2.m(cc1Var17.f.a, true, false);
                                            } else {
                                                i15 = 0;
                                            }
                                            while (i15 < iArr.length) {
                                                i16 = iArr[i15];
                                                i17 = i15 + 1;
                                                bundle2 = bundleArr[i15];
                                                zb1VarC = rb1Var2.c(i16, null);
                                                if (zb1VarC == null) {
                                                    int i38 = zb1.i;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + vv.n(b7Var, i16) + " cannot be found from the current destination " + rb1Var2.f());
                                                }
                                                rb1Var2.k(zb1VarC, bundle2, mx.G(new d(29, zb1VarC, ic1Var2)));
                                                i15 = i17;
                                            }
                                            ic1Var2.e = true;
                                        } else {
                                            cc1Var3 = rb1Var2.c;
                                            length3 = iArr.length;
                                            while (i13 < length3) {
                                                i14 = iArr[i13];
                                                bundle = bundleArr[i13];
                                                if (i13 == 0) {
                                                    zb1VarM = rb1Var2.c;
                                                } else {
                                                    cc1Var3.getClass();
                                                    zb1VarM = cc1Var3.j.m(i14);
                                                }
                                                if (zb1VarM == null) {
                                                    int i39 = zb1.i;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + vv.n(b7Var, i14) + " cannot be found in graph " + cc1Var3);
                                                }
                                                if (i13 == iArr.length - 1) {
                                                    cc1 cc1Var18 = rb1Var2.c;
                                                    cc1Var18.getClass();
                                                    rb1Var2.k(zb1VarM, bundle, new sc1(false, false, cc1Var18.f.a, true, false, 0, 0));
                                                } else if (zb1VarM instanceof cc1) {
                                                    while (true) {
                                                        cc1Var4 = (cc1) zb1VarM;
                                                        cc1Var4.getClass();
                                                        fc1Var = cc1Var4.j;
                                                        if (!(fc1Var.m(fc1Var.b) instanceof cc1)) {
                                                            break;
                                                            break;
                                                        }
                                                        zb1VarM = fc1Var.m(fc1Var.b);
                                                    }
                                                    cc1Var3 = cc1Var4;
                                                }
                                            }
                                            ic1Var2.e = true;
                                        }
                                    }
                                    huVar = null;
                                }
                            }
                        }
                        cc1 cc1Var19 = rb1Var.c;
                        cc1Var19.getClass();
                        huVar = null;
                        rb1Var.k(cc1Var19, null, null);
                    }
                    rd1Var2 = rd1Var;
                    qd1VarB = rd1Var2.b("composable");
                    if (qd1VarB instanceof hu) {
                        huVar2 = (hu) qd1VarB;
                    } else {
                        huVar2 = huVar;
                    }
                    if (huVar2 == null) {
                        lr1VarR2 = ak0Var.r();
                        if (lr1VarR2 != null) {
                            lr1VarR2.d = new mc1(ic1Var, cc1Var, u71Var, t3Var, ej0Var, ej0Var2, ej0Var3, ej0Var4, i, 2);
                            return;
                        }
                        return;
                    }
                    jr1 jr1Var = huVar2.b().e;
                    da1VarF = v12.f(jr1Var, jr1Var.e.getValue(), ak0Var, 0, 0);
                    objL = ak0Var.L();
                    is1Var = cv.a;
                    if (objL == is1Var) {
                        obj = objL;
                        zj1 zj1Var2 = new zj1(0.0f);
                        ak0Var.g0(zj1Var2);
                        obj = zj1Var2;
                    }
                    obj = objL;
                    zj1Var = (zj1) obj;
                    objL2 = ak0Var.L();
                    obj2 = objL2;
                    if (objL2 == is1Var) {
                        dk1 dk1VarS = y12.s(Boolean.FALSE);
                        ak0Var.g0(dk1VarS);
                        obj2 = dk1VarS;
                    }
                    da1Var = (da1) obj2;
                    if (((List) da1VarF.getValue()).size() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zF = ak0Var.f(da1VarF) | ak0Var.h(huVar2);
                    objL3 = ak0Var.L();
                    if (!zF || objL3 == is1Var) {
                        objL3 = new m7(huVar2, da1VarF, zj1Var, da1Var, null, 5);
                        da1Var2 = da1VarF;
                        ak0Var.g0(objL3);
                    } else {
                        da1Var2 = da1VarF;
                    }
                    ux.h(z, (ij0) objL3, ak0Var, 0);
                    y11Var2 = y11Var;
                    zH = ak0Var.h(ic1Var) | ak0Var.h(y11Var2);
                    Object objL14 = ak0Var.L();
                    if (!zH || objL14 == is1Var) {
                        i2 = 1;
                        kc1 kc1Var = new kc1(i2, ic1Var, y11Var2);
                        ak0Var.g0(kc1Var);
                        obj3 = kc1Var;
                    } else {
                        i2 = 1;
                        obj3 = objL14;
                    }
                    s5.e(y11Var2, (ej0) obj3, ak0Var);
                    fw1VarD = ux.D(ak0Var);
                    jr1 jr1Var2 = rb1Var.i;
                    i3 = 0;
                    da1VarF2 = v12.f(jr1Var2, jr1Var2.e.getValue(), ak0Var, 0, 0);
                    objL4 = ak0Var.L();
                    obj4 = objL4;
                    if (objL4 == is1Var) {
                        v40 v40VarB = e72.b(new nc1(da1VarF2, i3));
                        ak0Var.g0(v40VarB);
                        obj4 = v40VarB;
                    }
                    p82Var = (p82) obj4;
                    kb1Var = (kb1) vq.X((List) p82Var.getValue());
                    objL5 = ak0Var.L();
                    obj5 = objL5;
                    if (objL5 == is1Var) {
                        int i40 = df1.a;
                        k91 k91Var3 = new k91(6);
                        ak0Var.g0(k91Var3);
                        obj5 = k91Var3;
                    }
                    k91Var = (k91) obj5;
                    if (kb1Var != null) {
                        ak0Var.W(-1797250687);
                        int i41 = (ak0Var.h(huVar2) ? 1 : 0) | (((((i20 & 3670016) ^ 1572864) > 1048576 || !ak0Var.f(ej0Var3)) && (i20 & 1572864) != 1048576) ? 0 : i2);
                        if ((i20 & 57344) == 16384) {
                            i4 = i2;
                        } else {
                            i4 = 0;
                        }
                        i5 = i41 | i4;
                        objL6 = ak0Var.L();
                        if (i5 == 0 || objL6 == is1Var) {
                            final int i42 = 1;
                            huVar4 = huVar2;
                            i6 = 0;
                            ej0 ej0Var8 = new ej0() { // from class: jc1
                                @Override // defpackage.ej0
                                public final Object h(Object obj16) {
                                    int i43 = i42;
                                    da1 da1Var3 = da1Var;
                                    ej0 ej0Var9 = ej0Var;
                                    ej0 ej0Var10 = ej0Var3;
                                    hu huVar6 = huVar4;
                                    ab abVar = (ab) obj16;
                                    switch (i43) {
                                        case 0:
                                            zb1 zb1Var5 = ((kb1) abVar.a()).f;
                                            zb1Var5.getClass();
                                            gu guVar = (gu) zb1Var5;
                                            if (((Boolean) huVar6.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                                int i44 = zb1.i;
                                                for (zb1 zb1Var6 : vv.o(guVar)) {
                                                }
                                                return (kc0) ej0Var10.h(abVar);
                                            }
                                            int i45 = zb1.i;
                                            for (zb1 zb1Var7 : vv.o(guVar)) {
                                            }
                                            return (kc0) ej0Var9.h(abVar);
                                        default:
                                            zb1 zb1Var8 = ((kb1) abVar.c()).f;
                                            zb1Var8.getClass();
                                            gu guVar2 = (gu) zb1Var8;
                                            if (((Boolean) huVar6.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                                int i46 = zb1.i;
                                                for (zb1 zb1Var9 : vv.o(guVar2)) {
                                                }
                                                return (sb0) ej0Var10.h(abVar);
                                            }
                                            int i47 = zb1.i;
                                            for (zb1 zb1Var10 : vv.o(guVar2)) {
                                            }
                                            return (sb0) ej0Var9.h(abVar);
                                    }
                                }
                            };
                            ak0Var.g0(ej0Var8);
                            objL6 = ej0Var8;
                        } else {
                            huVar4 = huVar2;
                            i6 = 0;
                        }
                        ej0Var5 = (ej0) objL6;
                        int i43 = (ak0Var.h(huVar4) ? 1 : 0) | (((((i20 & 29360128) ^ 12582912) > 8388608 || !ak0Var.f(ej0Var4)) && (i20 & 12582912) != 8388608) ? i6 : i2);
                        if ((i20 & 458752) == 131072) {
                            i7 = i2;
                        } else {
                            i7 = i6;
                        }
                        i8 = i43 | i7;
                        objL7 = ak0Var.L();
                        if (i8 == 0 || objL7 == is1Var) {
                            final int i44 = 0;
                            ej0 ej0Var9 = new ej0() { // from class: jc1
                                @Override // defpackage.ej0
                                public final Object h(Object obj16) {
                                    int i45 = i44;
                                    da1 da1Var3 = da1Var;
                                    ej0 ej0Var10 = ej0Var2;
                                    ej0 ej0Var11 = ej0Var4;
                                    hu huVar6 = huVar4;
                                    ab abVar = (ab) obj16;
                                    switch (i45) {
                                        case 0:
                                            zb1 zb1Var5 = ((kb1) abVar.a()).f;
                                            zb1Var5.getClass();
                                            gu guVar = (gu) zb1Var5;
                                            if (((Boolean) huVar6.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                                int i46 = zb1.i;
                                                for (zb1 zb1Var6 : vv.o(guVar)) {
                                                }
                                                return (kc0) ej0Var11.h(abVar);
                                            }
                                            int i47 = zb1.i;
                                            for (zb1 zb1Var7 : vv.o(guVar)) {
                                            }
                                            return (kc0) ej0Var10.h(abVar);
                                        default:
                                            zb1 zb1Var8 = ((kb1) abVar.c()).f;
                                            zb1Var8.getClass();
                                            gu guVar2 = (gu) zb1Var8;
                                            if (((Boolean) huVar6.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                                int i48 = zb1.i;
                                                for (zb1 zb1Var9 : vv.o(guVar2)) {
                                                }
                                                return (sb0) ej0Var11.h(abVar);
                                            }
                                            int i49 = zb1.i;
                                            for (zb1 zb1Var10 : vv.o(guVar2)) {
                                            }
                                            return (sb0) ej0Var10.h(abVar);
                                    }
                                }
                            };
                            ak0Var.g0(ej0Var9);
                            objL7 = ej0Var9;
                        }
                        ej0Var6 = (ej0) objL7;
                        if ((i20 & 234881024) == 67108864) {
                            i9 = i2;
                        } else {
                            i9 = i6;
                        }
                        Object objL15 = ak0Var.L();
                        obj6 = objL15;
                        if (i9 == 0 || objL15 == is1Var) {
                            o01 o01Var = new o01(20);
                            ak0Var.g0(o01Var);
                            obj6 = o01Var;
                        }
                        ej0Var7 = (ej0) obj6;
                        Boolean bool = Boolean.TRUE;
                        zH2 = ak0Var.h(huVar4);
                        Object objL16 = ak0Var.L();
                        obj7 = objL16;
                        if (zH2 || objL16 == is1Var) {
                            kc1 kc1Var2 = new kc1(0, p82Var, huVar4);
                            ak0Var.g0(kc1Var2);
                            obj7 = kc1Var2;
                        }
                        s5.e(bool, (ej0) obj7, ak0Var);
                        objL8 = ak0Var.L();
                        obj8 = objL8;
                        if (objL8 == is1Var) {
                            fz1 fz1Var3 = new fz1(kb1Var);
                            ak0Var.g0(fz1Var3);
                            obj8 = fz1Var3;
                        }
                        fz1Var = (fz1) obj8;
                        ki2VarD = oi2.d(fz1Var, "entry", ak0Var, 56);
                        if (((Boolean) da1Var.getValue()).booleanValue()) {
                            ak0Var.W(-1795016672);
                            Float fValueOf = Float.valueOf(zj1Var.h());
                            zF3 = ak0Var.f(da1Var2) | ak0Var.h(fz1Var);
                            objL13 = ak0Var.L();
                            if (!zF3 || objL13 == is1Var) {
                                huVar3 = null;
                                objL13 = new g(fz1Var, da1Var2, zj1Var, false ? 1 : 0, 15);
                                ak0Var.g0(objL13);
                            } else {
                                huVar3 = null;
                            }
                            s5.o((ij0) objL13, ak0Var, fValueOf);
                            ak0Var.p(false);
                            ki2Var = ki2VarD;
                            fz1Var2 = fz1Var;
                        } else {
                            huVar3 = null;
                            z3 = false;
                            ak0Var.W(-1794598265);
                            zH3 = ak0Var.h(fz1Var) | ak0Var.h(kb1Var) | ak0Var.f(ki2VarD);
                            objL9 = ak0Var.L();
                            if (!zH3 || objL9 == is1Var) {
                                ki2Var = ki2VarD;
                                fz1Var2 = fz1Var;
                                objL9 = new n7((Object) fz1Var2, (Object) kb1Var, (Object) ki2Var, (sx) (z3 ? 1 : 0), 7);
                                ak0Var.g0(objL9);
                            } else {
                                ki2Var = ki2VarD;
                                fz1Var2 = fz1Var;
                            }
                            s5.o((ij0) objL9, ak0Var, kb1Var);
                            ak0Var.p(false);
                        }
                        zH4 = ak0Var.h(k91Var) | ak0Var.h(huVar4) | ak0Var.f(ej0Var5) | ak0Var.f(ej0Var6) | ak0Var.f(ej0Var7);
                        objL10 = ak0Var.L();
                        if (!zH4 || objL10 == is1Var) {
                            hu huVar6 = huVar4;
                            p82Var2 = p82Var;
                            objL10 = new g00(k91Var, huVar6, ej0Var5, ej0Var6, ej0Var7, p82Var2, da1Var);
                            k91Var2 = k91Var;
                            huVar5 = huVar6;
                            ak0Var.g0(objL10);
                        } else {
                            huVar5 = huVar4;
                            p82Var2 = p82Var;
                            k91Var2 = k91Var;
                        }
                        ej0 ej0Var10 = (ej0) objL10;
                        objL11 = ak0Var.L();
                        obj9 = objL11;
                        if (objL11 == is1Var) {
                            o01 o01Var2 = new o01(22);
                            ak0Var.g0(o01Var2);
                            obj9 = o01Var2;
                        }
                        p82Var3 = p82Var2;
                        ki2Var2 = ki2Var;
                        p61.b(ki2Var2, u71Var, ej0Var10, t3Var, (ej0) obj9, vs0.C(820763100, new pc1(fz1Var2, kb1Var, fw1VarD, da1Var, p82Var3), ak0Var), ak0Var, ((i20 >> 3) & 112) | 221184 | (i20 & 7168));
                        ak0Var2 = ak0Var;
                        Object objF = ki2Var2.a.f();
                        Object value = ki2Var2.d.getValue();
                        zF2 = ak0Var2.f(ki2Var2) | ak0Var2.h(ic1Var) | ak0Var2.h(kb1Var) | ak0Var2.h(huVar5) | ak0Var2.h(k91Var2);
                        objL12 = ak0Var2.L();
                        if (zF2 || objL12 == is1Var) {
                            qc1 qc1Var = new qc1(ki2Var2, ic1Var, kb1Var, k91Var2, p82Var3, huVar5, null);
                            ak0Var2.g0(qc1Var);
                            objL12 = qc1Var;
                        }
                        s5.p(objF, value, (ij0) objL12, ak0Var2);
                        ak0Var2.p(false);
                    } else {
                        huVar3 = huVar;
                        ak0Var2 = ak0Var;
                        ak0Var2.W(-1789446406);
                        ak0Var2.p(false);
                    }
                    qd1VarB2 = rd1Var2.b("dialog");
                    if (qd1VarB2 instanceof h50) {
                        h50Var2 = (h50) qd1VarB2;
                    } else {
                        h50Var = huVar3;
                    }
                    if (h50Var == 0) {
                        lr1VarR = ak0Var2.r();
                        if (lr1VarR != null) {
                            h50Var = h50Var2;
                            return;
                        } else {
                            h50Var = h50Var2;
                            lr1VarR.d = new mc1(ic1Var, cc1Var, u71Var, t3Var, ej0Var, ej0Var2, ej0Var3, ej0Var4, i, 0);
                            return;
                        }
                    }
                    h50Var = h50Var2;
                    rw.c(h50Var, ak0Var2, 0);
                }
            }
            rd1Var2 = rd1Var;
            qd1VarB = rd1Var2.b("composable");
            if (qd1VarB instanceof hu) {
                huVar2 = (hu) qd1VarB;
            } else {
                huVar2 = huVar;
            }
            if (huVar2 == null) {
                lr1VarR2 = ak0Var.r();
                if (lr1VarR2 != null) {
                    lr1VarR2.d = new mc1(ic1Var, cc1Var, u71Var, t3Var, ej0Var, ej0Var2, ej0Var3, ej0Var4, i, 2);
                    return;
                }
                return;
            }
            jr1 jr1Var3 = huVar2.b().e;
            da1VarF = v12.f(jr1Var3, jr1Var3.e.getValue(), ak0Var, 0, 0);
            objL = ak0Var.L();
            is1Var = cv.a;
            if (objL == is1Var) {
                obj = objL;
                zj1 zj1Var3 = new zj1(0.0f);
                ak0Var.g0(zj1Var3);
                obj = zj1Var3;
            }
            obj = objL;
            zj1Var = (zj1) obj;
            objL2 = ak0Var.L();
            obj2 = objL2;
            if (objL2 == is1Var) {
                dk1 dk1VarS2 = y12.s(Boolean.FALSE);
                ak0Var.g0(dk1VarS2);
                obj2 = dk1VarS2;
            }
            da1Var = (da1) obj2;
            if (((List) da1VarF.getValue()).size() > 1) {
                z = true;
            } else {
                z = false;
            }
            zF = ak0Var.f(da1VarF) | ak0Var.h(huVar2);
            objL3 = ak0Var.L();
            if (zF) {
                objL3 = new m7(huVar2, da1VarF, zj1Var, da1Var, null, 5);
                da1Var2 = da1VarF;
                ak0Var.g0(objL3);
            } else {
                objL3 = new m7(huVar2, da1VarF, zj1Var, da1Var, null, 5);
                da1Var2 = da1VarF;
                ak0Var.g0(objL3);
            }
            ux.h(z, (ij0) objL3, ak0Var, 0);
            y11Var2 = y11Var;
            zH = ak0Var.h(ic1Var) | ak0Var.h(y11Var2);
            Object objL17 = ak0Var.L();
            if (zH) {
                i2 = 1;
                kc1 kc1Var3 = new kc1(i2, ic1Var, y11Var2);
                ak0Var.g0(kc1Var3);
                obj3 = kc1Var3;
            } else {
                i2 = 1;
                kc1 kc1Var4 = new kc1(i2, ic1Var, y11Var2);
                ak0Var.g0(kc1Var4);
                obj3 = kc1Var4;
            }
            s5.e(y11Var2, (ej0) obj3, ak0Var);
            fw1VarD = ux.D(ak0Var);
            jr1 jr1Var4 = rb1Var.i;
            i3 = 0;
            da1VarF2 = v12.f(jr1Var4, jr1Var4.e.getValue(), ak0Var, 0, 0);
            objL4 = ak0Var.L();
            obj4 = objL4;
            if (objL4 == is1Var) {
                v40 v40VarB2 = e72.b(new nc1(da1VarF2, i3));
                ak0Var.g0(v40VarB2);
                obj4 = v40VarB2;
            }
            p82Var = (p82) obj4;
            kb1Var = (kb1) vq.X((List) p82Var.getValue());
            objL5 = ak0Var.L();
            obj5 = objL5;
            if (objL5 == is1Var) {
                int i45 = df1.a;
                k91 k91Var4 = new k91(6);
                ak0Var.g0(k91Var4);
                obj5 = k91Var4;
            }
            k91Var = (k91) obj5;
            if (kb1Var != null) {
                ak0Var.W(-1797250687);
                int i46 = (ak0Var.h(huVar2) ? 1 : 0) | (((((i20 & 3670016) ^ 1572864) > 1048576 || !ak0Var.f(ej0Var3)) && (i20 & 1572864) != 1048576) ? 0 : i2);
                if ((i20 & 57344) == 16384) {
                    i4 = i2;
                } else {
                    i4 = 0;
                }
                i5 = i46 | i4;
                objL6 = ak0Var.L();
                if (i5 == 0) {
                    final int i47 = 1;
                    huVar4 = huVar2;
                    i6 = 0;
                    ej0 ej0Var11 = new ej0() { // from class: jc1
                        @Override // defpackage.ej0
                        public final Object h(Object obj16) {
                            int i48 = i47;
                            da1 da1Var3 = da1Var;
                            ej0 ej0Var12 = ej0Var;
                            ej0 ej0Var13 = ej0Var3;
                            hu huVar7 = huVar4;
                            ab abVar = (ab) obj16;
                            switch (i48) {
                                case 0:
                                    zb1 zb1Var5 = ((kb1) abVar.a()).f;
                                    zb1Var5.getClass();
                                    gu guVar = (gu) zb1Var5;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i49 = zb1.i;
                                        for (zb1 zb1Var6 : vv.o(guVar)) {
                                        }
                                        return (kc0) ej0Var13.h(abVar);
                                    }
                                    int i410 = zb1.i;
                                    for (zb1 zb1Var7 : vv.o(guVar)) {
                                    }
                                    return (kc0) ej0Var12.h(abVar);
                                default:
                                    zb1 zb1Var8 = ((kb1) abVar.c()).f;
                                    zb1Var8.getClass();
                                    gu guVar2 = (gu) zb1Var8;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i411 = zb1.i;
                                        for (zb1 zb1Var9 : vv.o(guVar2)) {
                                        }
                                        return (sb0) ej0Var13.h(abVar);
                                    }
                                    int i412 = zb1.i;
                                    for (zb1 zb1Var10 : vv.o(guVar2)) {
                                    }
                                    return (sb0) ej0Var12.h(abVar);
                            }
                        }
                    };
                    ak0Var.g0(ej0Var11);
                    objL6 = ej0Var11;
                } else {
                    final int i48 = 1;
                    huVar4 = huVar2;
                    i6 = 0;
                    ej0 ej0Var12 = new ej0() { // from class: jc1
                        @Override // defpackage.ej0
                        public final Object h(Object obj16) {
                            int i49 = i48;
                            da1 da1Var3 = da1Var;
                            ej0 ej0Var13 = ej0Var;
                            ej0 ej0Var14 = ej0Var3;
                            hu huVar7 = huVar4;
                            ab abVar = (ab) obj16;
                            switch (i49) {
                                case 0:
                                    zb1 zb1Var5 = ((kb1) abVar.a()).f;
                                    zb1Var5.getClass();
                                    gu guVar = (gu) zb1Var5;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i410 = zb1.i;
                                        for (zb1 zb1Var6 : vv.o(guVar)) {
                                        }
                                        return (kc0) ej0Var14.h(abVar);
                                    }
                                    int i411 = zb1.i;
                                    for (zb1 zb1Var7 : vv.o(guVar)) {
                                    }
                                    return (kc0) ej0Var13.h(abVar);
                                default:
                                    zb1 zb1Var8 = ((kb1) abVar.c()).f;
                                    zb1Var8.getClass();
                                    gu guVar2 = (gu) zb1Var8;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i412 = zb1.i;
                                        for (zb1 zb1Var9 : vv.o(guVar2)) {
                                        }
                                        return (sb0) ej0Var14.h(abVar);
                                    }
                                    int i413 = zb1.i;
                                    for (zb1 zb1Var10 : vv.o(guVar2)) {
                                    }
                                    return (sb0) ej0Var13.h(abVar);
                            }
                        }
                    };
                    ak0Var.g0(ej0Var12);
                    objL6 = ej0Var12;
                }
                ej0Var5 = (ej0) objL6;
                int i49 = (ak0Var.h(huVar4) ? 1 : 0) | (((((i20 & 29360128) ^ 12582912) > 8388608 || !ak0Var.f(ej0Var4)) && (i20 & 12582912) != 8388608) ? i6 : i2);
                if ((i20 & 458752) == 131072) {
                    i7 = i2;
                } else {
                    i7 = i6;
                }
                i8 = i49 | i7;
                objL7 = ak0Var.L();
                if (i8 == 0) {
                    final int i410 = 0;
                    ej0 ej0Var13 = new ej0() { // from class: jc1
                        @Override // defpackage.ej0
                        public final Object h(Object obj16) {
                            int i411 = i410;
                            da1 da1Var3 = da1Var;
                            ej0 ej0Var14 = ej0Var2;
                            ej0 ej0Var15 = ej0Var4;
                            hu huVar7 = huVar4;
                            ab abVar = (ab) obj16;
                            switch (i411) {
                                case 0:
                                    zb1 zb1Var5 = ((kb1) abVar.a()).f;
                                    zb1Var5.getClass();
                                    gu guVar = (gu) zb1Var5;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i412 = zb1.i;
                                        for (zb1 zb1Var6 : vv.o(guVar)) {
                                        }
                                        return (kc0) ej0Var15.h(abVar);
                                    }
                                    int i413 = zb1.i;
                                    for (zb1 zb1Var7 : vv.o(guVar)) {
                                    }
                                    return (kc0) ej0Var14.h(abVar);
                                default:
                                    zb1 zb1Var8 = ((kb1) abVar.c()).f;
                                    zb1Var8.getClass();
                                    gu guVar2 = (gu) zb1Var8;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i414 = zb1.i;
                                        for (zb1 zb1Var9 : vv.o(guVar2)) {
                                        }
                                        return (sb0) ej0Var15.h(abVar);
                                    }
                                    int i415 = zb1.i;
                                    for (zb1 zb1Var10 : vv.o(guVar2)) {
                                    }
                                    return (sb0) ej0Var14.h(abVar);
                            }
                        }
                    };
                    ak0Var.g0(ej0Var13);
                    objL7 = ej0Var13;
                } else {
                    final int i411 = 0;
                    ej0 ej0Var14 = new ej0() { // from class: jc1
                        @Override // defpackage.ej0
                        public final Object h(Object obj16) {
                            int i412 = i411;
                            da1 da1Var3 = da1Var;
                            ej0 ej0Var15 = ej0Var2;
                            ej0 ej0Var16 = ej0Var4;
                            hu huVar7 = huVar4;
                            ab abVar = (ab) obj16;
                            switch (i412) {
                                case 0:
                                    zb1 zb1Var5 = ((kb1) abVar.a()).f;
                                    zb1Var5.getClass();
                                    gu guVar = (gu) zb1Var5;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i413 = zb1.i;
                                        for (zb1 zb1Var6 : vv.o(guVar)) {
                                        }
                                        return (kc0) ej0Var16.h(abVar);
                                    }
                                    int i414 = zb1.i;
                                    for (zb1 zb1Var7 : vv.o(guVar)) {
                                    }
                                    return (kc0) ej0Var15.h(abVar);
                                default:
                                    zb1 zb1Var8 = ((kb1) abVar.c()).f;
                                    zb1Var8.getClass();
                                    gu guVar2 = (gu) zb1Var8;
                                    if (((Boolean) huVar7.c.getValue()).booleanValue() || ((Boolean) da1Var3.getValue()).booleanValue()) {
                                        int i415 = zb1.i;
                                        for (zb1 zb1Var9 : vv.o(guVar2)) {
                                        }
                                        return (sb0) ej0Var16.h(abVar);
                                    }
                                    int i416 = zb1.i;
                                    for (zb1 zb1Var10 : vv.o(guVar2)) {
                                    }
                                    return (sb0) ej0Var15.h(abVar);
                            }
                        }
                    };
                    ak0Var.g0(ej0Var14);
                    objL7 = ej0Var14;
                }
                ej0Var6 = (ej0) objL7;
                if ((i20 & 234881024) == 67108864) {
                    i9 = i2;
                } else {
                    i9 = i6;
                }
                Object objL18 = ak0Var.L();
                obj6 = objL18;
                if (i9 == 0) {
                    o01 o01Var3 = new o01(20);
                    ak0Var.g0(o01Var3);
                    obj6 = o01Var3;
                } else {
                    o01 o01Var4 = new o01(20);
                    ak0Var.g0(o01Var4);
                    obj6 = o01Var4;
                }
                ej0Var7 = (ej0) obj6;
                Boolean bool2 = Boolean.TRUE;
                zH2 = ak0Var.h(huVar4);
                Object objL19 = ak0Var.L();
                obj7 = objL19;
                if (zH2) {
                    kc1 kc1Var5 = new kc1(0, p82Var, huVar4);
                    ak0Var.g0(kc1Var5);
                    obj7 = kc1Var5;
                } else {
                    kc1 kc1Var6 = new kc1(0, p82Var, huVar4);
                    ak0Var.g0(kc1Var6);
                    obj7 = kc1Var6;
                }
                s5.e(bool2, (ej0) obj7, ak0Var);
                objL8 = ak0Var.L();
                obj8 = objL8;
                if (objL8 == is1Var) {
                    fz1 fz1Var4 = new fz1(kb1Var);
                    ak0Var.g0(fz1Var4);
                    obj8 = fz1Var4;
                }
                fz1Var = (fz1) obj8;
                ki2VarD = oi2.d(fz1Var, "entry", ak0Var, 56);
                if (((Boolean) da1Var.getValue()).booleanValue()) {
                    ak0Var.W(-1795016672);
                    Float fValueOf2 = Float.valueOf(zj1Var.h());
                    zF3 = ak0Var.f(da1Var2) | ak0Var.h(fz1Var);
                    objL13 = ak0Var.L();
                    if (zF3) {
                        huVar3 = null;
                        objL13 = new g(fz1Var, da1Var2, zj1Var, false ? 1 : 0, 15);
                        ak0Var.g0(objL13);
                    } else {
                        huVar3 = null;
                        objL13 = new g(fz1Var, da1Var2, zj1Var, false ? 1 : 0, 15);
                        ak0Var.g0(objL13);
                    }
                    s5.o((ij0) objL13, ak0Var, fValueOf2);
                    ak0Var.p(false);
                    ki2Var = ki2VarD;
                    fz1Var2 = fz1Var;
                } else {
                    huVar3 = null;
                    z3 = false;
                    ak0Var.W(-1794598265);
                    zH3 = ak0Var.h(fz1Var) | ak0Var.h(kb1Var) | ak0Var.f(ki2VarD);
                    objL9 = ak0Var.L();
                    if (zH3) {
                        ki2Var = ki2VarD;
                        fz1Var2 = fz1Var;
                        objL9 = new n7((Object) fz1Var2, (Object) kb1Var, (Object) ki2Var, (sx) (z3 ? 1 : 0), 7);
                        ak0Var.g0(objL9);
                    } else {
                        ki2Var = ki2VarD;
                        fz1Var2 = fz1Var;
                        objL9 = new n7((Object) fz1Var2, (Object) kb1Var, (Object) ki2Var, (sx) (z3 ? 1 : 0), 7);
                        ak0Var.g0(objL9);
                    }
                    s5.o((ij0) objL9, ak0Var, kb1Var);
                    ak0Var.p(false);
                }
                zH4 = ak0Var.h(k91Var) | ak0Var.h(huVar4) | ak0Var.f(ej0Var5) | ak0Var.f(ej0Var6) | ak0Var.f(ej0Var7);
                objL10 = ak0Var.L();
                if (zH4) {
                    hu huVar7 = huVar4;
                    p82Var2 = p82Var;
                    objL10 = new g00(k91Var, huVar7, ej0Var5, ej0Var6, ej0Var7, p82Var2, da1Var);
                    k91Var2 = k91Var;
                    huVar5 = huVar7;
                    ak0Var.g0(objL10);
                } else {
                    hu huVar8 = huVar4;
                    p82Var2 = p82Var;
                    objL10 = new g00(k91Var, huVar8, ej0Var5, ej0Var6, ej0Var7, p82Var2, da1Var);
                    k91Var2 = k91Var;
                    huVar5 = huVar8;
                    ak0Var.g0(objL10);
                }
                ej0 ej0Var15 = (ej0) objL10;
                objL11 = ak0Var.L();
                obj9 = objL11;
                if (objL11 == is1Var) {
                    o01 o01Var5 = new o01(22);
                    ak0Var.g0(o01Var5);
                    obj9 = o01Var5;
                }
                p82Var3 = p82Var2;
                ki2Var2 = ki2Var;
                p61.b(ki2Var2, u71Var, ej0Var15, t3Var, (ej0) obj9, vs0.C(820763100, new pc1(fz1Var2, kb1Var, fw1VarD, da1Var, p82Var3), ak0Var), ak0Var, ((i20 >> 3) & 112) | 221184 | (i20 & 7168));
                ak0Var2 = ak0Var;
                Object objF2 = ki2Var2.a.f();
                Object value2 = ki2Var2.d.getValue();
                zF2 = ak0Var2.f(ki2Var2) | ak0Var2.h(ic1Var) | ak0Var2.h(kb1Var) | ak0Var2.h(huVar5) | ak0Var2.h(k91Var2);
                objL12 = ak0Var2.L();
                if (zF2) {
                    qc1 qc1Var2 = new qc1(ki2Var2, ic1Var, kb1Var, k91Var2, p82Var3, huVar5, null);
                    ak0Var2.g0(qc1Var2);
                    objL12 = qc1Var2;
                } else {
                    qc1 qc1Var3 = new qc1(ki2Var2, ic1Var, kb1Var, k91Var2, p82Var3, huVar5, null);
                    ak0Var2.g0(qc1Var3);
                    objL12 = qc1Var3;
                }
                s5.p(objF2, value2, (ij0) objL12, ak0Var2);
                ak0Var2.p(false);
            } else {
                huVar3 = huVar;
                ak0Var2 = ak0Var;
                ak0Var2.W(-1789446406);
                ak0Var2.p(false);
            }
            qd1VarB2 = rd1Var2.b("dialog");
            if (qd1VarB2 instanceof h50) {
                h50Var2 = (h50) qd1VarB2;
            } else {
                h50Var = huVar3;
            }
            if (h50Var == 0) {
                lr1VarR = ak0Var2.r();
                if (lr1VarR != null) {
                    h50Var = h50Var2;
                    return;
                } else {
                    h50Var = h50Var2;
                    lr1VarR.d = new mc1(ic1Var, cc1Var, u71Var, t3Var, ej0Var, ej0Var2, ej0Var3, ej0Var4, i, 0);
                    return;
                }
            }
            h50Var = h50Var2;
            rw.c(h50Var, ak0Var2, 0);
        }
        lr1 lr1VarR3 = ak0Var2.r();
        if (lr1VarR3 != null) {
            lr1VarR3.d = new mc1(ic1Var, cc1Var, u71Var, t3Var, ej0Var, ej0Var2, ej0Var3, ej0Var4, i, 1);
        }
    }

    public static final void c(final ic1 ic1Var, final Object obj, final u71 u71Var, t3 t3Var, Map map, ej0 ej0Var, ej0 ej0Var2, ej0 ej0Var3, ej0 ej0Var4, final ej0 ej0Var5, ak0 ak0Var, final int i) {
        t3 t3Var2;
        ej0 ej0Var6;
        int i2;
        ej0 ej0Var7;
        ej0 ej0Var8;
        Map map2;
        ej0 ej0Var9;
        final ej0 ej0Var10;
        final ej0 ej0Var11;
        final ej0 ej0Var12;
        final ej0 ej0Var13;
        final Map map3;
        final t3 t3Var3;
        ak0Var.X(-1476019057);
        int i3 = i | (ak0Var.h(ic1Var) ? 4 : 2) | (ak0Var.f(u71Var) ? 256 : 128) | 316369920;
        int i4 = (ak0Var.h(ej0Var5) ? ' ' : (char) 16) | 6;
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && ak0Var.A()) {
            ak0Var.R();
            t3Var3 = t3Var;
            map3 = map;
            ej0Var12 = ej0Var;
            ej0Var13 = ej0Var2;
            ej0Var10 = ej0Var3;
            ej0Var11 = ej0Var4;
        } else {
            ak0Var.T();
            int i5 = i & 1;
            is1 is1Var = cv.a;
            if (i5 == 0 || ak0Var.y()) {
                t3Var2 = q90.f;
                Object objL = ak0Var.L();
                if (objL == is1Var) {
                    objL = new o01(19);
                    ak0Var.g0(objL);
                }
                ej0Var6 = (ej0) objL;
                Object objL2 = ak0Var.L();
                if (objL2 == is1Var) {
                    objL2 = new o01(21);
                    ak0Var.g0(objL2);
                }
                i2 = i3 & (-2113929217);
                ej0Var7 = (ej0) objL2;
                ej0Var8 = ej0Var7;
                map2 = db0.e;
                ej0Var9 = ej0Var6;
            } else {
                ak0Var.R();
                t3Var2 = t3Var;
                map2 = map;
                ej0Var6 = ej0Var;
                ej0Var9 = ej0Var3;
                ej0Var8 = ej0Var4;
                i2 = i3 & (-2113929217);
                ej0Var7 = ej0Var2;
            }
            ak0Var.q();
            boolean zF = ((i4 & 112) == 32) | ak0Var.f(null) | ak0Var.f(obj);
            Object objL3 = ak0Var.L();
            if (zF || objL3 == is1Var) {
                dc1 dc1Var = new dc1(ic1Var.b.s, obj, map2);
                ej0Var5.h(dc1Var);
                objL3 = dc1Var.c();
                ak0Var.g0(objL3);
            }
            t3 t3Var4 = t3Var2;
            ej0 ej0Var14 = ej0Var7;
            ej0 ej0Var15 = ej0Var6;
            ej0 ej0Var16 = ej0Var8;
            b(ic1Var, (cc1) objL3, u71Var, t3Var4, ej0Var15, ej0Var14, ej0Var9, ej0Var16, ak0Var, (i2 & 8078) | 100884480);
            ej0Var10 = ej0Var9;
            ej0Var11 = ej0Var16;
            ej0Var12 = ej0Var15;
            ej0Var13 = ej0Var14;
            map3 = map2;
            t3Var3 = t3Var4;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(obj, u71Var, t3Var3, map3, ej0Var12, ej0Var13, ej0Var10, ej0Var11, ej0Var5, i) { // from class: lc1
                public final /* synthetic */ Object f;
                public final /* synthetic */ u71 g;
                public final /* synthetic */ t3 h;
                public final /* synthetic */ Map i;
                public final /* synthetic */ ej0 j;
                public final /* synthetic */ ej0 k;
                public final /* synthetic */ ej0 l;
                public final /* synthetic */ ej0 m;
                public final /* synthetic */ ej0 n;

                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(49);
                    ei1.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (ak0) obj2, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static float d(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final void e(un2 un2Var, ru1 ru1Var, b21 b21Var) {
        ru1Var.getClass();
        b21Var.getClass();
        lw1 lw1Var = (lw1) un2Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (lw1Var == null || lw1Var.g) {
            return;
        }
        lw1Var.k(ru1Var, b21Var);
        r11 r11Var = b21Var.h;
        if (r11Var == r11.f || r11Var.compareTo(r11.h) >= 0) {
            ru1Var.q();
        } else {
            b21Var.a(new g30(1, b21Var, ru1Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object f(defpackage.bb2 r7, defpackage.qn1 r8, defpackage.sh r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ph0
            if (r0 == 0) goto L13
            r0 = r9
            ph0 r0 = (defpackage.ph0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ph0 r0 = new ph0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            qn1 r7 = r0.i
            bb2 r8 = r0.h
            defpackage.ix.Q(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r7)
            r7 = 0
            return r7
        L34:
            defpackage.ix.Q(r9)
            cb2 r9 = r7.i
            pn1 r9 = r9.w
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            wn1 r5 = (defpackage.wn1) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.h = r7
            r0.i = r8
            r0.k = r3
            java.lang.Object r9 = r7.a(r8, r0)
            fz r1 = defpackage.fz.e
            if (r9 != r1) goto L5d
            return r1
        L5d:
            pn1 r9 = (defpackage.pn1) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            wn1 r5 = (defpackage.wn1) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            ll2 r7 = defpackage.ll2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei1.f(bb2, qn1, sh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object g(defpackage.bb2 r6, defpackage.sh r7) {
        /*
            boolean r0 = r7 instanceof defpackage.xz1
            if (r0 == 0) goto L13
            r0 = r7
            xz1 r0 = (defpackage.xz1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            xz1 r0 = new xz1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            bb2 r6 = r0.h
            defpackage.ix.Q(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.ix.Q(r7)
        L31:
            r0.h = r6
            r0.j = r2
            qn1 r7 = defpackage.qn1.f
            java.lang.Object r7 = r6.a(r7, r0)
            fz r1 = defpackage.fz.e
            if (r7 != r1) goto L40
            return r1
        L40:
            pn1 r7 = (defpackage.pn1) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            wn1 r5 = (defpackage.wn1) r5
            boolean r5 = defpackage.sv.n(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei1.g(bb2, sh):java.lang.Object");
    }

    public static final Object h(ao1 ao1Var, ij0 ij0Var, sx sxVar) {
        Object objF0 = ((cb2) ao1Var).F0(new qh0(sxVar.f(), ij0Var, (sx) null), sxVar);
        return objF0 == fz.e ? objF0 : ll2.a;
    }

    public static mt0 i(int i) {
        int i2 = i + 621;
        int[] iArr = nt0.d;
        int i3 = 0;
        int i4 = iArr[0];
        if (i < i4 || i >= iArr[19]) {
            qj.f(k3.i("Jalali year out of range: ", i));
            return null;
        }
        int i5 = -14;
        int i6 = 1;
        while (true) {
            if (i6 >= 20) {
                break;
            }
            int i7 = iArr[i6];
            int i8 = i7 - i4;
            if (i < i7) {
                i3 = i8;
                break;
            }
            i5 += ((i8 % 33) / 4) + ((i8 / 33) * 8);
            i6++;
            i4 = i7;
            i3 = i8;
        }
        int i9 = i - i4;
        int i10 = (((i9 % 33) + 3) / 4) + ((i9 / 33) * 8) + i5;
        if (i3 % 33 == 4 && i3 - i9 == 4) {
            i10++;
        }
        int i11 = (i10 + 20) - (((i2 / 4) - ((((i2 / 100) + 1) * 3) / 4)) - 150);
        if (i3 - i9 < 6) {
            i9 = (i9 - i3) + (((i3 + 4) / 33) * 33);
        }
        int i12 = (((i9 + 1) % 33) - 1) % 4;
        return new mt0(i12 != -1 ? i12 : 4, i2, i11);
    }

    public static final int j(long j, long j2) {
        boolean zA = A(j);
        if (zA != A(j2)) {
            return zA ? -1 : 1;
        }
        int iSignum = (int) Math.signum(u(j) - u(j2));
        if (Math.min(u(j), u(j2)) >= 0.0f && z(j) != z(j2)) {
            return z(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    public static final mv0 k(aq aqVar, mv0... mv0VarArr) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        mv0 mv0Var;
        Class<?> cls;
        Object obj2;
        mv0 mv0VarY;
        Field field;
        z12 z12Var;
        aqVar.getClass();
        Class clsQ = vv.q(aqVar);
        mv0[] mv0VarArr2 = (mv0[]) Arrays.copyOf(mv0VarArr, mv0VarArr.length);
        if (clsQ.isEnum() && clsQ.getAnnotation(z12.class) == null && clsQ.getAnnotation(do1.class) == null) {
            Object[] enumConstants = clsQ.getEnumConstants();
            String canonicalName = clsQ.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new zb0(canonicalName, (Enum[]) enumConstants);
        }
        mv0[] mv0VarArr3 = (mv0[]) Arrays.copyOf(mv0VarArr2, mv0VarArr2.length);
        fo1 fo1Var = null;
        try {
            Field declaredField = clsQ.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        mv0 mv0VarY2 = obj == null ? null : y(obj, (mv0[]) Arrays.copyOf(mv0VarArr3, mv0VarArr3.length));
        if (mv0VarY2 != null) {
            return mv0VarY2;
        }
        String canonicalName2 = clsQ.getCanonicalName();
        if (canonicalName2 == null || canonicalName2.startsWith("java.") || canonicalName2.startsWith("kotlin.")) {
            mv0Var = null;
        } else {
            Field[] declaredFields = clsQ.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i];
                if (ws0.j(field3.getName(), "INSTANCE") && ws0.j(field3.getType(), clsQ) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z) {
                        z = true;
                        field2 = field3;
                    }
                }
                i++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                mv0Var = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsQ.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (ws0.j(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && ws0.j(method2.getReturnType(), mv0.class)) {
                            if (!z2) {
                                z2 = true;
                                method = method2;
                            }
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    mv0Var = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof mv0) {
                        mv0Var = (mv0) objInvoke;
                    } else {
                        mv0Var = null;
                    }
                }
            }
        }
        if (mv0Var != null) {
            return mv0Var;
        }
        mv0[] mv0VarArr4 = (mv0[]) Arrays.copyOf(mv0VarArr2, mv0VarArr2.length);
        Class<?>[] declaredClasses = clsQ.getDeclaredClasses();
        declaredClasses.getClass();
        int length3 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i3];
            if (cls.getAnnotation(gb1.class) != null) {
                break;
            }
            i3++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsQ.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (mv0VarY = y(obj2, (mv0[]) Arrays.copyOf(mv0VarArr4, mv0VarArr4.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsQ.getDeclaredClasses();
                declaredClasses2.getClass();
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses2[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                mv0VarY = obj4 instanceof mv0 ? (mv0) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (mv0VarY != null) {
            return mv0VarY;
        }
        if (clsQ.getAnnotation(do1.class) != null || ((z12Var = (z12) clsQ.getAnnotation(z12.class)) != null && js1.a(z12Var.with()).equals(js1.a(fo1.class)))) {
            fo1Var = new fo1(js1.a(clsQ));
        }
        return fo1Var;
    }

    public static vg0 l(Context context) {
        ProviderInfo providerInfo;
        tg0 tg0Var;
        ApplicationInfo applicationInfo;
        int i = 29;
        is1 s20Var = Build.VERSION.SDK_INT >= 28 ? new s20(i) : new is1(i);
        PackageManager packageManager = context.getPackageManager();
        mx.q(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            tg0Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrI = s20Var.i(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrI) {
                    arrayList.add(signature.toByteArray());
                }
                tg0Var = new tg0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                tg0Var = null;
            }
        }
        if (tg0Var == null) {
            return null;
        }
        return new vg0(new ug0(context, tg0Var));
    }

    public static Handler m(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return v50.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final hf0 n(bv1 bv1Var, String[] strArr, ej0 ej0Var) {
        qj1 qj1Var;
        bv1Var.getClass();
        gt0 gt0VarE = bv1Var.e();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        ij2 ij2Var = gt0VarE.b;
        ij2Var.getClass();
        z22 z22Var = new z22();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = ij2Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                z22Var.addAll(set);
            } else {
                z22Var.add(str);
            }
        }
        String[] strArr3 = (String[]) n02.f(z22Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr3[i];
            LinkedHashMap linkedHashMap2 = ij2Var.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                qj.r("There is no table with name ".concat(str2));
                qj1Var = null;
                String[] strArr4 = (String[]) qj1Var.e;
                int[] iArr2 = (int[]) qj1Var.f;
                strArr4.getClass();
                iArr2.getClass();
                return new hf0(vv.g(new ue0(2, new n7(ij2Var, iArr2, strArr4, (sx) null, 14)), -1), bv1Var, ej0Var, 1);
            }
            iArr[i] = num.intValue();
        }
        qj1Var = new qj1(strArr3, iArr);
        String[] strArr5 = (String[]) qj1Var.e;
        int[] iArr3 = (int[]) qj1Var.f;
        strArr5.getClass();
        iArr3.getClass();
        return new hf0(vv.g(new ue0(2, new n7(ij2Var, iArr3, strArr5, (sx) null, 14)), -1), bv1Var, ej0Var, 1);
    }

    public static ei1 o(vv vvVar, int i) {
        if (i == 0) {
            return new ei1(vvVar);
        }
        if (i == 1) {
            return new ei1(vvVar);
        }
        qj.r("invalid orientation");
        return null;
    }

    public static final long p(long j, boolean z, int i, float f) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && sw.d(j)) ? sw.h(j) : Integer.MAX_VALUE;
        if (sw.j(j) != iH) {
            iH = ex.h(j02.e(f), sw.j(j), iH);
        }
        return rw.w(0, iH, 0, sw.g(j));
    }

    public static final int q(jz0 jz0Var, Object obj, int i) {
        int iE;
        return (obj == null || jz0Var.a() == 0 || (i < jz0Var.a() && obj.equals(jz0Var.b(i))) || (iE = jz0Var.e(obj)) == -1) ? i : iE;
    }

    public static nt0 r(int i) {
        int i2;
        int i3 = i + 2440588;
        int i4 = i3 * 4;
        int i5 = ((((((i4 + 183187720) / 146097) * 3) / 4) * 4) - 3908) + 139361631 + i4;
        int i6 = ((8 - (((((((i5 % 1461) / 4) * 5) + 308) / 153) % 12) + 1)) / 6) + ((i5 / 1461) - 100100);
        int i7 = i6 - 621;
        mt0 mt0VarI = i(i7);
        int iW = i3 - w(mt0VarI.b, mt0VarI.c);
        if (iW < 0) {
            i7 = i6 - 622;
            i2 = mt0VarI.a == 1 ? iW + 180 : iW + 179;
        } else {
            if (iW <= 185) {
                return new nt0(i7, (iW / 31) + 1, (iW % 31) + 1);
            }
            i2 = iW - 186;
        }
        return new nt0(i7, (i2 / 30) + 7, (i2 % 30) + 1);
    }

    public static final aq s(s12 s12Var) {
        s12Var.getClass();
        if (s12Var instanceof kx) {
            return ((kx) s12Var).b;
        }
        if (s12Var instanceof t12) {
            return s(((t12) s12Var).a);
        }
        return null;
    }

    public static float t(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e90.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final float u(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final int v(vv1 vv1Var) {
        vv1Var.getClass();
        xv1 xv1VarC = vv1Var.C("SELECT changes()");
        try {
            xv1VarC.y();
            int i = (int) xv1VarC.getLong(0);
            ir2.h(xv1VarC, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    public static int w(int i, int i2) {
        return (((((i + 100100) * 1461) / 4) + i2) - 34840408) - (((((i + 100100) / 100) * 3) / 4) - 752);
    }

    public static final void x(uy uyVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = zy.a.iterator();
        while (it.hasNext()) {
            try {
                ((yy) it.next()).q(uyVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    vv.e(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            vv.e(th, new a50(uyVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final mv0 y(Object obj, mv0... mv0VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (mv0VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = mv0VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = mv0.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(mv0VarArr, mv0VarArr.length));
            if (objInvoke instanceof mv0) {
                return (mv0) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean z(long j) {
        return (j & 2) != 0;
    }
}

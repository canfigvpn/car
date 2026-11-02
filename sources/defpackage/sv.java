package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sv {
    public static jo0 a;

    public static final jw0 A(jw0 jw0Var) {
        jw0 jw0Var2;
        jw0 jw0VarK = jw0Var.k();
        while (true) {
            jw0 jw0Var3 = jw0VarK;
            jw0Var2 = jw0Var;
            jw0Var = jw0Var3;
            if (jw0Var == null) {
                break;
            }
            jw0VarK = jw0Var.k();
        }
        me1 me1Var = jw0Var2 instanceof me1 ? (me1) jw0Var2 : null;
        if (me1Var == null) {
            return jw0Var2;
        }
        me1 me1Var2 = me1Var.u;
        while (true) {
            me1 me1Var3 = me1Var2;
            me1 me1Var4 = me1Var;
            me1Var = me1Var3;
            if (me1Var == null) {
                return me1Var4;
            }
            me1Var2 = me1Var.u;
        }
    }

    public static w20 B(ak0 ak0Var) {
        float f = e82.a;
        m40 m40Var = (m40) ak0Var.j(yv.h);
        boolean zC = ak0Var.c(m40Var.b());
        Object objL = ak0Var.L();
        Object obj = cv.a;
        if (zC || objL == obj) {
            objL = new l20(new qk1(m40Var));
            ak0Var.g0(objL);
        }
        l20 l20Var = (l20) objL;
        boolean zF = ak0Var.f(l20Var);
        Object objL2 = ak0Var.L();
        if (zF || objL2 == obj) {
            objL2 = new w20(l20Var);
            ak0Var.g0(objL2);
        }
        return (w20) objL2;
    }

    public static final int C(mv0 mv0Var) {
        int iHashCode = mv0Var.c().b().hashCode();
        int iD = mv0Var.c().d();
        for (int i = 0; i < iD; i++) {
            iHashCode = (iHashCode * 31) + mv0Var.c().e(i).hashCode();
        }
        return iHashCode;
    }

    public static final ArrayList D(mv0 mv0Var, Map map) {
        if (mv0Var instanceof fo1) {
            throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + mv0Var + ". Arguments can only be generated from concrete classes or objects.");
        }
        int iD = mv0Var.c().d();
        ArrayList arrayList = new ArrayList(iD);
        for (int i = 0; i < iD; i++) {
            String strE = mv0Var.c().e(i);
            strE.getClass();
            ib1 ib1Var = new ib1();
            s12 s12VarJ = mv0Var.c().j(i);
            boolean zH = s12VarJ.h();
            xc1 xc1VarV = v(s12VarJ, map);
            if (xc1VarV == null) {
                qj.r(Y(strE, s12VarJ.b(), mv0Var.c().b(), map.toString()));
                return null;
            }
            ib1Var.a = xc1VarV;
            ib1Var.b = zH;
            if (mv0Var.c().k(i)) {
                ib1Var.c = true;
            }
            xc1 xc1Var = ib1Var.a;
            if (xc1Var == null) {
                xc1Var = xc1.n;
            }
            arrayList.add(new hb1(strE, new jb1(xc1Var, ib1Var.b, ib1Var.c)));
        }
        return arrayList;
    }

    public static final String E(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        mv0 mv0VarM = c22.m(js1.a(obj.getClass()));
        ov1 ov1Var = new ov1(mv0VarM, linkedHashMap);
        mv0VarM.d(ov1Var, obj);
        Map mapH0 = h61.h0(ov1Var.r0);
        e4 e4Var = new e4(mv0VarM);
        in inVar = new in(10, mapH0, e4Var);
        int iD = mv0VarM.c().d();
        for (int i = 0; i < iD; i++) {
            String strE = mv0VarM.c().e(i);
            xc1 xc1Var = (xc1) linkedHashMap.get(strE);
            if (xc1Var == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strE + ']').toString());
            }
            inVar.d(Integer.valueOf(i), strE, xc1Var);
        }
        return ((String) e4Var.f) + ((String) e4Var.g) + ((String) e4Var.h);
    }

    public static final Rect F(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final uy G(bv1 bv1Var, boolean z, tx txVar) {
        vh2 vh2Var = (vh2) txVar.f().p(vh2.f);
        uy uyVar = vh2Var != null ? vh2Var.e : null;
        if (!bv1Var.i()) {
            rx rxVar = bv1Var.a;
            if (rxVar == null) {
                ws0.U("coroutineScope");
                throw null;
            }
            uy uyVar2 = rxVar.e;
            if (uyVar == null) {
                uyVar = ab0.e;
            }
            return uyVar2.k(uyVar);
        }
        if (uyVar != null) {
            rx rxVar2 = bv1Var.a;
            if (rxVar2 != null) {
                return rxVar2.e.k(uyVar);
            }
            ws0.U("coroutineScope");
            throw null;
        }
        if (z) {
            uy uyVar3 = bv1Var.b;
            if (uyVar3 != null) {
                return uyVar3;
            }
            ws0.U("transactionContext");
            throw null;
        }
        rx rxVar3 = bv1Var.a;
        if (rxVar3 != null) {
            return rxVar3.e;
        }
        ws0.U("coroutineScope");
        throw null;
    }

    public static final float H(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = jf2.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : vo0.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float I(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = jf2.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? vo0.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static sb1 J(bo2 bo2Var) {
        t2 t2Var = tb1.a;
        jz jzVar = jz.b;
        t2Var.getClass();
        jzVar.getClass();
        e4 e4Var = new e4(bo2Var, t2Var, jzVar);
        aq aqVarA = js1.a(sb1.class);
        String strB = aqVarA.b();
        if (strB != null) {
            return (sb1) e4Var.j(aqVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        qj.r("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final aa K(uy uyVar) {
        aa aaVar = (aa) uyVar.p(q90.R);
        if (aaVar != null) {
            return aaVar;
        }
        fu1.h("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static Intent L(Context context, ComponentName componentName) {
        String strM = M(context, componentName);
        if (strM == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM);
        return M(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String M(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final boolean N(wn1 wn1Var, long j, long j2) {
        int i = wn1Var.i == 1 ? 1 : 0;
        long j3 = wn1Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean O(s12 s12Var) {
        s12Var.getClass();
        return ws0.j(s12Var.c(), q92.b) && s12Var.f() && s12Var.d() == 1;
    }

    public static final void P(f11 f11Var, te2 te2Var, xf1 xf1Var) {
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            if2 if2VarD = f11Var.d();
            if (if2VarD == null) {
                return;
            }
            cf2 cf2Var = f11Var.e;
            if (cf2Var == null) {
                return;
            }
            jw0 jw0VarC = f11Var.c();
            if (jw0VarC == null) {
                return;
            }
            r02.n(te2Var, f11Var.a, if2VarD.a, jw0VarC, cf2Var, f11Var.b(), xf1Var);
        } finally {
            c12.s(o62VarJ, o62VarP, ej0VarE);
        }
    }

    public static final int Q(hy0 hy0Var, di1 di1Var) {
        return (int) (di1Var == di1.e ? hy0Var.o & 4294967295L : hy0Var.o >> 32);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object R(sx sxVar, ej0 ej0Var, bv1 bv1Var, boolean z, boolean z2) {
        vz vzVar;
        boolean z3;
        ej0 ej0Var2;
        bv1 bv1Var2;
        boolean z4;
        if (sxVar instanceof vz) {
            vzVar = (vz) sxVar;
            int i = vzVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzVar.m = i - Integer.MIN_VALUE;
            } else {
                vzVar = new vz(sxVar);
            }
        } else {
            vzVar = new vz(sxVar);
        }
        vz vzVar2 = vzVar;
        Object obj = vzVar2.l;
        int i2 = vzVar2.m;
        fz fzVar = fz.e;
        if (i2 == 0) {
            ix.Q(obj);
            if (bv1Var.i() && bv1Var.k() && bv1Var.j()) {
                wz wzVar = new wz(null, ej0Var, bv1Var, z2, z);
                vzVar2.m = 1;
                Object objL = bv1Var.l(z, wzVar, vzVar2);
                if (objL != fzVar) {
                    return objL;
                }
            } else {
                z3 = z2;
                vzVar2.h = bv1Var;
                vzVar2.i = ej0Var;
                vzVar2.j = z;
                vzVar2.k = z3;
                vzVar2.m = 2;
                uy uyVarG = G(bv1Var, z3, vzVar2);
                if (uyVarG != fzVar) {
                    ej0Var2 = ej0Var;
                    bv1Var2 = bv1Var;
                    obj = uyVarG;
                    z4 = z;
                }
            }
        }
        if (i2 == 1) {
            ix.Q(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ix.Q(obj);
                return obj;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z3 = vzVar2.k;
        boolean z5 = vzVar2.j;
        ej0 ej0Var3 = vzVar2.i;
        bv1 bv1Var3 = vzVar2.h;
        ix.Q(obj);
        z4 = z5;
        ej0Var2 = ej0Var3;
        bv1Var2 = bv1Var3;
        uz uzVar = new uz(null, ej0Var2, bv1Var2, z4, z3);
        vzVar2.h = null;
        vzVar2.i = null;
        vzVar2.m = 3;
        Object objK = nj2.K((uy) obj, uzVar, vzVar2);
        return objK == fzVar ? fzVar : objK;
    }

    public static final long S(wn1 wn1Var, boolean z) {
        long jD = uf1.d(wn1Var.c, wn1Var.g);
        if (z || !wn1Var.b()) {
            return jD;
        }
        return 0L;
    }

    public static void T(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            g1.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            g1.g(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            U(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            U(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            U(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        U(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void U(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final String V(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final void W(ye2 ye2Var, f11 f11Var, te2 te2Var, oo0 oo0Var, xf1 xf1Var) {
        dq0 dq0Var = f11Var.d;
        ey eyVar = f11Var.v;
        ey eyVar2 = f11Var.w;
        gs1 gs1Var = new gs1();
        o1 o1Var = new o1(dq0Var, eyVar, gs1Var, 13);
        kn1 kn1Var = ye2Var.a;
        kn1Var.h(te2Var, oo0Var, o1Var, eyVar2);
        cf2 cf2Var = new cf2(ye2Var, kn1Var);
        ye2Var.b.set(cf2Var);
        gs1Var.e = cf2Var;
        f11Var.e = cf2Var;
        P(f11Var, te2Var, xf1Var);
    }

    public static final Object X(kw1 kw1Var, aq aqVar) {
        kw1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mv0 mv0VarM = c22.m(aqVar);
        ArrayList arrayListD = D(mv0VarM, db0.e);
        int size = arrayListD.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            hb1 hb1Var = (hb1) obj;
            linkedHashMap.put(hb1Var.a, hb1Var.b.a);
        }
        return mv0VarM.a(new nv1(kw1Var, linkedHashMap));
    }

    public static final String Y(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }

    public static Double Z(AbstractList abstractList, int i) {
        List<qj1> list;
        if (abstractList.size() < 2) {
            return null;
        }
        Iterator it = abstractList.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                arrayList.add(new qj1(next, next2));
                next = next2;
            }
            list = arrayList;
        } else {
            list = cb0.e;
        }
        int i2 = 0;
        int i3 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        for (qj1 qj1Var : list) {
            qf1 qf1Var = (qf1) qj1Var.e;
            qf1 qf1Var2 = (qf1) qj1Var.f;
            int i4 = qf1Var2.c;
            int i5 = qf1Var.c;
            int i6 = i4 - i5;
            int i7 = qf1Var2.d - qf1Var.d;
            if (i6 > 0 && i7 >= 0) {
                double d3 = ((double) i) - (((double) (i5 + i4)) / 2.0d);
                if (d3 < 0.0d) {
                    d3 = 0.0d;
                }
                double dPow = Math.pow(0.5d, d3 / 60.0d);
                d2 += ((double) i7) * dPow;
                d += ((double) i6) * dPow;
                i3 += i7;
                i2 += i6;
            }
        }
        if (i2 < 14 || i3 < 100 || d <= 0.0d) {
            return null;
        }
        return Double.valueOf(d2 / d);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(vq1 vq1Var, ij0 ij0Var, ak0 ak0Var, int i) {
        cm2 cm2Var;
        boolean z;
        lr1 lr1VarR;
        ak0Var.X(-149765515);
        rr0 rr0Var = ak0Var.x;
        sl1 sl1VarL = ak0Var.l();
        ak0Var.U(201, hv.b);
        Object objL = ak0Var.L();
        if (ws0.j(objL, cv.a)) {
            cm2Var = null;
        } else {
            objL.getClass();
            cm2Var = (cm2) objL;
        }
        tq1 tq1Var = vq1Var.a;
        cm2 cm2VarC = tq1Var.c(vq1Var, cm2Var);
        boolean zEquals = cm2VarC.equals(cm2Var);
        if (!zEquals) {
            ak0Var.g0(cm2VarC);
        }
        int i2 = 1;
        if (!ak0Var.S) {
            k52 k52Var = ak0Var.G;
            Object objB = k52Var.b(k52Var.b, k52Var.g);
            objB.getClass();
            sl1 sl1Var = (sl1) objB;
            if (!(ak0Var.A() && zEquals) && (vq1Var.f || !sl1VarL.containsKey(tq1Var))) {
                sl1VarL = sl1VarL.b(tq1Var, cm2VarC);
            } else if ((zEquals && !ak0Var.w) || !ak0Var.w) {
                sl1VarL = sl1Var;
            }
            if (ak0Var.y || sl1Var != sl1VarL) {
                z = true;
            }
            if (z && !ak0Var.S) {
                ak0Var.J(sl1VarL);
            }
            rr0Var.c(ak0Var.w ? 1 : 0);
            ak0Var.w = z;
            ak0Var.K = sl1VarL;
            ak0Var.S(hv.c, 202, sl1VarL, 0);
            ij0Var.g(ak0Var, Integer.valueOf((i >> 3) & 14));
            ak0Var.p(false);
            ak0Var.p(false);
            ak0Var.w = rr0Var.b() != 0;
            ak0Var.K = null;
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new et(vq1Var, ij0Var, i, i2);
            }
        }
        if (vq1Var.f || !sl1VarL.containsKey(tq1Var)) {
            sl1VarL = sl1VarL.b(tq1Var, cm2VarC);
        }
        ak0Var.J = true;
        z = false;
        if (z) {
            ak0Var.J(sl1VarL);
        }
        rr0Var.c(ak0Var.w ? 1 : 0);
        ak0Var.w = z;
        ak0Var.K = sl1VarL;
        ak0Var.S(hv.c, 202, sl1VarL, 0);
        ij0Var.g(ak0Var, Integer.valueOf((i >> 3) & 14));
        ak0Var.p(false);
        ak0Var.p(false);
        ak0Var.w = rr0Var.b() != 0;
        ak0Var.K = null;
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(vq1Var, ij0Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(vq1[] vq1VarArr, ij0 ij0Var, ak0 ak0Var, int i) {
        sl1 sl1VarF0;
        boolean z;
        lr1 lr1VarR;
        ak0Var.X(415205898);
        rr0 rr0Var = ak0Var.x;
        sl1 sl1VarL = ak0Var.l();
        ak0Var.U(201, hv.b);
        if (ak0Var.S) {
            sl1VarF0 = ak0Var.f0(sl1VarL, vv.S(vq1VarArr, sl1VarL, sl1.h));
            ak0Var.J = true;
        } else {
            k52 k52Var = ak0Var.G;
            Object objH = k52Var.h(k52Var.g, 0);
            objH.getClass();
            sl1 sl1Var = (sl1) objH;
            k52 k52Var2 = ak0Var.G;
            Object objH2 = k52Var2.h(k52Var2.g, 1);
            objH2.getClass();
            sl1 sl1Var2 = (sl1) objH2;
            sl1 sl1VarS = vv.S(vq1VarArr, sl1VarL, sl1Var2);
            if (!ak0Var.A() || ak0Var.y || !sl1Var2.equals(sl1VarS)) {
                sl1VarF0 = ak0Var.f0(sl1VarL, sl1VarS);
                if (ak0Var.y || !ws0.j(sl1VarF0, sl1Var)) {
                    z = true;
                }
                if (z && !ak0Var.S) {
                    ak0Var.J(sl1VarF0);
                }
                rr0Var.c(ak0Var.w ? 1 : 0);
                ak0Var.w = z;
                ak0Var.K = sl1VarF0;
                ak0Var.S(hv.c, 202, sl1VarF0, 0);
                ij0Var.g(ak0Var, Integer.valueOf((i >> 3) & 14));
                ak0Var.p(false);
                ak0Var.p(false);
                ak0Var.w = rr0Var.b() != 0;
                ak0Var.K = null;
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new et(vq1VarArr, ij0Var, i, 2);
                }
            }
            ak0Var.l = ak0Var.G.s() + ak0Var.l;
            sl1VarF0 = sl1Var;
        }
        z = false;
        if (z) {
            ak0Var.J(sl1VarF0);
        }
        rr0Var.c(ak0Var.w ? 1 : 0);
        ak0Var.w = z;
        ak0Var.K = sl1VarF0;
        ak0Var.S(hv.c, 202, sl1VarF0, 0);
        ij0Var.g(ak0Var, Integer.valueOf((i >> 3) & 14));
        ak0Var.p(false);
        ak0Var.p(false);
        ak0Var.w = rr0Var.b() != 0;
        ak0Var.K = null;
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(vq1VarArr, ij0Var, i, 2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void c(defpackage.te2 r64, defpackage.ej0 r65, defpackage.u71 r66, defpackage.vf2 r67, defpackage.io2 r68, defpackage.ej0 r69, defpackage.f91 r70, defpackage.o72 r71, boolean r72, int r73, int r74, defpackage.oo0 r75, defpackage.zv0 r76, boolean r77, boolean r78, defpackage.gt r79, defpackage.ak0 r80, int r81, int r82) {
        /*
            Method dump skipped, instruction units count: 2710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv.c(te2, ej0, u71, vf2, io2, ej0, f91, o72, boolean, int, int, oo0, zv0, boolean, boolean, gt, ak0, int, int):void");
    }

    public static final void d(u71 u71Var, me2 me2Var, gt gtVar, ak0 ak0Var, int i) {
        ak0Var.X(2036174316);
        int i2 = (ak0Var.f(u71Var) ? 4 : 2) | i | (ak0Var.h(me2Var) ? 32 : 16);
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            w61 w61VarC = xj.c(q90.f, true);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71Var);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            qx.a(me2Var, gtVar, ak0Var, (i2 >> 3) & 126);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(u71Var, me2Var, gtVar, i, 3);
        }
    }

    public static final yr1 e(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new yr1(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void f(me2 me2Var, boolean z, ak0 ak0Var, int i) {
        if2 if2VarD;
        ak0Var.X(626339208);
        int i2 = (ak0Var.h(me2Var) ? 4 : 2) | i | (ak0Var.g(z) ? 32 : 16);
        if (!ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            ak0Var.R();
        } else if (z) {
            ak0Var.W(1530097388);
            f11 f11Var = me2Var.d;
            hf2 hf2Var = null;
            if (f11Var != null && (if2VarD = f11Var.d()) != null) {
                hf2 hf2Var2 = if2VarD.a;
                f11 f11Var2 = me2Var.d;
                if (!(f11Var2 != null ? f11Var2.p : true)) {
                    hf2Var = hf2Var2;
                }
            }
            if (hf2Var == null) {
                ak0Var.W(1530097387);
            } else {
                ak0Var.W(1530097388);
                if (of2.c(me2Var.l().b)) {
                    ak0Var.W(2062097806);
                } else {
                    ak0Var.W(2109807302);
                    int iR = me2Var.b.r((int) (me2Var.l().b >> 32));
                    int iR2 = me2Var.b.r((int) (me2Var.l().b & 4294967295L));
                    jt1 jt1VarA = hf2Var.a(iR);
                    jt1 jt1VarA2 = hf2Var.a(Math.max(iR2 - 1, 0));
                    f11 f11Var3 = me2Var.d;
                    if (f11Var3 == null || !((Boolean) f11Var3.m.getValue()).booleanValue()) {
                        ak0Var.W(2062097806);
                    } else {
                        ak0Var.W(2110225306);
                        v12.b(true, jt1VarA, me2Var, ak0Var, ((i2 << 6) & 896) | 6);
                    }
                    ak0Var.p(false);
                    f11 f11Var4 = me2Var.d;
                    if (f11Var4 == null || !((Boolean) f11Var4.n.getValue()).booleanValue()) {
                        ak0Var.W(2062097806);
                    } else {
                        ak0Var.W(2110574459);
                        v12.b(false, jt1VarA2, me2Var, ak0Var, ((i2 << 6) & 896) | 6);
                    }
                    ak0Var.p(false);
                }
                ak0Var.p(false);
                f11 f11Var5 = me2Var.d;
                if (f11Var5 != null) {
                    dk1 dk1Var = f11Var5.l;
                    if (!ws0.j(me2Var.t.a.f, me2Var.l().a.f)) {
                        dk1Var.setValue(Boolean.FALSE);
                    }
                    if (f11Var5.b()) {
                        if (((Boolean) dk1Var.getValue()).booleanValue()) {
                            me2Var.s();
                        } else {
                            me2Var.m();
                        }
                    }
                }
            }
            ak0Var.p(false);
            ak0Var.p(false);
        } else {
            ak0Var.W(1989076778);
            ak0Var.p(false);
            me2Var.m();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new cy(me2Var, z, i);
        }
    }

    public static final void g(me2 me2Var, ak0 ak0Var, int i) {
        yb ybVarK;
        ak0Var.X(-1436003720);
        int i2 = 4;
        int i3 = (ak0Var.h(me2Var) ? 4 : 2) | i;
        if (ak0Var.O(i3 & 1, (i3 & 3) != 2)) {
            f11 f11Var = me2Var.d;
            if (f11Var == null || !((Boolean) f11Var.o.getValue()).booleanValue() || (ybVarK = me2Var.k()) == null || ybVarK.f.length() <= 0) {
                ak0Var.W(2132946858);
            } else {
                ak0Var.W(-2112351432);
                boolean zF = ak0Var.f(me2Var);
                Object objL = ak0Var.L();
                Object obj = cv.a;
                if (zF || objL == obj) {
                    objL = new ie2(me2Var);
                    ak0Var.g0(objL);
                }
                id2 id2Var = (id2) objL;
                m40 m40Var = (m40) ak0Var.j(yv.h);
                xf1 xf1Var = me2Var.b;
                long j = me2Var.l().b;
                int i4 = of2.c;
                int iR = xf1Var.r((int) (j >> 32));
                f11 f11Var2 = me2Var.d;
                if2 if2VarD = f11Var2 != null ? f11Var2.d() : null;
                if2VarD.getClass();
                hf2 hf2Var = if2VarD.a;
                yr1 yr1VarC = hf2Var.c(ex.h(iR, 0, hf2Var.a.a.f.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((m40Var.x(2.0f) / 2.0f) + yr1VarC.a)) << 32) | (((long) Float.floatToRawIntBits(yr1VarC.d)) & 4294967295L);
                boolean zE = ak0Var.e(jFloatToRawIntBits);
                Object objL2 = ak0Var.L();
                if (zE || objL2 == obj) {
                    objL2 = new iy(jFloatToRawIntBits);
                    ak0Var.g0(objL2);
                }
                yf1 yf1Var = (yf1) objL2;
                boolean zH = ak0Var.h(id2Var) | ak0Var.h(me2Var);
                Object objL3 = ak0Var.L();
                if (zH || objL3 == obj) {
                    objL3 = new ly(id2Var, me2Var);
                    ak0Var.g0(objL3);
                }
                u71 u71VarA = ya2.a(r71.a, id2Var, (PointerInputEventHandler) objL3);
                boolean zE2 = ak0Var.e(jFloatToRawIntBits);
                Object objL4 = ak0Var.L();
                if (zE2 || objL4 == obj) {
                    objL4 = new g6(i2, jFloatToRawIntBits);
                    ak0Var.g0(objL4);
                }
                i6.a(yf1Var, l02.a(u71VarA, false, (ej0) objL4), 0L, ak0Var, 0);
            }
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new x7(i, 5, me2Var);
        }
    }

    public static final void h(kc2 kc2Var, Context context, final boolean z, final String str, final long j) {
        if (of2.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) dv1.q.h(context2);
        if (list.isEmpty()) {
            return;
        }
        p91 p91Var = kc2Var.a;
        p91 p91Var2 = kc2Var.a;
        zc2 zc2Var = zc2.b;
        p91Var.a(zc2Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            p91Var2.a(new uc2(new eq1(i), resolveInfo.loadLabel(packageManager).toString(), 0, new ej0() { // from class: fq1
                @Override // defpackage.ej0
                public final Object h(Object obj) {
                    dv1.r.j(context2, resolveInfo, Boolean.valueOf(z), str, new of2(j));
                    ((ad2) obj).close();
                    return ll2.a;
                }
            }));
            i++;
            context2 = context;
        }
        p91Var2.a(zc2Var);
    }

    public static final List i(iq1 iq1Var, int i, int i2, ArrayList arrayList, c91 c91Var, int i3, int i4, int i5, ej0 ej0Var) {
        int i6;
        c91 c91Var2;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        if (iq1Var == null || arrayList.isEmpty() || (i6 = c91Var.b) == 0) {
            return cb0.e;
        }
        int i9 = -1;
        if (i2 - i < 0 || i6 == 0) {
            c91Var2 = fr0.a;
        } else {
            lr0 lr0VarS = ex.S(0, i6);
            int i10 = lr0VarS.e;
            int i11 = lr0VarS.f;
            int iB = -1;
            if (i10 <= i11) {
                while (c91Var.b(i10) <= i) {
                    iB = c91Var.b(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            if (iB == -1) {
                c91Var2 = fr0.a;
            } else {
                c91 c91Var3 = fr0.a;
                c91Var2 = new c91(1);
                c91Var2.a(iB);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = arrayList.get(i12);
            int index = ((nz0) obj2).getIndex();
            int[] iArr = c91Var.a;
            int i13 = c91Var.b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = c91Var2.a;
        int i15 = c91Var2.b;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (i19 >= size2) {
                    i18 = i9;
                    break;
                }
                Object obj3 = arrayList.get(i19);
                i19++;
                if (((nz0) obj3).getIndex() == i17) {
                    break;
                }
                i18++;
            }
            nz0 nz0Var = i18 == i9 ? (nz0) ej0Var.h(Integer.valueOf(i17)) : (nz0) arrayList.remove(i18);
            int iF = nz0Var.f();
            if (i18 == i9) {
                j = 4294967295L;
                i7 = Integer.MIN_VALUE;
            } else {
                long jG = nz0Var.g(0);
                if (nz0Var.c()) {
                    j = 4294967295L;
                    j2 = jG & 4294967295L;
                } else {
                    j = 4294967295L;
                    j2 = jG >> 32;
                }
                i7 = (int) j2;
            }
            int size3 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((nz0) obj).getIndex() != i17) {
                    break;
                }
                i20++;
            }
            nz0 nz0Var2 = (nz0) obj;
            if (nz0Var2 != null) {
                long jG2 = nz0Var2.g(0);
                i8 = (int) (nz0Var2.c() ? jG2 & j : jG2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iF);
            }
            nz0Var.d();
            nz0Var.e(iMax, i4, i5);
            arrayList2.add(nz0Var);
            i16++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static final vj0 j(vj0 vj0Var) {
        if (vj0Var == null) {
            vj0Var = null;
        }
        if (vj0Var != null) {
            return vj0Var;
        }
        hv.b("Inconsistent composition");
        qj.e();
        return null;
    }

    public static final int k(int i, fa1 fa1Var) {
        int i2 = fa1Var.g - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = fa1Var.e;
            int i5 = ((ds0) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((ds0) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final yr1 l(jw0 jw0Var) {
        jw0 jw0VarK = jw0Var.k();
        return jw0VarK != null ? jw0VarK.K(jw0Var, true) : new yr1(0.0f, 0.0f, (int) (jw0Var.P() >> 32), (int) (jw0Var.P() & 4294967295L));
    }

    public static final yr1 m(jw0 jw0Var, boolean z) {
        jw0 jw0VarA = A(jw0Var);
        float fP = (int) (jw0VarA.P() >> 32);
        float fP2 = (int) (jw0VarA.P() & 4294967295L);
        yr1 yr1VarK = jw0VarA.K(jw0Var, z);
        float f = yr1VarK.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fP) {
                f = fP;
            }
        }
        float f2 = yr1VarK.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fP2) {
                f2 = fP2;
            }
        }
        float f3 = yr1VarK.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fP) {
                fP = f3;
            }
            f3 = fP;
        }
        float f4 = yr1VarK.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fP2) {
                fP2 = f5;
            }
            f4 = fP2;
        }
        if (f == f3 || f2 == f4) {
            return yr1.e;
        }
        long jI = jw0VarA.i((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jI2 = jw0VarA.i((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jI3 = jw0VarA.i((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jI4 = jw0VarA.i((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jI4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jI3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jI & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jI2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jI4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jI3 & 4294967295L));
        return new yr1(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean n(wn1 wn1Var) {
        return (wn1Var.b() || wn1Var.h || !wn1Var.d) ? false : true;
    }

    public static final boolean o(wn1 wn1Var) {
        return !wn1Var.h && wn1Var.d;
    }

    public static final boolean p(wn1 wn1Var) {
        return (wn1Var.b() || !wn1Var.h || wn1Var.d) ? false : true;
    }

    public static final boolean q(wn1 wn1Var) {
        return wn1Var.h && !wn1Var.d;
    }

    public static final void r(int i, int i2) {
        if (i < 0 || i >= i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
        }
    }

    public static final void s(int i, int i2) {
        if (i < 0 || i > i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
        }
    }

    public static final void t(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            qj.r(k3.h(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static final Object u(pe0 pe0Var, ij0 ij0Var, wa2 wa2Var) {
        int i = cf0.a;
        Object objA = vv.g(cf0.a(pe0Var, new bf0(ij0Var, (sx) null, 0)), 0).a(ue1.e, wa2Var);
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        if (objA != fzVar) {
            objA = ll2Var;
        }
        return objA == fzVar ? objA : ll2Var;
    }

    public static final xc1 v(s12 s12Var, Map map) {
        Object next;
        xc1 xc1Var;
        boolean zEquals;
        Iterator it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            nv0 nv0Var = (nv0) next;
            s12Var.getClass();
            nv0Var.getClass();
            if (s12Var.h() != nv0Var.a.a.c()) {
                zEquals = false;
            } else {
                mv0 mv0VarP = c22.p(vs0.D, nv0Var);
                if (mv0VarP == null) {
                    qj.h(s12Var.b(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.", "Cannot find KSerializer for [");
                    return null;
                }
                zEquals = s12Var.equals(mv0VarP.c());
            }
        } while (!zEquals);
        nv0 nv0Var2 = (nv0) next;
        xc1 zr0Var = nv0Var2 != null ? (xc1) map.get(nv0Var2) : null;
        if (zr0Var == null) {
            zr0Var = null;
        }
        al2 al2Var = al2.r;
        if (zr0Var == null) {
            s12Var.getClass();
            switch (qx.b0(s12Var).ordinal()) {
                case 0:
                    xc1Var = xc1.b;
                    zr0Var = xc1Var;
                    break;
                case 1:
                    xc1Var = sv0.o;
                    zr0Var = xc1Var;
                    break;
                case 2:
                    xc1Var = xc1.k;
                    zr0Var = xc1Var;
                    break;
                case 3:
                    xc1Var = sv0.p;
                    zr0Var = xc1Var;
                    break;
                case 4:
                    xc1Var = sv0.q;
                    zr0Var = xc1Var;
                    break;
                case 5:
                    xc1Var = sv0.r;
                    zr0Var = xc1Var;
                    break;
                case 6:
                    xc1Var = xc1.h;
                    zr0Var = xc1Var;
                    break;
                case 7:
                    xc1Var = sv0.s;
                    zr0Var = xc1Var;
                    break;
                case 8:
                    xc1Var = xc1.e;
                    zr0Var = xc1Var;
                    break;
                case 9:
                    xc1Var = sv0.t;
                    zr0Var = xc1Var;
                    break;
                case 10:
                    xc1Var = sv0.u;
                    zr0Var = xc1Var;
                    break;
                case 11:
                    xc1Var = xc1.n;
                    zr0Var = xc1Var;
                    break;
                case 12:
                    xc1Var = xc1.c;
                    zr0Var = xc1Var;
                    break;
                case 13:
                    xc1Var = xc1.l;
                    zr0Var = xc1Var;
                    break;
                case 14:
                    xc1Var = sv0.x;
                    zr0Var = xc1Var;
                    break;
                case 15:
                    xc1Var = xc1.i;
                    zr0Var = xc1Var;
                    break;
                case 16:
                    xc1Var = xc1.f;
                    zr0Var = xc1Var;
                    break;
                case 17:
                    int iOrdinal = qx.b0(s12Var.j(0)).ordinal();
                    if (iOrdinal == 10) {
                        xc1Var = xc1.o;
                    } else if (iOrdinal != 11) {
                        zr0Var = al2Var;
                    } else {
                        xc1Var = sv0.v;
                    }
                    zr0Var = xc1Var;
                    break;
                case 18:
                    int iOrdinal2 = qx.b0(s12Var.j(0)).ordinal();
                    if (iOrdinal2 == 0) {
                        xc1Var = xc1.d;
                    } else if (iOrdinal2 == 2) {
                        xc1Var = xc1.m;
                    } else if (iOrdinal2 == 4) {
                        xc1Var = sv0.y;
                    } else if (iOrdinal2 == 6) {
                        xc1Var = xc1.j;
                    } else if (iOrdinal2 == 8) {
                        xc1Var = xc1.g;
                    } else if (iOrdinal2 == 19) {
                        zr0Var = new zr0(ux.s(s12Var.j(0)));
                    } else if (iOrdinal2 == 10) {
                        xc1Var = xc1.p;
                    } else if (iOrdinal2 != 11) {
                        zr0Var = al2Var;
                    } else {
                        xc1Var = sv0.w;
                    }
                    zr0Var = xc1Var;
                    break;
                case 19:
                    Class clsS = ux.s(s12Var);
                    if (Parcelable.class.isAssignableFrom(clsS)) {
                        zr0Var = new vc1(clsS);
                    } else if (Enum.class.isAssignableFrom(clsS)) {
                        zr0Var = new uc1(clsS);
                    } else {
                        zr0Var = Serializable.class.isAssignableFrom(clsS) ? new wc1(clsS) : null;
                    }
                    if (zr0Var == null) {
                        zr0Var = al2Var;
                    }
                    break;
                case 20:
                    Class clsS2 = ux.s(s12Var);
                    zr0Var = !Enum.class.isAssignableFrom(clsS2) ? al2Var : new as0(clsS2);
                    break;
                default:
                    zr0Var = al2Var;
                    break;
            }
        }
        if (zr0Var.equals(al2Var)) {
            return null;
        }
        return zr0Var;
    }

    public static rw w(int i) {
        if (i != 0) {
            return i != 1 ? new lv1() : new tz();
        }
        return new lv1();
    }

    public static final lg0 x(Context context) {
        return new lg0(new b7(context, 0), new c7(Build.VERSION.SDK_INT >= 31 ? mh0.a.a(context) : 0));
    }

    public static final hm0 y(co2 co2Var, ak0 ak0Var) {
        if (!(co2Var instanceof zl0)) {
            ak0Var.W(-1968008324);
            ak0Var.p(false);
            return null;
        }
        ak0Var.W(-1968186822);
        Context baseContext = (Context) ak0Var.j(u5.b);
        yn2 yn2VarE = ((zl0) co2Var).e();
        baseContext.getClass();
        yn2VarE.getClass();
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof bt) {
                xz xzVar = (xz) ((fm0) ux.q((bt) baseContext, fm0.class));
                hm0 hm0Var = new hm0(xzVar.a(), yn2VarE, new ao2(xzVar.a, xzVar.b));
                ak0Var.p(false);
                return hm0Var;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            baseContext.getClass();
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + baseContext);
    }

    public static final void z(f11 f11Var) {
        cf2 cf2Var = f11Var.e;
        if (cf2Var != null) {
            f11Var.v.h(te2.a((te2) f11Var.d.f, null, 0L, 3));
            ye2 ye2Var = cf2Var.a;
            AtomicReference atomicReference = ye2Var.b;
            while (!atomicReference.compareAndSet(cf2Var, null)) {
                if (atomicReference.get() != cf2Var) {
                }
            }
            ye2Var.a.f();
        }
        f11Var.e = null;
    }
}

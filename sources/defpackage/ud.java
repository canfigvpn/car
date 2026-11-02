package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ud {
    public static volatile ud e;
    public static final Object f = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public ud(int i) {
        this.a = i;
        int i2 = 20;
        switch (i) {
            case 2:
                this.b = new e51(16);
                long[] jArr = jx1.a;
                this.c = new w91();
                this.d = new iq1(i2);
                break;
            case 4:
                this.b = new ao2(14, (byte) 0);
                this.c = new ao2(14, (byte) 0);
                this.d = new ao2(14, (byte) 0);
                break;
            case 6:
                this.b = new w91();
                break;
            case 13:
                long[] jArr2 = jx1.a;
                this.b = new w91();
                break;
            case 15:
                this.b = new AtomicReference(ir2.S);
                this.c = new Object();
                break;
            case 18:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                break;
            default:
                this.d = new iq1(i2);
                break;
        }
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z) {
        ak2[] ak2VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (ak2VarArr = (ak2[]) editable.getSpans(selectionStart, selectionEnd, ak2.class)) != null && ak2VarArr.length > 0) {
                for (ak2 ak2Var : ak2VarArr) {
                    int spanStart = editable.getSpanStart(ak2Var);
                    int spanEnd = editable.getSpanEnd(ak2Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ud j(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new ud(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static boolean n(ja0 ja0Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                ak2[] ak2VarArr = (ak2[]) editable.getSpans(selectionStart, iMin, ak2.class);
                if (ak2VarArr != null && ak2VarArr.length > 0) {
                    for (ak2 ak2Var : ak2VarArr) {
                        int spanStart = editable.getSpanStart(ak2Var);
                        int spanEnd = editable.getSpanEnd(ak2Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    ja0Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    ja0Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public void A() {
        w91 w91Var = (w91) this.b;
        String str = (String) this.c;
        List list = (List) w91Var.k(str);
        if (list != null) {
            list.remove((ti0) this.d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        w91Var.m(str, list);
    }

    public void a(ax0 ax0Var, dt0 dt0Var) {
        ao2 ao2Var = (ao2) this.b;
        ao2 ao2Var2 = (ao2) this.c;
        ao2 ao2Var3 = (ao2) this.d;
        int iOrdinal = dt0Var.ordinal();
        if (iOrdinal == 0) {
            ao2Var.f(ax0Var);
            ao2Var3.f(ax0Var);
            return;
        }
        if (iOrdinal == 1) {
            ao2Var2.f(ax0Var);
            ao2Var3.f(ax0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (ax0Var.l != null) {
                ao2Var3.f(ax0Var);
                return;
            } else {
                ao2Var.f(ax0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            qj.p();
        } else if (ax0Var.l != null) {
            ao2Var3.f(ax0Var);
        } else {
            ao2Var2.f(ax0Var);
        }
    }

    public boolean b(ax0 ax0Var) {
        return !(ax0Var.l == null) && (((p72) ((ao2) this.b).f).contains(ax0Var) || ((p72) ((ao2) this.c).f).contains(ax0Var));
    }

    public void d(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pp0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new ps(e2);
            }
        }
    }

    public Object e(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.b;
        if (r02.m()) {
            try {
                r02.g(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                pp0 pp0Var = (pp0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = pp0Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            e(cls2, hashSet);
                        }
                    }
                }
                objB = pp0Var.b((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new ps(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public Object f() {
        long jD = y12.d();
        if (jD == ng2.a) {
            return this.d;
        }
        kg2 kg2Var = (kg2) ((AtomicReference) this.b).get();
        int iA = kg2Var.a(jD);
        if (iA >= 0) {
            return kg2Var.c[iA];
        }
        return null;
    }

    public sm g() {
        return ((um) this.d).e.c;
    }

    public q31 h() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((iq1) this.d)) {
            try {
                q31 q31Var = (q31) this.c;
                if (q31Var != null && localeList == ((LocaleList) this.b)) {
                    return q31Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new p31(localeList.get(i)));
                }
                q31 q31Var2 = new q31(arrayList);
                this.b = localeList;
                this.c = q31Var2;
                return q31Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Typeface i(int i, int i2, uc ucVar) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.d;
        ThreadLocal threadLocal = qt1.a;
        if (context.isRestricted()) {
            return null;
        }
        return qt1.a(context, resourceId, typedValue2, i2, ucVar, true);
    }

    public zv0 k() {
        zv0 zv0Var = (zv0) this.c;
        if (zv0Var != null) {
            return zv0Var;
        }
        ws0.U("keyboardActions");
        throw null;
    }

    public lr0 l() {
        Matcher matcher = (Matcher) this.b;
        return ex.S(matcher.start(), matcher.end());
    }

    public long m() {
        return ((um) this.d).e.d;
    }

    public boolean o(CharSequence charSequence, int i, int i2, zj2 zj2Var) {
        if ((zj2Var.c & 3) == 0) {
            y20 y20Var = (y20) this.d;
            j71 j71VarB = zj2Var.b();
            int iA = j71VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) j71VarB.h).getShort(iA + j71VarB.e);
            }
            y20Var.getClass();
            ThreadLocal threadLocal = y20.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = y20Var.a.hasGlyph(sb.toString());
            int i3 = zj2Var.c & 4;
            zj2Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (zj2Var.c & 3) == 2;
    }

    public boolean p() {
        return !(((p72) ((ao2) this.b).f).isEmpty() && ((p72) ((ao2) this.d).f).isEmpty() && ((p72) ((ao2) this.c).f).isEmpty());
    }

    public boolean q() {
        if (((p82) this.b).getValue() != this.d) {
            return true;
        }
        ud udVar = (ud) this.c;
        return udVar != null && udVar.q();
    }

    public ud r() {
        CharSequence charSequence = (CharSequence) this.c;
        Matcher matcher = (Matcher) this.b;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return rw.t(matcher2, iEnd, charSequence);
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z, na0 na0Var) {
        int i4;
        char c;
        qa0 qa0Var = new qa0((l71) ((e4) this.c).g);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zB = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zB) {
                    l71 l71Var = (l71) qa0Var.c.a.get(iCodePointAt);
                    if (qa0Var.a == 2) {
                        if (l71Var != null) {
                            qa0Var.c = l71Var;
                            qa0Var.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                qa0Var.a();
                            } else if (iCodePointAt != 65039) {
                                l71 l71Var2 = qa0Var.c;
                                if (l71Var2.b != null) {
                                    if (qa0Var.f != 1) {
                                        qa0Var.d = l71Var2;
                                        qa0Var.a();
                                    } else if (qa0Var.b()) {
                                        qa0Var.d = qa0Var.c;
                                        qa0Var.a();
                                    } else {
                                        qa0Var.a();
                                    }
                                    c = 3;
                                } else {
                                    qa0Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (l71Var == null) {
                        qa0Var.a();
                        c = 1;
                    } else {
                        qa0Var.a = 2;
                        qa0Var.c = l71Var;
                        qa0Var.f = 1;
                        c = 2;
                    }
                    qa0Var.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && o(charSequence, i4, iCharCount, qa0Var.d.b)) {
                            break;
                        }
                        zB = na0Var.b(charSequence, i4, iCharCount, qa0Var.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (qa0Var.a == 2 && qa0Var.c.b != null && ((qa0Var.f > 1 || qa0Var.b()) && i5 < i3 && zB && (z || !o(charSequence, i4, iCharCount, qa0Var.c.b)))) {
            na0Var.b(charSequence, i4, iCharCount, qa0Var.c.b);
        }
        return na0Var.a();
    }

    public void t() {
        ((TypedArray) this.b).recycle();
    }

    public String toString() {
        switch (this.a) {
            case 11:
                String str = (String) this.d;
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        l72 l72Var;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            k();
        } else if (i != 1 && i != 0) {
            fu1.h("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            sf0 sf0Var = (sf0) this.d;
            if (sf0Var != null) {
                ((vf0) sf0Var).g(1, true);
                return true;
            }
            ws0.U("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (l72Var = (l72) this.b) == null) {
                return false;
            }
            ((e40) l72Var).a();
            return true;
        }
        sf0 sf0Var2 = (sf0) this.d;
        if (sf0Var2 != null) {
            ((vf0) sf0Var2).g(2, true);
            return true;
        }
        ws0.U("focusManager");
        throw null;
    }

    public void v(Object obj) {
        long jD = y12.d();
        if (jD == ng2.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            kg2 kg2Var = (kg2) ((AtomicReference) this.b).get();
            int iA = kg2Var.a(jD);
            if (iA < 0) {
                ((AtomicReference) this.b).set(kg2Var.b(jD, obj));
            } else {
                kg2Var.c[iA] = obj;
            }
        }
    }

    public void w(sm smVar) {
        ((um) this.d).e.c = smVar;
    }

    public void x(m40 m40Var) {
        ((um) this.d).e.a = m40Var;
    }

    public void y(kw0 kw0Var) {
        ((um) this.d).e.b = kw0Var;
    }

    public void z(long j) {
        ((um) this.d).e.d = j;
    }

    public ud(mr1 mr1Var) {
        this.a = 12;
        this.b = new ff(0);
        this.c = new xf();
        this.d = new n1(28, this, mr1Var);
    }

    public /* synthetic */ ud(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ud(l72 l72Var) {
        this.a = 8;
        this.b = l72Var;
    }

    public ud(View view) {
        this.a = 7;
        this.b = view;
        this.c = vv.F(v01.f, new h8(5, this));
        this.d = new qk1(view);
    }

    public ud(um umVar) {
        this.a = 3;
        this.d = umVar;
        this.b = new ao2(6, this);
    }

    public ud(Context context, TypedArray typedArray) {
        this.a = 16;
        this.d = context;
        this.b = typedArray;
    }

    public ud(Context context) {
        this.a = 0;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public ud(e4 e4Var, w40 w40Var, y20 y20Var, Set set) {
        this.a = 5;
        this.b = w40Var;
        this.c = e4Var;
        this.d = y20Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new pa0(str, 0));
        }
    }

    public ud(ek2 ek2Var, ud udVar) {
        this.a = 17;
        this.b = ek2Var;
        this.c = udVar;
        this.d = ek2Var.getValue();
    }

    public ud(Matcher matcher, CharSequence charSequence) {
        this.a = 9;
        this.b = matcher;
        this.c = charSequence;
        this.d = new k61(0, this);
    }
}

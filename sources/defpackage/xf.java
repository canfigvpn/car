package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xf implements uj1, rx0 {
    public final Object e;
    public Object f;
    public final Object g;
    public Object h;
    public Object i;

    public xf(yb ybVar, vf2 vf2Var, List list, m40 m40Var, jg0 jg0Var) {
        int i;
        yb ybVar2 = ybVar;
        vf2 vf2Var2 = vf2Var;
        this.e = ybVar2;
        this.f = list;
        final int i2 = 0;
        ti0 ti0Var = new ti0(this) { // from class: u81
            public final /* synthetic */ xf f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i3 = i2;
                Object obj = null;
                int i4 = 1;
                xf xfVar = this.f;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xfVar.i;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((tj1) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float fA2 = ((tj1) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        tj1 tj1Var = (tj1) obj;
                        return Float.valueOf(tj1Var != null ? tj1Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xfVar.i;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((tj1) obj4).a.m.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i4);
                                    float fC2 = ((tj1) obj5).a.m.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        tj1 tj1Var2 = (tj1) obj;
                        return Float.valueOf(tj1Var2 != null ? tj1Var2.a.m.c() : 0.0f);
                }
            }
        };
        v01 v01Var = v01.f;
        this.g = vv.F(v01Var, ti0Var);
        final int i3 = 1;
        this.h = vv.F(v01Var, new ti0(this) { // from class: u81
            public final /* synthetic */ xf f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                xf xfVar = this.f;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xfVar.i;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((tj1) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((tj1) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        tj1 tj1Var = (tj1) obj;
                        return Float.valueOf(tj1Var != null ? tj1Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xfVar.i;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((tj1) obj4).a.m.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((tj1) obj5).a.m.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        tj1 tj1Var2 = (tj1) obj;
                        return Float.valueOf(tj1Var2 != null ? tj1Var2.a.m.c() : 0.0f);
                }
            }
        });
        wj1 wj1Var = vf2Var2.b;
        yb ybVar3 = zb.a;
        ArrayList arrayList = ybVar2.h;
        String str = ybVar2.f;
        cb0 cb0Var = cb0.e;
        List listD0 = arrayList != null ? vq.d0(arrayList, new dg0(6)) : cb0Var;
        ArrayList arrayList2 = new ArrayList();
        le leVar = new le();
        int size = listD0.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            xb xbVar = (xb) listD0.get(i4);
            wj1 wj1VarA = wj1Var.a((wj1) xbVar.a);
            int i6 = xbVar.b;
            int i7 = xbVar.c;
            if (i6 > i7) {
                wp0.a("Reversed range is not supported");
            }
            while (i5 < i6 && !leVar.isEmpty()) {
                xb xbVar2 = (xb) leVar.last();
                listD0 = listD0;
                int i8 = xbVar2.c;
                cb0Var = cb0Var;
                Object obj = xbVar2.a;
                if (i6 < i8) {
                    arrayList2.add(new xb(i5, i6, obj));
                    i5 = i6;
                } else {
                    int i9 = size;
                    arrayList2.add(new xb(i5, i8, obj));
                    i5 = xbVar2.c;
                    while (!leVar.isEmpty() && i5 == ((xb) leVar.last()).c) {
                        leVar.removeLast();
                    }
                    size = i9;
                }
            }
            List list2 = listD0;
            cb0 cb0Var2 = cb0Var;
            int i10 = size;
            if (i5 < i6) {
                arrayList2.add(new xb(i5, i6, wj1Var));
                i5 = i6;
            }
            xb xbVar3 = (xb) leVar.g();
            if (xbVar3 != null) {
                int i11 = xbVar3.c;
                Object obj2 = xbVar3.a;
                int i12 = xbVar3.b;
                if (i12 == i6 && i11 == i7) {
                    leVar.removeLast();
                    leVar.addLast(new xb(i6, i7, ((wj1) obj2).a(wj1VarA)));
                } else if (i12 == i11) {
                    arrayList2.add(new xb(i12, i11, obj2));
                    leVar.removeLast();
                    leVar.addLast(new xb(i6, i7, wj1VarA));
                } else {
                    if (i11 < i7) {
                        throw new IllegalArgumentException();
                    }
                    leVar.addLast(new xb(i6, i7, ((wj1) obj2).a(wj1VarA)));
                }
            } else {
                leVar.addLast(new xb(i6, i7, wj1VarA));
            }
            i4++;
            listD0 = list2;
            cb0Var = cb0Var2;
            size = i10;
        }
        cb0 cb0Var3 = cb0Var;
        while (i5 <= str.length() && !leVar.isEmpty()) {
            xb xbVar4 = (xb) leVar.last();
            Object obj3 = xbVar4.a;
            int i13 = xbVar4.c;
            arrayList2.add(new xb(i5, i13, obj3));
            while (!leVar.isEmpty() && i13 == ((xb) leVar.last()).c) {
                leVar.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new xb(i5, str.length(), wj1Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new xb(0, 0, wj1Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i14 = i;
        for (int size2 = arrayList2.size(); i14 < size2; size2 = size2) {
            xb xbVar5 = (xb) arrayList2.get(i14);
            int i15 = xbVar5.b;
            int i16 = xbVar5.c;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listA = zb.a(ybVar2, i15, i16, new s1(4));
            yb ybVar4 = new yb(strSubstring, listA == null ? cb0Var3 : listA);
            wj1 wj1Var2 = (wj1) xbVar5.a;
            if (wj1Var2.b == 0) {
                wj1Var2 = new wj1(wj1Var2.a, wj1Var.b, wj1Var2.c, wj1Var2.d, wj1Var2.e, wj1Var2.f, wj1Var2.g, wj1Var2.h, wj1Var2.i);
            }
            vf2 vf2Var3 = new vf2(vf2Var2.a, wj1Var.a(wj1Var2));
            List list3 = ybVar4.e;
            List list4 = list3 == null ? cb0Var3 : list3;
            List list5 = (List) this.f;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i17 = 0;
            while (i17 < size3) {
                xb xbVar6 = (xb) list5.get(i17);
                int i18 = xbVar6.b;
                wj1 wj1Var3 = wj1Var;
                int i19 = xbVar6.c;
                if (zb.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        wp0.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new xb(i18 - i15, i19 - i15, xbVar6.a));
                }
                i17++;
                list5 = list5;
                wj1Var = wj1Var3;
            }
            arrayList3.add(new tj1(new c8(strSubstring, vf2Var3, list4, arrayList4, jg0Var, m40Var), i15, i16));
            i14++;
            ybVar2 = ybVar;
            vf2Var2 = vf2Var;
            str = str;
        }
        this.i = arrayList3;
    }

    @Override // defpackage.uj1
    public float a() {
        return ((Number) ((rx0) this.g).getValue()).floatValue();
    }

    @Override // defpackage.uj1
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((tj1) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uj1
    public float c() {
        return ((Number) ((rx0) this.h).getValue()).floatValue();
    }

    public pm d(wf wfVar, ti0 ti0Var) {
        int i;
        int i2;
        int i3;
        es1 es1Var = new es1();
        es1Var.e = -1;
        synchronized (this.e) {
            Throwable th = (Throwable) this.f;
            if (th != null) {
                wfVar.b(th);
                return q90.x;
            }
            ff ffVar = (ff) this.g;
            do {
                i = ffVar.get();
                i2 = i + 1;
            } while (!ffVar.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            es1Var.e = (i2 >>> 27) & 15;
            ((p91) this.h).a(wfVar);
            if (z) {
                try {
                    ti0Var.a();
                } catch (Throwable th2) {
                    synchronized (this.e) {
                        try {
                            if (((Throwable) this.f) == null) {
                                this.f = th2;
                                p91 p91Var = (p91) this.h;
                                Object[] objArr = p91Var.a;
                                int i5 = p91Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((wf) objArr[i6]).b(th2);
                                }
                                ((p91) this.h).d();
                                ff ffVar2 = (ff) this.g;
                                do {
                                    i3 = ffVar2.get();
                                } while (!ffVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new dq0(new vf(wfVar, this, es1Var, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi e(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        ArrayList arrayList2 = (ArrayList) this.g;
        boolean[] zArr = (boolean[]) this.h;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.i;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(j(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.i;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.i = cArr2;
        return bidi;
    }

    public void f(ej0 ej0Var) {
        int i;
        synchronized (this.e) {
            try {
                p91 p91Var = (p91) this.h;
                this.h = (p91) this.i;
                this.i = p91Var;
                ff ffVar = (ff) this.g;
                do {
                    i = ffVar.get();
                } while (!ffVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = p91Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ej0Var.h(p91Var.f(i3));
                }
                p91Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float g(int i, boolean z) {
        Layout layout = (Layout) this.e;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    @Override // defpackage.rx0
    public Object getValue() {
        un2 un2Var = (un2) this.i;
        if (un2Var != null) {
            return un2Var;
        }
        bo2 bo2Var = (bo2) ((ti0) this.f).a();
        yn2 yn2Var = (yn2) ((ti0) this.g).a();
        lz lzVar = (lz) ((ti0) this.h).a();
        bo2Var.getClass();
        yn2Var.getClass();
        lzVar.getClass();
        e4 e4Var = new e4(bo2Var, yn2Var, lzVar);
        aq aqVar = (aq) this.e;
        String strB = aqVar.b();
        if (strB == null) {
            qj.r("Local and anonymous classes can not be ViewModels");
            return null;
        }
        un2 un2VarJ = e4Var.j(aqVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.i = un2VarJ;
        return un2VarJ;
    }

    public float h(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.e;
        if (!z2) {
            return g(i, z);
        }
        int iU = ux.u(layout, i, z2);
        int lineStart = layout.getLineStart(iU);
        int lineEnd = layout.getLineEnd(iU);
        if (i != lineStart && i != lineEnd) {
            return g(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return g(i, z);
        }
        int i4 = i(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(j(i4))) == -1;
        int iK = k(lineEnd, lineStart);
        int iJ = j(i4);
        int i5 = lineStart - iJ;
        int i6 = iK - iJ;
        Bidi bidiE = e(i4);
        Bidi bidiCreateLineBidi = bidiE != null ? bidiE.createLineBidi(i5, i6) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iU) : layout.getLineRight(iU);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        mw0[] mw0VarArr = new mw0[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            mw0VarArr[i7] = new mw0(bidiCreateLineBidi.getRunStart(i7) + lineStart, bidiCreateLineBidi.getRunLimit(i7) + lineStart, bidiCreateLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) bidiCreateLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, mw0VarArr, 0, runCount);
        if (i == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (mw0VarArr[i9].a == i) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == mw0VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iU);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(mw0VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(mw0VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iU);
        }
        int iK2 = i > iK ? k(i, lineStart) : i;
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                i2 = -1;
                break;
            }
            if (mw0VarArr[i10].b == iK2) {
                i2 = i10;
                break;
            }
            i10++;
        }
        boolean z5 = (z || z3 == mw0VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iU);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(mw0VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(mw0VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iU);
    }

    public int i(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.f;
        Integer numValueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        vs0.B(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int iD = s5.D((Comparable) arrayList.get(i2), numValueOf);
            if (iD >= 0) {
                if (iD <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        int i5 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z && i5 > 0) {
            int i6 = i5 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                return i6;
            }
        }
        return i5;
    }

    public int j(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f).get(i - 1)).intValue();
    }

    public int k(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.e).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((ws0.n(cCharAt, 8192) < 0 || ws0.n(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void l(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.e).put(str, obj);
        s82 s82Var = (s82) ((LinkedHashMap) this.g).get(str);
        if (s82Var != null) {
            s82Var.i(obj);
        }
        s82 s82Var2 = (s82) ((LinkedHashMap) this.h).get(str);
        if (s82Var2 != null) {
            s82Var2.i(obj);
        }
    }

    public xf() {
        this.e = new Object();
        this.g = new ff(0);
        this.h = new p91();
        this.i = new p91();
    }

    public xf(Layout layout) {
        this.e = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iG = h92.G(((Layout) this.e).getText(), '\n', length, 4);
            length = iG < 0 ? ((Layout) this.e).getText().length() : iG + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.e).getText().length());
        this.f = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.g = arrayList2;
        this.h = new boolean[((ArrayList) this.f).size()];
        ((ArrayList) this.f).size();
    }

    public xf(aq aqVar, ti0 ti0Var, ti0 ti0Var2, ti0 ti0Var3) {
        this.e = aqVar;
        this.f = ti0Var;
        this.g = ti0Var2;
        this.h = ti0Var3;
    }

    public xf(Map map) {
        map.getClass();
        this.e = new LinkedHashMap(map);
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new us(2, this);
    }
}

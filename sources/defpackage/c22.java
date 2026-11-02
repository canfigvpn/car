package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c22 {
    public static final mc2 a(b40 b40Var) {
        zc2 zc2Var;
        kc2 kc2Var = new kc2();
        p12.m(b40Var, oc2.a, new tr1(new tr1(13, kc2Var), new f(1, kc2Var, kc2.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 23)));
        p91 p91Var = new p91();
        p91 p91Var2 = kc2Var.a;
        Object[] objArr = p91Var2.a;
        int i = p91Var2.b;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        lc2 lc2Var = null;
        while (true) {
            zc2Var = zc2.b;
            if (i3 >= i) {
                break;
            }
            lc2 lc2Var2 = (lc2) objArr[i3];
            if (!z || lc2Var2 != zc2Var) {
                if (lc2Var2 == zc2Var && lc2Var == zc2Var) {
                    z = false;
                } else {
                    if (lc2Var2 != zc2Var) {
                        p91 p91Var3 = kc2Var.b;
                        Object[] objArr2 = p91Var3.a;
                        int i4 = p91Var3.b;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                if (((Boolean) ((ej0) objArr2[i5]).h(lc2Var2)).booleanValue()) {
                                    i5++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    p91Var.a(lc2Var2);
                    z = false;
                    lc2Var = lc2Var2;
                }
            }
            i3++;
        }
        if (((lc2) (p91Var.h() ? null : p91Var.a[p91Var.b - 1])) == zc2Var) {
            p91Var.k(p91Var.b - 1);
        }
        n91 n91Var = p91Var.c;
        if (n91Var == null) {
            n91Var = new n91(i2, p91Var);
            p91Var.c = n91Var;
        }
        return new mc2(n91Var);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ud] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static final int c(String str, int i) {
        ?? r5;
        ?? r6;
        int spanEnd;
        ca0 ca0VarG = g();
        Integer num = null;
        if (ca0VarG != null) {
            if (!(ca0VarG.c() == 1)) {
                fu1.h("Not initialized yet");
                return 0;
            }
            mx.q(str, "charSequence cannot be null");
            ?? r4 = ca0VarG.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                ak2[] ak2VarArr = (ak2[]) spanned.getSpans(i, i + 1, ak2.class);
                if (ak2VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(ak2VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((oa0) r4.s(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new oa0(i))).g;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((oa0) r4.s(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new oa0(i))).g;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int d(String str, int i) {
        ca0 ca0VarG = g();
        Integer num = null;
        if (ca0VarG != null) {
            Integer numValueOf = Integer.valueOf(ca0VarG.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final y11 e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            y11 y11Var = tag instanceof y11 ? (y11) tag : null;
            if (y11Var != null) {
                return y11Var;
            }
            Object objL = y12.l(view);
            view = objL instanceof View ? (View) objL : null;
        }
        return null;
    }

    public static final float f(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final ca0 g() {
        if (!ca0.d()) {
            return null;
        }
        ca0 ca0VarA = ca0.a();
        if (ca0VarA.c() == 1) {
            return ca0VarA;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int h(ff2 ff2Var, Layout layout, xf xfVar, int i, RectF rectF, hz1 hz1Var, x7 x7Var, boolean z) {
        mw0[] mw0VarArr;
        mw0[] mw0VarArr2;
        int i2;
        int iB;
        int i3;
        int i4;
        int iA;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = ff2Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = ff2Var.f(i);
        if (i5 < (iF - lineStart2) * 2) {
            wp0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        pn0 pn0Var = new pn0(ff2Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = pn0Var.a(lineStart2, z2, z2, true);
                fA3 = pn0Var.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = pn0Var.a(lineStart2, false, false, false);
                fA = pn0Var.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = pn0Var.a(lineStart2, false, false, true);
                    fA = pn0Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = pn0Var.a(lineStart2, false, false, false);
                    fA2 = pn0Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) xfVar.e;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int i7 = xfVar.i(lineStart3, false);
        int iJ = xfVar.j(i7);
        int i8 = lineStart3 - iJ;
        int i9 = lineEnd2 - iJ;
        Bidi bidiE = xfVar.e(i7);
        if (bidiE == null || (bidiCreateLineBidi = bidiE.createLineBidi(i8, i9)) == null) {
            mw0VarArr = new mw0[]{new mw0(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            mw0VarArr = new mw0[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                mw0VarArr[i10] = new mw0(bidiCreateLineBidi.getRunStart(i10) + lineStart3, bidiCreateLineBidi.getRunLimit(i10) + lineStart3, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        jr0 lr0Var = z ? new lr0(0, mw0VarArr.length - 1, 1) : new jr0(mw0VarArr.length - 1, 0, -1);
        int i12 = lr0Var.e;
        int i13 = lr0Var.f;
        int i14 = lr0Var.g;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            mw0 mw0Var = mw0VarArr[i12];
            boolean z4 = mw0Var.c;
            int iD = mw0Var.a;
            int iE = mw0Var.b;
            float f = z4 ? fArr[((iE - 1) - lineStart) * 2] : fArr[(iD - lineStart) * 2];
            float f2 = z4 ? f(iD, lineStart, fArr) : f(iE - 1, lineStart, fArr);
            float f3 = rectF.left;
            int i15 = i14;
            if (!z) {
                mw0VarArr2 = mw0VarArr;
                if (f2 < f3) {
                    iE = -1;
                    break;
                }
                float f4 = rectF.right;
                if (f <= f4) {
                    if ((z4 || f4 < f2) && (!z4 || f3 > f)) {
                        int i16 = iE;
                        int i17 = iD;
                        while (i16 - i17 > 1) {
                            int i18 = (i16 + i17) / 2;
                            float f5 = fArr[(i18 - lineStart) * 2];
                            int i19 = i16;
                            if ((z4 || f5 <= rectF.right) && (!z4 || f5 >= rectF.left)) {
                                i16 = i19;
                                i17 = i18;
                            } else {
                                i16 = i18;
                            }
                        }
                        i2 = z4 ? i16 : i17;
                    } else {
                        i2 = iE - 1;
                    }
                    int iA2 = hz1Var.a(i2 + 1);
                    if (iA2 == -1 || (iB = hz1Var.b(iA2)) <= iD) {
                        iE = -1;
                        break;
                    }
                    if (iA2 < iD) {
                        iA2 = iD;
                    }
                    if (iB <= iE) {
                        iE = iB;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iA3 = iA2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iE - 1) - lineStart) * 2] : fArr[(iA3 - lineStart) * 2];
                        rectF2.right = z4 ? f(iA3, lineStart, fArr) : f(iE - 1, lineStart, fArr);
                        if (((Boolean) x7Var.g(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iE = hz1Var.e(iE);
                        if (iE == -1 || iE <= iD) {
                            iE = -1;
                            break;
                        }
                        iA3 = hz1Var.a(iE);
                        if (iA3 < iD) {
                            iA3 = iD;
                        }
                    }
                } else {
                    iE = -1;
                    break;
                }
                iD = iE;
            } else {
                if (f2 < f3) {
                    mw0VarArr2 = mw0VarArr;
                    iD = -1;
                    break;
                }
                float f6 = rectF.right;
                if (f <= f6) {
                    if ((z4 || f3 > f) && (!z4 || f6 < f2)) {
                        int i20 = iE;
                        int i21 = iD;
                        while (true) {
                            i3 = i20;
                            if (i20 - i21 <= 1) {
                                break;
                            }
                            int i22 = (i3 + i21) / 2;
                            float f7 = fArr[(i22 - lineStart) * 2];
                            if ((z4 || f7 <= rectF.left) && (!z4 || f7 >= rectF.right)) {
                                i20 = i3;
                                i21 = i22;
                            } else {
                                i20 = i22;
                            }
                        }
                        i4 = z4 ? i3 : i21;
                    } else {
                        i4 = iD;
                    }
                    int iB2 = hz1Var.b(i4);
                    if (iB2 != -1 && (iA = hz1Var.a(iB2)) < iE) {
                        if (iA >= iD) {
                            iD = iA;
                        }
                        if (iB2 > iE) {
                            iB2 = iE;
                        }
                        mw0VarArr2 = mw0VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iB3 = iB2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iB3 - 1) - lineStart) * 2] : fArr[(iD - lineStart) * 2];
                            rectF3.right = z4 ? f(iD, lineStart, fArr) : f(iB3 - 1, lineStart, fArr);
                            if (((Boolean) x7Var.g(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iD = hz1Var.d(iD);
                            if (iD != -1 && iD < iE) {
                                iB3 = hz1Var.b(iD);
                                if (iB3 > iE) {
                                    iB3 = iE;
                                }
                            }
                        }
                    } else {
                        mw0VarArr2 = mw0VarArr;
                    }
                    iD = -1;
                    break;
                } else {
                    mw0VarArr2 = mw0VarArr;
                    iD = -1;
                    break;
                }
            }
            if (iD >= 0) {
                return iD;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i15;
            i14 = i15;
            mw0VarArr = mw0VarArr2;
        }
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean j(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static List k(o52 o52Var, int i, o52 o52Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iT = o52Var.t(i);
        int i2 = i + iT;
        int iF = o52Var.f(o52Var.b, o52Var.q(i));
        int iF2 = o52Var.f(o52Var.b, o52Var.q(i2));
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (o52Var.b[(o52Var.q(i) * 5) + 1] & 201326592) != 0;
        o52Var2.v(iT);
        o52Var2.w(i3, o52Var2.t);
        if (o52Var.g < i2) {
            o52Var.A(i2);
        }
        if (o52Var.k < iF2) {
            o52Var.B(iF2, i2);
        }
        int[] iArr = o52Var2.b;
        int i4 = o52Var2.t;
        int i5 = i4 * 5;
        ve.u0(i5, i * 5, i2 * 5, o52Var.b, iArr);
        Object[] objArr = o52Var2.c;
        int i6 = o52Var2.i;
        System.arraycopy(o52Var.c, iF, objArr, i6, i3);
        int i7 = o52Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iT;
        int iF3 = i6 - o52Var2.f(iArr, i4);
        int i10 = o52Var2.m;
        int i11 = o52Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = o52.h(o52Var2.f(iArr, i13) + iF3, i12 < i13 ? 0 : o52Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        o52Var2.m = i12;
        int iB = n52.b(o52Var.d, i, o52Var.o());
        int iB2 = n52.b(o52Var.d, i2, o52Var.o());
        if (iB < iB2) {
            ArrayList arrayList = o52Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i15 = iB; i15 < iB2; i15++) {
                vj0 vj0Var = (vj0) arrayList.get(i15);
                vj0Var.a += i8;
                arrayList2.add(vj0Var);
            }
            o52Var2.d.addAll(n52.b(o52Var2.d, o52Var2.t, o52Var2.o()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = cb0.e;
        }
        if (!list.isEmpty()) {
            HashMap map = o52Var.e;
            HashMap map2 = o52Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = o52Var2.v;
        o52Var2.N(i7);
        int iD = o52Var.D(o52Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                o52Var.O();
                o52Var.a(iD - o52Var.t);
                o52Var.O();
            }
            o52Var.a(i - o52Var.t);
            boolean zG = o52Var.G();
            if (z7) {
                o52Var.L();
                o52Var.i();
                o52Var.L();
                o52Var.i();
            }
            z4 = zG;
        } else {
            boolean zH = o52Var.H(i, iT);
            o52Var.I(iF, i3, i - 1);
            z4 = zH;
        }
        if (z4) {
            hv.a("Unexpectedly removed anchors");
        }
        int i18 = o52Var2.o;
        int i19 = iArr3[i5 + 1];
        o52Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            o52Var2.t = i9;
            o52Var2.i = i6 + i3;
        }
        if (z6) {
            o52Var2.S(i7);
        }
        return list;
    }

    public static final mv0 l(aq aqVar, ArrayList arrayList, ti0 ti0Var) {
        mv0 meVar;
        mv0 hs1Var;
        mv0 kj2Var;
        if (aqVar.equals(js1.a(Collection.class)) || aqVar.equals(js1.a(List.class)) || aqVar.equals(js1.a(List.class)) || aqVar.equals(js1.a(ArrayList.class))) {
            meVar = new me((mv0) arrayList.get(0), 0);
        } else if (aqVar.equals(js1.a(HashSet.class))) {
            meVar = new me((mv0) arrayList.get(0), 1);
        } else if (aqVar.equals(js1.a(Set.class)) || aqVar.equals(js1.a(Set.class)) || aqVar.equals(js1.a(LinkedHashSet.class))) {
            meVar = new me((mv0) arrayList.get(0), 2);
        } else if (aqVar.equals(js1.a(HashMap.class))) {
            meVar = new bm0((mv0) arrayList.get(0), (mv0) arrayList.get(1), 0);
        } else if (aqVar.equals(js1.a(Map.class)) || aqVar.equals(js1.a(Map.class)) || aqVar.equals(js1.a(LinkedHashMap.class))) {
            meVar = new bm0((mv0) arrayList.get(0), (mv0) arrayList.get(1), 1);
        } else {
            if (aqVar.equals(js1.a(Map.Entry.class))) {
                mv0 mv0Var = (mv0) arrayList.get(0);
                mv0 mv0Var2 = (mv0) arrayList.get(1);
                mv0Var.getClass();
                mv0Var2.getClass();
                hs1Var = new d61(mv0Var, mv0Var2, 0);
            } else {
                if (aqVar.equals(js1.a(qj1.class))) {
                    mv0 mv0Var3 = (mv0) arrayList.get(0);
                    mv0 mv0Var4 = (mv0) arrayList.get(1);
                    mv0Var3.getClass();
                    mv0Var4.getClass();
                    kj2Var = new d61(mv0Var3, mv0Var4, 1);
                } else if (aqVar.equals(js1.a(jj2.class))) {
                    mv0 mv0Var5 = (mv0) arrayList.get(0);
                    mv0 mv0Var6 = (mv0) arrayList.get(1);
                    mv0 mv0Var7 = (mv0) arrayList.get(2);
                    mv0Var5.getClass();
                    mv0Var6.getClass();
                    mv0Var7.getClass();
                    kj2Var = new kj2(mv0Var5, mv0Var6, mv0Var7);
                } else if (vv.q(aqVar).isArray()) {
                    Object objA = ti0Var.a();
                    objA.getClass();
                    mv0 mv0Var8 = (mv0) arrayList.get(0);
                    mv0Var8.getClass();
                    hs1Var = new hs1((aq) objA, mv0Var8);
                } else {
                    meVar = null;
                }
                meVar = kj2Var;
            }
            meVar = hs1Var;
        }
        if (meVar != null) {
            return meVar;
        }
        mv0[] mv0VarArr = (mv0[]) arrayList.toArray(new mv0[0]);
        return ei1.k(aqVar, (mv0[]) Arrays.copyOf(mv0VarArr, mv0VarArr.length));
    }

    public static final mv0 m(aq aqVar) {
        aqVar.getClass();
        mv0 mv0VarO = o(aqVar);
        if (mv0VarO != null) {
            return mv0VarO;
        }
        ws0.Q(aqVar);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final mv0 n(iq1 iq1Var, nv0 nv0Var, boolean z) {
        mv0 mv0VarO;
        mv0 mv0VarL;
        aq aqVarF = ws0.F(nv0Var);
        nv0 nv0Var2 = nv0Var.a;
        boolean zC = nv0Var2.a.c();
        List listA = nv0Var2.a.a();
        ArrayList arrayList = new ArrayList(wq.G(listA, 10));
        Iterator it = listA.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            fu1.c();
            return null;
        }
        if (arrayList.isEmpty()) {
            vv.q(aqVarF).isInterface();
            dq0 dq0Var = b22.a;
            if (zC) {
                mv0VarO = b22.b.o(aqVarF);
            } else {
                mv0VarO = b22.a.o(aqVarF);
                if (mv0VarO == null) {
                    mv0VarO = null;
                }
            }
        } else {
            dq0 dq0Var2 = b22.a;
            Object objP = !zC ? b22.c.p(aqVarF, arrayList) : b22.d.p(aqVarF, arrayList);
            if (objP instanceof ut1) {
                objP = null;
            }
            mv0VarO = (mv0) objP;
        }
        if (mv0VarO != null) {
            return mv0VarO;
        }
        if (arrayList.isEmpty()) {
            mv0VarL = o(aqVarF);
            if (mv0VarL == null) {
                if (vv.q(aqVarF).isInterface()) {
                    mv0VarL = new fo1(aqVarF);
                } else {
                    mv0VarL = null;
                }
            }
            if (mv0VarL != null) {
                if (zC) {
                    return ir2.r(mv0VarL);
                }
                return mv0VarL;
            }
        } else {
            ArrayList arrayListQ = q(iq1Var, arrayList, z);
            if (arrayListQ != null) {
                mv0VarL = l(aqVarF, arrayListQ, new r12(2, arrayList));
                if (mv0VarL == null) {
                    if (vv.q(aqVarF).isInterface()) {
                        mv0VarL = new fo1(aqVarF);
                    } else {
                        mv0VarL = null;
                    }
                }
                if (mv0VarL != null) {
                    if (zC) {
                        return ir2.r(mv0VarL);
                    }
                    return mv0VarL;
                }
            }
        }
        return null;
    }

    public static final mv0 o(aq aqVar) {
        aqVar.getClass();
        mv0 mv0VarK = ei1.k(aqVar, new mv0[0]);
        return mv0VarK == null ? (mv0) zp1.a.get(aqVar) : mv0VarK;
    }

    public static final mv0 p(iq1 iq1Var, nv0 nv0Var) {
        iq1Var.getClass();
        nv0Var.getClass();
        return n(iq1Var, nv0Var, false);
    }

    public static final ArrayList q(iq1 iq1Var, List list, boolean z) {
        iq1Var.getClass();
        if (!z) {
            ArrayList arrayList = new ArrayList(wq.G(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mv0 mv0VarP = p(iq1Var, (nv0) it.next());
                if (mv0VarP == null) {
                    return null;
                }
                arrayList.add(mv0VarP);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(wq.G(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            nv0 nv0Var = (nv0) it2.next();
            nv0Var.getClass();
            mv0 mv0VarN = n(iq1Var, nv0Var, true);
            if (mv0VarN == null) {
                ws0.Q(ws0.F(nv0Var));
                throw null;
            }
            arrayList2.add(mv0VarN);
        }
        return arrayList2;
    }

    public static final Object r(vg2 vg2Var, ij0 ij0Var) throws Throwable {
        Object osVar;
        Object objV;
        mx.C(vg2Var, true, new h60(mx.y(vg2Var.h.f()).n(vg2Var.i, vg2Var, vg2Var.g)));
        try {
            if (ij0Var instanceof sh) {
                nj2.i(2, ij0Var);
                osVar = ij0Var.g(vg2Var, vg2Var);
            } else {
                osVar = ex.T(ij0Var, vg2Var, vg2Var);
            }
        } catch (Throwable th) {
            osVar = new os(th, false);
        }
        fz fzVar = fz.e;
        if (osVar == fzVar || (objV = vg2Var.V(osVar)) == nj2.o0) {
            return fzVar;
        }
        if (objV instanceof os) {
            Throwable th2 = ((os) objV).a;
            if (!(th2 instanceof ug2) || ((ug2) th2).e != vg2Var) {
                throw th2;
            }
            if (osVar instanceof os) {
                throw ((os) osVar).a;
            }
        } else {
            osVar = nj2.H(objV);
        }
        return osVar;
    }

    public static final void s() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t(long j, ij0 ij0Var, tx txVar) {
        wg2 wg2Var;
        gs1 gs1Var;
        if (txVar instanceof wg2) {
            wg2Var = (wg2) txVar;
            int i = wg2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                wg2Var.j = i - Integer.MIN_VALUE;
            } else {
                wg2Var = new wg2(txVar);
            }
        } else {
            wg2Var = new wg2(txVar);
        }
        Object obj = wg2Var.i;
        int i2 = wg2Var.j;
        if (i2 == 0) {
            ix.Q(obj);
            if (j > 0) {
                gs1 gs1Var2 = new gs1();
                try {
                    wg2Var.h = gs1Var2;
                    wg2Var.j = 1;
                    vg2 vg2Var = new vg2(j, wg2Var);
                    gs1Var2.e = vg2Var;
                    Object objR = r(vg2Var, ij0Var);
                    fz fzVar = fz.e;
                    return objR == fzVar ? fzVar : objR;
                } catch (ug2 e) {
                    e = e;
                    gs1Var = gs1Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gs1Var = wg2Var.h;
        try {
            ix.Q(obj);
            return obj;
        } catch (ug2 e2) {
            e = e2;
        }
        if (e.e != gs1Var.e) {
            throw e;
        }
        return null;
    }
}

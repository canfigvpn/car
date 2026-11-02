package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qs {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public qs(t61 t61Var, int i) {
        this.a = 4;
        this.c = t61Var;
        this.a = 4;
        this.b = i;
    }

    public static qs c(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        int i2;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i3 = 0;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new qs(rr.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i3, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = xq1.e;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayObtainAttributes.getColor(1, 0) : 0;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f4;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = xq1.f;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i2 = 0;
                } else {
                    i2 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f4 = f;
            f5 = f2;
        }
        xl xlVar = arrayList2.size() > 0 ? new xl(arrayList2, arrayList) : null;
        if (xlVar == null) {
            xlVar = z ? new xl(color, color2, color3) : new xl(color, color3);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                int[] iArr3 = xlVar.a;
                float[] fArr = xlVar.b;
                if (i5 != 1) {
                    tileMode2 = i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f, f2, f6, iArr3, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, xlVar.a, xlVar.b);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr4 = xlVar.a;
            float[] fArr2 = xlVar.b;
            if (i5 != 1) {
                tileMode = i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr4, fArr2, tileMode);
        }
        int i6 = 0;
        return new qs(i6, i6, radialGradient);
    }

    public static void d(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = ws0.n(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void a(long j) {
        if (b(j)) {
            return;
        }
        int i = this.b;
        long[] jArrCopyOf = (long[]) this.c;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.c = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.b) {
            this.b = i + 1;
        }
    }

    public boolean b(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void e(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void f(vh0 vh0Var, int i, int i2) {
        ((t61) this.c).q(new ha2(vh0Var), i, i2);
    }

    public iu0 g() {
        iu0 wu0Var;
        Object obj;
        fc1 fc1Var = (fc1) this.c;
        byte bS = fc1Var.s();
        if (bS == 1) {
            return j(true);
        }
        if (bS == 0) {
            return j(false);
        }
        if (bS != 6) {
            if (bS == 8) {
                return h();
            }
            fc1.l(fc1Var, "Cannot read Json element because of unexpected ".concat(dv1.Q(bS)), 0, null, 6);
            throw null;
        }
        int i = this.b + 1;
        this.b = i;
        if (i == 200) {
            cv0 cv0Var = new cv0(this, null);
            o20 o20Var = new o20();
            o20Var.e = cv0Var;
            o20Var.f = o20Var;
            fz fzVar = ir2.u;
            o20Var.g = fzVar;
            while (true) {
                obj = o20Var.g;
                sx sxVar = o20Var.f;
                if (sxVar == null) {
                    break;
                }
                if (ws0.j(fzVar, obj)) {
                    try {
                        cv0 cv0Var2 = o20Var.e;
                        nj2.i(3, cv0Var2);
                        cv0 cv0Var3 = new cv0(cv0Var2.i, sxVar);
                        cv0Var3.h = o20Var;
                        Object objR = cv0Var3.r(ll2.a);
                        if (objR != fz.e) {
                            sxVar.i(objR);
                        }
                    } catch (Throwable th) {
                        sxVar.i(new ut1(th));
                    }
                } else {
                    o20Var.g = fzVar;
                    sxVar.i(obj);
                }
            }
            ix.Q(obj);
            wu0Var = (iu0) obj;
        } else {
            byte bF = fc1Var.f((byte) 6);
            if (fc1Var.s() == 4) {
                fc1.l(fc1Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (fc1Var.b()) {
                String strI = fc1Var.i();
                fc1Var.f((byte) 5);
                linkedHashMap.put(strI, g());
                bF = fc1Var.e();
                if (bF != 4) {
                    if (bF == 7) {
                        break;
                    }
                    fc1.l(fc1Var, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bF == 6) {
                fc1Var.f((byte) 7);
            } else if (bF == 4) {
                ux.x(fc1Var, "object");
                throw null;
            }
            wu0Var = new wu0(linkedHashMap);
        }
        this.b--;
        return wu0Var;
    }

    public au0 h() {
        fc1 fc1Var = (fc1) this.c;
        byte bE = fc1Var.e();
        if (fc1Var.s() == 4) {
            fc1.l(fc1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (fc1Var.b()) {
            arrayList.add(g());
            bE = fc1Var.e();
            if (bE != 4) {
                boolean z = bE == 9;
                int i = fc1Var.b;
                if (!z) {
                    fc1.l(fc1Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            fc1Var.f((byte) 9);
        } else if (bE == 4) {
            ux.x(fc1Var, "array");
            throw null;
        }
        return new au0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(o20 o20Var, sh shVar) {
        dv0 dv0Var;
        LinkedHashMap linkedHashMap;
        o20 o20Var2;
        byte bE;
        qs qsVar;
        fc1 fc1Var;
        fc1 fc1Var2 = (fc1) this.c;
        if (shVar instanceof dv0) {
            dv0Var = (dv0) shVar;
            int i = dv0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv0Var.o = i - Integer.MIN_VALUE;
            } else {
                dv0Var = new dv0(this, shVar);
            }
        } else {
            dv0Var = new dv0(this, shVar);
        }
        Object obj = dv0Var.m;
        int i2 = dv0Var.o;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = dv0Var.l;
            String str = dv0Var.k;
            linkedHashMap = dv0Var.j;
            qsVar = dv0Var.i;
            o20Var2 = dv0Var.h;
            ix.Q(obj);
            linkedHashMap.put(str, (iu0) obj);
            bE = ((fc1) qsVar.c).e();
            if (bE == 4) {
                i3 = i4;
                this = qsVar;
            } else if (bE != 7) {
                fc1.l((fc1) qsVar.c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            fc1Var = (fc1) qsVar.c;
            if (bE == 6) {
                fc1Var.f((byte) 7);
            } else if (bE == 4) {
                ux.x(fc1Var, "object");
                throw null;
            }
            return new wu0(linkedHashMap);
        }
        ix.Q(obj);
        byte bF = fc1Var2.f((byte) 6);
        if (fc1Var2.s() == 4) {
            fc1.l(fc1Var2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        o20Var2 = o20Var;
        bE = bF;
        fc1 fc1Var3 = (fc1) this.c;
        if (!fc1Var3.b()) {
            qsVar = this;
            fc1Var = (fc1) qsVar.c;
            if (bE == 6) {
                fc1Var.f((byte) 7);
            } else if (bE == 4) {
                ux.x(fc1Var, "object");
                throw null;
            }
            return new wu0(linkedHashMap);
        }
        String strI = fc1Var3.i();
        fc1Var3.f((byte) 5);
        dv0Var.h = o20Var2;
        dv0Var.i = this;
        dv0Var.j = linkedHashMap;
        dv0Var.k = strI;
        dv0Var.l = i3;
        dv0Var.o = 1;
        o20Var2.getClass();
        o20Var2.f = dv0Var;
        return fz.e;
    }

    public av0 j(boolean z) {
        fc1 fc1Var = (fc1) this.c;
        String strJ = !z ? fc1Var.j() : fc1Var.i();
        return (z || !ws0.j(strJ, "null")) ? new qu0(strJ, z) : tu0.INSTANCE;
    }

    public void k() {
        zo zoVar = zo.c;
        char[] cArr = (char[]) this.c;
        zoVar.getClass();
        cArr.getClass();
        synchronized (zoVar) {
            int i = zoVar.b;
            if (cArr.length + i < te.a) {
                zoVar.b = i + cArr.length;
                zoVar.a.addLast(cArr);
            }
        }
    }

    public void l(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.c)[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public void m(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        e(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qs(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public qs(eu0 eu0Var, fc1 fc1Var) {
        this.a = 2;
        this.c = fc1Var;
    }
}

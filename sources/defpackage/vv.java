package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vv {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static jo0 c;

    public static final float A(qv1 qv1Var) {
        if (qv1Var != null) {
            return qv1Var.a;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(k80 k80Var) {
        if (((t71) k80Var).e.r) {
            qx.T(k80Var, 1).Z0();
        }
    }

    public static final boolean C(Object obj) {
        return obj == ws0.o;
    }

    public static final boolean D(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final boolean E(ak0 ak0Var) {
        return (((Configuration) ak0Var.j(u5.a)).uiMode & 48) == 32;
    }

    public static rx0 F(v01 v01Var, ti0 ti0Var) {
        is1 is1Var = is1.t;
        int iOrdinal = v01Var.ordinal();
        if (iOrdinal == 0) {
            return new hb2(ti0Var);
        }
        if (iOrdinal == 1) {
            cw1 cw1Var = new cw1();
            cw1Var.e = ti0Var;
            cw1Var.f = is1Var;
            return cw1Var;
        }
        if (iOrdinal != 2) {
            qj.p();
            return null;
        }
        rl2 rl2Var = new rl2();
        rl2Var.e = ti0Var;
        rl2Var.f = is1Var;
        return rl2Var;
    }

    public static hb2 G(ti0 ti0Var) {
        ti0Var.getClass();
        return new hb2(ti0Var);
    }

    public static final ru1 H(ej0 ej0Var, ij0 ij0Var) {
        x7 x7Var = new x7(15, ij0Var);
        nj2.i(1, ej0Var);
        return new ru1(4, x7Var, ej0Var);
    }

    /* JADX WARN: Code duplicated, block: B:161:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:180:0x0439  */
    /* JADX WARN: Code duplicated, block: B:181:0x043e  */
    /* JADX WARN: Code duplicated, block: B:186:0x045a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x045c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0465  */
    /* JADX WARN: Code duplicated, block: B:194:0x0480 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0482  */
    /* JADX WARN: Code duplicated, block: B:196:0x048a  */
    /* JADX WARN: Code duplicated, block: B:199:0x049a  */
    /* JADX WARN: Code duplicated, block: B:200:0x049d  */
    /* JADX WARN: Code duplicated, block: B:203:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    public static final nj1 K(int i, ak0 ak0Var) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        int i2;
        long jC;
        int i3;
        XmlResourceParser xmlResourceParser;
        char c2;
        int i4;
        TypedArray typedArrayObtainStyledAttributes;
        int i5;
        int i6;
        TypedArray typedArrayObtainStyledAttributes2;
        int i7;
        int i8;
        int i9;
        int i10;
        Shader shader;
        int i11;
        rk o72Var;
        Shader shader2;
        int i12;
        rk o72Var2;
        int i13;
        ColorStateList colorStateListA;
        Context context = (Context) ak0Var.j(u5.b);
        Resources resources = (Resources) ak0Var.j(u5.c);
        lt1 lt1Var = (lt1) ak0Var.j(u5.e);
        synchronized (lt1Var) {
            typedValue = (TypedValue) lt1Var.a.b(i);
            i2 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                d91 d91Var = lt1Var.a;
                int iD = d91Var.d(i);
                Object[] objArr = d91Var.c;
                Object obj = objArr[iD];
                d91Var.b[iD] = i;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !h92.E(charSequence, ".xml")) {
            ak0Var.W(-1771643000);
            boolean zF = ak0Var.f(context.getTheme()) | ak0Var.f(charSequence) | ak0Var.d(i);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    objL = new g7(((BitmapDrawable) drawable).getBitmap());
                    ak0Var.g0(objL);
                } catch (Exception e) {
                    throw new ps("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            xi xiVar = new xi((g7) objL);
            ak0Var.p(false);
            return xiVar;
        }
        ak0Var.W(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i14 = typedValue.changingConfigurations;
        mo0 mo0Var = (mo0) ak0Var.j(u5.d);
        lo0 lo0Var = new lo0(theme, i);
        WeakReference weakReference = (WeakReference) mo0Var.a.get(lo0Var);
        ko0 ko0Var = weakReference != null ? (ko0) weakReference.get() : null;
        if (ko0Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!ws0.j(xml.getName(), "vector")) {
                qj.r("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            ba baVar = new ba(xml);
            int[] iArr = ws0.a;
            TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
            baVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArrayObtainAttributes.getBoolean(5, false) : false;
            baVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            float fB = baVar.b(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
            float fB2 = baVar.b(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
            if (fB <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fB2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
            baVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
            baVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (typedArrayObtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = dr.g;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArrayObtainAttributes.getValue(1, typedValue3);
                        int i15 = typedValue3.type;
                        if (i15 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i15 < 28 || i15 > 31) {
                            Resources resources2 = typedArrayObtainAttributes.getResources();
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = rr.a;
                            try {
                                colorStateListA = rr.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception e2) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                                colorStateListA = null;
                            }
                        } else {
                            colorStateListA = ColorStateList.valueOf(typedValue3.data);
                        }
                    } else {
                        colorStateListA = null;
                    }
                    baVar.c(typedArrayObtainAttributes.getChangingConfigurations());
                    jC = colorStateListA != null ? ws0.c(colorStateListA.getDefaultColor()) : dr.g;
                }
            } else {
                jC = dr.g;
            }
            long j = jC;
            int i16 = typedArrayObtainAttributes.getInt(6, -1);
            baVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (i16 == -1) {
                i3 = 5;
            } else if (i16 == 3) {
                i3 = 3;
            } else if (i16 == 5) {
                i3 = 5;
            } else if (i16 != 9) {
                switch (i16) {
                    case 14:
                        i3 = 13;
                        break;
                    case 15:
                        i3 = 14;
                        break;
                    case 16:
                        i3 = 12;
                        break;
                    default:
                        i3 = 5;
                        break;
                }
            } else {
                i3 = 9;
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayObtainAttributes.recycle();
            io0 io0Var = new io0(null, f, f2, fB, fB2, j, i3, z, 1);
            int i17 = 0;
            for (int i18 = 3; xml.getEventType() != i2 && (xml.getDepth() >= i2 || xml.getEventType() != i18); i18 = 3) {
                List listA = cb0.e;
                XmlPullParser xmlPullParser = baVar.a;
                int i19 = i2;
                z2 z2Var = baVar.c;
                int eventType = xmlPullParser.getEventType();
                int i20 = i14;
                if (eventType != 2) {
                    if (eventType == i18 && "group".equals(xmlPullParser.getName())) {
                        int i21 = i17 + 1;
                        for (int i22 = 0; i22 < i21; i22++) {
                            ArrayList arrayList = io0Var.i;
                            if (io0Var.k) {
                                vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            ho0 ho0Var = (ho0) arrayList.remove(arrayList.size() - 1);
                            ((ho0) arrayList.get(arrayList.size() - 1)).j.add(new im2(ho0Var.a, ho0Var.b, ho0Var.c, ho0Var.d, ho0Var.e, ho0Var.f, ho0Var.g, ho0Var.h, ho0Var.i, ho0Var.j));
                        }
                        lo0Var = lo0Var;
                        xmlResourceParser = xml;
                        i5 = i19;
                        i17 = 0;
                    }
                    c2 = '\t';
                    xmlResourceParser.next();
                    i2 = i5;
                    lo0Var = lo0Var;
                    i14 = i20;
                    xml = xmlResourceParser;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            xmlResourceParser = xml;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    int[] iArr2 = ws0.b;
                                    TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                    baVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB3 = baVar.b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                    float f3 = typedArrayObtainAttributes2.getFloat(i19, 0.0f);
                                    baVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float f4 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                    baVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB4 = baVar.b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                    float fB5 = baVar.b(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                    float fB6 = baVar.b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                    float fB7 = baVar.b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                    String string = typedArrayObtainAttributes2.getString(0);
                                    baVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayObtainAttributes2.recycle();
                                    int i23 = jm2.a;
                                    if (io0Var.k) {
                                        vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    io0Var.i.add(new ho0(str, fB3, f3, f4, fB4, fB5, fB6, fB7, listA, 512));
                                }
                            } else if (name.equals("path")) {
                                int[] iArr3 = ws0.c;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                    i6 = 0;
                                } else {
                                    i6 = 0;
                                    typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                }
                                baVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    qj.r("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayObtainStyledAttributes2.getString(i6);
                                baVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayObtainStyledAttributes2.getString(2);
                                baVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (string3 == null) {
                                    int i24 = jm2.a;
                                } else {
                                    listA = z2.a(z2Var, string3);
                                }
                                List list = listA;
                                qs qsVarA = baVar.a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                float fB8 = baVar.b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                int i25 = !c22.i(baVar.a, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                baVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i25 == 0) {
                                    i7 = 0;
                                } else if (i25 == 1) {
                                    i7 = 1;
                                } else if (i25 != 2) {
                                    i7 = 0;
                                } else {
                                    i7 = 2;
                                }
                                if (c22.i(baVar.a, "strokeLineJoin")) {
                                    c2 = '\t';
                                    i8 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                } else {
                                    i8 = -1;
                                    c2 = '\t';
                                }
                                baVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i8 != 0) {
                                    if (i8 == 1) {
                                        i9 = 1;
                                    } else if (i8 == 2) {
                                        i9 = 2;
                                    }
                                    float fB9 = baVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                    qs qsVarA2 = baVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                    float fB10 = baVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float fB11 = baVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float fB12 = baVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float fB13 = baVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float fB14 = baVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (c22.i(baVar.a, "fillType")) {
                                        i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                    } else {
                                        i10 = 0;
                                    }
                                    baVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                    typedArrayObtainStyledAttributes2.recycle();
                                    shader = (Shader) qsVarA.c;
                                    i11 = qsVarA.b;
                                    if (shader == null && i11 == 0) {
                                        o72Var = null;
                                    } else if (shader != null) {
                                        o72Var = new sk(shader);
                                    } else {
                                        o72Var = new o72(ws0.c(i11));
                                    }
                                    shader2 = (Shader) qsVarA2.c;
                                    i12 = qsVarA2.b;
                                    if (shader2 == null && i12 == 0) {
                                        o72Var2 = null;
                                    } else if (shader2 != null) {
                                        o72Var2 = new sk(shader2);
                                    } else {
                                        o72Var2 = new o72(ws0.c(i12));
                                    }
                                    if (i10 == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = 1;
                                    }
                                    if (io0Var.k) {
                                        vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ArrayList arrayList2 = io0Var.i;
                                    ((ho0) arrayList2.get(arrayList2.size() - 1)).j.add(new mm2(str2, list, i13, o72Var, fB8, o72Var2, fB10, fB11, i7, i9, fB9, fB14, fB12, fB13));
                                    i5 = 1;
                                }
                                i9 = 0;
                                float fB15 = baVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                qs qsVarA3 = baVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                float fB16 = baVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                float fB17 = baVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                float fB18 = baVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                float fB19 = baVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                float fB110 = baVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                if (c22.i(baVar.a, "fillType")) {
                                    i10 = 0;
                                } else {
                                    i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                }
                                baVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                typedArrayObtainStyledAttributes2.recycle();
                                shader = (Shader) qsVarA.c;
                                i11 = qsVarA.b;
                                if (shader == null) {
                                    o72Var = null;
                                } else if (shader != null) {
                                    o72Var = new sk(shader);
                                } else {
                                    o72Var = new o72(ws0.c(i11));
                                }
                                shader2 = (Shader) qsVarA3.c;
                                i12 = qsVarA3.b;
                                if (shader2 == null) {
                                    o72Var2 = null;
                                } else if (shader2 != null) {
                                    o72Var2 = new sk(shader2);
                                } else {
                                    o72Var2 = new o72(ws0.c(i12));
                                }
                                if (i10 == 0) {
                                    i13 = 0;
                                } else {
                                    i13 = 1;
                                }
                                if (io0Var.k) {
                                    vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ArrayList arrayList3 = io0Var.i;
                                ((ho0) arrayList3.get(arrayList3.size() - 1)).j.add(new mm2(str2, list, i13, o72Var, fB8, o72Var2, fB16, fB17, i7, i9, fB15, fB110, fB18, fB19));
                                i5 = 1;
                            }
                            lo0Var = lo0Var;
                            i5 = 1;
                            c2 = '\t';
                        } else {
                            lo0Var = lo0Var;
                            xmlResourceParser = xml;
                            c2 = '\t';
                            if (name.equals("clip-path")) {
                                int[] iArr4 = ws0.d;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                    i4 = 0;
                                } else {
                                    i4 = 0;
                                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                }
                                baVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String string4 = typedArrayObtainStyledAttributes.getString(i4);
                                baVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i5 = 1;
                                String string5 = typedArrayObtainStyledAttributes.getString(1);
                                baVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                if (string5 == null) {
                                    int i26 = jm2.a;
                                } else {
                                    listA = z2.a(z2Var, string5);
                                }
                                List list2 = listA;
                                typedArrayObtainStyledAttributes.recycle();
                                if (io0Var.k) {
                                    vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                io0Var.i.add(new ho0(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i17++;
                            } else {
                                i5 = 1;
                            }
                        }
                        xmlResourceParser.next();
                        i2 = i5;
                        lo0Var = lo0Var;
                        i14 = i20;
                        xml = xmlResourceParser;
                    }
                    i5 = i19;
                    c2 = '\t';
                    xmlResourceParser.next();
                    i2 = i5;
                    lo0Var = lo0Var;
                    i14 = i20;
                    xml = xmlResourceParser;
                }
                xmlResourceParser = xml;
                i5 = i19;
                c2 = '\t';
                xmlResourceParser.next();
                i2 = i5;
                lo0Var = lo0Var;
                i14 = i20;
                xml = xmlResourceParser;
            }
            lo0 lo0Var2 = lo0Var;
            ko0Var = new ko0(io0Var.b(), i14 | baVar.b);
            mo0Var.a.put(lo0Var2, new WeakReference(ko0Var));
        }
        lm2 lm2VarQ = j02.q(ko0Var.a, ak0Var);
        ak0Var.p(false);
        return lm2VarQ;
    }

    public static final boolean L(cg0 cg0Var, na naVar) {
        Object[] objArr = new cg0[16];
        if (!cg0Var.e.r) {
            vp0.b("visitChildren called on an unattached node");
        }
        fa1 fa1Var = new fa1(new t71[16]);
        t71 t71Var = cg0Var.e;
        t71 t71Var2 = t71Var.j;
        if (t71Var2 == null) {
            qx.j(fa1Var, t71Var);
        } else {
            fa1Var.b(t71Var2);
        }
        int i = 0;
        while (true) {
            int i2 = fa1Var.g;
            if (i2 == 0) {
                break;
            }
            t71 t71VarP = (t71) fa1Var.k(i2 - 1);
            if ((t71VarP.h & 1024) == 0) {
                qx.j(fa1Var, t71VarP);
            } else {
                while (t71VarP != null) {
                    if ((t71VarP.g & 1024) != 0) {
                        fa1 fa1Var2 = null;
                        while (t71VarP != null) {
                            if (t71VarP instanceof cg0) {
                                cg0 cg0Var2 = (cg0) t71VarP;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = cg0Var2;
                                i = i3;
                            } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                int i4 = 0;
                                for (t71 t71Var3 = ((c40) t71VarP).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                    if ((t71Var3.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            t71VarP = t71Var3;
                                        } else {
                                            if (fa1Var2 == null) {
                                                fa1Var2 = new fa1(new t71[16]);
                                            }
                                            if (t71VarP != null) {
                                                fa1Var2.b(t71VarP);
                                                t71VarP = null;
                                            }
                                            fa1Var2.b(t71Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            t71VarP = qx.P(fa1Var2);
                        }
                        break;
                    }
                    t71VarP = t71VarP.j;
                }
            }
        }
        Arrays.sort(objArr, 0, i, dg0.b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                cg0 cg0Var3 = (cg0) objArr[i5];
                if (ux.y(cg0Var3) && f(cg0Var3, naVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean M(cg0 cg0Var, na naVar) {
        Object[] objArr = new cg0[16];
        if (!cg0Var.e.r) {
            vp0.b("visitChildren called on an unattached node");
        }
        fa1 fa1Var = new fa1(new t71[16]);
        t71 t71Var = cg0Var.e;
        t71 t71Var2 = t71Var.j;
        if (t71Var2 == null) {
            qx.j(fa1Var, t71Var);
        } else {
            fa1Var.b(t71Var2);
        }
        int i = 0;
        while (true) {
            int i2 = fa1Var.g;
            if (i2 == 0) {
                break;
            }
            t71 t71VarP = (t71) fa1Var.k(i2 - 1);
            if ((t71VarP.h & 1024) == 0) {
                qx.j(fa1Var, t71VarP);
            } else {
                while (t71VarP != null) {
                    if ((t71VarP.g & 1024) != 0) {
                        fa1 fa1Var2 = null;
                        while (t71VarP != null) {
                            if (t71VarP instanceof cg0) {
                                cg0 cg0Var2 = (cg0) t71VarP;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = cg0Var2;
                                i = i3;
                            } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                int i4 = 0;
                                for (t71 t71Var3 = ((c40) t71VarP).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                    if ((t71Var3.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            t71VarP = t71Var3;
                                        } else {
                                            if (fa1Var2 == null) {
                                                fa1Var2 = new fa1(new t71[16]);
                                            }
                                            if (t71VarP != null) {
                                                fa1Var2.b(t71VarP);
                                                t71VarP = null;
                                            }
                                            fa1Var2.b(t71Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            t71VarP = qx.P(fa1Var2);
                        }
                        break;
                    }
                    t71VarP = t71VarP.j;
                }
            }
        }
        Arrays.sort(objArr, 0, i, dg0.b);
        for (int i5 = 0; i5 < i; i5++) {
            cg0 cg0Var3 = (cg0) objArr[i5];
            if (ux.y(cg0Var3) && k(cg0Var3, naVar)) {
                return true;
            }
        }
        return false;
    }

    public static final Object N(sl1 sl1Var, tq1 tq1Var) {
        tq1Var.getClass();
        Object objB = sl1Var.get(tq1Var);
        if (objB == null) {
            objB = tq1Var.b();
        }
        return ((cm2) objB).a(sl1Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[ADDED_TO_REGION, LOOP:6: B:92:0x0138->B:120:0x0185, LOOP_START, PHI: r13
  0x0138: PHI (r13v12 t71) = (r13v7 t71), (r13v13 t71) binds: [B:91:0x0136, B:120:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    public static final boolean O(cg0 cg0Var, cg0 cg0Var2, int i, na naVar) {
        t71 t71Var;
        t71 t71Var2;
        ax0 ax0VarV;
        he1 he1Var;
        t71 t71VarP;
        fa1 fa1Var;
        if (cg0Var.K0() != bg0.f) {
            fu1.h("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new cg0[16];
        if (!cg0Var.e.r) {
            vp0.b("visitChildren called on an unattached node");
        }
        fa1 fa1Var2 = new fa1(new t71[16]);
        t71 t71Var3 = cg0Var.e;
        t71 t71Var4 = t71Var3.j;
        if (t71Var4 == null) {
            qx.j(fa1Var2, t71Var3);
        } else {
            fa1Var2.b(t71Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = fa1Var2.g;
            t71Var = null;
            if (i3 == 0) {
                break;
            }
            t71 t71VarP2 = (t71) fa1Var2.k(i3 - 1);
            if ((t71VarP2.h & 1024) == 0) {
                qx.j(fa1Var2, t71VarP2);
            } else {
                while (t71VarP2 != null) {
                    if ((t71VarP2.g & 1024) != 0) {
                        fa1 fa1Var3 = null;
                        while (t71VarP2 != null) {
                            if (t71VarP2 instanceof cg0) {
                                cg0 cg0Var3 = (cg0) t71VarP2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = cg0Var3;
                                i2 = i4;
                            } else if ((t71VarP2.g & 1024) != 0 && (t71VarP2 instanceof c40)) {
                                int i5 = 0;
                                for (t71 t71Var5 = ((c40) t71VarP2).t; t71Var5 != null; t71Var5 = t71Var5.j) {
                                    if ((t71Var5.g & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            t71VarP2 = t71Var5;
                                        } else {
                                            if (fa1Var3 == null) {
                                                fa1Var3 = new fa1(new t71[16]);
                                            }
                                            if (t71VarP2 != null) {
                                                fa1Var3.b(t71VarP2);
                                                t71VarP2 = null;
                                            }
                                            fa1Var3.b(t71Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            t71VarP2 = qx.P(fa1Var3);
                        }
                        break;
                    }
                    t71VarP2 = t71VarP2.j;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, dg0.b);
        if (i != 1) {
            if (i != 2) {
                fu1.h("This function should only be used for 1-D focus search");
                return false;
            }
            lr0 lr0VarS = ex.S(0, i2);
            int i6 = lr0VarS.e;
            int i7 = lr0VarS.f;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        cg0 cg0Var4 = (cg0) objArr[i7];
                        if (ux.y(cg0Var4) && f(cg0Var4, naVar)) {
                            return true;
                        }
                    }
                    if (ws0.j(objArr[i7], cg0Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!cg0Var.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71Var2 = cg0Var.e.i;
                ax0VarV = qx.V(cg0Var);
                loop5: while (ax0VarV != null) {
                    if ((ax0VarV.I.f.h & 1024) != 0) {
                        while (t71Var2 != null) {
                            if ((t71Var2.g & 1024) != 0) {
                                t71VarP = t71Var2;
                                fa1Var = null;
                                while (t71VarP != null) {
                                    if (t71VarP instanceof cg0) {
                                        t71Var = t71VarP;
                                        break loop5;
                                    }
                                    if ((t71VarP.g & 1024) == 0) {
                                    }
                                    t71VarP = qx.P(fa1Var);
                                }
                            }
                            t71Var2 = t71Var2.i;
                        }
                    }
                    ax0VarV = ax0VarV.u();
                    if (ax0VarV != null) {
                    }
                }
                if (t71Var != null) {
                    return ((Boolean) naVar.h(cg0Var)).booleanValue();
                }
            }
            return false;
        }
        lr0 lr0VarS2 = ex.S(0, i2);
        int i8 = lr0VarS2.e;
        int i9 = lr0VarS2.f;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    cg0 cg0Var5 = (cg0) objArr[i8];
                    if (ux.y(cg0Var5) && k(cg0Var5, naVar)) {
                        return true;
                    }
                }
                if (ws0.j(objArr[i8], cg0Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && cg0Var.H0().a) {
            if (!cg0Var.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71Var2 = cg0Var.e.i;
            ax0VarV = qx.V(cg0Var);
            loop5: while (ax0VarV != null) {
                if ((ax0VarV.I.f.h & 1024) != 0) {
                    while (t71Var2 != null) {
                        if ((t71Var2.g & 1024) != 0) {
                            t71VarP = t71Var2;
                            fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof cg0) {
                                    t71Var = t71VarP;
                                    break loop5;
                                }
                                if ((t71VarP.g & 1024) == 0 && (t71VarP instanceof c40)) {
                                    int i10 = 0;
                                    for (t71 t71Var6 = ((c40) t71VarP).t; t71Var6 != null; t71Var6 = t71Var6.j) {
                                        if ((t71Var6.g & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                t71VarP = t71Var6;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        }
                        t71Var2 = t71Var2.i;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var2 = (ax0VarV != null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
            }
            if (t71Var != null) {
                return ((Boolean) naVar.h(cg0Var)).booleanValue();
            }
        }
        return false;
    }

    public static String P(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + R(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + R(Float.intBitsToFloat(i)) + ", " + R(Float.intBitsToFloat(i2)) + ')';
    }

    public static String Q(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final String R(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final sl1 S(vq1[] vq1VarArr, sl1 sl1Var, sl1 sl1Var2) {
        rl1 rl1Var = new rl1(sl1.h);
        for (vq1 vq1Var : vq1VarArr) {
            tq1 tq1Var = vq1Var.a;
            if (vq1Var.f || !sl1Var.containsKey(tq1Var)) {
                rl1Var.put(tq1Var, tq1Var.c(vq1Var, (cm2) sl1Var2.get(tq1Var)));
            }
        }
        return rl1Var.a();
    }

    public static p40 a() {
        return new p40(1.0f, 1.0f);
    }

    public static kt1 b(int i, lh0 lh0Var, int i2) {
        if ((i2 & 2) != 0) {
            lh0Var = lh0.i;
        }
        return new kt1(i, lh0Var, new kh0(new jh0[0]));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0233  */
    /* JADX WARN: Code duplicated, block: B:157:0x0239  */
    /* JADX WARN: Code duplicated, block: B:163:0x024b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0251  */
    /* JADX WARN: Code duplicated, block: B:171:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0262  */
    /* JADX WARN: Code duplicated, block: B:175:0x0273  */
    /* JADX WARN: Code duplicated, block: B:178:0x0294  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:189:0x02db  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:199:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:205:0x0312  */
    /* JADX WARN: Code duplicated, block: B:207:0x0318  */
    /* JADX WARN: Code duplicated, block: B:213:0x0333  */
    /* JADX WARN: Code duplicated, block: B:215:0x0339  */
    /* JADX WARN: Code duplicated, block: B:221:0x034d  */
    /* JADX WARN: Code duplicated, block: B:223:0x0353  */
    /* JADX WARN: Code duplicated, block: B:229:0x0367  */
    /* JADX WARN: Code duplicated, block: B:231:0x036d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0381  */
    /* JADX WARN: Code duplicated, block: B:239:0x0387  */
    /* JADX WARN: Code duplicated, block: B:245:0x03a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:251:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:253:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:255:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:257:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:259:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:266:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:268:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:270:0x0412  */
    /* JADX WARN: Code duplicated, block: B:272:0x0454  */
    /* JADX WARN: Code duplicated, block: B:275:0x0462  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0169, please report this as an issue */
    public static final void c(final u71 u71Var, q01 q01Var, final gj1 gj1Var, final boolean z, final pd0 pd0Var, final boolean z2, final v6 v6Var, s3 s3Var, ie ieVar, vi viVar, ge geVar, final ej0 ej0Var, ak0 ak0Var, final int i, final int i2, final int i3) {
        int i4;
        s3 s3Var2;
        final ie ieVar2;
        int i5;
        boolean z3;
        q01 q01Var2;
        final vi viVar2;
        lr1 lr1VarR;
        int i6;
        vi viVar3;
        vi viVar4;
        s3 s3Var3;
        int i7;
        da1 da1VarT;
        boolean z4;
        Object objL;
        Object obj;
        jv0 jv0Var;
        boolean z5;
        Object objL2;
        Object objL3;
        ez ezVar;
        zk0 zk0Var;
        iq1 iq1Var;
        boolean zD;
        Object objL4;
        Object obj2;
        int i8;
        jv0 jv0Var2;
        di1 di1Var;
        di1 di1Var2;
        u71 u71VarA0;
        boolean zD2;
        Object objL5;
        ak0Var.X(924924659);
        if ((i & 6) == 0) {
            i4 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ak0Var.f(q01Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ak0Var.f(gj1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ak0Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ak0Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ak0Var.f(pd0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= ak0Var.g(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= ak0Var.f(v6Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
            s3Var2 = s3Var;
        } else {
            s3Var2 = s3Var;
            if ((i & 805306368) == 0) {
                i4 |= ak0Var.f(s3Var2) ? 536870912 : 268435456;
            }
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
            ieVar2 = ieVar;
        } else {
            ieVar2 = ieVar;
            if ((i2 & 6) == 0) {
                i5 = i2 | (ak0Var.f(ieVar2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i11 = i4;
        int i12 = i3 & 2048;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= ak0Var.f(viVar) ? 32 : 16;
        }
        int i13 = i5;
        int i14 = i3 & 4096;
        if (i14 == 0) {
            if ((i2 & 384) == 0) {
                i13 |= ak0Var.f(geVar) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                i13 |= ak0Var.h(ej0Var) ? 2048 : 1024;
            }
            if ((i11 & 306783379) == 306783378 || (i13 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ak0Var.O(i11 & 1, z3)) {
                ak0Var.T();
                if ((i & 1) != 0 || ak0Var.y()) {
                    i6 = i11 & (-234881025);
                    if (i9 != 0) {
                        s3Var2 = null;
                    }
                    if (i10 != 0) {
                        ieVar2 = null;
                    }
                    if (i12 != 0) {
                        viVar3 = null;
                    } else {
                        viVar3 = viVar;
                    }
                    if (i14 != 0) {
                        viVar4 = viVar3;
                        ieVar2 = ieVar2;
                        s3Var3 = s3Var2;
                        geVar = null;
                    } else {
                        viVar4 = viVar3;
                    }
                    ak0Var.q();
                    i7 = i6 >> 3;
                    int i15 = i7 & 14;
                    int i16 = ((i13 >> 6) & 112) | i15;
                    int i17 = i6;
                    da1VarT = y12.t(ej0Var, ak0Var);
                    int i18 = i13;
                    z4 = (((i16 & 14) ^ 6) <= 4 && ak0Var.f(q01Var)) || (i16 & 6) == 4;
                    objL = ak0Var.L();
                    obj = cv.a;
                    if (z4 || objL == obj) {
                        vy0 vy0Var = new vy0();
                        vy0Var.a = new ak1(Integer.MAX_VALUE);
                        vy0Var.b = new ak1(Integer.MAX_VALUE);
                        is1 is1Var = is1.f;
                        r9 r9Var = new r9(da1VarT, 18);
                        ud udVar = e72.a;
                        objL = new ay0(0, 1, p82.class, new v40(new vf(new v40(r9Var, is1Var), q01Var, vy0Var, 7), is1Var), "value", "getValue()Ljava/lang/Object;");
                        ak0Var.g0(objL);
                    }
                    jv0Var = (jv0) objL;
                    int i19 = i17 >> 9;
                    int i20 = i15 | (i19 & 112);
                    z5 = ((((i20 & 112) ^ 48) <= 32 && ak0Var.g(z)) || (i20 & 48) == 32) | ((((i20 & 14) ^ 6) <= 4 && ak0Var.f(q01Var)) || (i20 & 6) == 4);
                    objL2 = ak0Var.L();
                    if (z5 || objL2 == obj) {
                        objL2 = new yz0(q01Var, z);
                        ak0Var.g0(objL2);
                    }
                    xz0 xz0Var = (xz0) objL2;
                    objL3 = ak0Var.L();
                    if (objL3 == obj) {
                        objL3 = s5.E(ak0Var);
                        ak0Var.g0(objL3);
                    }
                    ezVar = (ez) objL3;
                    zk0Var = (zk0) ak0Var.j(yv.g);
                    iq1Var = ((Boolean) ak0Var.j(yv.w)).booleanValue() ? null : a92.a;
                    int i21 = i18 << 18;
                    int i22 = (i17 & 65520) | (i19 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | ((i18 << 27) & 1879048192);
                    zD = ((((i22 & 112) ^ 48) <= 32 && ak0Var.f(q01Var)) || (i22 & 48) == 32) | ((((i22 & 896) ^ 384) <= 256 && ak0Var.f(gj1Var)) || (i22 & 384) == 256) | ((((i22 & 7168) ^ 3072) <= 2048 && ak0Var.g(false)) || (i22 & 3072) == 2048) | ((((57344 & i22) ^ 24576) <= 16384 && ak0Var.g(z)) || (i22 & 24576) == 16384) | ak0Var.d(0) | ((((i22 & 3670016) ^ 1572864) <= 1048576 && ak0Var.f(s3Var3)) || (i22 & 1572864) == 1048576) | ((((i22 & 29360128) ^ 12582912) <= 8388608 && ak0Var.f(viVar4)) || (i22 & 12582912) == 8388608) | ((((i22 & 234881024) ^ 100663296) <= 67108864 && ak0Var.f(geVar)) || (i22 & 100663296) == 67108864) | ((((i22 & 1879048192) ^ 805306368) <= 536870912 && ak0Var.f(ieVar2)) || (i22 & 805306368) == 536870912) | ak0Var.f(zk0Var) | ak0Var.f(iq1Var);
                    objL4 = ak0Var.L();
                    if (!zD || objL4 == obj) {
                        obj2 = obj;
                        i8 = 4;
                        Object j01Var = new j01(q01Var, z, gj1Var, jv0Var, ieVar2, geVar, ezVar, zk0Var, iq1Var, s3Var3, viVar4);
                        jv0Var2 = jv0Var;
                        ak0Var.g0(j01Var);
                        objL4 = j01Var;
                    } else {
                        jv0Var2 = jv0Var;
                        obj2 = obj;
                        i8 = 4;
                    }
                    lz0 lz0Var = (lz0) objL4;
                    if (z) {
                        di1Var = di1.e;
                    } else {
                        di1Var = di1.f;
                    }
                    di1Var2 = di1Var;
                    if (z2) {
                        ak0Var.W(-2077147368);
                        zD2 = ((((i7 & 14) ^ 6) <= i8 && ak0Var.f(q01Var)) || (i7 & 6) == i8) | ak0Var.d(0);
                        objL5 = ak0Var.L();
                        if (zD2 || objL5 == obj2) {
                            objL5 = new d01(q01Var);
                            ak0Var.g0(objL5);
                        }
                        u71VarA0 = p61.a0((d01) objL5, q01Var.o, di1Var2);
                        ak0Var.p(false);
                    } else {
                        ak0Var.W(-2076718545);
                        ak0Var.p(false);
                        u71VarA0 = r71.a;
                    }
                    q01Var2 = q01Var;
                    mx.f(jv0Var2, ir2.D(nj2.z(u71Var.c(q01Var.l).c(q01Var.m), jv0Var2, xz0Var, di1Var2, z2).c(u71VarA0).c(q01Var.n.i), q01Var, di1Var2, v6Var, z2, pd0Var, q01Var.g), q01Var2.p, lz0Var, ak0Var, 0);
                    s3Var2 = s3Var3;
                    viVar2 = viVar4;
                } else {
                    ak0Var.R();
                    i6 = i11 & (-234881025);
                    viVar4 = viVar;
                }
                ieVar2 = ieVar2;
                s3Var3 = s3Var2;
                ak0Var.q();
                i7 = i6 >> 3;
                int i110 = i7 & 14;
                int i111 = ((i13 >> 6) & 112) | i110;
                int i112 = i6;
                da1VarT = y12.t(ej0Var, ak0Var);
                int i113 = i13;
                if (((i111 & 14) ^ 6) <= 4) {
                }
                objL = ak0Var.L();
                obj = cv.a;
                if (z4) {
                    vy0 vy0Var2 = new vy0();
                    vy0Var2.a = new ak1(Integer.MAX_VALUE);
                    vy0Var2.b = new ak1(Integer.MAX_VALUE);
                    is1 is1Var2 = is1.f;
                    r9 r9Var2 = new r9(da1VarT, 18);
                    ud udVar2 = e72.a;
                    objL = new ay0(0, 1, p82.class, new v40(new vf(new v40(r9Var2, is1Var2), q01Var, vy0Var2, 7), is1Var2), "value", "getValue()Ljava/lang/Object;");
                    ak0Var.g0(objL);
                } else {
                    vy0 vy0Var3 = new vy0();
                    vy0Var3.a = new ak1(Integer.MAX_VALUE);
                    vy0Var3.b = new ak1(Integer.MAX_VALUE);
                    is1 is1Var3 = is1.f;
                    r9 r9Var3 = new r9(da1VarT, 18);
                    ud udVar3 = e72.a;
                    objL = new ay0(0, 1, p82.class, new v40(new vf(new v40(r9Var3, is1Var3), q01Var, vy0Var3, 7), is1Var3), "value", "getValue()Ljava/lang/Object;");
                    ak0Var.g0(objL);
                }
                jv0Var = (jv0) objL;
                int i114 = i112 >> 9;
                int i23 = i110 | (i114 & 112);
                z5 = ((((i23 & 112) ^ 48) <= 32 && ak0Var.g(z)) || (i23 & 48) == 32) | ((((i23 & 14) ^ 6) <= 4 && ak0Var.f(q01Var)) || (i23 & 6) == 4);
                objL2 = ak0Var.L();
                if (z5) {
                    objL2 = new yz0(q01Var, z);
                    ak0Var.g0(objL2);
                } else {
                    objL2 = new yz0(q01Var, z);
                    ak0Var.g0(objL2);
                }
                xz0 xz0Var2 = (xz0) objL2;
                objL3 = ak0Var.L();
                if (objL3 == obj) {
                    objL3 = s5.E(ak0Var);
                    ak0Var.g0(objL3);
                }
                ezVar = (ez) objL3;
                zk0Var = (zk0) ak0Var.j(yv.g);
                iq1Var = ((Boolean) ak0Var.j(yv.w)).booleanValue() ? null : a92.a;
                int i24 = i113 << 18;
                int i25 = (i112 & 65520) | (i114 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | ((i113 << 27) & 1879048192);
                zD = ((((i25 & 112) ^ 48) <= 32 && ak0Var.f(q01Var)) || (i25 & 48) == 32) | ((((i25 & 896) ^ 384) <= 256 && ak0Var.f(gj1Var)) || (i25 & 384) == 256) | ((((i25 & 7168) ^ 3072) <= 2048 && ak0Var.g(false)) || (i25 & 3072) == 2048) | ((((57344 & i25) ^ 24576) <= 16384 && ak0Var.g(z)) || (i25 & 24576) == 16384) | ak0Var.d(0) | ((((i25 & 3670016) ^ 1572864) <= 1048576 && ak0Var.f(s3Var3)) || (i25 & 1572864) == 1048576) | ((((i25 & 29360128) ^ 12582912) <= 8388608 && ak0Var.f(viVar4)) || (i25 & 12582912) == 8388608) | ((((i25 & 234881024) ^ 100663296) <= 67108864 && ak0Var.f(geVar)) || (i25 & 100663296) == 67108864) | ((((i25 & 1879048192) ^ 805306368) <= 536870912 && ak0Var.f(ieVar2)) || (i25 & 805306368) == 536870912) | ak0Var.f(zk0Var) | ak0Var.f(iq1Var);
                objL4 = ak0Var.L();
                if (zD) {
                    obj2 = obj;
                    i8 = 4;
                    Object j01Var2 = new j01(q01Var, z, gj1Var, jv0Var, ieVar2, geVar, ezVar, zk0Var, iq1Var, s3Var3, viVar4);
                    jv0Var2 = jv0Var;
                    ak0Var.g0(j01Var2);
                    objL4 = j01Var2;
                } else {
                    obj2 = obj;
                    i8 = 4;
                    Object j01Var3 = new j01(q01Var, z, gj1Var, jv0Var, ieVar2, geVar, ezVar, zk0Var, iq1Var, s3Var3, viVar4);
                    jv0Var2 = jv0Var;
                    ak0Var.g0(j01Var3);
                    objL4 = j01Var3;
                }
                lz0 lz0Var2 = (lz0) objL4;
                if (z) {
                    di1Var = di1.e;
                } else {
                    di1Var = di1.f;
                }
                di1Var2 = di1Var;
                if (z2) {
                    ak0Var.W(-2077147368);
                    zD2 = ((((i7 & 14) ^ 6) <= i8 && ak0Var.f(q01Var)) || (i7 & 6) == i8) | ak0Var.d(0);
                    objL5 = ak0Var.L();
                    if (zD2) {
                        objL5 = new d01(q01Var);
                        ak0Var.g0(objL5);
                    } else {
                        objL5 = new d01(q01Var);
                        ak0Var.g0(objL5);
                    }
                    u71VarA0 = p61.a0((d01) objL5, q01Var.o, di1Var2);
                    ak0Var.p(false);
                } else {
                    ak0Var.W(-2076718545);
                    ak0Var.p(false);
                    u71VarA0 = r71.a;
                }
                q01Var2 = q01Var;
                mx.f(jv0Var2, ir2.D(nj2.z(u71Var.c(q01Var.l).c(q01Var.m), jv0Var2, xz0Var2, di1Var2, z2).c(u71VarA0).c(q01Var.n.i), q01Var, di1Var2, v6Var, z2, pd0Var, q01Var.g), q01Var2.p, lz0Var2, ak0Var, 0);
                s3Var2 = s3Var3;
                viVar2 = viVar4;
            } else {
                q01Var2 = q01Var;
                ak0Var.R();
                viVar2 = viVar;
                geVar = geVar;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                final q01 q01Var3 = q01Var2;
                final s3 s3Var4 = s3Var2;
                final ge geVar2 = geVar;
                lr1VarR.d = new ij0() { // from class: h01
                    @Override // defpackage.ij0
                    public final Object g(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iP = ei1.P(i | 1);
                        int iP2 = ei1.P(i2);
                        vv.c(u71Var, q01Var3, gj1Var, z, pd0Var, z2, v6Var, s3Var4, ieVar2, viVar2, geVar2, ej0Var, (ak0) obj3, iP, iP2, i3);
                        return ll2.a;
                    }
                };
            }
        }
        i13 |= 384;
        if ((i2 & 3072) != 0) {
            i13 |= ak0Var.h(ej0Var) ? 2048 : 1024;
        }
        if ((i11 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (ak0Var.O(i11 & 1, z3)) {
            ak0Var.T();
            if ((i & 1) != 0) {
                i6 = i11 & (-234881025);
                if (i9 != 0) {
                    s3Var2 = null;
                }
                if (i10 != 0) {
                    ieVar2 = null;
                }
                if (i12 != 0) {
                    viVar3 = null;
                } else {
                    viVar3 = viVar;
                }
                if (i14 != 0) {
                    viVar4 = viVar3;
                    ieVar2 = ieVar2;
                    s3Var3 = s3Var2;
                    geVar = null;
                } else {
                    viVar4 = viVar3;
                    ieVar2 = ieVar2;
                    s3Var3 = s3Var2;
                }
            } else {
                i6 = i11 & (-234881025);
                if (i9 != 0) {
                    s3Var2 = null;
                }
                if (i10 != 0) {
                    ieVar2 = null;
                }
                if (i12 != 0) {
                    viVar3 = null;
                } else {
                    viVar3 = viVar;
                }
                if (i14 != 0) {
                    viVar4 = viVar3;
                    ieVar2 = ieVar2;
                    s3Var3 = s3Var2;
                    geVar = null;
                } else {
                    viVar4 = viVar3;
                    ieVar2 = ieVar2;
                    s3Var3 = s3Var2;
                }
            }
            ak0Var.q();
            i7 = i6 >> 3;
            int i115 = i7 & 14;
            int i116 = ((i13 >> 6) & 112) | i115;
            int i117 = i6;
            da1VarT = y12.t(ej0Var, ak0Var);
            int i118 = i13;
            if (((i116 & 14) ^ 6) <= 4) {
            }
            objL = ak0Var.L();
            obj = cv.a;
            if (z4) {
                vy0 vy0Var4 = new vy0();
                vy0Var4.a = new ak1(Integer.MAX_VALUE);
                vy0Var4.b = new ak1(Integer.MAX_VALUE);
                is1 is1Var4 = is1.f;
                r9 r9Var4 = new r9(da1VarT, 18);
                ud udVar4 = e72.a;
                objL = new ay0(0, 1, p82.class, new v40(new vf(new v40(r9Var4, is1Var4), q01Var, vy0Var4, 7), is1Var4), "value", "getValue()Ljava/lang/Object;");
                ak0Var.g0(objL);
            } else {
                vy0 vy0Var5 = new vy0();
                vy0Var5.a = new ak1(Integer.MAX_VALUE);
                vy0Var5.b = new ak1(Integer.MAX_VALUE);
                is1 is1Var5 = is1.f;
                r9 r9Var5 = new r9(da1VarT, 18);
                ud udVar5 = e72.a;
                objL = new ay0(0, 1, p82.class, new v40(new vf(new v40(r9Var5, is1Var5), q01Var, vy0Var5, 7), is1Var5), "value", "getValue()Ljava/lang/Object;");
                ak0Var.g0(objL);
            }
            jv0Var = (jv0) objL;
            int i119 = i117 >> 9;
            int i26 = i115 | (i119 & 112);
            z5 = ((((i26 & 112) ^ 48) <= 32 && ak0Var.g(z)) || (i26 & 48) == 32) | ((((i26 & 14) ^ 6) <= 4 && ak0Var.f(q01Var)) || (i26 & 6) == 4);
            objL2 = ak0Var.L();
            if (z5) {
                objL2 = new yz0(q01Var, z);
                ak0Var.g0(objL2);
            } else {
                objL2 = new yz0(q01Var, z);
                ak0Var.g0(objL2);
            }
            xz0 xz0Var3 = (xz0) objL2;
            objL3 = ak0Var.L();
            if (objL3 == obj) {
                objL3 = s5.E(ak0Var);
                ak0Var.g0(objL3);
            }
            ezVar = (ez) objL3;
            zk0Var = (zk0) ak0Var.j(yv.g);
            iq1Var = ((Boolean) ak0Var.j(yv.w)).booleanValue() ? null : a92.a;
            int i27 = i118 << 18;
            int i28 = (i117 & 65520) | (i119 & 3670016) | (i27 & 29360128) | (i27 & 234881024) | ((i118 << 27) & 1879048192);
            zD = ((((i28 & 112) ^ 48) <= 32 && ak0Var.f(q01Var)) || (i28 & 48) == 32) | ((((i28 & 896) ^ 384) <= 256 && ak0Var.f(gj1Var)) || (i28 & 384) == 256) | ((((i28 & 7168) ^ 3072) <= 2048 && ak0Var.g(false)) || (i28 & 3072) == 2048) | ((((57344 & i28) ^ 24576) <= 16384 && ak0Var.g(z)) || (i28 & 24576) == 16384) | ak0Var.d(0) | ((((i28 & 3670016) ^ 1572864) <= 1048576 && ak0Var.f(s3Var3)) || (i28 & 1572864) == 1048576) | ((((i28 & 29360128) ^ 12582912) <= 8388608 && ak0Var.f(viVar4)) || (i28 & 12582912) == 8388608) | ((((i28 & 234881024) ^ 100663296) <= 67108864 && ak0Var.f(geVar)) || (i28 & 100663296) == 67108864) | ((((i28 & 1879048192) ^ 805306368) <= 536870912 && ak0Var.f(ieVar2)) || (i28 & 805306368) == 536870912) | ak0Var.f(zk0Var) | ak0Var.f(iq1Var);
            objL4 = ak0Var.L();
            if (zD) {
                obj2 = obj;
                i8 = 4;
                Object j01Var4 = new j01(q01Var, z, gj1Var, jv0Var, ieVar2, geVar, ezVar, zk0Var, iq1Var, s3Var3, viVar4);
                jv0Var2 = jv0Var;
                ak0Var.g0(j01Var4);
                objL4 = j01Var4;
            } else {
                obj2 = obj;
                i8 = 4;
                Object j01Var5 = new j01(q01Var, z, gj1Var, jv0Var, ieVar2, geVar, ezVar, zk0Var, iq1Var, s3Var3, viVar4);
                jv0Var2 = jv0Var;
                ak0Var.g0(j01Var5);
                objL4 = j01Var5;
            }
            lz0 lz0Var3 = (lz0) objL4;
            if (z) {
                di1Var = di1.e;
            } else {
                di1Var = di1.f;
            }
            di1Var2 = di1Var;
            if (z2) {
                ak0Var.W(-2077147368);
                zD2 = ((((i7 & 14) ^ 6) <= i8 && ak0Var.f(q01Var)) || (i7 & 6) == i8) | ak0Var.d(0);
                objL5 = ak0Var.L();
                if (zD2) {
                    objL5 = new d01(q01Var);
                    ak0Var.g0(objL5);
                } else {
                    objL5 = new d01(q01Var);
                    ak0Var.g0(objL5);
                }
                u71VarA0 = p61.a0((d01) objL5, q01Var.o, di1Var2);
                ak0Var.p(false);
            } else {
                ak0Var.W(-2076718545);
                ak0Var.p(false);
                u71VarA0 = r71.a;
            }
            q01Var2 = q01Var;
            mx.f(jv0Var2, ir2.D(nj2.z(u71Var.c(q01Var.l).c(q01Var.m), jv0Var2, xz0Var3, di1Var2, z2).c(u71VarA0).c(q01Var.n.i), q01Var, di1Var2, v6Var, z2, pd0Var, q01Var.g), q01Var2.p, lz0Var3, ak0Var, 0);
            s3Var2 = s3Var3;
            viVar2 = viVar4;
        } else {
            q01Var2 = q01Var;
            ak0Var.R();
            viVar2 = viVar;
            geVar = geVar;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            final q01 q01Var4 = q01Var2;
            final s3 s3Var5 = s3Var2;
            final ge geVar3 = geVar;
            lr1VarR.d = new ij0() { // from class: h01
                @Override // defpackage.ij0
                public final Object g(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = ei1.P(i | 1);
                    int iP2 = ei1.P(i2);
                    vv.c(u71Var, q01Var4, gj1Var, z, pd0Var, z2, v6Var, s3Var5, ieVar2, viVar2, geVar3, ej0Var, (ak0) obj3, iP, iP2, i3);
                    return ll2.a;
                }
            };
        }
    }

    public static final void d(long j, vf2 vf2Var, ij0 ij0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-684938728);
        if ((i & 6) == 0) {
            i2 = (ak0Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(vf2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(ij0Var) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            a90 a90Var = ef2.a;
            sv.b(new vq1[]{yw.a.a(new dr(j)), a90Var.a(((vf2) ak0Var.j(a90Var)).d(vf2Var))}, ij0Var, ak0Var, ((i2 >> 3) & 112) | 8);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new uq1(j, vf2Var, ij0Var, i, 0);
        }
    }

    public static void e(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = kt0.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = pm1.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean f(cg0 cg0Var, na naVar) {
        int iOrdinal = cg0Var.K0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cg0 cg0VarR = ux.r(cg0Var);
                if (cg0VarR == null) {
                    fu1.h("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = cg0VarR.K0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (f(cg0VarR, naVar) || l(cg0Var, cg0VarR, 2, naVar) || (cg0VarR.H0().a && ((Boolean) naVar.h(cg0VarR)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            qj.p();
                            return false;
                        }
                        fu1.h("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return l(cg0Var, cg0VarR, 2, naVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    qj.p();
                    return false;
                }
                if (!L(cg0Var, naVar)) {
                    if (!(cg0Var.H0().a ? ((Boolean) naVar.h(cg0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return L(cg0Var, naVar);
    }

    public static pe0 g(pe0 pe0Var, int i) {
        vk vkVar;
        if (i < 0 && i != -2 && i != -1) {
            qj.f(k3.i("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        if (i == -1) {
            i = 0;
            vkVar = vk.f;
        } else {
            vkVar = vk.e;
        }
        boolean z = pe0Var instanceof uj0;
        ab0 ab0Var = ab0.e;
        return z ? ((uj0) pe0Var).b(ab0Var, i, vkVar) : new po(pe0Var, ab0Var, i, vkVar);
    }

    public static final int h(x41 x41Var, u3 u3Var) {
        x41 x41VarW0 = x41Var.w0();
        if (x41VarW0 == null) {
            vp0.b("Child of " + x41Var + " cannot be null when calculating alignment line");
        }
        if (x41Var.A0().a().containsKey(u3Var)) {
            Integer num = (Integer) x41Var.A0().a().get(u3Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iF0 = x41VarW0.f0(u3Var);
            if (iF0 != Integer.MIN_VALUE) {
                x41VarW0.n = true;
                x41Var.o = true;
                x41Var.G0();
                x41VarW0.n = false;
                x41Var.o = false;
                return iF0 + ((int) (u3Var instanceof on0 ? x41VarW0.C0() & 4294967295L : x41VarW0.C0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean i(long j, long j2) {
        return j == j2;
    }

    public static final boolean j(long j, long j2) {
        return j == j2;
    }

    public static final boolean k(cg0 cg0Var, na naVar) {
        int iOrdinal = cg0Var.K0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cg0 cg0VarR = ux.r(cg0Var);
                if (cg0VarR != null) {
                    return k(cg0VarR, naVar) || l(cg0Var, cg0VarR, 1, naVar);
                }
                fu1.h("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return cg0Var.H0().a ? ((Boolean) naVar.h(cg0Var)).booleanValue() : M(cg0Var, naVar);
                }
                qj.p();
                return false;
            }
        }
        return M(cg0Var, naVar);
    }

    public static final boolean l(cg0 cg0Var, cg0 cg0Var2, int i, na naVar) {
        if (O(cg0Var, cg0Var2, i, naVar)) {
            return true;
        }
        Boolean bool = (Boolean) s5.N(cg0Var, i, new qg1(((vf0) ((e5) qx.W(cg0Var)).getFocusOwner()).f(), cg0Var, cg0Var2, i, naVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static jr m(ak0 ak0Var) {
        return (jr) ak0Var.j(lr.a);
    }

    public static String n(b7 b7Var, int i) {
        b7Var.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = b7Var.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static m12 o(zb1 zb1Var) {
        zb1Var.getClass();
        return o12.t(zb1Var, new o01(17));
    }

    public static final int p(String str, Bundle bundle) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        rw.C(str);
        throw null;
    }

    public static final Class q(aq aqVar) {
        aqVar.getClass();
        Class clsA = aqVar.a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class r(aq aqVar) {
        Class clsA = aqVar.a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static bs1 s(Context context, AttributeSet attributeSet, int i, int i2) {
        bs1 bs1Var = new bs1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yq1.a, i, i2);
        bs1Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        bs1Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        bs1Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        bs1Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return bs1Var;
    }

    public static final qv1 t(r61 r61Var) {
        Object objJ = r61Var.j();
        if (objJ instanceof qv1) {
            return (qv1) objJ;
        }
        return null;
    }

    public static final Bundle u(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        rw.C(str);
        throw null;
    }

    public static final ArrayList v(String str, Bundle bundle) {
        ArrayList arrayListD = Build.VERSION.SDK_INT >= 34 ? h1.d(bundle, str, q(js1.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (arrayListD != null) {
            return arrayListD;
        }
        rw.C(str);
        throw null;
    }

    public static final gz1 w(Object obj) {
        if (obj != ws0.o) {
            return (gz1) obj;
        }
        fu1.h("Does not contain segment");
        return null;
    }

    public static final String x(String str, Bundle bundle) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        rw.C(str);
        throw null;
    }

    public static final String[] y(String str, Bundle bundle) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        rw.C(str);
        throw null;
    }

    public static gk2 z(ak0 ak0Var) {
        return (gk2) ak0Var.j(ik2.a);
    }

    public abstract void I(Throwable th);

    public abstract void J(e4 e4Var);
}

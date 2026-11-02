package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj2 {
    public static final j02 a;
    public static final e51 b;
    public static Paint c;

    static {
        r02.g("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new yj2();
        } else if (i >= 29) {
            a = new xj2();
        } else if (i >= 28) {
            a = new wj2();
        } else if (i >= 26) {
            a = new vj2();
        } else {
            Method method = tj2.d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new tj2();
            } else {
                a = new sj2();
            }
        }
        b = new e51(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, ah0 ah0Var, Resources resources, int i, String str, int i2, int i3, uc ucVar, boolean z) {
        Typeface typefaceH;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 2;
        if (ah0Var instanceof dh0) {
            dh0 dh0Var = (dh0) ah0Var;
            String str2 = dh0Var.d;
            typefaceH = null;
            int i5 = 1;
            boolean z2 = false;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = dh0Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList.size()) {
                                        tg0 tg0Var = (tg0) arrayList.get(i7);
                                        if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(tg0Var.f)) {
                                            customFallbackBuilder.setSystemFallback(tg0Var.e);
                                        } else {
                                            String str3 = tg0Var.e;
                                            String str4 = tg0Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + tg0Var.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(qj2.a(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i7++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((tg0) arrayList.get(i6)).e) != null) {
                                i6++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((tg0) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (ucVar != null) {
                    new Handler(Looper.getMainLooper()).post(new w5(i4, ucVar, typefaceBuild));
                }
                b.b(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            byte b5 = !z ? ucVar != null : dh0Var.c != 0;
            int i8 = z ? dh0Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            qk1 qk1Var = new qk1(19, z2);
            qk1Var.f = ucVar;
            ArrayList arrayList2 = dh0Var.a;
            ft1 ft1Var = new ft1(handler);
            dq0 dq0Var = new dq0(4, qk1Var, ft1Var);
            if (b5 != true) {
                String strA = zg0.a(i3, arrayList2);
                Typeface typeface = (Typeface) zg0.a.a(strA);
                if (typeface != null) {
                    ft1Var.execute(new hm(b3 == true ? 1 : 0, qk1Var, typeface));
                    typefaceH = typeface;
                } else {
                    xg0 xg0Var = new xg0(b2 == true ? 1 : 0, dq0Var);
                    synchronized (zg0.c) {
                        try {
                            w42 w42Var = zg0.d;
                            ArrayList arrayList3 = (ArrayList) w42Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(xg0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(xg0Var);
                                w42Var.put(strA, arrayList4);
                                wg0 wg0Var = new wg0(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = zg0.b;
                                xg0 xg0Var2 = new xg0(i5, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                gt1 gt1Var = new gt1();
                                gt1Var.f = wg0Var;
                                gt1Var.g = xg0Var2;
                                gt1Var.h = handler2;
                                threadPoolExecutor.execute(gt1Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    qj.r("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                tg0 tg0Var2 = (tg0) arrayList2.get(0);
                e51 e51Var = zg0.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{tg0Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = zg0.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) zg0.a.a(strA2);
                if (typeface2 != null) {
                    ft1Var.execute(new hm(b4 == true ? 1 : 0, qk1Var, typeface2));
                    typefaceH = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr = {tg0Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    yg0 yg0VarB = zg0.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    dq0Var.u(yg0VarB);
                    typefaceH = yg0VarB.a;
                } else {
                    try {
                        try {
                            try {
                                yg0 yg0Var = (yg0) zg0.b.submit(new wg0(strA2, context, tg0Var2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                dq0Var.u(yg0Var);
                                typefaceH = yg0Var.a;
                            } catch (ExecutionException e) {
                                throw new RuntimeException(e);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused3) {
                        ((ft1) dq0Var.g).execute(new im((qk1) dq0Var.f, -3));
                    }
                }
            }
        } else {
            typefaceH = a.h(context, (bh0) ah0Var, resources, i3);
            if (ucVar != null) {
                if (typefaceH != null) {
                    new Handler(Looper.getMainLooper()).post(new w5(i4, ucVar, typefaceH));
                } else {
                    ucVar.a(-3);
                }
            }
        }
        if (typefaceH != null) {
            b.b(b(resources, i, str, i2, i3), typefaceH);
        }
        return typefaceH;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}

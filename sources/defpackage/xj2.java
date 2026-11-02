package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class xj2 extends j02 {
    public static Font u(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iX = x(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iX2 = x(fontStyle, font2.getStyle());
            if (iX2 < iX) {
                font = font2;
                iX = iX2;
            }
        }
        return font;
    }

    public static int x(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.j02
    public final Typeface h(Context context, bh0 bh0Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (ch0 ch0Var : bh0Var.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, ch0Var.f).setWeight(ch0Var.b).setSlant(ch0Var.c ? 1 : 0).setTtcIndex(ch0Var.e).setFontVariationSettings(ch0Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(u(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.j02
    public final Typeface i(Context context, oh0[] oh0VarArr, int i) {
        try {
            FontFamily fontFamilyV = v(oh0VarArr, context.getContentResolver());
            if (fontFamilyV == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyV).setStyle(u(fontFamilyV, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.j02
    public final Typeface j(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyV = v((oh0[]) list.get(0), contentResolver);
            if (fontFamilyV == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyV);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyV2 = v((oh0[]) list.get(i2), contentResolver);
                if (fontFamilyV2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyV2);
                }
            }
            return customFallbackBuilder.setStyle(u(fontFamilyV, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.j02
    public final Typeface k(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily v(oh0[] oh0VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (oh0 oh0Var : oh0VarArr) {
            if (Objects.equals(oh0Var.a.getScheme(), "systemfont")) {
                fontBuild = w(oh0Var);
            } else {
                try {
                    Uri uri = oh0Var.a;
                    String str = oh0Var.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(oh0Var.c).setSlant(oh0Var.d ? 1 : 0).setTtcIndex(oh0Var.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font w(oh0 oh0Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}

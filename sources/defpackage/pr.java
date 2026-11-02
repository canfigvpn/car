package defpackage;

import android.graphics.ColorSpace;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pr {
    public static final ColorSpace a(mr mrVar) {
        ColorSpace colorSpace;
        if (ws0.j(mrVar, qr.e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (ws0.j(mrVar, qr.q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (ws0.j(mrVar, qr.r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (ws0.j(mrVar, qr.o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (ws0.j(mrVar, qr.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (ws0.j(mrVar, qr.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (ws0.j(mrVar, qr.t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (ws0.j(mrVar, qr.s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (ws0.j(mrVar, qr.k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (ws0.j(mrVar, qr.l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (ws0.j(mrVar, qr.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (ws0.j(mrVar, qr.h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (ws0.j(mrVar, qr.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (ws0.j(mrVar, qr.m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (ws0.j(mrVar, qr.p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (ws0.j(mrVar, qr.n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (ws0.j(mrVar, qr.v)) {
                colorSpace = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
            } else {
                colorSpace = ws0.j(mrVar, qr.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(mrVar instanceof ju1)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = mrVar.a;
        ju1 ju1Var = (ju1) mrVar;
        float[] fArrA = ju1Var.d.a();
        zh2 zh2Var = ju1Var.g;
        ColorSpace.Rgb.TransferParameters transferParameters = zh2Var != null ? new ColorSpace.Rgb.TransferParameters(zh2Var.b, zh2Var.c, zh2Var.d, zh2Var.e, zh2Var.f, zh2Var.g, zh2Var.a) : null;
        float[] fArr = ju1Var.i;
        final int i = 0;
        if (transferParameters != null) {
            nr.y();
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, ju1Var.h, fArrA, transferParameters);
            if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                return rgb;
            }
            nr.y();
            return new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        nr.y();
        float[] fArr2 = ju1Var.h;
        final iu1 iu1Var = ju1Var.l;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: or
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i2 = i;
                ej0 ej0Var = iu1Var;
                switch (i2) {
                    case 0:
                        break;
                }
                return ((Number) ej0Var.h(Double.valueOf(d))).doubleValue();
            }
        };
        final iu1 iu1Var2 = ju1Var.o;
        final int i2 = 1;
        return new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: or
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i3 = i2;
                ej0 ej0Var = iu1Var2;
                switch (i3) {
                    case 0:
                        break;
                }
                return ((Number) ej0Var.h(Double.valueOf(d))).doubleValue();
            }
        }, ju1Var.e, ju1Var.f);
    }

    public static AutofillId b(View view) {
        return view.getAutofillId();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}

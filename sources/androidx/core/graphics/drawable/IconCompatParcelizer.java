package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qj;
import defpackage.ym2;
import defpackage.zm2;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ym2 ym2Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !ym2Var.e(1) ? -1 : ((zm2) ym2Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (ym2Var.e(2)) {
            Parcel parcel = ((zm2) ym2Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = ym2Var.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (ym2Var.e(4)) {
            i2 = ((zm2) ym2Var).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (ym2Var.e(5)) {
            i3 = ((zm2) ym2Var).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) ym2Var.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (ym2Var.e(7)) {
            string = ((zm2) ym2Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (ym2Var.e(8)) {
            string2 = ((zm2) ym2Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                qj.r("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, ym2 ym2Var) {
        ym2Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            ym2Var.h(1);
            ((zm2) ym2Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            ym2Var.h(2);
            Parcel parcel = ((zm2) ym2Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            ym2Var.h(3);
            ((zm2) ym2Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            ym2Var.h(4);
            ((zm2) ym2Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            ym2Var.h(5);
            ((zm2) ym2Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            ym2Var.h(6);
            ((zm2) ym2Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            ym2Var.h(7);
            ((zm2) ym2Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            ym2Var.h(8);
            ((zm2) ym2Var).e.writeString(str2);
        }
    }
}

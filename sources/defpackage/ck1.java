package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ck1 implements Parcelable.ClassLoaderCreator {
    public static dk1 a(Parcel parcel, ClassLoader classLoader) {
        d72 d72Var;
        if (classLoader == null) {
            classLoader = ck1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            d72Var = q90.U;
        } else if (i == 1) {
            d72Var = is1.o;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + i + " was restored");
            }
            d72Var = is1.f;
        }
        return new dk1(value, d72Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new dk1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}

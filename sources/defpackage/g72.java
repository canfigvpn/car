package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 implements Parcelable.ClassLoaderCreator {
    public static h72 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = g72.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new h72();
        }
        dm1 dm1VarE = p52.f.e();
        for (int i2 = 0; i2 < i; i2++) {
            dm1VarE.add(parcel.readValue(classLoader));
        }
        return new h72(dm1VarE.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new h72[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}

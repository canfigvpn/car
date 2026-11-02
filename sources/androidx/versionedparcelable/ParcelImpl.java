package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.an2;
import defpackage.i2;
import defpackage.zm2;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new i2(4);
    public final an2 e;

    public ParcelImpl(Parcel parcel) {
        this.e = new zm2(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new zm2(parcel).i(this.e);
    }
}

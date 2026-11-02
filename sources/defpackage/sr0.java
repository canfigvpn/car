package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 implements Parcelable {
    public static final Parcelable.Creator<sr0> CREATOR = new i2(2);
    public final IntentSender e;
    public final Intent f;
    public final int g;
    public final int h;

    public sr0(Parcel parcel) {
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        parcelable.getClass();
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        this.e = (IntentSender) parcelable;
        this.f = intent;
        this.g = i;
        this.h = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}

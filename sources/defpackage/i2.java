package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new j2(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new d30(parcel.readInt());
            case 2:
                parcel.getClass();
                return new sr0(parcel);
            case 3:
                ce1 ce1Var = new ce1(parcel);
                ce1Var.e = parcel.readInt();
                return ce1Var;
            case 4:
                return new ParcelImpl(parcel);
            case 5:
                return new zj1(parcel.readFloat());
            case 6:
                return new ak1(parcel.readInt());
            default:
                return new bk1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j2[i];
            case 1:
                return new d30[i];
            case 2:
                return new sr0[i];
            case 3:
                return new ce1[i];
            case 4:
                return new ParcelImpl[i];
            case 5:
                return new zj1[i];
            case 6:
                return new ak1[i];
            default:
                return new bk1[i];
        }
    }
}

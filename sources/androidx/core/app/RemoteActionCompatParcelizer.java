package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.an2;
import defpackage.ym2;
import defpackage.zm2;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ym2 ym2Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        an2 an2VarG = remoteActionCompat.a;
        boolean z = true;
        if (ym2Var.e(1)) {
            an2VarG = ym2Var.g();
        }
        remoteActionCompat.a = (IconCompat) an2VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (ym2Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((zm2) ym2Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (ym2Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((zm2) ym2Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) ym2Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (ym2Var.e(5)) {
            z2 = ((zm2) ym2Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!ym2Var.e(6)) {
            z = z3;
        } else if (((zm2) ym2Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ym2 ym2Var) {
        ym2Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ym2Var.h(1);
        ym2Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ym2Var.h(2);
        Parcel parcel = ((zm2) ym2Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        ym2Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        ym2Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        ym2Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        ym2Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}

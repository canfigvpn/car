package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r81 extends Binder implements bo0 {
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public r81(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, bo0.b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        s81 s81Var;
        String str = bo0.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        ao0 ao0Var = null;
        ao0 ao0Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(ao0.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ao0)) {
                    zn0 zn0Var = new zn0();
                    zn0Var.c = strongBinder;
                    ao0Var = zn0Var;
                } else {
                    ao0Var = (ao0) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            ao0Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
                synchronized (multiInstanceInvalidationService.g) {
                    try {
                        int i4 = multiInstanceInvalidationService.e + 1;
                        multiInstanceInvalidationService.e = i4;
                        if (multiInstanceInvalidationService.g.register(ao0Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.e--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(ao0.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof ao0)) {
                    zn0 zn0Var2 = new zn0();
                    zn0Var2.c = strongBinder2;
                    ao0Var2 = zn0Var2;
                } else {
                    ao0Var2 = (ao0) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            ao0Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.c;
            synchronized (multiInstanceInvalidationService2.g) {
                multiInstanceInvalidationService2.g.unregister(ao0Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.c;
        synchronized (multiInstanceInvalidationService3.g) {
            String str2 = (String) multiInstanceInvalidationService3.f.get(Integer.valueOf(i6));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.g.beginBroadcast();
                while (true) {
                    s81Var = multiInstanceInvalidationService3.g;
                    if (i3 >= iBeginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = s81Var.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.f.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((ao0) multiInstanceInvalidationService3.g.getBroadcastItem(i3)).a(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.g.finishBroadcast();
                        throw th2;
                    }
                }
                s81Var.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 extends w82 implements Parcelable, b72 {
    public static final Parcelable.Creator<dk1> CREATOR = new ck1();
    public final d72 f;
    public c72 g;

    public dk1(Object obj, d72 d72Var) {
        this.f = d72Var;
        o62 o62VarH = x62.h();
        c72 c72Var = new c72(o62VarH.g(), obj);
        if (!(o62VarH instanceof tk0)) {
            c72Var.b = new c72(1L, obj);
        }
        this.g = c72Var;
    }

    @Override // defpackage.v82
    public final x82 a() {
        return this.g;
    }

    @Override // defpackage.v82
    public final x82 b(x82 x82Var, x82 x82Var2, x82 x82Var3) {
        if (this.f.c(((c72) x82Var2).c, ((c72) x82Var3).c)) {
            return x82Var2;
        }
        return null;
    }

    @Override // defpackage.v82
    public final void d(x82 x82Var) {
        this.g = (c72) x82Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.b72
    public final d72 e() {
        return this.f;
    }

    @Override // defpackage.p82
    public final Object getValue() {
        return ((c72) x62.s(this.g, this)).c;
    }

    @Override // defpackage.da1
    public final void setValue(Object obj) {
        o62 o62VarH;
        c72 c72Var = (c72) x62.f(this.g);
        if (this.f.c(c72Var.c, obj)) {
            return;
        }
        c72 c72Var2 = this.g;
        synchronized (x62.c) {
            o62VarH = x62.h();
            ((c72) x62.n(c72Var2, this, o62VarH, c72Var)).c = obj;
        }
        x62.l(o62VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((c72) x62.f(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        q90 q90Var = q90.U;
        d72 d72Var = this.f;
        if (d72Var.equals(q90Var)) {
            i2 = 0;
        } else if (d72Var.equals(is1.o)) {
            i2 = 1;
        } else {
            if (!d72Var.equals(is1.f)) {
                fu1.h("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}

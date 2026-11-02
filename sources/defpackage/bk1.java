package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 extends w82 implements Parcelable, b72, p82, da1 {
    public static final Parcelable.Creator<bk1> CREATOR = new i2(7);
    public a72 f;

    public bk1(long j) {
        o62 o62VarH = x62.h();
        a72 a72Var = new a72(o62VarH.g(), j);
        if (!(o62VarH instanceof tk0)) {
            a72Var.b = new a72(1L, j);
        }
        this.f = a72Var;
    }

    @Override // defpackage.v82
    public final x82 a() {
        return this.f;
    }

    @Override // defpackage.v82
    public final x82 b(x82 x82Var, x82 x82Var2, x82 x82Var3) {
        if (((a72) x82Var2).c == ((a72) x82Var3).c) {
            return x82Var2;
        }
        return null;
    }

    @Override // defpackage.v82
    public final void d(x82 x82Var) {
        this.f = (a72) x82Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.b72
    public final d72 e() {
        return is1.o;
    }

    @Override // defpackage.p82
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((a72) x62.s(this.f, this)).c;
    }

    public final void i(long j) {
        o62 o62VarH;
        a72 a72Var = (a72) x62.f(this.f);
        if (a72Var.c != j) {
            a72 a72Var2 = this.f;
            synchronized (x62.c) {
                o62VarH = x62.h();
                ((a72) x62.n(a72Var2, this, o62VarH, a72Var)).c = j;
            }
            x62.l(o62VarH, this);
        }
    }

    @Override // defpackage.da1
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a72) x62.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}

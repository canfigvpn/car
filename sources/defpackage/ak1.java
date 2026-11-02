package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ak1 extends w82 implements Parcelable, b72, p82, da1 {
    public static final Parcelable.Creator<ak1> CREATOR = new i2(6);
    public z62 f;

    public ak1(int i) {
        o62 o62VarH = x62.h();
        z62 z62Var = new z62(i, o62VarH.g());
        if (!(o62VarH instanceof tk0)) {
            z62Var.b = new z62(i, 1L);
        }
        this.f = z62Var;
    }

    @Override // defpackage.v82
    public final x82 a() {
        return this.f;
    }

    @Override // defpackage.v82
    public final x82 b(x82 x82Var, x82 x82Var2, x82 x82Var3) {
        if (((z62) x82Var2).c == ((z62) x82Var3).c) {
            return x82Var2;
        }
        return null;
    }

    @Override // defpackage.v82
    public final void d(x82 x82Var) {
        this.f = (z62) x82Var;
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
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((z62) x62.s(this.f, this)).c;
    }

    public final void i(int i) {
        o62 o62VarH;
        z62 z62Var = (z62) x62.f(this.f);
        if (z62Var.c != i) {
            z62 z62Var2 = this.f;
            synchronized (x62.c) {
                o62VarH = x62.h();
                ((z62) x62.n(z62Var2, this, o62VarH, z62Var)).c = i;
            }
            x62.l(o62VarH, this);
        }
    }

    @Override // defpackage.da1
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((z62) x62.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zj1 extends w82 implements Parcelable, b72, p82, da1 {
    public static final Parcelable.Creator<zj1> CREATOR = new i2(5);
    public y62 f;

    public zj1(float f) {
        o62 o62VarH = x62.h();
        y62 y62Var = new y62(f, o62VarH.g());
        if (!(o62VarH instanceof tk0)) {
            y62Var.b = new y62(f, 1L);
        }
        this.f = y62Var;
    }

    @Override // defpackage.v82
    public final x82 a() {
        return this.f;
    }

    @Override // defpackage.v82
    public final x82 b(x82 x82Var, x82 x82Var2, x82 x82Var3) {
        if (((y62) x82Var2).c == ((y62) x82Var3).c) {
            return x82Var2;
        }
        return null;
    }

    @Override // defpackage.v82
    public final void d(x82 x82Var) {
        this.f = (y62) x82Var;
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
        return Float.valueOf(h());
    }

    public final float h() {
        return ((y62) x62.s(this.f, this)).c;
    }

    public final void i(float f) {
        o62 o62VarH;
        y62 y62Var = (y62) x62.f(this.f);
        if (y62Var.c == f) {
            return;
        }
        y62 y62Var2 = this.f;
        synchronized (x62.c) {
            o62VarH = x62.h();
            ((y62) x62.n(y62Var2, this, o62VarH, y62Var)).c = f;
        }
        x62.l(o62VarH, this);
    }

    @Override // defpackage.da1
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((y62) x62.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}

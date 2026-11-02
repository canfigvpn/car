package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yb0 extends y implements xb0, RandomAccess, Serializable {
    public final Enum[] e;

    public yb0(Enum[] enumArr) {
        enumArr.getClass();
        this.e = enumArr;
    }

    @Override // defpackage.n
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.n, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        Enum[] enumArr = this.e;
        enumArr.getClass();
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        qj.j(k3.h(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.y, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.e;
        enumArr.getClass();
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.y, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.e;
        enumArr.getClass();
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}

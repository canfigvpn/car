package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class v implements Iterator, fv0 {
    public final /* synthetic */ int e;
    public int f;
    public final Object g;

    public v(wb0 wb0Var) {
        this.e = 3;
        this.g = wb0Var;
        this.f = wb0Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                return this.f < ((y) obj).a();
            case 1:
                return this.f < ((Object[]) obj).length;
            case 2:
                return ((Iterator) obj).hasNext();
            case 3:
                return this.f > 0;
            case 4:
                return this.f < ((v72) obj).d();
            case 5:
                return this.f < ((byte[]) obj).length;
            case 6:
                return this.f < ((int[]) obj).length;
            case 7:
                return this.f < ((long[]) obj).length;
            default:
                return this.f < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    qj.t();
                    return null;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                return ((y) obj).get(i2);
            case 1:
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f--;
                    fu1.k(e.getMessage());
                    return null;
                }
            case 2:
                int i4 = this.f;
                this.f = i4 + 1;
                if (i4 >= 0) {
                    return new wo0(i4, ((Iterator) obj).next());
                }
                vs0.D();
                throw null;
            case 3:
                wb0 wb0Var = (wb0) obj;
                int i5 = wb0Var.c;
                int i6 = this.f;
                this.f = i6 - 1;
                return wb0Var.e[i5 - i6];
            case 4:
                int i7 = this.f;
                this.f = i7 + 1;
                return ((v72) obj).e(i7);
            case 5:
                int i8 = this.f;
                byte[] bArr = (byte[]) obj;
                if (i8 < bArr.length) {
                    this.f = i8 + 1;
                    return new lk2(bArr[i8]);
                }
                fu1.k(String.valueOf(i8));
                return null;
            case 6:
                int i9 = this.f;
                int[] iArr = (int[]) obj;
                if (i9 < iArr.length) {
                    this.f = i9 + 1;
                    return new qk2(iArr[i9]);
                }
                fu1.k(String.valueOf(i9));
                return null;
            case 7:
                int i10 = this.f;
                long[] jArr = (long[]) obj;
                if (i10 < jArr.length) {
                    this.f = i10 + 1;
                    return new vk2(jArr[i10]);
                }
                fu1.k(String.valueOf(i10));
                return null;
            default:
                int i11 = this.f;
                short[] sArr = (short[]) obj;
                if (i11 < sArr.length) {
                    this.f = i11 + 1;
                    return new bl2(sArr[i11]);
                }
                fu1.k(String.valueOf(i11));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(Iterator it) {
        this.e = 2;
        it.getClass();
        this.g = it;
    }

    public /* synthetic */ v(int i, Object obj) {
        this.e = i;
        this.g = obj;
    }
}

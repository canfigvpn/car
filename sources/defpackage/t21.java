package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t21 implements Iterator, fv0 {
    public final CharSequence e;
    public int f;
    public int g;
    public int h;
    public int i;

    public t21(CharSequence charSequence) {
        this.e = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.i < 0) {
            this.f = 2;
            return false;
        }
        CharSequence charSequence = this.e;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.g; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f = 1;
                this.i = i;
                this.h = length;
                return true;
            }
        }
        i = -1;
        this.f = 1;
        this.i = i;
        this.h = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qj.t();
            return null;
        }
        this.f = 0;
        int i = this.h;
        int i2 = this.g;
        this.g = this.i + i;
        return this.e.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

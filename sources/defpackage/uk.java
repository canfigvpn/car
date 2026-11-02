package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uk extends z {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public uk(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.h = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    qj.t();
                    return null;
                }
                int i2 = this.e;
                this.e = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.e++;
                    return obj;
                }
                qj.t();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    qj.t();
                    return null;
                }
                int i2 = this.e - 1;
                this.e = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.e--;
                    return obj;
                }
                qj.t();
                return null;
        }
    }

    public uk(int i, Object obj) {
        super(i, 1);
        this.h = obj;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 extends er0 {
    public final int e;
    public final int f;
    public boolean g;
    public int h;

    public kr0(int i, int i2, int i3) {
        this.e = i3;
        this.f = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.g = z;
        this.h = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // defpackage.er0
    public final int nextInt() {
        int i = this.h;
        if (i != this.f) {
            this.h = this.e + i;
            return i;
        }
        if (this.g) {
            this.g = false;
            return i;
        }
        qj.t();
        return 0;
    }
}

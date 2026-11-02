package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oz0 implements p82 {
    public final int e;
    public final int f;
    public final dk1 g;
    public int h;

    public oz0(int i, int i2, int i3) {
        this.e = i2;
        this.f = i3;
        int i4 = (i / i2) * i2;
        this.g = new dk1(ex.S(Math.max(i4 - i3, 0), i4 + i2 + i3), is1.o);
        this.h = i;
    }

    public final void a(int i) {
        if (i != this.h) {
            this.h = i;
            int i2 = this.e;
            int i3 = (i / i2) * i2;
            int i4 = this.f;
            this.g.setValue(ex.S(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.p82
    public final Object getValue() {
        return (lr0) this.g.getValue();
    }
}

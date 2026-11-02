package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oa0 implements na0 {
    public final int e;
    public int f = -1;
    public int g = -1;

    public oa0(int i) {
        this.e = i;
    }

    @Override // defpackage.na0
    public final boolean b(CharSequence charSequence, int i, int i2, zj2 zj2Var) {
        int i3 = this.e;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f = i;
        this.g = i2;
        return false;
    }

    @Override // defpackage.na0
    public final Object a() {
        return this;
    }
}

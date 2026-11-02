package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 extends y {
    public final d0 e;
    public final int f;
    public final int g;

    public qo0(d0 d0Var, int i, int i2) {
        this.e = d0Var;
        this.f = i;
        sv.t(i, i2, d0Var.a());
        this.g = i2 - i;
    }

    @Override // defpackage.n
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sv.r(i, this.g);
        return this.e.get(this.f + i);
    }

    @Override // defpackage.y, java.util.List
    public final List subList(int i, int i2) {
        sv.t(i, i2, this.g);
        int i3 = this.f;
        return new qo0(this.e, i + i3, i3 + i2);
    }
}

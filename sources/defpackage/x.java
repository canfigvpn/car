package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends y implements RandomAccess {
    public final y e;
    public final int f;
    public final int g;

    public x(y yVar, int i, int i2) {
        this.e = yVar;
        this.f = i;
        nj2.j(i, i2, yVar.a());
        this.g = i2 - i;
    }

    @Override // defpackage.n
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.e.get(this.f + i);
    }

    @Override // defpackage.y, java.util.List
    public final List subList(int i, int i2) {
        nj2.j(i, i2, this.g);
        int i3 = this.f;
        return new x(this.e, i + i3, i3 + i2);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zi2 extends xi2 {
    public final xl1 h;

    public zi2(xl1 xl1Var) {
        this.h = xl1Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        this.g = i + 2;
        Object[] objArr = this.e;
        return new j91(this.h, objArr[i], objArr[i + 1]);
    }
}

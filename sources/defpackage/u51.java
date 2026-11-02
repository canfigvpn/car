package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u51 extends w51 implements Iterator, fv0 {
    public final /* synthetic */ int i;

    public u51(x51 x51Var, int i) {
        this.i = i;
        this.h = x51Var;
        this.f = -1;
        this.g = x51Var.l;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case 0:
                b();
                int i = this.e;
                x51 x51Var = (x51) this.h;
                if (i >= x51Var.j) {
                    qj.t();
                    return null;
                }
                this.e = i + 1;
                this.f = i;
                v51 v51Var = new v51(x51Var, i);
                c();
                return v51Var;
            case 1:
                b();
                int i2 = this.e;
                x51 x51Var2 = (x51) this.h;
                if (i2 >= x51Var2.j) {
                    qj.t();
                    return null;
                }
                this.e = i2 + 1;
                this.f = i2;
                Object obj = x51Var2.e[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.e;
                x51 x51Var3 = (x51) this.h;
                if (i3 >= x51Var3.j) {
                    qj.t();
                    return null;
                }
                this.e = i3 + 1;
                this.f = i3;
                Object[] objArr = x51Var3.f;
                objArr.getClass();
                Object obj2 = objArr[this.f];
                c();
                return obj2;
        }
    }
}

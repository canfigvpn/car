package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class im2 extends km2 implements Iterable, fv0 {
    public final String e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final List m;
    public final ArrayList n;

    public im2(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.e = str;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = list;
        this.n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof im2)) {
            return false;
        }
        im2 im2Var = (im2) obj;
        return ws0.j(this.e, im2Var.e) && this.f == im2Var.f && this.g == im2Var.g && this.h == im2Var.h && this.i == im2Var.i && this.j == im2Var.j && this.k == im2Var.k && this.l == im2Var.l && ws0.j(this.m, im2Var.m) && this.n.equals(im2Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + k3.a(this.l, k3.a(this.k, k3.a(this.j, k3.a(this.i, k3.a(this.h, k3.a(this.g, k3.a(this.f, this.e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xl1(this);
    }
}

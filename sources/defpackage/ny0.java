package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ny0 {
    public final yx0 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public ny0(yx0 yx0Var) {
        this.a = yx0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ly0(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = cb0.e;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    public final nh0 b(int i) {
        List list;
        int i2 = this.i;
        int i3 = i * i2;
        int iD = d() - i3;
        if (i2 > iD) {
            i2 = iD;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.h.size()) {
            list = this.h;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new ll0(1L));
            }
            this.h = arrayList;
            list = arrayList;
        }
        return new nh0(i3, list);
    }

    public final int c(int i) {
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            yp0.a("ItemIndex > total count");
        }
        return i / this.i;
    }

    public final int d() {
        return this.a.e.f;
    }

    public final int e(int i) {
        ds0 ds0VarB = this.a.e.b(i);
        int i2 = i - ds0VarB.a;
        return (int) ((ll0) ((xx0) ds0VarB.c).a.g(my0.a, Integer.valueOf(i2))).a;
    }
}

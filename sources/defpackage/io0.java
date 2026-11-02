package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class io0 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final ho0 j;
    public boolean k;

    public io0(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? dr.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ho0 ho0Var = new ho0(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = ho0Var;
        arrayList.add(ho0Var);
    }

    public static void a(io0 io0Var, ArrayList arrayList, o72 o72Var) {
        if (io0Var.k) {
            vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = io0Var.i;
        ((ho0) arrayList2.get(arrayList2.size() - 1)).j.add(new mm2("", arrayList, 0, o72Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final jo0 b() {
        if (this.k) {
            vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                ho0 ho0Var = this.j;
                jo0 jo0Var = new jo0(this.a, this.b, this.c, this.d, this.e, new im2(ho0Var.a, ho0Var.b, ho0Var.c, ho0Var.d, ho0Var.e, ho0Var.f, ho0Var.g, ho0Var.h, ho0Var.i, ho0Var.j), this.f, this.g, this.h);
                this.k = true;
                return jo0Var;
            }
            if (this.k) {
                vp0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ho0 ho0Var2 = (ho0) arrayList.remove(arrayList.size() - 1);
            ((ho0) arrayList.get(arrayList.size() - 1)).j.add(new im2(ho0Var2.a, ho0Var2.b, ho0Var2.c, ho0Var2.d, ho0Var2.e, ho0Var2.f, ho0Var2.g, ho0Var2.h, ho0Var2.i, ho0Var2.j));
        }
    }
}

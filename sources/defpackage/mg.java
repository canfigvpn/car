package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class mg {
    public static final lg Companion = new lg();
    public static final rx0[] q;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final Integer l;
    public final int m;
    public final List n;
    public final List o;
    public final List p;

    static {
        m2 m2Var = new m2(6);
        v01 v01Var = v01.e;
        q = new rx0[]{null, null, null, null, null, null, null, null, null, null, null, null, null, vv.F(v01Var, m2Var), vv.F(v01Var, new m2(7)), vv.F(v01Var, new m2(8))};
    }

    public /* synthetic */ mg(int i, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, int i2, int i3, Integer num2, int i4, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = "GASOLINE";
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i2;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = 0;
        } else {
            this.m = i4;
        }
        int i5 = i & 8192;
        cb0 cb0Var = cb0.e;
        if (i5 == 0) {
            this.n = cb0Var;
        } else {
            this.n = list;
        }
        if ((i & 16384) == 0) {
            this.o = cb0Var;
        } else {
            this.o = list2;
        }
        if ((i & 32768) == 0) {
            this.p = cb0Var;
        } else {
            this.p = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        mg mgVar = (mg) obj;
        return ws0.j(this.a, mgVar.a) && ws0.j(this.b, mgVar.b) && ws0.j(this.c, mgVar.c) && ws0.j(this.d, mgVar.d) && ws0.j(this.e, mgVar.e) && ws0.j(this.f, mgVar.f) && ws0.j(this.g, mgVar.g) && ws0.j(this.h, mgVar.h) && ws0.j(this.i, mgVar.i) && this.j == mgVar.j && this.k == mgVar.k && ws0.j(this.l, mgVar.l) && this.m == mgVar.m && ws0.j(this.n, mgVar.n) && ws0.j(this.o, mgVar.o) && ws0.j(this.p, mgVar.p);
    }

    public final int hashCode() {
        int iE = k3.e(k3.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iB = k3.b(this.k, k3.b(this.j, k3.e(k3.e(k3.e(k3.e(k3.e((iE + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31);
        Integer num2 = this.l;
        return this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + k3.b(this.m, (iB + (num2 != null ? num2.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BackupCar(name=" + this.a + ", make=" + this.b + ", model=" + this.c + ", year=" + this.d + ", plateTwoDigits=" + this.e + ", plateLetter=" + this.f + ", plateThreeDigits=" + this.g + ", plateRegion=" + this.h + ", fuelType=" + this.i + ", currentOdometerKm=" + this.j + ", odometerUpdatedEpochDay=" + this.k + ", typicalDailyKm=" + this.l + ", createdEpochDay=" + this.m + ", schedules=" + this.n + ", records=" + this.o + ", readings=" + this.p + ")";
    }

    public mg(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, int i, int i2, Integer num2, int i3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = i;
        this.k = i2;
        this.l = num2;
        this.m = i3;
        this.n = arrayList;
        this.o = arrayList2;
        this.p = arrayList3;
    }
}

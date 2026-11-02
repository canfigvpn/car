package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d41 {
    public final long a;
    public final List b;
    public final long c;
    public final int d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;
    public final d22 j;
    public final List k;
    public final boolean l;
    public final boolean m;

    public d41(long j, List list, long j2, int i, String str, Integer num, String str2, String str3, String str4, d22 d22Var, List list2, boolean z, boolean z2) {
        list.getClass();
        d22Var.getClass();
        list2.getClass();
        this.a = j;
        this.b = list;
        this.c = j2;
        this.d = i;
        this.e = str;
        this.f = num;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = d22Var;
        this.k = list2;
        this.l = z;
        this.m = z2;
    }

    public static d41 a(d41 d41Var, List list, long j, int i, String str, Integer num, String str2, String str3, String str4, d22 d22Var, List list2, boolean z, int i2) {
        long j2 = d41Var.a;
        List list3 = (i2 & 2) != 0 ? d41Var.b : list;
        long j3 = (i2 & 4) != 0 ? d41Var.c : j;
        int i3 = (i2 & 8) != 0 ? d41Var.d : i;
        String str5 = (i2 & 16) != 0 ? d41Var.e : str;
        Integer num2 = (i2 & 32) != 0 ? d41Var.f : num;
        String str6 = (i2 & 64) != 0 ? d41Var.g : str2;
        String str7 = (i2 & 128) != 0 ? d41Var.h : str3;
        String str8 = (i2 & 256) != 0 ? d41Var.i : str4;
        d22 d22Var2 = (i2 & 512) != 0 ? d41Var.j : d22Var;
        List list4 = (i2 & 1024) != 0 ? d41Var.k : list2;
        boolean z2 = (i2 & 2048) != 0 ? d41Var.l : z;
        boolean z3 = (i2 & 4096) != 0 ? d41Var.m : true;
        d41Var.getClass();
        list3.getClass();
        str5.getClass();
        d22Var2.getClass();
        list4.getClass();
        return new d41(j2, list3, j3, i3, str5, num2, str6, str7, str8, d22Var2, list4, z2, z3);
    }

    public final u22 b() {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((u22) next).a == this.c) {
                return (u22) next;
            }
        }
        next = null;
        return (u22) next;
    }

    public final boolean c() {
        u22 u22VarB = b();
        return (u22VarB == null || (u22VarB.e == null && u22VarB.f == null) || e22.b.contains(u22VarB.b)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d41)) {
            return false;
        }
        d41 d41Var = (d41) obj;
        return this.a == d41Var.a && ws0.j(this.b, d41Var.b) && this.c == d41Var.c && this.d == d41Var.d && this.e.equals(d41Var.e) && ws0.j(this.f, d41Var.f) && this.g.equals(d41Var.g) && this.h.equals(d41Var.h) && this.i.equals(d41Var.i) && this.j == d41Var.j && ws0.j(this.k, d41Var.k) && this.l == d41Var.l && this.m == d41Var.m;
    }

    public final int hashCode() {
        int iE = k3.e(k3.b(this.d, k3.c((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.m) + k3.f((this.k.hashCode() + ((this.j.hashCode() + k3.e(k3.e(k3.e((iE + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31, 31, this.l);
    }

    public final String toString() {
        return "LogServiceUiState(recordId=" + this.a + ", serviceTypes=" + this.b + ", selectedTypeId=" + this.c + ", epochDay=" + this.d + ", odometer=" + this.e + ", carOdometerKm=" + this.f + ", cost=" + this.g + ", quantity=" + this.h + ", note=" + this.i + ", action=" + this.j + ", companions=" + this.k + ", showTypeError=" + this.l + ", isSaved=" + this.m + ")";
    }
}

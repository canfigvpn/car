package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class hk0 {
    public static final gk0 Companion = new gk0();
    public static final rx0[] h;
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final List e;
    public final List f;
    public final mh g;

    static {
        m2 m2Var = new m2(23);
        v01 v01Var = v01.e;
        h = new rx0[]{null, null, null, null, vv.F(v01Var, m2Var), vv.F(v01Var, new m2(24)), null};
    }

    public /* synthetic */ hk0(int i, String str, int i2, int i3, String str2, List list, List list2, mh mhVar) {
        if (3 != (i & 3)) {
            qx.Z(i, 3, fk0.a.c());
            throw null;
        }
        this.a = str;
        this.b = i2;
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        int i4 = i & 16;
        cb0 cb0Var = cb0.e;
        if (i4 == 0) {
            this.e = cb0Var;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = cb0Var;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = mhVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0)) {
            return false;
        }
        hk0 hk0Var = (hk0) obj;
        return ws0.j(this.a, hk0Var.a) && this.b == hk0Var.b && this.c == hk0Var.c && ws0.j(this.d, hk0Var.d) && ws0.j(this.e, hk0Var.e) && ws0.j(this.f, hk0Var.f) && ws0.j(this.g, hk0Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + k3.e(k3.b(this.c, k3.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31)) * 31;
        mh mhVar = this.g;
        return iHashCode + (mhVar == null ? 0 : mhVar.hashCode());
    }

    public final String toString() {
        return "GarageBackup(app=" + this.a + ", format=" + this.b + ", exportedEpochDay=" + this.c + ", appVersion=" + this.d + ", serviceTypes=" + this.e + ", cars=" + this.f + ", settings=" + this.g + ")";
    }

    public hk0(String str, int i, int i2, String str2, List list, ArrayList arrayList, mh mhVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = list;
        this.f = arrayList;
        this.g = mhVar;
    }
}

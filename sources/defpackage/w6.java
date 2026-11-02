package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w6 {
    public final Context a;
    public final m40 b;
    public final long c;
    public final kj1 d;

    public w6(Context context, m40 m40Var, long j, kj1 kj1Var) {
        this.a = context;
        this.b = m40Var;
        this.c = j;
        this.d = kj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w6.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        w6 w6Var = (w6) obj;
        if (!ws0.j(this.a, w6Var.a) || !ws0.j(this.b, w6Var.b)) {
            return false;
        }
        long j = w6Var.c;
        int i = dr.h;
        return vk2.a(this.c, j) && this.d.equals(w6Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = dr.h;
        return this.d.hashCode() + k3.c(iHashCode, 31, this.c);
    }
}

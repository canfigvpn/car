package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class iz0 {
    public final ew1 a;
    public final r9 b;
    public final w91 c;

    public iz0(ew1 ew1Var, r9 r9Var) {
        this.a = ew1Var;
        this.b = r9Var;
        long[] jArr = jx1.a;
        this.c = new w91();
    }

    public final ij0 a(int i, Object obj, Object obj2) {
        w91 w91Var = this.c;
        hz0 hz0Var = (hz0) w91Var.g(obj);
        int i2 = 23;
        if (hz0Var != null && hz0Var.c == i && ws0.j(hz0Var.b, obj2)) {
            gt gtVar = hz0Var.d;
            if (gtVar != null) {
                return gtVar;
            }
            gt gtVar2 = new gt(new jd(i2, hz0Var.e, hz0Var), true, 818252804);
            hz0Var.d = gtVar2;
            return gtVar2;
        }
        hz0 hz0Var2 = new hz0(this, i, obj, obj2);
        w91Var.m(obj, hz0Var2);
        gt gtVar3 = hz0Var2.d;
        if (gtVar3 != null) {
            return gtVar3;
        }
        gt gtVar4 = new gt(new jd(i2, this, hz0Var2), true, 818252804);
        hz0Var2.d = gtVar4;
        return gtVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        hz0 hz0Var = (hz0) this.c.g(obj);
        if (hz0Var != null) {
            return hz0Var.b;
        }
        jz0 jz0Var = (jz0) this.b.a();
        int iE = jz0Var.e(obj);
        if (iE != -1) {
            return jz0Var.c(iE);
        }
        return null;
    }
}

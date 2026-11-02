package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hi2 implements gi2 {
    public final Object a;
    public final Object b;

    public hi2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.gi2
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.gi2
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gi2)) {
            return false;
        }
        gi2 gi2Var = (gi2) obj;
        return ws0.j(this.a, gi2Var.a()) && ws0.j(this.b, gi2Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vu1 implements bp0 {
    public final boolean a;
    public final float b;
    public final long c;

    public vu1(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.bp0
    public final b40 a(ur0 ur0Var) {
        return new h40(ur0Var, this.a, this.b, new g40(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu1)) {
            return false;
        }
        vu1 vu1Var = (vu1) obj;
        if (this.a != vu1Var.a || !w60.b(this.b, vu1Var.b)) {
            return false;
        }
        long j = vu1Var.c;
        int i = dr.h;
        return vk2.a(this.c, j);
    }

    @Override // defpackage.bp0
    public final int hashCode() {
        int iA = k3.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = dr.h;
        return Long.hashCode(this.c) + iA;
    }
}

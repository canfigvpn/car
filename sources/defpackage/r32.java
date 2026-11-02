package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 extends y71 {
    public final u32 a;
    public final boolean b;
    public final long c;
    public final long d;

    public r32(u32 u32Var, boolean z, long j, long j2) {
        this.a = u32Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r32)) {
            return false;
        }
        r32 r32Var = (r32) obj;
        if (!w60.b(3.0f, 3.0f) || !ws0.j(this.a, r32Var.a) || this.b != r32Var.b) {
            return false;
        }
        long j = r32Var.c;
        int i = dr.h;
        return vk2.a(this.c, j) && vk2.a(this.d, r32Var.d);
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new aj(new y3(20, this));
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        me1 me1Var;
        aj ajVar = (aj) t71Var;
        y3 y3Var = new y3(20, this);
        ajVar.s = y3Var;
        if (ajVar.e.r && (me1Var = qx.T(ajVar, 2).t) != null) {
            me1Var.r1(y3Var, true);
        }
    }

    public final int hashCode() {
        int iF = k3.f((this.a.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.b);
        int i = dr.h;
        return Long.hashCode(this.d) + k3.c(iF, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) w60.c(3.0f));
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        sb.append(this.b);
        sb.append(", ambientColor=");
        k3.r(this.c, sb, ", spotColor=");
        sb.append((Object) dr.h(this.d));
        sb.append(')');
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ig extends y71 {
    public final long a;
    public final u32 b;

    public ig(long j, u32 u32Var) {
        this.a = j;
        this.b = u32Var;
    }

    public final boolean equals(Object obj) {
        ig igVar = obj instanceof ig ? (ig) obj : null;
        if (igVar == null) {
            return false;
        }
        long j = igVar.a;
        int i = dr.h;
        return vk2.a(this.a, j) && ws0.j(this.b, igVar.b);
    }

    @Override // defpackage.y71
    public final t71 f() {
        jg jgVar = new jg();
        jgVar.s = this.a;
        jgVar.t = this.b;
        jgVar.u = 9205357640488583168L;
        return jgVar;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        jg jgVar = (jg) t71Var;
        jgVar.s = this.a;
        u32 u32Var = jgVar.t;
        u32 u32Var2 = this.b;
        if (!ws0.j(u32Var, u32Var2)) {
            jgVar.t = u32Var2;
            n02.l(jgVar);
        }
        vv.B(jgVar);
    }

    public final int hashCode() {
        int i = dr.h;
        return this.b.hashCode() + k3.a(1.0f, Long.hashCode(this.a) * 961, 31);
    }
}

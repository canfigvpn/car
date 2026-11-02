package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a52 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final Object d;

    public a52(boolean z, vz1 vz1Var, vp vpVar) {
        this.a = 0;
        this.b = z;
        this.c = vz1Var;
        this.d = vpVar;
    }

    public nz a() {
        vp vpVar = (vp) this.d;
        int i = vpVar.b;
        int i2 = vpVar.c;
        if (i < i2) {
            return nz.f;
        }
        return i > i2 ? nz.e : nz.g;
    }

    public void b() {
        if (this.b) {
            ((me2) this.d).n((of2) this.c);
        }
    }

    public long c(te2 te2Var, long j, boolean z, fu1 fu1Var) {
        me2 me2Var = (me2) this.d;
        long jV = me2Var.v(te2Var, j, z, false, fu1Var, false);
        if (!of2.a(jV, (of2) this.c)) {
            this.b = false;
        }
        me2Var.r(of2.c(jV) ? sl0.g : sl0.f);
        return jV;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + a() + ", info=\n\t" + ((vp) this.d) + ')';
            default:
                return super.toString();
        }
    }

    public a52(me2 me2Var) {
        this.a = 1;
        this.d = me2Var;
        this.b = true;
    }
}

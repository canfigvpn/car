package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dw1 implements ss1 {
    public ww1 e;
    public gw1 f;
    public String g;
    public Object h;
    public Object[] i;
    public ud j;
    public final w8 k = new w8(24, this);

    public dw1(ww1 ww1Var, gw1 gw1Var, String str, Object obj, Object[] objArr) {
        this.e = ww1Var;
        this.f = gw1Var;
        this.g = str;
        this.h = obj;
        this.i = objArr;
    }

    @Override // defpackage.ss1
    public final void a() {
        b();
    }

    public final void b() {
        String strS;
        gw1 gw1Var = this.f;
        if (this.j != null) {
            fu1.f(this.j, ") is not null", "entry(");
            return;
        }
        if (gw1Var != null) {
            w8 w8Var = this.k;
            Object objA = w8Var.a();
            if (objA == null || gw1Var.d(objA)) {
                this.j = gw1Var.a(this.g, w8Var);
                return;
            }
            if (objA instanceof b72) {
                b72 b72Var = (b72) objA;
                if (b72Var.e() == q90.U || b72Var.e() == is1.o || b72Var.e() == is1.f) {
                    strS = "MutableState containing " + b72Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strS = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strS = ex.s(objA);
            }
            throw new IllegalArgumentException(strS);
        }
    }

    @Override // defpackage.ss1
    public final void c() {
        ud udVar = this.j;
        if (udVar != null) {
            udVar.A();
        }
    }

    @Override // defpackage.ss1
    public final void e() {
        ud udVar = this.j;
        if (udVar != null) {
            udVar.A();
        }
    }
}

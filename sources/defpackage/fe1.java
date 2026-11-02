package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fe1 {
    public t71 a;
    public int b;
    public fa1 c;
    public fa1 d;
    public boolean e;
    public final /* synthetic */ he1 f;

    public fe1(he1 he1Var, t71 t71Var, int i, fa1 fa1Var, fa1 fa1Var2, boolean z) {
        this.f = he1Var;
        this.a = t71Var;
        this.b = i;
        this.c = fa1Var;
        this.d = fa1Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        fa1 fa1Var = this.c;
        int i3 = this.b;
        s71 s71Var = (s71) fa1Var.e[i + i3];
        s71 s71Var2 = (s71) this.d.e[i3 + i2];
        return ws0.j(s71Var, s71Var2) || s71Var.getClass() == s71Var2.getClass();
    }
}

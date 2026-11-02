package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class re1 {
    public final fa1 a = new fa1(new ee1[16]);
    public final p91 b = new p91(10);

    public boolean a(t41 t41Var, jw0 jw0Var, dq0 dq0Var, boolean z) {
        fa1 fa1Var = this.a;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((ee1) objArr[i2]).a(t41Var, jw0Var, dq0Var, z) || z2;
        }
        return z2;
    }

    public void b(dq0 dq0Var) {
        fa1 fa1Var = this.a;
        int i = fa1Var.g;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((ee1) fa1Var.e[i]).d.b == 0) {
                fa1Var.k(i);
            }
        }
    }
}

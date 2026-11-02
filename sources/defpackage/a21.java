package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a21 {
    public r11 a;
    public w11 b;

    public final void a(y11 y11Var, q11 q11Var) {
        r11 r11VarA = q11Var.a();
        r11 r11Var = this.a;
        if (r11VarA.compareTo(r11Var) < 0) {
            r11Var = r11VarA;
        }
        this.a = r11Var;
        this.b.j(y11Var, q11Var);
        this.a = r11VarA;
    }
}

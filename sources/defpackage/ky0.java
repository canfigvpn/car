package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ky0 {
    public final /* synthetic */ int a;
    public final ak1 b;
    public final ak1 c;
    public boolean d;
    public Object e;
    public final oz0 f;

    public ky0(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new ak1(i);
                this.c = new ak1(i2);
                this.f = new oz0(i, 30, 100);
                break;
            default:
                this.b = new ak1(i);
                this.c = new ak1(i2);
                this.f = new oz0(i, 90, 200);
                break;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        ak1 ak1Var = this.c;
        oz0 oz0Var = this.f;
        ak1 ak1Var2 = this.b;
        switch (i3) {
            case 0:
                if (i < 0.0f) {
                    yp0.a("Index should be non-negative");
                }
                ak1Var2.i(i);
                oz0Var.a(i);
                ak1Var.i(i2);
                break;
            default:
                if (i < 0.0f) {
                    yp0.a("Index should be non-negative (" + i + ')');
                }
                ak1Var2.i(i);
                oz0Var.a(i);
                ak1Var.i(i2);
                break;
        }
    }
}

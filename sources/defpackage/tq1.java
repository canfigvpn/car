package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq1 {
    public final w01 a;

    public tq1(ti0 ti0Var) {
        this.a = new w01(ti0Var);
    }

    public abstract vq1 a(Object obj);

    public cm2 b() {
        return this.a;
    }

    public final cm2 c(vq1 vq1Var, cm2 cm2Var) {
        b90 b90Var;
        cm2 cm2Var2 = null;
        cm2Var2 = null;
        cm2Var2 = null;
        cm2Var2 = null;
        cm2Var2 = null;
        cm2Var2 = null;
        if (cm2Var instanceof b90) {
            if (vq1Var.d) {
                b90Var = (b90) cm2Var;
                b90Var.a.setValue(vq1Var.a());
            }
        } else if (cm2Var instanceof y82) {
            if ((vq1Var.b || vq1Var.e != null) && !vq1Var.d) {
                y82 y82Var = (y82) cm2Var;
                if (ws0.j(vq1Var.a(), y82Var.a)) {
                    cm2Var2 = y82Var;
                }
            }
        } else if (cm2Var instanceof aw) {
            vq1Var.getClass();
        }
        if (cm2Var2 != null) {
            cm2Var2 = b90Var;
            return cm2Var2;
        }
        if (!vq1Var.d) {
            cm2Var2 = b90Var;
            return new y82(vq1Var.a());
        }
        Object obj = vq1Var.e;
        d72 d72Var = vq1Var.c;
        if (d72Var == null) {
            cm2Var2 = b90Var;
            d72Var = is1.o;
        }
        cm2Var2 = b90Var;
        return new b90(new dk1(obj, d72Var));
    }
}

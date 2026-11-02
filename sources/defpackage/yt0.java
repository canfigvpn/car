package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yt0 {
    public static final xt0 d = new xt0(new eu0(false, false, true, "    ", "type", true, zp.f), vs0.D);
    public final eu0 a;
    public final iq1 b;
    public final ao2 c = new ao2(15, (byte) 0);

    public yt0(eu0 eu0Var, iq1 iq1Var) {
        this.a = eu0Var;
        this.b = iq1Var;
    }

    public final Object a(mv0 mv0Var, String str) {
        mv0Var.getClass();
        fc1 fc1Var = new fc1(str);
        Object objF = new b92(this, gr2.OBJ, fc1Var, mv0Var.c()).f(mv0Var);
        if (fc1Var.e() == 10) {
            return objF;
        }
        fc1.l(fc1Var, "Expected EOF after parsing, but had " + str.charAt(fc1Var.b - 1) + " instead", 0, null, 6);
        throw null;
    }
}

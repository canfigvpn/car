package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ik0 {
    public static final pu0 a;

    static {
        xt0 xt0Var = yt0.d;
        xt0Var.getClass();
        eu0 eu0Var = xt0Var.a;
        String str = eu0Var.d;
        String str2 = eu0Var.e;
        zp zpVar = eu0Var.g;
        boolean z = eu0Var.f;
        iq1 iq1Var = xt0Var.b;
        if (!str.equals("    ")) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                    qj.f("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                    return;
                }
            }
        }
        eu0 eu0Var2 = new eu0(true, true, false, str, str2, z, zpVar);
        iq1Var.getClass();
        a = new pu0(eu0Var2, iq1Var);
    }
}

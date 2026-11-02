package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j42 {
    public static final a90 a = new a90(1, new vr0(27));

    public static final u32 a(y32 y32Var, ak0 ak0Var) {
        i42 i42Var = (i42) ak0Var.j(a);
        switch (y32Var.ordinal()) {
            case 0:
                return i42Var.h;
            case 1:
                return i42Var.e;
            case 2:
                return i42Var.g;
            case 3:
                return b(i42Var.e);
            case 4:
                return i42Var.a;
            case 5:
                return b(i42Var.a);
            case 6:
                return kv1.a;
            case 7:
                return i42Var.d;
            case 8:
                jv1 jv1Var = i42Var.d;
                x60 x60Var = x32.i;
                return jv1.b(jv1Var, x60Var, null, null, x60Var, 6);
            case 9:
                return i42Var.f;
            case 10:
                jv1 jv1Var2 = i42Var.d;
                x60 x60Var2 = x32.i;
                return jv1.b(jv1Var2, null, x60Var2, x60Var2, null, 9);
            case 11:
                return b(i42Var.d);
            case 12:
                return i42Var.c;
            case 13:
                return vs0.C;
            case 14:
                return i42Var.b;
            default:
                qj.p();
                return null;
        }
    }

    public static jv1 b(jv1 jv1Var) {
        x60 x60Var = x32.i;
        return jv1.b(jv1Var, null, null, x60Var, x60Var, 3);
    }
}

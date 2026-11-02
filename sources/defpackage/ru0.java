package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 implements mv0 {
    public static final ru0 a = new ru0();
    public static final yp1 b;

    static {
        xp1 xp1Var = xp1.j;
        if (h92.I("kotlinx.serialization.json.JsonLiteral")) {
            qj.r("Blank serial names are prohibited");
            return;
        }
        Object it = ((z51) zp1.a.values()).iterator();
        while (((w51) it).hasNext()) {
            mv0 mv0Var = (mv0) ((u51) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(mv0Var.c().b())) {
                qj.r(i92.s("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + js1.a(mv0Var.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new yp1("kotlinx.serialization.json.JsonLiteral", xp1Var);
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        iu0 iu0VarN0 = qx.k(n20Var).n0();
        if (iu0VarN0 instanceof qu0) {
            return (qu0) iu0VarN0;
        }
        throw ux.c(-1, "Unexpected JSON element, expected JsonLiteral, had " + js1.a(iu0VarN0.getClass()), iu0VarN0.toString());
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        Double dValueOf;
        qu0 qu0Var = (qu0) obj;
        qu0Var.getClass();
        String str = qu0Var.f;
        qx.l(p61Var);
        if (qu0Var.e) {
            p61Var.Q(str);
            return;
        }
        Long lB = o92.B(str);
        if (lB != null) {
            p61Var.J(lB.longValue());
            return;
        }
        vk2 vk2VarS = r02.s(str);
        if (vk2VarS != null) {
            p61Var.F(zk2.b).J(vk2VarS.e);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = n92.u(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            p61Var.B(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            p61Var.y(bool.booleanValue());
        } else {
            p61Var.Q(str);
        }
    }
}

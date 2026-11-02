package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb0 {
    public static final mj2 a = new mj2(x4.z, x4.A);
    public static final g82 b = s5.T(0.0f, 400.0f, null, 5);
    public static final g82 c;
    public static final g82 d;

    static {
        s5.T(0.0f, 400.0f, null, 5);
        Map map = ho2.a;
        c = s5.T(0.0f, 400.0f, new ir0(4294967297L), 1);
        d = s5.T(0.0f, 400.0f, new qr0(4294967297L), 1);
    }

    public static sb0 a(g82 g82Var, ui uiVar, int i) {
        wi wiVar;
        ui uiVar2 = q90.t;
        int i2 = 1;
        if ((i & 1) != 0) {
            Map map = ho2.a;
            g82Var = s5.T(0.0f, 400.0f, new qr0(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            uiVar = uiVar2;
        }
        if (ws0.j(uiVar, q90.r)) {
            wiVar = q90.i;
        } else {
            wiVar = ws0.j(uiVar, uiVar2) ? q90.k : q90.j;
        }
        return b(wiVar, g82Var, new je1(i2, 19));
    }

    public static final sb0 b(t3 t3Var, ld0 ld0Var, ej0 ej0Var) {
        return new sb0(new li2((zc0) null, (i52) null, new jo(t3Var, ld0Var, ej0Var), (hx1) null, (LinkedHashMap) null, 123));
    }

    public static sb0 c(ld0 ld0Var, int i) {
        if ((i & 1) != 0) {
            ld0Var = s5.T(0.0f, 400.0f, null, 5);
        }
        return new sb0(new li2(new zc0(0.0f, ld0Var), (i52) null, (jo) null, (hx1) null, (LinkedHashMap) null, 126));
    }

    public static kc0 d(ld0 ld0Var, int i) {
        if ((i & 1) != 0) {
            ld0Var = s5.T(0.0f, 400.0f, null, 5);
        }
        return new kc0(new li2(new zc0(0.0f, ld0Var), (i52) null, (jo) null, (hx1) null, (LinkedHashMap) null, 126));
    }

    public static kc0 e(g82 g82Var, ui uiVar, int i) {
        wi wiVar;
        ui uiVar2 = q90.t;
        int i2 = 1;
        if ((i & 1) != 0) {
            Map map = ho2.a;
            g82Var = s5.T(0.0f, 400.0f, new qr0(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            uiVar = uiVar2;
        }
        if (ws0.j(uiVar, q90.r)) {
            wiVar = q90.i;
        } else {
            wiVar = ws0.j(uiVar, uiVar2) ? q90.k : q90.j;
        }
        return f(wiVar, g82Var, new je1(i2, 20));
    }

    public static final kc0 f(t3 t3Var, ld0 ld0Var, ej0 ej0Var) {
        return new kc0(new li2((zc0) null, (i52) null, new jo(t3Var, ld0Var, ej0Var), (hx1) null, (LinkedHashMap) null, 123));
    }

    public static final sb0 g(ej0 ej0Var, g82 g82Var) {
        return new sb0(new li2((zc0) null, new i52(new mb0(ej0Var, 2), g82Var), (jo) null, (hx1) null, (LinkedHashMap) null, 125));
    }

    public static final kc0 h(ej0 ej0Var, g82 g82Var) {
        return new kc0(new li2((zc0) null, new i52(new mb0(ej0Var, 3), g82Var), (jo) null, (hx1) null, (LinkedHashMap) null, 125));
    }
}

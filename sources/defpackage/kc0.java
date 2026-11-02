package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kc0 {
    public static final kc0 b = new kc0(new li2((zc0) null, (i52) null, (jo) null, (hx1) null, (LinkedHashMap) null, 127));
    public static final kc0 c = new kc0(new li2((zc0) null, (i52) null, (jo) null, (hx1) null, (LinkedHashMap) null, 95));
    public final li2 a;

    public kc0(li2 li2Var) {
        this.a = li2Var;
    }

    public final kc0 a(kc0 kc0Var) {
        li2 li2Var = kc0Var.a;
        zc0 zc0Var = li2Var.a;
        li2 li2Var2 = this.a;
        if (zc0Var == null) {
            zc0Var = li2Var2.a;
        }
        i52 i52Var = li2Var.b;
        if (i52Var == null) {
            i52Var = li2Var2.b;
        }
        jo joVar = li2Var.c;
        if (joVar == null) {
            joVar = li2Var2.c;
        }
        hx1 hx1Var = li2Var.d;
        if (hx1Var == null) {
            hx1Var = li2Var2.d;
        }
        boolean z = li2Var.e || li2Var2.e;
        Map map = li2Var2.f;
        Map map2 = li2Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new kc0(new li2(zc0Var, i52Var, joVar, hx1Var, z, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kc0) && ((kc0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        li2 li2Var = this.a;
        zc0 zc0Var = li2Var.a;
        sb.append(zc0Var != null ? zc0Var.toString() : null);
        sb.append(",\nSlide - ");
        i52 i52Var = li2Var.b;
        sb.append(i52Var != null ? i52Var.toString() : null);
        sb.append(",\nShrink - ");
        jo joVar = li2Var.c;
        sb.append(joVar != null ? joVar.toString() : null);
        sb.append(",\nScale - ");
        hx1 hx1Var = li2Var.d;
        sb.append(hx1Var != null ? hx1Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(li2Var.e);
        return sb.toString();
    }
}

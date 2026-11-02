package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class li2 {
    public final zc0 a;
    public final i52 b;
    public final jo c;
    public final hx1 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ li2(zc0 zc0Var, i52 i52Var, jo joVar, hx1 hx1Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : zc0Var, (i & 2) != 0 ? null : i52Var, (i & 4) != 0 ? null : joVar, (i & 8) != 0 ? null : hx1Var, (i & 32) == 0, (i & 64) != 0 ? db0.e : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        return ws0.j(this.a, li2Var.a) && ws0.j(this.b, li2Var.b) && ws0.j(this.c, li2Var.c) && ws0.j(this.d, li2Var.d) && this.e == li2Var.e && ws0.j(this.f, li2Var.f);
    }

    public final int hashCode() {
        zc0 zc0Var = this.a;
        int iHashCode = (zc0Var == null ? 0 : zc0Var.hashCode()) * 31;
        i52 i52Var = this.b;
        int iHashCode2 = (iHashCode + (i52Var == null ? 0 : i52Var.hashCode())) * 31;
        jo joVar = this.c;
        int iHashCode3 = (iHashCode2 + (joVar == null ? 0 : joVar.hashCode())) * 31;
        hx1 hx1Var = this.d;
        return this.f.hashCode() + k3.f((iHashCode3 + (hx1Var != null ? hx1Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public li2(zc0 zc0Var, i52 i52Var, jo joVar, hx1 hx1Var, boolean z, Map map) {
        this.a = zc0Var;
        this.b = i52Var;
        this.c = joVar;
        this.d = hx1Var;
        this.e = z;
        this.f = map;
    }
}

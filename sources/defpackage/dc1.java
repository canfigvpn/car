package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 extends ac1 {
    public final rd1 g;
    public final Object h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(rd1 rd1Var, Object obj, Map map) {
        super(rd1Var.b(ix.C(hc1.class)), null, map);
        rd1Var.getClass();
        obj.getClass();
        map.getClass();
        this.i = new ArrayList();
        this.g = rd1Var;
        this.h = obj;
    }

    public final cc1 c() {
        int iHashCode;
        cc1 cc1Var = (cc1) super.a();
        fc1 fc1Var = cc1Var.j;
        fc1Var.getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zb1 zb1Var = (zb1) obj;
            if (zb1Var != null) {
                v72 v72Var = (v72) fc1Var.f;
                cc1 cc1Var2 = (cc1) fc1Var.e;
                pc pcVar = cc1Var2.f;
                pc pcVar2 = zb1Var.f;
                int i2 = pcVar2.a;
                String str = (String) pcVar2.e;
                if (i2 == 0 && str == null) {
                    qj.r("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) pcVar.e;
                if (str2 != null && ws0.j(str, str2)) {
                    qj.k("Destination ", zb1Var, " cannot have the same route as graph ", cc1Var2);
                    return null;
                }
                if (i2 == pcVar.a) {
                    qj.k("Destination ", zb1Var, " cannot have the same id as graph ", cc1Var2);
                    return null;
                }
                zb1 zb1Var2 = (zb1) s5.B(v72Var, i2);
                if (zb1Var2 == zb1Var) {
                    continue;
                } else {
                    if (zb1Var.g != null) {
                        fu1.h("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (zb1Var2 != null) {
                        zb1Var2.g = null;
                    }
                    zb1Var.g = cc1Var2;
                    v72Var.c(pcVar2.a, zb1Var);
                }
            }
        }
        Object obj2 = this.h;
        if (obj2 == null) {
            if (this.c != null) {
                fu1.h("You must set a start destination route");
                return null;
            }
            fu1.h("You must set a start destination id");
            return null;
        }
        mv0 mv0VarM = c22.m(js1.a(obj2.getClass()));
        int iC = sv.C(mv0VarM);
        zb1 zb1VarM = fc1Var.m(iC);
        if (zb1VarM == null) {
            qj.h(mv0VarM.c().b(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
            return null;
        }
        Map mapB = zb1VarM.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(h61.e0(mapB.size()));
        for (Map.Entry entry : mapB.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((jb1) entry.getValue()).a);
        }
        String strE = sv.E(obj2, linkedHashMap);
        cc1 cc1Var3 = (cc1) fc1Var.e;
        if (strE != null) {
            if (strE.equals((String) cc1Var3.f.e)) {
                qj.k("Start destination ", strE, " cannot use the same route as the graph ", cc1Var3);
            } else if (h92.I(strE)) {
                qj.r("Cannot have an empty start destination route");
            } else {
                int i3 = zb1.i;
                iHashCode = "android-app://androidx.navigation/".concat(strE).hashCode();
            }
            fc1Var.b = iC;
            return cc1Var;
        }
        iHashCode = 0;
        fc1Var.b = iHashCode;
        fc1Var.d = strE;
        fc1Var.b = iC;
        return cc1Var;
    }
}

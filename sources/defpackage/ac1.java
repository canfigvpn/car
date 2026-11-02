package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac1 {
    public final qd1 a;
    public final int b;
    public final String c;
    public final LinkedHashMap d;
    public final ArrayList e;
    public final LinkedHashMap f;

    public ac1(qd1 qd1Var, aq aqVar, Map map) throws Throwable {
        int iC = aqVar != null ? sv.C(c22.m(aqVar)) : -1;
        int i = 0;
        String str = null;
        if (aqVar != null) {
            mv0 mv0VarM = c22.m(aqVar);
            if (mv0VarM instanceof fo1) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                aq aqVarS = ei1.s(((fo1) mv0VarM).c());
                sb.append(aqVarS != null ? aqVarS.c() : null);
                sb.append(". Routes can only be generated from concrete classes or objects.");
                throw new IllegalArgumentException(sb.toString());
            }
            e4 e4Var = new e4(mv0VarM);
            ji0 ji0Var = new ji0(10, e4Var);
            int iD = mv0VarM.c().d();
            for (int i2 = 0; i2 < iD; i2++) {
                String strE = mv0VarM.c().e(i2);
                xc1 xc1VarV = sv.v(mv0VarM.c().j(i2), map);
                if (xc1VarV == null) {
                    qj.r(sv.Y(strE, mv0VarM.c().j(i2).b(), mv0VarM.c().b(), map.toString()));
                    throw null;
                }
                ji0Var.d(Integer.valueOf(i2), strE, xc1VarV);
            }
            str = ((String) e4Var.f) + ((String) e4Var.g) + ((String) e4Var.h);
        }
        this.a = qd1Var;
        this.b = iC;
        this.c = str;
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
        this.f = new LinkedHashMap();
        if (aqVar != null) {
            ArrayList arrayListD = sv.D(c22.m(aqVar), map);
            int size = arrayListD.size();
            while (i < size) {
                Object obj = arrayListD.get(i);
                i++;
                hb1 hb1Var = (hb1) obj;
                this.d.put(hb1Var.a, hb1Var.b);
            }
        }
    }

    public zb1 a() {
        zb1 zb1VarB = b();
        zb1VarB.getClass();
        pc pcVar = zb1VarB.f;
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            jb1 jb1Var = (jb1) entry.getValue();
            str.getClass();
            jb1Var.getClass();
            pcVar.getClass();
            ((LinkedHashMap) pcVar.d).put(str, jb1Var);
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            final xb1 xb1Var = (xb1) obj;
            xb1Var.getClass();
            pcVar.getClass();
            ArrayList arrayListF = mx.F((LinkedHashMap) pcVar.d, new ej0() { // from class: bc1
                @Override // defpackage.ej0
                public final Object h(Object obj2) {
                    boolean zContains;
                    int i3 = i;
                    xb1 xb1Var2 = xb1Var;
                    String str2 = (String) obj2;
                    switch (i3) {
                        case 0:
                            str2.getClass();
                            zContains = xb1Var2.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = xb1Var2.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListF.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + xb1Var.a + " can't be used to open destination " + ((zb1) pcVar.b) + ".\nFollowing required arguments are missing: " + arrayListF).toString());
            }
            ((ArrayList) pcVar.c).add(xb1Var);
        }
        Iterator it = this.f.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            fu1.c();
            return null;
        }
        String str2 = this.c;
        if (str2 != null) {
            pcVar.getClass();
            if (h92.I(str2)) {
                qj.r("Cannot have an empty route");
                return null;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            final xb1 xb1Var2 = new xb1(strConcat);
            final int i3 = 1;
            ArrayList arrayListF2 = mx.F((LinkedHashMap) pcVar.d, new ej0() { // from class: bc1
                @Override // defpackage.ej0
                public final Object h(Object obj2) {
                    boolean zContains;
                    int i4 = i3;
                    xb1 xb1Var3 = xb1Var2;
                    String str3 = (String) obj2;
                    switch (i4) {
                        case 0:
                            str3.getClass();
                            zContains = xb1Var3.c().contains(str3);
                            break;
                        default:
                            str3.getClass();
                            zContains = xb1Var3.c().contains(str3);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListF2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((zb1) pcVar.b) + ". Following required arguments are missing: " + arrayListF2).toString());
            }
            pcVar.f = new hb2(new w8(17, strConcat));
            pcVar.a = strConcat.hashCode();
            pcVar.e = str2;
        }
        int i4 = this.b;
        if (i4 != -1) {
            pcVar.a = i4;
        }
        return zb1VarB;
    }

    public zb1 b() {
        return this.a.a();
    }
}

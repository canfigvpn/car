package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bm0 extends o {
    public final mv0 a;
    public final mv0 b;
    public final /* synthetic */ int c;
    public final am0 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bm0(mv0 mv0Var, mv0 mv0Var2, int i) {
        this(mv0Var, mv0Var2, (byte) 0);
        this.c = i;
        mv0Var.getClass();
        mv0Var2.getClass();
        switch (i) {
            case 1:
                this(mv0Var, mv0Var2, (byte) 0);
                s12 s12VarC = mv0Var.c();
                s12 s12VarC2 = mv0Var2.c();
                s12VarC.getClass();
                s12VarC2.getClass();
                this.d = new am0("kotlin.collections.LinkedHashMap", s12VarC, s12VarC2);
                break;
            default:
                s12 s12VarC3 = mv0Var.c();
                s12 s12VarC4 = mv0Var2.c();
                s12VarC3.getClass();
                s12VarC4.getClass();
                this.d = new am0("kotlin.collections.HashMap", s12VarC3, s12VarC4);
                break;
        }
    }

    @Override // defpackage.mv0
    public final s12 c() {
        int i = this.c;
        return this.d;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        h(obj);
        s12 s12VarC = c();
        s12VarC.getClass();
        p61 p61VarU = p61Var.u(s12VarC);
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            p61VarU.N(c(), i, this.a, key);
            i += 2;
            p61VarU.N(c(), i2, this.b, value);
        }
        p61VarU.T(s12VarC);
    }

    @Override // defpackage.o
    public final Object e() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.o
    public final int f(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.o
    public final Iterator g(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.o
    public final int h(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objU = jvVar.u(c(), i, this.a, null);
        int iH = jvVar.h(c());
        if (iH != i + 1) {
            qj.f(k3.h(i, iH, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objU);
        mv0 mv0Var = this.b;
        map.put(objU, (!zContainsKey || (mv0Var.c().c() instanceof xp1)) ? jvVar.u(c(), iH, mv0Var, null) : jvVar.u(c(), iH, mv0Var, h61.d0(objU, map)));
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.o
    public final Object l(Object obj) {
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public bm0(mv0 mv0Var, mv0 mv0Var2, byte b) {
        this.a = mv0Var;
        this.b = mv0Var2;
    }
}

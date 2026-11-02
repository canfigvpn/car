package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class md1 {
    public final s82 a = j20.f(nd1.e);
    public final s82 b;
    public final jr1 c;
    public final le d;
    public final le e;
    public jd1 f;
    public int g;
    public ld1 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public md1() {
        s82 s82VarF = j20.f(new kd1());
        this.b = s82VarF;
        this.c = new jr1(s82VarF);
        this.d = new le();
        this.e = new le();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(e4 e4Var, ld1 ld1Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        e4Var.getClass();
        if (ld1Var.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(ld1Var);
            e4 e4Var2 = ld1Var.a;
            sb.append("' is already added to dispatcher ");
            sb.append(e4Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.i : this.j;
        } else {
            linkedHashSet = this.k;
        }
        linkedHashSet.add(ld1Var);
        ld1Var.a = e4Var;
        ((kd1) this.c.e.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        ld1Var.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        kd1 kd1Var;
        le leVar = this.d;
        if (!leVar.isEmpty()) {
            Iterator it = leVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((jd1) it.next()).b) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        le leVar2 = this.e;
        if (!leVar2.isEmpty()) {
            Iterator it2 = leVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((jd1) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((ld1) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((ld1) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((ld1) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        jd1 jd1VarC = this.f;
        if (jd1VarC == null) {
            jd1VarC = c(0);
        }
        jd1 jd1VarC2 = this.f;
        if (jd1VarC2 == null) {
            jd1VarC2 = c(0);
        }
        if (ws0.j(jd1VarC2, jd1VarC)) {
            if (jd1VarC2 == null) {
                kd1Var = new kd1();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = leVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((jd1) it6.next()).b;
                }
                Iterator<E> it7 = leVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((jd1) it7.next()).b;
                }
                vv vvVar = jd1VarC2.a;
                z21 z21VarL = vs0.l();
                ar.I(arrayList, z21VarL);
                z21VarL.add(vvVar);
                ar.I(cb0.e, z21VarL);
                kd1Var = new kd1(arrayList.size(), vs0.i(z21VarL));
            }
            s82 s82Var = this.b;
            if (ws0.j((kd1) s82Var.getValue(), kd1Var)) {
                return;
            }
            s82Var.j(null, kd1Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((ld1) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((ld1) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((ld1) it10.next()).getClass();
            }
        }
    }

    public final jd1 c(int i) {
        Object next;
        Object next2;
        le leVar = this.e;
        le leVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = leVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((jd1) next).b);
            jd1 jd1Var = (jd1) next;
            if (jd1Var != null) {
                return jd1Var;
            }
            for (Object obj2 : leVar) {
                if (((jd1) obj2).b) {
                    obj = obj2;
                    break;
                }
            }
            return (jd1) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = leVar2.iterator();
            while (it2.hasNext()) {
                ((jd1) it2.next()).getClass();
            }
            Iterator it3 = leVar.iterator();
            while (it3.hasNext()) {
                ((jd1) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = leVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((jd1) next2).b);
        jd1 jd1Var2 = (jd1) next2;
        if (jd1Var2 != null) {
            return jd1Var2;
        }
        for (Object obj3 : leVar) {
            if (((jd1) obj3).b) {
                obj = obj3;
                break;
            }
        }
        return (jd1) obj;
    }
}

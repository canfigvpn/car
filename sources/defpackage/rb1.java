package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rb1 {
    public final ic1 a;
    public final cb1 b;
    public cc1 c;
    public Bundle d;
    public Bundle[] e;
    public final le f = new le();
    public final s82 g;
    public final s82 h;
    public final jr1 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public y11 n;
    public sb1 o;
    public final ArrayList p;
    public r11 q;
    public final q1 r;
    public final rd1 s;
    public final LinkedHashMap t;
    public ej0 u;
    public e71 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final n42 z;

    public rb1(ic1 ic1Var, cb1 cb1Var) {
        this.a = ic1Var;
        this.b = cb1Var;
        cb0 cb0Var = cb0.e;
        this.g = j20.f(cb0Var);
        s82 s82VarF = j20.f(cb0Var);
        this.h = s82VarF;
        this.i = new jr1(s82VarF);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = r11.f;
        this.r = new q1(1, this);
        this.s = new rd1();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = ws0.f(2, vk.f);
    }

    public static zb1 d(int i, zb1 zb1Var, zb1 zb1Var2, boolean z) {
        if (zb1Var.f.a == i && (zb1Var2 == null || (zb1Var.equals(zb1Var2) && ws0.j(zb1Var.g, zb1Var2.g)))) {
            return zb1Var;
        }
        cc1 cc1Var = zb1Var instanceof cc1 ? (cc1) zb1Var : null;
        if (cc1Var == null) {
            cc1Var = zb1Var.g;
            cc1Var.getClass();
        }
        return cc1Var.j.o(i, cc1Var, zb1Var2, z);
    }

    public static /* synthetic */ void o(rb1 rb1Var, kb1 kb1Var) {
        rb1Var.n(kb1Var, false, new le());
    }

    public final void a(zb1 zb1Var, Bundle bundle, kb1 kb1Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        b7 b7Var = this.a.c;
        zb1 zb1Var2 = kb1Var.f;
        boolean z = zb1Var2 instanceof g50;
        le leVar = this.f;
        if (!z) {
            while (!leVar.isEmpty() && (((kb1) leVar.last()).f instanceof g50) && m(((kb1) leVar.last()).f.f.a, true, false)) {
            }
        }
        le<kb1> leVar2 = new le();
        Object obj = null;
        if (zb1Var instanceof cc1) {
            zb1 zb1Var3 = zb1Var2;
            do {
                zb1Var3.getClass();
                zb1Var3 = zb1Var3.g;
                if (zb1Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!ws0.j(((kb1) objPrevious2).f, zb1Var3));
                    kb1 kb1VarG = (kb1) objPrevious2;
                    if (kb1VarG == null) {
                        kb1VarG = w40.g(b7Var, zb1Var3, bundle, h(), this.o);
                    }
                    leVar2.addFirst(kb1VarG);
                    if (!leVar.isEmpty() && ((kb1) leVar.last()).f == zb1Var3) {
                        o(this, (kb1) leVar.last());
                    }
                }
                if (zb1Var3 == null) {
                    break;
                }
            } while (zb1Var3 != zb1Var);
        }
        zb1 zb1Var4 = leVar2.isEmpty() ? zb1Var2 : ((kb1) leVar2.first()).f;
        while (zb1Var4 != null && c(zb1Var4.f.a, zb1Var4) != zb1Var4) {
            zb1Var4 = zb1Var4.g;
            if (zb1Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!ws0.j(((kb1) objPrevious).f, zb1Var4));
                kb1 kb1VarG2 = (kb1) objPrevious;
                if (kb1VarG2 == null) {
                    kb1VarG2 = w40.g(b7Var, zb1Var4, zb1Var4.a(bundle2), h(), this.o);
                }
                leVar2.addFirst(kb1VarG2);
            }
        }
        if (!leVar2.isEmpty()) {
            zb1Var2 = ((kb1) leVar2.first()).f;
        }
        while (!leVar.isEmpty() && (((kb1) leVar.last()).f instanceof cc1)) {
            zb1 zb1Var5 = ((kb1) leVar.last()).f;
            zb1Var5.getClass();
            if (s5.B((v72) ((cc1) zb1Var5).j.f, zb1Var2.f.a) != null) {
                break;
            } else {
                o(this, (kb1) leVar.last());
            }
        }
        kb1 kb1Var2 = (kb1) leVar.e();
        if (kb1Var2 == null) {
            kb1Var2 = (kb1) leVar2.e();
        }
        if (!ws0.j(kb1Var2 != null ? kb1Var2.f : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                zb1 zb1Var6 = ((kb1) objPrevious3).f;
                cc1 cc1Var = this.c;
                cc1Var.getClass();
                if (ws0.j(zb1Var6, cc1Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            kb1 kb1VarG3 = (kb1) obj;
            if (kb1VarG3 == null) {
                cc1 cc1Var2 = this.c;
                cc1Var2.getClass();
                cc1 cc1Var3 = this.c;
                cc1Var3.getClass();
                kb1VarG3 = w40.g(b7Var, cc1Var2, cc1Var3.a(bundle), h(), this.o);
            }
            leVar2.addFirst(kb1VarG3);
        }
        for (kb1 kb1Var3 : leVar2) {
            Object obj2 = this.t.get(this.s.b(kb1Var3.f.e));
            if (obj2 == null) {
                qj.h(zb1Var.e, " should already be created", "NavigatorBackStack for ");
                return;
            }
            ((pb1) obj2).a(kb1Var3);
        }
        leVar.addAll(leVar2);
        leVar.addLast(kb1Var);
        ArrayList arrayListZ = vq.Z(leVar2, kb1Var);
        int size = arrayListZ.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListZ.get(i);
            i++;
            kb1 kb1Var4 = (kb1) obj3;
            cc1 cc1Var4 = kb1Var4.f.g;
            if (cc1Var4 != null) {
                j(kb1Var4, e(cc1Var4.f.a));
            }
        }
    }

    public final boolean b() {
        le leVar;
        while (true) {
            leVar = this.f;
            if (leVar.isEmpty() || !(((kb1) leVar.last()).f instanceof cc1)) {
                break;
            }
            o(this, (kb1) leVar.last());
        }
        kb1 kb1Var = (kb1) leVar.g();
        ArrayList arrayList = this.y;
        if (kb1Var != null) {
            arrayList.add(kb1Var);
        }
        this.x++;
        s();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList arrayListI0 = vq.i0(arrayList);
            arrayList.clear();
            int size = arrayListI0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListI0.get(i2);
                i2++;
                kb1 kb1Var2 = (kb1) obj;
                Iterator it = vq.h0(this.p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        fu1.c();
                        return false;
                    }
                    zb1 zb1Var = kb1Var2.f;
                    kb1Var2.l.a();
                    throw null;
                }
                this.z.q(kb1Var2);
            }
            ArrayList arrayList2 = new ArrayList(leVar);
            s82 s82Var = this.g;
            s82Var.getClass();
            s82Var.j(null, arrayList2);
            ArrayList arrayListP = p();
            s82 s82Var2 = this.h;
            s82Var2.getClass();
            s82Var2.j(null, arrayListP);
        }
        return kb1Var != null;
    }

    public final zb1 c(int i, zb1 zb1Var) {
        zb1 zb1Var2;
        cc1 cc1Var = this.c;
        if (cc1Var == null) {
            return null;
        }
        if (cc1Var.f.a == i) {
            if (zb1Var == null) {
                return cc1Var;
            }
            if (ws0.j(cc1Var, zb1Var) && zb1Var.g == null) {
                return this.c;
            }
        }
        kb1 kb1Var = (kb1) this.f.g();
        if (kb1Var == null || (zb1Var2 = kb1Var.f) == null) {
            zb1Var2 = this.c;
            zb1Var2.getClass();
        }
        return d(i, zb1Var2, zb1Var, false);
    }

    public final kb1 e(int i) {
        Object objPrevious;
        le leVar = this.f;
        ListIterator<E> listIterator = leVar.listIterator(leVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((kb1) objPrevious).f.f.a != i);
        kb1 kb1Var = (kb1) objPrevious;
        if (kb1Var != null) {
            return kb1Var;
        }
        StringBuilder sbM = k3.m(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbM.append(f());
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final zb1 f() {
        kb1 kb1Var = (kb1) this.f.g();
        if (kb1Var != null) {
            return kb1Var.f;
        }
        return null;
    }

    public final cc1 g() {
        cc1 cc1Var = this.c;
        if (cc1Var != null) {
            cc1Var.getClass();
            return cc1Var;
        }
        fu1.h("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final r11 h() {
        return this.n == null ? r11.g : this.q;
    }

    public final cc1 i() {
        zb1 zb1Var;
        kb1 kb1Var = (kb1) this.f.g();
        if (kb1Var == null || (zb1Var = kb1Var.f) == null) {
            zb1Var = this.c;
            zb1Var.getClass();
        }
        cc1 cc1Var = zb1Var instanceof cc1 ? (cc1) zb1Var : null;
        if (cc1Var != null) {
            return cc1Var;
        }
        cc1 cc1Var2 = zb1Var.g;
        cc1Var2.getClass();
        return cc1Var2;
    }

    public final void j(kb1 kb1Var, kb1 kb1Var2) {
        this.j.put(kb1Var, kb1Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(kb1Var2) == null) {
            linkedHashMap.put(kb1Var2, new ef());
        }
        Object obj = linkedHashMap.get(kb1Var2);
        obj.getClass();
        ((ef) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:7: B:71:0x01d0->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d A[LOOP:4: B:49:0x0115->B:51:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0197  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d6 A[Catch: all -> 0x01eb, TryCatch #0 {all -> 0x01eb, blocks: (B:70:0x01ba, B:71:0x01d0, B:73:0x01d6, B:75:0x01e6, B:79:0x01ee), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    public final void k(zb1 zb1Var, Bundle bundle, sc1 sc1Var) {
        boolean z;
        int iNextIndex;
        zb1 zb1Var2;
        le<kb1> leVar;
        qd1 qd1VarB;
        zb1 zb1Var3;
        pb1 pb1VarB;
        ListIterator listIterator;
        int iNextIndex2;
        cc1 cc1Var;
        int i;
        zb1Var.getClass();
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            ((pb1) it.next()).d = true;
        }
        cs1 cs1Var = new cs1();
        boolean zM = (sc1Var == null || (i = sc1Var.c) == -1) ? false : m(i, sc1Var.d, sc1Var.e);
        Bundle bundleA = zb1Var.a(bundle);
        if (sc1Var != null && sc1Var.b && this.l.containsKey(Integer.valueOf(zb1Var.f.a))) {
            cs1Var.e = q(zb1Var.f.a, bundleA, sc1Var);
            z = false;
        } else {
            if (sc1Var == null || !sc1Var.a) {
                z = false;
            } else {
                kb1 kb1Var = (kb1) this.f.g();
                le leVar2 = this.f;
                ListIterator listIterator2 = leVar2.listIterator(leVar2.a());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((kb1) listIterator2.previous()).f == zb1Var) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z = false;
                } else if (zb1Var instanceof cc1) {
                    int i2 = cc1.k;
                    List listU = o12.u(new tb2(o12.t((cc1) zb1Var, new o01(18)), new o01(15), 1));
                    if (this.f.g - iNextIndex == listU.size()) {
                        le leVar3 = this.f;
                        List listSubList = leVar3.subList(iNextIndex, leVar3.g);
                        ArrayList arrayList = new ArrayList(wq.G(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((kb1) it2.next()).f.f.a));
                        }
                        if (arrayList.equals(listU)) {
                            leVar = new le();
                            while (vs0.o(this.f) >= iNextIndex) {
                                kb1 kb1Var2 = (kb1) ar.L(this.f);
                                r(kb1Var2);
                                kb1 kb1Var3 = new kb1(kb1Var2.e, kb1Var2.f, kb1Var2.f.a(bundle), kb1Var2.h, kb1Var2.i, kb1Var2.j, kb1Var2.k);
                                mb1 mb1Var = kb1Var3.l;
                                r11 r11Var = kb1Var2.h;
                                mb1Var.getClass();
                                r11Var.getClass();
                                mb1Var.d = r11Var;
                                mb1 mb1Var2 = kb1Var3.l;
                                mb1Var2.k = kb1Var2.l.k;
                                mb1Var2.b();
                                leVar.addFirst(kb1Var3);
                            }
                            for (kb1 kb1Var4 : leVar) {
                                cc1Var = kb1Var4.f.g;
                                if (cc1Var != null) {
                                    j(kb1Var4, e(cc1Var.f.a));
                                }
                                this.f.addLast(kb1Var4);
                            }
                            for (kb1 kb1Var5 : leVar) {
                                qd1VarB = this.s.b(kb1Var5.f.e);
                                zb1Var3 = kb1Var5.f;
                                if (zb1Var3 == null) {
                                    zb1Var3 = null;
                                }
                                if (zb1Var3 == null) {
                                    qd1VarB.c(zb1Var3);
                                    pb1VarB = qd1VarB.b();
                                    synchronized (pb1VarB.a) {
                                        try {
                                            ArrayList arrayListI0 = vq.i0((Collection) pb1VarB.e.e.getValue());
                                            listIterator = arrayListI0.listIterator(arrayListI0.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (((kb1) listIterator.previous()).j.equals(kb1Var5.j)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListI0.set(iNextIndex2, kb1Var5);
                                            pb1VarB.b.j(null, arrayListI0);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                } else if (kb1Var == null || (zb1Var2 = kb1Var.f) == null || zb1Var.f.a != zb1Var2.f.a) {
                    z = false;
                } else {
                    leVar = new le();
                    while (vs0.o(this.f) >= iNextIndex) {
                        kb1 kb1Var6 = (kb1) ar.L(this.f);
                        r(kb1Var6);
                        kb1 kb1Var7 = new kb1(kb1Var6.e, kb1Var6.f, kb1Var6.f.a(bundle), kb1Var6.h, kb1Var6.i, kb1Var6.j, kb1Var6.k);
                        mb1 mb1Var3 = kb1Var7.l;
                        r11 r11Var2 = kb1Var6.h;
                        mb1Var3.getClass();
                        r11Var2.getClass();
                        mb1Var3.d = r11Var2;
                        mb1 mb1Var4 = kb1Var7.l;
                        mb1Var4.k = kb1Var6.l.k;
                        mb1Var4.b();
                        leVar.addFirst(kb1Var7);
                    }
                    while (r0.hasNext()) {
                        cc1Var = kb1Var4.f.g;
                        if (cc1Var != null) {
                            j(kb1Var4, e(cc1Var.f.a));
                        }
                        this.f.addLast(kb1Var4);
                    }
                    while (r0.hasNext()) {
                        qd1VarB = this.s.b(kb1Var5.f.e);
                        zb1Var3 = kb1Var5.f;
                        if (zb1Var3 == null) {
                            zb1Var3 = null;
                        }
                        if (zb1Var3 == null) {
                            qd1VarB.c(zb1Var3);
                            pb1VarB = qd1VarB.b();
                            synchronized (pb1VarB.a) {
                                ArrayList arrayListI1 = vq.i0((Collection) pb1VarB.e.e.getValue());
                                listIterator = arrayListI1.listIterator(arrayListI1.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (((kb1) listIterator.previous()).j.equals(kb1Var5.j)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListI1.set(iNextIndex2, kb1Var5);
                                pb1VarB.b.j(null, arrayListI1);
                            }
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                kb1 kb1VarG = w40.g(this.a.c, zb1Var, bundleA, h(), this.o);
                qd1 qd1VarB2 = this.s.b(zb1Var.e);
                List listU2 = vs0.u(kb1VarG);
                this.u = new dy(cs1Var, this, zb1Var, bundleA, 4);
                qd1VarB2.d(listU2, sc1Var);
                this.u = null;
            }
        }
        this.b.a();
        Iterator it3 = this.t.values().iterator();
        while (it3.hasNext()) {
            ((pb1) it3.next()).d = false;
        }
        if (zM || cs1Var.e || z) {
            b();
        } else {
            s();
        }
    }

    public final void l(Object obj, sc1 sc1Var) {
        String strE;
        obj.getClass();
        obj.getClass();
        zb1 zb1VarD = d(sv.C(c22.m(js1.a(obj.getClass()))), g(), null, true);
        if (zb1VarD != null) {
            Map mapB = zb1VarD.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap(h61.e0(mapB.size()));
            for (Map.Entry entry : mapB.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((jb1) entry.getValue()).a);
            }
            strE = sv.E(obj, linkedHashMap);
        } else {
            qj.k("Destination with route ", js1.a(obj.getClass()).c(), " cannot be found in navigation graph ", this.c);
            strE = null;
        }
        if (this.c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + strE + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        cc1 cc1VarI = i();
        yb1 yb1VarE = cc1VarI.e(strE, true, cc1VarI);
        if (yb1VarE == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + strE + " cannot be found in the navigation graph " + this.c);
        }
        zb1 zb1Var = yb1VarE.e;
        Bundle bundleA = zb1Var.a(yb1VarE.f);
        if (bundleA == null) {
            bundleA = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        }
        int i = zb1.i;
        String str = (String) zb1Var.f.e;
        Uri uri = Uri.parse(str != null ? "android-app://androidx.navigation/".concat(str) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        k(zb1Var, bundleA, sc1Var);
    }

    public final boolean m(int i, boolean z, boolean z2) {
        zb1 zb1Var;
        boolean z3;
        le leVar = this.f;
        final int i2 = 0;
        if (leVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = vq.b0(leVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                zb1Var = null;
                break;
            }
            zb1 zb1Var2 = ((kb1) it.next()).f;
            String str = zb1Var2.e;
            pc pcVar = zb1Var2.f;
            qd1 qd1VarB = this.s.b(str);
            if (z || pcVar.a != i) {
                arrayList.add(qd1VarB);
            }
            if (pcVar.a == i) {
                zb1Var = zb1Var2;
                break;
            }
        }
        if (zb1Var == null) {
            int i3 = zb1.i;
            Log.i("NavController", "Ignoring popBackStack to destination " + vv.n(this.a.c, i) + " as it was not found on the current back stack");
            return false;
        }
        cs1 cs1Var = new cs1();
        le leVar2 = new le();
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = z2;
                break;
            }
            int i5 = i4 + 1;
            qd1 qd1Var = (qd1) arrayList.get(i4);
            cs1 cs1Var2 = new cs1();
            kb1 kb1Var = (kb1) leVar.last();
            z3 = z2;
            e71 e71Var = new e71(cs1Var2, cs1Var, this, z3, leVar2);
            qd1Var.getClass();
            kb1Var.getClass();
            this.v = e71Var;
            qd1Var.e(kb1Var, z3);
            this.v = null;
            if (!cs1Var2.e) {
                break;
            }
            i4 = i5;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                id0 id0Var = new id0(new tb2(o12.t(zb1Var, new o01(13)), new ej0(this) { // from class: qb1
                    public final /* synthetic */ rb1 f;

                    {
                        this.f = this;
                    }

                    @Override // defpackage.ej0
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        int i6 = i2;
                        rb1 rb1Var = this.f;
                        zb1 zb1Var3 = (zb1) obj;
                        switch (i6) {
                            case 0:
                                zb1Var3.getClass();
                                zContainsKey = rb1Var.l.containsKey(Integer.valueOf(zb1Var3.f.a));
                                break;
                            default:
                                zb1Var3.getClass();
                                zContainsKey = rb1Var.l.containsKey(Integer.valueOf(zb1Var3.f.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (id0Var.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((zb1) id0Var.next()).f.a);
                    ob1 ob1Var = (ob1) leVar2.e();
                    linkedHashMap.put(numValueOf, ob1Var != null ? (String) ob1Var.a.b : null);
                }
            }
            if (!leVar2.isEmpty()) {
                v7 v7Var = ((ob1) leVar2.first()).a;
                String str2 = (String) v7Var.b;
                final int i6 = 1;
                id0 id0Var2 = new id0(new tb2(o12.t(c(v7Var.a, null), new o01(14)), new ej0(this) { // from class: qb1
                    public final /* synthetic */ rb1 f;

                    {
                        this.f = this;
                    }

                    @Override // defpackage.ej0
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        int i7 = i6;
                        rb1 rb1Var = this.f;
                        zb1 zb1Var3 = (zb1) obj;
                        switch (i7) {
                            case 0:
                                zb1Var3.getClass();
                                zContainsKey = rb1Var.l.containsKey(Integer.valueOf(zb1Var3.f.a));
                                break;
                            default:
                                zb1Var3.getClass();
                                zContainsKey = rb1Var.l.containsKey(Integer.valueOf(zb1Var3.f.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (id0Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((zb1) id0Var2.next()).f.a), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.m.put(str2, leVar2);
                }
            }
        }
        this.b.a();
        return cs1Var.e;
    }

    public final void n(kb1 kb1Var, boolean z, le leVar) {
        sb1 sb1Var;
        Set set;
        kb1Var.getClass();
        le leVar2 = this.f;
        kb1 kb1Var2 = (kb1) leVar2.last();
        if (!ws0.j(kb1Var2, kb1Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(kb1Var.f);
            zb1 zb1Var = kb1Var2.f;
            sb.append(", which is not the top of the back stack (");
            sb.append(zb1Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        ar.L(leVar2);
        pb1 pb1Var = (pb1) this.t.get(this.s.b(kb1Var2.f.e));
        boolean z2 = true;
        if ((pb1Var == null || (set = (Set) pb1Var.f.e.getValue()) == null || !set.contains(kb1Var2)) && !this.k.containsKey(kb1Var2)) {
            z2 = false;
        }
        r11 r11Var = kb1Var2.l.j.h;
        r11 r11Var2 = r11.g;
        if (r11Var.compareTo(r11Var2) >= 0) {
            if (z) {
                kb1Var2.a(r11Var2);
                leVar.addFirst(new ob1(kb1Var2));
            }
            if (z2) {
                kb1Var2.a(r11Var2);
            } else {
                kb1Var2.a(r11.e);
                r(kb1Var2);
            }
        }
        if (z || z2 || (sb1Var = this.o) == null) {
            return;
        }
        bo2 bo2Var = (bo2) sb1Var.b.remove(kb1Var2.j);
        if (bo2Var != null) {
            bo2Var.a();
        }
    }

    public final ArrayList p() {
        r11 r11Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r11Var = r11.h;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((pb1) it.next()).f.e.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                kb1 kb1Var = (kb1) obj;
                if (!arrayList.contains(kb1Var) && kb1Var.l.k.compareTo(r11Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            ar.I(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            kb1 kb1Var2 = (kb1) obj2;
            if (!arrayList.contains(kb1Var2) && kb1Var2.l.k.compareTo(r11Var) >= 0) {
                arrayList3.add(obj2);
            }
        }
        ar.I(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((kb1) obj3).f instanceof cc1)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, sc1 sc1Var) {
        zb1 zb1VarG;
        kb1 kb1Var;
        zb1 zb1Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (ws0.j((String) it.next(), str)) {
                it.remove();
            }
        }
        le<ob1> leVar = (le) nj2.g(this.m).remove(str);
        b7 b7Var = this.a.c;
        ArrayList arrayList = new ArrayList();
        kb1 kb1Var2 = (kb1) this.f.g();
        if (kb1Var2 == null || (zb1VarG = kb1Var2.f) == null) {
            zb1VarG = g();
        }
        if (leVar != null) {
            for (ob1 ob1Var : leVar) {
                v7 v7Var = ob1Var.a;
                v7 v7Var2 = ob1Var.a;
                zb1 zb1VarD = d(v7Var.a, zb1VarG, null, true);
                if (zb1VarD == null) {
                    int i3 = zb1.i;
                    qj.s("Restore State failed: destination ", vv.n(b7Var, v7Var2.a), " cannot be found from the current destination ", zb1VarG);
                    return false;
                }
                r11 r11VarH = h();
                sb1 sb1Var = this.o;
                b7Var.getClass();
                r11VarH.getClass();
                Bundle bundle3 = (Bundle) v7Var2.c;
                if (bundle3 != null) {
                    Context context = b7Var.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new kb1(b7Var, zb1VarD, bundle2, r11VarH, sb1Var, (String) v7Var2.b, (Bundle) v7Var2.d));
                zb1VarG = zb1VarD;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((kb1) obj).f instanceof cc1)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            kb1 kb1Var3 = (kb1) obj2;
            List list = (List) vq.X(arrayList2);
            if (ws0.j((list == null || (kb1Var = (kb1) vq.W(list)) == null || (zb1Var = kb1Var.f) == null) ? null : zb1Var.e, kb1Var3.f.e)) {
                list.add(kb1Var3);
            } else {
                arrayList2.add(vs0.w(kb1Var3));
            }
        }
        cs1 cs1Var = new cs1();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            qd1 qd1VarB = this.s.b(((kb1) vq.Q(list2)).f.e);
            ArrayList arrayList4 = arrayList;
            this.u = new q2(cs1Var, arrayList4, new es1(), this, bundle, 4);
            qd1VarB.d(list2, sc1Var);
            this.u = null;
            arrayList = arrayList4;
        }
        return cs1Var.e;
    }

    public final void r(kb1 kb1Var) {
        kb1Var.getClass();
        kb1 kb1Var2 = (kb1) this.j.remove(kb1Var);
        if (kb1Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        ef efVar = (ef) linkedHashMap.get(kb1Var2);
        Integer numValueOf = efVar != null ? Integer.valueOf(efVar.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            pb1 pb1Var = (pb1) this.t.get(this.s.b(kb1Var2.f.e));
            if (pb1Var != null) {
                pb1Var.c(kb1Var2);
            }
            linkedHashMap.remove(kb1Var2);
        }
    }

    public final void s() {
        ef efVar;
        Set set;
        ArrayList arrayListI0 = vq.i0(this.f);
        if (arrayListI0.isEmpty()) {
            return;
        }
        ArrayList arrayListW = vs0.w(((kb1) vq.W(arrayListI0)).f);
        ArrayList arrayList = new ArrayList();
        if (vq.W(arrayListW) instanceof g50) {
            Iterator it = vq.b0(arrayListI0).iterator();
            while (it.hasNext()) {
                zb1 zb1Var = ((kb1) it.next()).f;
                arrayList.add(zb1Var);
                if (!(zb1Var instanceof g50) && !(zb1Var instanceof cc1)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (kb1 kb1Var : vq.b0(arrayListI0)) {
            r11 r11Var = kb1Var.l.k;
            zb1 zb1Var2 = kb1Var.f;
            zb1 zb1Var3 = (zb1) vq.R(arrayListW);
            r11 r11Var2 = r11.i;
            r11 r11Var3 = r11.h;
            if (zb1Var3 != null && zb1Var3.f.a == zb1Var2.f.a) {
                if (r11Var != r11Var2) {
                    pb1 pb1Var = (pb1) this.t.get(this.s.b(kb1Var.f.e));
                    if (ws0.j((pb1Var == null || (set = (Set) pb1Var.f.e.getValue()) == null) ? null : Boolean.valueOf(set.contains(kb1Var)), Boolean.TRUE) || ((efVar = (ef) this.k.get(kb1Var)) != null && efVar.a.get() == 0)) {
                        map.put(kb1Var, r11Var3);
                    } else {
                        map.put(kb1Var, r11Var2);
                    }
                }
                zb1 zb1Var4 = (zb1) vq.R(arrayList);
                if (zb1Var4 != null && zb1Var4.f.a == zb1Var2.f.a) {
                    ar.K(arrayList);
                }
                ar.K(arrayListW);
                cc1 cc1Var = zb1Var2.g;
                if (cc1Var != null) {
                    arrayListW.add(cc1Var);
                }
            } else if (arrayList.isEmpty() || zb1Var2.f.a != ((zb1) vq.Q(arrayList)).f.a) {
                kb1Var.a(r11.g);
            } else {
                zb1 zb1Var5 = (zb1) ar.K(arrayList);
                if (r11Var == r11Var2) {
                    kb1Var.a(r11Var3);
                } else if (r11Var != r11Var3) {
                    map.put(kb1Var, r11Var3);
                }
                cc1 cc1Var2 = zb1Var5.g;
                if (cc1Var2 != null && !arrayList.contains(cc1Var2)) {
                    arrayList.add(cc1Var2);
                }
            }
        }
        int size = arrayListI0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListI0.get(i);
            i++;
            kb1 kb1Var2 = (kb1) obj;
            r11 r11Var4 = (r11) map.get(kb1Var2);
            if (r11Var4 != null) {
                kb1Var2.a(r11Var4);
            } else {
                kb1Var2.l.b();
            }
        }
    }
}

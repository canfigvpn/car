package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wg extends wa2 implements ej0 {
    public List i;
    public Map j;
    public Map k;
    public Map l;
    public LinkedHashMap m;
    public String n;
    public String o;
    public ArrayList p;
    public int q;
    public int r;
    public int s;
    public final /* synthetic */ xg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(xg xgVar, sx sxVar) {
        super(1, sxVar);
        this.t = xgVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        return new wg(this.t, (sx) obj).r(ll2.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x033d A[LOOP:1: B:98:0x032e->B:100:0x033d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0376  */
    /* JADX WARN: Code duplicated, block: B:106:0x0389  */
    /* JADX WARN: Code duplicated, block: B:108:0x039e  */
    /* JADX WARN: Code duplicated, block: B:109:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:112:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:117:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:119:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:121:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:122:0x0414  */
    /* JADX WARN: Code duplicated, block: B:124:0x0418  */
    /* JADX WARN: Code duplicated, block: B:131:0x0434  */
    /* JADX WARN: Code duplicated, block: B:135:0x044a A[LOOP:4: B:133:0x0444->B:135:0x044a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0363 A[EDGE_INSN: B:143:0x0363->B:101:0x0363 BREAK  A[LOOP:1: B:98:0x032e->B:100:0x033d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x041b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:40:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x014e  */
    /* JADX WARN: Code duplicated, block: B:46:0x015e A[LOOP:10: B:44:0x0158->B:46:0x015e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x019b A[PHI: r0 r3 r5 r6 r17
  0x019b: PHI (r0v12 java.lang.Object) = (r0v11 java.lang.Object), (r0v56 java.lang.Object) binds: [B:49:0x0197, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r3v11 java.util.Map) = (r3v10 java.util.Map), (r3v51 java.util.Map) binds: [B:49:0x0197, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r5v5 java.util.Map) = (r5v4 java.util.Map), (r5v17 java.util.Map) binds: [B:49:0x0197, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r6v3 java.util.List) = (r6v2 java.util.List), (r6v25 java.util.List) binds: [B:49:0x0197, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r17v3 java.lang.Throwable) = (r17v2 java.lang.Throwable), (r17v7 java.lang.Throwable) binds: [B:49:0x0197, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0200  */
    /* JADX WARN: Code duplicated, block: B:67:0x0214  */
    /* JADX WARN: Code duplicated, block: B:76:0x0249  */
    /* JADX WARN: Code duplicated, block: B:79:0x024f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0266 A[LOOP:6: B:81:0x0260->B:83:0x0266, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0304  */
    /* JADX WARN: Code duplicated, block: B:96:0x0324  */
    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        Object objA;
        Throwable th;
        Object objR;
        List list;
        Map map;
        LinkedHashMap linkedHashMap;
        Map linkedHashMap2;
        Object objR2;
        int iE0;
        LinkedHashMap linkedHashMap3;
        Long l;
        Object arrayList;
        LinkedHashMap linkedHashMap4;
        Object objR3;
        Map map2;
        Map map3;
        List list2;
        Map map4;
        Long l2;
        Object arrayList2;
        LinkedHashMap linkedHashMap5;
        int iA;
        Object ut1Var;
        String str;
        ArrayList arrayList3;
        Iterator it;
        Object objR4;
        String str2;
        List list3;
        int i;
        Map map5;
        Map map6;
        LinkedHashMap linkedHashMap6;
        String str3;
        int i2;
        Long l3;
        Object arrayList4;
        ArrayList arrayList5;
        Iterator it2;
        long j;
        List list4;
        List<sf1> list5;
        int iE1;
        LinkedHashMap linkedHashMap7;
        Iterator it3;
        v vVar;
        Iterator it4;
        ArrayList arrayList6;
        Iterator it5;
        ArrayList arrayList7;
        int i3;
        List list6;
        ArrayList arrayList8;
        int i4;
        j22 j22Var;
        String str4;
        Object sgVar;
        x22 x22Var;
        Map map7;
        Iterator it6;
        List list7;
        int i5;
        Object ghVar;
        xn xnVar;
        int i6 = this.s;
        int i7 = 16;
        Throwable th2 = null;
        int i8 = 10;
        xg xgVar = this.t;
        fz fzVar = fz.e;
        if (i6 == 0) {
            ix.Q(obj);
            w22 w22Var = xgVar.g;
            this.s = 1;
            objA = w22Var.a(this);
            if (objA != fzVar) {
            }
            return fzVar;
        }
        if (i6 == 1) {
            ix.Q(obj);
            objA = obj;
        } else {
            if (i6 == 2) {
                Map map8 = this.j;
                list = this.i;
                ix.Q(obj);
                objR = obj;
                map = map8;
                th = null;
                linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) objR) {
                    l = new Long(((xn) obj2).a);
                    arrayList = linkedHashMap.get(l);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(l, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                linkedHashMap2 = new LinkedHashMap(h61.e0(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List list8 = (List) entry.getValue();
                    iE0 = h61.e0(wq.G(list8, i8));
                    if (iE0 < i7) {
                        iE0 = i7;
                    }
                    linkedHashMap3 = new LinkedHashMap(iE0);
                    for (Object obj3 : list8) {
                        linkedHashMap3.put(new Long(((xn) obj3).b), obj3);
                    }
                    linkedHashMap2.put(key, linkedHashMap3);
                    i7 = 16;
                    i8 = 10;
                }
                i22 i22Var = xgVar.i;
                this.i = list;
                this.j = map;
                this.k = linkedHashMap2;
                this.s = 3;
                objR2 = sv.R(this, new yw1(26), i22Var.a, true, false);
                if (objR2 != fzVar) {
                    linkedHashMap4 = new LinkedHashMap();
                    for (Object obj4 : (Iterable) objR2) {
                        l2 = new Long(((j22) obj4).b);
                        arrayList2 = linkedHashMap4.get(l2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap4.put(l2, arrayList2);
                        }
                        ((List) arrayList2).add(obj4);
                    }
                    rf1 rf1Var = xgVar.j;
                    this.i = list;
                    this.j = map;
                    this.k = linkedHashMap2;
                    this.l = linkedHashMap4;
                    this.s = 4;
                    objR3 = sv.R(this, new o01(27), rf1Var.a, true, false);
                    if (objR3 != fzVar) {
                        map2 = linkedHashMap2;
                        map3 = map;
                        list2 = list;
                        map4 = linkedHashMap4;
                        linkedHashMap5 = new LinkedHashMap();
                        for (Object obj5 : (Iterable) objR3) {
                            l3 = new Long(((sf1) obj5).b);
                            arrayList4 = linkedHashMap5.get(l3);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap5.put(l3, arrayList4);
                            }
                            ((List) arrayList4).add(obj5);
                        }
                        xgVar.e.getClass();
                        iA = jb2.a();
                        Context context = xgVar.a;
                        ut1Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                        if (ut1Var instanceof ut1) {
                            ut1Var = th;
                        }
                        str = (String) ut1Var;
                        if (str == null) {
                            str = "";
                        }
                        arrayList3 = new ArrayList(wq.G(list2, 10));
                        for (it = list2.iterator(); it.hasNext(); it = it) {
                            x22 x22Var2 = (x22) it.next();
                            arrayList3.add(new jh(x22Var2.b, x22Var2.c, x22Var2.d, x22Var2.e, x22Var2.f, x22Var2.g, x22Var2.h, x22Var2.i));
                        }
                        bn bnVar = xgVar.f;
                        this.i = list2;
                        this.j = map3;
                        this.k = map2;
                        this.l = map4;
                        this.m = linkedHashMap5;
                        this.n = "ir.alirezaivaz.mygarage";
                        this.o = str;
                        this.p = arrayList3;
                        this.q = 1;
                        this.r = iA;
                        this.s = 5;
                        objR4 = sv.R(this, new s1(13), bnVar.a, true, false);
                        if (objR4 != fzVar) {
                            Map map9 = map4;
                            str2 = str;
                            list3 = list2;
                            i = iA;
                            map5 = map9;
                            map6 = map2;
                            linkedHashMap6 = linkedHashMap5;
                            str3 = "ir.alirezaivaz.mygarage";
                            i2 = 1;
                        }
                    }
                }
                return fzVar;
            }
            if (i6 == 3) {
                Map map10 = this.k;
                map = this.j;
                list = this.i;
                ix.Q(obj);
                linkedHashMap2 = map10;
                th = null;
                objR2 = obj;
                linkedHashMap4 = new LinkedHashMap();
                while (r0.hasNext()) {
                    l2 = new Long(((j22) obj4).b);
                    arrayList2 = linkedHashMap4.get(l2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap4.put(l2, arrayList2);
                    }
                    ((List) arrayList2).add(obj4);
                }
                rf1 rf1Var2 = xgVar.j;
                this.i = list;
                this.j = map;
                this.k = linkedHashMap2;
                this.l = linkedHashMap4;
                this.s = 4;
                objR3 = sv.R(this, new o01(27), rf1Var2.a, true, false);
                if (objR3 != fzVar) {
                    map2 = linkedHashMap2;
                    map3 = map;
                    list2 = list;
                    map4 = linkedHashMap4;
                    linkedHashMap5 = new LinkedHashMap();
                    while (r0.hasNext()) {
                        l3 = new Long(((sf1) obj5).b);
                        arrayList4 = linkedHashMap5.get(l3);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap5.put(l3, arrayList4);
                        }
                        ((List) arrayList4).add(obj5);
                    }
                    xgVar.e.getClass();
                    iA = jb2.a();
                    Context context2 = xgVar.a;
                    ut1Var = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (ut1Var instanceof ut1) {
                        ut1Var = th;
                    }
                    str = (String) ut1Var;
                    if (str == null) {
                        str = "";
                    }
                    arrayList3 = new ArrayList(wq.G(list2, 10));
                    while (it.hasNext()) {
                        x22 x22Var3 = (x22) it.next();
                        arrayList3.add(new jh(x22Var3.b, x22Var3.c, x22Var3.d, x22Var3.e, x22Var3.f, x22Var3.g, x22Var3.h, x22Var3.i));
                    }
                    bn bnVar2 = xgVar.f;
                    this.i = list2;
                    this.j = map3;
                    this.k = map2;
                    this.l = map4;
                    this.m = linkedHashMap5;
                    this.n = "ir.alirezaivaz.mygarage";
                    this.o = str;
                    this.p = arrayList3;
                    this.q = 1;
                    this.r = iA;
                    this.s = 5;
                    objR4 = sv.R(this, new s1(13), bnVar2.a, true, false);
                    if (objR4 != fzVar) {
                        Map map11 = map4;
                        str2 = str;
                        list3 = list2;
                        i = iA;
                        map5 = map11;
                        map6 = map2;
                        linkedHashMap6 = linkedHashMap5;
                        str3 = "ir.alirezaivaz.mygarage";
                        i2 = 1;
                    }
                }
                return fzVar;
            }
            if (i6 == 4) {
                Map map12 = this.l;
                map2 = this.k;
                Map map13 = this.j;
                list2 = this.i;
                ix.Q(obj);
                map4 = map12;
                map3 = map13;
                th = null;
                objR3 = obj;
                linkedHashMap5 = new LinkedHashMap();
                while (r0.hasNext()) {
                    l3 = new Long(((sf1) obj5).b);
                    arrayList4 = linkedHashMap5.get(l3);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap5.put(l3, arrayList4);
                    }
                    ((List) arrayList4).add(obj5);
                }
                xgVar.e.getClass();
                iA = jb2.a();
                Context context3 = xgVar.a;
                try {
                    ut1Var = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionName;
                } catch (Throwable th3) {
                    ut1Var = new ut1(th3);
                }
                if (ut1Var instanceof ut1) {
                    ut1Var = th;
                }
                str = (String) ut1Var;
                if (str == null) {
                    str = "";
                }
                arrayList3 = new ArrayList(wq.G(list2, 10));
                while (it.hasNext()) {
                    x22 x22Var4 = (x22) it.next();
                    arrayList3.add(new jh(x22Var4.b, x22Var4.c, x22Var4.d, x22Var4.e, x22Var4.f, x22Var4.g, x22Var4.h, x22Var4.i));
                }
                bn bnVar3 = xgVar.f;
                this.i = list2;
                this.j = map3;
                this.k = map2;
                this.l = map4;
                this.m = linkedHashMap5;
                this.n = "ir.alirezaivaz.mygarage";
                this.o = str;
                this.p = arrayList3;
                this.q = 1;
                this.r = iA;
                this.s = 5;
                objR4 = sv.R(this, new s1(13), bnVar3.a, true, false);
                if (objR4 != fzVar) {
                    Map map14 = map4;
                    str2 = str;
                    list3 = list2;
                    i = iA;
                    map5 = map14;
                    map6 = map2;
                    linkedHashMap6 = linkedHashMap5;
                    str3 = "ir.alirezaivaz.mygarage";
                    i2 = 1;
                }
                return fzVar;
            }
            if (i6 != 5) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = this.r;
            i2 = this.q;
            ArrayList arrayList9 = this.p;
            String str5 = this.o;
            String str6 = this.n;
            LinkedHashMap linkedHashMap8 = this.m;
            Map map15 = this.l;
            map6 = this.k;
            map3 = this.j;
            List list9 = this.i;
            ix.Q(obj);
            str2 = str5;
            str3 = str6;
            map5 = map15;
            arrayList3 = arrayList9;
            linkedHashMap6 = linkedHashMap8;
            th = null;
            i = i9;
            list3 = list9;
            objR4 = obj;
        }
        Iterable iterable = (Iterable) objR4;
        arrayList5 = new ArrayList(wq.G(iterable, 10));
        it2 = iterable.iterator();
        while (it2.hasNext()) {
            cn cnVar = (cn) it2.next();
            List list10 = list3;
            Iterator it7 = it2;
            j = cnVar.a;
            list4 = (List) map5.get(new Long(j));
            list5 = cb0.e;
            if (list4 == null) {
                list4 = list5;
            }
            String str7 = str3;
            Map map16 = map5;
            int i10 = i;
            xo0 xo0Var = new xo0(0, new br(0, list4));
            iE1 = h61.e0(wq.G(xo0Var, 10));
            if (iE1 < 16) {
                iE1 = 16;
            }
            linkedHashMap7 = new LinkedHashMap(iE1);
            it3 = xo0Var.iterator();
            while (true) {
                vVar = (v) it3;
                it4 = it3;
                if (((Iterator) vVar.g).hasNext()) {
                    break;
                }
                wo0 wo0Var = (wo0) vVar.next();
                linkedHashMap7.put(new Long(((j22) wo0Var.b).a), new Integer(wo0Var.a));
                it3 = it4;
                arrayList3 = arrayList3;
                str2 = str2;
            }
            String str8 = str2;
            ArrayList arrayList10 = arrayList3;
            arrayList6 = new ArrayList();
            it5 = list10.iterator();
            while (it5.hasNext()) {
                x22Var = (x22) it5.next();
                map7 = (Map) map6.get(new Long(j));
                if (map7 != null) {
                    list7 = list4;
                    i5 = i2;
                    it6 = it5;
                    xnVar = (xn) map7.get(new Long(x22Var.a));
                    if (xnVar != null) {
                        ghVar = new gh(x22Var.b, xnVar.c, xnVar.d, xnVar.e);
                    }
                    if (ghVar != null) {
                        arrayList6.add(ghVar);
                    }
                    i2 = i5;
                    list4 = list7;
                    it5 = it6;
                } else {
                    it6 = it5;
                    list7 = list4;
                    i5 = i2;
                }
                ghVar = th;
                if (ghVar != null) {
                    arrayList6.add(ghVar);
                }
                i2 = i5;
                list4 = list7;
                it5 = it6;
            }
            int i11 = i2;
            arrayList7 = new ArrayList();
            i3 = 0;
            for (Object obj6 : list4) {
                i4 = i3 + 1;
                if (i3 >= 0) {
                    vs0.D();
                    throw th;
                }
                j22Var = (j22) obj6;
                ArrayList arrayList11 = arrayList6;
                str4 = (String) map3.get(new Long(j22Var.c));
                if (str4 != null) {
                    sgVar = new sg(i3, str4, j22Var.d, j22Var.e, j22Var.f, j22Var.g, j22Var.h, j22Var.i);
                } else {
                    sgVar = th;
                }
                if (sgVar != null) {
                    arrayList7.add(sgVar);
                }
                i3 = i4;
                arrayList6 = arrayList11;
            }
            ArrayList arrayList12 = arrayList6;
            list6 = (List) linkedHashMap6.get(new Long(j));
            if (list6 != null) {
                list5 = list6;
            }
            arrayList8 = new ArrayList(wq.G(list5, 10));
            for (sf1 sf1Var : list5) {
                arrayList8.add(new pg(sf1Var.c, sf1Var.d, sf1Var.e, (Integer) linkedHashMap7.get(sf1Var.f)));
            }
            arrayList5.add(new mg(cnVar.b, cnVar.c, cnVar.d, cnVar.e, cnVar.f, cnVar.g, cnVar.h, cnVar.i, cnVar.j, cnVar.k, cnVar.l, cnVar.m, cnVar.n, arrayList12, arrayList7, arrayList8));
            list3 = list10;
            it2 = it7;
            str3 = str7;
            map5 = map16;
            i = i10;
            i2 = i11;
            arrayList3 = arrayList10;
            str2 = str8;
        }
        m32 m32Var = xgVar.c;
        m32 m32Var2 = xgVar.c;
        return new hk0(str3, i2, i, str2, arrayList3, arrayList5, new mh(((dg2) m32Var.c.e.getValue()).name(), (Boolean) m32Var2.e.e.getValue(), ((vd) m32Var2.g.e.getValue()).name(), (Boolean) m32Var2.i.e.getValue()));
        List<x22> list11 = (List) objA;
        int iE2 = h61.e0(wq.G(list11, 10));
        if (iE2 < 16) {
            iE2 = 16;
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap(iE2);
        for (x22 x22Var5 : list11) {
            Throwable th4 = th2;
            linkedHashMap9.put(new Long(x22Var5.a), x22Var5.b);
            th2 = th4;
        }
        th = th2;
        s22 s22Var = xgVar.h;
        this.i = list11;
        this.j = linkedHashMap9;
        this.s = 2;
        objR = sv.R(this, new yw1(27), s22Var.a, true, false);
        if (objR != fzVar) {
            list = list11;
            map = linkedHashMap9;
            linkedHashMap = new LinkedHashMap();
            while (r3.hasNext()) {
                l = new Long(((xn) obj2).a);
                arrayList = linkedHashMap.get(l);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(l, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            linkedHashMap2 = new LinkedHashMap(h61.e0(linkedHashMap.size()));
            while (r0.hasNext()) {
                Object key2 = entry.getKey();
                List list12 = (List) entry.getValue();
                iE0 = h61.e0(wq.G(list12, i8));
                if (iE0 < i7) {
                    iE0 = i7;
                }
                linkedHashMap3 = new LinkedHashMap(iE0);
                while (r4.hasNext()) {
                    linkedHashMap3.put(new Long(((xn) obj3).b), obj3);
                }
                linkedHashMap2.put(key2, linkedHashMap3);
                i7 = 16;
                i8 = 10;
            }
            i22 i22Var2 = xgVar.i;
            this.i = list;
            this.j = map;
            this.k = linkedHashMap2;
            this.s = 3;
            objR2 = sv.R(this, new yw1(26), i22Var2.a, true, false);
            if (objR2 != fzVar) {
                linkedHashMap4 = new LinkedHashMap();
                while (r0.hasNext()) {
                    l2 = new Long(((j22) obj4).b);
                    arrayList2 = linkedHashMap4.get(l2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap4.put(l2, arrayList2);
                    }
                    ((List) arrayList2).add(obj4);
                }
                rf1 rf1Var3 = xgVar.j;
                this.i = list;
                this.j = map;
                this.k = linkedHashMap2;
                this.l = linkedHashMap4;
                this.s = 4;
                objR3 = sv.R(this, new o01(27), rf1Var3.a, true, false);
                if (objR3 != fzVar) {
                    map2 = linkedHashMap2;
                    map3 = map;
                    list2 = list;
                    map4 = linkedHashMap4;
                    linkedHashMap5 = new LinkedHashMap();
                    while (r0.hasNext()) {
                        l3 = new Long(((sf1) obj5).b);
                        arrayList4 = linkedHashMap5.get(l3);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap5.put(l3, arrayList4);
                        }
                        ((List) arrayList4).add(obj5);
                    }
                    xgVar.e.getClass();
                    iA = jb2.a();
                    Context context4 = xgVar.a;
                    ut1Var = context4.getPackageManager().getPackageInfo(context4.getPackageName(), 0).versionName;
                    if (ut1Var instanceof ut1) {
                        ut1Var = th;
                    }
                    str = (String) ut1Var;
                    if (str == null) {
                        str = "";
                    }
                    arrayList3 = new ArrayList(wq.G(list2, 10));
                    while (it.hasNext()) {
                        x22 x22Var6 = (x22) it.next();
                        arrayList3.add(new jh(x22Var6.b, x22Var6.c, x22Var6.d, x22Var6.e, x22Var6.f, x22Var6.g, x22Var6.h, x22Var6.i));
                    }
                    bn bnVar4 = xgVar.f;
                    this.i = list2;
                    this.j = map3;
                    this.k = map2;
                    this.l = map4;
                    this.m = linkedHashMap5;
                    this.n = "ir.alirezaivaz.mygarage";
                    this.o = str;
                    this.p = arrayList3;
                    this.q = 1;
                    this.r = iA;
                    this.s = 5;
                    objR4 = sv.R(this, new s1(13), bnVar4.a, true, false);
                    if (objR4 != fzVar) {
                        Map map17 = map4;
                        str2 = str;
                        list3 = list2;
                        i = iA;
                        map5 = map17;
                        map6 = map2;
                        linkedHashMap6 = linkedHashMap5;
                        str3 = "ir.alirezaivaz.mygarage";
                        i2 = 1;
                        Iterable iterable2 = (Iterable) objR4;
                        arrayList5 = new ArrayList(wq.G(iterable2, 10));
                        it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            cn cnVar2 = (cn) it2.next();
                            List list13 = list3;
                            Iterator it8 = it2;
                            j = cnVar2.a;
                            list4 = (List) map5.get(new Long(j));
                            list5 = cb0.e;
                            if (list4 == null) {
                                list4 = list5;
                            }
                            String str9 = str3;
                            Map map18 = map5;
                            int i12 = i;
                            xo0 xo0Var2 = new xo0(0, new br(0, list4));
                            iE1 = h61.e0(wq.G(xo0Var2, 10));
                            if (iE1 < 16) {
                                iE1 = 16;
                            }
                            linkedHashMap7 = new LinkedHashMap(iE1);
                            it3 = xo0Var2.iterator();
                            while (true) {
                                vVar = (v) it3;
                                it4 = it3;
                                if (((Iterator) vVar.g).hasNext()) {
                                    break;
                                    break;
                                }
                                wo0 wo0Var2 = (wo0) vVar.next();
                                linkedHashMap7.put(new Long(((j22) wo0Var2.b).a), new Integer(wo0Var2.a));
                                it3 = it4;
                                arrayList3 = arrayList3;
                                str2 = str2;
                            }
                            String str10 = str2;
                            ArrayList arrayList13 = arrayList3;
                            arrayList6 = new ArrayList();
                            it5 = list13.iterator();
                            while (it5.hasNext()) {
                                x22Var = (x22) it5.next();
                                map7 = (Map) map6.get(new Long(j));
                                if (map7 != null) {
                                    list7 = list4;
                                    i5 = i2;
                                    it6 = it5;
                                    xnVar = (xn) map7.get(new Long(x22Var.a));
                                    if (xnVar != null) {
                                        ghVar = new gh(x22Var.b, xnVar.c, xnVar.d, xnVar.e);
                                    }
                                    if (ghVar != null) {
                                        arrayList6.add(ghVar);
                                    }
                                    i2 = i5;
                                    list4 = list7;
                                    it5 = it6;
                                } else {
                                    it6 = it5;
                                    list7 = list4;
                                    i5 = i2;
                                }
                                ghVar = th;
                                if (ghVar != null) {
                                    arrayList6.add(ghVar);
                                }
                                i2 = i5;
                                list4 = list7;
                                it5 = it6;
                            }
                            int i13 = i2;
                            arrayList7 = new ArrayList();
                            i3 = 0;
                            while (r6.hasNext()) {
                                i4 = i3 + 1;
                                if (i3 >= 0) {
                                    vs0.D();
                                    throw th;
                                }
                                j22Var = (j22) obj6;
                                ArrayList arrayList14 = arrayList6;
                                str4 = (String) map3.get(new Long(j22Var.c));
                                if (str4 != null) {
                                    sgVar = new sg(i3, str4, j22Var.d, j22Var.e, j22Var.f, j22Var.g, j22Var.h, j22Var.i);
                                } else {
                                    sgVar = th;
                                }
                                if (sgVar != null) {
                                    arrayList7.add(sgVar);
                                }
                                i3 = i4;
                                arrayList6 = arrayList14;
                            }
                            ArrayList arrayList15 = arrayList6;
                            list6 = (List) linkedHashMap6.get(new Long(j));
                            if (list6 != null) {
                                list5 = list6;
                            }
                            arrayList8 = new ArrayList(wq.G(list5, 10));
                            while (r3.hasNext()) {
                                arrayList8.add(new pg(sf1Var.c, sf1Var.d, sf1Var.e, (Integer) linkedHashMap7.get(sf1Var.f)));
                            }
                            arrayList5.add(new mg(cnVar2.b, cnVar2.c, cnVar2.d, cnVar2.e, cnVar2.f, cnVar2.g, cnVar2.h, cnVar2.i, cnVar2.j, cnVar2.k, cnVar2.l, cnVar2.m, cnVar2.n, arrayList15, arrayList7, arrayList8));
                            list3 = list13;
                            it2 = it8;
                            str3 = str9;
                            map5 = map18;
                            i = i12;
                            i2 = i13;
                            arrayList3 = arrayList13;
                            str2 = str10;
                        }
                        m32 m32Var3 = xgVar.c;
                        m32 m32Var4 = xgVar.c;
                        return new hk0(str3, i2, i, str2, arrayList3, arrayList5, new mh(((dg2) m32Var3.c.e.getValue()).name(), (Boolean) m32Var4.e.e.getValue(), ((vd) m32Var4.g.e.getValue()).name(), (Boolean) m32Var4.i.e.getValue()));
                    }
                }
            }
        }
        return fzVar;
    }
}

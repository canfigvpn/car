package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jn0 extends wa2 implements mj0 {
    public /* synthetic */ List i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;
    public /* synthetic */ boolean m;
    public final /* synthetic */ ln0 n;
    public final /* synthetic */ wm o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn0(ln0 ln0Var, wm wmVar, sx sxVar) {
        super(6, sxVar);
        this.n = ln0Var;
        this.o = wmVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:122:0x030b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0326  */
    /* JADX WARN: Code duplicated, block: B:129:0x033e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0346  */
    /* JADX WARN: Code duplicated, block: B:133:0x035c  */
    /* JADX WARN: Code duplicated, block: B:138:0x037c  */
    /* JADX WARN: Code duplicated, block: B:139:0x038c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x038e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0396  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:163:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:166:0x0405  */
    /* JADX WARN: Code duplicated, block: B:169:0x0409  */
    /* JADX WARN: Code duplicated, block: B:171:0x040d  */
    /* JADX WARN: Code duplicated, block: B:172:0x040f  */
    /* JADX WARN: Code duplicated, block: B:175:0x041b  */
    /* JADX WARN: Code duplicated, block: B:176:0x041e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0441  */
    /* JADX WARN: Code duplicated, block: B:180:0x0449  */
    /* JADX WARN: Code duplicated, block: B:181:0x0455  */
    /* JADX WARN: Code duplicated, block: B:183:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x045c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x045e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0464 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0471  */
    /* JADX WARN: Code duplicated, block: B:195:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0493  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:210:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:216:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:219:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:222:0x0501  */
    /* JADX WARN: Code duplicated, block: B:226:0x051b  */
    /* JADX WARN: Code duplicated, block: B:233:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0496 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x020e  */
    /* JADX WARN: Code duplicated, block: B:92:0x021e A[LOOP:1: B:90:0x0218->B:92:0x021e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        Object next;
        wm wmVar;
        Double d;
        pf1 pf1Var;
        wm wmVar2;
        int i;
        Double d2;
        Double d3;
        int iE0;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        int size;
        int i2;
        boolean z;
        LinkedHashMap linkedHashMap3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size2;
        int i3;
        List list;
        yw1 yw1Var;
        mi0 mi0VarO;
        ArrayList arrayList4;
        int size3;
        int i4;
        ul2 ul2Var;
        r22 r22Var;
        u22 u22Var;
        g22 g22Var;
        Integer num;
        Integer num2;
        t22 t22Var;
        Integer num3;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        ul2 ul2Var2;
        int iFloorDiv;
        int iFloorMod;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iIntValue;
        Integer num4;
        Object objValueOf;
        Object obj2;
        Object key;
        ks ksVarC;
        Iterator it;
        Object next2;
        Object next3;
        Long lValueOf;
        Object arrayList5;
        Collection collectionA;
        Double dValueOf;
        pf1 pf1Var2;
        double dDoubleValue;
        Object next4;
        List list2 = this.i;
        List list3 = this.j;
        List list4 = this.k;
        List list5 = this.l;
        boolean z2 = this.m;
        ix.Q(obj);
        Iterator it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!ws0.j(((u22) next).b, "fuel"));
        u22 u22Var2 = (u22) next;
        this.n.d.getClass();
        int iA = jb2.a();
        boolean z3 = true;
        wm wmVar3 = this.o;
        if (z2) {
            Integer num5 = wmVar3.j;
            int i11 = wmVar3.h;
            list5.getClass();
            d = null;
            List listD0 = vq.d0(list5, s5.C(new o01(25), new o01(26)));
            qf1 qf1Var = (qf1) vq.X(listD0);
            if (qf1Var == null) {
                pf1Var2 = null;
                wmVar = wmVar3;
            } else {
                int iMax = Math.max(qf1Var.d, i11);
                long j = qf1Var.a;
                wmVar = wmVar3;
                long j2 = qf1Var.b;
                int i12 = qf1Var.c;
                tf1 tf1Var = qf1Var.e;
                Long l = qf1Var.f;
                tf1Var.getClass();
                qf1 qf1Var2 = new qf1(j, j2, i12, iMax, tf1Var, l);
                int size4 = listD0.size() - 1;
                if (size4 < 0) {
                    size4 = 0;
                }
                if (size4 < 0) {
                    fu1.i("Requested element count ", size4, " is less than zero.");
                    collectionA = null;
                } else if (size4 == 0) {
                    collectionA = cb0.e;
                } else if (size4 >= listD0.size()) {
                    collectionA = vq.h0(listD0);
                } else if (size4 == 1) {
                    listD0.getClass();
                    if (listD0 instanceof List) {
                        next4 = vq.Q(listD0);
                    } else {
                        Iterator it3 = listD0.iterator();
                        if (it3.hasNext()) {
                            next4 = it3.next();
                        } else {
                            fu1.k("Collection is empty.");
                            next4 = null;
                        }
                    }
                    collectionA = vs0.u(next4);
                } else {
                    ArrayList arrayList6 = new ArrayList(size4);
                    Iterator it4 = listD0.iterator();
                    int i13 = 0;
                    while (it4.hasNext()) {
                        arrayList6.add(it4.next());
                        i13++;
                        if (i13 == size4) {
                            break;
                        }
                    }
                    collectionA = vs0.A(arrayList6);
                }
                ArrayList arrayListZ = vq.Z(collectionA, qf1Var2);
                le leVar = new le();
                Iterator it5 = new du1(arrayListZ).iterator();
                int i14 = Integer.MAX_VALUE;
                while (true) {
                    ListIterator listIterator = (ListIterator) ((cu1) it5).f;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    qf1 qf1Var3 = (qf1) listIterator.previous();
                    if (qf1Var3.d <= i14) {
                        leVar.addFirst(qf1Var3);
                        i14 = qf1Var3.d;
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : leVar) {
                    if (iA - ((qf1) obj3).c <= 365) {
                        arrayList7.add(obj3);
                    }
                }
                Double dZ = sv.Z(arrayList7, iA);
                if (dZ == null) {
                    dZ = sv.Z(leVar, iA);
                }
                if (dZ != null) {
                    dDoubleValue = dZ.doubleValue();
                } else {
                    if (num5 != null) {
                        double dIntValue = num5.intValue();
                        dValueOf = Double.valueOf(dIntValue);
                        if (dIntValue <= 0.0d) {
                            dValueOf = null;
                        }
                    } else {
                        dValueOf = null;
                    }
                    if (dValueOf != null) {
                        dDoubleValue = dValueOf.doubleValue();
                    } else {
                        pf1Var2 = null;
                    }
                }
                double d4 = dDoubleValue;
                of1 of1Var = dZ != null ? of1.e : of1.f;
                int iH = ex.h(iA - qf1Var2.c, 0, 120);
                double d5 = d4 > 500.0d ? 500.0d : d4;
                pf1Var2 = new pf1(p61.i0(((double) iH) * d5) + qf1Var2.d, d5, qf1Var2.d, qf1Var2.c, of1Var);
            }
            pf1Var = pf1Var2;
        } else {
            wmVar = wmVar3;
            d = null;
            pf1Var = null;
        }
        if (pf1Var != null) {
            i = pf1Var.a;
            wmVar2 = wmVar;
        } else {
            wmVar2 = wmVar;
            i = wmVar2.h;
        }
        if (pf1Var == null) {
            Integer num6 = wmVar2.j;
            if (num6 != null) {
                d3 = new Double(num6.intValue());
            } else {
                d2 = d;
            }
            wmVar2.getClass();
            list3.getClass();
            list4.getClass();
            iE0 = h61.e0(wq.G(list2, 10));
            if (iE0 < 16) {
                iE0 = 16;
            }
            linkedHashMap = new LinkedHashMap(iE0);
            for (Object obj4 : list2) {
                linkedHashMap.put(Long.valueOf(((u22) obj4).a), obj4);
            }
            arrayList = new ArrayList();
            for (Object obj5 : list4) {
                if (((g22) obj5).i == d22.e) {
                    arrayList.add(obj5);
                }
            }
            linkedHashMap2 = new LinkedHashMap();
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                Object obj6 = arrayList.get(i2);
                i2++;
                boolean z4 = z3;
                int i15 = size;
                lValueOf = Long.valueOf(((g22) obj6).c);
                arrayList5 = linkedHashMap2.get(lValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(lValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj6);
                size = i15;
                z3 = z4;
            }
            z = z3;
            linkedHashMap3 = new LinkedHashMap(h61.e0(linkedHashMap2.size()));
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                key = entry.getKey();
                List list6 = (List) entry.getValue();
                n30 n30Var = new n30(7);
                n30 n30Var2 = new n30(8);
                ej0[] ej0VarArr = new ej0[2];
                ej0VarArr[0] = n30Var;
                ej0VarArr[z ? 1 : 0] = n30Var2;
                ksVarC = s5.C(ej0VarArr);
                list6.getClass();
                it = list6.iterator();
                if (it.hasNext()) {
                    qj.t();
                    return d;
                }
                next2 = it.next();
                while (it.hasNext()) {
                    next3 = it.next();
                    if (ksVarC.compare(next2, next3) < 0) {
                        next2 = next3;
                    }
                }
                linkedHashMap3.put(key, (g22) next2);
            }
            arrayList2 = new ArrayList();
            for (Object obj7 : list3) {
                if (((r22) obj7).e) {
                    arrayList2.add(obj7);
                }
            }
            arrayList3 = new ArrayList();
            size2 = arrayList2.size();
            i3 = 0;
            while (i3 < size2) {
                Object obj8 = arrayList2.get(i3);
                i3++;
                r22Var = (r22) obj8;
                u22Var = (u22) linkedHashMap.get(Long.valueOf(r22Var.b));
                if (u22Var == null) {
                    linkedHashMap3 = linkedHashMap3;
                    list4 = list4;
                    obj2 = d;
                } else {
                    g22Var = (g22) linkedHashMap3.get(Long.valueOf(r22Var.b));
                    num = r22Var.d;
                    num2 = r22Var.c;
                    if (num2 == null || num != null) {
                        t22Var = t22.h;
                        if (g22Var == null) {
                            ul2Var2 = new ul2(u22Var, r22Var, null, null, null, null, null, d2, t22Var);
                        } else {
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                                num4 = g22Var.e;
                                if (num4 != null) {
                                    objValueOf = Integer.valueOf(num4.intValue() + iIntValue);
                                } else {
                                    objValueOf = d;
                                }
                                num3 = objValueOf;
                            } else {
                                num3 = d;
                            }
                            if (num3 != 0) {
                                numValueOf = Integer.valueOf(num3.intValue() - i);
                            } else {
                                numValueOf = d;
                            }
                            if (num != null) {
                                int iIntValue2 = num.intValue();
                                wp wpVarV = p61.V(g22Var.d);
                                int i16 = (wpVarV.b - 1) + (wpVarV.a * 12) + iIntValue2;
                                iFloorDiv = Math.floorDiv(i16, 12);
                                iFloorMod = Math.floorMod(i16, 12);
                                i5 = iFloorMod + 1;
                                i6 = wpVarV.c;
                                switch (i5) {
                                    case 1:
                                    case 3:
                                    case 5:
                                    case 7:
                                    case 8:
                                    case 10:
                                    case 12:
                                        i7 = iFloorMod;
                                        i8 = 31;
                                        break;
                                    case 2:
                                    default:
                                        if (iFloorDiv % 4 == 0) {
                                            if (iFloorDiv % 100 == 0) {
                                                i7 = iFloorMod;
                                                if (iFloorDiv % 400 == 0) {
                                                }
                                            } else {
                                                i7 = iFloorMod;
                                            }
                                            i8 = 29;
                                        } else {
                                            i7 = iFloorMod;
                                        }
                                        i8 = 28;
                                        break;
                                    case 4:
                                    case 6:
                                    case 9:
                                    case 11:
                                        i7 = iFloorMod;
                                        i8 = 30;
                                        break;
                                }
                                if (i6 > i8) {
                                    i6 = i8;
                                }
                                if (i5 <= 2) {
                                    iFloorDiv--;
                                }
                                if (iFloorDiv >= 0) {
                                    i9 = iFloorDiv;
                                } else {
                                    i9 = iFloorDiv - 399;
                                }
                                int i17 = i9 / 400;
                                int i18 = iFloorDiv - (i17 * 400);
                                if (i5 > 2) {
                                    i10 = i7 - 2;
                                } else {
                                    i10 = i7 + 10;
                                }
                                numValueOf2 = Integer.valueOf(((i17 * 146097) + ((((i18 / 4) + (i18 * 365)) - (i18 / 100)) + (((((i10 * 153) + 2) / 5) + i6) - 1))) - 719468);
                            } else {
                                numValueOf2 = d;
                            }
                            if (numValueOf2 != 0) {
                                numValueOf3 = Integer.valueOf(numValueOf2.intValue() - iA);
                            } else {
                                numValueOf3 = d;
                            }
                            if (numValueOf == 0 || numValueOf3 != 0) {
                                t22Var = ((numValueOf != 0 || numValueOf.intValue() > 0) && (numValueOf3 == 0 || numValueOf3.intValue() > 0)) ? ((numValueOf != 0 || numValueOf.intValue() > 500) && (numValueOf3 == 0 || numValueOf3.intValue() > 14)) ? t22.g : t22.f : t22.e;
                            }
                            ul2Var2 = new ul2(u22Var, r22Var, g22Var, num3, numValueOf2, numValueOf, numValueOf3, d2, t22Var);
                        }
                        obj2 = ul2Var2;
                    } else {
                        ul2Var2 = new ul2(u22Var, r22Var, g22Var, null, null, null, null, d2, t22.i);
                    }
                    linkedHashMap3 = linkedHashMap3;
                    list4 = list4;
                    obj2 = ul2Var2;
                }
                if (obj2 != null) {
                    arrayList3.add(obj2);
                }
                linkedHashMap3 = linkedHashMap3;
                list4 = list4;
            }
            list = list4;
            if (arrayList3.isEmpty()) {
                yw1Var = new yw1(22);
            } else {
                size3 = arrayList3.size();
                i4 = 0;
                while (true) {
                    if (i4 < size3) {
                        Object obj9 = arrayList3.get(i4);
                        i4++;
                        ul2Var = (ul2) obj9;
                        if (ul2Var.f == null && ul2Var.a() == null) {
                            yw1Var = new yw1(23);
                        }
                    } else {
                        yw1Var = new yw1(22);
                    }
                }
            }
            yw1 yw1Var2 = new yw1(24);
            yw1 yw1Var3 = new yw1(25);
            ej0[] ej0VarArr2 = new ej0[3];
            ej0VarArr2[0] = yw1Var2;
            ej0VarArr2[z ? 1 : 0] = yw1Var;
            ej0VarArr2[2] = yw1Var3;
            List listD1 = vq.d0(arrayList3, s5.C(ej0VarArr2));
            if (u22Var2 != null) {
                arrayList4 = new ArrayList();
                for (Object obj10 : list) {
                    if (((g22) obj10).c == u22Var2.a) {
                        arrayList4.add(obj10);
                    }
                }
                mi0VarO = mx.o(arrayList4);
            } else {
                mi0VarO = d;
            }
            return new hn0(this.o, listD1, mi0VarO, pf1Var, false);
        }
        d3 = new Double(pf1Var.b);
        d2 = d3;
        wmVar2.getClass();
        list3.getClass();
        list4.getClass();
        iE0 = h61.e0(wq.G(list2, 10));
        if (iE0 < 16) {
            iE0 = 16;
        }
        linkedHashMap = new LinkedHashMap(iE0);
        while (r1.hasNext()) {
            linkedHashMap.put(Long.valueOf(((u22) obj4).a), obj4);
        }
        arrayList = new ArrayList();
        while (r5.hasNext()) {
            if (((g22) obj5).i == d22.e) {
                arrayList.add(obj5);
            }
        }
        linkedHashMap2 = new LinkedHashMap();
        size = arrayList.size();
        i2 = 0;
        while (i2 < size) {
            Object obj11 = arrayList.get(i2);
            i2++;
            boolean z5 = z3;
            int i19 = size;
            lValueOf = Long.valueOf(((g22) obj11).c);
            arrayList5 = linkedHashMap2.get(lValueOf);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap2.put(lValueOf, arrayList5);
            }
            ((List) arrayList5).add(obj11);
            size = i19;
            z3 = z5;
        }
        z = z3;
        linkedHashMap3 = new LinkedHashMap(h61.e0(linkedHashMap2.size()));
        while (r5.hasNext()) {
            key = entry.getKey();
            List list7 = (List) entry.getValue();
            n30 n30Var3 = new n30(7);
            n30 n30Var4 = new n30(8);
            ej0[] ej0VarArr3 = new ej0[2];
            ej0VarArr3[0] = n30Var3;
            ej0VarArr3[z ? 1 : 0] = n30Var4;
            ksVarC = s5.C(ej0VarArr3);
            list7.getClass();
            it = list7.iterator();
            if (it.hasNext()) {
                qj.t();
                return d;
            }
            next2 = it.next();
            while (it.hasNext()) {
                next3 = it.next();
                if (ksVarC.compare(next2, next3) < 0) {
                    next2 = next3;
                }
            }
            linkedHashMap3.put(key, (g22) next2);
        }
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            if (((r22) obj7).e) {
                arrayList2.add(obj7);
            }
        }
        arrayList3 = new ArrayList();
        size2 = arrayList2.size();
        i3 = 0;
        while (i3 < size2) {
            Object obj12 = arrayList2.get(i3);
            i3++;
            r22Var = (r22) obj12;
            u22Var = (u22) linkedHashMap.get(Long.valueOf(r22Var.b));
            if (u22Var == null) {
                linkedHashMap3 = linkedHashMap3;
                list4 = list4;
                obj2 = d;
            } else {
                g22Var = (g22) linkedHashMap3.get(Long.valueOf(r22Var.b));
                num = r22Var.d;
                num2 = r22Var.c;
                if (num2 == null) {
                    t22Var = t22.h;
                    if (g22Var == null) {
                        ul2Var2 = new ul2(u22Var, r22Var, null, null, null, null, null, d2, t22Var);
                        linkedHashMap3 = linkedHashMap3;
                        list4 = list4;
                    } else {
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                            num4 = g22Var.e;
                            if (num4 != null) {
                                objValueOf = Integer.valueOf(num4.intValue() + iIntValue);
                            } else {
                                objValueOf = d;
                            }
                            num3 = objValueOf;
                        } else {
                            num3 = d;
                        }
                        if (num3 != 0) {
                            numValueOf = Integer.valueOf(num3.intValue() - i);
                        } else {
                            numValueOf = d;
                        }
                        if (num != null) {
                            int iIntValue3 = num.intValue();
                            wp wpVarV2 = p61.V(g22Var.d);
                            int i110 = (wpVarV2.b - 1) + (wpVarV2.a * 12) + iIntValue3;
                            iFloorDiv = Math.floorDiv(i110, 12);
                            iFloorMod = Math.floorMod(i110, 12);
                            i5 = iFloorMod + 1;
                            i6 = wpVarV2.c;
                            switch (i5) {
                                case 1:
                                case 3:
                                case 5:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                    i7 = iFloorMod;
                                    i8 = 31;
                                    break;
                                case 2:
                                default:
                                    if (iFloorDiv % 4 == 0) {
                                        if (iFloorDiv % 100 == 0) {
                                            i7 = iFloorMod;
                                            if (iFloorDiv % 400 == 0) {
                                            }
                                        } else {
                                            i7 = iFloorMod;
                                        }
                                        i8 = 29;
                                    } else {
                                        i7 = iFloorMod;
                                    }
                                    i8 = 28;
                                    break;
                                case 4:
                                case 6:
                                case 9:
                                case 11:
                                    i7 = iFloorMod;
                                    i8 = 30;
                                    break;
                            }
                            if (i6 > i8) {
                                i6 = i8;
                            }
                            if (i5 <= 2) {
                                iFloorDiv--;
                            }
                            if (iFloorDiv >= 0) {
                                i9 = iFloorDiv;
                            } else {
                                i9 = iFloorDiv - 399;
                            }
                            int i111 = i9 / 400;
                            int i112 = iFloorDiv - (i111 * 400);
                            if (i5 > 2) {
                                i10 = i7 - 2;
                            } else {
                                i10 = i7 + 10;
                            }
                            numValueOf2 = Integer.valueOf(((i111 * 146097) + ((((i112 / 4) + (i112 * 365)) - (i112 / 100)) + (((((i10 * 153) + 2) / 5) + i6) - 1))) - 719468);
                        } else {
                            numValueOf2 = d;
                        }
                        if (numValueOf2 != 0) {
                            numValueOf3 = Integer.valueOf(numValueOf2.intValue() - iA);
                        } else {
                            numValueOf3 = d;
                        }
                        if (numValueOf == 0) {
                            if (numValueOf != 0) {
                                if (numValueOf != 0) {
                                }
                            }
                        } else if (numValueOf != 0) {
                            if (numValueOf != 0) {
                            }
                        }
                        ul2Var2 = new ul2(u22Var, r22Var, g22Var, num3, numValueOf2, numValueOf, numValueOf3, d2, t22Var);
                    }
                } else {
                    t22Var = t22.h;
                    if (g22Var == null) {
                        ul2Var2 = new ul2(u22Var, r22Var, null, null, null, null, null, d2, t22Var);
                        linkedHashMap3 = linkedHashMap3;
                        list4 = list4;
                    } else {
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                            num4 = g22Var.e;
                            if (num4 != null) {
                                objValueOf = Integer.valueOf(num4.intValue() + iIntValue);
                            } else {
                                objValueOf = d;
                            }
                            num3 = objValueOf;
                        } else {
                            num3 = d;
                        }
                        if (num3 != 0) {
                            numValueOf = Integer.valueOf(num3.intValue() - i);
                        } else {
                            numValueOf = d;
                        }
                        if (num != null) {
                            int iIntValue4 = num.intValue();
                            wp wpVarV3 = p61.V(g22Var.d);
                            int i113 = (wpVarV3.b - 1) + (wpVarV3.a * 12) + iIntValue4;
                            iFloorDiv = Math.floorDiv(i113, 12);
                            iFloorMod = Math.floorMod(i113, 12);
                            i5 = iFloorMod + 1;
                            i6 = wpVarV3.c;
                            switch (i5) {
                                case 1:
                                case 3:
                                case 5:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                    i7 = iFloorMod;
                                    i8 = 31;
                                    break;
                                case 2:
                                default:
                                    if (iFloorDiv % 4 == 0) {
                                        if (iFloorDiv % 100 == 0) {
                                            i7 = iFloorMod;
                                            if (iFloorDiv % 400 == 0) {
                                            }
                                        } else {
                                            i7 = iFloorMod;
                                        }
                                        i8 = 29;
                                    } else {
                                        i7 = iFloorMod;
                                    }
                                    i8 = 28;
                                    break;
                                case 4:
                                case 6:
                                case 9:
                                case 11:
                                    i7 = iFloorMod;
                                    i8 = 30;
                                    break;
                            }
                            if (i6 > i8) {
                                i6 = i8;
                            }
                            if (i5 <= 2) {
                                iFloorDiv--;
                            }
                            if (iFloorDiv >= 0) {
                                i9 = iFloorDiv;
                            } else {
                                i9 = iFloorDiv - 399;
                            }
                            int i114 = i9 / 400;
                            int i115 = iFloorDiv - (i114 * 400);
                            if (i5 > 2) {
                                i10 = i7 - 2;
                            } else {
                                i10 = i7 + 10;
                            }
                            numValueOf2 = Integer.valueOf(((i114 * 146097) + ((((i115 / 4) + (i115 * 365)) - (i115 / 100)) + (((((i10 * 153) + 2) / 5) + i6) - 1))) - 719468);
                        } else {
                            numValueOf2 = d;
                        }
                        if (numValueOf2 != 0) {
                            numValueOf3 = Integer.valueOf(numValueOf2.intValue() - iA);
                        } else {
                            numValueOf3 = d;
                        }
                        if (numValueOf == 0) {
                            if (numValueOf != 0) {
                                if (numValueOf != 0) {
                                }
                            }
                        } else if (numValueOf != 0) {
                            if (numValueOf != 0) {
                            }
                        }
                        ul2Var2 = new ul2(u22Var, r22Var, g22Var, num3, numValueOf2, numValueOf, numValueOf3, d2, t22Var);
                    }
                }
                obj2 = ul2Var2;
            }
            if (obj2 != null) {
                arrayList3.add(obj2);
            }
            linkedHashMap3 = linkedHashMap3;
            list4 = list4;
        }
        list = list4;
        if (arrayList3.isEmpty()) {
            yw1Var = new yw1(22);
        } else {
            size3 = arrayList3.size();
            i4 = 0;
            while (true) {
                if (i4 < size3) {
                    Object obj13 = arrayList3.get(i4);
                    i4++;
                    ul2Var = (ul2) obj13;
                    if (ul2Var.f == null) {
                    }
                } else {
                    yw1Var = new yw1(22);
                }
            }
        }
        yw1 yw1Var4 = new yw1(24);
        yw1 yw1Var5 = new yw1(25);
        ej0[] ej0VarArr4 = new ej0[3];
        ej0VarArr4[0] = yw1Var4;
        ej0VarArr4[z ? 1 : 0] = yw1Var;
        ej0VarArr4[2] = yw1Var5;
        List listD2 = vq.d0(arrayList3, s5.C(ej0VarArr4));
        if (u22Var2 != null) {
            arrayList4 = new ArrayList();
            while (r2.hasNext()) {
                if (((g22) obj10).c == u22Var2.a) {
                    arrayList4.add(obj10);
                }
            }
            mi0VarO = mx.o(arrayList4);
        } else {
            mi0VarO = d;
        }
        return new hn0(this.o, listD2, mi0VarO, pf1Var, false);
    }
}

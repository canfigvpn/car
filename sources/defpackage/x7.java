package defpackage;

import android.graphics.RectF;
import ir.alirezaivaz.mygarage.MainActivity;
import ir.alirezaivaz.mygarage.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x7 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x7(kl0 kl0Var, ge geVar) {
        this.e = 11;
        this.f = geVar;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x034e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0350 A[Catch: all -> 0x0387, LOOP:6: B:152:0x0324->B:162:0x0350, LOOP_END, TryCatch #1 {all -> 0x0387, blocks: (B:149:0x030f, B:152:0x0324, B:154:0x0330, B:156:0x033a, B:158:0x0340, B:159:0x0348, B:162:0x0350, B:163:0x0353, B:166:0x035e, B:168:0x036a, B:170:0x0374, B:172:0x037a, B:175:0x0389, B:178:0x0391, B:179:0x0394), top: B:354:0x030f }] */
    /* JADX WARN: Code duplicated, block: B:177:0x038f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0391 A[Catch: all -> 0x0387, LOOP:8: B:166:0x035e->B:178:0x0391, LOOP_END, TryCatch #1 {all -> 0x0387, blocks: (B:149:0x030f, B:152:0x0324, B:154:0x0330, B:156:0x033a, B:158:0x0340, B:159:0x0348, B:162:0x0350, B:163:0x0353, B:166:0x035e, B:168:0x036a, B:170:0x0374, B:172:0x037a, B:175:0x0389, B:178:0x0391, B:179:0x0394), top: B:354:0x030f }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[LOOP:0: B:16:0x003e->B:29:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0202  */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x0202, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        boolean zG;
        gw1 gw1Var;
        int i;
        char c;
        char c2;
        String strR;
        char c3 = 7;
        nm nmVarY = null;
        k12Var = null;
        k12Var = null;
        k12Var = null;
        k12 k12Var = null;
        ot0 ot0Var = null;
        boolean z = false;
        int i2 = 1;
        switch (this.e) {
            case 0:
                fu1 fu1Var = (fu1) this.f;
                yr1 yr1VarL = ux.L((RectF) obj);
                yr1 yr1VarL2 = ux.L((RectF) obj2);
                switch (fu1Var.e) {
                    case 12:
                        zG = yr1VarL.g(yr1VarL2);
                        break;
                    default:
                        zG = yr1VarL2.a(yr1VarL.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case 1:
                ((Integer) obj2).getClass();
                xj.a((u71) this.f, (ak0) obj, ei1.P(1));
                return ll2.a;
            case 2:
                ni0 ni0Var = (ni0) this.f;
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ef2.b(f22.c(ni0Var, ak0Var), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var, 0, 0, 262142);
                } else {
                    ak0Var.R();
                }
                return ll2.a;
            case 3:
                wm wmVar = (wm) this.f;
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ef2.b(wmVar.b, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var2, 0, 0, 262142);
                } else {
                    ak0Var2.R();
                }
                return ll2.a;
            case 4:
                rs1 rs1Var = (rs1) this.f;
                ((Integer) obj).getClass();
                if (obj2 instanceof ju) {
                    ju juVar = (ju) obj2;
                    x91 x91Var = (x91) rs1Var.h;
                    if (x91Var == null) {
                        x91 x91Var2 = kx1.a;
                        x91Var = new x91();
                        rs1Var.h = x91Var;
                    }
                    x91Var.k(juVar);
                    ((fa1) rs1Var.e).b(juVar);
                }
                if (obj2 instanceof ek0) {
                    rs1Var.f((ek0) obj2);
                }
                if (obj2 instanceof lr1) {
                    ((lr1) obj2).c();
                }
                return ll2.a;
            case 5:
                ((Integer) obj2).getClass();
                sv.g((me2) this.f, (ak0) obj, ei1.P(1));
                return ll2.a;
            case 6:
                return (g82) this.f;
            case 7:
                uc2 uc2Var = (uc2) this.f;
                ak0 ak0Var3 = (ak0) obj;
                ((Integer) obj2).getClass();
                ak0Var3.W(666084174);
                String str = uc2Var.b;
                ak0Var3.p(false);
                return str;
            case 8:
                ((Integer) obj2).getClass();
                rw.c((h50) this.f, (ak0) obj, ei1.P(1));
                return ll2.a;
            case 9:
                ak0 ak0Var4 = (ak0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    throw null;
                }
                ak0Var4.R();
                return ll2.a;
            case 10:
                ((Integer) obj2).getClass();
                gn0.g((t22) this.f, (ak0) obj, ei1.P(1));
                return ll2.a;
            case 11:
                ge geVar = (ge) this.f;
                m40 m40Var = (m40) obj;
                sw swVar = (sw) obj2;
                if (sw.h(swVar.a) == Integer.MAX_VALUE) {
                    yp0.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = sw.h(swVar.a);
                int iO = iH - (m40Var.O(geVar.a()) * 2);
                int i3 = iO / 3;
                int i4 = iO % 3;
                ArrayList arrayList = new ArrayList(3);
                int i5 = 0;
                while (i5 < 3) {
                    arrayList.add(Integer.valueOf((i5 < i4 ? 1 : 0) + i3));
                    i5++;
                }
                int[] iArrG0 = vq.g0(arrayList);
                int[] iArr = new int[iArrG0.length];
                geVar.d(m40Var, iH, iArrG0, kw0.e, iArr);
                return new dq0(19, iArrG0, iArr);
            case 12:
                ((Integer) obj2).getClass();
                ex.d((gt) this.f, (ak0) obj, ei1.P(7));
                return ll2.a;
            case 13:
                ((Integer) obj2).getClass();
                s5.q((j11) this.f, r71.a, (ak0) obj, ei1.P(1));
                return ll2.a;
            case 14:
                String str2 = (String) this.f;
                ak0 ak0Var5 = (ak0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ak0Var5.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (ws0.j(str2, "ژ")) {
                        str2 = "♿";
                    }
                    ef2.b(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var5, 0, 0, 262142);
                } else {
                    ak0Var5.R();
                }
                return ll2.a;
            case 15:
                dw1 dw1Var = (dw1) obj;
                List list = (List) ((ij0) this.f).g(dw1Var, obj2);
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj3 = list.get(i6);
                    if (obj3 != null && (gw1Var = dw1Var.f) != null && !gw1Var.d(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i6 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 16:
                u22 u22Var = (u22) this.f;
                ak0 ak0Var6 = (ak0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (ak0Var6.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ef2.b(u22Var.d + "  " + f22.d(u22Var, ak0Var6), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var6, 0, 0, 262142);
                } else {
                    ak0Var6.R();
                }
                return ll2.a;
            case 17:
                f41 f41Var = (f41) this.f;
                ak0 ak0Var7 = (ak0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (ak0Var7.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zH = ak0Var7.h(f41Var);
                    Object objL = ak0Var7.L();
                    if (zH || objL == cv.a) {
                        t4 t4Var = new t4(0, f41Var, f41.class, "useCarOdometer", "useCarOdometer()V", 0, 5);
                        ak0Var7.g0(t4Var);
                        objL = t4Var;
                    }
                    j20.h((ti0) ((tj0) objL), p61.f0(r71.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), false, null, null, null, nj2.n, ak0Var7, 805306416, 508);
                } else {
                    ak0Var7.R();
                }
                return ll2.a;
            case 18:
                is isVar = (is) this.f;
                ak0 ak0Var8 = (ak0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ak0Var8.O(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    int iOrdinal = isVar.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.log_action_skip;
                    } else if (iOrdinal == 1) {
                        i = R.string.log_action_review;
                    } else {
                        if (iOrdinal != 2) {
                            qj.p();
                            return null;
                        }
                        i = R.string.log_action_change;
                    }
                    ef2.b(j02.r(i, ak0Var8), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var8, 0, 0, 262142);
                } else {
                    ak0Var8.R();
                }
                return ll2.a;
            case 19:
                ((id2) this.f).e(((uf1) obj2).a);
                return ll2.a;
            case 20:
                MainActivity mainActivity = (MainActivity) this.f;
                ak0 ak0Var9 = (ak0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i7 = MainActivity.D;
                if (ak0Var9.O(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    da1 da1VarR = qx.r(((o32) mainActivity.C.getValue()).c, ak0Var9);
                    int iOrdinal2 = ((wd) da1VarR.getValue()).a.ordinal();
                    if (iOrdinal2 == 0) {
                        ak0Var9.W(-1581552731);
                        boolean zE = vv.E(ak0Var9);
                        ak0Var9.p(false);
                        z = zE;
                    } else if (iOrdinal2 == 1) {
                        ak0Var9.W(-1783437120);
                        ak0Var9.p(false);
                    } else {
                        if (iOrdinal2 != 2) {
                            ak0Var9.W(-1581554621);
                            ak0Var9.p(false);
                            qj.p();
                            return null;
                        }
                        ak0Var9.W(-1783397477);
                        ak0Var9.p(false);
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean zH2 = ak0Var9.h(mainActivity) | ak0Var9.g(z);
                    Object objL2 = ak0Var9.L();
                    if (zH2 || objL2 == cv.a) {
                        objL2 = new dg(mainActivity, z, i2);
                        ak0Var9.g0(objL2);
                    }
                    s5.e(boolValueOf, (ej0) objL2, ak0Var9);
                    cg2.a(z, ((wd) da1VarR.getValue()).b, ak0Var9, 384);
                } else {
                    ak0Var9.R();
                }
                return ll2.a;
            case 21:
                y81 y81Var = (y81) this.f;
                Set set = (Set) obj;
                synchronized (y81Var.a) {
                    try {
                        w91 w91Var = y81Var.b;
                        d dVar = new d(28, set, y81Var);
                        nj2.i(1, dVar);
                        Object[] objArr = w91Var.b;
                        long[] jArr = w91Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j = jArr[i8];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j & 255) < 128) {
                                            dVar.h(objArr[(i8 << 3) + i10]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i9 == 8) {
                                        if (i8 != length) {
                                            i8++;
                                        }
                                    }
                                } else if (i8 != length) {
                                    i8++;
                                }
                            }
                        }
                        x91 x91Var3 = y81Var.d;
                        Object[] objArr2 = x91Var3.b;
                        long[] jArr2 = x91Var3.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j2 = jArr2[i11];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if ((j2 & 255) < 128) {
                                            ((k12) objArr2[(i11 << 3) + i13]).c(ll2.a);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i12 == 8) {
                                        if (i11 != length2) {
                                            i11++;
                                        }
                                    }
                                } else if (i11 != length2) {
                                    i11++;
                                }
                            }
                        }
                        y81Var.d.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ll2.a;
            case 22:
                rr1 rr1Var = (rr1) this.f;
                Set set2 = (Set) obj;
                synchronized (rr1Var.c) {
                    try {
                        if (((or1) rr1Var.u.getValue()).compareTo(or1.i) >= 0) {
                            x91 x91Var4 = rr1Var.h;
                            if (set2 instanceof lx1) {
                                x91 x91Var5 = ((lx1) set2).e;
                                Object[] objArr3 = x91Var5.b;
                                long[] jArr3 = x91Var5.a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j3 = jArr3[i14];
                                        if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj4 = objArr3[(i14 << 3) + i16];
                                                    c2 = c3;
                                                    if (!(obj4 instanceof w82) || ((w82) obj4).f(1)) {
                                                        x91Var4.a(obj4);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j3 >>= 8;
                                                i16++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i15 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i14 != length3) {
                                            i14++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set2) {
                                    if (!(obj5 instanceof w82) || ((w82) obj5).f(1)) {
                                        x91Var4.a(obj5);
                                    }
                                }
                            }
                            nmVarY = rr1Var.y();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (nmVarY != null) {
                    ((om) nmVarY).i(ll2.a);
                }
                return ll2.a;
            case 23:
                yv1 yv1Var = (yv1) this.f;
                int iIntValue9 = ((Integer) obj).intValue();
                sy syVar = (sy) obj2;
                ty key = syVar.getKey();
                sy syVarP = yv1Var.i.p(key);
                if (key == q90.P) {
                    ot0 ot0Var2 = (ot0) syVarP;
                    ot0 parent = (ot0) syVar;
                    while (parent != null) {
                        if (parent != ot0Var2 && (parent instanceof mx1)) {
                            hp hpVar = (hp) we.a.getObjectVolatile((mx1) parent, vt0.e);
                            parent = hpVar != null ? hpVar.getParent() : null;
                        } else {
                            ot0Var = parent;
                            if (ot0Var == ot0Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ot0Var + ", expected child of " + ot0Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (ot0Var2 != null) {
                                iIntValue9++;
                            }
                        }
                    }
                    if (ot0Var == ot0Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ot0Var + ", expected child of " + ot0Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (ot0Var2 != null) {
                        iIntValue9++;
                    }
                } else if (syVar != syVarP) {
                    iIntValue9 = Integer.MIN_VALUE;
                } else {
                    iIntValue9++;
                }
                return Integer.valueOf(iIntValue9);
            case 24:
                ny1 ny1Var = (ny1) this.f;
                nj2.y(ny1Var.t0(), null, new my1(ny1Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 25:
                ((Integer) obj2).getClass();
                ((kz1) this.f).a(ei1.P(7), (ak0) obj);
                return ll2.a;
            case 26:
                fs1 fs1Var = (fs1) this.f;
                ((wn1) obj).a();
                fs1Var.e = ((uf1) obj2).a;
                return ll2.a;
            case 27:
                x52 x52Var = (x52) this.f;
                ak0 ak0Var10 = (ak0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ak0Var10.O(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    j02.b(x52Var, null, null, ak0Var10, 6);
                } else {
                    ak0Var10.R();
                }
                return ll2.a;
            case 28:
                dh dhVar = (dh) this.f;
                ak0 ak0Var11 = (ak0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (ak0Var11.O(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    if (dhVar instanceof bh) {
                        ak0Var11.W(-1266841822);
                        bh bhVar = (bh) dhVar;
                        strR = j02.s(R.string.backup_import_done_body, new Object[]{dv1.B(String.valueOf(bhVar.a), ak0Var11), dv1.B(String.valueOf(bhVar.b), ak0Var11)}, ak0Var11);
                        ak0Var11.p(false);
                    } else if (ws0.j(dhVar, ah.a)) {
                        ak0Var11.W(-1266833197);
                        strR = j02.r(R.string.backup_import_not_a_backup, ak0Var11);
                        ak0Var11.p(false);
                    } else if (ws0.j(dhVar, ch.a)) {
                        ak0Var11.W(-1266830162);
                        strR = j02.r(R.string.backup_import_too_new, ak0Var11);
                        ak0Var11.p(false);
                    } else {
                        if (!ws0.j(dhVar, zg.a)) {
                            ak0Var11.W(-1266843474);
                            ak0Var11.p(false);
                            qj.p();
                            return null;
                        }
                        ak0Var11.W(-1266827279);
                        strR = j02.r(R.string.backup_import_unreadable, ak0Var11);
                        ak0Var11.p(false);
                    }
                    ef2.b(strR, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var11, 0, 0, 262142);
                } else {
                    ak0Var11.R();
                }
                return ll2.a;
            default:
                b52 b52Var = (b52) this.f;
                Set set3 = (Set) obj;
                synchronized (b52Var.a) {
                    try {
                        x91 x91Var6 = b52Var.d;
                        if (x91Var6 != null) {
                            Object[] objArr4 = x91Var6.b;
                            long[] jArr4 = x91Var6.a;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i17 = 0;
                                while (true) {
                                    long j4 = jArr4[i17];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i17 - length4)) >>> 31);
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 < i18) {
                                                if ((j4 & 255) >= 128 || !set3.contains(objArr4[(i17 << 3) + i19])) {
                                                    j4 >>= 8;
                                                    i19++;
                                                } else {
                                                    k12Var = b52Var.f;
                                                }
                                            } else if (i18 == 8) {
                                                if (i17 != length4) {
                                                    i17++;
                                                }
                                            }
                                        }
                                    } else if (i17 != length4) {
                                        i17++;
                                    }
                                }
                            }
                        } else if (vq.O(set3, b52Var.b)) {
                            k12Var = b52Var.f;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (k12Var != null) {
                    k12Var.c(ll2.a);
                }
                return ll2.a;
        }
    }

    public /* synthetic */ x7(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public /* synthetic */ x7(int i, int i2, Object obj) {
        this.e = i2;
        this.f = obj;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j01 implements lz0 {
    public final /* synthetic */ q01 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gj1 c;
    public final /* synthetic */ ti0 d;
    public final /* synthetic */ ie e;
    public final /* synthetic */ ge f;
    public final /* synthetic */ ez g;
    public final /* synthetic */ iq1 h;
    public final /* synthetic */ s3 i;
    public final /* synthetic */ vi j;

    public j01(q01 q01Var, boolean z, gj1 gj1Var, jv0 jv0Var, ie ieVar, ge geVar, ez ezVar, zk0 zk0Var, iq1 iq1Var, s3 s3Var, vi viVar) {
        this.a = q01Var;
        this.b = z;
        this.c = gj1Var;
        this.d = jv0Var;
        this.e = ieVar;
        this.f = geVar;
        this.g = ezVar;
        this.h = iq1Var;
        this.i = s3Var;
        this.j = viVar;
    }

    /* JADX WARN: Code duplicated, block: B:300:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:314:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lz0
    public final x61 a(mz0 mz0Var, long j) throws Throwable {
        float fA;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        cb0 cb0Var;
        cb0 cb0Var2;
        List arrayList;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        i01 i01Var;
        int i10;
        Integer numValueOf;
        k01 k01Var;
        ba2 ba2Var;
        int i11;
        boolean z;
        boolean zA = qr0.a(0L, 0L);
        ba2 ba2Var2 = mz0Var.f;
        q01 q01Var = this.a;
        q01Var.s.getValue();
        boolean z2 = q01Var.b || ba2Var2.r();
        di1 di1Var = di1.f;
        di1 di1Var2 = di1.e;
        boolean z3 = this.b;
        ws0.l(j, z3 ? di1Var2 : di1Var);
        gj1 gj1Var = this.c;
        int iO = z3 ? ba2Var2.O(gj1Var.a(ba2Var2.getLayoutDirection())) : ba2Var2.O(p61.x(gj1Var, ba2Var2.getLayoutDirection()));
        int iO2 = z3 ? ba2Var2.O(gj1Var.b(ba2Var2.getLayoutDirection())) : ba2Var2.O(p61.w(gj1Var, ba2Var2.getLayoutDirection()));
        int iO3 = ba2Var2.O(gj1Var.d());
        int iO4 = ba2Var2.O(gj1Var.c()) + iO3;
        int i12 = iO + iO2;
        int i13 = z3 ? iO4 : i12;
        int i14 = z3 ? iO3 : !z3 ? iO : iO2;
        int i15 = i13 - i14;
        long jI = tw.i(-i12, -iO4, j);
        g01 g01Var = (g01) this.d.a();
        vy0 vy0Var = g01Var.c;
        int iH = sw.h(jI);
        int iG = sw.g(jI);
        vy0Var.a.i(iH);
        vy0Var.b.i(iG);
        Integer numValueOf2 = null;
        ge geVar = this.f;
        ie ieVar = this.e;
        if (z3) {
            if (ieVar == null) {
                yp0.b("null verticalArrangement when isVertical == true");
                qj.e();
                return null;
            }
            fA = ieVar.a();
        } else {
            if (geVar == null) {
                yp0.b("null horizontalAlignment when isVertical == false");
                qj.e();
                return null;
            }
            fA = geVar.a();
        }
        int iO5 = ba2Var2.O(fA);
        int iA = g01Var.a();
        int iG2 = z3 ? sw.g(j) - iO4 : sw.h(j) - i12;
        int i16 = i14;
        i01 i01Var2 = new i01(jI, this.b, g01Var, mz0Var, iA, iO5, this.i, this.j, i16, i15, (((long) iO) << 32) | (((long) iO3) & 4294967295L), this.a);
        int i17 = iA;
        g01 g01Var2 = i01Var2.b;
        h7 h7Var = g01Var2.d;
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            int iH2 = q01Var.h();
            ky0 ky0Var = q01Var.e;
            int iQ = ei1.q(g01Var, ky0Var.e, iH2);
            if (iH2 != iQ) {
                ky0Var.b.i(iQ);
                ky0Var.f.a(iH2);
            }
            int i18 = q01Var.i();
            c12.s(o62VarJ, o62VarP, ej0VarE);
            List listN = rw.n(g01Var, q01Var.r, q01Var.o);
            float fFloatValue = (ba2Var2.r() || !z2) ? q01Var.h : ((Number) ((ob) q01Var.w.g).f.getValue()).floatValue();
            gz0 gz0Var = q01Var.n;
            boolean zR = ba2Var2.r();
            da1 da1Var = q01Var.v;
            if (i16 < 0) {
                yp0.a("invalid beforeContentPadding");
            }
            if (i15 < 0) {
                yp0.a("invalid afterContentPadding");
            }
            db0 db0Var = db0.e;
            ez ezVar = this.g;
            cb0 cb0Var3 = cb0.e;
            if (i17 <= 0) {
                int iJ = sw.j(jI);
                int i19 = sw.i(jI);
                gz0Var.c(iJ, i19, new ArrayList(), h7Var, i01Var2, zR, 1, z2, 0, 0);
                if (zR) {
                    z = false;
                } else {
                    gz0Var.b();
                    if (zA) {
                        z = false;
                    } else {
                        z = false;
                        iJ = tw.g(0, jI);
                        i19 = tw.f(0, jI);
                    }
                }
                ba2Var = ba2Var2;
                k01Var = new k01(null, 0, false, 0.0f, ba2Var2.d0(tw.g(iJ + i12, j), tw.f(i19 + iO4, j), db0Var, new n30(28)), 0.0f, false, ezVar, mz0Var, i01Var2.d, cb0Var3, -i16, iG2 + i15, 0, z3 ? di1Var2 : di1Var, i15, iO5);
            } else {
                cb0 cb0Var4 = cb0Var3;
                if (iQ >= i17) {
                    iQ = i17 - 1;
                    i18 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i20 = i18 - iRound;
                if (iQ == 0 && i20 < 0) {
                    iRound += i20;
                    i20 = 0;
                }
                le leVar = new le();
                int i21 = -i16;
                int i22 = i20;
                int i23 = i21 + (iO5 < 0 ? iO5 : 0);
                int i24 = i22 + i23;
                float f2 = fFloatValue;
                int i25 = i24;
                int i26 = iQ;
                int iMax = 0;
                while (true) {
                    j2 = i01Var2.d;
                    if (i25 >= 0 || i26 <= 0) {
                        break;
                    }
                    cb0 cb0Var5 = cb0Var4;
                    int i27 = i26 - 1;
                    l01 l01VarN = i01Var2.n(i27, j2);
                    leVar.add(0, l01VarN);
                    iMax = Math.max(iMax, l01VarN.o);
                    i25 += l01VarN.n;
                    i26 = i27;
                    cb0Var4 = cb0Var5;
                }
                cb0 cb0Var6 = cb0Var4;
                if (i25 < i23) {
                    iRound -= i23 - i25;
                    i25 = i23;
                }
                int i28 = iRound;
                int i29 = i25 - i23;
                int i30 = iG2 + i15;
                int i31 = i30 >= 0 ? i30 : 0;
                int i32 = iMax;
                int i33 = -i29;
                int i34 = i29;
                int i35 = i26;
                int i36 = 0;
                boolean z4 = false;
                while (i36 < leVar.g) {
                    if (i33 >= i31) {
                        leVar.b(i36);
                        z4 = true;
                    } else {
                        i35++;
                        i33 += ((l01) leVar.get(i36)).n;
                        i36++;
                    }
                }
                int iMax2 = i32;
                boolean z5 = z4;
                int i37 = i35;
                while (i37 < i17 && (i33 < i31 || i33 <= 0 || leVar.isEmpty())) {
                    int i38 = i31;
                    l01 l01VarN2 = i01Var2.n(i37, j2);
                    int i39 = i17;
                    int i40 = l01VarN2.n;
                    i33 += i40;
                    if (i33 <= i23) {
                        i11 = i23;
                        if (i37 != i39 - 1) {
                            i34 -= i40;
                            i26 = i37 + 1;
                            z5 = true;
                        }
                        i37++;
                        i31 = i38;
                        i23 = i11;
                        i17 = i39;
                    } else {
                        i11 = i23;
                    }
                    iMax2 = Math.max(iMax2, l01VarN2.o);
                    leVar.addLast(l01VarN2);
                    i37++;
                    i31 = i38;
                    i23 = i11;
                    i17 = i39;
                }
                int i41 = i17;
                if (i33 < iG2) {
                    int i42 = iG2 - i33;
                    int i43 = i33 + i42;
                    i4 = i34 - i42;
                    while (i4 < i16 && i26 > 0) {
                        int i44 = i26 - 1;
                        int i45 = i42;
                        l01 l01VarN3 = i01Var2.n(i44, j2);
                        leVar.add(0, l01VarN3);
                        iMax2 = Math.max(iMax2, l01VarN3.o);
                        i4 += l01VarN3.n;
                        i26 = i44;
                        i42 = i45;
                        i43 = i43;
                    }
                    int i46 = i42;
                    int i47 = i43;
                    i = i28;
                    int i48 = i + i46;
                    if (i4 < 0) {
                        i2 = i47 + i4;
                        i3 = i26;
                        i5 = i48 + i4;
                        i4 = 0;
                    } else {
                        i3 = i26;
                        i2 = i47;
                        i5 = i48;
                    }
                } else {
                    i = i28;
                    i2 = i33;
                    i3 = i26;
                    i4 = i34;
                    i5 = i;
                }
                int i49 = iMax2;
                int i50 = i37;
                if (Integer.signum(Math.round(f2)) != Integer.signum(i5) || Math.abs(Math.round(f2)) < Math.abs(i5)) {
                    i6 = i5;
                    f = f2;
                } else {
                    i6 = i5;
                    f = i6;
                }
                float f3 = f2 - f;
                float f4 = 0.0f;
                if (zR && i6 > i && f3 <= 0.0f) {
                    f4 = (i6 - i) + f3;
                }
                float f5 = f4;
                if (i4 < 0) {
                    yp0.a("negative currentFirstItemScrollOffset");
                }
                int i51 = -i4;
                l01 l01Var = (l01) leVar.first();
                if (i16 > 0 || iO5 < 0) {
                    int iA2 = leVar.a();
                    int i52 = i4;
                    int i53 = 0;
                    while (i53 < iA2) {
                        int i54 = iA2;
                        int i55 = ((l01) leVar.get(i53)).n;
                        if (i52 == 0 || i55 > i52 || i53 == leVar.a() - 1) {
                            break;
                        }
                        i52 -= i55;
                        i53++;
                        l01Var = (l01) leVar.get(i53);
                        iA2 = i54;
                    }
                    i7 = i52;
                    cb0Var = cb0Var6;
                } else {
                    cb0Var = cb0Var6;
                    i7 = i4;
                }
                l01 l01Var2 = l01Var;
                int iMax3 = Math.max(0, i3);
                int i56 = i3 - 1;
                if (iMax3 <= i56) {
                    List arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList = arrayList4;
                        cb0Var2 = cb0Var;
                        arrayList.add(i01Var2.n(i56, j2));
                        if (i56 == iMax3) {
                            break;
                        }
                        i56--;
                        cb0Var = cb0Var2;
                        arrayList4 = arrayList;
                    }
                } else {
                    cb0Var2 = cb0Var;
                    arrayList = null;
                }
                int size = listN.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i57 = size - 1;
                        int iIntValue = ((Number) listN.get(size)).intValue();
                        if (iIntValue < iMax3) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(i01Var2.n(iIntValue, j2));
                        }
                        if (i57 < 0) {
                            break;
                        }
                        size = i57;
                    }
                }
                if (arrayList == null) {
                    arrayList = cb0Var2;
                }
                int iMax4 = i49;
                int i58 = 0;
                for (int size2 = arrayList.size(); i58 < size2; size2 = size2) {
                    iMax4 = Math.max(iMax4, ((l01) arrayList.get(i58)).o);
                    i58++;
                }
                int iMin = Math.min(((l01) vq.W(leVar)).a, i41 - 1);
                int i59 = ((l01) vq.W(leVar)).a + 1;
                if (i59 <= iMin) {
                    ArrayList arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i8 = iMax4;
                        i9 = i16;
                        arrayList2 = arrayList5;
                        arrayList2.add(i01Var2.n(i59, j2));
                        if (i59 == iMin) {
                            break;
                        }
                        i59++;
                        arrayList5 = arrayList2;
                        iMax4 = i8;
                        i16 = i9;
                    }
                } else {
                    i8 = iMax4;
                    i9 = i16;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((l01) vq.W(arrayList2)).a > iMin) {
                    iMin = ((l01) vq.W(arrayList2)).a;
                }
                int size3 = listN.size();
                List arrayList6 = arrayList2;
                int i60 = 0;
                while (i60 < size3) {
                    int i61 = i60;
                    int iIntValue2 = ((Number) listN.get(i60)).intValue();
                    if (iIntValue2 > iMin) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(i01Var2.n(iIntValue2, j2));
                    }
                    i60 = i61 + 1;
                }
                if (arrayList6 == null) {
                    arrayList6 = cb0Var2;
                }
                int size4 = arrayList6.size();
                int iMax5 = i8;
                for (int i62 = 0; i62 < size4; i62++) {
                    iMax5 = Math.max(iMax5, ((l01) arrayList6.get(i62)).o);
                }
                boolean z6 = ws0.j(l01Var2, leVar.first()) && arrayList.isEmpty() && arrayList6.isEmpty();
                int iG3 = tw.g(z3 ? iMax5 : i2, jI);
                if (z3) {
                    iMax5 = i2;
                }
                int iF = tw.f(iMax5, jI);
                int i63 = z3 ? iF : iG3;
                boolean z7 = i2 < Math.min(i63, iG2);
                if (z7 && i51 != 0) {
                    yp0.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList7 = new ArrayList(arrayList6.size() + arrayList.size() + leVar.a());
                if (z7) {
                    if (!arrayList.isEmpty() || !arrayList6.isEmpty()) {
                        yp0.a("no extra items");
                    }
                    int iA3 = leVar.a();
                    arrayList3 = arrayList7;
                    int[] iArr = new int[iA3];
                    for (int i64 = 0; i64 < iA3; i64++) {
                        iArr[i64] = ((l01) leVar.get(i64)).m;
                    }
                    int[] iArr2 = new int[iA3];
                    if (z3) {
                        if (ieVar == null) {
                            yp0.b("null verticalArrangement when isVertical == true");
                            qj.e();
                            return null;
                        }
                        ieVar.e(mz0Var, i63, iArr, iArr2);
                        i01Var = i01Var2;
                    } else {
                        if (geVar == null) {
                            yp0.b("null horizontalArrangement when isVertical == false");
                            qj.e();
                            return null;
                        }
                        i01Var = i01Var2;
                        geVar.d(mz0Var, i63, iArr, kw0.e, iArr2);
                    }
                    lr0 lr0VarE0 = ve.E0(iArr2);
                    int i65 = lr0VarE0.e;
                    int i66 = lr0VarE0.f;
                    int i67 = lr0VarE0.g;
                    if ((i67 > 0 && i65 <= i66) || (i67 < 0 && i66 <= i65)) {
                        while (true) {
                            int i68 = iArr2[i65];
                            l01 l01Var3 = (l01) leVar.get(i65);
                            l01Var3.k(i68, iG3, iF);
                            arrayList3.add(l01Var3);
                            if (i65 == i66) {
                                break;
                            }
                            i65 += i67;
                        }
                    }
                    iF = iF;
                } else {
                    arrayList3 = arrayList7;
                    i01Var = i01Var2;
                    z6 = z6;
                    int i69 = 0;
                    int i70 = i51;
                    for (int size5 = arrayList.size(); i69 < size5; size5 = size5) {
                        l01 l01Var4 = (l01) arrayList.get(i69);
                        i70 -= l01Var4.n;
                        l01Var4.k(i70, iG3, iF);
                        arrayList3.add(l01Var4);
                        i69++;
                    }
                    int iA4 = leVar.a();
                    int i71 = i51;
                    for (int i72 = 0; i72 < iA4; i72++) {
                        l01 l01Var5 = (l01) leVar.get(i72);
                        l01Var5.k(i71, iG3, iF);
                        arrayList3.add(l01Var5);
                        i71 += l01Var5.n;
                    }
                    int size6 = arrayList6.size();
                    for (int i73 = 0; i73 < size6; i73++) {
                        l01 l01Var6 = (l01) arrayList6.get(i73);
                        l01Var6.k(i71, iG3, iF);
                        arrayList3.add(l01Var6);
                        i71 += l01Var6.n;
                    }
                }
                ArrayList arrayList8 = arrayList3;
                int i74 = i2;
                i01 i01Var3 = i01Var;
                gz0Var.c(iG3, iF, arrayList8, h7Var, i01Var3, zR, 1, z2, i7, i74);
                if (zR) {
                    i10 = 0;
                } else {
                    gz0Var.b();
                    if (zA) {
                        i10 = 0;
                    } else {
                        int i75 = z3 ? iF : iG3;
                        i10 = 0;
                        iG3 = tw.g(Math.max(iG3, 0), jI);
                        iF = tw.f(Math.max(iF, 0), jI);
                        int i76 = z3 ? iF : iG3;
                        if (i76 != i75) {
                            int size7 = arrayList8.size();
                            for (int i77 = 0; i77 < size7; i77++) {
                                ((l01) arrayList8.get(i77)).q = i76;
                            }
                        }
                    }
                }
                int i78 = iF;
                int i79 = iG3;
                l01 l01Var7 = (l01) leVar.e();
                int i80 = l01Var7 != null ? l01Var7.a : i10;
                l01 l01Var8 = (l01) leVar.g();
                int i81 = l01Var8 != null ? l01Var8.a : i10;
                g01Var2.b.getClass();
                List listI = sv.i(this.h, i80, i81, arrayList8, fr0.a, i9, i79, i78, new m(17, i01Var3));
                if (z6) {
                    l01 l01Var9 = (l01) vq.R(arrayList8);
                    if (l01Var9 != null) {
                        numValueOf = Integer.valueOf(l01Var9.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    l01 l01Var10 = (l01) leVar.e();
                    if (l01Var10 != null) {
                        numValueOf = Integer.valueOf(l01Var10.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z6) {
                    l01 l01Var11 = (l01) vq.X(arrayList8);
                    if (l01Var11 != null) {
                        numValueOf2 = Integer.valueOf(l01Var11.a);
                    }
                } else {
                    l01 l01Var12 = (l01) leVar.g();
                    if (l01Var12 != null) {
                        numValueOf2 = Integer.valueOf(l01Var12.a);
                    }
                }
                ba2Var = ba2Var2;
                k01Var = new k01(l01Var2, i7, (i50 < i41 || i74 > iG2) ? 1 : i10, f, ba2Var2.d0(tw.g(i79 + i12, j), tw.f(i78 + iO4, j), db0Var, new fy0(da1Var, arrayList8, listI, zR, 1)), f5, z5, ezVar, mz0Var, i01Var3.d, dv1.R(numValueOf != null ? numValueOf.intValue() : i10, numValueOf2 != null ? numValueOf2.intValue() : i10, arrayList8, listI), i21, i30, i41, z3 ? di1Var2 : di1Var, i15, iO5);
            }
            q01Var.g(k01Var, ba2Var.r(), false);
            return k01Var;
        } catch (Throwable th) {
            c12.s(o62VarJ, o62VarP, ej0VarE);
            throw th;
        }
    }
}

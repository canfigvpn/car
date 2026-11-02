package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends tj0 implements ej0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        Object[] objArr;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        kn knVar;
        StringBuilder sb;
        Object value5;
        kn knVar2;
        Object value6;
        kn knVar3;
        Object value7;
        kn knVar4;
        Object value8;
        kn knVar5;
        Object value9;
        Object value10;
        kn knVar6;
        StringBuilder sb2;
        Object value11;
        kn knVar7;
        StringBuilder sb3;
        Object value12;
        d41 d41Var;
        Object value13;
        Object value14;
        d41 d41Var2;
        StringBuilder sb4;
        Object value15;
        d41 d41Var3;
        StringBuilder sb5;
        Object value16;
        d41 d41Var4;
        StringBuilder sb6;
        es esVar;
        qv0 qv0VarM;
        Integer numValueOf;
        int i = this.l;
        char c = 7;
        sx sxVar = null;
        boolean z = true;
        int i2 = 0;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                jq jqVar = (jq) obj2;
                h91 h91Var = jqVar.G;
                if (zBooleanValue) {
                    jqVar.N0();
                } else {
                    if (jqVar.u != null) {
                        Object[] objArr2 = h91Var.c;
                        long[] jArr = h91Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8;
                                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((j & 255) < 128) {
                                            nj2.y(jqVar.t0(), null, new k(jqVar, (rp1) objArr2[(i3 << 3) + i6], sxVar, i2), 3);
                                        }
                                        j >>= i4;
                                        i6++;
                                        i4 = i4;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i5 == i4) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i3 != length) {
                                    i3++;
                                    objArr2 = objArr;
                                    c = 7;
                                }
                            }
                        }
                        rp1 rp1Var = jqVar.I;
                        if (rp1Var != null) {
                            nj2.y(jqVar.t0(), null, new k(jqVar, rp1Var, sxVar, 1), 3);
                        }
                    }
                    h91Var.a();
                    jqVar.I = null;
                }
                return ll2Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                mn mnVar = (mn) obj2;
                mnVar.getClass();
                s82 s82Var = mnVar.e;
                do {
                    value = s82Var.getValue();
                } while (!s82Var.h(value, kn.a((kn) value, str, null, null, null, null, null, null, null, false, 1533)));
                return ll2Var;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                mn mnVar2 = (mn) obj2;
                mnVar2.getClass();
                s82 s82Var2 = mnVar2.e;
                do {
                    value2 = s82Var2.getValue();
                } while (!s82Var2.h(value2, kn.a((kn) value2, null, str2, null, null, null, null, null, null, false, 2043)));
                return ll2Var;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                mn mnVar3 = (mn) obj2;
                mnVar3.getClass();
                s82 s82Var3 = mnVar3.e;
                do {
                    value3 = s82Var3.getValue();
                } while (!s82Var3.h(value3, kn.a((kn) value3, null, null, str3, null, null, null, null, null, false, 2039)));
                return ll2Var;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                mn mnVar4 = (mn) obj2;
                mnVar4.getClass();
                s82 s82Var4 = mnVar4.e;
                do {
                    value4 = s82Var4.getValue();
                    knVar = (kn) value4;
                    sb = new StringBuilder();
                    int length2 = str4.length();
                    for (int i7 = 0; i7 < length2; i7++) {
                        char cCharAt = str4.charAt(i7);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                } while (!s82Var4.h(value4, kn.a(knVar, null, null, null, h92.P(sb.toString(), 4), null, null, null, null, false, 2031)));
                return ll2Var;
            case 5:
                String str5 = (String) obj;
                str5.getClass();
                mn mnVar5 = (mn) obj2;
                mnVar5.getClass();
                s82 s82Var5 = mnVar5.e;
                do {
                    value5 = s82Var5.getValue();
                    knVar2 = (kn) value5;
                } while (!s82Var5.h(value5, kn.a(knVar2, null, null, null, null, j11.a(knVar2.f, mn.e(str5, 2), null, null, null, 14), null, null, null, false, 2015)));
                return ll2Var;
            case 6:
                String str6 = (String) obj;
                str6.getClass();
                mn mnVar6 = (mn) obj2;
                mnVar6.getClass();
                s82 s82Var6 = mnVar6.e;
                do {
                    value6 = s82Var6.getValue();
                    knVar3 = (kn) value6;
                } while (!s82Var6.h(value6, kn.a(knVar3, null, null, null, null, j11.a(knVar3.f, null, str6, null, null, 13), null, null, null, false, 2015)));
                return ll2Var;
            case 7:
                String str7 = (String) obj;
                str7.getClass();
                mn mnVar7 = (mn) obj2;
                mnVar7.getClass();
                s82 s82Var7 = mnVar7.e;
                do {
                    value7 = s82Var7.getValue();
                    knVar4 = (kn) value7;
                } while (!s82Var7.h(value7, kn.a(knVar4, null, null, null, null, j11.a(knVar4.f, null, null, mn.e(str7, 3), null, 11), null, null, null, false, 2015)));
                return ll2Var;
            case 8:
                String str8 = (String) obj;
                str8.getClass();
                mn mnVar8 = (mn) obj2;
                mnVar8.getClass();
                s82 s82Var8 = mnVar8.e;
                do {
                    value8 = s82Var8.getValue();
                    knVar5 = (kn) value8;
                } while (!s82Var8.h(value8, kn.a(knVar5, null, null, null, null, j11.a(knVar5.f, null, null, null, mn.e(str8, 2), 7), null, null, null, false, 2015)));
                return ll2Var;
            case 9:
                ni0 ni0Var = (ni0) obj;
                ni0Var.getClass();
                mn mnVar9 = (mn) obj2;
                mnVar9.getClass();
                s82 s82Var9 = mnVar9.e;
                do {
                    value9 = s82Var9.getValue();
                } while (!s82Var9.h(value9, kn.a((kn) value9, null, null, null, null, null, ni0Var, null, null, false, 1983)));
                return ll2Var;
            case 10:
                String str9 = (String) obj;
                str9.getClass();
                mn mnVar10 = (mn) obj2;
                mnVar10.getClass();
                s82 s82Var10 = mnVar10.e;
                do {
                    value10 = s82Var10.getValue();
                    knVar6 = (kn) value10;
                    sb2 = new StringBuilder();
                    int length3 = str9.length();
                    for (int i8 = 0; i8 < length3; i8++) {
                        char cCharAt2 = str9.charAt(i8);
                        if (Character.isDigit(cCharAt2)) {
                            sb2.append(cCharAt2);
                        }
                    }
                } while (!s82Var10.h(value10, kn.a(knVar6, null, null, null, null, null, null, h92.P(sb2.toString(), 7), null, false, 1919)));
                return ll2Var;
            case 11:
                String str10 = (String) obj;
                str10.getClass();
                mn mnVar11 = (mn) obj2;
                mnVar11.getClass();
                s82 s82Var11 = mnVar11.e;
                do {
                    value11 = s82Var11.getValue();
                    knVar7 = (kn) value11;
                    sb3 = new StringBuilder();
                    int length4 = str10.length();
                    for (int i9 = 0; i9 < length4; i9++) {
                        char cCharAt3 = str10.charAt(i9);
                        if (Character.isDigit(cCharAt3)) {
                            sb3.append(cCharAt3);
                        }
                    }
                } while (!s82Var11.h(value11, kn.a(knVar7, null, null, null, null, null, null, null, h92.P(sb3.toString(), 4), false, 1791)));
                return ll2Var;
            case 12:
                r22 r22Var = (r22) obj;
                r22Var.getClass();
                ls0 ls0Var = (ls0) obj2;
                ls0Var.getClass();
                nj2.y(s5.H(ls0Var), null, new e(18, sxVar, ls0Var, r22Var), 3);
                return ll2Var;
            case 13:
                ((Set) obj).getClass();
                gt0 gt0Var = (gt0) obj2;
                ReentrantLock reentrantLock = gt0Var.d;
                reentrantLock.lock();
                try {
                    List listH0 = vq.h0(gt0Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = listH0.iterator();
                    if (!it.hasNext()) {
                        return ll2Var;
                    }
                    ((nf1) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 14:
                ((rt0) obj2).n((Throwable) obj);
                return ll2Var;
            case 15:
                long jLongValue = ((Number) obj).longValue();
                f41 f41Var = (f41) obj2;
                s82 s82Var12 = f41Var.g;
                do {
                    value12 = s82Var12.getValue();
                    d41Var = (d41) value12;
                } while (!s82Var12.h(value12, d41.a(d41Var, null, jLongValue, 0, null, null, null, null, null, null, d41Var.a != 0 ? cb0.e : f41Var.e(jLongValue), false, 5115)));
                return ll2Var;
            case 16:
                String str11 = (String) obj;
                str11.getClass();
                f41 f41Var2 = (f41) obj2;
                f41Var2.getClass();
                s82 s82Var13 = f41Var2.g;
                do {
                    value13 = s82Var13.getValue();
                } while (!s82Var13.h(value13, d41.a((d41) value13, null, 0L, 0, null, null, null, null, str11, null, null, false, 7935)));
                return ll2Var;
            case 17:
                String str12 = (String) obj;
                str12.getClass();
                f41 f41Var3 = (f41) obj2;
                f41Var3.getClass();
                s82 s82Var14 = f41Var3.g;
                do {
                    value14 = s82Var14.getValue();
                    d41Var2 = (d41) value14;
                    sb4 = new StringBuilder();
                    int length5 = str12.length();
                    for (int i10 = 0; i10 < length5; i10++) {
                        char cCharAt4 = str12.charAt(i10);
                        if (Character.isDigit(cCharAt4)) {
                            sb4.append(cCharAt4);
                        }
                    }
                } while (!s82Var14.h(value14, d41.a(d41Var2, null, 0L, 0, h92.P(sb4.toString(), 7), null, null, null, null, null, null, false, 8175)));
                return ll2Var;
            case 18:
                String str13 = (String) obj;
                str13.getClass();
                f41 f41Var4 = (f41) obj2;
                f41Var4.getClass();
                s82 s82Var15 = f41Var4.g;
                do {
                    value15 = s82Var15.getValue();
                    d41Var3 = (d41) value15;
                    sb5 = new StringBuilder();
                    int length6 = str13.length();
                    for (int i11 = 0; i11 < length6; i11++) {
                        char cCharAt5 = str13.charAt(i11);
                        if (Character.isDigit(cCharAt5)) {
                            sb5.append(cCharAt5);
                        }
                    }
                } while (!s82Var15.h(value15, d41.a(d41Var3, null, 0L, 0, null, null, h92.P(sb5.toString(), 12), null, null, null, null, false, 8127)));
                return ll2Var;
            case 19:
                String str14 = (String) obj;
                str14.getClass();
                f41 f41Var5 = (f41) obj2;
                f41Var5.getClass();
                s82 s82Var16 = f41Var5.g;
                do {
                    value16 = s82Var16.getValue();
                    d41Var4 = (d41) value16;
                    sb6 = new StringBuilder();
                    int length7 = str14.length();
                    for (int i12 = 0; i12 < length7; i12++) {
                        char cCharAt6 = str14.charAt(i12);
                        if (Character.isDigit(cCharAt6) || cCharAt6 == '.') {
                            sb6.append(cCharAt6);
                        }
                    }
                } while (!s82Var16.h(value16, d41.a(d41Var4, null, 0L, 0, null, null, null, h92.P(sb6.toString(), 6), null, null, null, false, 8063)));
                return ll2Var;
            case 20:
                ((o32) obj2).b.a(((Boolean) obj).booleanValue());
                return ll2Var;
            case 21:
                ((o32) obj2).b.c(((Boolean) obj).booleanValue());
                return ll2Var;
            case 22:
                long j2 = ((uf1) obj).a;
                rc2 rc2Var = (rc2) obj2;
                rc2Var.getClass();
                wc2 wc2Var = (wc2) ir2.j(rc2Var, yc2.a);
                if (wc2Var != null) {
                    nj2.y(rc2Var.t0(), null, new h(rc2Var, j2, wc2Var, new qc2(rc2Var, j2), (sx) null), 3);
                }
                return ll2Var;
            case 23:
                ((kc2) obj2).b.a((ej0) obj);
                return ll2Var;
            default:
                KeyEvent keyEvent = ((rv0) obj).a;
                vd2 vd2Var = (vd2) obj2;
                nf2 nf2Var = vd2Var.f;
                boolean z2 = vd2Var.d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    esVar = null;
                } else {
                    h20 h20Var = vd2Var.i;
                    h20Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        h20Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = h20Var.a;
                        if (num != null) {
                            h20Var.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        esVar = new es(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        esVar = null;
                    }
                }
                if (esVar != null) {
                    if (z2) {
                        vd2Var.a(vs0.u(esVar));
                        nf2Var.a = null;
                    } else {
                        z = false;
                    }
                } else if (sv0.g0(keyEvent) != 2 || (qv0VarM = j20.y.m(keyEvent)) == null || (qv0VarM.e && !z2)) {
                    z = false;
                } else {
                    cs1 cs1Var = new cs1();
                    cs1Var.e = true;
                    o1 o1Var = new o1(qv0VarM, vd2Var, cs1Var, 14);
                    te2 te2Var = vd2Var.c;
                    yd2 yd2Var = new yd2(te2Var, vd2Var.g, vd2Var.a.d(), nf2Var);
                    o1Var.h(yd2Var);
                    boolean zB = of2.b(yd2Var.f, te2Var.b);
                    yb ybVar = yd2Var.g;
                    if (!zB || !ws0.j(ybVar, te2Var.a)) {
                        vd2Var.j.h(te2.a(te2Var, ybVar, yd2Var.f, 4));
                    }
                    vd2Var.h.e = true;
                    z = cs1Var.e;
                }
                return Boolean.valueOf(z);
        }
    }
}

package defpackage;

import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final MyGarageDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final f e;
    public final String[] g;
    public final jf1 h;
    public final ao2 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public ti0 k = new m2(19);
    public final LinkedHashMap f = new LinkedHashMap();

    public ij2(MyGarageDatabase_Impl myGarageDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, f fVar) {
        String lowerCase;
        this.a = myGarageDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = fVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, h61.d0(lowerCase3, linkedHashMap3));
            }
        }
        this.h = new jf1(this.g.length);
        this.i = new ao2(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(jo1 jo1Var, tx txVar) {
        aj2 aj2Var;
        if (txVar instanceof aj2) {
            aj2Var = (aj2) txVar;
            int i = aj2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                aj2Var.k = i - Integer.MIN_VALUE;
            } else {
                aj2Var = new aj2(this, txVar);
            }
        } else {
            aj2Var = new aj2(this, txVar);
        }
        Object objD = aj2Var.i;
        int i2 = aj2Var.k;
        fz fzVar = fz.e;
        if (i2 == 0) {
            ix.Q(objD);
            v22 v22Var = new v22(19);
            aj2Var.h = jo1Var;
            aj2Var.k = 1;
            objD = jo1Var.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", v22Var, aj2Var);
            if (objD != fzVar) {
            }
            return fzVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) aj2Var.h;
            ix.Q(objD);
            return set;
        }
        jo1Var = (jo1) aj2Var.h;
        ix.Q(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            aj2Var.h = set2;
            aj2Var.k = 2;
            if (c12.h(jo1Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", aj2Var) == fzVar) {
                return fzVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tx txVar) throws Throwable {
        cj2 cj2Var;
        dq0 dq0Var;
        Object value;
        int[] iArr;
        if (txVar instanceof cj2) {
            cj2Var = (cj2) txVar;
            int i = cj2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj2Var.k = i - Integer.MIN_VALUE;
            } else {
                cj2Var = new cj2(this, txVar);
            }
        } else {
            cj2Var = new cj2(this, txVar);
        }
        Object objL = cj2Var.i;
        int i2 = cj2Var.k;
        sx sxVar = null;
        int i3 = 1;
        if (i2 == 0) {
            ix.Q(objL);
            MyGarageDatabase_Impl myGarageDatabase_Impl = this.a;
            dq0 dq0Var2 = myGarageDatabase_Impl.g;
            boolean zK = dq0Var2.k();
            gb0 gb0Var = gb0.e;
            if (!zK) {
                return gb0Var;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    dq0Var2.w();
                    return gb0Var;
                }
                if (!((Boolean) this.k.a()).booleanValue()) {
                    dq0Var2.w();
                    return gb0Var;
                }
                dj2 dj2Var = new dj2(this, sxVar, i3);
                cj2Var.h = dq0Var2;
                cj2Var.k = 1;
                objL = myGarageDatabase_Impl.l(false, dj2Var, cj2Var);
                fz fzVar = fz.e;
                if (objL == fzVar) {
                    return fzVar;
                }
                dq0Var = dq0Var2;
            } catch (Throwable th) {
                th = th;
                dq0Var = dq0Var2;
                dq0Var.w();
                throw th;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq0Var = cj2Var.h;
            try {
                ix.Q(objL);
            } catch (Throwable th2) {
                th = th2;
                dq0Var.w();
                throw th;
            }
        }
        Set set = (Set) objL;
        if (!set.isEmpty()) {
            ao2 ao2Var = this.i;
            set.getClass();
            if (!set.isEmpty()) {
                s82 s82Var = (s82) ao2Var.f;
                do {
                    value = s82Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                    }
                } while (!s82Var.h(value, iArr));
            }
            this.e.h(set);
        }
        dq0Var.w();
        return set;
    }

    public final void c(ti0 ti0Var, ti0 ti0Var2) {
        ti0Var.getClass();
        ti0Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            ti0Var.a();
            rx rxVar = this.a.a;
            sx sxVar = null;
            if (rxVar != null) {
                nj2.y(rxVar, new az(az.f), new cv1(7, sxVar, this, ti0Var2), 2);
            } else {
                ws0.U("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (defpackage.c12.h(r13, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        r13 = r13;
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e1 -> B:28:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.yh2 r13, int r14, defpackage.tx r15) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij2.d(yh2, int, tx):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0089 -> B:19:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.yh2 r8, int r9, defpackage.tx r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.fj2
            if (r0 == 0) goto L13
            r0 = r10
            fj2 r0 = (defpackage.fj2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            fj2 r0 = new fj2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.m
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.l
            int r8 = r0.k
            java.lang.String[] r9 = r0.j
            java.lang.String r1 = r0.i
            jo1 r3 = r0.h
            defpackage.ix.Q(r10)
            r10 = r9
            r9 = r3
            goto L8c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r7)
            r7 = 0
            return r7
        L38:
            defpackage.ix.Q(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.ij2.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L8e
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.h = r9
            r0.i = r1
            r0.j = r10
            r0.k = r8
            r0.l = r7
            r0.o = r2
            java.lang.Object r3 = defpackage.c12.h(r9, r3, r0)
            fz r4 = defpackage.fz.e
            if (r3 != r4) goto L8c
            return r4
        L8c:
            int r8 = r8 + r2
            goto L4a
        L8e:
            ll2 r7 = defpackage.ll2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij2.e(yh2, int, tx):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tx txVar) {
        gj2 gj2Var;
        dq0 dq0Var;
        if (txVar instanceof gj2) {
            gj2Var = (gj2) txVar;
            int i = gj2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gj2Var.k = i - Integer.MIN_VALUE;
            } else {
                gj2Var = new gj2(this, txVar);
            }
        } else {
            gj2Var = new gj2(this, txVar);
        }
        Object obj = gj2Var.i;
        int i2 = gj2Var.k;
        sx sxVar = null;
        if (i2 == 0) {
            ix.Q(obj);
            MyGarageDatabase_Impl myGarageDatabase_Impl = this.a;
            dq0 dq0Var2 = myGarageDatabase_Impl.g;
            if (dq0Var2.k()) {
                try {
                    g gVar = new g(27, sxVar, this);
                    gj2Var.h = dq0Var2;
                    gj2Var.k = 1;
                    Object objL = myGarageDatabase_Impl.l(false, gVar, gj2Var);
                    fz fzVar = fz.e;
                    if (objL == fzVar) {
                        return fzVar;
                    }
                    dq0Var = dq0Var2;
                    dq0Var.w();
                } catch (Throwable th) {
                    th = th;
                    dq0Var = dq0Var2;
                    dq0Var.w();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq0Var = gj2Var.h;
            try {
                ix.Q(obj);
                dq0Var.w();
            } catch (Throwable th2) {
                th = th2;
                dq0Var.w();
                throw th;
            }
        }
        return ll2.a;
    }
}

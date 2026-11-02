package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u70 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.bb2 r12, long r13, defpackage.tx r15) {
        /*
            boolean r0 = r15 instanceof defpackage.o70
            if (r0 == 0) goto L13
            r0 = r15
            o70 r0 = (defpackage.o70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            o70 r0 = new o70
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.j
            int r1 = r0.k
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            fs1 r12 = r0.i
            bb2 r13 = r0.h
            defpackage.ix.Q(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r12)
            return r3
        L33:
            defpackage.ix.Q(r15)
            cb2 r15 = r12.i
            pn1 r15 = r15.w
            boolean r15 = e(r15, r13)
            if (r15 == 0) goto L42
            goto Lc2
        L42:
            fs1 r15 = new fs1
            r15.<init>()
            r15.e = r13
        L49:
            r0.h = r12
            r0.i = r15
            r0.k = r2
            qn1 r13 = defpackage.qn1.f
            java.lang.Object r13 = r12.a(r13, r0)
            fz r14 = defpackage.fz.e
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            pn1 r15 = (defpackage.pn1) r15
            java.util.List r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            wn1 r7 = (defpackage.wn1) r7
            long r7 = r7.a
            long r9 = r13.e
            boolean r7 = defpackage.vv.j(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            wn1 r6 = (defpackage.wn1) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = defpackage.sv.q(r6)
            if (r14 == 0) goto Lad
            java.util.List r14 = r15.a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            wn1 r5 = (defpackage.wn1) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            wn1 r1 = (defpackage.wn1) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.a
            r13.e = r14
            goto Lc3
        Lad:
            long r14 = defpackage.sv.S(r6, r2)
            r4 = 0
            boolean r14 = defpackage.uf1.b(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u70.a(bb2, long, tx):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [gs1] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object b(bb2 bb2Var, long j, tx txVar) {
        p70 p70Var;
        Object obj;
        wn1 wn1Var;
        cs1 cs1Var;
        if (txVar instanceof p70) {
            p70Var = (p70) txVar;
            int i = p70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                p70Var.l = i - Integer.MIN_VALUE;
            } else {
                p70Var = new p70(txVar);
            }
        } else {
            p70Var = new p70(txVar);
        }
        Object obj2 = p70Var.k;
        int i2 = p70Var.l;
        try {
            if (i2 == 0) {
                ix.Q(obj2);
                if (!e(bb2Var.i.w, j)) {
                    List list = bb2Var.i.w.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (vv.j(((wn1) obj).a, j)) {
                            break;
                        }
                        i3++;
                    }
                    wn1Var = (wn1) obj;
                    if (wn1Var != null) {
                        gs1 gs1Var = new gs1();
                        gs1 gs1Var2 = new gs1();
                        gs1Var2.e = wn1Var;
                        long jC = bb2Var.e().c();
                        cs1 cs1Var2 = new cs1();
                        ij0 q70Var = new q70(cs1Var2, gs1Var2, gs1Var, null);
                        p70Var.h = wn1Var;
                        p70Var.i = gs1Var;
                        p70Var.j = cs1Var2;
                        p70Var.l = 1;
                        Object objH = bb2Var.h(jC, q70Var, p70Var);
                        Object obj3 = fz.e;
                        if (objH == obj3) {
                            return obj3;
                        }
                        cs1Var = cs1Var2;
                        j = gs1Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cs1Var = p70Var.j;
            gs1 gs1Var3 = p70Var.i;
            wn1Var = p70Var.h;
            ix.Q(obj2);
            j = gs1Var3;
            if (cs1Var.e) {
                wn1 wn1Var2 = (wn1) j.e;
                return wn1Var2 == null ? wn1Var : wn1Var2;
            }
            return null;
        } catch (rn1 unused) {
            wn1 wn1Var3 = (wn1) j.e;
            return wn1Var3 == null ? wn1Var : wn1Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6 A[LOOP:0: B:26:0x00ac->B:30:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2 A[EDGE_INSN: B:69:0x00d2->B:32:0x00d2 BREAK  A[LOOP:0: B:26:0x00ac->B:30:0x00c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x015e -> B:63:0x0164). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.bb2 r21, long r22, defpackage.x7 r24, defpackage.sh r25) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u70.c(bb2, long, x7, sh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.bb2 r4, long r5, defpackage.ej0 r7, defpackage.tx r8) {
        /*
            boolean r0 = r8 instanceof defpackage.t70
            if (r0 == 0) goto L13
            r0 = r8
            t70 r0 = (defpackage.t70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            t70 r0 = new t70
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            ej0 r4 = r0.i
            bb2 r5 = r0.h
            defpackage.ix.Q(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r4)
            r4 = 0
            return r4
        L32:
            defpackage.ix.Q(r8)
        L35:
            r0.h = r4
            r0.i = r7
            r0.k = r2
            java.lang.Object r8 = a(r4, r5, r0)
            fz r5 = defpackage.fz.e
            if (r8 != r5) goto L44
            return r5
        L44:
            wn1 r8 = (defpackage.wn1) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.sv.q(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.h(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u70.d(bb2, long, ej0, tx):java.lang.Object");
    }

    public static final boolean e(pn1 pn1Var, long j) {
        Object obj;
        List list = pn1Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (vv.j(((wn1) obj).a, j)) {
                break;
            }
            i++;
        }
        wn1 wn1Var = (wn1) obj;
        if (wn1Var != null && wn1Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float f(on2 on2Var, int i) {
        return i == 2 ? on2Var.d() * a : on2Var.d();
    }
}

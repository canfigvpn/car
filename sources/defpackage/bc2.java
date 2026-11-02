package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bc2 {
    public static final d80 a = new d80(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.bb2 r5, boolean r6, defpackage.qn1 r7, defpackage.sh r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ub2
            if (r0 == 0) goto L13
            r0 = r8
            ub2 r0 = (defpackage.ub2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ub2 r0 = new ub2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.j
            qn1 r6 = r0.i
            bb2 r7 = r0.h
            defpackage.ix.Q(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r5)
            r5 = 0
            return r5
        L36:
            defpackage.ix.Q(r8)
        L39:
            r0.h = r5
            r0.i = r7
            r0.j = r6
            r0.l = r2
            java.lang.Object r8 = r5.a(r7, r0)
            fz r1 = defpackage.fz.e
            if (r8 != r1) goto L4a
            return r1
        L4a:
            pn1 r8 = (defpackage.pn1) r8
            boolean r1 = c(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc2.a(bb2, boolean, qn1, sh):java.lang.Object");
    }

    public static boolean c(pn1 pn1Var, boolean z) {
        List list = pn1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wn1 wn1Var = (wn1) list.get(i);
            if (!(z ? sv.n(wn1Var) : sv.o(wn1Var))) {
                return false;
            }
        }
        return true;
    }

    public static j82 d(ez ezVar, ot0 ot0Var, ij0 ij0Var) {
        return nj2.y(ezVar, null, new g(24, null, ot0Var, ij0Var), 1);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[LOOP:1: B:23:0x006e->B:44:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.bb2 r17, defpackage.qn1 r18, defpackage.sh r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc2.e(bb2, qn1, sh):java.lang.Object");
    }
}

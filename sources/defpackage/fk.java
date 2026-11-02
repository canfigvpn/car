package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fk {
    public final fa1 a = new fa1(new gk[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.yr1 r8, defpackage.tx r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ek
            if (r0 == 0) goto L13
            r0 = r9
            ek r0 = (defpackage.ek) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            ek r0 = new ek
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.l
            int r1 = r0.n
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.k
            int r8 = r0.j
            java.lang.Object[] r1 = r0.i
            yr1 r3 = r0.h
            defpackage.ix.Q(r9)
            r9 = r3
            goto L62
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r7)
            r7 = 0
            return r7
        L35:
            defpackage.ix.Q(r9)
            fa1 r7 = r7.a
            java.lang.Object[] r9 = r7.e
            int r7 = r7.g
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L43:
            if (r8 >= r7) goto L64
            r3 = r1[r8]
            gk r3 = (defpackage.gk) r3
            w8 r4 = new w8
            r5 = 4
            r4.<init>(r5, r9)
            r0.h = r9
            r0.i = r1
            r0.j = r8
            r0.k = r7
            r0.n = r2
            java.lang.Object r3 = defpackage.p61.v(r3, r4, r0)
            fz r4 = defpackage.fz.e
            if (r3 != r4) goto L62
            return r4
        L62:
            int r8 = r8 + r2
            goto L43
        L64:
            ll2 r7 = defpackage.ll2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk.a(yr1, tx):java.lang.Object");
    }
}

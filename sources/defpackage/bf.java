package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bf implements p82 {
    public final List e;
    public final bk2 f;
    public final ej0 g;
    public final dk1 h;
    public boolean i = true;

    public bf(List list, Object obj, bk2 bk2Var, ud udVar, ej0 ej0Var, b7 b7Var) {
        this.e = list;
        this.f = bk2Var;
        this.g = ej0Var;
        this.h = y12.s(obj);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:35:0x0096, B:21:0x0047, B:23:0x004c, B:27:0x0073, B:33:0x008c), top: B:40:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0096 -> B:36:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.tx r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf.a(tx):java.lang.Object");
    }

    @Override // defpackage.p82
    public final Object getValue() {
        return this.h.getValue();
    }
}

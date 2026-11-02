package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class na1 extends wa2 implements ij0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na1(ContentResolver contentResolver, Uri uri, uq2 uq2Var, zk zkVar, Context context, sx sxVar) {
        super(2, sxVar);
        this.m = contentResolver;
        this.n = uri;
        this.o = uq2Var;
        this.p = zkVar;
        this.q = context;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((na1) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                return ((na1) p((sx) obj2, (qe0) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                na1 na1Var = new na1((ia1) obj3, (pa1) obj4, (ej0) obj2, sxVar);
                na1Var.m = obj;
                return na1Var;
            default:
                na1 na1Var2 = new na1((ContentResolver) this.m, (Uri) this.n, (uq2) obj4, (zk) obj3, (Context) obj2, sxVar);
                na1Var2.k = obj;
                return na1Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:9:0x0028, B:19:0x0058, B:23:0x0069, B:25:0x0071, B:15:0x003e, B:18:0x0051), top: B:76:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ra1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:10:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na1.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na1(ia1 ia1Var, pa1 pa1Var, ej0 ej0Var, sx sxVar) {
        super(2, sxVar);
        this.p = ia1Var;
        this.o = pa1Var;
        this.q = ej0Var;
    }
}

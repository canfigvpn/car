package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yk extends tx {
    public /* synthetic */ Object h;
    public final /* synthetic */ zk i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(zk zkVar, tx txVar) {
        super(txVar);
        this.i = zkVar;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objE = this.i.E(null, 0, 0L, this);
        return objE == fz.e ? objE : new wo(objE);
    }
}

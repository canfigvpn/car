package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p01 extends tx {
    public ia1 h;
    public wa2 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ q01 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(q01 q01Var, tx txVar) {
        super(txVar);
        this.k = q01Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, null, this);
    }
}

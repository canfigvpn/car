package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mo1 extends tx {
    public xh2 h;
    public lw i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qo1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo1(qo1 qo1Var, tx txVar) {
        super(txVar);
        this.k = qo1Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}

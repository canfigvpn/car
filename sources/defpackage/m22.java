package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m22 extends tx {
    public /* synthetic */ Object h;
    public int i;
    public final /* synthetic */ qn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m22(qn qnVar, sx sxVar) {
        super(sxVar);
        this.j = qnVar;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.j.k(null, this);
    }
}

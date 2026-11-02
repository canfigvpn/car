package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft extends a3 implements ij0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                gt gtVar = (gt) obj3;
                gtVar.e(((Number) obj2).intValue(), (ak0) obj);
                return ll2Var;
            default:
                long j = ((sm2) obj).a;
                ny1 ny1Var = (ny1) obj3;
                ez ezVar = (ez) ((ti0) ny1Var.O.g).a();
                if (ezVar == null) {
                    fu1.h("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                    return null;
                }
                nj2.y(ezVar, null, new ly1(ny1Var, j, null, 1), 3);
                return ll2Var;
        }
    }
}

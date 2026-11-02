package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class my1 extends wa2 implements ij0 {
    public int i;
    public final /* synthetic */ ny1 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my1(ny1 ny1Var, float f, float f2, sx sxVar) {
        super(2, sxVar);
        this.j = ny1Var;
        this.k = f;
        this.l = f2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((my1) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new my1(this.j, this.k, this.l, sxVar);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        if (i == 0) {
            ix.Q(obj);
            uy1 uy1Var = this.j.R;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.k)) << 32) | (((long) Float.floatToRawIntBits(this.l)) & 4294967295L);
            this.i = 1;
            Object objB = hy1.b(uy1Var, jFloatToRawIntBits, this);
            fz fzVar = fz.e;
            if (objB == fzVar) {
                return fzVar;
            }
        } else {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
        }
        return ll2.a;
    }
}

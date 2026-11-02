package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ny1 k;
    public /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly1(ny1 ny1Var, long j, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = ny1Var;
        this.l = j;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((ly1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 1:
                return ((ly1) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                long j = ((uf1) obj).a;
                ly1 ly1Var = new ly1(this.k, (sx) obj2);
                ly1Var.l = j;
                return ly1Var.r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                return new ly1(this.k, this.l, sxVar, 0);
            case 1:
                return new ly1(this.k, this.l, sxVar, 1);
            default:
                ly1 ly1Var = new ly1(this.k, sxVar);
                ly1Var.l = ((uf1) obj).a;
                return ly1Var;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ny1 ny1Var = this.k;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                uy1 uy1Var = ny1Var.R;
                ky1 ky1Var = new ky1(this.l, null);
                this.j = 1;
                return uy1Var.f(ia1.f, ky1Var, this) == fzVar ? fzVar : ll2Var;
            case 1:
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                uy1 uy1Var2 = ny1Var.R;
                long j = this.l;
                this.j = 1;
                return uy1Var2.b(j, true, this) == fzVar ? fzVar : ll2Var;
            default:
                int i4 = this.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ix.Q(obj);
                        return obj;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                long j2 = this.l;
                uy1 uy1Var3 = ny1Var.R;
                this.j = 1;
                Object objB = hy1.b(uy1Var3, j2, this);
                return objB == fzVar ? fzVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(ny1 ny1Var, sx sxVar) {
        super(2, sxVar);
        this.i = 2;
        this.k = ny1Var;
    }
}

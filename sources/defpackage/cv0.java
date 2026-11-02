package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cv0 extends tt1 implements jj0 {
    public int g;
    public /* synthetic */ o20 h;
    public final /* synthetic */ qs i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(qs qsVar, sx sxVar) {
        super(3, sxVar);
        this.i = qsVar;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        cv0 cv0Var = new cv0(this.i, (sx) obj3);
        cv0Var.h = (o20) obj;
        return cv0Var.r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        qs qsVar = this.i;
        fc1 fc1Var = (fc1) qsVar.c;
        o20 o20Var = this.h;
        int i = this.g;
        if (i == 0) {
            ix.Q(obj);
            byte bS = fc1Var.s();
            if (bS == 1) {
                return qsVar.j(true);
            }
            if (bS == 0) {
                return qsVar.j(false);
            }
            if (bS != 6) {
                if (bS == 8) {
                    return qsVar.h();
                }
                fc1.l(fc1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.h = null;
            this.g = 1;
            obj = qsVar.i(o20Var, this);
            fz fzVar = fz.e;
            if (obj == fzVar) {
                return fzVar;
            }
        } else {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
        }
        return (iu0) obj;
    }
}

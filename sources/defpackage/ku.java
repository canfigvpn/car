package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ku extends tt1 implements ij0 {
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(lu luVar, sx sxVar) {
        super(2, sxVar);
        this.l = luVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((ku) p((sx) obj2, (n12) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        ku kuVar = new ku(this.l, sxVar);
        kuVar.k = obj;
        return kuVar;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        n12 n12Var;
        int i;
        int i2;
        int i3;
        String strI;
        int i4;
        int i5;
        String str;
        lu luVar = this.l;
        p91 p91Var = luVar.e;
        c91 c91Var = luVar.g;
        int i6 = this.j;
        if (i6 == 0) {
            ix.Q(obj);
            n12Var = (n12) this.k;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.i;
            i2 = this.h;
            i3 = this.g;
            n12Var = (n12) this.k;
            ix.Q(obj);
        }
        if (i3 >= Math.min(luVar.h + 10, c91Var.b)) {
            return ll2.a;
        }
        int i7 = i3 + 1;
        int iB = c91Var.b(i3);
        switch (iB) {
            case 0:
                strI = "up";
                break;
            case 1:
                Object objF = p91Var.f(i2);
                i2++;
                strI = "down " + objF;
                break;
            case 2:
                strI = "remove " + c91Var.b(i7) + ' ' + c91Var.b(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strI = "move " + c91Var.b(i7) + ' ' + c91Var.b(i3 + 2) + ' ' + c91Var.b(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strI = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iB2 = c91Var.b(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iB2 + ' ' + p91Var.f(i2);
                int i8 = i4;
                strI = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iB3 = c91Var.b(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iB3 + ' ' + p91Var.f(i2);
                int i9 = i4;
                strI = str;
                i7 = i9;
                i2 = i5;
                break;
            case 7:
                Object objF2 = p91Var.f(i2);
                objF2.getClass();
                nj2.i(2, objF2);
                i2 += 2;
                strI = "apply " + ((ij0) objF2);
                break;
            case 8:
                strI = "reuse " + luVar.f.f(i);
                i++;
                break;
            case 9:
                strI = "recompose pending";
                break;
            default:
                strI = k3.i("unknown op: ", iB);
                break;
        }
        this.k = n12Var;
        this.g = i7;
        this.h = i2;
        this.i = i;
        this.j = 1;
        n12Var.b(this, i3 + ": " + strI);
        return fz.e;
    }
}

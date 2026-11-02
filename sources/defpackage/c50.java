package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c50 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c50(boolean z, String str, u52 u52Var) {
        this.e = 2;
        this.f = z;
        this.g = str;
        this.h = u52Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        final boolean z = this.f;
        switch (i) {
            case 0:
                final kb1 kb1Var = (kb1) obj3;
                final List list = (List) obj2;
                w11 w11Var = new w11() { // from class: b50
                    @Override // defpackage.w11
                    public final void j(y11 y11Var, q11 q11Var) {
                        boolean z2 = z;
                        List list2 = list;
                        kb1 kb1Var2 = kb1Var;
                        if (z2 && !list2.contains(kb1Var2)) {
                            list2.add(kb1Var2);
                        }
                        if (q11Var == q11.ON_START && !list2.contains(kb1Var2)) {
                            list2.add(kb1Var2);
                        }
                        if (q11Var == q11.ON_STOP) {
                            list2.remove(kb1Var2);
                        }
                    }
                };
                kb1Var.l.j.a(w11Var);
                return new gg(1, kb1Var, w11Var);
            case 1:
                ((im1) obj).h((jm1) obj2, 0, 0, ((Number) ((p82) obj3).getValue()).floatValue() + (z ? 5.0f : 0.0f));
                return ll2Var;
            default:
                String str = (String) obj3;
                u52 u52Var = (u52) obj2;
                z02 z02Var = (z02) obj;
                if (z) {
                    w02.c(z02Var, 0);
                }
                r12 r12Var = new r12(4, u52Var);
                lv0[] lv0VarArr = w02.a;
                z02Var.a(h02.v, new p0(null, r12Var));
                w02.d(z02Var, str);
                return ll2Var;
        }
    }

    public /* synthetic */ c50(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.g = obj;
        this.f = z;
        this.h = obj2;
    }
}

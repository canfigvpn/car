package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr implements ej0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ vr(g82 g82Var, g82 g82Var2, g82 g82Var3, int i, g82 g82Var4) {
        this.g = g82Var;
        this.h = g82Var2;
        this.i = g82Var3;
        this.f = i;
        this.j = g82Var4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int iJ0;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = 0;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        int i3 = this.f;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                jm1[] jm1VarArr = (jm1[]) obj5;
                wr wrVar = (wr) obj4;
                y61 y61Var = (y61) obj3;
                int[] iArr = (int[]) obj2;
                im1 im1Var = (im1) obj;
                int length = jm1VarArr.length;
                int i4 = 0;
                while (i2 < length) {
                    jm1 jm1Var = jm1VarArr[i2];
                    int i5 = i4 + 1;
                    jm1Var.getClass();
                    Object objJ = jm1Var.j();
                    qv1 qv1Var = objJ instanceof qv1 ? (qv1) objJ : null;
                    kw0 layoutDirection = y61Var.getLayoutDirection();
                    mz mzVar = qv1Var != null ? qv1Var.c : null;
                    im1Var.h(jm1Var, mzVar != null ? mzVar.a.a(jm1Var.e, i3, layoutDirection) : wrVar.b.a(jm1Var.e, i3, layoutDirection), iArr[i4], 0.0f);
                    i2++;
                    i4 = i5;
                }
                return ll2Var;
            case 1:
                g82 g82Var = (g82) obj5;
                g82 g82Var2 = (g82) obj4;
                g82 g82Var3 = (g82) obj3;
                g82 g82Var4 = (g82) obj2;
                fx fxVarQ0 = ((x50) ((ab) obj).c()).a == 1 ? p61.q0(nb0.g(new s1(26), g82Var).a(nb0.c(g82Var2, 2)), nb0.d(g82Var3, 2).a(nb0.h(new t00(i3), g82Var))) : p61.q0(nb0.g(new t00(i3), g82Var).a(nb0.c(g82Var2, 2)), nb0.h(new s1(26), g82Var).a(nb0.d(g82Var3, 2)));
                fxVarQ0.d = new h52(new x7(6, g82Var4));
                return fxVarQ0;
            default:
                da1 da1Var = (da1) obj4;
                ak1 ak1Var = (ak1) obj2;
                jw0 jw0Var = (jw0) obj;
                da1Var.setValue(jw0Var);
                ((ak1) obj3).i((int) (jw0Var.P() >> 32));
                View view = ((ro2) obj5).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i6 = rect.top;
                int i7 = rect.bottom;
                jw0 jw0Var2 = (jw0) da1Var.getValue();
                yr1 yr1VarE = (jw0Var2 == null || !jw0Var2.A()) ? yr1.e : sv.e(jw0Var2.i(0L), ux.M(jw0Var2.P()));
                int i8 = i6 + i3;
                int i9 = i7 - i3;
                float f = yr1VarE.b;
                if (f <= i7) {
                    float f2 = yr1VarE.d;
                    if (f2 < i6) {
                        iJ0 = i9 - i8;
                    } else {
                        iJ0 = p61.j0(Math.max(f - i8, i9 - f2));
                    }
                } else {
                    iJ0 = i9 - i8;
                }
                ak1Var.i(Math.max(iJ0, 0));
                return ll2Var;
        }
    }

    public /* synthetic */ vr(ro2 ro2Var, int i, da1 da1Var, ak1 ak1Var, ak1 ak1Var2) {
        this.g = ro2Var;
        this.f = i;
        this.h = da1Var;
        this.i = ak1Var;
        this.j = ak1Var2;
    }

    public /* synthetic */ vr(jm1[] jm1VarArr, wr wrVar, int i, y61 y61Var, int[] iArr) {
        this.g = jm1VarArr;
        this.h = wrVar;
        this.f = i;
        this.i = y61Var;
        this.j = iArr;
    }
}

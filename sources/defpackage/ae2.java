package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ae2 implements PointerInputEventHandler {
    public final /* synthetic */ ez a;
    public final /* synthetic */ da1 b;
    public final /* synthetic */ f91 c;
    public final /* synthetic */ da1 d;

    public ae2(ez ezVar, da1 da1Var, f91 f91Var, da1 da1Var2) {
        this.a = ezVar;
        this.b = da1Var;
        this.c = f91Var;
        this.d = da1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ao1 ao1Var, sx sxVar) {
        zd2 zd2Var = new zd2(this.a, this.b, this.c, null);
        s9 s9Var = new s9(this.d, 9);
        d80 d80Var = bc2.a;
        Object objW = qx.w(new m7(ao1Var, zd2Var, s9Var, new pp1(ao1Var), null), sxVar);
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        if (objW != fzVar) {
            objW = ll2Var;
        }
        return objW == fzVar ? objW : ll2Var;
    }
}

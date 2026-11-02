package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oi implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh2 b;

    public /* synthetic */ oi(mh2 mh2Var, int i) {
        this.a = i;
        this.b = mh2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ao1 ao1Var, sx sxVar) {
        int i = this.a;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        sx sxVar2 = null;
        mh2 mh2Var = this.b;
        switch (i) {
            case 0:
                Object objW = qx.w(new ni(ao1Var, mh2Var, sxVar2, 0), sxVar);
                return objW == fzVar ? objW : ll2Var;
            default:
                Object objW2 = qx.w(new ni(ao1Var, mh2Var, sxVar2, 1), sxVar);
                return objW2 == fzVar ? objW2 : ll2Var;
        }
    }
}

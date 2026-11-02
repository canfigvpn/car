package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ly implements PointerInputEventHandler {
    public final /* synthetic */ id2 a;
    public final /* synthetic */ me2 b;

    public ly(id2 id2Var, me2 me2Var) {
        this.a = id2Var;
        this.b = me2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ao1 ao1Var, sx sxVar) {
        Object objW = qx.w(new ky(ao1Var, this.a, this.b, null), sxVar);
        return objW == fz.e ? objW : ll2.a;
    }
}

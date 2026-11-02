package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 implements View.OnDragListener, b70 {
    public final d70 a;
    public final ue b;
    public final q6 c;

    public r6() {
        d70 d70Var = new d70();
        d70Var.u = 0L;
        this.a = d70Var;
        this.b = new ue();
        this.c = new q6(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        ao2 ao2Var = new ao2(16, dragEvent);
        int action = dragEvent.getAction();
        ri2 ri2Var = ri2.e;
        ue ueVar = this.b;
        d70 d70Var = this.a;
        switch (action) {
            case 1:
                cs1 cs1Var = new cs1();
                c70 c70Var = new c70(ao2Var, d70Var, cs1Var);
                if (c70Var.h(d70Var) == ri2Var) {
                    p12.p(d70Var, c70Var);
                }
                boolean z = cs1Var.e;
                oe oeVar = new oe(ueVar);
                while (oeVar.hasNext()) {
                    ((d70) oeVar.next()).J0();
                }
                return z;
            case 2:
                d70Var.I0(ao2Var);
                return false;
            case 3:
                return d70Var.F0();
            case 4:
                y3 y3Var = new y3(10, ao2Var);
                if (y3Var.h(d70Var) == ri2Var) {
                    p12.p(d70Var, y3Var);
                }
                ueVar.clear();
                return false;
            case 5:
                d70Var.G0();
                return false;
            case 6:
                d70Var.H0();
                return false;
            default:
                return false;
        }
    }
}

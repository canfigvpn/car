package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fw1 implements ew1 {
    public static final ru1 i = new ru1(4, new vy(14), new xi1(5));
    public final Map e;
    public final w91 f;
    public gw1 g;
    public final tr1 h;

    public fw1(Map map) {
        this.e = map;
        long[] jArr = jx1.a;
        this.f = new w91();
        this.h = new tr1(2, this);
    }

    @Override // defpackage.ew1
    public final void b(Object obj, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(533563200);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(this) ? 256 : 128;
        }
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            ak0Var.Y(obj);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                tr1 tr1Var = this.h;
                if (!((Boolean) tr1Var.h(obj)).booleanValue()) {
                    fu1.f(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.e.get(obj);
                a90 a90Var = iw1.a;
                jw1 jw1Var = new jw1(new hw1(map, tr1Var));
                ak0Var.g0(jw1Var);
                objL = jw1Var;
            }
            jw1 jw1Var2 = (jw1) objL;
            sv.b(new vq1[]{iw1.a.a(jw1Var2), n31.a.a(jw1Var2)}, gtVar, ak0Var, (i3 & 112) | 8);
            boolean zH = ak0Var.h(this) | ak0Var.h(obj) | ak0Var.h(jw1Var2);
            Object objL2 = ak0Var.L();
            if (zH || objL2 == is1Var) {
                objL2 = new o1(this, obj, jw1Var2, 11);
                ak0Var.g0(objL2);
            }
            s5.e(ll2.a, (ej0) objL2, ak0Var);
            if (ak0Var.y && ak0Var.G.i == ak0Var.z) {
                ak0Var.z = -1;
                ak0Var.y = false;
            }
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(this, obj, gtVar, i2, 14);
        }
    }

    @Override // defpackage.ew1
    public final void c(Object obj) {
        if (this.f.k(obj) == null) {
            this.e.remove(obj);
        }
    }
}

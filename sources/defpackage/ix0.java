package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ix0 implements ba2 {
    public kw0 e = kw0.f;
    public float f;
    public float g;
    public final /* synthetic */ ox0 h;

    public ix0(ox0 ox0Var) {
        this.h = ox0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    @Override // defpackage.ba2
    public final List F(ij0 ij0Var, Object obj) {
        Object obj2;
        ox0 ox0Var = this.h;
        ox0Var.h();
        ax0 ax0Var = ox0Var.e;
        ww0 ww0Var = ax0Var.J.d;
        ww0 ww0Var2 = ww0.g;
        ww0 ww0Var3 = ww0.e;
        if (ww0Var != ww0Var3 && ww0Var != ww0Var2 && ww0Var != ww0.f && ww0Var != ww0.h) {
            vp0.b("subcompose can only be used inside the measure or layout blocks");
        }
        w91 w91Var = ox0Var.k;
        Object objG = w91Var.g(obj);
        if (objG == null) {
            objG = (ax0) ox0Var.n.k(obj);
            if (objG != null) {
                if (ox0Var.s <= 0) {
                    vp0.b("Check failed.");
                }
                ox0Var.s--;
            } else {
                objG = ox0Var.n(obj);
                if (objG == null) {
                    int i = ox0Var.h;
                    ax0 ax0Var2 = new ax0(2);
                    ax0Var.t = true;
                    ax0Var.B(i, ax0Var2);
                    ax0Var.t = false;
                    objG = ax0Var2;
                }
            }
            w91Var.m(obj, objG);
        }
        ax0 ax0Var3 = (ax0) objG;
        List listO = ax0Var.o();
        int i2 = ox0Var.h;
        if (i2 >= 0) {
            n91 n91Var = (n91) listO;
            if (i2 < ((fa1) n91Var.f).g) {
                obj2 = n91Var.get(i2);
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 != ax0Var3) {
            int i3 = ((fa1) ((n91) ax0Var.o()).f).i(ax0Var3);
            if (i3 < ox0Var.h) {
                vp0.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i4 = ox0Var.h;
            if (i4 != i3) {
                ox0Var.j(i3, i4);
            }
        }
        ox0Var.h++;
        ox0Var.m(ax0Var3, obj, false, ij0Var);
        return (ww0Var == ww0Var3 || ww0Var == ww0Var2) ? ax0Var3.m() : ax0Var3.l();
    }

    @Override // defpackage.y61
    public final x61 N(int i, int i2, Map map, ej0 ej0Var, ej0 ej0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            vp0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new hx0(i, i2, map, ej0Var, this, this.h, ej0Var2);
    }

    @Override // defpackage.m40
    public final float b() {
        return this.f;
    }

    @Override // defpackage.os0
    public final kw0 getLayoutDirection() {
        return this.e;
    }

    @Override // defpackage.m40
    public final float l() {
        return this.g;
    }

    @Override // defpackage.os0
    public final boolean r() {
        ww0 ww0Var = this.h.e.J.d;
        return ww0Var == ww0.h || ww0Var == ww0.f;
    }
}

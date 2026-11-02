package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 extends t71 implements k80 {
    public gz0 s;

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        ArrayList arrayList = this.s.h;
        if (arrayList.size() <= 0) {
            cx0Var.a();
        } else {
            k3.v(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez0) && ws0.j(this.s, ((ez0) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.s + ')';
    }

    @Override // defpackage.t71
    public final void x0() {
        this.s.getClass();
    }

    @Override // defpackage.t71
    public final void y0() {
        gz0 gz0Var = this.s;
        gz0Var.d();
        gz0Var.b = null;
    }
}

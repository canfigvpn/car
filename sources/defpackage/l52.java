package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l52 implements nv, Iterable, fv0 {
    public int f;
    public int h;
    public int i;
    public boolean k;
    public int l;
    public HashMap n;
    public d91 o;
    public int[] e = new int[0];
    public Object[] g = new Object[0];
    public final Object j = new Object();
    public ArrayList m = new ArrayList();

    public final int a(vj0 vj0Var) {
        if (this.k) {
            hv.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!vj0Var.a()) {
            cp1.a("Anchor refers to a group that was removed");
        }
        return vj0Var.a;
    }

    public final void b() {
        this.n = new HashMap();
    }

    public final k52 c() {
        if (this.k) {
            fu1.h("Cannot read while a writer is pending");
            return null;
        }
        this.i++;
        return new k52(this);
    }

    public final o52 d() {
        if (this.k) {
            hv.a("Cannot start a writer when another writer is pending");
        }
        if (this.i > 0) {
            hv.a("Cannot start a writer when a reader is pending");
        }
        this.k = true;
        this.l++;
        return new o52(this);
    }

    public final boolean e(vj0 vj0Var) {
        int iC;
        return vj0Var.a() && (iC = n52.c(this.m, vj0Var.a, this.f)) >= 0 && ws0.j(this.m.get(iC), vj0Var);
    }

    public final ck0 f(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.n;
        if (map != null) {
            if (this.k) {
                hv.a("use active SlotWriter to crate an anchor for location instead");
            }
            vj0 vj0Var = (i < 0 || i >= (i2 = this.f) || (iC = n52.c((arrayList = this.m), i, i2)) < 0) ? null : (vj0) arrayList.get(iC);
            if (vj0Var != null) {
                return (ck0) map.get(vj0Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new pl0(this, 0, this.f);
    }
}

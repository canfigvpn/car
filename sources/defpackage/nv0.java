package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 {
    public final nv0 a;

    public nv0(nv0 nv0Var) {
        nv0Var.getClass();
        this.a = nv0Var;
    }

    public final List a() {
        return this.a.a();
    }

    public final aq b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof nv0;
        nv0 nv0Var = z ? (nv0) obj : null;
        nv0 nv0Var2 = nv0Var != null ? nv0Var.a : null;
        nv0 nv0Var3 = this.a;
        if (!ws0.j(nv0Var3, nv0Var2)) {
            return false;
        }
        aq aqVarB = nv0Var3.b();
        if (aqVarB instanceof aq) {
            nv0 nv0Var4 = z ? (nv0) obj : null;
            aq aqVarB2 = nv0Var4 != null ? nv0Var4.a.b() : null;
            if (aqVarB2 != null && (aqVarB2 instanceof aq)) {
                return vv.q(aqVarB).equals(vv.q(aqVarB2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}

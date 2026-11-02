package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 implements nv, Iterable, fv0 {
    public final l52 e;
    public final int f;
    public final os1 g;

    public q72(l52 l52Var, int i, ck0 ck0Var, os1 os1Var) {
        this.e = l52Var;
        this.f = i;
        this.g = os1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q72)) {
            return false;
        }
        q72 q72Var = (q72) obj;
        return q72Var.f == this.f && q72Var.e == this.e && q72Var.g.equals(this.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.e.hashCode() + (this.f * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mu1(this.e, this.f, null, this.g);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l82 implements nm2 {
    public final nm2 e;
    public final long f;

    public l82(nm2 nm2Var, long j) {
        this.e = nm2Var;
        this.f = j;
    }

    @Override // defpackage.nm2
    public final boolean a() {
        return this.e.a();
    }

    @Override // defpackage.nm2
    public final long b(tb tbVar, tb tbVar2, tb tbVar3) {
        return this.e.b(tbVar, tbVar2, tbVar3) + this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l82)) {
            return false;
        }
        l82 l82Var = (l82) obj;
        return l82Var.f == this.f && ws0.j(l82Var.e, this.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    @Override // defpackage.nm2
    public final tb l(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        long j2 = this.f;
        return j < j2 ? tbVar3 : this.e.l(j - j2, tbVar, tbVar2, tbVar3);
    }

    @Override // defpackage.nm2
    public final tb p(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        long j2 = this.f;
        return j < j2 ? tbVar : this.e.p(j - j2, tbVar, tbVar2, tbVar3);
    }
}

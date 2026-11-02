package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o82 implements r42 {
    public final long e;
    public final long f;

    public o82(long j, long j2) {
        this.e = j;
        this.f = j2;
        if (j < 0) {
            fu1.j("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        fu1.j("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    @Override // defpackage.r42
    public final pe0 c(ea2 ea2Var) {
        return j20.l(new ze0(0, cf0.a(ea2Var, new n82(this, null)), new pr1(2, null, 1)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o82)) {
            return false;
        }
        o82 o82Var = (o82) obj;
        return this.e == o82Var.e && this.f == o82Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + (Long.hashCode(this.e) * 31);
    }

    public final String toString() {
        z21 z21Var = new z21(2);
        long j = this.e;
        if (j > 0) {
            z21Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.f;
        if (j2 < Long.MAX_VALUE) {
            z21Var.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + vq.V(vs0.i(z21Var), null, null, null, null, 63) + ')';
    }
}

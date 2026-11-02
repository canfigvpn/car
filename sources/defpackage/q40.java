package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 implements m40 {
    public final float e;
    public final float f;
    public final eh0 g;

    public q40(float f, float f2, eh0 eh0Var) {
        this.e = f;
        this.f = f2;
        this.g = eh0Var;
    }

    @Override // defpackage.m40
    public final float H(long j) {
        if (zf2.a(yf2.b(j), 4294967296L)) {
            return this.g.b(yf2.c(j));
        }
        fu1.h("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return Float.compare(this.e, q40Var.e) == 0 && Float.compare(this.f, q40Var.f) == 0 && this.g.equals(q40Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + k3.a(this.f, Float.hashCode(this.e) * 31, 31);
    }

    @Override // defpackage.m40
    public final float l() {
        return this.f;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.e + ", fontScale=" + this.f + ", converter=" + this.g + ')';
    }

    @Override // defpackage.m40
    public final long v(float f) {
        return r02.o(this.g.a(f), 4294967296L);
    }
}

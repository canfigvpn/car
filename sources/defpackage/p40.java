package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p40 implements m40 {
    public final float e;
    public final float f;

    public p40(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return Float.compare(this.e, p40Var.e) == 0 && Float.compare(this.f, p40Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + (Float.hashCode(this.e) * 31);
    }

    @Override // defpackage.m40
    public final float l() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.e);
        sb.append(", fontScale=");
        return k3.k(sb, this.f, ')');
    }
}

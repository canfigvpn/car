package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class po2 implements h71 {
    public final si a;

    public po2(si siVar) {
        this.a = siVar;
    }

    @Override // defpackage.h71
    public final int a(mr0 mr0Var, long j, int i, kw0 kw0Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (kw0Var == kw0.e ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return ex.h(this.a.a(i, i2, kw0Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po2) && this.a.equals(((po2) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}

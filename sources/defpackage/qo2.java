package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qo2 implements i71 {
    public final vi a;
    public final int b;

    public qo2(vi viVar, int i) {
        this.a = viVar;
        this.b = i;
    }

    @Override // defpackage.i71
    public final int a(mr0 mr0Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : ex.h(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo2)) {
            return false;
        }
        qo2 qo2Var = (qo2) obj;
        return this.a.equals(qo2Var.a) && this.b == qo2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return k3.l(sb, this.b, ')');
    }
}

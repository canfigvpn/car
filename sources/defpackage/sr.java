package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sr implements ve2 {
    public final long a;

    public sr(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        wp0.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.ve2
    public final float a() {
        return dr.c(this.a);
    }

    @Override // defpackage.ve2
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ve2
    public final rk c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        long j = ((sr) obj).a;
        int i = dr.h;
        return vk2.a(this.a, j);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) dr.h(this.a)) + ')';
    }
}

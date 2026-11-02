package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q21 implements eh0 {
    public final float a;

    public q21(float f) {
        this.a = f;
    }

    @Override // defpackage.eh0
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.eh0
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q21) && Float.compare(this.a, ((q21) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return k3.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}

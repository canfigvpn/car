package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pb extends tb {
    public float a;

    public pb(float f) {
        this.a = f;
    }

    @Override // defpackage.tb
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.tb
    public final int b() {
        return 1;
    }

    @Override // defpackage.tb
    public final tb c() {
        return new pb(0.0f);
    }

    @Override // defpackage.tb
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.tb
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pb) && ((pb) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}

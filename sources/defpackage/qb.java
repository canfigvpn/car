package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qb extends tb {
    public float a;
    public float b;

    public qb(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.tb
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.tb
    public final int b() {
        return 2;
    }

    @Override // defpackage.tb
    public final tb c() {
        return new qb(0.0f, 0.0f);
    }

    @Override // defpackage.tb
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.tb
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return qbVar.a == this.a && qbVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}

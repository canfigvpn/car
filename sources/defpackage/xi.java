package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xi extends nj1 {
    public final g7 e;
    public final long f;
    public final int g;
    public final long h;
    public float i;
    public yi j;

    public xi(g7 g7Var) {
        int i;
        long width = (((long) g7Var.a.getWidth()) << 32) | (((long) g7Var.a.getHeight()) & 4294967295L);
        this.e = g7Var;
        this.f = width;
        this.g = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > g7Var.a.getWidth() || i > g7Var.a.getHeight()) {
            qj.r("Failed requirement.");
            throw null;
        }
        this.h = width;
        this.i = 1.0f;
    }

    @Override // defpackage.nj1
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.nj1
    public final void b(yi yiVar) {
        this.j = yiVar;
    }

    @Override // defpackage.nj1
    public final long d() {
        return ux.M(this.h);
    }

    @Override // defpackage.nj1
    public final void e(l80 l80Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (l80Var.d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (l80Var.d() & 4294967295L)));
        float f = this.i;
        yi yiVar = this.j;
        int i = this.g;
        l80.Q(l80Var, this.e, this.f, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, yiVar, i, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return ws0.j(this.e, xiVar.e) && ir0.a(0L, 0L) && qr0.a(this.f, xiVar.f) && this.g == xiVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + k3.c(k3.c(this.e.hashCode() * 31, 31, 0L), 31, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append((Object) ir0.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) qr0.b(this.f));
        sb.append(", filterQuality=");
        int i = this.g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}

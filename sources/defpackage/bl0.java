package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class bl0 extends y71 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final u32 g;
    public final boolean h;
    public final long i;
    public final long j;

    public bl0(float f, float f2, float f3, float f4, float f5, long j, u32 u32Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = j;
        this.g = u32Var;
        this.h = z;
        this.i = j2;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl0)) {
            return false;
        }
        bl0 bl0Var = (bl0) obj;
        if (Float.compare(this.a, bl0Var.a) != 0 || Float.compare(this.b, bl0Var.b) != 0 || Float.compare(this.c, bl0Var.c) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.d, bl0Var.d) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.e, bl0Var.e) != 0 || Float.compare(8.0f, 8.0f) != 0 || !ai2.a(this.f, bl0Var.f) || !ws0.j(this.g, bl0Var.g) || this.h != bl0Var.h) {
            return false;
        }
        long j = bl0Var.i;
        int i = dr.h;
        return vk2.a(this.i, j) && vk2.a(this.j, bl0Var.j);
    }

    @Override // defpackage.y71
    public final t71 f() {
        x42 x42Var = new x42();
        x42Var.s = this.a;
        x42Var.t = this.b;
        x42Var.u = this.c;
        x42Var.v = this.d;
        x42Var.w = this.e;
        x42Var.x = 8.0f;
        x42Var.y = this.f;
        x42Var.z = this.g;
        x42Var.A = this.h;
        x42Var.B = this.i;
        x42Var.C = this.j;
        x42Var.D = 3;
        x42Var.E = new y3(21, x42Var);
        return x42Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        me1 me1Var;
        x42 x42Var = (x42) t71Var;
        x42Var.s = this.a;
        x42Var.t = this.b;
        x42Var.u = this.c;
        x42Var.v = this.d;
        x42Var.w = this.e;
        x42Var.x = 8.0f;
        x42Var.y = this.f;
        x42Var.z = this.g;
        x42Var.A = this.h;
        x42Var.B = this.i;
        x42Var.C = this.j;
        x42Var.D = 3;
        y3 y3Var = x42Var.E;
        if (x42Var.e.r && (me1Var = qx.T(x42Var, 2).t) != null) {
            me1Var.r1(y3Var, true);
        }
    }

    public final int hashCode() {
        int iA = k3.a(8.0f, k3.a(this.e, k3.a(0.0f, k3.a(0.0f, k3.a(this.d, k3.a(0.0f, k3.a(0.0f, k3.a(this.c, k3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = ai2.c;
        int iF = k3.f((this.g.hashCode() + k3.c(iA, 31, this.f)) * 31, 961, this.h);
        int i2 = dr.h;
        return k3.b(3, k3.b(0, k3.c(k3.c(iF, 31, this.i), 31, this.j), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.e);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) ai2.b(this.f));
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", clip=");
        sb.append(this.h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        k3.r(this.i, sb, ", spotShadowColor=");
        sb.append((Object) dr.h(this.j));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) vs0.E(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}

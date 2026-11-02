package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x42 extends t71 implements sw0, m02 {
    public boolean A;
    public long B;
    public long C;
    public int D;
    public y3 E;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public u32 z;

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        jm1 jm1VarE = r61Var.e(j);
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new i8(7, jm1VarE, this));
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        if (this.A) {
            w02.f(z02Var, this.z);
        }
    }

    @Override // defpackage.m02
    public final boolean i() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.s);
        sb.append(", scaleY=");
        sb.append(this.t);
        sb.append(", alpha = ");
        sb.append(this.u);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.v);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.w);
        sb.append(", cameraDistance=");
        sb.append(this.x);
        sb.append(", transformOrigin=");
        sb.append((Object) ai2.b(this.y));
        sb.append(", shape=");
        sb.append(this.z);
        sb.append(", clip=");
        sb.append(this.A);
        sb.append(", renderEffect=null, ambientShadowColor=");
        k3.r(this.B, sb, ", spotShadowColor=");
        k3.r(this.C, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) vs0.E(this.D));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}

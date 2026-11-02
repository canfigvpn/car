package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zx1 implements oy1 {
    public static final ru1 j = new ru1(4, new xw1(22, 0), new yw1(13));
    public final ak1 a;
    public float f;
    public final v40 h;
    public final v40 i;
    public final ak1 b = new ak1(0);
    public final ak1 c = new ak1(0);
    public final f91 d = new f91();
    public final ak1 e = new ak1(Integer.MAX_VALUE);
    public final l30 g = new l30(new tr1(3, this));

    public zx1(int i) {
        this.a = new ak1(i);
        final int i2 = 0;
        this.h = e72.b(new ti0(this) { // from class: yx1
            public final /* synthetic */ zx1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i3 = i2;
                zx1 zx1Var = this.f;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(zx1Var.a.h() < zx1Var.e.h());
                    default:
                        return Boolean.valueOf(zx1Var.a.h() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = e72.b(new ti0(this) { // from class: yx1
            public final /* synthetic */ zx1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i4 = i3;
                zx1 zx1Var = this.f;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(zx1Var.a.h() < zx1Var.e.h());
                    default:
                        return Boolean.valueOf(zx1Var.a.h() > 0);
                }
            }
        });
    }

    @Override // defpackage.oy1
    public final boolean a() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.oy1
    public final boolean b() {
        return this.g.b();
    }

    @Override // defpackage.oy1
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.oy1
    public final Object d(ia1 ia1Var, ij0 ij0Var, tx txVar) {
        Object objD = this.g.d(ia1Var, ij0Var, txVar);
        return objD == fz.e ? objD : ll2.a;
    }

    @Override // defpackage.oy1
    public final float e(float f) {
        return this.g.e(f);
    }
}

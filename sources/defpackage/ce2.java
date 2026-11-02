package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ce2 implements oy1 {
    public final /* synthetic */ oy1 a;
    public final v40 b;
    public final v40 c;

    public ce2(oy1 oy1Var, final de2 de2Var) {
        this.a = oy1Var;
        final int i = 0;
        this.b = e72.b(new ti0() { // from class: be2
            @Override // defpackage.ti0
            public final Object a() {
                int i2 = i;
                de2 de2Var2 = de2Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(de2Var2.a.h() < de2Var2.b.h());
                    default:
                        return Boolean.valueOf(de2Var2.a.h() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = e72.b(new ti0() { // from class: be2
            @Override // defpackage.ti0
            public final Object a() {
                int i3 = i2;
                de2 de2Var2 = de2Var;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(de2Var2.a.h() < de2Var2.b.h());
                    default:
                        return Boolean.valueOf(de2Var2.a.h() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.oy1
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.oy1
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.oy1
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.oy1
    public final Object d(ia1 ia1Var, ij0 ij0Var, tx txVar) {
        return this.a.d(ia1Var, ij0Var, txVar);
    }

    @Override // defpackage.oy1
    public final float e(float f) {
        return this.a.e(f);
    }
}

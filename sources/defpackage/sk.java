package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sk extends rk {
    public qk1 a;
    public long b = 9205357640488583168L;
    public final /* synthetic */ Shader c;

    public sk(Shader shader) {
        this.c = shader;
    }

    @Override // defpackage.rk
    public final void a(float f, long j, v7 v7Var) {
        Paint paint = (Paint) v7Var.b;
        qk1 qk1Var = this.a;
        if (qk1Var == null || !d52.a(this.b, j)) {
            if (d52.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                qk1Var = null;
            } else {
                qk1Var = this.a;
                if (qk1Var == null) {
                    qk1Var = new qk1(18, false);
                    this.a = qk1Var;
                }
                qk1Var.f = this.c;
                this.a = qk1Var;
                this.b = j;
            }
        }
        long jC = ws0.c(paint.getColor());
        long j2 = dr.b;
        if (!vk2.a(jC, j2)) {
            v7Var.e(j2);
        }
        if (!ws0.j((Shader) v7Var.c, qk1Var != null ? (Shader) qk1Var.f : null)) {
            v7Var.h(qk1Var != null ? (Shader) qk1Var.f : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        v7Var.c(f);
    }
}

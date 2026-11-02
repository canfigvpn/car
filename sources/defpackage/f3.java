package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements qy {
    public final qy a;
    public final float b;

    public f3(float f, qy qyVar) {
        while (qyVar instanceof f3) {
            qyVar = ((f3) qyVar).a;
            f += ((f3) qyVar).b;
        }
        this.a = qyVar;
        this.b = f;
    }

    @Override // defpackage.qy
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return this.a.equals(f3Var.a) && this.b == f3Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}

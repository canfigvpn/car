package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o72 extends rk {
    public final long a;

    public o72(long j) {
        this.a = j;
    }

    @Override // defpackage.rk
    public final void a(float f, long j, v7 v7Var) {
        v7Var.c(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = dr.b(dr.c(jB) * f, jB);
        }
        v7Var.e(jB);
        if (((Shader) v7Var.c) != null) {
            v7Var.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o72)) {
            return false;
        }
        long j = ((o72) obj).a;
        int i = dr.h;
        return vk2.a(this.a, j);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) dr.h(this.a)) + ')';
    }
}

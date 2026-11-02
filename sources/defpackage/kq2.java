package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kq2 {
    public final rj a;
    public final float b;

    public kq2(Rect rect, float f) {
        this.a = new rj(rect);
        this.b = f;
    }

    public final Rect a() {
        rj rjVar = this.a;
        rjVar.getClass();
        return new Rect(rjVar.a, rjVar.b, rjVar.c, rjVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kq2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        kq2 kq2Var = (kq2) obj;
        return ws0.j(this.a, kq2Var.a) && this.b == kq2Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return k3.k(sb, this.b, ')');
    }

    public kq2(rj rjVar, float f) {
        this.a = rjVar;
        this.b = f;
    }
}

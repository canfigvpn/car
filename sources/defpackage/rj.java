package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new rj(0, 0, 0, 0);
    }

    public rj(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            qj.f(k3.h(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        qj.f(k3.h(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rj rjVar = (rj) obj;
        return this.a == rjVar.a && this.b == rjVar.b && this.c == rjVar.c && this.d == rjVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return rj.class.getSimpleName() + " { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rj(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}

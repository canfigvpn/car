package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w50 {
    public final DisplayCutout a;

    public w50(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final kq0 a() {
        return Build.VERSION.SDK_INT >= 30 ? kq0.c(g1.c(this.a)) : kq0.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w50.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((w50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

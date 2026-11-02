package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yi {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public yi(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            i4.g();
            porterDuffColorFilter = i4.d(ws0.V(j), s5.U(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ws0.V(j), s5.V(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        long j = yiVar.b;
        int i = dr.h;
        return vk2.a(this.b, j) && this.c == yiVar.c;
    }

    public final int hashCode() {
        int i = dr.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        k3.r(this.b, sb, ", blendMode=");
        sb.append((Object) vs0.E(this.c));
        sb.append(')');
        return sb.toString();
    }
}

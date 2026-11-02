package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r31 {
    public final s31 a;

    static {
        new LocaleList(new Locale[0]);
    }

    public r31(s31 s31Var) {
        this.a = s31Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r31) {
            return this.a.equals(((r31) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}

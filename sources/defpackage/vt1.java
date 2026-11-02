package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vt1 implements Serializable {
    public final Object e;

    public /* synthetic */ vt1(Object obj) {
        this.e = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof ut1) {
            return ((ut1) obj).e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vt1) {
            return ws0.j(this.e, ((vt1) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.e;
        if (obj instanceof ut1) {
            return ((ut1) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}

package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ut1 implements Serializable {
    public final Throwable e;

    public ut1(Throwable th) {
        th.getClass();
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ut1) {
            return ws0.j(this.e, ((ut1) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.e + ')';
    }
}

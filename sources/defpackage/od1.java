package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class od1 extends rw {
    public final hd1 e;

    public od1(hd1 hd1Var) {
        hd1Var.getClass();
        this.e = hd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && od1.class == obj.getClass() && ws0.j(this.e, ((od1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.e + ", direction=-1)";
    }
}

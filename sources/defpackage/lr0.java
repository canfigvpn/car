package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 extends jr0 {
    public static final lr0 h = new lr0(1, 0, 1);

    public final boolean a(int i) {
        return this.e <= i && i <= this.f;
    }

    @Override // defpackage.jr0
    public final boolean equals(Object obj) {
        if (!(obj instanceof lr0)) {
            return false;
        }
        if (isEmpty() && ((lr0) obj).isEmpty()) {
            return true;
        }
        lr0 lr0Var = (lr0) obj;
        return this.e == lr0Var.e && this.f == lr0Var.f;
    }

    @Override // defpackage.jr0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.f;
    }

    @Override // defpackage.jr0
    public final boolean isEmpty() {
        return this.e > this.f;
    }

    @Override // defpackage.jr0
    public final String toString() {
        return this.e + ".." + this.f;
    }
}

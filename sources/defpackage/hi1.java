package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hi1 extends mx {
    public final yr1 i;

    public hi1(yr1 yr1Var) {
        this.i = yr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hi1) {
            return this.i.equals(((hi1) obj).i);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // defpackage.mx
    public final yr1 w() {
        return this.i;
    }
}

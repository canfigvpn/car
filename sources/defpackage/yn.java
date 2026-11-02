package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yn {
    public final List a;
    public final wm b;

    public yn(List list, wm wmVar) {
        list.getClass();
        this.a = list;
        this.b = wmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return ws0.j(this.a, ynVar.a) && ws0.j(this.b, ynVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wm wmVar = this.b;
        return iHashCode + (wmVar == null ? 0 : wmVar.hashCode());
    }

    public final String toString() {
        return "CarSwitcherUiState(cars=" + this.a + ", current=" + this.b + ")";
    }
}

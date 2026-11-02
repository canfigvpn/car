package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nh {
    public final boolean a;
    public final dh b;
    public final dh c;

    public nh(boolean z, dh dhVar, dh dhVar2) {
        this.a = z;
        this.b = dhVar;
        this.c = dhVar2;
    }

    public static nh a(nh nhVar, boolean z, dh dhVar, dh dhVar2, int i) {
        if ((i & 1) != 0) {
            z = nhVar.a;
        }
        if ((i & 2) != 0) {
            dhVar = nhVar.b;
        }
        if ((i & 4) != 0) {
            dhVar2 = nhVar.c;
        }
        nhVar.getClass();
        return new nh(z, dhVar, dhVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj;
        return this.a == nhVar.a && ws0.j(this.b, nhVar.b) && ws0.j(this.c, nhVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        dh dhVar = this.b;
        int iHashCode2 = (iHashCode + (dhVar == null ? 0 : dhVar.hashCode())) * 31;
        dh dhVar2 = this.c;
        return iHashCode2 + (dhVar2 != null ? dhVar2.hashCode() : 0);
    }

    public final String toString() {
        return "BackupUiState(busy=" + this.a + ", exportResult=" + this.b + ", importResult=" + this.c + ")";
    }
}

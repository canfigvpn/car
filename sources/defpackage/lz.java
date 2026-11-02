package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lz {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(kz kzVar);

    public final boolean equals(Object obj) {
        if (obj instanceof lz) {
            return this.a.equals(((lz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}

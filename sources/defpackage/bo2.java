package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bo2 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapH0 = h61.h0(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapH0.values().iterator();
        while (it.hasNext()) {
            ((un2) it.next()).b();
        }
    }

    public final String toString() {
        String strC = js1.a(bo2.class).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        int iHashCode = hashCode();
        j20.j(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strC + "@" + string + "(keys=" + vq.k0(this.a.keySet()) + ")";
    }
}

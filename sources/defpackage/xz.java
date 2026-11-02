package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xz implements x30, im0, kk0, n51 {
    public final zz a;
    public final yz b;

    public xz(zz zzVar, yz yzVar) {
        this.a = zzVar;
        this.b = yzVar;
    }

    public final sx0 a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(14);
        int i = ws0.P;
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("ph", bool);
        int i2 = vs0.F;
        linkedHashMap.put("mn", bool);
        int i3 = p61.n0;
        linkedHashMap.put("ao", bool);
        linkedHashMap.put("qi0", bool);
        linkedHashMap.put("rm0", bool);
        linkedHashMap.put("ln0", bool);
        linkedHashMap.put("ls0", bool);
        linkedHashMap.put("f41", bool);
        linkedHashMap.put("q51", bool);
        linkedHashMap.put("o32", bool);
        return new sx0(linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap));
    }
}

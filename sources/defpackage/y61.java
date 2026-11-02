package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface y61 extends os0 {
    x61 N(int i, int i2, Map map, ej0 ej0Var, ej0 ej0Var2);

    default x61 d0(int i, int i2, Map map, ej0 ej0Var) {
        return N(i, i2, map, null, ej0Var);
    }
}

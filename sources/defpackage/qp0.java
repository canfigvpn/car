package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qp0 {
    public final LinkedHashMap a;

    public qp0(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(aq aqVar, ej0 ej0Var) {
        ej0Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(aqVar)) {
            qj.f(k3.j("A `initializer` with the same `clazz` has already been added: ", aqVar.b(), "."));
        } else {
            linkedHashMap.put(aqVar, new wn2(aqVar, ej0Var));
        }
    }

    public t2 b() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        wn2[] wn2VarArr = (wn2[]) collectionValues.toArray(new wn2[0]);
        return new t2(2, (wn2[]) Arrays.copyOf(wn2VarArr, wn2VarArr.length));
    }
}

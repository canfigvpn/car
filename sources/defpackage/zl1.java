package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zl1 extends m0 {
    public final /* synthetic */ int e;
    public final tl1 f;

    public /* synthetic */ zl1(tl1 tl1Var, int i) {
        this.e = i;
        this.f = tl1Var;
    }

    @Override // defpackage.n
    public final int a() {
        int i = this.e;
        tl1 tl1Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return tl1Var.f;
    }

    @Override // defpackage.n, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.e;
        tl1 tl1Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = tl1Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && tl1Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return tl1Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        tl1 tl1Var = this.f;
        switch (i) {
            case 0:
                wi2 wi2Var = tl1Var.e;
                xi2[] xi2VarArr = new xi2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    xi2VarArr[i2] = new yi2(0);
                }
                return new am1(wi2Var, xi2VarArr);
            default:
                wi2 wi2Var2 = tl1Var.e;
                xi2[] xi2VarArr2 = new xi2[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    xi2VarArr2[i3] = new yi2(1);
                }
                return new am1(wi2Var2, xi2VarArr2);
        }
    }
}

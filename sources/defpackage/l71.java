package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l71 {
    public final SparseArray a;
    public zj2 b;

    public l71(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(zj2 zj2Var, int i, int i2) {
        int iA = zj2Var.a(i);
        SparseArray sparseArray = this.a;
        l71 l71Var = (l71) sparseArray.get(iA);
        if (l71Var == null) {
            l71Var = new l71(1);
            sparseArray.put(zj2Var.a(i), l71Var);
        }
        if (i2 > i) {
            l71Var.a(zj2Var, i + 1, i2);
        } else {
            l71Var.b = zj2Var;
        }
    }
}

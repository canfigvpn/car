package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface w61 {
    default int b(os0 os0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new a30((r61) list.get(i3), ps0.f, ts0.f, i2));
        }
        return g(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(i, 0, 13)).c();
    }

    default int c(os0 os0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new a30((r61) list.get(i3), ps0.f, ts0.e, i2));
        }
        return g(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(0, i, 7)).e();
    }

    x61 g(y61 y61Var, List list, long j);

    default int h(os0 os0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new a30((r61) list.get(i3), ps0.e, ts0.f, i2));
        }
        return g(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(i, 0, 13)).c();
    }

    default int j(os0 os0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new a30((r61) list.get(i3), ps0.e, ts0.e, i2));
        }
        return g(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(0, i, 7)).e();
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 implements w61 {
    public final jz1 a;

    public q81(jz1 jz1Var) {
        this.a = jz1Var;
    }

    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
        ArrayList arrayListZ = ix.z(os0Var);
        jz1 jz1Var = this.a;
        jz1Var.getClass();
        ArrayList arrayList = new ArrayList(arrayListZ.size());
        int size = arrayListZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayListZ.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new a30((r61) list2.get(i3), ps0.f, ts0.f, 0));
            }
            arrayList.add(arrayList2);
        }
        return jz1Var.a(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(i, 0, 13)).c();
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
        ArrayList arrayListZ = ix.z(os0Var);
        jz1 jz1Var = this.a;
        jz1Var.getClass();
        ArrayList arrayList = new ArrayList(arrayListZ.size());
        int size = arrayListZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayListZ.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new a30((r61) list2.get(i3), ps0.f, ts0.e, 0));
            }
            arrayList.add(arrayList2);
        }
        return jz1Var.a(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(0, i, 7)).e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q81) && ws0.j(this.a, ((q81) obj).a);
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        return this.a.a(y61Var, ix.z(y61Var), j);
    }

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
        ArrayList arrayListZ = ix.z(os0Var);
        jz1 jz1Var = this.a;
        jz1Var.getClass();
        ArrayList arrayList = new ArrayList(arrayListZ.size());
        int size = arrayListZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayListZ.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new a30((r61) list2.get(i3), ps0.e, ts0.f, 0));
            }
            arrayList.add(arrayList2);
        }
        return jz1Var.a(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(i, 0, 13)).c();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.w61
    public final int j(os0 os0Var, List list, int i) {
        ArrayList arrayListZ = ix.z(os0Var);
        jz1 jz1Var = this.a;
        jz1Var.getClass();
        ArrayList arrayList = new ArrayList(arrayListZ.size());
        int size = arrayListZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayListZ.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new a30((r61) list2.get(i3), ps0.e, ts0.e, 0));
            }
            arrayList.add(arrayList2);
        }
        return jz1Var.a(new ct0(os0Var, os0Var.getLayoutDirection()), arrayList, tw.b(0, i, 7)).e();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}

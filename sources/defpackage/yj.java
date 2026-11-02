package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj implements ej0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ y61 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ yj(jm1 jm1Var, r61 r61Var, y61 y61Var, int i, int i2, ak akVar) {
        this.i = jm1Var;
        this.j = r61Var;
        this.f = y61Var;
        this.g = i;
        this.h = i2;
        this.k = akVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        y61 y61Var = this.f;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                xj.d((im1) obj, (jm1) obj4, (r61) obj3, y61Var.getLayoutDirection(), this.g, this.h, ((ak) obj2).a);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                jz1 jz1Var = (jz1) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                im1 im1Var = (im1) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    int i3 = this.h;
                    if (i2 >= size) {
                        int iO = y61Var.O(8.0f) + y61Var.O(kz1.c);
                        ia iaVar = jz1Var.c;
                        int iIntValue = iO + (iaVar != null ? ((Number) iaVar.d()).intValue() : this.g);
                        int size2 = arrayList2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            jm1 jm1Var = (jm1) arrayList2.get(i4);
                            im1Var.h(jm1Var, iIntValue, (i3 - jm1Var.f) / 2, 0.0f);
                        }
                    } else {
                        jm1 jm1Var2 = (jm1) arrayList.get(i2);
                        im1Var.h(jm1Var2, 0, (i3 - jm1Var2.f) / 2, 0.0f);
                        i2++;
                    }
                    break;
                }
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ yj(ArrayList arrayList, y61 y61Var, jz1 jz1Var, int i, ArrayList arrayList2, int i2) {
        this.i = arrayList;
        this.f = y61Var;
        this.j = jz1Var;
        this.g = i;
        this.k = arrayList2;
        this.h = i2;
    }
}

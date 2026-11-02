package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(int i, ArrayList arrayList) {
        super(1);
        this.f = i;
        this.g = arrayList;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        ArrayList arrayList = this.g;
        switch (i) {
            case 0:
                im1 im1Var = (im1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    im1.k(im1Var, (jm1) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                im1 im1Var2 = (im1) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        im1.k(im1Var2, (jm1) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                im1 im1Var3 = (im1) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    im1Var3.h((jm1) arrayList.get(i4), 0, 0, 0.0f);
                }
                break;
            default:
                im1 im1Var4 = (im1) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    im1.m(im1Var4, (jm1) arrayList.get(i5), 0, 0);
                }
                break;
        }
        return ll2Var;
    }
}
